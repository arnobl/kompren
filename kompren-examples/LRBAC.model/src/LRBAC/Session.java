/**
 */
package LRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC.Session#getSessRole <em>Sess Role</em>}</li>
 *   <li>{@link LRBAC.Session#getSessUser <em>Sess User</em>}</li>
 *   <li>{@link LRBAC.Session#getMaxRoles <em>Max Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC.LRBACPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Sess Role</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Role#getRoleSess <em>Role Sess</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sess Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sess Role</em>' reference list.
	 * @see LRBAC.LRBACPackage#getSession_SessRole()
	 * @see LRBAC.Role#getRoleSess
	 * @model opposite="RoleSess" ordered="false"
	 * @generated
	 */
	EList<Role> getSessRole();

	/**
	 * Returns the value of the '<em><b>Sess User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LRBAC.User#getUserSess <em>User Sess</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sess User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sess User</em>' reference.
	 * @see #setSessUser(User)
	 * @see LRBAC.LRBACPackage#getSession_SessUser()
	 * @see LRBAC.User#getUserSess
	 * @model opposite="UserSess" required="true" ordered="false"
	 * @generated
	 */
	User getSessUser();

	/**
	 * Sets the value of the '{@link LRBAC.Session#getSessUser <em>Sess User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sess User</em>' reference.
	 * @see #getSessUser()
	 * @generated
	 */
	void setSessUser(User value);

	/**
	 * Returns the value of the '<em><b>Max Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Roles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Roles</em>' attribute.
	 * @see #setMaxRoles(int)
	 * @see LRBAC.LRBACPackage#getSession_MaxRoles()
	 * @model
	 * @generated
	 */
	int getMaxRoles();

	/**
	 * Sets the value of the '{@link LRBAC.Session#getMaxRoles <em>Max Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Roles</em>' attribute.
	 * @see #getMaxRoles()
	 * @generated
	 */
	void setMaxRoles(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateMaxRoles(int NoOfRoles);

} // Session
