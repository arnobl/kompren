/*
 * Creation : December 8, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell Team
 * Authors  : Arnaud Blouin
 */
package fr.inria.triskell.kompren

import static extension fr.inria.triskell.kompren.EClassifierAspectName.*
import static extension fr.inria.triskell.kompren.SlicerAspect.*
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.ecore.EClass

class SlicerClassGenerator extends Generator {
	new(SlicerGenerator slicer) {
		this.slicerGenerator = slicer
	}
	

	public override void generateCode() {
		var List<String> linedHelper = null
		
		if(slicerGenerator.slicerModel.helper!=null)
			linedHelper = slicerGenerator.slicerModel.helper.split("\n")
		
		generatedCode.append(slicerGenerator.getPackageFromClasses(slicerGenerator.aspectisedClasses))
		
		val List<String> helper = new ArrayList()
		
		// The helper may contain 'require' statements that must be placed at this place.
		if(linedHelper!=null) {//FIXME
			val requireStr = "require \""
			helper.add(slicerGenerator.slicerModel.helper)
			
			linedHelper.filter[contains(requireStr)].forEach[str |
				generatedCode.append(str).append('\n')
				helper.add(helper.remove(0).replaceAll(str, ""))
			]
		
			slicerGenerator.slicerModel.helper = helper.remove(0)
		}
						
		if(slicerGenerator.slicerModel.strict)
			generatedCode.append("using kermeta::emfpersistence::*")
   					     
   		generatedCode.append("\nusing kermeta::standard::*\nusing kermeta::utils::*\nusing kermeta::io::StdIO => stdio\n").append(
						 slicerGenerator.getUsingsFromClasses(slicerGenerator.aspectisedClasses))
		
		// The helper may contain 'using' statements that must be placed at this place.
		if(linedHelper!=null){
			val usingStr = "using "
			
			helper.clear
			helper.add(slicerGenerator.slicerModel.helper)
			
			linedHelper.filter[contains(usingStr)].forEach[str | 
				generatedCode.append(str).append("\n")
				helper.add(helper.remove(0).replaceAll(str, ""))
			]
			slicerGenerator.slicerModel.helper = helper.remove(0)
		}			 
						 
		generatedCode.append("class ").append(slicerGenerator.shortNameSlicer).append(" {\n")

		if(slicerGenerator.slicerModel.strict)
			generatedCode.append("\treference sliceRoots : Bag<SlicerVisitor>\n")
		else {
			if(slicerGenerator.slicerModel.radius!=null)
				generatedCode.append("\tattribute radius : Integer\n\n")
			
			slicerGenerator.slicerModel.constraints.forEach[const |
				generatedCode.append("\tattribute ").append(const.name).append(" : Boolean\n\n")
			]
		}

		slicerGenerator.slicerModel.slicedProperties.forEach[elt |
			if(elt.isOption)
				generatedCode.append("\tattribute consider").append(elt.domain.name).append(" : Boolean\n\n")
		]
		
		// This attribute must useful only if there are opposites to create.
		if(slicerGenerator.hasOpposite)
			generatedCode.append("\treference model : ").append(slicerGenerator.rootClass.name).append("\n\n")
		
		generatedCode.append("\tattribute idPass : Integer\n\n")

		generatedCode.append(generateRequiredAttributes()).append(generateAddedAttributes()).append(
						 generateIntialiseOperation()).append(generateLaunchOperation()).append('\n').append(
						 generateAddOperations()).append(generateOnEndMethod()).append(generateOnStartMethod())
						 
		if(slicerGenerator.slicerModel.helper!=null)
			generatedCode.append(slicerGenerator.slicerModel.helper)
		
		generatedCode.append('\n').append("}\n").append(generateRelationClasses())
	}
	
	
	public def String generateOnEndMethod() {
		var result = "\toperation onEnd() is do\n"
		
		if(slicerGenerator.slicerModel.onEnd!=null)
			result = result + slicerGenerator.slicerModel.onEnd +"\n"
		
		result = result + "\tend\n"
		return result
	}

	
	public def String generateOnStartMethod() {
		var result = "\toperation onStart() is do\n"
		
		if(slicerGenerator.slicerModel.onStart!=null)
			result = result + slicerGenerator.slicerModel.onStart +"\n"
		
		result = result + "\tend\n"
		return result
	}


	public def StringBuilder generateRelationClasses() {
		val result = new StringBuilder

		slicerGenerator.slicerModel.slicedProperties.filter[expression!=null].forEach[rel |
			val etype = rel.domain.EType as EClass
			result.append("class Class").append(rel.domain.name).append(" {\n").append(
					"\treference src : ").append(rel.domain.EContainingClass.name).append('\n').append(
					"\treference tar : ").append(etype.name).append('\n').append(
					"\toperation initialise(src : ").append(rel.domain.EContainingClass.name).append(", tar : ").append(
					etype.name).append(") : Class").append(rel.domain.name).append(
					" is do\n\t\tresult := self\n\t\tself.src := src\n\t\tself.tar := tar\n\tend\n}\n")
		]
		return result
	}


	public def StringBuilder generateAddOperations() {
		val result = new StringBuilder

		slicerGenerator.slicerModel.slicedClasses.filter[expression!=null].forEach[clazz |
			result.append("\toperation on").append(clazz.domain.name).append("Added(").append( 
					clazz.ctx.varName).append(" : ").append(clazz.domain.name).append(") is do\n").append(
					clazz.expression).append("\n\tend\n")
		]

		slicerGenerator.slicerModel.slicedProperties.filter[expression!=null].forEach[rel |
			val type = rel.domain.EType as EClass
			result.append("\toperation on").append(rel.domain.EContainingClass.name).append(
				rel.domain.name).append("Added(").append(rel.src.varName).append(" : ").append( 
				rel.domain.EContainingClass.name).append(", ").append(rel.tgt.varName).append(
				" : ").append(type.name).append(") is do\n").append(rel.expression).append("\n\tend\n")
		]
		return result
	}


	// Generates the "launch" operation.
	public def StringBuilder generateLaunchOperation() {
		val result = new StringBuilder
		val hasRadius = slicerGenerator.slicerModel.radius!=null
		val focusedClasses = slicerGenerator.slicerModel.radius.focusedClasses

		result.append("\toperation launch() is do\n")
		
		if(slicerGenerator.hasOpposite)
			result.append("\t\tself.model.feedOpposites()\n")

		result.append("\t\tonStart()\n")
		
		slicerGenerator.slicerModel.inputClasses.forEach[clazz |
			result.append("\t\tself.").append(clazz.getRequiredAttributeName).append(".each{").append(
				clazz.getVarNameClassifier).append(" | ").append(clazz.getVarNameClassifier).append(
				".visitToAddClasses(self")
			if(hasRadius) result.append(", 0")
			result.append(") }\n")
		]
		slicerGenerator.slicerModel.inputClasses.forEach[clazz |
			result.append("\t\tself.").append(clazz.getRequiredAttributeName).append(".each{").append(
				clazz.getVarNameClassifier).append(" | ").append(clazz.getVarNameClassifier).append(
				".visitToAddRelations(self")
			if(hasRadius) result.append(", 0")
			result.append(") }\n")
		]
		
		if(!slicerGenerator.slicerModel.strict) {
			slicerGenerator.slicerModel.slicedClasses.filter[expression!=null].forEach[eclass |
				val varName = eclass.domain.getVarNameClassifier
				var endCode = new StringBuffer
		
				result.append("\t\tself.").append(eclass.domain.getAddedAttributeName).append(".each{").append(varName).append(" | ")
		
				if(hasRadius && focusedClasses.contains(eclass)) {
					result.append("if(").append(varName).append(".checkCanReallyBeAdded()) then ")
					endCode.append(" end")
				}
		
				result.append("on").append(eclass.domain.name).append("Added(").append(varName).append(")").append(endCode).append(" }\n")
			]
			slicerGenerator.slicerModel.slicedProperties.filter[expression!=null].forEach[rel |
				val varName = "the" + rel.domain.name
				result.append("\t\tself.added").append(rel.domain.name).append(".each{").append(varName).append(" | self.on").append(
						rel.domain.EContainingClass.name).append(rel.domain.name).append("Added(").append(varName).append(
						".src, ").append(varName).append(".tar) }\n")
			]
		}

		result.append("\t\tonEnd()\n\tend\n")
		return result
	}


	public def StringBuilder generateIntialiseOperation() {
		val result = new StringBuilder
		val i = new ArrayList // TODO: workaround for bypassing variable limitation
		val hasRadius = slicerGenerator.slicerModel.radius!=null
		
		i.add(0)
		result.append("\toperation initialise(")

		slicerGenerator.slicerModel.inputClasses.forEach[clazz |
			if(i.head>0) result.append(result).append(", ")
			result.append(clazz.getRequiredAttributeName).append(" : bag ").append(clazz.name).append("[0..*]")
			i.add(i.get(0) + 1)
		]

		if(!slicerGenerator.slicerModel.strict) {
			if(hasRadius)
				result.append(", radius : Integer")
	
			slicerGenerator.slicerModel.constraints.forEach[param |
				result.append(", ").append(param.name).append(" : Boolean")
			]
		}

		slicerGenerator.slicerModel.slicedProperties.forEach[rel |
			if(rel.isOption)
				result.append(", consider").append(rel.domain.name).append(" : Boolean")
		]
		
		if(slicerGenerator.hasOpposite)
			result.append(", model : ").append(slicerGenerator.rootClass.name)

		result.append(result).append(") : ").append(slicerGenerator.shortNameSlicer + " is do\n")
		result.append(result).append("\t\tresult := self\n")

		if(slicerGenerator.hasOpposite)
			result.append("\t\tself.model := model\n")

		if(slicerGenerator.slicerModel.strict)
			result.append("\t\tself.sliceRoots := Bag<SlicerVisitor>.new\n")
		else {
			slicerGenerator.slicerModel.slicedClasses.forEach[clazz |
				result.append(result).append("\t\tself.").append(clazz.domain.getAddedAttributeName).append(
					" := Bag<").append(clazz.domain.name).append(">.new\n")
			]
			slicerGenerator.slicerModel.slicedProperties.filter[expression!=null].forEach[rel |
				result.append("\t\tself.added").append(rel.domain.name).append(" := Bag<Class").append(
					rel.domain.name).append(">.new\n")
			]

			if(hasRadius)
				result.append("\t\tself.radius := radius\n")
	
			slicerGenerator.slicerModel.constraints.forEach[param |
				result.append("\t\tself.").append(param.name).append(" := ").append(param.name).append('\n')
			]
		}

		slicerGenerator.slicerModel.inputClasses.forEach[clazz |
			// Need to clear the sets before their init (if the slicer is reused).
			result.append("\t\tself.").append(clazz.getRequiredAttributeName).append(".clear()\n").append(
				"\t\tself.").append(clazz.getRequiredAttributeName).append(".addAll(").append(
				clazz.getRequiredAttributeName).append(")\n")
		]

		slicerGenerator.slicerModel.slicedProperties.forEach[rel |
			if(rel.isOption)
				result.append("\t\tself.consider").append(rel.domain.name).append(" := consider").append(
					rel.domain.name).append('\n')
		]
		
		result.append("\n\t\tif(idPass.isVoid) then idPass := 0\n\t\telse idPass := idPass + 1 end\n").append("\tend\n\n")
		return result
	}


	public def StringBuilder generateAddedAttributes() {
		val result = new StringBuilder

		if(!slicerGenerator.slicerModel.strict) {
			slicerGenerator.slicerModel.slicedClasses.forEach[clazz |
				result.append("\treference ").append(clazz.domain.getAddedAttributeName).append(
				" : Bag<").append(clazz.domain.name).append(">\n\n")
			]
			slicerGenerator.slicerModel.slicedProperties.filter[expression!=null].forEach[rel |
				result.append("\treference added").append(rel.domain.name).append(" : Bag<Class").append(
					rel.domain.name).append(">\n\n")
			]
		}

		return result
	}


	public def StringBuilder generateRequiredAttributes() {
		val result = new StringBuilder

		slicerGenerator.slicerModel.inputClasses.forEach[eclass |
			result.append("\treference ").append(eclass.getRequiredAttributeName).append(" : ").append(
				eclass.name).append("[0..*]\n\n")
		]
		
		return result
	}
}
