/**
 */
package ex.classModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ex.classModel.ClassModel#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ex.classModel.ClassModelPackage#getClassModel()
 * @model
 * @generated
 */
public interface ClassModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ex.classModel.Clazz}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ex.classModel.ClassModelPackage#getClassModel_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clazz> getClasses();

} // ClassModel
