/**
 */
package LRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LRBAC.Operation#getOperPerm <em>Oper Perm</em>}</li>
 * </ul>
 * </p>
 *
 * @see LRBAC.LRBACPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Oper Perm</b></em>' reference list.
	 * The list contents are of type {@link LRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link LRBAC.Permission#getPermOper <em>Perm Oper</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oper Perm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oper Perm</em>' reference list.
	 * @see LRBAC.LRBACPackage#getOperation_OperPerm()
	 * @see LRBAC.Permission#getPermOper
	 * @model opposite="PermOper"
	 * @generated
	 */
	EList<Permission> getOperPerm();

} // Operation
