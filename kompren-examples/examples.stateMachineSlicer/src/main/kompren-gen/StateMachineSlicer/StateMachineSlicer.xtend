package StateMachineSlicer
import ex.*
import ex.impl.*
import ex.stateMachine.*
import ex.stateMachine.impl.*

import static extension StateMachineSlicer.__SlicerAspect__.*
import static extension StateMachineSlicer.TransitionAspect.*
import static extension StateMachineSlicer.OutputStateAspect.*
import static extension StateMachineSlicer.StateAspect.*
import static extension StateMachineSlicer.StandardStateAspect.*
import static extension StateMachineSlicer.InitStateAspect.*
import static extension StateMachineSlicer.InputStateAspect.*
import static extension StateMachineSlicer.TerminalStateAspect.*

import static extension StateMachineSlicer.__SlicerAspect__.*
import static extension StateMachineSlicer.TransitionAspect.*
import static extension StateMachineSlicer.OutputStateAspect.*
import static extension StateMachineSlicer.StateAspect.*
import static extension StateMachineSlicer.StandardStateAspect.*
import static extension StateMachineSlicer.InitStateAspect.*
import static extension StateMachineSlicer.InputStateAspect.*
import static extension StateMachineSlicer.TerminalStateAspect.*
import java.util.List

import org.eclipse.emf.ecore.EObject
class StateMachineSlicer{
	val List<State> inputState
	private val List<EObject> clonedElts = new java.util.ArrayList

	new(List<State> inputState){
		this.inputState = inputState
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
		val resSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl)
		val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("modelSlice.xmi"))
		res.getContents.addAll(objs)
	    res.save(java.util.Collections.emptyMap)
	    res.unload
	}

}