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
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
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
	val Set<EClass> metamodelClasses = new HashSet
	
	def static void main(String[] args) {
		var slicerCompiler = new SlicerCompiler("sm.kompren", "", "/media/data/dev/kompren/kompren-examples/")
		slicerCompiler.compile
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
		metamodel = getEcoreModel(slicer)
		getAllClasses(metamodelClasses, metamodel)
		pkgName = slicer.name.split("\\.").last
		slicerName = Character.toUpperCase(pkgName.charAt(0)).toString+pkgName.substring(1)
		aspectGenerator = new SlicerAspectGenerator(metamodel, slicerName, slicer, pkgName, metamodelClasses)
		mainGenerator = new SlicerMainGenerator(metamodel, slicerName, slicer, pkgName)
		this.targetDir = targetDir
	}


	private def void getAllClasses(Set<EClass> set, List<EPackage> pkgs) {
		set.addAll(pkgs.map[EClassifiers].flatten.filter(EClass))
		pkgs.forEach[pkg | getAllClasses(set, pkg.ESubpackages)]
	}


	protected def void compile() {
		if(slicer.strict) {
			metamodel.forEach[feedSubClassesRelations]
			identifyAllClassesRelationsToSlice
		}
		aspectGenerator.generate
		mainGenerator.generate
//		println(aspectGenerator.code)
//		println(mainGenerator.code)
		saveCode
	}
	
	
	protected def void identifyAllClassesRelationsToSlice() {
		val set = new HashSet<EClass>()
		val setSlicedClasses = new HashSet<EClass>()
		var EClass clazz
		setSlicedClasses.addAll(slicer.slicedClasses.map[domain])
		set.addAll(setSlicedClasses)

		// Adding relation with cardinality 1
		while(!set.empty) {
			clazz = set.head
			set.addAll(clazz.EReferences.filter[lowerBound>0].map[EType].filter(EClass))
			createSlicedClass(setSlicedClasses, clazz)
			set.remove(clazz)	
		}
		
		// Adding sub-classes
		set.addAll(setSlicedClasses)
		while(!set.empty) {
			clazz = set.head
			if(clazz.lowerClasses!=null) set.addAll(clazz.lowerClasses)
			createSlicedClass(setSlicedClasses, clazz)
			set.remove(clazz)	
		}
		
		val setSlicedRefs = new HashSet<EReference>()
		setSlicedRefs.addAll(slicer.slicedProps.map[domain])
		// Adding sliced properties
		setSlicedClasses.map[EReferences].flatten.filter[ref | ref.lowerBound>0 && !setSlicedRefs.contains(ref)].forEach[ref |
			val prop = KomprenFactoryImpl.eINSTANCE.createSlicedProperty
			prop.domain = ref
			slicer.slicedElements+=prop
		]
	}


	private def void createSlicedClass(Set<EClass> setSlicedClasses, EClass clazz) {
		if(!setSlicedClasses.contains(clazz)) {
			val slicedClass = KomprenFactoryImpl.eINSTANCE.createSlicedClass
			slicedClass.domain = clazz
			slicer.slicedElements+=slicedClass
			setSlicedClasses.add(clazz)
		}	
	}


	protected def void saveCode() {
		val p = targetDir+slicer.name+"/src/main/xtend/"+pkgName+"/"
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
		val mm = new ArrayList<EPackage>()
		if(!slicer.slicedElements.empty) {
			val elt = slicer.slicedElements.head
			var EPackage pkg = switch(elt) {
				SlicedClass: elt.domain.EPackage
				SlicedProperty: elt.domain.EContainingClass.EPackage
				default: null
			}
			if(pkg!=null) {
				while(pkg.ESuperPackage!=null)
					pkg = pkg.ESuperPackage
				mm.add(pkg)		
			}
		}
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
