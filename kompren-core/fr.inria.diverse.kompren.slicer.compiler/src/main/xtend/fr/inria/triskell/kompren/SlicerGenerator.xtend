/*
 * Creation : December 8, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell Team
 * Authors  : Arnaud Blouin
 */
package fr.inria.triskell.kompren

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer
import kompren.impl.KomprenFactoryImpl

import static extension fr.inria.triskell.kompren.EClassifierAspectName.*
import static extension fr.inria.triskell.kompren.helpers.EPackageAspectAll.*
import static extension fr.inria.triskell.kompren.helpers.ENamedElementAspectQName.*
import static extension fr.inria.triskell.kompren.helpers.EClassifierAspectQName.*
import static extension fr.inria.triskell.kompren.helpers.EClassAspectQName.*
import static extension fr.inria.triskell.kompren.SlicerAspect.*

class SlicerGenerator {
	protected var EPackage metamodel = null

	protected var String modelURI = null

	protected var Map<String, String> requiredAspectFiles = new HashMap
	
	protected var Slicer slicerModel = null
	
	protected var List<EClass> aspectisedClasses = new ArrayList
	
	protected var SlicerAspectGenerator slicerAspectGenerator = null

	protected var SlicerClassGenerator slicerClassGenerator = null
	
	protected var boolean hasOpposite = false
	
	protected var List<EClass> allClasses = null
	
	protected var EClass rootClass = null
	
	protected var String shortNameSlicer = null
	
	
	
	new(Slicer slicerModel, EPackage metamodel, String modelURI) {
		hasOpposite = false
		this.slicerModel = slicerModel
		this.metamodel   = metamodel
		this.modelURI 	 = modelURI
		checkClassesToSlice()
		updateModelForStrictSlicing()
		slicerAspectGenerator = new SlicerAspectGenerator(this)
		slicerClassGenerator = new SlicerClassGenerator(this)
		shortNameSlicer = slicerModel.name.split("\\.").last
		
		this.slicerModel.slicedElements.forEach[se |
			if(se instanceof SlicedProperty) {
				var SlicedProperty rel = se as SlicedProperty
				if(rel.opposite!=null) {
					hasOpposite = true
					// We change the slicing data to use of the opposite.
					var EReference ref = EcoreFactoryImpl.eINSTANCE.createEReference
					var SlicedProperty relation = KomprenFactoryImpl.eINSTANCE.createSlicedProperty
					ref.name = rel.opposite.name
					ref.setEType(rel.domain.EContainingClass)
					ref.setEOpposite(rel.domain as EReference)
					(rel.domain.EType as EClass).EStructuralFeatures.add(ref)
					ref.lowerBound = 0
					ref.upperBound = -1
					ref.containment = false
					relation.domain = ref
					relation.opposite = null
					relation.isOption = false
					ref.EContainingClass.outputFocusedRelations.add(relation)
					rel.domain = ref
					//FIXME and about expression?
				}
				else
					rel.domain.EContainingClass.outputFocusedRelations.add(rel)
			}
		]
		
		defineClassesToAspectise()
		
		if(hasOpposite){
			if(allClasses==null) allClasses = metamodel.getAllClasses()
			rootClass = computeRootClass()
		}
	}
	
	
	
	public def void updateModelForStrictSlicing() {
		if(slicerModel.strict) {
			slicerModel.onEnd = "		var repository : ResourceSet := ResourceSet.new
		var resource : Resource 
		//TODO: replace ./slice.xmi by a valid path, as platform:/project/slice.xmi
 		resource ?= repository.createResource(\"./slice.xmi\", \"" + slicerModel.uriMetamodel + "\")
 		
 		var elts : OrderedSet<Object> := OrderedSet<Object>.new 
 		sliceRoots.each{elt |
 		 	var cont : Object := elt.container
 			if(cont.isVoid.orElse{b | cont.asType(SlicerVisitor).sliced.isVoid.orElse{b2 | not cont.asType(SlicerVisitor).sliced}}) then
 				elts.add(elt.dup)
 			end
 		}
 		resource.getContents.addAll(sliceRoots)
 		resource.save(void)"
 		
 			slicerModel.helper = "	operation addToRoot(obj : Object) is do
		var cont : Object := obj.container
		if(cont.isVoid.orElse{b | cont.isInstanceOf(SlicerVisitor)}) then
			sliceRoots.add(obj)
		end"
		}
	}
	
	
	
	// This operation check that if a sliced class has relations with 1 cardinality, the type of these
	// relation must be sliced too. This process occurs only when the slicer is defined as strict.
	// This operation also checks that if an abstract class is sliced, all its concrete sub-types are sliced as well.
	public def void checkClassesToSlice() {
		val int size = slicerModel.slicedElements.size
		val List<SlicedClass> coll = new ArrayList
		val List<SlicedClass> slicedClassesToRemove = new ArrayList
	
		if(slicerModel.strict) {
			slicerModel.slicedClasses.forEach[sc | 
				sc.domain.EStructuralFeatures.filter(typeof(EReference)).forEach[ref |
					if(ref.lowerBound==1 &&
						!slicerModel.slicedClasses.exists[cl | cl.domain.getQualifiedName.equals(ref.EType.getQualifiedName)] &&
						!coll.exists[cl2 | cl2.domain.getQualifiedName.equals(ref.EType.getQualifiedName)] ){
						val newSlicedClass = KomprenFactoryImpl.eINSTANCE.createSlicedClass
						newSlicedClass.domain = ref.EType as EClass
						coll.add(newSlicedClass)
					}
				]
			]
		}

		coll.forEach[sc | slicerModel.slicedElements.add(0, sc) ]
		coll.clear
		
		slicerModel.slicedClasses.forEach[sc |
			if(allClasses==null) allClasses = metamodel.getAllClasses
			if(sc.domain.abstract) slicedClassesToRemove.add(sc)
			
			sc.domain.getConcreteSubClasses(allClasses).forEach[subClass |
				if(!slicerModel.slicedClasses.exists[sc2 | sc2.domain.getQualifiedName.equals(subClass.getQualifiedName)] &&
					!coll.exists[cl2 | cl2.domain.getQualifiedName.equals(subClass.getQualifiedName)]) {
					val slicedClass = KomprenFactoryImpl.eINSTANCE.createSlicedClass
					slicedClass.domain = subClass
					coll.add(slicedClass)
				}
			]
		]

		slicedClassesToRemove.forEach[cl | slicerModel.slicedElements.remove(cl) ]
		coll.forEach[sc | slicerModel.slicedElements.add(0, sc) ]

		if(size!=slicerModel.slicedElements.size)
			// We must re-call this operation to check required relation of the added classes.
			checkClassesToSlice
	}
	
	
	// Computes the root class of the metamodel.
	public def EClass computeRootClass() {
		var List<EClass> roots = allClasses.filter[cl | cl.canBeRootClass(allClasses)].toList
		
		if(roots.size()>1) {
			println("ERROR: SEVERAL POSSIBLE ROOT CLASS DETECTED!")
			roots.forEach[clazz | println(clazz.name)]
		}
		else {
			println("ERROR: NO ROOT CLASS DETECTED!")
			return null
		}
		return roots.head
	}
	
	
	public def void defineClassesToAspectise() {
		// Extracting the classes from the relations to focus on.
		slicerModel.slicedProperties.forEach[rel |
			if(!aspectisedClasses.exists[cl | cl.getQualifiedName.equals(rel.domain.EContainingClass.getQualifiedName)])
				aspectisedClasses.add(rel.domain.EContainingClass)
			if(rel.domain.EType instanceof EClass) {
				val eclass = rel.domain.EType as EClass
				if(!aspectisedClasses.exists[cl | cl.getQualifiedName.equals(eclass.getQualifiedName)])
					aspectisedClasses.add(eclass)
			}
		]
		slicerModel.inputClasses.forEach[eclass |
			if(!aspectisedClasses.exists[cl | cl.getQualifiedName.equals(eclass.getQualifiedName)])
				aspectisedClasses.add(eclass)
		]
		slicerModel.slicedClasses.forEach[clazz |
			if(aspectisedClasses.exists[cl | cl.getQualifiedName.equals(clazz.domain.getQualifiedName)])
				aspectisedClasses.add(clazz.domain)
		]
		
		// Removing the classes that are only types of relations unless they
		// are a supertype upon the gathered classes or they are required or
		// they must notify when visiting them.
		aspectisedClasses.forEach[eclass |
			if(eclass.outputFocusedRelations.empty &&
				!slicerModel.inputClasses.contains(eclass) &&
				aspectisedClasses.exists[cl | cl.isSuperTypeOfBis(eclass)] &&
				!slicerModel.slicedClasses.exists[sc | sc.domain.getQualifiedName.equals(eclass.getQualifiedName)])
				aspectisedClasses.remove(eclass)
		]
	}
	
	
	public def void generateSlicer() {
		slicerAspectGenerator.generateCode
		slicerClassGenerator.generateCode
	}
	
	
	public def String getRequiresFromClasses(List<EClass> classes) {
		var result = ""

		if(classes.size>1) {
			var List<String> packagesName = new ArrayList
			packagesName.add(classes.last.EPackage.getQualifiedName)

			var i = classes.size()-2
			while(i>=0) {// Skipping the first element which has been converted as the default package.
				var String name = classes.get(i).EPackage.getQualifiedName

				if(!packagesName.contains(name)) {
					packagesName.add(name)
					result = result + "require \"" + classes.get(i).EPackage.name + "SlicingAspect.kmt\"\n"
				}
				i = i - 1
			}
		}
		return result
	}
	
	
	
	public def String getUsingsFromClasses(List<EClass> classes) {
		var result = ""

		if(classes.size>1) {
			var List<String> packagesName = new ArrayList
			packagesName.add(classes.last.EPackage.getQualifiedName)

			var i = classes.size()-2
			// Skipping the first element which has been converted as the default package.
			while(i>=0) {
				var String name = classes.get(i).EPackage.getQualifiedName

				if(!packagesName.contains(name)){
					packagesName.add(name)
					result = result + "using " + name + "::*\n"
				}
				i = i - 1
			}
		}
		return result
	}
	
	
	
	public def String getPackageFromClasses(List<EClass> classes) {
		if(classes.empty)
			return ""
		return "package " + classes.last.EPackage.getQualifiedName + ";\n"
	}
	
	
//	public def String generateCodeKP(String modelAspectFileName, String slicerFileName, List<String> requiredAspectFileNames) {
//		var metamodelName = slicerModel.uriMetamodel.split("/").last
//		var pkgName = getPackageFromClasses(aspectisedClasses).replaceAll(";\n", "::" + shortNameSlicer).replaceAll("package ", "")
//		var projectNameForKP = slicerModel.name.replaceAll("\\.", "_")
//		val result = new StringBuilder
//		result.append("resource library_standard =\"platform:/plugin/org.kermeta.language.library.standard\" alternative \"mvn:org.kermeta.language/language.library.standard/2.0.99-SNAPSHOT\"\nimportProject library_standard\nproject ")
//		result = result + projectNameForKP + "{\n"
//		result = result + 
//					"\tmainClass \""+projectNameForKP+"^" + pkgName + "\"\n\tmainOperation \"launch\"\n\timport \"${project.baseUri}/" + 
//					metamodelName + "\"\n\timport \"${project.baseUri}/" + modelAspectFileName + 
//					"\"\n\timport \"${project.baseUri}/" + slicerFileName + "\"\n"
//		requiredAspectFileNames.forEach[name | result = result + "\timport \"${project.baseUri}/" + name + "\"\n"]
//		result = result + "}\n"
//		return result
//	}
	
	
	public def void copyMetamodel() {
		//FIXME
//		var metamodelName = slicerModel.uriMetamodel.split("/").last
//		FileIO.writeTextFile(("platform:/resource/" + slicerModel.name + "/" + metamodelName).toURI, FileIO.readTextFile(slicerModel.uriMetamodel.toURI))
	}
	
	
	public def void saveCode() {
		val List<String> aspectFileNames = new ArrayList

		requiredAspectFiles.keySet.forEach[key | aspectFileNames.add(key.split("::").last + "SlicingAspect.kmt")]
		//FIXME
//		FileIO.writeTextFile(("platform:/resource/" + slicerModel.name + "/project.kp").toURI, 
//							generateCodeKP(shortNameSlicer + "Aspect.kmt", shortNameSlicer + ".kmt", aspectFileNames))
		println(slicerAspectGenerator.generatedCode)
		println(slicerClassGenerator.generatedCode)
//		FileIO.writeTextFile(("platform:/resource/" + slicerModel.name + "/" + shortNameSlicer + "Aspect.kmt").toURI, slicerAspectGenerator.generatedCode)
//		FileIO.writeTextFile(("platform:/resource/" + slicerModel.name + "/" + shortNameSlicer + ".kmt").toURI, slicerClassGenerator.generatedCode)
//		copyMetamodel()
//		
//		requiredAspectFiles.keys.each{key |
//			var subPkgs : Sequence<String> := key.split("::")
//			FileIO.writeTextFile(("platform:/resource/" + slicerModel.name + "/" + subPkgs.last + "SlicingAspect.kmt").toURI, requiredAspectFiles.getValue(key))
//		}
	}
}

abstract class Generator {
	protected var SlicerGenerator slicerGenerator = null 

	protected val StringBuilder generatedCode = new StringBuilder

	public abstract def void generateCode()
}
