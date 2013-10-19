/**
 */
package LRBAC2;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LRBAC2.LRBACFactory
 * @model kind="package"
 * @generated
 */
public interface LRBACPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LRBAC2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://BlankModel/LRBAC2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BlankModel2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LRBACPackage eINSTANCE = LRBAC2.impl.LRBACPackageImpl.init();

	/**
	 * The meta object id for the '{@link LRBAC2.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.UserImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>User Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_LOC = 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update User ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_USER_ID__INT = 0;

	/**
	 * The operation id for the '<em>Update User Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_USER_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Update Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_AGE__INT = 2;

	/**
	 * The operation id for the '<em>Assign Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ASSIGN_ROLE__ROLE = 3;

	/**
	 * The operation id for the '<em>Update Loc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_LOC__LOCATION = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.LocationImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Update Loc Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___UPDATE_LOC_NAME__STRING = 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.PermissionImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 2;

	/**
	 * The feature id for the '<em><b>Perm Oper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERM_OPER = 0;

	/**
	 * The feature id for the '<em><b>Perm Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERM_OBJ = 1;

	/**
	 * The feature id for the '<em><b>Perm Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERM_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Role Loc Perm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ROLE_LOC_PERM = 3;

	/**
	 * The feature id for the '<em><b>Obj Loc Perm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OBJ_LOC_PERM = 4;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Update Perm Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION___UPDATE_PERM_NAME__STRING = 0;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.OperationImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.WriteImpl <em>Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.WriteImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getWrite()
	 * @generated
	 */
	int WRITE = 4;

	/**
	 * The number of structural features of the '<em>Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.ExecuteImpl <em>Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.ExecuteImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getExecute()
	 * @generated
	 */
	int EXECUTE = 5;

	/**
	 * The number of structural features of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.ReadImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getRead()
	 * @generated
	 */
	int READ = 6;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.ObjectImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Obj Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJ_LOC = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update Obj ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT___UPDATE_OBJ_ID__INT = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.RoleImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 8;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Update Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UPDATE_ROLE_NAME__STRING = 0;

	/**
	 * The operation id for the '<em>Add Assign Loc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ADD_ASSIGN_LOC__LOCATION = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link LRBAC2.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC2.impl.SessionImpl
	 * @see LRBAC2.impl.LRBACPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 9;

	/**
	 * The feature id for the '<em><b>Sess User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__SESS_USER = 0;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update Max Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___UPDATE_MAX_ROLES__INT = 0;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link LRBAC2.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see LRBAC2.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link LRBAC2.User#getUserLoc <em>User Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Loc</em>'.
	 * @see LRBAC2.User#getUserLoc()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UserLoc();

	/**
	 * Returns the meta object for the '{@link LRBAC2.User#UpdateUserID(int) <em>Update User ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update User ID</em>' operation.
	 * @see LRBAC2.User#UpdateUserID(int)
	 * @generated
	 */
	EOperation getUser__UpdateUserID__int();

	/**
	 * Returns the meta object for the '{@link LRBAC2.User#UpdateUserName(java.lang.String) <em>Update User Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update User Name</em>' operation.
	 * @see LRBAC2.User#UpdateUserName(java.lang.String)
	 * @generated
	 */
	EOperation getUser__UpdateUserName__String();

	/**
	 * Returns the meta object for the '{@link LRBAC2.User#UpdateAge(int) <em>Update Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Age</em>' operation.
	 * @see LRBAC2.User#UpdateAge(int)
	 * @generated
	 */
	EOperation getUser__UpdateAge__int();

	/**
	 * Returns the meta object for the '{@link LRBAC2.User#AssignRole(LRBAC2.Role) <em>Assign Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Role</em>' operation.
	 * @see LRBAC2.User#AssignRole(LRBAC2.Role)
	 * @generated
	 */
	EOperation getUser__AssignRole__Role();

	/**
	 * Returns the meta object for the '{@link LRBAC2.User#UpdateLoc(LRBAC2.Location) <em>Update Loc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Loc</em>' operation.
	 * @see LRBAC2.User#UpdateLoc(LRBAC2.Location)
	 * @generated
	 */
	EOperation getUser__UpdateLoc__Location();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see LRBAC2.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the '{@link LRBAC2.Location#UpdateLocName(java.lang.String) <em>Update Loc Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Loc Name</em>' operation.
	 * @see LRBAC2.Location#UpdateLocName(java.lang.String)
	 * @generated
	 */
	EOperation getLocation__UpdateLocName__String();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see LRBAC2.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference '{@link LRBAC2.Permission#getPermOper <em>Perm Oper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perm Oper</em>'.
	 * @see LRBAC2.Permission#getPermOper()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PermOper();

	/**
	 * Returns the meta object for the reference '{@link LRBAC2.Permission#getPermObj <em>Perm Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perm Obj</em>'.
	 * @see LRBAC2.Permission#getPermObj()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PermObj();

	/**
	 * Returns the meta object for the reference '{@link LRBAC2.Permission#getPermRole <em>Perm Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perm Role</em>'.
	 * @see LRBAC2.Permission#getPermRole()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PermRole();

	/**
	 * Returns the meta object for the reference '{@link LRBAC2.Permission#getRoleLocPerm <em>Role Loc Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Loc Perm</em>'.
	 * @see LRBAC2.Permission#getRoleLocPerm()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_RoleLocPerm();

	/**
	 * Returns the meta object for the reference '{@link LRBAC2.Permission#getObjLocPerm <em>Obj Loc Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj Loc Perm</em>'.
	 * @see LRBAC2.Permission#getObjLocPerm()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_ObjLocPerm();

	/**
	 * Returns the meta object for the '{@link LRBAC2.Permission#UpdatePermName(java.lang.String) <em>Update Perm Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Perm Name</em>' operation.
	 * @see LRBAC2.Permission#UpdatePermName(java.lang.String)
	 * @generated
	 */
	EOperation getPermission__UpdatePermName__String();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see LRBAC2.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Write <em>Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write</em>'.
	 * @see LRBAC2.Write
	 * @generated
	 */
	EClass getWrite();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute</em>'.
	 * @see LRBAC2.Execute
	 * @generated
	 */
	EClass getExecute();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see LRBAC2.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see LRBAC2.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference '{@link LRBAC2.Object#getObjLoc <em>Obj Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj Loc</em>'.
	 * @see LRBAC2.Object#getObjLoc()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ObjLoc();

	/**
	 * Returns the meta object for the '{@link LRBAC2.Object#UpdateObjID(int) <em>Update Obj ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Obj ID</em>' operation.
	 * @see LRBAC2.Object#UpdateObjID(int)
	 * @generated
	 */
	EOperation getObject__UpdateObjID__int();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see LRBAC2.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the '{@link LRBAC2.Role#UpdateRoleName(java.lang.String) <em>Update Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Role Name</em>' operation.
	 * @see LRBAC2.Role#UpdateRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getRole__UpdateRoleName__String();

	/**
	 * Returns the meta object for the '{@link LRBAC2.Role#AddAssignLoc(LRBAC2.Location) <em>Add Assign Loc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Assign Loc</em>' operation.
	 * @see LRBAC2.Role#AddAssignLoc(LRBAC2.Location)
	 * @generated
	 */
	EOperation getRole__AddAssignLoc__Location();

	/**
	 * Returns the meta object for class '{@link LRBAC2.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see LRBAC2.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference '{@link LRBAC2.Session#getSessUser <em>Sess User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sess User</em>'.
	 * @see LRBAC2.Session#getSessUser()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_SessUser();

	/**
	 * Returns the meta object for the '{@link LRBAC2.Session#UpdateMaxRoles(int) <em>Update Max Roles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Max Roles</em>' operation.
	 * @see LRBAC2.Session#UpdateMaxRoles(int)
	 * @generated
	 */
	EOperation getSession__UpdateMaxRoles__int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LRBACFactory getLRBACFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LRBAC2.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.UserImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER_LOC = eINSTANCE.getUser_UserLoc();

		/**
		 * The meta object literal for the '<em><b>Update User ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UPDATE_USER_ID__INT = eINSTANCE.getUser__UpdateUserID__int();

		/**
		 * The meta object literal for the '<em><b>Update User Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UPDATE_USER_NAME__STRING = eINSTANCE.getUser__UpdateUserName__String();

		/**
		 * The meta object literal for the '<em><b>Update Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UPDATE_AGE__INT = eINSTANCE.getUser__UpdateAge__int();

		/**
		 * The meta object literal for the '<em><b>Assign Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ASSIGN_ROLE__ROLE = eINSTANCE.getUser__AssignRole__Role();

		/**
		 * The meta object literal for the '<em><b>Update Loc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UPDATE_LOC__LOCATION = eINSTANCE.getUser__UpdateLoc__Location();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.LocationImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Update Loc Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___UPDATE_LOC_NAME__STRING = eINSTANCE.getLocation__UpdateLocName__String();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.PermissionImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Perm Oper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PERM_OPER = eINSTANCE.getPermission_PermOper();

		/**
		 * The meta object literal for the '<em><b>Perm Obj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PERM_OBJ = eINSTANCE.getPermission_PermObj();

		/**
		 * The meta object literal for the '<em><b>Perm Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PERM_ROLE = eINSTANCE.getPermission_PermRole();

		/**
		 * The meta object literal for the '<em><b>Role Loc Perm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ROLE_LOC_PERM = eINSTANCE.getPermission_RoleLocPerm();

		/**
		 * The meta object literal for the '<em><b>Obj Loc Perm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__OBJ_LOC_PERM = eINSTANCE.getPermission_ObjLocPerm();

		/**
		 * The meta object literal for the '<em><b>Update Perm Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERMISSION___UPDATE_PERM_NAME__STRING = eINSTANCE.getPermission__UpdatePermName__String();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.OperationImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.WriteImpl <em>Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.WriteImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getWrite()
		 * @generated
		 */
		EClass WRITE = eINSTANCE.getWrite();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.ExecuteImpl <em>Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.ExecuteImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getExecute()
		 * @generated
		 */
		EClass EXECUTE = eINSTANCE.getExecute();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.ReadImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.ObjectImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Obj Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OBJ_LOC = eINSTANCE.getObject_ObjLoc();

		/**
		 * The meta object literal for the '<em><b>Update Obj ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT___UPDATE_OBJ_ID__INT = eINSTANCE.getObject__UpdateObjID__int();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.RoleImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Update Role Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___UPDATE_ROLE_NAME__STRING = eINSTANCE.getRole__UpdateRoleName__String();

		/**
		 * The meta object literal for the '<em><b>Add Assign Loc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___ADD_ASSIGN_LOC__LOCATION = eINSTANCE.getRole__AddAssignLoc__Location();

		/**
		 * The meta object literal for the '{@link LRBAC2.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC2.impl.SessionImpl
		 * @see LRBAC2.impl.LRBACPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Sess User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__SESS_USER = eINSTANCE.getSession_SessUser();

		/**
		 * The meta object literal for the '<em><b>Update Max Roles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___UPDATE_MAX_ROLES__INT = eINSTANCE.getSession__UpdateMaxRoles__int();

	}

} //LRBACPackage
