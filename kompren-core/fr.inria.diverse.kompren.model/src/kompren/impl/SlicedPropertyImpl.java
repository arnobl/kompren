/**
 */
package kompren.impl;

import kompren.KomprenPackage;
import kompren.OppositeCreation;
import kompren.SlicedProperty;
import kompren.VarDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sliced Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kompren.impl.SlicedPropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kompren.impl.SlicedPropertyImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link kompren.impl.SlicedPropertyImpl#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlicedPropertyImpl extends SlicedElementImpl<EStructuralFeature> implements SlicedProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Inria/IRISA Diverse Team";

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected OppositeCreation opposite;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected VarDecl src;

	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected VarDecl tgt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicedPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KomprenPackage.Literals.SLICED_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setDomain(EStructuralFeature newDomain) {
		super.setDomain(newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositeCreation getOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpposite(OppositeCreation newOpposite, NotificationChain msgs) {
		OppositeCreation oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KomprenPackage.SLICED_PROPERTY__OPPOSITE, oldOpposite, newOpposite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(OppositeCreation newOpposite) {
		if (newOpposite != opposite) {
			NotificationChain msgs = null;
			if (opposite != null)
				msgs = ((InternalEObject)opposite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KomprenPackage.SLICED_PROPERTY__OPPOSITE, null, msgs);
			if (newOpposite != null)
				msgs = ((InternalEObject)newOpposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KomprenPackage.SLICED_PROPERTY__OPPOSITE, null, msgs);
			msgs = basicSetOpposite(newOpposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomprenPackage.SLICED_PROPERTY__OPPOSITE, newOpposite, newOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(VarDecl newSrc, NotificationChain msgs) {
		VarDecl oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KomprenPackage.SLICED_PROPERTY__SRC, oldSrc, newSrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(VarDecl newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KomprenPackage.SLICED_PROPERTY__SRC, null, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KomprenPackage.SLICED_PROPERTY__SRC, null, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomprenPackage.SLICED_PROPERTY__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl getTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(VarDecl newTgt, NotificationChain msgs) {
		VarDecl oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KomprenPackage.SLICED_PROPERTY__TGT, oldTgt, newTgt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgt(VarDecl newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject)tgt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KomprenPackage.SLICED_PROPERTY__TGT, null, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject)newTgt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KomprenPackage.SLICED_PROPERTY__TGT, null, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomprenPackage.SLICED_PROPERTY__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KomprenPackage.SLICED_PROPERTY__OPPOSITE:
				return basicSetOpposite(null, msgs);
			case KomprenPackage.SLICED_PROPERTY__SRC:
				return basicSetSrc(null, msgs);
			case KomprenPackage.SLICED_PROPERTY__TGT:
				return basicSetTgt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KomprenPackage.SLICED_PROPERTY__OPPOSITE:
				return getOpposite();
			case KomprenPackage.SLICED_PROPERTY__SRC:
				return getSrc();
			case KomprenPackage.SLICED_PROPERTY__TGT:
				return getTgt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KomprenPackage.SLICED_PROPERTY__OPPOSITE:
				setOpposite((OppositeCreation)newValue);
				return;
			case KomprenPackage.SLICED_PROPERTY__SRC:
				setSrc((VarDecl)newValue);
				return;
			case KomprenPackage.SLICED_PROPERTY__TGT:
				setTgt((VarDecl)newValue);
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
			case KomprenPackage.SLICED_PROPERTY__OPPOSITE:
				setOpposite((OppositeCreation)null);
				return;
			case KomprenPackage.SLICED_PROPERTY__SRC:
				setSrc((VarDecl)null);
				return;
			case KomprenPackage.SLICED_PROPERTY__TGT:
				setTgt((VarDecl)null);
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
			case KomprenPackage.SLICED_PROPERTY__OPPOSITE:
				return opposite != null;
			case KomprenPackage.SLICED_PROPERTY__SRC:
				return src != null;
			case KomprenPackage.SLICED_PROPERTY__TGT:
				return tgt != null;
		}
		return super.eIsSet(featureID);
	}

} //SlicedPropertyImpl
