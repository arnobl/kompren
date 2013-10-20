/**
 */
package ex.classModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ex.classModel.ClassModelFactory
 * @model kind="package"
 * @generated
 */
public interface ClassModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.kermeta.ki.pruning.examples/src/kermeta/class/ClassModel.ecore#/ex/classModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassModelPackage eINSTANCE = ex.classModel.impl.ClassModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ex.classModel.impl.ClassModelImpl <em>Class Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.classModel.impl.ClassModelImpl
	 * @see ex.classModel.impl.ClassModelPackageImpl#getClassModel()
	 * @generated
	 */
	int CLASS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MODEL__CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Class Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ex.classModel.impl.ClazzImpl <em>Clazz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ex.classModel.impl.ClazzImpl
	 * @see ex.classModel.impl.ClassModelPackageImpl#getClazz()
	 * @generated
	 */
	int CLAZZ = 1;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__SUPER_CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__NAME = 1;

	/**
	 * The number of structural features of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ex.classModel.ClassModel <em>Class Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Model</em>'.
	 * @see ex.classModel.ClassModel
	 * @generated
	 */
	EClass getClassModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ex.classModel.ClassModel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ex.classModel.ClassModel#getClasses()
	 * @see #getClassModel()
	 * @generated
	 */
	EReference getClassModel_Classes();

	/**
	 * Returns the meta object for class '{@link ex.classModel.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clazz</em>'.
	 * @see ex.classModel.Clazz
	 * @generated
	 */
	EClass getClazz();

	/**
	 * Returns the meta object for the reference list '{@link ex.classModel.Clazz#getSuperClasses <em>Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Classes</em>'.
	 * @see ex.classModel.Clazz#getSuperClasses()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_SuperClasses();

	/**
	 * Returns the meta object for the attribute '{@link ex.classModel.Clazz#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ex.classModel.Clazz#getName()
	 * @see #getClazz()
	 * @generated
	 */
	EAttribute getClazz_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassModelFactory getClassModelFactory();

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
		 * The meta object literal for the '{@link ex.classModel.impl.ClassModelImpl <em>Class Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.classModel.impl.ClassModelImpl
		 * @see ex.classModel.impl.ClassModelPackageImpl#getClassModel()
		 * @generated
		 */
		EClass CLASS_MODEL = eINSTANCE.getClassModel();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MODEL__CLASSES = eINSTANCE.getClassModel_Classes();

		/**
		 * The meta object literal for the '{@link ex.classModel.impl.ClazzImpl <em>Clazz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ex.classModel.impl.ClazzImpl
		 * @see ex.classModel.impl.ClassModelPackageImpl#getClazz()
		 * @generated
		 */
		EClass CLAZZ = eINSTANCE.getClazz();

		/**
		 * The meta object literal for the '<em><b>Super Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__SUPER_CLASSES = eINSTANCE.getClazz_SuperClasses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAZZ__NAME = eINSTANCE.getClazz_Name();

	}

} //ClassModelPackage
