/**
 */
package ex.stateMachine.impl;

import ex.stateMachine.InputState;
import ex.stateMachine.StateMachinePackage;
import ex.stateMachine.Transition;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ex.stateMachine.impl.InputStateImpl#getIngoingTransitions <em>Ingoing Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InputStateImpl extends StateImpl implements InputState {
	/**
	 * The cached value of the '{@link #getIngoingTransitions() <em>Ingoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ingoingTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.INPUT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIngoingTransitions() {
		if (ingoingTransitions == null) {
			ingoingTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, StateMachinePackage.INPUT_STATE__INGOING_TRANSITIONS);
		}
		return ingoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.INPUT_STATE__INGOING_TRANSITIONS:
				return getIngoingTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateMachinePackage.INPUT_STATE__INGOING_TRANSITIONS:
				getIngoingTransitions().clear();
				getIngoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StateMachinePackage.INPUT_STATE__INGOING_TRANSITIONS:
				getIngoingTransitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StateMachinePackage.INPUT_STATE__INGOING_TRANSITIONS:
				return ingoingTransitions != null && !ingoingTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputStateImpl
