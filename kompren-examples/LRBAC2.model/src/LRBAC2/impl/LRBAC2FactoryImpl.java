/**
 */
package LRBAC2.impl;

import LRBAC2.Execute;
import LRBAC2.LRBAC2Factory;
import LRBAC2.LRBAC2Package;
import LRBAC2.Location;
import LRBAC2.Operation;
import LRBAC2.Permission;
import LRBAC2.Read;
import LRBAC2.Role;
import LRBAC2.Session;
import LRBAC2.User;
import LRBAC2.Write;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LRBAC2FactoryImpl extends EFactoryImpl implements LRBAC2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LRBAC2Factory init() {
		try {
			LRBAC2Factory theLRBAC2Factory = (LRBAC2Factory)EPackage.Registry.INSTANCE.getEFactory(LRBAC2Package.eNS_URI);
			if (theLRBAC2Factory != null) {
				return theLRBAC2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LRBAC2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRBAC2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LRBAC2Package.USER: return createUser();
			case LRBAC2Package.LOCATION: return createLocation();
			case LRBAC2Package.PERMISSION: return createPermission();
			case LRBAC2Package.OPERATION: return createOperation();
			case LRBAC2Package.WRITE: return createWrite();
			case LRBAC2Package.EXECUTE: return createExecute();
			case LRBAC2Package.READ: return createRead();
			case LRBAC2Package.OBJECT: return createObject();
			case LRBAC2Package.ROLE: return createRole();
			case LRBAC2Package.SESSION: return createSession();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Write createWrite() {
		WriteImpl write = new WriteImpl();
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execute createExecute() {
		ExecuteImpl execute = new ExecuteImpl();
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRBAC2.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRBAC2Package getLRBAC2Package() {
		return (LRBAC2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LRBAC2Package getPackage() {
		return LRBAC2Package.eINSTANCE;
	}

} //LRBAC2FactoryImpl
