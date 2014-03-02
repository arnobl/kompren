package statemachineslicer

import ex.stateMachine.InitState
import ex.stateMachine.InputState
import ex.stateMachine.OutputState
import ex.stateMachine.StandardState
import ex.stateMachine.State
import ex.stateMachine.StateMachine
import ex.stateMachine.StateMachineFactory
import ex.stateMachine.TerminalState
import ex.stateMachine.Transition
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.emf.ecore.EObject

@Aspect(className=typeof(Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	protected var EObject clonedElt = null

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

@Aspect(className=typeof(StateMachine), with=#[typeof(__SlicerAspect__)])
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

@Aspect(className=typeof(Transition), with=#[typeof(__SlicerAspect__)])
class exstateMachineTransitionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactory.eINSTANCE.createTransition
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

		if(_self.sliced && _self.^source.sliced) (_self.clonedElt as Transition).^source = _self.^source.clonedElt as OutputState
		}
		if(_self.^target!=null){
		_self.^target.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^target.sliced) (_self.clonedElt as Transition).^target = _self.^target.clonedElt as InputState
		}

	}
}

@Aspect(className=typeof(State), with=#[typeof(__SlicerAspect__)])
abstract class exstateMachineStateAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as State).^name = _self.^name

	}
}

@Aspect(className=typeof(InputState), with=#[typeof(exstateMachineStateAspect)])
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

@Aspect(className=typeof(OutputState), with=#[typeof(exstateMachineStateAspect)])
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
			if(_self.sliced && _elt.sliced && _elt.clonedElt!=null) (_self.clonedElt as OutputState).^outgoingTransitions.add( _elt.clonedElt as Transition)
		]

	}
}

@Aspect(className=typeof(InitState), with=#[typeof(exstateMachineOutputStateAspect)])
class exstateMachineInitStateAspect extends exstateMachineOutputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactory.eINSTANCE.createInitState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(StandardState), with=#[typeof(exstateMachineInputStateAspect), typeof(exstateMachineOutputStateAspect)])
class exstateMachineStandardStateAspect extends exstateMachineInputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactory.eINSTANCE.createStandardState
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

@Aspect(className=typeof(TerminalState), with=#[typeof(exstateMachineInputStateAspect)])
class exstateMachineTerminalStateAspect extends exstateMachineInputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactory.eINSTANCE.createTerminalState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

