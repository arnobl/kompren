package statemachineslicer

import static extension statemachineslicer.__SlicerAspect__.*
import static extension statemachineslicer.exstateMachineTransitionAspect.*
import static extension statemachineslicer.exstateMachineOutputStateAspect.*
import static extension statemachineslicer.exstateMachineStandardStateAspect.*
import static extension statemachineslicer.exstateMachineStateAspect.*
import static extension statemachineslicer.exstateMachineInputStateAspect.*
import static extension statemachineslicer.exstateMachineTerminalStateAspect.*
import static extension statemachineslicer.exstateMachineInitStateAspect.*
class StateMachineSlicer{
	val java.util.List<ex.stateMachine.State> inputState
	private val java.util.List<org.eclipse.emf.ecore.EObject> clonedElts = newArrayList
	val String nameExtension

	new(java.util.List<ex.stateMachine.State> inputState, String nameExtension){
		this.inputState = inputState
		this.nameExtension=nameExtension
	}

	def void slice(){
		inputState?.forEach[visitToAddClasses(this)]
		inputState?.forEach[visitToAddRelations(this)]
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
