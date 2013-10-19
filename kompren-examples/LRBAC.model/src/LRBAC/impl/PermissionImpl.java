/**
 */
package LRBAC.impl;

import LRBAC.LRBACPackage;
import LRBAC.Location;
import LRBAC.Operation;
import LRBAC.Permission;
import LRBAC.Role;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link LRBAC.impl.PermissionImpl#getPermOper <em>Perm Oper</em>}</li>
 *   <li>{@link LRBAC.impl.PermissionImpl#getPermName <em>Perm Name</em>}</li>
 *   <li>{@link LRBAC.impl.PermissionImpl#getPermObj <em>Perm Obj</em>}</li>
 *   <li>{@link LRBAC.impl.PermissionImpl#getPermRole <em>Perm Role</em>}</li>
 *   <li>{@link LRBAC.impl.PermissionImpl#getRoleLocPerm <em>Role Loc Perm</em>}</li>
 *   <li>{@link LRBAC.impl.PermissionImpl#getObjLocPerm <em>Obj Loc Perm</em>}</li>
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
	 * The default value of the '{@link #getPermName() <em>Perm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermName() <em>Perm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermName()
	 * @generated
	 * @ordered
	 */
	protected String permName = PERM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermObj() <em>Perm Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermObj()
	 * @generated
	 * @ordered
	 */
	protected LRBAC.Object permObj;

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
	public NotificationChain basicSetPermOper(Operation newPermOper, NotificationChain msgs) {
		Operation oldPermOper = permOper;
		permOper = newPermOper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_OPER, oldPermOper, newPermOper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermOper(Operation newPermOper) {
		if (newPermOper != permOper) {
			NotificationChain msgs = null;
			if (permOper != null)
				msgs = ((InternalEObject)permOper).eInverseRemove(this, LRBACPackage.OPERATION__OPER_PERM, Operation.class, msgs);
			if (newPermOper != null)
				msgs = ((InternalEObject)newPermOper).eInverseAdd(this, LRBACPackage.OPERATION__OPER_PERM, Operation.class, msgs);
			msgs = basicSetPermOper(newPermOper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_OPER, newPermOper, newPermOper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermName() {
		return permName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermName(String newPermName) {
		String oldPermName = permName;
		permName = newPermName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_NAME, oldPermName, permName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRBAC.Object getPermObj() {
		if (permObj != null && permObj.eIsProxy()) {
			InternalEObject oldPermObj = (InternalEObject)permObj;
			permObj = (LRBAC.Object)eResolveProxy(oldPermObj);
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
	public LRBAC.Object basicGetPermObj() {
		return permObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermObj(LRBAC.Object newPermObj, NotificationChain msgs) {
		LRBAC.Object oldPermObj = permObj;
		permObj = newPermObj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_OBJ, oldPermObj, newPermObj);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermObj(LRBAC.Object newPermObj) {
		if (newPermObj != permObj) {
			NotificationChain msgs = null;
			if (permObj != null)
				msgs = ((InternalEObject)permObj).eInverseRemove(this, LRBACPackage.OBJECT__OBJ_PERM, LRBAC.Object.class, msgs);
			if (newPermObj != null)
				msgs = ((InternalEObject)newPermObj).eInverseAdd(this, LRBACPackage.OBJECT__OBJ_PERM, LRBAC.Object.class, msgs);
			msgs = basicSetPermObj(newPermObj, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_OBJ, newPermObj, newPermObj));
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
	public NotificationChain basicSetPermRole(Role newPermRole, NotificationChain msgs) {
		Role oldPermRole = permRole;
		permRole = newPermRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_ROLE, oldPermRole, newPermRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermRole(Role newPermRole) {
		if (newPermRole != permRole) {
			NotificationChain msgs = null;
			if (permRole != null)
				msgs = ((InternalEObject)permRole).eInverseRemove(this, LRBACPackage.ROLE__ROLE_PERM, Role.class, msgs);
			if (newPermRole != null)
				msgs = ((InternalEObject)newPermRole).eInverseAdd(this, LRBACPackage.ROLE__ROLE_PERM, Role.class, msgs);
			msgs = basicSetPermRole(newPermRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__PERM_ROLE, newPermRole, newPermRole));
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
	public NotificationChain basicSetRoleLocPerm(Location newRoleLocPerm, NotificationChain msgs) {
		Location oldRoleLocPerm = roleLocPerm;
		roleLocPerm = newRoleLocPerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__ROLE_LOC_PERM, oldRoleLocPerm, newRoleLocPerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleLocPerm(Location newRoleLocPerm) {
		if (newRoleLocPerm != roleLocPerm) {
			NotificationChain msgs = null;
			if (roleLocPerm != null)
				msgs = ((InternalEObject)roleLocPerm).eInverseRemove(this, LRBACPackage.LOCATION__PERM_ROLE_LOC, Location.class, msgs);
			if (newRoleLocPerm != null)
				msgs = ((InternalEObject)newRoleLocPerm).eInverseAdd(this, LRBACPackage.LOCATION__PERM_ROLE_LOC, Location.class, msgs);
			msgs = basicSetRoleLocPerm(newRoleLocPerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__ROLE_LOC_PERM, newRoleLocPerm, newRoleLocPerm));
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
	public NotificationChain basicSetObjLocPerm(Location newObjLocPerm, NotificationChain msgs) {
		Location oldObjLocPerm = objLocPerm;
		objLocPerm = newObjLocPerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__OBJ_LOC_PERM, oldObjLocPerm, newObjLocPerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjLocPerm(Location newObjLocPerm) {
		if (newObjLocPerm != objLocPerm) {
			NotificationChain msgs = null;
			if (objLocPerm != null)
				msgs = ((InternalEObject)objLocPerm).eInverseRemove(this, LRBACPackage.LOCATION__PERM_OBJ_LOC, Location.class, msgs);
			if (newObjLocPerm != null)
				msgs = ((InternalEObject)newObjLocPerm).eInverseAdd(this, LRBACPackage.LOCATION__PERM_OBJ_LOC, Location.class, msgs);
			msgs = basicSetObjLocPerm(newObjLocPerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.PERMISSION__OBJ_LOC_PERM, newObjLocPerm, newObjLocPerm));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LRBACPackage.PERMISSION__PERM_OPER:
				if (permOper != null)
					msgs = ((InternalEObject)permOper).eInverseRemove(this, LRBACPackage.OPERATION__OPER_PERM, Operation.class, msgs);
				return basicSetPermOper((Operation)otherEnd, msgs);
			case LRBACPackage.PERMISSION__PERM_OBJ:
				if (permObj != null)
					msgs = ((InternalEObject)permObj).eInverseRemove(this, LRBACPackage.OBJECT__OBJ_PERM, LRBAC.Object.class, msgs);
				return basicSetPermObj((LRBAC.Object)otherEnd, msgs);
			case LRBACPackage.PERMISSION__PERM_ROLE:
				if (permRole != null)
					msgs = ((InternalEObject)permRole).eInverseRemove(this, LRBACPackage.ROLE__ROLE_PERM, Role.class, msgs);
				return basicSetPermRole((Role)otherEnd, msgs);
			case LRBACPackage.PERMISSION__ROLE_LOC_PERM:
				if (roleLocPerm != null)
					msgs = ((InternalEObject)roleLocPerm).eInverseRemove(this, LRBACPackage.LOCATION__PERM_ROLE_LOC, Location.class, msgs);
				return basicSetRoleLocPerm((Location)otherEnd, msgs);
			case LRBACPackage.PERMISSION__OBJ_LOC_PERM:
				if (objLocPerm != null)
					msgs = ((InternalEObject)objLocPerm).eInverseRemove(this, LRBACPackage.LOCATION__PERM_OBJ_LOC, Location.class, msgs);
				return basicSetObjLocPerm((Location)otherEnd, msgs);
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
			case LRBACPackage.PERMISSION__PERM_OPER:
				return basicSetPermOper(null, msgs);
			case LRBACPackage.PERMISSION__PERM_OBJ:
				return basicSetPermObj(null, msgs);
			case LRBACPackage.PERMISSION__PERM_ROLE:
				return basicSetPermRole(null, msgs);
			case LRBACPackage.PERMISSION__ROLE_LOC_PERM:
				return basicSetRoleLocPerm(null, msgs);
			case LRBACPackage.PERMISSION__OBJ_LOC_PERM:
				return basicSetObjLocPerm(null, msgs);
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
			case LRBACPackage.PERMISSION__PERM_OPER:
				if (resolve) return getPermOper();
				return basicGetPermOper();
			case LRBACPackage.PERMISSION__PERM_NAME:
				return getPermName();
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
			case LRBACPackage.PERMISSION__PERM_NAME:
				setPermName((String)newValue);
				return;
			case LRBACPackage.PERMISSION__PERM_OBJ:
				setPermObj((LRBAC.Object)newValue);
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
			case LRBACPackage.PERMISSION__PERM_NAME:
				setPermName(PERM_NAME_EDEFAULT);
				return;
			case LRBACPackage.PERMISSION__PERM_OBJ:
				setPermObj((LRBAC.Object)null);
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
			case LRBACPackage.PERMISSION__PERM_NAME:
				return PERM_NAME_EDEFAULT == null ? permName != null : !PERM_NAME_EDEFAULT.equals(permName);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PermName: ");
		result.append(permName);
		result.append(')');
		return result.toString();
	}

} //PermissionImpl
