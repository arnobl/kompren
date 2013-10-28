/**
 */
package kompren;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompren.SlicedClass#getCtx <em>Ctx</em>}</li>
 *   <li>{@link kompren.SlicedClass#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompren.KomprenPackage#getSlicedClass()
 * @model
 * @generated
 */
public interface SlicedClass extends SlicedElement {
	/**
	 * Returns the value of the '<em><b>Ctx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx</em>' containment reference.
	 * @see #setCtx(VarDecl)
	 * @see kompren.KomprenPackage#getSlicedClass_Ctx()
	 * @model containment="true"
	 * @generated
	 */
	VarDecl getCtx();

	/**
	 * Sets the value of the '{@link kompren.SlicedClass#getCtx <em>Ctx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx</em>' containment reference.
	 * @see #getCtx()
	 * @generated
	 */
	void setCtx(VarDecl value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(EClass)
	 * @see kompren.KomprenPackage#getSlicedClass_Domain()
	 * @model required="true"
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Sets the value of the '{@link kompren.SlicedClass#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(EClass value);

} // SlicedClass