package modelfootprinter

import static extension modelfootprinter.__SlicerAspect__.*
import static extension modelfootprinter.LRBACRoleAspect.*
import static extension modelfootprinter.LRBACLocationAspect.*
import static extension modelfootprinter.LRBACUserAspect.*
import static extension modelfootprinter.LRBACPermissionAspect.*
import static extension modelfootprinter.LRBACSessionAspect.*
import static extension modelfootprinter.LRBACOperationAspect.*
import static extension modelfootprinter.LRBACReadAspect.*
import static extension modelfootprinter.LRBACWriteAspect.*
import static extension modelfootprinter.LRBACExecuteAspect.*
import static extension modelfootprinter.LRBACObjectAspect.*
class ModelFootprinter{
	val java.util.List<LRBAC.Location> inputLocation
	private val java.util.List<org.eclipse.emf.ecore.EObject> clonedElts = newArrayList
	val String nameExtension

	new(java.util.List<LRBAC.Location> inputLocation, String nameExtension){
		this.inputLocation = inputLocation
		this.nameExtension=nameExtension
	}

	def void slice(){
		inputLocation?.forEach[visitToAddClasses(this)]
		inputLocation?.forEach[visitToAddRelations(this)]
		save
	}

	def void objectCloned(org.eclipse.emf.ecore.EObject object){
		this.clonedElts.add(object)
	}

	def void save(){
		val objs = this.clonedElts.filter[eContainer==null]
		val resSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl)
		val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("modelSlice."+this.nameExtension))
		res.getContents.addAll(objs)
	    res.save(java.util.Collections.emptyMap)
	    res.unload
	}

}
