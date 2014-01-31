/**
 */
package kompren;

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
 * @see kompren.KomprenFactory
 * @model kind="package"
 * @generated
 */
public interface KomprenPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Inria/IRISA Diverse Team";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kompren";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kompren/fr.inria.diverse.kompren";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kompren";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KomprenPackage eINSTANCE = kompren.impl.KomprenPackageImpl.init();

	/**
	 * The meta object id for the '{@link kompren.impl.SlicerImpl <em>Slicer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompren.impl.SlicerImpl
	 * @see kompren.impl.KomprenPackageImpl#getSlicer()
	 * @generated
	 */
	int SLICER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri Metamodel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__URI_METAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__STRICT = 3;

	/**
	 * The feature id for the '<em><b>Helper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__HELPER = 4;

	/**
	 * The feature id for the '<em><b>On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__ON_START = 5;

	/**
	 * The feature id for the '<em><b>On End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__ON_END = 6;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__RADIUS = 8;

	/**
	 * The feature id for the '<em><b>Sliced Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__SLICED_ELEMENTS = 9;

	/**
	 * The feature id for the '<em><b>Input Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER__INPUT_CLASSES = 10;

	/**
	 * The number of structural features of the '<em>Slicer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Slicer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompren.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompren.impl.ConstraintImpl
	 * @see kompren.impl.KomprenPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompren.impl.RadiusImpl <em>Radius</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompren.impl.RadiusImpl
	 * @see kompren.impl.KomprenPackageImpl#getRadius()
	 * @generated
	 */
	int RADIUS = 2;

	/**
	 * The feature id for the '<em><b>Focused Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIUS__FOCUSED_CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Radius</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompren.impl.SlicedElementImpl <em>Sliced Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompren.impl.SlicedElementImpl
	 * @see kompren.impl.KomprenPackageImpl#getSlicedElement()
	 * @generated
	 */
	int SLICED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_ELEMENT__IS_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_ELEMENT__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Sliced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sliced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompren.impl.SlicedClassImpl <em>Sliced Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompren.impl.SlicedClassImpl
	 * @see kompren.impl.KomprenPackageImpl#getSlicedClass()
	 * @generated
	 */
	int SLICED_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS__IS_OPTION = SLICED_ELEMENT__IS_OPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS__EXPRESSION = SLICED_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS__CTX = SLICED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS__DOMAIN = SLICED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sliced Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS_FEATURE_COUNT = SLICED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sliced Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_CLASS_OPERATION_COUNT = SLICED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kompren.impl.SlicedPropertyImpl <em>Sliced Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompren.impl.SlicedPropertyImpl
	 * @see kompren.impl.KomprenPackageImpl#getSlicedProperty()
	 * @generated
	 */
	int SLICED_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__IS_OPTION = SLICED_ELEMENT__IS_OPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__EXPRESSION = SLICED_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__OPPOSITE = SLICED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__SRC = SLICED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__TGT = SLICED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY__DOMAIN = SLICED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sliced Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY_FEATURE_COUNT = SLICED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sliced Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICED_PROPERTY_OPERATION_COUNT = SLICED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kompren.impl.OppositeCreationImpl <em>Opposite Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompren.impl.OppositeCreationImpl
	 * @see kompren.impl.KomprenPackageImpl#getOppositeCreation()
	 * @generated
	 */
	int OPPOSITE_CREATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_CREATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Opposite Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_CREATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Opposite Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_CREATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kompren.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kompren.impl.VarDeclImpl
	 * @see kompren.impl.KomprenPackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__VAR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link kompren.Slicer <em>Slicer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slicer</em>'.
	 * @see kompren.Slicer
	 * @generated
	 */
	EClass getSlicer();

	/**
	 * Returns the meta object for the attribute '{@link kompren.Slicer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kompren.Slicer#getName()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_Name();

	/**
	 * Returns the meta object for the attribute list '{@link kompren.Slicer#getUriMetamodel <em>Uri Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uri Metamodel</em>'.
	 * @see kompren.Slicer#getUriMetamodel()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_UriMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link kompren.Slicer#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see kompren.Slicer#isActive()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_Active();

	/**
	 * Returns the meta object for the attribute '{@link kompren.Slicer#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see kompren.Slicer#isStrict()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_Strict();

	/**
	 * Returns the meta object for the attribute '{@link kompren.Slicer#getHelper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Helper</em>'.
	 * @see kompren.Slicer#getHelper()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_Helper();

	/**
	 * Returns the meta object for the attribute '{@link kompren.Slicer#getOnStart <em>On Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Start</em>'.
	 * @see kompren.Slicer#getOnStart()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_OnStart();

	/**
	 * Returns the meta object for the attribute '{@link kompren.Slicer#getOnEnd <em>On End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On End</em>'.
	 * @see kompren.Slicer#getOnEnd()
	 * @see #getSlicer()
	 * @generated
	 */
	EAttribute getSlicer_OnEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link kompren.Slicer#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see kompren.Slicer#getConstraints()
	 * @see #getSlicer()
	 * @generated
	 */
	EReference getSlicer_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link kompren.Slicer#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Radius</em>'.
	 * @see kompren.Slicer#getRadius()
	 * @see #getSlicer()
	 * @generated
	 */
	EReference getSlicer_Radius();

	/**
	 * Returns the meta object for the containment reference list '{@link kompren.Slicer#getSlicedElements <em>Sliced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sliced Elements</em>'.
	 * @see kompren.Slicer#getSlicedElements()
	 * @see #getSlicer()
	 * @generated
	 */
	EReference getSlicer_SlicedElements();

	/**
	 * Returns the meta object for the reference list '{@link kompren.Slicer#getInputClasses <em>Input Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Classes</em>'.
	 * @see kompren.Slicer#getInputClasses()
	 * @see #getSlicer()
	 * @generated
	 */
	EReference getSlicer_InputClasses();

	/**
	 * Returns the meta object for class '{@link kompren.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see kompren.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link kompren.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see kompren.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Expression();

	/**
	 * Returns the meta object for the attribute '{@link kompren.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kompren.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for class '{@link kompren.Radius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radius</em>'.
	 * @see kompren.Radius
	 * @generated
	 */
	EClass getRadius();

	/**
	 * Returns the meta object for the reference list '{@link kompren.Radius#getFocusedClasses <em>Focused Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Focused Classes</em>'.
	 * @see kompren.Radius#getFocusedClasses()
	 * @see #getRadius()
	 * @generated
	 */
	EReference getRadius_FocusedClasses();

	/**
	 * Returns the meta object for class '{@link kompren.SlicedClass <em>Sliced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliced Class</em>'.
	 * @see kompren.SlicedClass
	 * @generated
	 */
	EClass getSlicedClass();

	/**
	 * Returns the meta object for the containment reference '{@link kompren.SlicedClass#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ctx</em>'.
	 * @see kompren.SlicedClass#getCtx()
	 * @see #getSlicedClass()
	 * @generated
	 */
	EReference getSlicedClass_Ctx();

	/**
	 * Returns the meta object for the reference '{@link kompren.SlicedClass#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see kompren.SlicedClass#getDomain()
	 * @see #getSlicedClass()
	 * @generated
	 */
	EReference getSlicedClass_Domain();

	/**
	 * Returns the meta object for class '{@link kompren.SlicedProperty <em>Sliced Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliced Property</em>'.
	 * @see kompren.SlicedProperty
	 * @generated
	 */
	EClass getSlicedProperty();

	/**
	 * Returns the meta object for the containment reference '{@link kompren.SlicedProperty#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opposite</em>'.
	 * @see kompren.SlicedProperty#getOpposite()
	 * @see #getSlicedProperty()
	 * @generated
	 */
	EReference getSlicedProperty_Opposite();

	/**
	 * Returns the meta object for the containment reference '{@link kompren.SlicedProperty#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see kompren.SlicedProperty#getSrc()
	 * @see #getSlicedProperty()
	 * @generated
	 */
	EReference getSlicedProperty_Src();

	/**
	 * Returns the meta object for the containment reference '{@link kompren.SlicedProperty#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tgt</em>'.
	 * @see kompren.SlicedProperty#getTgt()
	 * @see #getSlicedProperty()
	 * @generated
	 */
	EReference getSlicedProperty_Tgt();

	/**
	 * Returns the meta object for the reference '{@link kompren.SlicedProperty#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see kompren.SlicedProperty#getDomain()
	 * @see #getSlicedProperty()
	 * @generated
	 */
	EReference getSlicedProperty_Domain();

	/**
	 * Returns the meta object for class '{@link kompren.OppositeCreation <em>Opposite Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opposite Creation</em>'.
	 * @see kompren.OppositeCreation
	 * @generated
	 */
	EClass getOppositeCreation();

	/**
	 * Returns the meta object for the attribute '{@link kompren.OppositeCreation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kompren.OppositeCreation#getName()
	 * @see #getOppositeCreation()
	 * @generated
	 */
	EAttribute getOppositeCreation_Name();

	/**
	 * Returns the meta object for class '{@link kompren.SlicedElement <em>Sliced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliced Element</em>'.
	 * @see kompren.SlicedElement
	 * @generated
	 */
	EClass getSlicedElement();

	/**
	 * Returns the meta object for the attribute '{@link kompren.SlicedElement#isIsOption <em>Is Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Option</em>'.
	 * @see kompren.SlicedElement#isIsOption()
	 * @see #getSlicedElement()
	 * @generated
	 */
	EAttribute getSlicedElement_IsOption();

	/**
	 * Returns the meta object for the attribute '{@link kompren.SlicedElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see kompren.SlicedElement#getExpression()
	 * @see #getSlicedElement()
	 * @generated
	 */
	EAttribute getSlicedElement_Expression();

	/**
	 * Returns the meta object for class '{@link kompren.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see kompren.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for the attribute '{@link kompren.VarDecl#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see kompren.VarDecl#getVarName()
	 * @see #getVarDecl()
	 * @generated
	 */
	EAttribute getVarDecl_VarName();

	/**
	 * Returns the meta object for the reference '{@link kompren.VarDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see kompren.VarDecl#getType()
	 * @see #getVarDecl()
	 * @generated
	 */
	EReference getVarDecl_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KomprenFactory getKomprenFactory();

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
		 * The meta object literal for the '{@link kompren.impl.SlicerImpl <em>Slicer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompren.impl.SlicerImpl
		 * @see kompren.impl.KomprenPackageImpl#getSlicer()
		 * @generated
		 */
		EClass SLICER = eINSTANCE.getSlicer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__NAME = eINSTANCE.getSlicer_Name();

		/**
		 * The meta object literal for the '<em><b>Uri Metamodel</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__URI_METAMODEL = eINSTANCE.getSlicer_UriMetamodel();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__ACTIVE = eINSTANCE.getSlicer_Active();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__STRICT = eINSTANCE.getSlicer_Strict();

		/**
		 * The meta object literal for the '<em><b>Helper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__HELPER = eINSTANCE.getSlicer_Helper();

		/**
		 * The meta object literal for the '<em><b>On Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__ON_START = eINSTANCE.getSlicer_OnStart();

		/**
		 * The meta object literal for the '<em><b>On End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICER__ON_END = eINSTANCE.getSlicer_OnEnd();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICER__CONSTRAINTS = eINSTANCE.getSlicer_Constraints();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICER__RADIUS = eINSTANCE.getSlicer_Radius();

		/**
		 * The meta object literal for the '<em><b>Sliced Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICER__SLICED_ELEMENTS = eINSTANCE.getSlicer_SlicedElements();

		/**
		 * The meta object literal for the '<em><b>Input Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICER__INPUT_CLASSES = eINSTANCE.getSlicer_InputClasses();

		/**
		 * The meta object literal for the '{@link kompren.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompren.impl.ConstraintImpl
		 * @see kompren.impl.KomprenPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '{@link kompren.impl.RadiusImpl <em>Radius</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompren.impl.RadiusImpl
		 * @see kompren.impl.KomprenPackageImpl#getRadius()
		 * @generated
		 */
		EClass RADIUS = eINSTANCE.getRadius();

		/**
		 * The meta object literal for the '<em><b>Focused Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIUS__FOCUSED_CLASSES = eINSTANCE.getRadius_FocusedClasses();

		/**
		 * The meta object literal for the '{@link kompren.impl.SlicedClassImpl <em>Sliced Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompren.impl.SlicedClassImpl
		 * @see kompren.impl.KomprenPackageImpl#getSlicedClass()
		 * @generated
		 */
		EClass SLICED_CLASS = eINSTANCE.getSlicedClass();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_CLASS__CTX = eINSTANCE.getSlicedClass_Ctx();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_CLASS__DOMAIN = eINSTANCE.getSlicedClass_Domain();

		/**
		 * The meta object literal for the '{@link kompren.impl.SlicedPropertyImpl <em>Sliced Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompren.impl.SlicedPropertyImpl
		 * @see kompren.impl.KomprenPackageImpl#getSlicedProperty()
		 * @generated
		 */
		EClass SLICED_PROPERTY = eINSTANCE.getSlicedProperty();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_PROPERTY__OPPOSITE = eINSTANCE.getSlicedProperty_Opposite();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_PROPERTY__SRC = eINSTANCE.getSlicedProperty_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_PROPERTY__TGT = eINSTANCE.getSlicedProperty_Tgt();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICED_PROPERTY__DOMAIN = eINSTANCE.getSlicedProperty_Domain();

		/**
		 * The meta object literal for the '{@link kompren.impl.OppositeCreationImpl <em>Opposite Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompren.impl.OppositeCreationImpl
		 * @see kompren.impl.KomprenPackageImpl#getOppositeCreation()
		 * @generated
		 */
		EClass OPPOSITE_CREATION = eINSTANCE.getOppositeCreation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPOSITE_CREATION__NAME = eINSTANCE.getOppositeCreation_Name();

		/**
		 * The meta object literal for the '{@link kompren.impl.SlicedElementImpl <em>Sliced Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompren.impl.SlicedElementImpl
		 * @see kompren.impl.KomprenPackageImpl#getSlicedElement()
		 * @generated
		 */
		EClass SLICED_ELEMENT = eINSTANCE.getSlicedElement();

		/**
		 * The meta object literal for the '<em><b>Is Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICED_ELEMENT__IS_OPTION = eINSTANCE.getSlicedElement_IsOption();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICED_ELEMENT__EXPRESSION = eINSTANCE.getSlicedElement_Expression();

		/**
		 * The meta object literal for the '{@link kompren.impl.VarDeclImpl <em>Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kompren.impl.VarDeclImpl
		 * @see kompren.impl.KomprenPackageImpl#getVarDecl()
		 * @generated
		 */
		EClass VAR_DECL = eINSTANCE.getVarDecl();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DECL__VAR_NAME = eINSTANCE.getVarDecl_VarName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

	}

} //KomprenPackage
