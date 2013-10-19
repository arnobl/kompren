/**
 */
package LRBAC.impl;

import LRBAC.LRBACPackage;
import LRBAC.Location;
import LRBAC.Permission;
import LRBAC.Role;
import LRBAC.User;

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
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LRBAC.impl.LocationImpl#getLocUser <em>Loc User</em>}</li>
 *   <li>{@link LRBAC.impl.LocationImpl#getLocAssign <em>Loc Assign</em>}</li>
 *   <li>{@link LRBAC.impl.LocationImpl#getLocName <em>Loc Name</em>}</li>
 *   <li>{@link LRBAC.impl.LocationImpl#getLocObj <em>Loc Obj</em>}</li>
 *   <li>{@link LRBAC.impl.LocationImpl#getPermRoleLoc <em>Perm Role Loc</em>}</li>
 *   <li>{@link LRBAC.impl.LocationImpl#getPermObjLoc <em>Perm Obj Loc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The cached value of the '{@link #getLocUser() <em>Loc User</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> locUser;

	/**
	 * The cached value of the '{@link #getLocAssign() <em>Loc Assign</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocAssign()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> locAssign;

	/**
	 * The default value of the '{@link #getLocName() <em>Loc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocName() <em>Loc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocName()
	 * @generated
	 * @ordered
	 */
	protected String locName = LOC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocObj() <em>Loc Obj</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocObj()
	 * @generated
	 * @ordered
	 */
	protected EList<LRBAC.Object> locObj;

	/**
	 * The cached value of the '{@link #getPermRoleLoc() <em>Perm Role Loc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermRoleLoc()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permRoleLoc;

	/**
	 * The cached value of the '{@link #getPermObjLoc() <em>Perm Obj Loc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermObjLoc()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permObjLoc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LRBACPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getLocUser() {
		if (locUser == null) {
			locUser = new EObjectWithInverseResolvingEList<User>(User.class, this, LRBACPackage.LOCATION__LOC_USER, LRBACPackage.USER__USER_LOC);
		}
		return locUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getLocAssign() {
		if (locAssign == null) {
			locAssign = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, LRBACPackage.LOCATION__LOC_ASSIGN, LRBACPackage.ROLE__ASSIGN_LOC);
		}
		return locAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocName() {
		return locName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocName(String newLocName) {
		String oldLocName = locName;
		locName = newLocName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.LOCATION__LOC_NAME, oldLocName, locName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LRBAC.Object> getLocObj() {
		if (locObj == null) {
			locObj = new EObjectWithInverseResolvingEList<LRBAC.Object>(LRBAC.Object.class, this, LRBACPackage.LOCATION__LOC_OBJ, LRBACPackage.OBJECT__OBJ_LOC);
		}
		return locObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermRoleLoc() {
		if (permRoleLoc == null) {
			permRoleLoc = new EObjectWithInverseResolvingEList<Permission>(Permission.class, this, LRBACPackage.LOCATION__PERM_ROLE_LOC, LRBACPackage.PERMISSION__ROLE_LOC_PERM);
		}
		return permRoleLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermObjLoc() {
		if (permObjLoc == null) {
			permObjLoc = new EObjectWithInverseResolvingEList<Permission>(Permission.class, this, LRBACPackage.LOCATION__PERM_OBJ_LOC, LRBACPackage.PERMISSION__OBJ_LOC_PERM);
		}
		return permObjLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateLocName(String name) {
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
			case LRBACPackage.LOCATION__LOC_USER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocUser()).basicAdd(otherEnd, msgs);
			case LRBACPackage.LOCATION__LOC_ASSIGN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocAssign()).basicAdd(otherEnd, msgs);
			case LRBACPackage.LOCATION__LOC_OBJ:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocObj()).basicAdd(otherEnd, msgs);
			case LRBACPackage.LOCATION__PERM_ROLE_LOC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPermRoleLoc()).basicAdd(otherEnd, msgs);
			case LRBACPackage.LOCATION__PERM_OBJ_LOC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPermObjLoc()).basicAdd(otherEnd, msgs);
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
			case LRBACPackage.LOCATION__LOC_USER:
				return ((InternalEList<?>)getLocUser()).basicRemove(otherEnd, msgs);
			case LRBACPackage.LOCATION__LOC_ASSIGN:
				return ((InternalEList<?>)getLocAssign()).basicRemove(otherEnd, msgs);
			case LRBACPackage.LOCATION__LOC_OBJ:
				return ((InternalEList<?>)getLocObj()).basicRemove(otherEnd, msgs);
			case LRBACPackage.LOCATION__PERM_ROLE_LOC:
				return ((InternalEList<?>)getPermRoleLoc()).basicRemove(otherEnd, msgs);
			case LRBACPackage.LOCATION__PERM_OBJ_LOC:
				return ((InternalEList<?>)getPermObjLoc()).basicRemove(otherEnd, msgs);
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
			case LRBACPackage.LOCATION__LOC_USER:
				return getLocUser();
			case LRBACPackage.LOCATION__LOC_ASSIGN:
				return getLocAssign();
			case LRBACPackage.LOCATION__LOC_NAME:
				return getLocName();
			case LRBACPackage.LOCATION__LOC_OBJ:
				return getLocObj();
			case LRBACPackage.LOCATION__PERM_ROLE_LOC:
				return getPermRoleLoc();
			case LRBACPackage.LOCATION__PERM_OBJ_LOC:
				return getPermObjLoc();
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
			case LRBACPackage.LOCATION__LOC_USER:
				getLocUser().clear();
				getLocUser().addAll((Collection<? extends User>)newValue);
				return;
			case LRBACPackage.LOCATION__LOC_ASSIGN:
				getLocAssign().clear();
				getLocAssign().addAll((Collection<? extends Role>)newValue);
				return;
			case LRBACPackage.LOCATION__LOC_NAME:
				setLocName((String)newValue);
				return;
			case LRBACPackage.LOCATION__LOC_OBJ:
				getLocObj().clear();
				getLocObj().addAll((Collection<? extends LRBAC.Object>)newValue);
				return;
			case LRBACPackage.LOCATION__PERM_ROLE_LOC:
				getPermRoleLoc().clear();
				getPermRoleLoc().addAll((Collection<? extends Permission>)newValue);
				return;
			case LRBACPackage.LOCATION__PERM_OBJ_LOC:
				getPermObjLoc().clear();
				getPermObjLoc().addAll((Collection<? extends Permission>)newValue);
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
			case LRBACPackage.LOCATION__LOC_USER:
				getLocUser().clear();
				return;
			case LRBACPackage.LOCATION__LOC_ASSIGN:
				getLocAssign().clear();
				return;
			case LRBACPackage.LOCATION__LOC_NAME:
				setLocName(LOC_NAME_EDEFAULT);
				return;
			case LRBACPackage.LOCATION__LOC_OBJ:
				getLocObj().clear();
				return;
			case LRBACPackage.LOCATION__PERM_ROLE_LOC:
				getPermRoleLoc().clear();
				return;
			case LRBACPackage.LOCATION__PERM_OBJ_LOC:
				getPermObjLoc().clear();
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
			case LRBACPackage.LOCATION__LOC_USER:
				return locUser != null && !locUser.isEmpty();
			case LRBACPackage.LOCATION__LOC_ASSIGN:
				return locAssign != null && !locAssign.isEmpty();
			case LRBACPackage.LOCATION__LOC_NAME:
				return LOC_NAME_EDEFAULT == null ? locName != null : !LOC_NAME_EDEFAULT.equals(locName);
			case LRBACPackage.LOCATION__LOC_OBJ:
				return locObj != null && !locObj.isEmpty();
			case LRBACPackage.LOCATION__PERM_ROLE_LOC:
				return permRoleLoc != null && !permRoleLoc.isEmpty();
			case LRBACPackage.LOCATION__PERM_OBJ_LOC:
				return permObjLoc != null && !permObjLoc.isEmpty();
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
			case LRBACPackage.LOCATION___UPDATE_LOC_NAME__STRING:
				UpdateLocName((String)arguments.get(0));
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
		result.append(" (LocName: ");
		result.append(locName);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
