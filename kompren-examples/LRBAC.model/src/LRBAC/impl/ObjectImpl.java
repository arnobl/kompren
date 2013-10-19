/**
 */
package LRBAC.impl;

import LRBAC.LRBACPackage;
import LRBAC.Location;
import LRBAC.Permission;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LRBAC.impl.ObjectImpl#getObjLoc <em>Obj Loc</em>}</li>
 *   <li>{@link LRBAC.impl.ObjectImpl#getObjPerm <em>Obj Perm</em>}</li>
 *   <li>{@link LRBAC.impl.ObjectImpl#getObjID <em>Obj ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements LRBAC.Object {
	/**
	 * The cached value of the '{@link #getObjLoc() <em>Obj Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjLoc()
	 * @generated
	 * @ordered
	 */
	protected Location objLoc;

	/**
	 * The cached value of the '{@link #getObjPerm() <em>Obj Perm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjPerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> objPerm;

	/**
	 * The default value of the '{@link #getObjID() <em>Obj ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjID()
	 * @generated
	 * @ordered
	 */
	protected static final int OBJ_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getObjID() <em>Obj ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjID()
	 * @generated
	 * @ordered
	 */
	protected int objID = OBJ_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LRBACPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getObjLoc() {
		if (objLoc != null && objLoc.eIsProxy()) {
			InternalEObject oldObjLoc = (InternalEObject)objLoc;
			objLoc = (Location)eResolveProxy(oldObjLoc);
			if (objLoc != oldObjLoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LRBACPackage.OBJECT__OBJ_LOC, oldObjLoc, objLoc));
			}
		}
		return objLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetObjLoc() {
		return objLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjLoc(Location newObjLoc, NotificationChain msgs) {
		Location oldObjLoc = objLoc;
		objLoc = newObjLoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LRBACPackage.OBJECT__OBJ_LOC, oldObjLoc, newObjLoc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjLoc(Location newObjLoc) {
		if (newObjLoc != objLoc) {
			NotificationChain msgs = null;
			if (objLoc != null)
				msgs = ((InternalEObject)objLoc).eInverseRemove(this, LRBACPackage.LOCATION__LOC_OBJ, Location.class, msgs);
			if (newObjLoc != null)
				msgs = ((InternalEObject)newObjLoc).eInverseAdd(this, LRBACPackage.LOCATION__LOC_OBJ, Location.class, msgs);
			msgs = basicSetObjLoc(newObjLoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.OBJECT__OBJ_LOC, newObjLoc, newObjLoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getObjPerm() {
		if (objPerm == null) {
			objPerm = new EObjectWithInverseResolvingEList<Permission>(Permission.class, this, LRBACPackage.OBJECT__OBJ_PERM, LRBACPackage.PERMISSION__PERM_OBJ);
		}
		return objPerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getObjID() {
		return objID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjID(int newObjID) {
		int oldObjID = objID;
		objID = newObjID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.OBJECT__OBJ_ID, oldObjID, objID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateObjID(int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LRBACPackage.OBJECT__OBJ_LOC:
				if (objLoc != null)
					msgs = ((InternalEObject)objLoc).eInverseRemove(this, LRBACPackage.LOCATION__LOC_OBJ, Location.class, msgs);
				return basicSetObjLoc((Location)otherEnd, msgs);
			case LRBACPackage.OBJECT__OBJ_PERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjPerm()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LRBACPackage.OBJECT__OBJ_LOC:
				return basicSetObjLoc(null, msgs);
			case LRBACPackage.OBJECT__OBJ_PERM:
				return ((InternalEList<?>)getObjPerm()).basicRemove(otherEnd, msgs);
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
			case LRBACPackage.OBJECT__OBJ_LOC:
				if (resolve) return getObjLoc();
				return basicGetObjLoc();
			case LRBACPackage.OBJECT__OBJ_PERM:
				return getObjPerm();
			case LRBACPackage.OBJECT__OBJ_ID:
				return getObjID();
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
			case LRBACPackage.OBJECT__OBJ_LOC:
				setObjLoc((Location)newValue);
				return;
			case LRBACPackage.OBJECT__OBJ_PERM:
				getObjPerm().clear();
				getObjPerm().addAll((Collection<? extends Permission>)newValue);
				return;
			case LRBACPackage.OBJECT__OBJ_ID:
				setObjID((Integer)newValue);
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
			case LRBACPackage.OBJECT__OBJ_LOC:
				setObjLoc((Location)null);
				return;
			case LRBACPackage.OBJECT__OBJ_PERM:
				getObjPerm().clear();
				return;
			case LRBACPackage.OBJECT__OBJ_ID:
				setObjID(OBJ_ID_EDEFAULT);
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
			case LRBACPackage.OBJECT__OBJ_LOC:
				return objLoc != null;
			case LRBACPackage.OBJECT__OBJ_PERM:
				return objPerm != null && !objPerm.isEmpty();
			case LRBACPackage.OBJECT__OBJ_ID:
				return objID != OBJ_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LRBACPackage.OBJECT___UPDATE_OBJ_ID__INT:
				UpdateObjID((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ObjID: ");
		result.append(objID);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
