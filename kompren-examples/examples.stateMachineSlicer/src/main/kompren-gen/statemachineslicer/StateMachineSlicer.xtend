package statemachineslicer

import ex.stateMachine.State
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension statemachineslicer.__SlicerAspect__.*

class StateMachineSlicer{
	val List<State> inputState
	private val List<EObject> clonedElts = newArrayList
	val String nameExtension

	new(List<State> inputState, String nameExtension){
		this.inputState = inputState
		this.nameExtension=nameExtension
	}

	def void slice(){
		inputState?.forEach[visitToAddClasses(this)]
		inputState?.forEach[visitToAddRelations(this)]
		save
	}

	def void objectCloned(EObject object){
		this.clonedElts.add(object)
	}

	def void save(){
		val objs = this.clonedElts.filter[eContainer==null]
		val resSet = new ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val res = resSet.createResource(URI.createURI("modelSlice."+this.nameExtension))
		res.getContents.addAll(objs)
	    res.save(Collections.emptyMap)
	    res.unload
	}

}
