package stateMachineSlicer
import ex.*
import ex.stateMachine.*
import static extension stateMachineSlicer.__SlicerAspect__.*
import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import java.util.List
import java.util.ArrayList

@Aspect(className=typeof(Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false

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
		_self.super__visitToAddClasses(theSlicer)
		
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		
	}
}

@Aspect(className=typeof(State))
class StateAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		
	}
}

@Aspect(className=typeof(InputState))
class InputStateAspect extends StateAspect{
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
class OutputStateAspect extends StateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.outgoingTransitions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.outgoingTransitions.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(InitState))
class InitStateAspect extends OutputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		
	}
}

@Aspect(className=typeof(StandardState))
class StandardStateAspect extends OutputStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StateMachineSlicer theSlicer){
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
		_self.super__visitToAddClasses(theSlicer)
		
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StateMachineSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		
	}
}


