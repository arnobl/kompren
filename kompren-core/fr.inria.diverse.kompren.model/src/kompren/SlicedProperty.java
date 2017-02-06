/**
 */
package kompren;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When a property is selected from the input metamodels, instances of this property will be sliced and put in the output model slice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kompren.SlicedProperty#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kompren.SlicedProperty#getSrc <em>Src</em>}</li>
 *   <li>{@link kompren.SlicedProperty#getTgt <em>Tgt</em>}</li>
 * </ul>
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
	 * <!-- begin-model-doc -->
	 * State whether the property will be visited in its opposite way. This is useful to slice a model in directions normally not possible.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * The alias name of the source of the property.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * The alias name of the target of the property.
	 * <!-- end-model-doc -->
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
