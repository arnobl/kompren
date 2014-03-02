package fr.inria.triskell.kompren.oclSlicer

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import modelfootprinter.ModelFootprinter

class ExecModelFootprint {
	def static void main(String[] args) {
		// Package to update according to the metamodel to use
		LRBAC.LRBACPackage.eINSTANCE.eClass
		LRBAC2.LRBAC2Package.eINSTANCE.eClass

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
	    val resSet = new ResourceSetImpl
	    
	    // Set the model to footprint
	    val resource = resSet.getResource(URI.createURI("src/main/resources/models/PaperModel1.xmi"), true)

	    // To update according to the root class of the metamodel to use
	    val slicer = new ModelFootprinter(resource.getContents.filter(typeof(LRBAC.Location)).toList, "xmi")
	    slicer.slice
	    resource.unload
	}
}