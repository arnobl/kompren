package fr.inria.triskell.kompren.oclSlicer

import LRBAC.LRBACPackage
import java.util.Set
import kompren.ecoreSlicer.EcoreSlicer
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.ocl.ecore.Constraint
import org.eclipse.ocl.ecore.OCL

import static extension fr.inria.triskell.kompren.oclSlicer.OCLSlicerVisitor.*

class OCLSlicer {
	def static void main(String[] args) {
		// First step: Extracts the metamodel footprint from OCL constraints

	    OCL::newInstance()//EcoreEnvironmentFactory.INSTANCE)
	    LRBACPackage.eINSTANCE.eClass
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		val slicer = new OCLSlicer
	    val resSet = new ResourceSetImpl
	    val resource = resSet.getResource(URI.createURI("src/main/resources/models/PaperCst.xmi"), true)
	    slicer.slice(resource.getContents.filter(typeof(Constraint)))

		//---------------//
		// Second step: pruning the source metamodel using the footprint
		// The output metamodel is currently serialized.
		// That can be modified in EcoreSlicer 

		val ecoreSlicer = new EcoreSlicer(slicer.footprint.toList, slicer.metamodel.toList)
		ecoreSlicer.slice
	    resource.unload
	}
	
	val Set<EModelElement> footprint = newHashSet
	val Set<EPackage> metamodel = newHashSet
	
	def void slice(Iterable<Constraint> inputConstraints) {
		inputConstraints.forEach[visitToAddClasses(this)]
	}
	
	def void addToFootprint(EModelElement elt) {
		val root = EcoreUtil::getRootContainer(elt)
		if(root instanceof EPackage) {
			footprint.add(elt)
			metamodel.add(root)
		}
	}
}
