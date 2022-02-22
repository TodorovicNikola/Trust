/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.SubProcess#getProcess <em>Process</em>}</li>
 *   <li>{@link process_modeling.SubProcess#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(process_modeling.Process)
	 * @see process_modeling.Process_modelingPackage#getSubProcess_Process()
	 * @model required="true"
	 * @generated
	 */
	process_modeling.Process getProcess();

	/**
	 * Sets the value of the '{@link process_modeling.SubProcess#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(process_modeling.Process value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.ProcessParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getSubProcess_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessParameter> getParameters();

} // SubProcess
