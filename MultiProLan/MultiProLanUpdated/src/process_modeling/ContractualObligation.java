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
 *   <li>{@link process_modeling.ContractualObligation#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getContractualObligation()
 * @model
 * @generated
 */
public interface ContractualObligation extends Persistable, IDNamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getContractualObligation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // ContractualObligation
