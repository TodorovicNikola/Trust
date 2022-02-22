/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Capability#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link process_modeling.Capability#isRequiresStorage <em>Requires Storage</em>}</li>
 *   <li>{@link process_modeling.Capability#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends IDNamedElement, Persistable {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getCapability_Constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Requires Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Storage</em>' attribute.
	 * @see #setRequiresStorage(boolean)
	 * @see process_modeling.Process_modelingPackage#getCapability_RequiresStorage()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequiresStorage();

	/**
	 * Sets the value of the '{@link process_modeling.Capability#isRequiresStorage <em>Requires Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Storage</em>' attribute.
	 * @see #isRequiresStorage()
	 * @generated
	 */
	void setRequiresStorage(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getCapability_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Capability
