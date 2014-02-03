/**
 */
package kompren;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompren.SlicedElement#isIsOption <em>Is Option</em>}</li>
 *   <li>{@link kompren.SlicedElement#getExpression <em>Expression</em>}</li>
 *   <li>{@link kompren.SlicedElement#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
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

} // SlicedElement
