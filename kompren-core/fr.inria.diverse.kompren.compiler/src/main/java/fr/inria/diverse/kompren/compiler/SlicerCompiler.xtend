package fr.inria.diverse.kompren.compiler

import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import java.util.Collections
import java.util.HashSet
import java.util.List
import java.util.Set
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer
import kompren.impl.KomprenFactoryImpl
import kompren.impl.KomprenPackageImpl
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.diverse.kompren.compiler.EClassAspect.*
import static extension fr.inria.diverse.kompren.compiler.EPackageAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicerAspect.*

class SlicerCompiler {
	val String slicerName
	val String pkgName
	val Slicer slicer
	val List<EPackage> metamodel
	val SlicerAspectGenerator aspectGenerator
	val SlicerMainGenerator mainGenerator
	val String targetDir
	val List<EClass> metamodelClasses = new ArrayList
	val List<GenModel> genModels = new ArrayList
	val StringBuilder imports = new StringBuilder
	
	def static void main(String[] args) {
		var slicerCompiler = new SlicerCompiler("strictEcore.kompren", "", "/media/data/dev/kompren/kompren-examples/")
		slicerCompiler.compile
//		var slicerCompiler = new SlicerCompiler("k3transfoFootprint.kompren", "", "/media/data/dev/kompren/kompren-examples/")
//		slicerCompiler.compile
//		slicerCompiler = new SlicerCompiler("sm.kompren", "", "/media/data/dev/kompren/kompren-examples/")
//		slicerCompiler.compile
//		slicerCompiler = new SlicerCompiler("classInverted.kompren", "", "/media/data/dev/kompren/kompren-examples/")
//		slicerCompiler.compile
//		slicerCompiler = new SlicerCompiler("clazz.kompren", "", "/media/data/dev/kompren/kompren-examples/")
//		slicerCompiler.compile
	}
	
	new(String slicerURI, String uri, String targetDir) {
		val rs = new ResourceSetImpl
		KomprenPackageImpl.eINSTANCE.eClass
		EcoreFactoryImpl.eINSTANCE.eClass
		slicer = getSlicerModel(slicerURI, rs)
		
		if(slicer.uriMetamodel.exists[!endsWith(".genmodel")]) 
			throw new IllegalArgumentException("URI metamodel must refers to a genmodel.")
		
		GenModelPackage.eINSTANCE.eClass
		val set = new ResourceSetImpl
		val ecoreFactory = new EcoreResourceFactoryImpl
		val map = set.getResourceFactoryRegistry.getExtensionToFactoryMap
        map.put("ecore", ecoreFactory)
		map.put("genmodel", ecoreFactory)
		slicer.uriMetamodel.forEach[uriMM |
			val res = set.getResource(URI.createURI(uriMM), true)
			res.load(null)
			genModels.addAll(res.contents.filter(GenModel))
		]

		produceImports
		metamodel = getEcoreModel(slicer)
		getAllClasses(metamodel)
		pkgName = slicer.name.split("\\.").last
		slicerName = Character.toUpperCase(pkgName.charAt(0)).toString+pkgName.substring(1)
		aspectGenerator = new SlicerAspectGenerator(metamodel, slicerName, slicer, pkgName, metamodelClasses, imports)
		mainGenerator = new SlicerMainGenerator(metamodel, slicerName, slicer, pkgName, imports)
		this.targetDir = targetDir
	}
	
	
	/** Produces the imports from the packages of the genmodel. */
	private def void produceImports() {
		genModels.forEach[gen |
			_produceImports(gen.genPackages)
			_produceImports(gen.usedGenPackages)
		]
	}
	
	private def void _produceImports(Iterable<GenPackage> pkgs) {
		pkgs.filter[getEcorePackage!=null].forEach[pkg |
			imports.append("import ")
			val base = pkg.basePackage
			val suffix = pkg.classPackageSuffix
			val str = if(base!=null && base.length>0) base + '.' else ""
			
			imports.append(str).append(pkg.packageName).append(".*\n")

			if(suffix!=null && suffix.length>0)
				imports.append("import ").append(str).append(pkg.packageName).append('.').append(suffix).append(".*\n")

			_produceImports(pkg.nestedGenPackages)
		]
	}


	private def void getAllClasses(List<EPackage> pkgs) {
		metamodelClasses.addAll(pkgs.map[EClassifiers].flatten.filter(EClass))
		pkgs.forEach[pkg | getAllClasses(pkg.ESubpackages)]
	}


	protected def void compile() {
		if(slicer.strict) {
			metamodel.forEach[feedSubClassesRelations]
			identifyAllElementsToSlice
		}
		aspectGenerator.generate
		mainGenerator.generate
//		println(aspectGenerator.code)
//		println(mainGenerator.code)
		saveCode
	}
	
	
	protected def void identifyAllElementsToSlice() {
		val set = new HashSet<EClass>()
		val setSlicedClasses = new HashSet<EClass>()
		var EClass clazz
		setSlicedClasses.addAll(slicer.slicedClasses.map[domain])
		set.addAll(setSlicedClasses)

		while(!set.empty) {
			clazz = set.head
			set.addAll(clazz.EReferences.filter[ref| ref.lowerBound>0 && !setSlicedClasses.contains(ref.EType)].map[EType].filter(EClass))
			set.addAll(clazz.ESuperTypes.filter[cl2|!setSlicedClasses.contains(cl2)])
			set.addAll(clazz.lowerClasses.filter[cl2|!setSlicedClasses.contains(cl2)])
			if(!setSlicedClasses.contains(clazz)) {
				val slicedClass = KomprenFactoryImpl.eINSTANCE.createSlicedClass
				slicedClass.domain = clazz
				slicer.slicedElements+=slicedClass
				setSlicedClasses.add(clazz)
			}
			set.remove(clazz)
		}		

		val setSlicedRefs = new HashSet<EStructuralFeature>()
		setSlicedRefs.addAll(slicer.slicedProps.map[domain])
		// Adding sliced properties
		setSlicedClasses.map[EStructuralFeatures].flatten.filter[ref | ref.lowerBound>0 && !setSlicedRefs.contains(ref)].forEach[ref |
			val prop = KomprenFactoryImpl.eINSTANCE.createSlicedProperty
			prop.domain = ref
			slicer.slicedElements+=prop
		]
//		println(slicer.slicedClasses.map[domain.name].join(", "))
//		println(setSlicedClasses.map[name].join(", "))
//		println(slicer.slicedProps.map[domain].map[name].join(", "))
	}


	protected def void saveCode() {
		val p = targetDir+slicer.name+"/src/main/java/"+pkgName+"/"
//		println(">>>" + p)
		val path = Paths.get(p)
		if(!Files.exists(path))
			Files.createDirectories(path)
		var out = new PrintWriter(p+slicerName+"Aspects.xtend")
		out.println(aspectGenerator.code)
		out.flush
		out.close
		out = new PrintWriter(p+slicerName+".xtend")
		out.println(mainGenerator.code)
		out.flush
		out.close
	}
	
	
	protected def List<EPackage> getEcoreModel(Slicer slicer) {
		val List<EPackage> mm = new ArrayList
		val Set<EPackage> pkgsVisited = new HashSet
		
		slicer.slicedElements.forEach[elt |
			var EPackage pkg = switch(elt) {
				SlicedClass: elt.domain.EPackage
				SlicedProperty: elt.domain.EContainingClass.EPackage
				default: null
			}
			if(pkg!=null && !pkgsVisited.contains(pkg)) {
				pkgsVisited.add(pkg)
				while(pkg.ESuperPackage!=null) {
					pkg = pkg.ESuperPackage
					pkgsVisited.add(pkg)
				}
				mm.add(pkg)		
			}	
		]
		return mm
	}
	
	protected def Slicer getSlicerModel(String uriSlicerModel, ResourceSet rs) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("kompren", new XMIResourceFactoryImpl)
		val res = rs.getResource(URI.createURI(uriSlicerModel), true)
		res.load(Collections.emptyMap)
		return res.contents.filter(Slicer).head
	}
}
