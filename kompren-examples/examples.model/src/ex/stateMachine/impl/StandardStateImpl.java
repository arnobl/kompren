/**
 */
package ex.stateMachine.impl;

import ex.stateMachine.InputState;
import ex.stateMachine.StandardState;
import ex.stateMachine.StateMachinePackage;
import ex.stateMachine.Transition;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ex.stateMachine.impl.StandardStateImpl#getIngoingTransitions <em>Ingoing Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardStateImpl extends OutputStateImpl implements StandardState {
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
	protected StandardStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.STANDARD_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIngoingTransitions() {
		if (ingoingTransitions == null) {
			ingoingTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, StateMachinePackage.STANDARD_STATE__INGOING_TRANSITIONS);
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
			case StateMachinePackage.STANDARD_STATE__INGOING_TRANSITIONS:
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
			case StateMachinePackage.STANDARD_STATE__INGOING_TRANSITIONS:
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
			case StateMachinePackage.STANDARD_STATE__INGOING_TRANSITIONS:
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
			case StateMachinePackage.STANDARD_STATE__INGOING_TRANSITIONS:
				return ingoingTransitions != null && !ingoingTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InputState.class) {
			switch (derivedFeatureID) {
				case StateMachinePackage.STANDARD_STATE__INGOING_TRANSITIONS: return StateMachinePackage.INPUT_STATE__INGOING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InputState.class) {
			switch (baseFeatureID) {
				case StateMachinePackage.INPUT_STATE__INGOING_TRANSITIONS: return StateMachinePackage.STANDARD_STATE__INGOING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StandardStateImpl
