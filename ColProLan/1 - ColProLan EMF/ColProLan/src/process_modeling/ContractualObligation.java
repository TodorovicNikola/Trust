/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contractual Obligation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.ContractualObligation#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getContractualObligation()
 * @model
 * @generated
 */
public interface ContractualObligation extends Persistable, IDNamedElement {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getContractualObligation_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // ContractualObligation
