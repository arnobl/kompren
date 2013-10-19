/**
 */
package LRBAC2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see LRBAC2.LRBACPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void UpdateRoleName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lRequired="true" lOrdered="false"
	 * @generated
	 */
	void AddAssignLoc(Location l);

} // Role
