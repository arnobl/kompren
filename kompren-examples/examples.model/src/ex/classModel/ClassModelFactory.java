/**
 */
package ex.classModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ex.classModel.ClassModelPackage
 * @generated
 */
public interface ClassModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassModelFactory eINSTANCE = ex.classModel.impl.ClassModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Model</em>'.
	 * @generated
	 */
	ClassModel createClassModel();

	/**
	 * Returns a new object of class '<em>Clazz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clazz</em>'.
	 * @generated
	 */
	Clazz createClazz();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClassModelPackage getClassModelPackage();

} //ClassModelFactory
