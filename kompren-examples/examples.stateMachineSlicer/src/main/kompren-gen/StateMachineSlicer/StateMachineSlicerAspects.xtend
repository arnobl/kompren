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
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.List
import java.util.ArrayList
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

@Aspect(className=typeof(StateMachine))
class StateMachineAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(Transition))
class TransitionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactoryImpl.eINSTANCE.createTransition
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

@Aspect(className=typeof(State))
abstract class StateAspect extends __SlicerAspect__{
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

@Aspect(className=typeof(InputState))
abstract class InputStateAspect extends StateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(OutputState))
abstract class OutputStateAspect extends StateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^outgoingTransitions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^outgoingTransitions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as OutputState).^outgoingTransitions.add( _elt.clonedElt as Transition)
		]

	}
}

@Aspect(className=typeof(InitState))
class InitStateAspect extends OutputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactoryImpl.eINSTANCE.createInitState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(StandardState))
class StandardStateAspect extends InputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactoryImpl.eINSTANCE.createStandardState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(TerminalState))
class TerminalStateAspect extends InputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactoryImpl.eINSTANCE.createTerminalState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

