/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.VirtualOrganization#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link process_modeling.VirtualOrganization#getEndorsementPolicy <em>Endorsement Policy</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getVirtualOrganization()
 * @model
 * @generated
 */
public interface VirtualOrganization extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getVirtualOrganization_Organizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Organization> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Endorsement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endorsement Policy</em>' attribute.
	 * @see #setEndorsementPolicy(String)
	 * @see process_modeling.Process_modelingPackage#getVirtualOrganization_EndorsementPolicy()
	 * @model unique="false"
	 * @generated
	 */
	String getEndorsementPolicy();

	/**
	 * Sets the value of the '{@link process_modeling.VirtualOrganization#getEndorsementPolicy <em>Endorsement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorsement Policy</em>' attribute.
	 * @see #getEndorsementPolicy()
	 * @generated
	 */
	void setEndorsementPolicy(String value);

} // VirtualOrganization
