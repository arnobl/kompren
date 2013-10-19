/**
 */
package LRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC.User#getUserSess <em>User Sess</em>}</li>
 *   <li>{@link LRBAC.User#getAssignedRoles <em>Assigned Roles</em>}</li>
 *   <li>{@link LRBAC.User#getUserLoc <em>User Loc</em>}</li>
 *   <li>{@link LRBAC.User#getGender <em>Gender</em>}</li>
 *   <li>{@link LRBAC.User#getUserName <em>User Name</em>}</li>
 *   <li>{@link LRBAC.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link LRBAC.User#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC.LRBACPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User Sess</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Session}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Session#getSessUser <em>Sess User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Sess</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Sess</em>' reference list.
	 * @see LRBAC.LRBACPackage#getUser_UserSess()
	 * @see LRBAC.Session#getSessUser
	 * @model opposite="SessUser" ordered="false"
	 * @generated
	 */
	EList<Session> getUserSess();

	/**
	 * Returns the value of the '<em><b>Assigned Roles</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Role#getAssignUser <em>Assign User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Roles</em>' reference list.
	 * @see LRBAC.LRBACPackage#getUser_AssignedRoles()
	 * @see LRBAC.Role#getAssignUser
	 * @model opposite="AssignUser" ordered="false"
	 * @generated
	 */
	EList<Role> getAssignedRoles();

	/**
	 * Returns the value of the '<em><b>User Loc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LRBAC.Location#getLocUser <em>Loc User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Loc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Loc</em>' reference.
	 * @see #setUserLoc(Location)
	 * @see LRBAC.LRBACPackage#getUser_UserLoc()
	 * @see LRBAC.Location#getLocUser
	 * @model opposite="LocUser" required="true" ordered="false"
	 * @generated
	 */
	Location getUserLoc();

	/**
	 * Sets the value of the '{@link LRBAC.User#getUserLoc <em>User Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Loc</em>' reference.
	 * @see #getUserLoc()
	 * @generated
	 */
	void setUserLoc(Location value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(String)
	 * @see LRBAC.LRBACPackage#getUser_Gender()
	 * @model
	 * @generated
	 */
	String getGender();

	/**
	 * Sets the value of the '{@link LRBAC.User#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see LRBAC.LRBACPackage#getUser_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link LRBAC.User#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(int)
	 * @see LRBAC.LRBACPackage#getUser_UserID()
	 * @model
	 * @generated
	 */
	int getUserID();

	/**
	 * Sets the value of the '{@link LRBAC.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(int value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see LRBAC.LRBACPackage#getUser_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link LRBAC.User#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.UserAssign->includes(r)
	 * 
	 * self.UserAssign = self.UserAssign@pre->excluding(r)
	 * 
	 * <!-- end-model-doc -->
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void UpdateUserName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateAge(int age);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateLoc(Location l);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.UserAssign->excludes(r) and r.AssignLoc->includes(self.UserLoc)
	 * 
	 * 
	 * self.UserAssign = self.UserAssign@pre->including(r)
	 * 
	 * gjkh
	 * <!-- end-model-doc -->
	 * @model rRequired="true" rOrdered="false"
	 * @generated
	 */
	void AssignRole(Role r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateUserID(int id);

} // User
