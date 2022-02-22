/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Organization#getRole <em>Role</em>}</li>
 *   <li>{@link process_modeling.Organization#getElements <em>Elements</em>}</li>
 *   <li>{@link process_modeling.Organization#getDltPeerAddress <em>Dlt Peer Address</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EOrganizationRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see process_modeling.EOrganizationRole
	 * @see #setRole(EOrganizationRole)
	 * @see process_modeling.Process_modelingPackage#getOrganization_Role()
	 * @model required="true"
	 * @generated
	 */
	EOrganizationRole getRole();

	/**
	 * Sets the value of the '{@link process_modeling.Organization#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see process_modeling.EOrganizationRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(EOrganizationRole value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.ProcessElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getOrganization_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessElement> getElements();

	/**
	 * Returns the value of the '<em><b>Dlt Peer Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dlt Peer Address</em>' attribute.
	 * @see #setDltPeerAddress(String)
	 * @see process_modeling.Process_modelingPackage#getOrganization_DltPeerAddress()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getDltPeerAddress();

	/**
	 * Sets the value of the '{@link process_modeling.Organization#getDltPeerAddress <em>Dlt Peer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dlt Peer Address</em>' attribute.
	 * @see #getDltPeerAddress()
	 * @generated
	 */
	void setDltPeerAddress(String value);

} // Organization
