/**
 */
package LRBAC.impl;

import LRBAC.LRBACPackage;
import LRBAC.Location;
import LRBAC.Permission;
import LRBAC.Role;
import LRBAC.Session;
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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LRBAC.impl.RoleImpl#getAssignUser <em>Assign User</em>}</li>
 *   <li>{@link LRBAC.impl.RoleImpl#getAssignLoc <em>Assign Loc</em>}</li>
 *   <li>{@link LRBAC.impl.RoleImpl#getRoleSess <em>Role Sess</em>}</li>
 *   <li>{@link LRBAC.impl.RoleImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link LRBAC.impl.RoleImpl#getRolePerm <em>Role Perm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role {
	/**
	 * The cached value of the '{@link #getAssignUser() <em>Assign User</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> assignUser;

	/**
	 * The cached value of the '{@link #getAssignLoc() <em>Assign Loc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignLoc()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> assignLoc;

	/**
	 * The cached value of the '{@link #getRoleSess() <em>Role Sess</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSess()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> roleSess;

	/**
	 * The default value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected String roleName = ROLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRolePerm() <em>Role Perm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> rolePerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LRBACPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getAssignUser() {
		if (assignUser == null) {
			assignUser = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, LRBACPackage.ROLE__ASSIGN_USER, LRBACPackage.USER__ASSIGNED_ROLES);
		}
		return assignUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getAssignLoc() {
		if (assignLoc == null) {
			assignLoc = new EObjectWithInverseResolvingEList.ManyInverse<Location>(Location.class, this, LRBACPackage.ROLE__ASSIGN_LOC, LRBACPackage.LOCATION__LOC_ASSIGN);
		}
		return assignLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getRoleSess() {
		if (roleSess == null) {
			roleSess = new EObjectWithInverseResolvingEList.ManyInverse<Session>(Session.class, this, LRBACPackage.ROLE__ROLE_SESS, LRBACPackage.SESSION__SESS_ROLE);
		}
		return roleSess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(String newRoleName) {
		String oldRoleName = roleName;
		roleName = newRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.ROLE__ROLE_NAME, oldRoleName, roleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getRolePerm() {
		if (rolePerm == null) {
			rolePerm = new EObjectWithInverseResolvingEList<Permission>(Permission.class, this, LRBACPackage.ROLE__ROLE_PERM, LRBACPackage.PERMISSION__PERM_ROLE);
		}
		return rolePerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateRoleName(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AddAssignLoc(Location l) {
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
			case LRBACPackage.ROLE__ASSIGN_USER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignUser()).basicAdd(otherEnd, msgs);
			case LRBACPackage.ROLE__ASSIGN_LOC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignLoc()).basicAdd(otherEnd, msgs);
			case LRBACPackage.ROLE__ROLE_SESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleSess()).basicAdd(otherEnd, msgs);
			case LRBACPackage.ROLE__ROLE_PERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRolePerm()).basicAdd(otherEnd, msgs);
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
			case LRBACPackage.ROLE__ASSIGN_USER:
				return ((InternalEList<?>)getAssignUser()).basicRemove(otherEnd, msgs);
			case LRBACPackage.ROLE__ASSIGN_LOC:
				return ((InternalEList<?>)getAssignLoc()).basicRemove(otherEnd, msgs);
			case LRBACPackage.ROLE__ROLE_SESS:
				return ((InternalEList<?>)getRoleSess()).basicRemove(otherEnd, msgs);
			case LRBACPackage.ROLE__ROLE_PERM:
				return ((InternalEList<?>)getRolePerm()).basicRemove(otherEnd, msgs);
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
			case LRBACPackage.ROLE__ASSIGN_USER:
				return getAssignUser();
			case LRBACPackage.ROLE__ASSIGN_LOC:
				return getAssignLoc();
			case LRBACPackage.ROLE__ROLE_SESS:
				return getRoleSess();
			case LRBACPackage.ROLE__ROLE_NAME:
				return getRoleName();
			case LRBACPackage.ROLE__ROLE_PERM:
				return getRolePerm();
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
			case LRBACPackage.ROLE__ASSIGN_USER:
				getAssignUser().clear();
				getAssignUser().addAll((Collection<? extends User>)newValue);
				return;
			case LRBACPackage.ROLE__ASSIGN_LOC:
				getAssignLoc().clear();
				getAssignLoc().addAll((Collection<? extends Location>)newValue);
				return;
			case LRBACPackage.ROLE__ROLE_SESS:
				getRoleSess().clear();
				getRoleSess().addAll((Collection<? extends Session>)newValue);
				return;
			case LRBACPackage.ROLE__ROLE_NAME:
				setRoleName((String)newValue);
				return;
			case LRBACPackage.ROLE__ROLE_PERM:
				getRolePerm().clear();
				getRolePerm().addAll((Collection<? extends Permission>)newValue);
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
			case LRBACPackage.ROLE__ASSIGN_USER:
				getAssignUser().clear();
				return;
			case LRBACPackage.ROLE__ASSIGN_LOC:
				getAssignLoc().clear();
				return;
			case LRBACPackage.ROLE__ROLE_SESS:
				getRoleSess().clear();
				return;
			case LRBACPackage.ROLE__ROLE_NAME:
				setRoleName(ROLE_NAME_EDEFAULT);
				return;
			case LRBACPackage.ROLE__ROLE_PERM:
				getRolePerm().clear();
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
			case LRBACPackage.ROLE__ASSIGN_USER:
				return assignUser != null && !assignUser.isEmpty();
			case LRBACPackage.ROLE__ASSIGN_LOC:
				return assignLoc != null && !assignLoc.isEmpty();
			case LRBACPackage.ROLE__ROLE_SESS:
				return roleSess != null && !roleSess.isEmpty();
			case LRBACPackage.ROLE__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
			case LRBACPackage.ROLE__ROLE_PERM:
				return rolePerm != null && !rolePerm.isEmpty();
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
			case LRBACPackage.ROLE___UPDATE_ROLE_NAME__STRING:
				UpdateRoleName((String)arguments.get(0));
				return null;
			case LRBACPackage.ROLE___ADD_ASSIGN_LOC__LOCATION:
				AddAssignLoc((Location)arguments.get(0));
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
		result.append(" (RoleName: ");
		result.append(roleName);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
