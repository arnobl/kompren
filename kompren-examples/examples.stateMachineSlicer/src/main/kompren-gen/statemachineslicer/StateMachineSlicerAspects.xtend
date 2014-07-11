package statemachineslicer

import static extension statemachineslicer.__SlicerAspect__.*
import static extension statemachineslicer.exstateMachineTransitionAspect.*
import static extension statemachineslicer.exstateMachineOutputStateAspect.*
import static extension statemachineslicer.exstateMachineStandardStateAspect.*
import static extension statemachineslicer.exstateMachineStateAspect.*
import static extension statemachineslicer.exstateMachineInputStateAspect.*
import static extension statemachineslicer.exstateMachineTerminalStateAspect.*
import static extension statemachineslicer.exstateMachineInitStateAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

	def void visitToAddClasses(StateMachineSlicer theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(StateMachineSlicer theSlicer){}

	def void visitToAddRelations(StateMachineSlicer theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(StateMachineSlicer theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(ex.stateMachine.StateMachine), with=#[typeof(__SlicerAspect__)])
class exstateMachineStateMachineAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(ex.stateMachine.Transition), with=#[typeof(__SlicerAspect__)])
class exstateMachineTransitionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = ex.stateMachine.StateMachineFactory.eINSTANCE.createTransition
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^source?.visitToAddClasses(theSlicer)
		_self.^target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^source!=null){
		_self.^source.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^source.sliced) (_self.clonedElt as ex.stateMachine.Transition).^source = _self.^source.clonedElt as ex.stateMachine.OutputState
		}
		if(_self.^target!=null){
		_self.^target.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^target.sliced) (_self.clonedElt as ex.stateMachine.Transition).^target = _self.^target.clonedElt as ex.stateMachine.InputState
		}

	}
}

@Aspect(className=typeof(ex.stateMachine.State), with=#[typeof(__SlicerAspect__)])
abstract class exstateMachineStateAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as ex.stateMachine.State).^name = _self.^name

	}
}

@Aspect(className=typeof(ex.stateMachine.InputState), with=#[typeof(exstateMachineStateAspect)])
abstract class exstateMachineInputStateAspect extends exstateMachineStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(ex.stateMachine.OutputState), with=#[typeof(exstateMachineStateAspect)])
abstract class exstateMachineOutputStateAspect extends exstateMachineStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^outgoingTransitions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^outgoingTransitions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!=null) (_self.clonedElt as ex.stateMachine.OutputState).^outgoingTransitions.add( _elt.clonedElt as ex.stateMachine.Transition)
		]

	}
}

@Aspect(className=typeof(ex.stateMachine.InitState), with=#[typeof(exstateMachineOutputStateAspect)])
class exstateMachineInitStateAspect extends exstateMachineOutputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = ex.stateMachine.StateMachineFactory.eINSTANCE.createInitState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(ex.stateMachine.StandardState), with=#[typeof(exstateMachineInputStateAspect), typeof(exstateMachineOutputStateAspect)])
class exstateMachineStandardStateAspect extends exstateMachineInputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = ex.stateMachine.StateMachineFactory.eINSTANCE.createStandardState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super_InputState__visitToAddClasses(theSlicer)
		_self.super_OutputState__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super_InputState__visitToAddRelations(theSlicer)
		_self.super_OutputState__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(ex.stateMachine.TerminalState), with=#[typeof(exstateMachineInputStateAspect)])
class exstateMachineTerminalStateAspect extends exstateMachineInputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = ex.stateMachine.StateMachineFactory.eINSTANCE.createTerminalState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

