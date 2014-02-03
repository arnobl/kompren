/**
 */
package kompren.impl;

import kompren.KomprenPackage;
import kompren.SlicedClass;
import kompren.VarDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sliced Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kompren.impl.SlicedClassImpl#getCtx <em>Ctx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlicedClassImpl extends SlicedElementImpl<EClass> implements SlicedClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Inria/IRISA Diverse Team";

	/**
	 * The cached value of the '{@link #getCtx() <em>Ctx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtx()
	 * @generated
	 * @ordered
	 */
	protected VarDecl ctx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KomprenPackage.Literals.SLICED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl getCtx() {
		return ctx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtx(VarDecl newCtx, NotificationChain msgs) {
		VarDecl oldCtx = ctx;
		ctx = newCtx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KomprenPackage.SLICED_CLASS__CTX, oldCtx, newCtx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtx(VarDecl newCtx) {
		if (newCtx != ctx) {
			NotificationChain msgs = null;
			if (ctx != null)
				msgs = ((InternalEObject)ctx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KomprenPackage.SLICED_CLASS__CTX, null, msgs);
			if (newCtx != null)
				msgs = ((InternalEObject)newCtx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KomprenPackage.SLICED_CLASS__CTX, null, msgs);
			msgs = basicSetCtx(newCtx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomprenPackage.SLICED_CLASS__CTX, newCtx, newCtx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setDomain(EClass newDomain) {
		super.setDomain(newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KomprenPackage.SLICED_CLASS__CTX:
				return basicSetCtx(null, msgs);
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
			case KomprenPackage.SLICED_CLASS__CTX:
				return getCtx();
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
			case KomprenPackage.SLICED_CLASS__CTX:
				setCtx((VarDecl)newValue);
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
			case KomprenPackage.SLICED_CLASS__CTX:
				setCtx((VarDecl)null);
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
			case KomprenPackage.SLICED_CLASS__CTX:
				return ctx != null;
		}
		return super.eIsSet(featureID);
	}

} //SlicedClassImpl
