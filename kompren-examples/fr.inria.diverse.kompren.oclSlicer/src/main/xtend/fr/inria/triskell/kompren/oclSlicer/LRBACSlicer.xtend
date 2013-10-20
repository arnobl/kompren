package fr.inria.triskell.kompren.oclSlicer

import LRBAC.LRBACPackage
import LRBAC.Location
import java.util.Collections
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.triskell.kompren.oclSlicer.LRBASlicerVisitor.*

class LRBACSlicer {
	protected val Set<EObject> roots = new HashSet
	
	def slice(String uriModel) {
		LRBACPackage.eINSTANCE.eClass
		LRBAC2.LRBACPackage.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
	    val resSet = new ResourceSetImpl
	    val resource = resSet.getResource(URI.createURI("src/main/resources/models/PaperModel1.xmi"), true)
	    
	    resource.getContents.filter(typeof(Location)).forEach[
	    	visitToAddClasses(this)
	    ]
	    
	    val res = resSet.createResource(URI.createURI("slicedModel.xmi"))
		res.getContents.addAll(roots)
	    res.save(Collections.emptyMap)
	    
	    resource.unload
	}
	
	
	def static void main(String[] args) {
		val slicer = new LRBACSlicer
		slicer.slice("src/main/resources/models/PaperModel1.xmi")
	}
}