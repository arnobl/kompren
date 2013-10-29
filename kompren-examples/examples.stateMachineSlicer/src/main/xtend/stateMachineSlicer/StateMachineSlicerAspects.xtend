package stateMachineSlicer
import ex.*
import ex.stateMachine.*
import ex.stateMachine.impl.*
import static extension stateMachineSlicer.__SlicerAspect__.*
import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
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

@Aspect(className=typeof(TerminalState))
class TerminalStateAspect extends InputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactoryImpl.eINSTANCE.createTerminalState as TerminalState
			theSlicer.objectCloned(_self.clonedElt)
		}
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
		_self.outgoingTransitions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.outgoingTransitions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as OutputState).outgoingTransitions.add( _elt.clonedElt as Transition)
		]

	}
}

@Aspect(className=typeof(Transition))
class TransitionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactoryImpl.eINSTANCE.createTransition as Transition
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.source?.visitToAddClasses(theSlicer)
		_self.target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.source.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.source.sliced) (_self.clonedElt as Transition).source = _self.source.clonedElt as OutputState
		_self.target.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.target.sliced) (_self.clonedElt as Transition).target = _self.target.clonedElt as InputState

	}
}

@Aspect(className=typeof(StandardState))
class StandardStateAspect extends OutputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactoryImpl.eINSTANCE.createStandardState as StandardState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(InitState))
class InitStateAspect extends OutputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = StateMachineFactoryImpl.eINSTANCE.createInitState as InitState
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

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

@Aspect(className=typeof(State))
abstract class StateAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
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


