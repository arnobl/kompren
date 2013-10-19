/**
 */
package LRBAC.impl;

import LRBAC.LRBACPackage;
import LRBAC.Location;
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
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LRBAC.impl.UserImpl#getUserSess <em>User Sess</em>}</li>
 *   <li>{@link LRBAC.impl.UserImpl#getAssignedRoles <em>Assigned Roles</em>}</li>
 *   <li>{@link LRBAC.impl.UserImpl#getUserLoc <em>User Loc</em>}</li>
 *   <li>{@link LRBAC.impl.UserImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link LRBAC.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link LRBAC.impl.UserImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link LRBAC.impl.UserImpl#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The cached value of the '{@link #getUserSess() <em>User Sess</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSess()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> userSess;

	/**
	 * The cached value of the '{@link #getAssignedRoles() <em>Assigned Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> assignedRoles;

	/**
	 * The cached value of the '{@link #getUserLoc() <em>User Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoc()
	 * @generated
	 * @ordered
	 */
	protected Location userLoc;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected int userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LRBACPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getUserSess() {
		if (userSess == null) {
			userSess = new EObjectWithInverseResolvingEList<Session>(Session.class, this, LRBACPackage.USER__USER_SESS, LRBACPackage.SESSION__SESS_USER);
		}
		return userSess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getAssignedRoles() {
		if (assignedRoles == null) {
			assignedRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, LRBACPackage.USER__ASSIGNED_ROLES, LRBACPackage.ROLE__ASSIGN_USER);
		}
		return assignedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getUserLoc() {
		if (userLoc != null && userLoc.eIsProxy()) {
			InternalEObject oldUserLoc = (InternalEObject)userLoc;
			userLoc = (Location)eResolveProxy(oldUserLoc);
			if (userLoc != oldUserLoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LRBACPackage.USER__USER_LOC, oldUserLoc, userLoc));
			}
		}
		return userLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetUserLoc() {
		return userLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserLoc(Location newUserLoc, NotificationChain msgs) {
		Location oldUserLoc = userLoc;
		userLoc = newUserLoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LRBACPackage.USER__USER_LOC, oldUserLoc, newUserLoc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserLoc(Location newUserLoc) {
		if (newUserLoc != userLoc) {
			NotificationChain msgs = null;
			if (userLoc != null)
				msgs = ((InternalEObject)userLoc).eInverseRemove(this, LRBACPackage.LOCATION__LOC_USER, Location.class, msgs);
			if (newUserLoc != null)
				msgs = ((InternalEObject)newUserLoc).eInverseAdd(this, LRBACPackage.LOCATION__LOC_USER, Location.class, msgs);
			msgs = basicSetUserLoc(newUserLoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.USER__USER_LOC, newUserLoc, newUserLoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.USER__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.USER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(int newUserID) {
		int oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.USER__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LRBACPackage.USER__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateUserName(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateAge(int age) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateLoc(Location l) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AssignRole(Role r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateUserID(int id) {
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
			case LRBACPackage.USER__USER_SESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserSess()).basicAdd(otherEnd, msgs);
			case LRBACPackage.USER__ASSIGNED_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedRoles()).basicAdd(otherEnd, msgs);
			case LRBACPackage.USER__USER_LOC:
				if (userLoc != null)
					msgs = ((InternalEObject)userLoc).eInverseRemove(this, LRBACPackage.LOCATION__LOC_USER, Location.class, msgs);
				return basicSetUserLoc((Location)otherEnd, msgs);
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
			case LRBACPackage.USER__USER_SESS:
				return ((InternalEList<?>)getUserSess()).basicRemove(otherEnd, msgs);
			case LRBACPackage.USER__ASSIGNED_ROLES:
				return ((InternalEList<?>)getAssignedRoles()).basicRemove(otherEnd, msgs);
			case LRBACPackage.USER__USER_LOC:
				return basicSetUserLoc(null, msgs);
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
			case LRBACPackage.USER__USER_SESS:
				return getUserSess();
			case LRBACPackage.USER__ASSIGNED_ROLES:
				return getAssignedRoles();
			case LRBACPackage.USER__USER_LOC:
				if (resolve) return getUserLoc();
				return basicGetUserLoc();
			case LRBACPackage.USER__GENDER:
				return getGender();
			case LRBACPackage.USER__USER_NAME:
				return getUserName();
			case LRBACPackage.USER__USER_ID:
				return getUserID();
			case LRBACPackage.USER__AGE:
				return getAge();
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
			case LRBACPackage.USER__USER_SESS:
				getUserSess().clear();
				getUserSess().addAll((Collection<? extends Session>)newValue);
				return;
			case LRBACPackage.USER__ASSIGNED_ROLES:
				getAssignedRoles().clear();
				getAssignedRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case LRBACPackage.USER__USER_LOC:
				setUserLoc((Location)newValue);
				return;
			case LRBACPackage.USER__GENDER:
				setGender((String)newValue);
				return;
			case LRBACPackage.USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case LRBACPackage.USER__USER_ID:
				setUserID((Integer)newValue);
				return;
			case LRBACPackage.USER__AGE:
				setAge((Integer)newValue);
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
			case LRBACPackage.USER__USER_SESS:
				getUserSess().clear();
				return;
			case LRBACPackage.USER__ASSIGNED_ROLES:
				getAssignedRoles().clear();
				return;
			case LRBACPackage.USER__USER_LOC:
				setUserLoc((Location)null);
				return;
			case LRBACPackage.USER__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case LRBACPackage.USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case LRBACPackage.USER__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case LRBACPackage.USER__AGE:
				setAge(AGE_EDEFAULT);
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
			case LRBACPackage.USER__USER_SESS:
				return userSess != null && !userSess.isEmpty();
			case LRBACPackage.USER__ASSIGNED_ROLES:
				return assignedRoles != null && !assignedRoles.isEmpty();
			case LRBACPackage.USER__USER_LOC:
				return userLoc != null;
			case LRBACPackage.USER__GENDER:
				return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
			case LRBACPackage.USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case LRBACPackage.USER__USER_ID:
				return userID != USER_ID_EDEFAULT;
			case LRBACPackage.USER__AGE:
				return age != AGE_EDEFAULT;
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
			case LRBACPackage.USER___UPDATE_USER_NAME__STRING:
				UpdateUserName((String)arguments.get(0));
				return null;
			case LRBACPackage.USER___UPDATE_AGE__INT:
				UpdateAge((Integer)arguments.get(0));
				return null;
			case LRBACPackage.USER___UPDATE_LOC__LOCATION:
				UpdateLoc((Location)arguments.get(0));
				return null;
			case LRBACPackage.USER___ASSIGN_ROLE__ROLE:
				AssignRole((Role)arguments.get(0));
				return null;
			case LRBACPackage.USER___UPDATE_USER_ID__INT:
				UpdateUserID((Integer)arguments.get(0));
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
		result.append(" (Gender: ");
		result.append(gender);
		result.append(", UserName: ");
		result.append(userName);
		result.append(", UserID: ");
		result.append(userID);
		result.append(", Age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //UserImpl
