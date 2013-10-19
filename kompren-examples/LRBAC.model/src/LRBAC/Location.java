/**
 */
package LRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC.Location#getLocUser <em>Loc User</em>}</li>
 *   <li>{@link LRBAC.Location#getLocAssign <em>Loc Assign</em>}</li>
 *   <li>{@link LRBAC.Location#getLocName <em>Loc Name</em>}</li>
 *   <li>{@link LRBAC.Location#getLocObj <em>Loc Obj</em>}</li>
 *   <li>{@link LRBAC.Location#getPermRoleLoc <em>Perm Role Loc</em>}</li>
 *   <li>{@link LRBAC.Location#getPermObjLoc <em>Perm Obj Loc</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC.LRBACPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Loc User</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.User}.
	 * It is bidirectional and its opposite is '{@link LRBAC.User#getUserLoc <em>User Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc User</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc User</em>' reference list.
	 * @see LRBAC.LRBACPackage#getLocation_LocUser()
	 * @see LRBAC.User#getUserLoc
	 * @model opposite="UserLoc" ordered="false"
	 * @generated
	 */
	EList<User> getLocUser();

	/**
	 * Returns the value of the '<em><b>Loc Assign</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Role#getAssignLoc <em>Assign Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc Assign</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc Assign</em>' reference list.
	 * @see LRBAC.LRBACPackage#getLocation_LocAssign()
	 * @see LRBAC.Role#getAssignLoc
	 * @model opposite="AssignLoc" ordered="false"
	 * @generated
	 */
	EList<Role> getLocAssign();

	/**
	 * Returns the value of the '<em><b>Loc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc Name</em>' attribute.
	 * @see #setLocName(String)
	 * @see LRBAC.LRBACPackage#getLocation_LocName()
	 * @model
	 * @generated
	 */
	String getLocName();

	/**
	 * Sets the value of the '{@link LRBAC.Location#getLocName <em>Loc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Name</em>' attribute.
	 * @see #getLocName()
	 * @generated
	 */
	void setLocName(String value);

	/**
	 * Returns the value of the '<em><b>Loc Obj</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Object}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Object#getObjLoc <em>Obj Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc Obj</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc Obj</em>' reference list.
	 * @see LRBAC.LRBACPackage#getLocation_LocObj()
	 * @see LRBAC.Object#getObjLoc
	 * @model opposite="ObjLoc"
	 * @generated
	 */
	EList<LRBAC.Object> getLocObj();

	/**
	 * Returns the value of the '<em><b>Perm Role Loc</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Permission#getRoleLocPerm <em>Role Loc Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Role Loc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Role Loc</em>' reference list.
	 * @see LRBAC.LRBACPackage#getLocation_PermRoleLoc()
	 * @see LRBAC.Permission#getRoleLocPerm
	 * @model opposite="RoleLocPerm"
	 * @generated
	 */
	EList<Permission> getPermRoleLoc();

	/**
	 * Returns the value of the '<em><b>Perm Obj Loc</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Permission#getObjLocPerm <em>Obj Loc Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Obj Loc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Obj Loc</em>' reference list.
	 * @see LRBAC.LRBACPackage#getLocation_PermObjLoc()
	 * @see LRBAC.Permission#getObjLocPerm
	 * @model opposite="ObjLocPerm"
	 * @generated
	 */
	EList<Permission> getPermObjLoc();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateLocName(String name);

} // Location
