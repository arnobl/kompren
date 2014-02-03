/**
 */
package kompren;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompren.SlicedProperty#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kompren.SlicedProperty#getSrc <em>Src</em>}</li>
 *   <li>{@link kompren.SlicedProperty#getTgt <em>Tgt</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompren.KomprenPackage#getSlicedProperty()
 * @model
 * @generated
 */
public interface SlicedProperty extends SlicedElement<EStructuralFeature> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Inria/IRISA Diverse Team";

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' containment reference.
	 * @see #setOpposite(OppositeCreation)
	 * @see kompren.KomprenPackage#getSlicedProperty_Opposite()
	 * @model containment="true"
	 * @generated
	 */
	OppositeCreation getOpposite();

	/**
	 * Sets the value of the '{@link kompren.SlicedProperty#getOpposite <em>Opposite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' containment reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(OppositeCreation value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' containment reference.
	 * @see #setSrc(VarDecl)
	 * @see kompren.KomprenPackage#getSlicedProperty_Src()
	 * @model containment="true"
	 * @generated
	 */
	VarDecl getSrc();

	/**
	 * Sets the value of the '{@link kompren.SlicedProperty#getSrc <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' containment reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(VarDecl value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' containment reference.
	 * @see #setTgt(VarDecl)
	 * @see kompren.KomprenPackage#getSlicedProperty_Tgt()
	 * @model containment="true"
	 * @generated
	 */
	VarDecl getTgt();

	/**
	 * Sets the value of the '{@link kompren.SlicedProperty#getTgt <em>Tgt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' containment reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(VarDecl value);

} // SlicedProperty
