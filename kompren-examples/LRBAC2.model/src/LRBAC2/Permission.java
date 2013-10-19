/**
 */
package LRBAC2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC2.Permission#getPermOper <em>Perm Oper</em>}</li>
 *   <li>{@link LRBAC2.Permission#getPermObj <em>Perm Obj</em>}</li>
 *   <li>{@link LRBAC2.Permission#getPermRole <em>Perm Role</em>}</li>
 *   <li>{@link LRBAC2.Permission#getRoleLocPerm <em>Role Loc Perm</em>}</li>
 *   <li>{@link LRBAC2.Permission#getObjLocPerm <em>Obj Loc Perm</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC2.LRBACPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Perm Oper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Oper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Oper</em>' reference.
	 * @see #setPermOper(Operation)
	 * @see LRBAC2.LRBACPackage#getPermission_PermOper()
	 * @model required="true"
	 * @generated
	 */
	Operation getPermOper();

	/**
	 * Sets the value of the '{@link LRBAC2.Permission#getPermOper <em>Perm Oper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perm Oper</em>' reference.
	 * @see #getPermOper()
	 * @generated
	 */
	void setPermOper(Operation value);

	/**
	 * Returns the value of the '<em><b>Perm Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Obj</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Obj</em>' reference.
	 * @see #setPermObj(LRBAC2.Object)
	 * @see LRBAC2.LRBACPackage#getPermission_PermObj()
	 * @model required="true"
	 * @generated
	 */
	LRBAC2.Object getPermObj();

	/**
	 * Sets the value of the '{@link LRBAC2.Permission#getPermObj <em>Perm Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perm Obj</em>' reference.
	 * @see #getPermObj()
	 * @generated
	 */
	void setPermObj(LRBAC2.Object value);

	/**
	 * Returns the value of the '<em><b>Perm Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Role</em>' reference.
	 * @see #setPermRole(Role)
	 * @see LRBAC2.LRBACPackage#getPermission_PermRole()
	 * @model required="true"
	 * @generated
	 */
	Role getPermRole();

	/**
	 * Sets the value of the '{@link LRBAC2.Permission#getPermRole <em>Perm Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perm Role</em>' reference.
	 * @see #getPermRole()
	 * @generated
	 */
	void setPermRole(Role value);

	/**
	 * Returns the value of the '<em><b>Role Loc Perm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Loc Perm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Loc Perm</em>' reference.
	 * @see #setRoleLocPerm(Location)
	 * @see LRBAC2.LRBACPackage#getPermission_RoleLocPerm()
	 * @model required="true"
	 * @generated
	 */
	Location getRoleLocPerm();

	/**
	 * Sets the value of the '{@link LRBAC2.Permission#getRoleLocPerm <em>Role Loc Perm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Loc Perm</em>' reference.
	 * @see #getRoleLocPerm()
	 * @generated
	 */
	void setRoleLocPerm(Location value);

	/**
	 * Returns the value of the '<em><b>Obj Loc Perm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Loc Perm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Loc Perm</em>' reference.
	 * @see #setObjLocPerm(Location)
	 * @see LRBAC2.LRBACPackage#getPermission_ObjLocPerm()
	 * @model required="true"
	 * @generated
	 */
	Location getObjLocPerm();

	/**
	 * Sets the value of the '{@link LRBAC2.Permission#getObjLocPerm <em>Obj Loc Perm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Loc Perm</em>' reference.
	 * @see #getObjLocPerm()
	 * @generated
	 */
	void setObjLocPerm(Location value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdatePermName(String name);

} // Permission
