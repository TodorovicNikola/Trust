/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unordered Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.UnorderedSteps#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getUnorderedSteps()
 * @model
 * @generated
 */
public interface UnorderedSteps extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.ProcessStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getUnorderedSteps_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessStep> getSteps();

} // UnorderedSteps
