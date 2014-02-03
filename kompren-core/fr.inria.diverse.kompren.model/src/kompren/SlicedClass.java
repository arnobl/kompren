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
 * </ul>
 * </p>
 *
 * @see kompren.KomprenPackage#getSlicedClass()
 * @model
 * @generated
 */
public interface SlicedClass extends SlicedElement<EClass> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Inria/IRISA Diverse Team";

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

} // SlicedClass
