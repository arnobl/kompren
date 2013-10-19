/**
 */
package LRBAC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC.Permission#getPermOper <em>Perm Oper</em>}</li>
 *   <li>{@link LRBAC.Permission#getPermName <em>Perm Name</em>}</li>
 *   <li>{@link LRBAC.Permission#getPermObj <em>Perm Obj</em>}</li>
 *   <li>{@link LRBAC.Permission#getPermRole <em>Perm Role</em>}</li>
 *   <li>{@link LRBAC.Permission#getRoleLocPerm <em>Role Loc Perm</em>}</li>
 *   <li>{@link LRBAC.Permission#getObjLocPerm <em>Obj Loc Perm</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC.LRBACPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Perm Oper</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LRBAC.Operation#getOperPerm <em>Oper Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Oper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Oper</em>' reference.
	 * @see #setPermOper(Operation)
	 * @see LRBAC.LRBACPackage#getPermission_PermOper()
	 * @see LRBAC.Operation#getOperPerm
	 * @model opposite="OperPerm" required="true"
	 * @generated
	 */
	Operation getPermOper();

	/**
	 * Sets the value of the '{@link LRBAC.Permission#getPermOper <em>Perm Oper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perm Oper</em>' reference.
	 * @see #getPermOper()
	 * @generated
	 */
	void setPermOper(Operation value);

	/**
	 * Returns the value of the '<em><b>Perm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Name</em>' attribute.
	 * @see #setPermName(String)
	 * @see LRBAC.LRBACPackage#getPermission_PermName()
	 * @model
	 * @generated
	 */
	String getPermName();

	/**
	 * Sets the value of the '{@link LRBAC.Permission#getPermName <em>Perm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perm Name</em>' attribute.
	 * @see #getPermName()
	 * @generated
	 */
	void setPermName(String value);

	/**
	 * Returns the value of the '<em><b>Perm Obj</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LRBAC.Object#getObjPerm <em>Obj Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Obj</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Obj</em>' reference.
	 * @see #setPermObj(LRBAC.Object)
	 * @see LRBAC.LRBACPackage#getPermission_PermObj()
	 * @see LRBAC.Object#getObjPerm
	 * @model opposite="ObjPerm" required="true"
	 * @generated
	 */
	LRBAC.Object getPermObj();

	/**
	 * Sets the value of the '{@link LRBAC.Permission#getPermObj <em>Perm Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perm Obj</em>' reference.
	 * @see #getPermObj()
	 * @generated
	 */
	void setPermObj(LRBAC.Object value);

	/**
	 * Returns the value of the '<em><b>Perm Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LRBAC.Role#getRolePerm <em>Role Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perm Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perm Role</em>' reference.
	 * @see #setPermRole(Role)
	 * @see LRBAC.LRBACPackage#getPermission_PermRole()
	 * @see LRBAC.Role#getRolePerm
	 * @model opposite="RolePerm" required="true"
	 * @generated
	 */
	Role getPermRole();

	/**
	 * Sets the value of the '{@link LRBAC.Permission#getPermRole <em>Perm Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perm Role</em>' reference.
	 * @see #getPermRole()
	 * @generated
	 */
	void setPermRole(Role value);

	/**
	 * Returns the value of the '<em><b>Role Loc Perm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LRBAC.Location#getPermRoleLoc <em>Perm Role Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Loc Perm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Loc Perm</em>' reference.
	 * @see #setRoleLocPerm(Location)
	 * @see LRBAC.LRBACPackage#getPermission_RoleLocPerm()
	 * @see LRBAC.Location#getPermRoleLoc
	 * @model opposite="PermRoleLoc" required="true"
	 * @generated
	 */
	Location getRoleLocPerm();

	/**
	 * Sets the value of the '{@link LRBAC.Permission#getRoleLocPerm <em>Role Loc Perm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Loc Perm</em>' reference.
	 * @see #getRoleLocPerm()
	 * @generated
	 */
	void setRoleLocPerm(Location value);

	/**
	 * Returns the value of the '<em><b>Obj Loc Perm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LRBAC.Location#getPermObjLoc <em>Perm Obj Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Loc Perm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Loc Perm</em>' reference.
	 * @see #setObjLocPerm(Location)
	 * @see LRBAC.LRBACPackage#getPermission_ObjLocPerm()
	 * @see LRBAC.Location#getPermObjLoc
	 * @model opposite="PermObjLoc" required="true"
	 * @generated
	 */
	Location getObjLocPerm();

	/**
	 * Sets the value of the '{@link LRBAC.Permission#getObjLocPerm <em>Obj Loc Perm</em>}' reference.
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
