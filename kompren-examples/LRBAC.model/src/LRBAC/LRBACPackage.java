/**
 */
package LRBAC;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see LRBAC.LRBACFactory
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
	String eNAME = "LRBAC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://BlankModel/LRBAC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BlankModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LRBACPackage eINSTANCE = LRBAC.impl.LRBACPackageImpl.init();

	/**
	 * The meta object id for the '{@link LRBAC.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.UserImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>User Sess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_SESS = 0;

	/**
	 * The feature id for the '<em><b>Assigned Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ASSIGNED_ROLES = 1;

	/**
	 * The feature id for the '<em><b>User Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_LOC = 2;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GENDER = 3;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = 4;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 5;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AGE = 6;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Update User Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_USER_NAME__STRING = 0;

	/**
	 * The operation id for the '<em>Update Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_AGE__INT = 1;

	/**
	 * The operation id for the '<em>Update Loc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_LOC__LOCATION = 2;

	/**
	 * The operation id for the '<em>Assign Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ASSIGN_ROLE__ROLE = 3;

	/**
	 * The operation id for the '<em>Update User ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATE_USER_ID__INT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link LRBAC.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.SessionImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 1;

	/**
	 * The feature id for the '<em><b>Sess Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__SESS_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Sess User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__SESS_USER = 1;

	/**
	 * The feature id for the '<em><b>Max Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__MAX_ROLES = 2;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link LRBAC.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.RoleImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Assign User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ASSIGN_USER = 0;

	/**
	 * The feature id for the '<em><b>Assign Loc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ASSIGN_LOC = 1;

	/**
	 * The feature id for the '<em><b>Role Sess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_SESS = 2;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Role Perm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_PERM = 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 5;

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
	 * The meta object id for the '{@link LRBAC.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.LocationImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Loc User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOC_USER = 0;

	/**
	 * The feature id for the '<em><b>Loc Assign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOC_ASSIGN = 1;

	/**
	 * The feature id for the '<em><b>Loc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOC_NAME = 2;

	/**
	 * The feature id for the '<em><b>Loc Obj</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOC_OBJ = 3;

	/**
	 * The feature id for the '<em><b>Perm Role Loc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PERM_ROLE_LOC = 4;

	/**
	 * The feature id for the '<em><b>Perm Obj Loc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PERM_OBJ_LOC = 5;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 6;

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
	 * The meta object id for the '{@link LRBAC.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.PermissionImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 4;

	/**
	 * The feature id for the '<em><b>Perm Oper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERM_OPER = 0;

	/**
	 * The feature id for the '<em><b>Perm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Perm Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERM_OBJ = 2;

	/**
	 * The feature id for the '<em><b>Perm Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERM_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Role Loc Perm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ROLE_LOC_PERM = 4;

	/**
	 * The feature id for the '<em><b>Obj Loc Perm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OBJ_LOC_PERM = 5;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 6;

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
	 * The meta object id for the '{@link LRBAC.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.ObjectImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Obj Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJ_LOC = 0;

	/**
	 * The feature id for the '<em><b>Obj Perm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJ_PERM = 1;

	/**
	 * The feature id for the '<em><b>Obj ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJ_ID = 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link LRBAC.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.OperationImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Oper Perm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPER_PERM = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LRBAC.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.ReadImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getRead()
	 * @generated
	 */
	int READ = 7;

	/**
	 * The feature id for the '<em><b>Oper Perm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__OPER_PERM = OPERATION__OPER_PERM;

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
	 * The meta object id for the '{@link LRBAC.impl.WriteImpl <em>Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.WriteImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getWrite()
	 * @generated
	 */
	int WRITE = 8;

	/**
	 * The feature id for the '<em><b>Oper Perm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__OPER_PERM = OPERATION__OPER_PERM;

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
	 * The meta object id for the '{@link LRBAC.impl.ExecuteImpl <em>Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LRBAC.impl.ExecuteImpl
	 * @see LRBAC.impl.LRBACPackageImpl#getExecute()
	 * @generated
	 */
	int EXECUTE = 9;

	/**
	 * The feature id for the '<em><b>Oper Perm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__OPER_PERM = OPERATION__OPER_PERM;

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
	 * Returns the meta object for class '{@link LRBAC.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see LRBAC.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.User#getUserSess <em>User Sess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Sess</em>'.
	 * @see LRBAC.User#getUserSess()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UserSess();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.User#getAssignedRoles <em>Assigned Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Roles</em>'.
	 * @see LRBAC.User#getAssignedRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_AssignedRoles();

	/**
	 * Returns the meta object for the reference '{@link LRBAC.User#getUserLoc <em>User Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Loc</em>'.
	 * @see LRBAC.User#getUserLoc()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UserLoc();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.User#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see LRBAC.User#getGender()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Gender();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.User#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see LRBAC.User#getUserName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see LRBAC.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.User#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see LRBAC.User#getAge()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Age();

	/**
	 * Returns the meta object for the '{@link LRBAC.User#UpdateUserName(java.lang.String) <em>Update User Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update User Name</em>' operation.
	 * @see LRBAC.User#UpdateUserName(java.lang.String)
	 * @generated
	 */
	EOperation getUser__UpdateUserName__String();

	/**
	 * Returns the meta object for the '{@link LRBAC.User#UpdateAge(int) <em>Update Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Age</em>' operation.
	 * @see LRBAC.User#UpdateAge(int)
	 * @generated
	 */
	EOperation getUser__UpdateAge__int();

	/**
	 * Returns the meta object for the '{@link LRBAC.User#UpdateLoc(LRBAC.Location) <em>Update Loc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Loc</em>' operation.
	 * @see LRBAC.User#UpdateLoc(LRBAC.Location)
	 * @generated
	 */
	EOperation getUser__UpdateLoc__Location();

	/**
	 * Returns the meta object for the '{@link LRBAC.User#AssignRole(LRBAC.Role) <em>Assign Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Role</em>' operation.
	 * @see LRBAC.User#AssignRole(LRBAC.Role)
	 * @generated
	 */
	EOperation getUser__AssignRole__Role();

	/**
	 * Returns the meta object for the '{@link LRBAC.User#UpdateUserID(int) <em>Update User ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update User ID</em>' operation.
	 * @see LRBAC.User#UpdateUserID(int)
	 * @generated
	 */
	EOperation getUser__UpdateUserID__int();

	/**
	 * Returns the meta object for class '{@link LRBAC.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see LRBAC.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Session#getSessRole <em>Sess Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sess Role</em>'.
	 * @see LRBAC.Session#getSessRole()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_SessRole();

	/**
	 * Returns the meta object for the reference '{@link LRBAC.Session#getSessUser <em>Sess User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sess User</em>'.
	 * @see LRBAC.Session#getSessUser()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_SessUser();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.Session#getMaxRoles <em>Max Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Roles</em>'.
	 * @see LRBAC.Session#getMaxRoles()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_MaxRoles();

	/**
	 * Returns the meta object for the '{@link LRBAC.Session#UpdateMaxRoles(int) <em>Update Max Roles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Max Roles</em>' operation.
	 * @see LRBAC.Session#UpdateMaxRoles(int)
	 * @generated
	 */
	EOperation getSession__UpdateMaxRoles__int();

	/**
	 * Returns the meta object for class '{@link LRBAC.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see LRBAC.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Role#getAssignUser <em>Assign User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assign User</em>'.
	 * @see LRBAC.Role#getAssignUser()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_AssignUser();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Role#getAssignLoc <em>Assign Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assign Loc</em>'.
	 * @see LRBAC.Role#getAssignLoc()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_AssignLoc();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Role#getRoleSess <em>Role Sess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Sess</em>'.
	 * @see LRBAC.Role#getRoleSess()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RoleSess();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.Role#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see LRBAC.Role#getRoleName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_RoleName();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Role#getRolePerm <em>Role Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Perm</em>'.
	 * @see LRBAC.Role#getRolePerm()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RolePerm();

	/**
	 * Returns the meta object for the '{@link LRBAC.Role#UpdateRoleName(java.lang.String) <em>Update Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Role Name</em>' operation.
	 * @see LRBAC.Role#UpdateRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getRole__UpdateRoleName__String();

	/**
	 * Returns the meta object for the '{@link LRBAC.Role#AddAssignLoc(LRBAC.Location) <em>Add Assign Loc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Assign Loc</em>' operation.
	 * @see LRBAC.Role#AddAssignLoc(LRBAC.Location)
	 * @generated
	 */
	EOperation getRole__AddAssignLoc__Location();

	/**
	 * Returns the meta object for class '{@link LRBAC.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see LRBAC.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Location#getLocUser <em>Loc User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loc User</em>'.
	 * @see LRBAC.Location#getLocUser()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_LocUser();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Location#getLocAssign <em>Loc Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loc Assign</em>'.
	 * @see LRBAC.Location#getLocAssign()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_LocAssign();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.Location#getLocName <em>Loc Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Name</em>'.
	 * @see LRBAC.Location#getLocName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LocName();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Location#getLocObj <em>Loc Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loc Obj</em>'.
	 * @see LRBAC.Location#getLocObj()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_LocObj();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Location#getPermRoleLoc <em>Perm Role Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perm Role Loc</em>'.
	 * @see LRBAC.Location#getPermRoleLoc()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_PermRoleLoc();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Location#getPermObjLoc <em>Perm Obj Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perm Obj Loc</em>'.
	 * @see LRBAC.Location#getPermObjLoc()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_PermObjLoc();

	/**
	 * Returns the meta object for the '{@link LRBAC.Location#UpdateLocName(java.lang.String) <em>Update Loc Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Loc Name</em>' operation.
	 * @see LRBAC.Location#UpdateLocName(java.lang.String)
	 * @generated
	 */
	EOperation getLocation__UpdateLocName__String();

	/**
	 * Returns the meta object for class '{@link LRBAC.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see LRBAC.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference '{@link LRBAC.Permission#getPermOper <em>Perm Oper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perm Oper</em>'.
	 * @see LRBAC.Permission#getPermOper()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PermOper();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.Permission#getPermName <em>Perm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perm Name</em>'.
	 * @see LRBAC.Permission#getPermName()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_PermName();

	/**
	 * Returns the meta object for the reference '{@link LRBAC.Permission#getPermObj <em>Perm Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perm Obj</em>'.
	 * @see LRBAC.Permission#getPermObj()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PermObj();

	/**
	 * Returns the meta object for the reference '{@link LRBAC.Permission#getPermRole <em>Perm Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perm Role</em>'.
	 * @see LRBAC.Permission#getPermRole()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PermRole();

	/**
	 * Returns the meta object for the reference '{@link LRBAC.Permission#getRoleLocPerm <em>Role Loc Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Loc Perm</em>'.
	 * @see LRBAC.Permission#getRoleLocPerm()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_RoleLocPerm();

	/**
	 * Returns the meta object for the reference '{@link LRBAC.Permission#getObjLocPerm <em>Obj Loc Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj Loc Perm</em>'.
	 * @see LRBAC.Permission#getObjLocPerm()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_ObjLocPerm();

	/**
	 * Returns the meta object for the '{@link LRBAC.Permission#UpdatePermName(java.lang.String) <em>Update Perm Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Perm Name</em>' operation.
	 * @see LRBAC.Permission#UpdatePermName(java.lang.String)
	 * @generated
	 */
	EOperation getPermission__UpdatePermName__String();

	/**
	 * Returns the meta object for class '{@link LRBAC.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see LRBAC.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference '{@link LRBAC.Object#getObjLoc <em>Obj Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj Loc</em>'.
	 * @see LRBAC.Object#getObjLoc()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ObjLoc();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Object#getObjPerm <em>Obj Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Obj Perm</em>'.
	 * @see LRBAC.Object#getObjPerm()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ObjPerm();

	/**
	 * Returns the meta object for the attribute '{@link LRBAC.Object#getObjID <em>Obj ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj ID</em>'.
	 * @see LRBAC.Object#getObjID()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_ObjID();

	/**
	 * Returns the meta object for the '{@link LRBAC.Object#UpdateObjID(int) <em>Update Obj ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Obj ID</em>' operation.
	 * @see LRBAC.Object#UpdateObjID(int)
	 * @generated
	 */
	EOperation getObject__UpdateObjID__int();

	/**
	 * Returns the meta object for class '{@link LRBAC.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see LRBAC.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link LRBAC.Operation#getOperPerm <em>Oper Perm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Oper Perm</em>'.
	 * @see LRBAC.Operation#getOperPerm()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OperPerm();

	/**
	 * Returns the meta object for class '{@link LRBAC.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see LRBAC.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for class '{@link LRBAC.Write <em>Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write</em>'.
	 * @see LRBAC.Write
	 * @generated
	 */
	EClass getWrite();

	/**
	 * Returns the meta object for class '{@link LRBAC.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute</em>'.
	 * @see LRBAC.Execute
	 * @generated
	 */
	EClass getExecute();

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
		 * The meta object literal for the '{@link LRBAC.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.UserImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Sess</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER_SESS = eINSTANCE.getUser_UserSess();

		/**
		 * The meta object literal for the '<em><b>Assigned Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ASSIGNED_ROLES = eINSTANCE.getUser_AssignedRoles();

		/**
		 * The meta object literal for the '<em><b>User Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER_LOC = eINSTANCE.getUser_UserLoc();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__GENDER = eINSTANCE.getUser_Gender();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AGE = eINSTANCE.getUser_Age();

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
		 * The meta object literal for the '<em><b>Update Loc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UPDATE_LOC__LOCATION = eINSTANCE.getUser__UpdateLoc__Location();

		/**
		 * The meta object literal for the '<em><b>Assign Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ASSIGN_ROLE__ROLE = eINSTANCE.getUser__AssignRole__Role();

		/**
		 * The meta object literal for the '<em><b>Update User ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UPDATE_USER_ID__INT = eINSTANCE.getUser__UpdateUserID__int();

		/**
		 * The meta object literal for the '{@link LRBAC.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.SessionImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Sess Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__SESS_ROLE = eINSTANCE.getSession_SessRole();

		/**
		 * The meta object literal for the '<em><b>Sess User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__SESS_USER = eINSTANCE.getSession_SessUser();

		/**
		 * The meta object literal for the '<em><b>Max Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__MAX_ROLES = eINSTANCE.getSession_MaxRoles();

		/**
		 * The meta object literal for the '<em><b>Update Max Roles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___UPDATE_MAX_ROLES__INT = eINSTANCE.getSession__UpdateMaxRoles__int();

		/**
		 * The meta object literal for the '{@link LRBAC.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.RoleImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Assign User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ASSIGN_USER = eINSTANCE.getRole_AssignUser();

		/**
		 * The meta object literal for the '<em><b>Assign Loc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ASSIGN_LOC = eINSTANCE.getRole_AssignLoc();

		/**
		 * The meta object literal for the '<em><b>Role Sess</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_SESS = eINSTANCE.getRole_RoleSess();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ROLE_NAME = eINSTANCE.getRole_RoleName();

		/**
		 * The meta object literal for the '<em><b>Role Perm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_PERM = eINSTANCE.getRole_RolePerm();

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
		 * The meta object literal for the '{@link LRBAC.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.LocationImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Loc User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__LOC_USER = eINSTANCE.getLocation_LocUser();

		/**
		 * The meta object literal for the '<em><b>Loc Assign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__LOC_ASSIGN = eINSTANCE.getLocation_LocAssign();

		/**
		 * The meta object literal for the '<em><b>Loc Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOC_NAME = eINSTANCE.getLocation_LocName();

		/**
		 * The meta object literal for the '<em><b>Loc Obj</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__LOC_OBJ = eINSTANCE.getLocation_LocObj();

		/**
		 * The meta object literal for the '<em><b>Perm Role Loc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PERM_ROLE_LOC = eINSTANCE.getLocation_PermRoleLoc();

		/**
		 * The meta object literal for the '<em><b>Perm Obj Loc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PERM_OBJ_LOC = eINSTANCE.getLocation_PermObjLoc();

		/**
		 * The meta object literal for the '<em><b>Update Loc Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___UPDATE_LOC_NAME__STRING = eINSTANCE.getLocation__UpdateLocName__String();

		/**
		 * The meta object literal for the '{@link LRBAC.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.PermissionImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getPermission()
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
		 * The meta object literal for the '<em><b>Perm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__PERM_NAME = eINSTANCE.getPermission_PermName();

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
		 * The meta object literal for the '{@link LRBAC.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.ObjectImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getObject()
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
		 * The meta object literal for the '<em><b>Obj Perm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OBJ_PERM = eINSTANCE.getObject_ObjPerm();

		/**
		 * The meta object literal for the '<em><b>Obj ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__OBJ_ID = eINSTANCE.getObject_ObjID();

		/**
		 * The meta object literal for the '<em><b>Update Obj ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT___UPDATE_OBJ_ID__INT = eINSTANCE.getObject__UpdateObjID__int();

		/**
		 * The meta object literal for the '{@link LRBAC.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.OperationImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Oper Perm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPER_PERM = eINSTANCE.getOperation_OperPerm();

		/**
		 * The meta object literal for the '{@link LRBAC.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.ReadImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '{@link LRBAC.impl.WriteImpl <em>Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.WriteImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getWrite()
		 * @generated
		 */
		EClass WRITE = eINSTANCE.getWrite();

		/**
		 * The meta object literal for the '{@link LRBAC.impl.ExecuteImpl <em>Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LRBAC.impl.ExecuteImpl
		 * @see LRBAC.impl.LRBACPackageImpl#getExecute()
		 * @generated
		 */
		EClass EXECUTE = eINSTANCE.getExecute();

	}

} //LRBACPackage
