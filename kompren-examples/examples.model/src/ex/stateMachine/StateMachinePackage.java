/**
 */
package ex.stateMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ex.stateMachine.StateMachineFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stateMachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "htpp://pruning.org/SM.stateMachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stateMachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachinePackage eINSTANCE = ex.stateMachine.impl.StateMachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link ex.stateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.stateMachine.impl.StateMachineImpl
	 * @see ex.stateMachine.impl.StateMachinePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INIT_STATE = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = 2;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ex.stateMachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.stateMachine.impl.TransitionImpl
	 * @see ex.stateMachine.impl.StateMachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ex.stateMachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.stateMachine.impl.StateImpl
	 * @see ex.stateMachine.impl.StateMachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ex.stateMachine.impl.InputStateImpl <em>Input State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.stateMachine.impl.InputStateImpl
	 * @see ex.stateMachine.impl.StateMachinePackageImpl#getInputState()
	 * @generated
	 */
	int INPUT_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Ingoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STATE__INGOING_TRANSITIONS = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ex.stateMachine.impl.OutputStateImpl <em>Output State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.stateMachine.impl.OutputStateImpl
	 * @see ex.stateMachine.impl.StateMachinePackageImpl#getOutputState()
	 * @generated
	 */
	int OUTPUT_STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STATE__OUTGOING_TRANSITIONS = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ex.stateMachine.impl.InitStateImpl <em>Init State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.stateMachine.impl.InitStateImpl
	 * @see ex.stateMachine.impl.StateMachinePackageImpl#getInitState()
	 * @generated
	 */
	int INIT_STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__NAME = OUTPUT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE__OUTGOING_TRANSITIONS = OUTPUT_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Init State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE_FEATURE_COUNT = OUTPUT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Init State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_STATE_OPERATION_COUNT = OUTPUT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ex.stateMachine.impl.StandardStateImpl <em>Standard State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.stateMachine.impl.StandardStateImpl
	 * @see ex.stateMachine.impl.StateMachinePackageImpl#getStandardState()
	 * @generated
	 */
	int STANDARD_STATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STATE__NAME = INPUT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Ingoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STATE__INGOING_TRANSITIONS = INPUT_STATE__INGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STATE__OUTGOING_TRANSITIONS = INPUT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STATE_FEATURE_COUNT = INPUT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Standard State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STATE_OPERATION_COUNT = INPUT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ex.stateMachine.impl.TerminalStateImpl <em>Terminal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.stateMachine.impl.TerminalStateImpl
	 * @see ex.stateMachine.impl.StateMachinePackageImpl#getTerminalState()
	 * @generated
	 */
	int TERMINAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE__NAME = INPUT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Ingoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE__INGOING_TRANSITIONS = INPUT_STATE__INGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Terminal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE_FEATURE_COUNT = INPUT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE_OPERATION_COUNT = INPUT_STATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ex.stateMachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see ex.stateMachine.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the reference '{@link ex.stateMachine.StateMachine#getInitState <em>Init State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init State</em>'.
	 * @see ex.stateMachine.StateMachine#getInitState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_InitState();

	/**
	 * Returns the meta object for the containment reference list '{@link ex.stateMachine.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see ex.stateMachine.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link ex.stateMachine.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ex.stateMachine.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions();

	/**
	 * Returns the meta object for class '{@link ex.stateMachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ex.stateMachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link ex.stateMachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ex.stateMachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link ex.stateMachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ex.stateMachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link ex.stateMachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see ex.stateMachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link ex.stateMachine.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ex.stateMachine.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link ex.stateMachine.InputState <em>Input State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input State</em>'.
	 * @see ex.stateMachine.InputState
	 * @generated
	 */
	EClass getInputState();

	/**
	 * Returns the meta object for the reference list '{@link ex.stateMachine.InputState#getIngoingTransitions <em>Ingoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ingoing Transitions</em>'.
	 * @see ex.stateMachine.InputState#getIngoingTransitions()
	 * @see #getInputState()
	 * @generated
	 */
	EReference getInputState_IngoingTransitions();

	/**
	 * Returns the meta object for class '{@link ex.stateMachine.OutputState <em>Output State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output State</em>'.
	 * @see ex.stateMachine.OutputState
	 * @generated
	 */
	EClass getOutputState();

	/**
	 * Returns the meta object for the reference list '{@link ex.stateMachine.OutputState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see ex.stateMachine.OutputState#getOutgoingTransitions()
	 * @see #getOutputState()
	 * @generated
	 */
	EReference getOutputState_OutgoingTransitions();

	/**
	 * Returns the meta object for class '{@link ex.stateMachine.InitState <em>Init State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init State</em>'.
	 * @see ex.stateMachine.InitState
	 * @generated
	 */
	EClass getInitState();

	/**
	 * Returns the meta object for class '{@link ex.stateMachine.StandardState <em>Standard State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard State</em>'.
	 * @see ex.stateMachine.StandardState
	 * @generated
	 */
	EClass getStandardState();

	/**
	 * Returns the meta object for class '{@link ex.stateMachine.TerminalState <em>Terminal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal State</em>'.
	 * @see ex.stateMachine.TerminalState
	 * @generated
	 */
	EClass getTerminalState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachineFactory getStateMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ex.stateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.stateMachine.impl.StateMachineImpl
		 * @see ex.stateMachine.impl.StateMachinePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Init State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__INIT_STATE = eINSTANCE.getStateMachine_InitState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '{@link ex.stateMachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.stateMachine.impl.TransitionImpl
		 * @see ex.stateMachine.impl.StateMachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link ex.stateMachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.stateMachine.impl.StateImpl
		 * @see ex.stateMachine.impl.StateMachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link ex.stateMachine.impl.InputStateImpl <em>Input State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.stateMachine.impl.InputStateImpl
		 * @see ex.stateMachine.impl.StateMachinePackageImpl#getInputState()
		 * @generated
		 */
		EClass INPUT_STATE = eINSTANCE.getInputState();

		/**
		 * The meta object literal for the '<em><b>Ingoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_STATE__INGOING_TRANSITIONS = eINSTANCE.getInputState_IngoingTransitions();

		/**
		 * The meta object literal for the '{@link ex.stateMachine.impl.OutputStateImpl <em>Output State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.stateMachine.impl.OutputStateImpl
		 * @see ex.stateMachine.impl.StateMachinePackageImpl#getOutputState()
		 * @generated
		 */
		EClass OUTPUT_STATE = eINSTANCE.getOutputState();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_STATE__OUTGOING_TRANSITIONS = eINSTANCE.getOutputState_OutgoingTransitions();

		/**
		 * The meta object literal for the '{@link ex.stateMachine.impl.InitStateImpl <em>Init State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.stateMachine.impl.InitStateImpl
		 * @see ex.stateMachine.impl.StateMachinePackageImpl#getInitState()
		 * @generated
		 */
		EClass INIT_STATE = eINSTANCE.getInitState();

		/**
		 * The meta object literal for the '{@link ex.stateMachine.impl.StandardStateImpl <em>Standard State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.stateMachine.impl.StandardStateImpl
		 * @see ex.stateMachine.impl.StateMachinePackageImpl#getStandardState()
		 * @generated
		 */
		EClass STANDARD_STATE = eINSTANCE.getStandardState();

		/**
		 * The meta object literal for the '{@link ex.stateMachine.impl.TerminalStateImpl <em>Terminal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.stateMachine.impl.TerminalStateImpl
		 * @see ex.stateMachine.impl.StateMachinePackageImpl#getTerminalState()
		 * @generated
		 */
		EClass TERMINAL_STATE = eINSTANCE.getTerminalState();

	}

} //StateMachinePackage
