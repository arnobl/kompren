/**
 */
package LRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC.Object#getObjLoc <em>Obj Loc</em>}</li>
 *   <li>{@link LRBAC.Object#getObjPerm <em>Obj Perm</em>}</li>
 *   <li>{@link LRBAC.Object#getObjID <em>Obj ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC.LRBACPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Obj Loc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LRBAC.Location#getLocObj <em>Loc Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Loc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Loc</em>' reference.
	 * @see #setObjLoc(Location)
	 * @see LRBAC.LRBACPackage#getObject_ObjLoc()
	 * @see LRBAC.Location#getLocObj
	 * @model opposite="LocObj" required="true"
	 * @generated
	 */
	Location getObjLoc();

	/**
	 * Sets the value of the '{@link LRBAC.Object#getObjLoc <em>Obj Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Loc</em>' reference.
	 * @see #getObjLoc()
	 * @generated
	 */
	void setObjLoc(Location value);

	/**
	 * Returns the value of the '<em><b>Obj Perm</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Permission#getPermObj <em>Perm Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Perm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Perm</em>' reference list.
	 * @see LRBAC.LRBACPackage#getObject_ObjPerm()
	 * @see LRBAC.Permission#getPermObj
	 * @model opposite="PermObj"
	 * @generated
	 */
	EList<Permission> getObjPerm();

	/**
	 * Returns the value of the '<em><b>Obj ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj ID</em>' attribute.
	 * @see #setObjID(int)
	 * @see LRBAC.LRBACPackage#getObject_ObjID()
	 * @model
	 * @generated
	 */
	int getObjID();

	/**
	 * Sets the value of the '{@link LRBAC.Object#getObjID <em>Obj ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj ID</em>' attribute.
	 * @see #getObjID()
	 * @generated
	 */
	void setObjID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateObjID(int id);

} // Object
