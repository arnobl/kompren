/**
 */
package ex.stateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ex.stateMachine.InputState#getIngoingTransitions <em>Ingoing Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ex.stateMachine.StateMachinePackage#getInputState()
 * @model abstract="true"
 * @generated
 */
public interface InputState extends State {
	/**
	 * Returns the value of the '<em><b>Ingoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link ex.stateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingoing Transitions</em>' reference list.
	 * @see ex.stateMachine.StateMachinePackage#getInputState_IngoingTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getIngoingTransitions();

} // InputState
