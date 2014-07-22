/*
 * Licence  : EPL
 * Copyright: Inria Rennes, Diverse
 * Authors  : Arnaud Blouin
 */
package fr.inria.diverse.kompren.compiler

import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Collections
import java.util.List
import java.util.Set
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer
import kompren.impl.KomprenFactoryImpl
import kompren.impl.KomprenPackageImpl
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.diverse.kompren.compiler.ConstraintAspect.*
import static extension fr.inria.diverse.kompren.compiler.EClassAspect.*
import static extension fr.inria.diverse.kompren.compiler.EPackageAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicedClassAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicerAspect.*
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import kompren.KomprenFactory

class SlicerCompiler {
	val String slicerName
	val String pkgName
	val Slicer slicer
	val List<EPackage> metamodel
	val SlicerAspectGenerator aspectGenerator
	val SlicerMainGenerator mainGenerator
	val String targetDir
	val List<EClass> metamodelClasses = newArrayList
	val List<GenModel> genModels = newArrayList
	val boolean serialise
	
	
	new(Slicer slicer, boolean serialise, String targetDir) {
		this.slicer = slicer
		this.serialise = serialise
		if(slicer.uriMetamodel.exists[!endsWith(".genmodel")]) 
			throw new IllegalArgumentException("URI metamodel must refers to a genmodel.")

		GenModelPackage.eINSTANCE.eClass

		val ResourceSet set = new ResourceSetImpl
		val ecoreFactory = new EcoreResourceFactoryImpl
		val map = set.getResourceFactoryRegistry.getExtensionToFactoryMap
        map.put("ecore", ecoreFactory)
		map.put("genmodel", ecoreFactory)

		slicer.uriMetamodel.forEach[uriMM |
			val res = set.getResource(URI.createURI(uriMM), true)
			res.load(null)
			genModels.addAll(res.contents.filter(GenModel))
		]

		metamodel = getEcoreModel(slicer)
		getAllClasses(metamodel)
		initPackagePrefix
		if(slicer.strict && slicer.outputMetamodel!=null)
			mapInputOutputMetamodel(set)
		var last = slicer.name.split("\\.").last
		slicerName = Character.toUpperCase(last.charAt(0)).toString+last.substring(1)
		pkgName = last.toLowerCase
		aspectGenerator = new SlicerAspectGenerator(metamodel, slicerName, slicer, pkgName, metamodelClasses)
		mainGenerator = new SlicerMainGenerator(metamodel, slicerName, slicer, pkgName)
		this.targetDir = targetDir
	}


	new(String slicerURI, boolean serialise, String targetDir) {
		this(getSlicerModel(slicerURI), serialise, targetDir)
	}


	private def void mapInputOutputMetamodel(ResourceSet set) {
		val res = set.getResource(URI.createURI(slicer.outputMetamodel), true)
		res.load(null)
		val outputGen = res.contents.filter(GenModel).map[genPackages].flatten.map[getEcorePackage].toList
		_mapInputOutputMetamodel(outputGen, metamodel)
	}


	private def void _mapInputOutputMetamodel(List<EPackage> outPkgs, List<EPackage> inPkgs) {
		if(outPkgs.nullOrEmpty || inPkgs.nullOrEmpty || outPkgs.size!=inPkgs.size) return;
		for(i : 0 ..<outPkgs.size)
			inPkgs.get(i).mappedPkg = outPkgs.get(i)
//		outPkgs.forEach[outPkg |
//			val matching = inPkgs.head//.findFirst[pkg | outPkg.name.toLowerCase.compareToIgnoreCase(pkg.name)<0]
//			if(matching!=null)
//				matching.mappedPkg = outPkg
//		]
		_mapInputOutputMetamodel(outPkgs.map[ESubpackages].flatten.toList, inPkgs.map[ESubpackages].flatten.toList)
	}


	private def void initPackagePrefix() {
		genModels.forEach[gen |
			_initPackagePrefix(gen.genPackages)
			_initPackagePrefix(gen.usedGenPackages)
		]
	}

	private def void _initPackagePrefix(Iterable<GenPackage> pkgs) {
		val pkgRoots = metamodel.toMap[name]
		
		pkgs.filter[getEcorePackage!=null].forEach[pkg |
			val pkg2 = pkgRoots.get(pkg.getEcorePackage.name)
			if(pkg2!=null) {
				val base = pkg.basePackage
				pkg2.pkgPrefix = if(base!=null && base.length>0) base + '.' else ""
				pkg2.pkgPrefixNoSep = pkg2.pkgPrefix.replace(".", "")
	//			_initPackagePrefix(pkg.nestedGenPackages)
			}
		]
	}

	
	private def void getAllClasses(List<EPackage> pkgs) {
		metamodelClasses.addAll(pkgs.map[EClassifiers].flatten.filter(EClass))
		pkgs.forEach[pkg | getAllClasses(pkg.ESubpackages)]
	}


	def void compile() {
		if(slicer.strict || slicer.slicedElements.exists[se | !se.constraints.empty])
			metamodel.forEach[feedSubClassesRelations]
			
		if(slicer.strict)
			identifyAllElementsToSlice

		val scs = slicer.slicedClasses
		val scp = slicer.slicedProps
		scs.forEach[slicedCl | slicedCl.domain.slicedClass=slicedCl]
		if(!slicer.strict) {
			scs.forEach[slicedCl | if(slicedCl.ctx==null) slicedCl.ctx = SlicerFactory::createVarDecl("theVar")]
			scp.forEach[slicedProp |
				if(slicedProp.src==null) slicedProp.src = SlicerFactory::createVarDecl("theSrc")
				if(slicedProp.tgt==null) slicedProp.tgt = SlicerFactory::createVarDecl("theTgt")
			]
		}

		scp.forEach[slicedProp |
			val firstChar = slicedProp.domain.name.charAt(0)
			if(Character.isUpperCase(firstChar))
				slicedProp.domain.name = Character.toLowerCase(firstChar)+slicedProp.domain.name.substring(1)
		]
		
		completeConstraintsToSubClasses
		aspectGenerator.generate
		mainGenerator.generate
		if(serialise)
			saveCode
	}
	
	
	protected def void completeConstraintsToSubClasses() {
		slicer.slicedClasses.filter[!constraints.empty && !addedToBeSliced].forEach[slicedCl |
			_completeConstraintsToSubClasses(slicedCl.domain.lowerClasses, slicedCl)
		]
	}
	
	
	private def void _completeConstraintsToSubClasses(List<EClass> classes, SlicedClass slicedCl) {
		val List<EClass> subClasses = newArrayList
		classes.forEach[cl |
			subClasses.addAll(cl.lowerClasses)
			slicedCl.constraints.filter[!cloned].forEach[cst |
				val cstDup = KomprenFactoryImpl.eINSTANCE.createConstraint
				cstDup.cloned = true
				cstDup.expression = cst.expression
				cstDup.name = cst.name
				if(cl.slicedClass==null) {
					cl.slicedClass = KomprenFactory.eINSTANCE.createSlicedClass
					cl.slicedClass.domain = cl
				}
				cl.slicedClass.constraints += cstDup
			]
		]
		if(!subClasses.empty)
			_completeConstraintsToSubClasses(subClasses, slicedCl)
	}
	
	
	protected def void identifyAllElementsToSlice() {
		val Set<EClass> set = newHashSet
		val setSlicedClasses = slicer.slicedClasses.map[domain].toSet
		var EClass clazz
		set.addAll(setSlicedClasses)

		while(!set.empty) {
			clazz = set.head
			set.addAll(clazz.EReferences.filter[ref| ref.lowerBound>0 && !setSlicedClasses.contains(ref.EType)].map[EType].filter(EClass))
			set.addAll(clazz.ESuperTypes.filter[cl2|!setSlicedClasses.contains(cl2)])
			set.addAll(clazz.lowerClasses.filter[cl2|!setSlicedClasses.contains(cl2)])
			if(!setSlicedClasses.contains(clazz)) {
				val slicedClass = KomprenFactoryImpl.eINSTANCE.createSlicedClass
				slicedClass.domain = clazz
				slicedClass.addedToBeSliced = true
				slicer.slicedElements+=slicedClass
				setSlicedClasses.add(clazz)
			}
			set.remove(clazz)
		}		

		val setSlicedRefs = slicer.slicedProps.map[domain].toSet
		// Adding sliced properties
		setSlicedClasses.map[EStructuralFeatures].flatten.filter[ref | ref.lowerBound>0 && !setSlicedRefs.contains(ref)].forEach[ref |
			val prop = KomprenFactoryImpl.eINSTANCE.createSlicedProperty
			prop.domain = ref
			slicer.slicedElements+=prop
		]

		removeEcoreTricks
//		println(slicer.slicedClasses.map[domain.name].join(", "))
//		println(setSlicedClasses.map[name].join(", "))
//		println(slicer.slicedProps.map[domain].map[name].join(", "))
	}


	private def _removeClass(String clname) {
		val classToRemove = slicer.slicedClasses.findFirst[cl | cl.domain.name==clname]
		if(classToRemove!=null) slicer.slicedElements.remove(classToRemove)
		val cl = metamodelClasses.findFirst[name==clname]
		if(cl!=null) metamodelClasses.remove(cl)
	}

	private def _removeRef(String name) {
		val relToRemove = slicer.slicedProps.findFirst[cl | cl.domain.name==name]
		if(relToRemove!=null) slicer.slicedElements.remove(relToRemove)
	}

	private def removeEcoreTricks() {
		// Some hacks to do when one of the metamodel to slice is Ecore.		
		val ecoreSuffix = 'ecore.genmodel'
		if(slicer.uriMetamodel.exists[toLowerCase.endsWith(ecoreSuffix)]) {
			// The classes EObject and EFactory must not be sliced.
			_removeClass('EFactory')
			_removeClass('EObject')
			_removeClass('EStringToStringMapEntry')
			// The relation EFactoryInstance must not be sliced since no ecore model contains factory.
			_removeRef('eFactoryInstance')
			// The attribute Id is coded as ID...
			_removeRef('iD')
		}
	}
	
	
	def String getFileNameAspect() {
		slicerName+"Aspects.xtend"
	}
	
	def String getFileNameMain() {
		slicerName+".xtend"
	}
	
	def StringBuilder getCodeAspect() {
		aspectGenerator.code
	}
	
	def StringBuilder getCodeMain() {
		mainGenerator.code
	}
	
	def String getPackageFolder() {
		pkgName+"/"
	}


	private def void saveCode() {
		val p = targetDir+slicer.name+"/src/main/java/"+getPackageFolder
		val path = Paths.get(p)
		if(!Files.exists(path))
			Files.createDirectories(path)
		var out = new PrintWriter(p+getFileNameAspect)
		out.println(getCodeAspect)
		out.flush
		out.close
		out = new PrintWriter(p+getFileNameMain)
		out.println(getCodeMain)
		out.flush
		out.close
	}
	
	
	private def List<EPackage> getEcoreModel(Slicer slicer) {
		val List<EPackage> mm = newArrayList
		val Set<EPackage> pkgsVisited = newHashSet
		
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
	
	static def Slicer getSlicerModel(String uriSlicerModel) {
		KomprenPackageImpl.eINSTANCE.eClass
		EcoreFactoryImpl.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("kompren", new XMIResourceFactoryImpl)
		val res = new ResourceSetImpl().getResource(URI.createURI(uriSlicerModel), true)
		res.load(Collections.emptyMap)
		return res.contents.filter(Slicer).head
	}
}
