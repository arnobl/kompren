/**
 */
package kompren;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the elements to be sliced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kompren.SlicedElement#isIsOption <em>Is Option</em>}</li>
 *   <li>{@link kompren.SlicedElement#getExpression <em>Expression</em>}</li>
 *   <li>{@link kompren.SlicedElement#getDomain <em>Domain</em>}</li>
 *   <li>{@link kompren.SlicedElement#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see kompren.KomprenPackage#getSlicedElement()
 * @model abstract="true"
 * @generated
 */
public interface SlicedElement<T extends ENamedElement> extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Inria/IRISA Diverse Team";

	/**
	 * Returns the value of the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If optional, an option will be added to the slicer to state whether this slicing element has to be considered during the slicing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Option</em>' attribute.
	 * @see #setIsOption(boolean)
	 * @see kompren.KomprenPackage#getSlicedElement_IsOption()
	 * @model
	 * @generated
	 */
	boolean isIsOption();

	/**
	 * Sets the value of the '{@link kompren.SlicedElement#isIsOption <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Option</em>' attribute.
	 * @see #isIsOption()
	 * @generated
	 */
	void setIsOption(boolean value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Kermeta 3 code executed when an instance of this element is sliced. Does not work with strict slicer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see kompren.KomprenPackage#getSlicedElement_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link kompren.SlicedElement#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(ENamedElement)
	 * @see kompren.KomprenPackage#getSlicedElement_Domain()
	 * @model required="true"
	 * @generated
	 */
	T getDomain();

	/**
	 * Sets the value of the '{@link kompren.SlicedElement#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(T value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link kompren.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraints associated to the sliced element. Each constraint leads to a parameter of the slicer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see kompren.KomprenPackage#getSlicedElement_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // SlicedElement
