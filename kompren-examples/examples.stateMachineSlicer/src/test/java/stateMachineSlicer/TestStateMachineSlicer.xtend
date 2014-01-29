package stateMachineSlicer

import ex.stateMachine.State
import ex.stateMachine.StateMachine
import ex.stateMachine.impl.StateMachineFactoryImpl
import java.util.ArrayList
import java.util.List
import org.junit.Test

class TestStateMachineSlicer {
	@Test def testSlicer() {
		val List<State> inputs = new  ArrayList
		val model = createModel(inputs)
		inputs.add(model.initState)
		val slicer = new StateMachineSlicer(inputs)
		slicer.slice
//		assertEquals("c3 c2 c1 c5 c4 c2 c1 c3 c2 c4 c3 c5 c4 ", slicer.buf.toString)
	}

	def static StateMachine createModel(List<State> inputs) {
		val result = StateMachineFactoryImpl.eINSTANCE.createStateMachine
		val s1 = StateMachineFactoryImpl.eINSTANCE.createInitState
		val s2 = StateMachineFactoryImpl.eINSTANCE.createStandardState
		val s3 = StateMachineFactoryImpl.eINSTANCE.createStandardState
		val s4 = StateMachineFactoryImpl.eINSTANCE.createStandardState
		val s5 = StateMachineFactoryImpl.eINSTANCE.createTerminalState
		val t12 = StateMachineFactoryImpl.eINSTANCE.createTransition
		val t23 = StateMachineFactoryImpl.eINSTANCE.createTransition
		val t33 = StateMachineFactoryImpl.eINSTANCE.createTransition
		val t34 = StateMachineFactoryImpl.eINSTANCE.createTransition
		val t43 = StateMachineFactoryImpl.eINSTANCE.createTransition
		val t45 = StateMachineFactoryImpl.eINSTANCE.createTransition
		
		s1.name = "s1"
		s2.name = "s2"
		s3.name = "s3"
		s4.name = "s4"
		s5.name = "s5"
		s1.outgoingTransitions+=t12
		s2.outgoingTransitions+=t23
		s3.outgoingTransitions+=t33
		s3.outgoingTransitions+=t34
		s4.outgoingTransitions+=t45
		s4.outgoingTransitions+=t43
		t12.source = s1
		t12.target = s2
		t23.source = s2
		t23.target = s3
		t33.source = s3
		t33.target = s3
		t34.source = s3
		t34.target = s4
		t43.source = s4
		t43.target = s3
		t45.source = s4
		t45.target = s5
		result.initState = s1
		result.states+=s1
		result.states+=s2
		result.states+=s3
		result.states+=s4
		result.states+=s5
		result.transitions+=t12
		result.transitions+=t23
		result.transitions+=t33
		result.transitions+=t34
		result.transitions+=t43
		result.transitions+=t45
		
		return result
	}
}