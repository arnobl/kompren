/**
 */
package LRBAC2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC2.Object#getObjLoc <em>Obj Loc</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC2.LRBACPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Obj Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Loc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Loc</em>' reference.
	 * @see #setObjLoc(Location)
	 * @see LRBAC2.LRBACPackage#getObject_ObjLoc()
	 * @model required="true"
	 * @generated
	 */
	Location getObjLoc();

	/**
	 * Sets the value of the '{@link LRBAC2.Object#getObjLoc <em>Obj Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Loc</em>' reference.
	 * @see #getObjLoc()
	 * @generated
	 */
	void setObjLoc(Location value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateObjID(int id);

} // Object
