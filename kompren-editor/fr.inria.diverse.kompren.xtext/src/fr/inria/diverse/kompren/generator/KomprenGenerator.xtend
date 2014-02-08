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
			val compiler = new SlicerCompiler(slicer, false, "")
			compiler.compile
			fsa.generateFile(compiler.packageFolder+compiler.fileNameMain, compiler.codeMain)
			fsa.generateFile(compiler.packageFolder+compiler.fileNameAspect, compiler.codeAspect)
		]
	}
}
