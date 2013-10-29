package stateMachineSlicer
import ex.*
import ex.stateMachine.*
import static extension stateMachineSlicer.__SlicerAspect__.*
import java.util.List

class StateMachineSlicer{
	val List<State> inputState

	new(List<State> inputState){
		this.inputState = inputState
	}

	def void slice(){
		inputState.forEach[visitToAddClasses(this)]
		inputState.forEach[visitToAddRelations(this)]
	}

}

