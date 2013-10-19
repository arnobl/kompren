/*
 * Creation : November 25, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell Team
 * Authors  : Arnaud Blouin
 */
package fr.inria.triskell.kompren

import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import kompren.Slicer

class KomprenCompiler {
	def static void main(String[] args) {
		new KomprenCompiler().compile("")
	}
	
	
	public def void compile(String uriSlicer) {
		val slicerModel = getSlicerModel(uriSlicer)
		val pkg 		= getEcoreModel(slicerModel.uriMetamodel).head
		val slicer 		= new SlicerGenerator(slicerModel, pkg, slicerModel.uriMetamodel)

		slicer.generateSlicer
		slicer.saveCode
		// var start : Long := Date.new.getTime()
		// generateKevoree
		// generateInvertedClassModel
		// generateClassSlicer
		// generateUnusedVarDetector
		// generateKermetaTransfoAnalyser
		// generateStateMachineSlicer
		// generateFeatureDiagramSlicer
		// generateStrictEcoreSlicer
		// generateSemZoomSlicer
		// generateUMLCMSlicer
		// stdio.writeln((Date.new.getTime()-start).toString)
	}
	
	
//	public def StringBuilder getAllMetamodelReferences4Komprent(String uriMM) {
//		val buf = new StringBuilder
		//FIXME xtend
//		val pkg = getEcoreModel(uriMM).head
//		val strProp = "\tslicedProperty: "
//		val eol = "\n"
//		val sep = "."
		
//		pkg.getAllReferences.forEach[ref | buf.append(strProp).append(ref.getQualifiedName(sep)).append(eol)]
//		
//		return buf
//	}
	
	
	public def List<EPackage> getEcoreModel(String uriEcoreModel) {
		var fact = new EcoreResourceFactoryImpl
		if(!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		val rs = new ResourceSetImpl()
		val uri = URI.createURI(uriEcoreModel)
		val res = rs.getResource(uri, true)
		return res.contents.filter(typeof(EPackage)).toList
	}


	public def Slicer getSlicerModel(String uriSlicerModel) {
		var fact = new EcoreResourceFactoryImpl
		if(!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("kompren", fact);
		val rs = new ResourceSetImpl()
		val uri = URI.createURI(uriSlicerModel)
		val res = rs.getResource(uri, true)
		return res.contents.filter(typeof(Slicer)).toList.head
		
//   		var repository : ResourceSet := ResourceSet.new
//   		var resource : Resource := repository.createResource(uriSlicerModel, "platform:/resource/org.kermeta.kompren.slicer.compiler/metamodel/kompren.ecore")
//       	resource.load(void)
//       	
//       	result := void
//
//		from var it : Iterator<Object> := resource.getContents.iterator
//		until it.isOff
//		loop
//			var next : Object := it.next
//			if(next.isInstanceOf(Slicer)) then                 
//				result ?= next
//			end
//		end
	}
	

//	operation generateKermetaPruningSlicer() is do
//		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/kermetaPruning/kermeta.ecore"
//		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/kermetaPruning/modelTransfo.kompren")
//		var pkg 		: EPackage := getEcoreModel(modelURI).one()
//		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)
//
//		slicer.generateSlicer
//		slicer.saveCode
//	end
	

/*
	operation generateUMLCMSlicer() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/umlClassModel/UML.ecore"
		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/umlClassModel/umlCM.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("/examples.umlCM/")
	end


	operation generateSemZoomSlicer() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/semZoom/Ecore.ecore"
		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/semZoom/sem.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("/examples.semZoom/")
	end

	operation generateStrictEcoreSlicer() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/strictEcore/Ecore.ecore"
		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/strictEcore/strictEcore.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("/examples.strictEcore/")
	end

	operation generateFeatureDiagramSlicer() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/featureModel/featureDiagram.ecore"
		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/featureModel/featureModel.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("platform:/resource/slicing/examples/featureModel/output/")
	end

	operation generateStateMachineSlicer() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/stateMachine/StateMachine.ecore"
		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/stateMachine/sm.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("/examples.stateMachine/")
	end

	operation generateKermetaTransfoAnalyser() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/modelTransfoAnalysis/kermeta.ecore"
		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/modelTransfoAnalysis/modelTransfo.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("/examples.modelTransfoAnalysis/")
	end

	operation generateUnusedVarDetector() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/unusedVar/kermeta.ecore"
		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/unusedVar/unusedVar.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("/examples.unusedVar/")
	end

	operation generateKevoree() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/kevoree/kevoree.ecore"
		var slicerModel : Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/kevoree/kevoree.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("platform:/resource/slicing/examples/kevoree/output/")
	end

	operation generateInvertedClassModel() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/class/ClassModel.ecore"
		var slicerModel	: Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/classInverted/classInverted.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("/examples.clazzInverted/")
	end

	operation generateClassSlicer() is do
		var modelURI	: String := "platform:/resource/org.kermeta.kompren.slicer.compiler/examples/class/ClassModel.ecore"
		var slicerModel	: Slicer := getSlicerModel("platform:/resource/org.kermeta.kompren.slicer.compiler/examples/class/class.slicer")
		var pkg 		: EPackage := getEcoreModel(modelURI).one()
		var slicer 		: SlicerGenerator := SlicerGenerator.new.initialise(slicerModel, pkg, modelURI)

		slicer.generateSlicer()
		slicer.saveCode("/examples.clazz/")
	end
*/
}
