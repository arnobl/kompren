/**
 */
package LRBAC2.impl;

import LRBAC2.LRBACPackage;
import LRBAC2.Location;
import LRBAC2.Operation;
import LRBAC2.Permission;
import LRBAC2.Role;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LRBAC2.impl.PermissionImpl#getPermOper <em>Perm Oper</em>}</li>
 *   <li>{@link LRBAC2.impl.PermissionImpl#getPermObj <em>Perm Obj</em>}</li>
 *   <li>{@link LRBAC2.impl.PermissionImpl#getPermRole <em>Perm Role</em>}</li>
 *   <li>{@link LRBAC2.impl.PermissionImpl#getRoleLocPerm <em>Role Loc Perm</em>}</li>
 *   <li>{@link LRBAC2.impl.PermissionImpl#getObjLocPerm <em>Obj Loc Perm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PermissionImpl extends MinimalEObjectImpl.Container implements Permission {
	/**
	 * The cached value of the '{@link #getPermOper() <em>Perm Oper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermOper()
	 * @generated
	 * @ordered
	 */
	protected Operation permOper;

	/**
	 * The cached value of the '{@link #getPermObj() <em>Perm Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermObj()
	 * @generated
	 * @ordered
	 */
	protected LRBAC2.Object permObj;

	/**
	 * The cached value of the '{@link #getPermRole() <em>Perm Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermRole()
	 * @generated
	 * @ordered
	 */
	protected Role permRole;

	/**
	 * The cached value of the '{@link #getRoleLocPerm() <em>Role Loc Perm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleLocPerm()
	 * @generated
	 * @ordered
	 */
	protected Location roleLocPerm;

	/**
	 * The cached value of the '{@link #getObjLocPerm() <em>Obj Loc Perm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjLocPerm()
	 * @generated
	 * @ordered
	 */
	protected Location objLocPerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LRBACPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPermOper() {
		if (permOper != null && permOper.eIsProxy()) {
			InternalEObject oldPermOper = (InternalEObject)permOper;
			permOper = (Operation)eResolveProxy(oldPermOper);
			if (permOper != oldPermOper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LRBACPackage.PERMISSION__PERM_OPER, oldPermOper, permOper));
			}
		}
		return permOper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetPermOper() {
		return permOper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermOper(Operation newPermOper) {
		Operation oldPermOper = permOper;
		permOper = newPermOper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_OPER, oldPermOper, permOper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRBAC2.Object getPermObj() {
		if (permObj != null && permObj.eIsProxy()) {
			InternalEObject oldPermObj = (InternalEObject)permObj;
			permObj = (LRBAC2.Object)eResolveProxy(oldPermObj);
			if (permObj != oldPermObj) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LRBACPackage.PERMISSION__PERM_OBJ, oldPermObj, permObj));
			}
		}
		return permObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRBAC2.Object basicGetPermObj() {
		return permObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermObj(LRBAC2.Object newPermObj) {
		LRBAC2.Object oldPermObj = permObj;
		permObj = newPermObj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_OBJ, oldPermObj, permObj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getPermRole() {
		if (permRole != null && permRole.eIsProxy()) {
			InternalEObject oldPermRole = (InternalEObject)permRole;
			permRole = (Role)eResolveProxy(oldPermRole);
			if (permRole != oldPermRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LRBACPackage.PERMISSION__PERM_ROLE, oldPermRole, permRole));
			}
		}
		return permRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetPermRole() {
		return permRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermRole(Role newPermRole) {
		Role oldPermRole = permRole;
		permRole = newPermRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_ROLE, oldPermRole, permRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getRoleLocPerm() {
		if (roleLocPerm != null && roleLocPerm.eIsProxy()) {
			InternalEObject oldRoleLocPerm = (InternalEObject)roleLocPerm;
			roleLocPerm = (Location)eResolveProxy(oldRoleLocPerm);
			if (roleLocPerm != oldRoleLocPerm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LRBACPackage.PERMISSION__ROLE_LOC_PERM, oldRoleLocPerm, roleLocPerm));
			}
		}
		return roleLocPerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetRoleLocPerm() {
		return roleLocPerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleLocPerm(Location newRoleLocPerm) {
		Location oldRoleLocPerm = roleLocPerm;
		roleLocPerm = newRoleLocPerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__ROLE_LOC_PERM, oldRoleLocPerm, roleLocPerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getObjLocPerm() {
		if (objLocPerm != null && objLocPerm.eIsProxy()) {
			InternalEObject oldObjLocPerm = (InternalEObject)objLocPerm;
			objLocPerm = (Location)eResolveProxy(oldObjLocPerm);
			if (objLocPerm != oldObjLocPerm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LRBACPackage.PERMISSION__OBJ_LOC_PERM, oldObjLocPerm, objLocPerm));
			}
		}
		return objLocPerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetObjLocPerm() {
		return objLocPerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjLocPerm(Location newObjLocPerm) {
		Location oldObjLocPerm = objLocPerm;
		objLocPerm = newObjLocPerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__OBJ_LOC_PERM, oldObjLocPerm, objLocPerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdatePermName(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LRBACPackage.PERMISSION__PERM_OPER:
				if (resolve) return getPermOper();
				return basicGetPermOper();
			case LRBACPackage.PERMISSION__PERM_OBJ:
				if (resolve) return getPermObj();
				return basicGetPermObj();
			case LRBACPackage.PERMISSION__PERM_ROLE:
				if (resolve) return getPermRole();
				return basicGetPermRole();
			case LRBACPackage.PERMISSION__ROLE_LOC_PERM:
				if (resolve) return getRoleLocPerm();
				return basicGetRoleLocPerm();
			case LRBACPackage.PERMISSION__OBJ_LOC_PERM:
				if (resolve) return getObjLocPerm();
				return basicGetObjLocPerm();
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
			case LRBACPackage.PERMISSION__PERM_OPER:
				setPermOper((Operation)newValue);
				return;
			case LRBACPackage.PERMISSION__PERM_OBJ:
				setPermObj((LRBAC2.Object)newValue);
				return;
			case LRBACPackage.PERMISSION__PERM_ROLE:
				setPermRole((Role)newValue);
				return;
			case LRBACPackage.PERMISSION__ROLE_LOC_PERM:
				setRoleLocPerm((Location)newValue);
				return;
			case LRBACPackage.PERMISSION__OBJ_LOC_PERM:
				setObjLocPerm((Location)newValue);
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
			case LRBACPackage.PERMISSION__PERM_OPER:
				setPermOper((Operation)null);
				return;
			case LRBACPackage.PERMISSION__PERM_OBJ:
				setPermObj((LRBAC2.Object)null);
				return;
			case LRBACPackage.PERMISSION__PERM_ROLE:
				setPermRole((Role)null);
				return;
			case LRBACPackage.PERMISSION__ROLE_LOC_PERM:
				setRoleLocPerm((Location)null);
				return;
			case LRBACPackage.PERMISSION__OBJ_LOC_PERM:
				setObjLocPerm((Location)null);
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
			case LRBACPackage.PERMISSION__PERM_OPER:
				return permOper != null;
			case LRBACPackage.PERMISSION__PERM_OBJ:
				return permObj != null;
			case LRBACPackage.PERMISSION__PERM_ROLE:
				return permRole != null;
			case LRBACPackage.PERMISSION__ROLE_LOC_PERM:
				return roleLocPerm != null;
			case LRBACPackage.PERMISSION__OBJ_LOC_PERM:
				return objLocPerm != null;
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
			case LRBACPackage.PERMISSION___UPDATE_PERM_NAME__STRING:
				UpdatePermName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PermissionImpl
