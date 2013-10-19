/**
 */
package LRBAC2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC2.Session#getSessUser <em>Sess User</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC2.LRBACPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Sess User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sess User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sess User</em>' reference.
	 * @see #setSessUser(User)
	 * @see LRBAC2.LRBACPackage#getSession_SessUser()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	User getSessUser();

	/**
	 * Sets the value of the '{@link LRBAC2.Session#getSessUser <em>Sess User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sess User</em>' reference.
	 * @see #getSessUser()
	 * @generated
	 */
	void setSessUser(User value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateMaxRoles(int NoOfRoles);

} // Session
