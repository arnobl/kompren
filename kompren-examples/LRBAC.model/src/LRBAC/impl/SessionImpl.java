/**
 */
package LRBAC.impl;

import LRBAC.LRBACPackage;
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
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LRBAC.impl.SessionImpl#getSessRole <em>Sess Role</em>}</li>
 *   <li>{@link LRBAC.impl.SessionImpl#getSessUser <em>Sess User</em>}</li>
 *   <li>{@link LRBAC.impl.SessionImpl#getMaxRoles <em>Max Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionImpl extends MinimalEObjectImpl.Container implements Session {
	/**
	 * The cached value of the '{@link #getSessRole() <em>Sess Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> sessRole;

	/**
	 * The cached value of the '{@link #getSessUser() <em>Sess User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessUser()
	 * @generated
	 * @ordered
	 */
	protected User sessUser;

	/**
	 * The default value of the '{@link #getMaxRoles() <em>Max Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRoles()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ROLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRoles() <em>Max Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRoles()
	 * @generated
	 * @ordered
	 */
	protected int maxRoles = MAX_ROLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LRBACPackage.Literals.SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getSessRole() {
		if (sessRole == null) {
			sessRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, LRBACPackage.SESSION__SESS_ROLE, LRBACPackage.ROLE__ROLE_SESS);
		}
		return sessRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getSessUser() {
		if (sessUser != null && sessUser.eIsProxy()) {
			InternalEObject oldSessUser = (InternalEObject)sessUser;
			sessUser = (User)eResolveProxy(oldSessUser);
			if (sessUser != oldSessUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LRBACPackage.SESSION__SESS_USER, oldSessUser, sessUser));
			}
		}
		return sessUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetSessUser() {
		return sessUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessUser(User newSessUser, NotificationChain msgs) {
		User oldSessUser = sessUser;
		sessUser = newSessUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LRBACPackage.SESSION__SESS_USER, oldSessUser, newSessUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessUser(User newSessUser) {
		if (newSessUser != sessUser) {
			NotificationChain msgs = null;
			if (sessUser != null)
				msgs = ((InternalEObject)sessUser).eInverseRemove(this, LRBACPackage.USER__USER_SESS, User.class, msgs);
			if (newSessUser != null)
				msgs = ((InternalEObject)newSessUser).eInverseAdd(this, LRBACPackage.USER__USER_SESS, User.class, msgs);
			msgs = basicSetSessUser(newSessUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.SESSION__SESS_USER, newSessUser, newSessUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRoles() {
		return maxRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRoles(int newMaxRoles) {
		int oldMaxRoles = maxRoles;
		maxRoles = newMaxRoles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.SESSION__MAX_ROLES, oldMaxRoles, maxRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateMaxRoles(int NoOfRoles) {
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
			case LRBACPackage.SESSION__SESS_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSessRole()).basicAdd(otherEnd, msgs);
			case LRBACPackage.SESSION__SESS_USER:
				if (sessUser != null)
					msgs = ((InternalEObject)sessUser).eInverseRemove(this, LRBACPackage.USER__USER_SESS, User.class, msgs);
				return basicSetSessUser((User)otherEnd, msgs);
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
			case LRBACPackage.SESSION__SESS_ROLE:
				return ((InternalEList<?>)getSessRole()).basicRemove(otherEnd, msgs);
			case LRBACPackage.SESSION__SESS_USER:
				return basicSetSessUser(null, msgs);
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
			case LRBACPackage.SESSION__SESS_ROLE:
				return getSessRole();
			case LRBACPackage.SESSION__SESS_USER:
				if (resolve) return getSessUser();
				return basicGetSessUser();
			case LRBACPackage.SESSION__MAX_ROLES:
				return getMaxRoles();
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
			case LRBACPackage.SESSION__SESS_ROLE:
				getSessRole().clear();
				getSessRole().addAll((Collection<? extends Role>)newValue);
				return;
			case LRBACPackage.SESSION__SESS_USER:
				setSessUser((User)newValue);
				return;
			case LRBACPackage.SESSION__MAX_ROLES:
				setMaxRoles((Integer)newValue);
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
			case LRBACPackage.SESSION__SESS_ROLE:
				getSessRole().clear();
				return;
			case LRBACPackage.SESSION__SESS_USER:
				setSessUser((User)null);
				return;
			case LRBACPackage.SESSION__MAX_ROLES:
				setMaxRoles(MAX_ROLES_EDEFAULT);
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
			case LRBACPackage.SESSION__SESS_ROLE:
				return sessRole != null && !sessRole.isEmpty();
			case LRBACPackage.SESSION__SESS_USER:
				return sessUser != null;
			case LRBACPackage.SESSION__MAX_ROLES:
				return maxRoles != MAX_ROLES_EDEFAULT;
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
			case LRBACPackage.SESSION___UPDATE_MAX_ROLES__INT:
				UpdateMaxRoles((Integer)arguments.get(0));
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
		result.append(" (MaxRoles: ");
		result.append(maxRoles);
		result.append(')');
		return result.toString();
	}

} //SessionImpl
