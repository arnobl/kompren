/**
 */
package LRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC.Role#getAssignUser <em>Assign User</em>}</li>
 *   <li>{@link LRBAC.Role#getAssignLoc <em>Assign Loc</em>}</li>
 *   <li>{@link LRBAC.Role#getRoleSess <em>Role Sess</em>}</li>
 *   <li>{@link LRBAC.Role#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link LRBAC.Role#getRolePerm <em>Role Perm</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC.LRBACPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Assign User</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.User}.
	 * It is bidirectional and its opposite is '{@link LRBAC.User#getAssignedRoles <em>Assigned Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign User</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign User</em>' reference list.
	 * @see LRBAC.LRBACPackage#getRole_AssignUser()
	 * @see LRBAC.User#getAssignedRoles
	 * @model opposite="AssignedRoles" ordered="false"
	 * @generated
	 */
	EList<User> getAssignUser();

	/**
	 * Returns the value of the '<em><b>Assign Loc</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Location}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Location#getLocAssign <em>Loc Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Loc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Loc</em>' reference list.
	 * @see LRBAC.LRBACPackage#getRole_AssignLoc()
	 * @see LRBAC.Location#getLocAssign
	 * @model opposite="LocAssign" ordered="false"
	 * @generated
	 */
	EList<Location> getAssignLoc();

	/**
	 * Returns the value of the '<em><b>Role Sess</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Session}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Session#getSessRole <em>Sess Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Sess</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Sess</em>' reference list.
	 * @see LRBAC.LRBACPackage#getRole_RoleSess()
	 * @see LRBAC.Session#getSessRole
	 * @model opposite="SessRole" ordered="false"
	 * @generated
	 */
	EList<Session> getRoleSess();

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see LRBAC.LRBACPackage#getRole_RoleName()
	 * @model
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link LRBAC.Role#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Role Perm</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Permission#getPermRole <em>Perm Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Perm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Perm</em>' reference list.
	 * @see LRBAC.LRBACPackage#getRole_RolePerm()
	 * @see LRBAC.Permission#getPermRole
	 * @model opposite="PermRole"
	 * @generated
	 */
	EList<Permission> getRolePerm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.AssignLoc->includes(l)
	 * self.AssignLoc = self.AssignLoc@pre->excluding(l)
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void UpdateRoleName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.AssignLoc->excludes(l)
	 * 
	 * 
	 * self.AssignLoc = self.AssignLoc@pre->including(l)
	 * 
	 * 
	 * 
	 *  
	 * 
	 * <!-- end-model-doc -->
	 * @model lRequired="true" lOrdered="false"
	 * @generated
	 */
	void AddAssignLoc(Location l);

} // Role
