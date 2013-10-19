/*
 * Creation : December 8, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell Team
 * Authors  : Arnaud Blouin
 */
package fr.inria.triskell.kompren

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EReference
import kompren.SlicedProperty

import static extension fr.inria.triskell.kompren.EClassifierAspectName.*
import static extension fr.inria.triskell.kompren.EStructuralFeatureAspectName.*
import static extension fr.inria.triskell.kompren.SlicerAspect.*
import static extension fr.inria.triskell.kompren.helpers.EClassifierAspectQName.*
import static extension fr.inria.triskell.kompren.helpers.ENamedElementAspectQName.*

class SlicerAspectGenerator extends Generator {
	new(SlicerGenerator slicer) {
		slicerGenerator = slicer
	}

	public override void generateCode() {
		val mainPackageName = slicerGenerator.aspectisedClasses.last.EPackage.getQualifiedName
		// "packages" contains the packages correspondeing to the all the packages used by the pruner.
		// These packages will be used to add "using" and "require" elements into files.
		val List<String> packages = new ArrayList<String>
		
		// Getting the different packages of the pruner.
		slicerGenerator.aspectisedClasses.forEach[cl |
			val packageName = cl.EPackage.getQualifiedName
			if(!packages.contains(packageName) && mainPackageName.equals(packageName))
				packages.add(packageName)
		]

		val codeUsing = new StringBuilder
		// Adding the header of the main aspect class.
		generatedCode.append(slicerGenerator.getPackageFromClasses(slicerGenerator.aspectisedClasses))
		
		packages.forEach[pkg | 
			// Adding the "using" elements that refers to the other packages.
			codeUsing.append("using ").append(pkg).append("::*\n")
		]

		generatedCode.append(codeUsing).append("using kermeta::standard::*\nusing kermeta::utils::*\nusing kermeta::io::StdIO => stdio\n").append(generateVisitAspect)
		packages.add(mainPackageName)

		slicerGenerator.aspectisedClasses.forEach[eclass |
			val packageName = eclass.EPackage.getQualifiedName

			if(packageName.equals(mainPackageName))
				generatedCode.append(generateAspect(eclass, true))
			else {
				packages.add(packageName)
				// Otherwise, the code of the aspect must be write into another file dedicated to its package.
				generateExternAspect(eclass, mainPackageName, packages)
			}
		]
		
		if(slicerGenerator.hasOpposite) {
			generatedCode.append(generateAspectFeedableOtherClasses)
			generatedCode.append("abstract class Feedable {\n\toperation feedOpposites() is do end\n}\n")
		}
	}
	
	
	// Generates the aspects, required to feed opposites, on classes not already aspectised.
	public def StringBuilder generateAspectFeedableOtherClasses() {
		val result  = new StringBuilder
		val classes = slicerGenerator.aspectisedClasses

		slicerGenerator.allClasses.filter[clazz | !classes.exists[getQualifiedName.equals(clazz.getQualifiedName)]].forEach[cl |
			result.append(generateAspect(cl, false))
		]
			 
		return result
	}
	
	
	public def StringBuilder generateVisitFeedCallBlock(EClass clazz) {
		val result  = new StringBuilder

		clazz.EStructuralFeatures.filter(typeof(EReference)).forEach[sf |
			if(sf.containment)
				result.append("\t\t").append(generateVisitFeedCallExpression(sf))
		]

		return result
	}
	
	
	public def StringBuilder generateVisitFeedCallExpression(EReference ref) {
		val result  = new StringBuilder
		result.append("self.").append(ref.getValidKermetaName).append(".")
		
		if(ref.upperBound==-1)
			result.append("each{the").append(ref.name).append(" | the").append(
				ref.name).append(".feedOpposites() }\n") 
		else {
			result.append("feedOpposites()")
			
			if(ref.lowerBound==0)
				result.append("if not self.").append(ref.getValidKermetaName).append(
					".isVoid then ").append(result).append(" end\n")
			else
				result.append('\n')
		}
		return result
	}
	
	
	
	public def void generateExternAspect(EClass clazz, String mainPackageName, List<String> packages) {
		val namePackage = clazz.EPackage.getQualifiedName
		val codeAspect = new StringBuilder
		
		// If no code has been already created for this package.
		if(slicerGenerator.requiredAspectFiles.get(namePackage)==null) {
			val codeUsing = new StringBuilder
			// Adding headers of the file.
			codeAspect.append("package ").append(namePackage).append(";\n")
	
			// Adding the "require" elements that refer to the other created aspect files.
	 		packages.filter[pkg | !pkg.equals(namePackage) && !pkg.equals(mainPackageName)].forEach[str |
	 			codeUsing.append("using ").append(str).append("::*\n")
	 		]

			// Adding the "using" elements.
			codeAspect.append("using kermeta::standard::*\nusing ").append(mainPackageName).append(
				"::*\n").append(codeUsing).append("\n")
		}else {
			// If the file already exists, the code is extracted and removed from the hashmap.
			codeAspect.append(slicerGenerator.requiredAspectFiles.get(namePackage))
			slicerGenerator.requiredAspectFiles.remove(namePackage)
		}
		
		// Adding the class code of the apsect.
		codeAspect.append(generateAspect(clazz, true))
		// Adding the new code to the hashmap with as key the qualified name of the package.
		slicerGenerator.requiredAspectFiles.put(namePackage, codeAspect.toString)
	}
	
	
	// Generates the copy of the required attributes of the given class. Generates for example:
	// result.name := self.name
	public def StringBuilder generateCopyOfRequiredAttributesOfClass(EClass eclass, String varName, boolean doSuper){
		val result  = new StringBuilder
		val slicedElts = slicerGenerator.slicerModel.slicedElements

		eclass.EStructuralFeatures.forEach[sf |
			if((sf instanceof EAttribute && sf.lowerBound==1) ||
				(slicedElts.filter(typeof(SlicedProperty)).exists[elt | elt.domain.getQualifiedName.equals(sf.getQualifiedName)]))
				if(sf.upperBound==1)
					result.append("\t\t").append(varName).append('.').append(sf.getValidKermetaName).append(
						" := self.").append(sf.getValidKermetaName).append('\n')
				else
					result.append("\t\tself.").append(sf.getValidKermetaName).append(".each{attr | ").append(
						varName).append('.').append(sf.getValidKermetaName).append(".add(attr) }\n")
		]

		// Supporting attributes of superclasses.
		if(doSuper)
			eclass.ESuperTypes.forEach[st | result.append(generateCopyOfRequiredAttributesOfClass(st, varName, doSuper))]

		return result
	}
	
	
	public def StringBuilder createImplementationOperationCreateFrom(EClass eclass) {
		val result  = new StringBuilder
		
		if(slicerGenerator.slicerModel.strict && !eclass.abstract)
			result.append("\tmethod createFrom() : Object is do\n\t\tvar the").append(eclass.name).append(" : ").append( 
						eclass.name).append(" := ").append(eclass.name).append(".new\n").append( 
						generateCopyOfRequiredAttributesOfClass(eclass, "the"+eclass.name, true)).append(// not hasSuper) + 
						"\t\tresult := the").append(eclass.name).append("\n\tend\n\n")
			//TODO var hasSuper : Boolean init detect a super class which is a VisitorSlicer and use ti
			
		return result
	}
	

	// Generates an aspect on the given eclass. considerSlicerVisitor defines if the aspect will be a visitor
	// used for slicing classes and relations.
	public def StringBuilder generateAspect(EClass eclass, boolean considerSlicerVisitor){
		val buffer = new StringBuilder
		val prunerVarName = "the" + slicerGenerator.shortNameSlicer
		val paramCode = ""
		val feedOppositeMethod = new StringBuffer

/* TODO
		slicerGenerator.slicerModel.constraints.each{param |
			if(param.element.eContainingClass==eclass or param.element.eContainingClass.isSuperTypeOfBis(eclass)) then
				paramCode := paramCode + " and (not " + prunerVarName + "." + param.name + " or self." + param.expression + ")"
			end
		}
*/
		buffer.append("aspect class ").append(eclass.name)

		if(considerSlicerVisitor) {
			buffer.append(" inherits SlicerVisitor")
			if(slicerGenerator.hasOpposite) buffer.append(", Feedable")
		}
		else
			if(slicerGenerator.hasOpposite) buffer.append(" inherits Feedable")
		
		buffer.append(" {\n")
		
		// Must write the implementation of the operation createFrom
		buffer.append(createImplementationOperationCreateFrom(eclass))
		
		if(slicerGenerator.hasOpposite)
			feedOppositeMethod.append("\tmethod feedOpposites() is do\n\t\tsuper[Feedable]()\n").append(generateVisitFeedCallBlock(eclass))

		// Generating the opposite attributes or initialisation methods.
		slicerGenerator.slicerModel.slicedProperties.filter[opposite!=null].forEach[rel |
			val cl = rel.domain.EContainingClass
			val etype = rel.domain.EType as EClass

			// Attributes corresponding to the opposites to create are now added to the aspect class.
			if(cl.getQualifiedName.equals(eclass.getQualifiedName)){
				buffer.append("\treference ").append(rel.domain.getValidKermetaName).append(" : ").append(etype.name)
					.append("[").append(rel.domain.lowerBound.toString).append("..")
				if(rel.domain.upperBound==-1)
					buffer.append("*")
				else
					buffer.append(rel.domain.upperBound.toString)

				buffer.append("]\n\n")
			}

			// Initialisation methods must be added to the aspect clazz that contains the attributes which opposites are created.
			if((etype.getQualifiedName.equals(eclass.getQualifiedName) || etype.isSuperTypeOfBis(eclass)) && rel.domain instanceof EReference)
				feedOppositeMethod.append(generateInitialiseOppositeOperation(rel))
		]
		
		val hasRadius = slicerGenerator.slicerModel.radius!=null

		// Generating methods dedicated to the visit of the class and its relations.
		if(considerSlicerVisitor && !eclass.outputFocusedRelations.empty ||
			slicerGenerator.slicerModel.inputClasses.exists[cl | cl.getQualifiedName.equals(eclass)] ||
			slicerGenerator.slicerModel.slicedClasses.exists[sc | sc.domain.getQualifiedName.equals(eclass.getQualifiedName)] ||
			slicerGenerator.slicerModel.slicedProperties.exists[sp | sp.domain.EContainingClass.getQualifiedName.equals(eclass.getQualifiedName)]) {
			buffer.append("\tmethod visitToAddClasses(").append(prunerVarName).append(" : ").append(slicerGenerator.shortNameSlicer)
			if(hasRadius)
				buffer.append(", currentRadius : Integer")

			buffer.append(") is do\n\t\tcheckInitialisation(").append(prunerVarName).append(".idPass)\n\t\tif(not self.visitedPass").append(paramCode)
			if(hasRadius)
				buffer.append(" and (").append(prunerVarName).append(".radius<=0 or currentRadius<=(").append(prunerVarName).append(".radius+1))")

			buffer.append(") then\n")
//			val superName = "SlicerVisitor"
			val List<String> superNames = new ArrayList
			val slicedClasses = slicerGenerator.slicerModel.slicedClasses
			
			if(eclass.ESuperTypes.size>0)
				eclass.ESuperTypes.forEach[sup |
					if(slicedClasses.exists[sc | sc.domain.getQualifiedName==sup.getQualifiedName])
						superNames.add(sup.getQualifiedName)
				]

			if(superNames.isEmpty)
				superNames.add("SlicerVisitor")
			
			superNames.forEach[n |
				buffer.append("\t\t\tsuper[").append(n).append("](").append(prunerVarName)
				if(hasRadius)
					buffer.append(", currentRadius")
				buffer.append(")\n")
			]

			if(slicerGenerator.slicerModel.slicedClasses.exists[sc | sc.domain.getQualifiedName.equals(eclass.getQualifiedName)]) {
				buffer.append("\t\t\tif(not self.sliced")
				if(hasRadius && 
					(slicerGenerator.slicerModel.radius.focusedClasses.exists[fc | fc.domain.getQualifiedName.equals(eclass.getQualifiedName)] ||
					slicerGenerator.slicerModel.radius.focusedClasses.exists[cl | cl.domain.isSuperTypeOfBis(eclass)]))
						buffer.append(" and (").append(prunerVarName).append(".radius<=0 or currentRadius<=").append(prunerVarName).append(".radius)")

				buffer.append(") then\n\t\t\t\t")
				
				if(slicerGenerator.slicerModel.strict)
					buffer.append("self.dup := self.createFrom()")
				else
					buffer.append(prunerVarName).append(".").append(eclass.getAddedAttributeName).append(".add(self)\n\t\t\t\t")
						//.append(prunerVarName).append(".addToRoot(self.dup)\n\t\t\t\t")

				buffer.append("self.sliced := true\n\t\t\tend\n")
			}

			val relationCalls = generateRelationCalls(eclass, true)
			
			if(relationCalls.length>0)
				buffer.append("\t\t\tself.visitedPass := true\n").append(generateRelationCalls(eclass, true))// + "\t\t\tself.visitedPass := false\n"

			buffer.append("\t\tend\n\tend\n\tmethod visitToAddRelations(").append(prunerVarName).append(" : ").append(slicerGenerator.shortNameSlicer)

			if(hasRadius)
				buffer.append(", currentRadius : Integer")
			buffer.append(") is do\n\t\tif(not self.visitedForRelations").append(paramCode)

			if(hasRadius)
				buffer.append(" and (").append(prunerVarName).append(".radius<=0 or currentRadius<=").append(prunerVarName).append(".radius)")
			buffer.append(") then")
			
			superNames.forEach[n |
				buffer.append("\n\t\t\tsuper[").append(n).append("](").append(prunerVarName)
				if(hasRadius)
					buffer.append(", currentRadius")
				buffer.append(")\n")
			]

			buffer.append("\t\t\tself.visitedForRelations := true\n").append(generateRelationCalls(eclass, false)).append("\t\tend\n\tend\n")
								//"\t\t\tself.visitedPass := false\n" + 
		}

		if(feedOppositeMethod.length>0)
			buffer.append(feedOppositeMethod).append("\tend\n")

		buffer.append(generateCheckOperation(eclass)).append("}\n\n")
		return buffer
	}


	public def StringBuilder generateCheckOperation(EClass clazz) {
		val result = new StringBuilder
		val hasRadius = slicerGenerator.slicerModel.radius!=null

		if(hasRadius) {
			if(!slicerGenerator.slicerModel.radius.focusedClasses.exists[cl | clazz.isSuperTypeOfBis(cl.domain)]) {
				result.append("\tmethod checkCanReallyBeAdded() : Boolean is do\n")
	
				if(slicerGenerator.slicerModel.radius.focusedClasses.exists[fc | fc.domain.getQualifiedName.equals(clazz.getQualifiedName)])
					result.append("\t\tresult := self.sliced\n")
				else {
					result.append("\t\tresult := super()")
					if(!slicerGenerator.slicerModel.radius.focusedClasses.exists[cl | cl.domain.isSuperTypeOfBis(clazz)]) {
						clazz.outputFocusedRelations.forEach[rel |
							val relName = rel.domain.getValidKermetaName
							result.append(" and ")
							if(rel.domain.upperBound==1)
								result.append("(self.").append(relName).append(".isVoid.orElse{b | self.").append(relName).append( 
										".visitedPass.orElse{b | self.").append(relName).append(".checkCanReallyBeAdded()}})")
							else {
								val varName = (rel.domain.EType as EClass).getVarNameClassifier
								result.append("self.").append(relName).append(".each{").append(varName).append(" | ").append(varName).append( 
										".visitedPass.orElse{b | ").append(varName).append(".checkCanReallyBeAdded()} }")
							}
						 ]
					}
					result.append('\n')
				}
				result.append("\tend\n")
			}
		}
		return result
	}


	// Generates the operation that initialises a created opposite.
	public def StringBuilder generateInitialiseOppositeOperation(SlicedProperty slicedProp) {
		val result = new StringBuilder
		val relation = slicedProp.domain as EReference
		val selfNameVar = "self." + relation.EOpposite.getValidKermetaName 
		
		result.append("\t\t")
		if(relation.EOpposite.upperBound==-1 || relation.EOpposite.upperBound>1) {
			val name = relation.EContainingClass.getVarNameClassifier
			result.append(selfNameVar).append(".each{").append(name).append(" | ").append(name).append(".").append(relation.getValidKermetaName).append(".add(self) }")
		} else {
			if(relation.EOpposite.lowerBound==0) result.append("if(not ").append(selfNameVar).append("isVoid) then ")
			result.append(selfNameVar).append('.').append(relation.getValidKermetaName).append(".add(self)")
			if(relation.EOpposite.lowerBound==0) result.append(" end")
		}
		
		result.append('\n')
		return result
	}
	
	
	public def StringBuilder generateRelationCall(EReference ref, boolean isOption, String visitMethodName, String nameVarPruner, boolean classVisit) {
		val result = new StringBuilder
		val hasRadius = slicerGenerator.slicerModel.radius!=null
		
		if(!ref.derived) {
			val radiusCode = new StringBuilder
			val relName = ref.getValidKermetaName
	
			if(hasRadius)
				if(slicerGenerator.slicerModel.radius.focusedClasses.exists[cl |
					ref.EContainingClass==cl || cl.domain.isSuperTypeOfBis(ref.EContainingClass) || ref.EContainingClass.isSuperTypeOfBis(cl.domain)])
					radiusCode.append(", currentRadius+1")
				else
					radiusCode.append(", currentRadius")
	
			result.append("\t\t\t")
	
			if(isOption)
				result.append("if(").append(nameVarPruner).append(".consider").append(ref.name).append(") then ")
			
//			val prunerVarName = "the" + slicerGenerator.shortNameSlicer
	
			if(ref.upperBound==1) {
				if(ref.lowerBound==0)
					result.append("if(not self.").append(relName).append(".isVoid) then ") 

				result.append("self.").append(relName).append('.').append(visitMethodName).append('(').append(nameVarPruner).append(
						radiusCode).append(')').append(generateAddRelations(classVisit, ref as EReference))
	
				if(slicerGenerator.slicerModel.strict && !classVisit)
					result.append("\n\t\t\tif(self.").append(ref.getValidKermetaName).append(".sliced) then\n\t\t\t\tself.dup.asType(").append( 
							(ref.eContainer as EClassifier).name).append(").").append(ref.getValidKermetaName).append(" := self.").append( 
							ref.getValidKermetaName).append(".dup.asType(").append(ref.EType.name).append(")\n\t\t\tend\n")
	
				if(ref.lowerBound==0)
					result.append(" end")
			}else {
				var nameVar = (ref.EType as EClass).getVarNameClassifier
	
				result.append("self.").append(relName).append(".each{").append(nameVar).append(" | ").append(nameVar).append( 
						'.').append(visitMethodName).append('(').append(nameVarPruner).append(radiusCode).append(')').append(
						generateAddRelations(classVisit, ref as EReference))
						
				if(slicerGenerator.slicerModel.strict && !classVisit)
					result.append("\n\t\t\t\tif(not dup.isVoid and ").append(nameVar).append(".sliced) then\n\t\t\t\t\t").append( 
								"dup.asType(").append((ref.eContainer as EClassifier).name).append(").").append(ref.getValidKermetaName).append( 
								".add(").append(nameVar).append(".dup.asType(").append(ref.EType.name).append("))\n\t\t\t\tend\n\t\t\t")
				result.append('}')
			}
	
			if(isOption) result.append(" end")
			result.append('\n')
		}

		return result
	}



	public def StringBuilder generateRelationCalls(EClass eclass, boolean classVisit) {
		val result = new StringBuilder
		val String visitMethodName = if(classVisit) "visitToAddClasses" else "visitToAddRelations"
		val nameVarPruner = "the" + slicerGenerator.shortNameSlicer

		// Generating calls for relation to slice as specified in the slicer model.
		eclass.outputFocusedRelations.filter[domain instanceof EReference].forEach[relation |//TODO manage EAttribute
			result.append(generateRelationCall(relation.domain as EReference, relation.isOption, visitMethodName, nameVarPruner, classVisit))
		]
		
		// Generating calls for relation to slice as specified in the metamodel (relation 1). Only for strict slicers.
		if(slicerGenerator.slicerModel.strict)
			eclass.EStructuralFeatures.filter[sf | 
				sf instanceof EReference && sf.lowerBound==1 && !eclass.outputFocusedRelations.exists[ofr | ofr.domain==sf]].forEach[sf |
				result.append(generateRelationCall(sf as EReference, false, visitMethodName, nameVarPruner, classVisit))
			]
		return result
	}


	public def StringBuilder generateAddRelations(boolean classVisit, EReference relation) {
		val result = new StringBuilder
		if(!classVisit && slicerGenerator.slicerModel.slicedProperties.exists[rel | 
			(rel as SlicedProperty).domain==relation && (rel as SlicedProperty).expression!=null]) {
			val nameVar2 = (relation.EType as EClass).getVarNameClassifier
			result.append("\n\t\t\t\tif(self.visitedForRelations and ").append(nameVar2).append(
					".visitedForRelations) then\n\t\t\t\t\tthe").append(slicerGenerator.shortNameSlicer).append(
					".added").append(relation.name).append(".add(Class").append(relation.name).append(".new.initialise(self, ").append(nameVar2).append(")) end ")
		}
		return result
	}


	public def StringBuilder generateVisitAspect() {
		val result = new StringBuilder
		val prunerVarName = "the" + slicerGenerator.shortNameSlicer
		
		result.append("class SlicerVisitor {\n")
		
		if(slicerGenerator.slicerModel.strict)
			result.append("\treference dup : Object\n\n")
		
		result.append("\tattribute visitedPass : Boolean\n\n\t").append( 
				"attribute visitedForRelations : Boolean\n\n\tattribute sliced : Boolean\n\n\t").append(
				"attribute idPass : Integer\n\n\t").append(
				"operation initialiseAttributes(pass : Integer) is do\n\t\tself.visitedPass := false\n\t\t").append(
				"self.sliced := false\n\t\tself.visitedForRelations := false\n\t\tself.idPass := pass\n\tend\n\n\t").append(
				"operation visitToAddClasses(").append(prunerVarName).append(" : ").append(slicerGenerator.shortNameSlicer)
		if(slicerGenerator.slicerModel.radius!=null) result.append(", currentRadius : Integer")
		result.append(") is do\n\t\tself.visitedPass := true\n\tend\n\n\t").append(
				"operation visitToAddRelations(").append(prunerVarName).append(" : ").append(slicerGenerator.shortNameSlicer)
		if(slicerGenerator.slicerModel.radius!=null) result.append(", currentRadius : Integer")
		result.append(") is do\n\tend\n\n\toperation checkInitialisation(pass : Integer) is do\n\t\t").append(
				"if(self.visitedPass.isVoid or self.idPass.isVoid.orElse{b | self.idPass!=pass}) then initialiseAttributes(pass) end\n\t").append(
				"end\n\toperation checkCanReallyBeAdded() : Boolean is do\n").append(
				"\t\tself.visitedPass := true\n\t\tresult := true\n\tend\n")
				
		if(slicerGenerator.slicerModel.strict)
			result.append("\n\toperation createFrom() : Object is abstract\n")
		
		result.append("}\n\n")
		return result
	}
}
