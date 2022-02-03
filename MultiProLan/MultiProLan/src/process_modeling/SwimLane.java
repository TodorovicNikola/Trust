/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swim Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.SwimLane#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link process_modeling.SwimLane#getOrganizationRole <em>Organization Role</em>}</li>
 *   <li>{@link process_modeling.SwimLane#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getSwimLane()
 * @model
 * @generated
 */
public interface SwimLane extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute.
	 * @see #setOrganizationName(String)
	 * @see process_modeling.Process_modelingPackage#getSwimLane_OrganizationName()
	 * @model required="true"
	 * @generated
	 */
	String getOrganizationName();

	/**
	 * Sets the value of the '{@link process_modeling.SwimLane#getOrganizationName <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Name</em>' attribute.
	 * @see #getOrganizationName()
	 * @generated
	 */
	void setOrganizationName(String value);

	/**
	 * Returns the value of the '<em><b>Organization Role</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EOrganizationRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Role</em>' attribute.
	 * @see process_modeling.EOrganizationRole
	 * @see #setOrganizationRole(EOrganizationRole)
	 * @see process_modeling.Process_modelingPackage#getSwimLane_OrganizationRole()
	 * @model required="true"
	 * @generated
	 */
	EOrganizationRole getOrganizationRole();

	/**
	 * Sets the value of the '{@link process_modeling.SwimLane#getOrganizationRole <em>Organization Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Role</em>' attribute.
	 * @see process_modeling.EOrganizationRole
	 * @see #getOrganizationRole()
	 * @generated
	 */
	void setOrganizationRole(EOrganizationRole value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.ProcessElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getSwimLane_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessElement> getElements();

} // SwimLane
