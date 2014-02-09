package fr.inria.diverse.kompren.generator

import kompren.Slicer
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import fr.inria.diverse.kompren.compiler.SlicerCompiler

/**
 * Generates code from your model files on save.
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class KomprenGenerator implements IGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(Slicer).forEach[slicer |
			slicer.onEnd = removeBrackets(slicer.onEnd)
			slicer.onStart = removeBrackets(slicer.onStart)
			slicer.helper = removeBrackets(slicer.helper)
			slicer.logVisitClass = removeBrackets(slicer.logVisitClass)
			slicer.logVisitRelation = removeBrackets(slicer.logVisitRelation)
			slicer.slicedElements.forEach[se |
				se.expression = removeBrackets(se.expression)
			]
			
			val compiler = new SlicerCompiler(slicer, false, "")
			compiler.compile
			fsa.generateFile(compiler.packageFolder+compiler.fileNameMain, compiler.codeMain)
			fsa.generateFile(compiler.packageFolder+compiler.fileNameAspect, compiler.codeAspect)
		]
	}
	
	private def String removeBrackets(String txt) {
		var formattedTxt = txt
		if(formattedTxt==null || formattedTxt.length==0) return formattedTxt
		if(formattedTxt.startsWith('[['))
			formattedTxt = formattedTxt.substring(2)
		if(formattedTxt.endsWith(']]'))
			formattedTxt = formattedTxt.substring(0, formattedTxt.length-2)
		formattedTxt
	}
}
