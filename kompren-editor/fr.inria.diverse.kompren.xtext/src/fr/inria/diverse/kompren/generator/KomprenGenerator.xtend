package fr.inria.diverse.kompren.generator

import com.google.inject.Inject
import fr.inria.diverse.kompren.compiler.SlicerCompiler
import kompren.Slicer
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.core.compiler.XtendGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * Generates code from your model files on save.
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class KomprenGenerator implements IGenerator {
	
	@Inject XtendGenerator xtendGen
	@Inject XtextResourceSet xtextResSet
	@Inject KomprenOutputConfigurationProvider provider
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val outputConfig = provider.outputConfigurations.findFirst[description==KomprenOutputConfigurationProvider.description]

		resource.allContents.toIterable.filter(Slicer).forEach[slicer |
			slicer.onEnd = removeBrackets(slicer.onEnd)
			slicer.onStart = removeBrackets(slicer.onStart)
			slicer.helper = removeBrackets(slicer.helper)
			slicer.logVisitClass = removeBrackets(slicer.logVisitClass)
			slicer.logVisitRelation = removeBrackets(slicer.logVisitRelation)
			slicer.slicedElements.forEach[se |
				se.expression = removeBrackets(se.expression)
				se.constraints.forEach[cst | cst.expression = removeBrackets(cst.expression)]
			]
			
			val compiler = new SlicerCompiler(slicer, false, "")
			compiler.compile
			fsa.generateFile(compiler.packageFolder+compiler.fileNameMain, compiler.codeMain)
			fsa.generateFile(compiler.packageFolder+compiler.fileNameAspect, compiler.codeAspect)
			
//BEGIN TEMPORARY CODE
			ResourcesPlugin.getWorkspace().getRoot().projects.forEach[proj|
				proj.refreshLocal(IResource.DEPTH_INFINITE, null)
				proj.touch(null)
				proj.build(IncrementalProjectBuilder::CLEAN_BUILD, null)
			]


val myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path("KomprenSlicerTemplate/"+outputConfig.outputDirectory+"/"+compiler.packageFolder+compiler.fileNameMain))
val myFile2 = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path("KomprenSlicerTemplate/"+outputConfig.outputDirectory+"/"+compiler.packageFolder+compiler.fileNameAspect))
myFile.touch(null)
myFile2.touch(null)

val project = myFile.project
project.refreshLocal(IResource.DEPTH_INFINITE, null)

project.touch(null)
//val res = xtextResSet.getResource(URI::createFileURI(myFile.fullPath.toString), true)
//val res2 = xtextResSet.getResource(URI::createFileURI(myFile2.fullPath.toString), true)
//			xtendGen.doGenerate(res, fsa)
//			xtendGen.doGenerate(res2, fsa)
//				xtendGen.doGenerate(xtextResSet.getResource(URI::createPlatformResourceURI("/KomprenSlicerTemplate/"+myFile2.fullPath.toString, false), true), fsa)			
//			}
project.build(IncrementalProjectBuilder::CLEAN_BUILD, null)
// END TEMPORARY CODE
		]
//		ResourcesPlugin.getWorkspace().getRoot().projects.forEach[refreshLocal(IResource.DEPTH_INFINITE, null)]
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
