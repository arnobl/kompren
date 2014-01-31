/**
 */
package kompren.impl;

import kompren.*;

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
public class KomprenFactoryImpl extends EFactoryImpl implements KomprenFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Inria/IRISA Diverse Team";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KomprenFactory init() {
		try {
			KomprenFactory theKomprenFactory = (KomprenFactory)EPackage.Registry.INSTANCE.getEFactory(KomprenPackage.eNS_URI);
			if (theKomprenFactory != null) {
				return theKomprenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KomprenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KomprenFactoryImpl() {
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
			case KomprenPackage.SLICER: return createSlicer();
			case KomprenPackage.CONSTRAINT: return createConstraint();
			case KomprenPackage.RADIUS: return createRadius();
			case KomprenPackage.SLICED_CLASS: return createSlicedClass();
			case KomprenPackage.SLICED_PROPERTY: return createSlicedProperty();
			case KomprenPackage.OPPOSITE_CREATION: return createOppositeCreation();
			case KomprenPackage.VAR_DECL: return createVarDecl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slicer createSlicer() {
		SlicerImpl slicer = new SlicerImpl();
		return slicer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Radius createRadius() {
		RadiusImpl radius = new RadiusImpl();
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicedClass createSlicedClass() {
		SlicedClassImpl slicedClass = new SlicedClassImpl();
		return slicedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicedProperty createSlicedProperty() {
		SlicedPropertyImpl slicedProperty = new SlicedPropertyImpl();
		return slicedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositeCreation createOppositeCreation() {
		OppositeCreationImpl oppositeCreation = new OppositeCreationImpl();
		return oppositeCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl createVarDecl() {
		VarDeclImpl varDecl = new VarDeclImpl();
		return varDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KomprenPackage getKomprenPackage() {
		return (KomprenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KomprenPackage getPackage() {
		return KomprenPackage.eINSTANCE;
	}

} //KomprenFactoryImpl
