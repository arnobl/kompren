/**
 */
package LRBAC2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC2.User#getUserLoc <em>User Loc</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC2.LRBACPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Loc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Loc</em>' reference.
	 * @see #setUserLoc(Location)
	 * @see LRBAC2.LRBACPackage#getUser_UserLoc()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Location getUserLoc();

	/**
	 * Sets the value of the '{@link LRBAC2.User#getUserLoc <em>User Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Loc</em>' reference.
	 * @see #getUserLoc()
	 * @generated
	 */
	void setUserLoc(Location value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateUserID(int id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	void UpdateLoc(Location l);

} // User
