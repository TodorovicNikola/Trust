/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Resource#isIsActuator <em>Is Actuator</em>}</li>
 *   <li>{@link process_modeling.Resource#isIsStorage <em>Is Storage</em>}</li>
 *   <li>{@link process_modeling.Resource#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.Resource#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link process_modeling.Resource#getStatus <em>Status</em>}</li>
 *   <li>{@link process_modeling.Resource#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link process_modeling.Resource#getInventory <em>Inventory</em>}</li>
 *   <li>{@link process_modeling.Resource#getMaterialFlowSource <em>Material Flow Source</em>}</li>
 *   <li>{@link process_modeling.Resource#getMaterialFlowTarget <em>Material Flow Target</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends IDNamedElement, Persistable {
	/**
	 * Returns the value of the '<em><b>Is Actuator</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Actuator</em>' attribute.
	 * @see #setIsActuator(boolean)
	 * @see process_modeling.Process_modelingPackage#getResource_IsActuator()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsActuator();

	/**
	 * Sets the value of the '{@link process_modeling.Resource#isIsActuator <em>Is Actuator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Actuator</em>' attribute.
	 * @see #isIsActuator()
	 * @generated
	 */
	void setIsActuator(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Storage</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Storage</em>' attribute.
	 * @see #setIsStorage(boolean)
	 * @see process_modeling.Process_modelingPackage#getResource_IsStorage()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsStorage();

	/**
	 * Sets the value of the '{@link process_modeling.Resource#isIsStorage <em>Is Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Storage</em>' attribute.
	 * @see #isIsStorage()
	 * @generated
	 */
	void setIsStorage(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EResourceType
	 * @see #setType(EResourceType)
	 * @see process_modeling.Process_modelingPackage#getResource_Type()
	 * @model required="true"
	 * @generated
	 */
	EResourceType getType();

	/**
	 * Sets the value of the '{@link process_modeling.Resource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EResourceType
	 * @see #getType()
	 * @generated
	 */
	void setType(EResourceType value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see process_modeling.Process_modelingPackage#getResource_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link process_modeling.Resource#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EResourceStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see process_modeling.EResourceStatus
	 * @see #setStatus(EResourceStatus)
	 * @see process_modeling.Process_modelingPackage#getResource_Status()
	 * @model
	 * @generated
	 */
	EResourceStatus getStatus();

	/**
	 * Sets the value of the '{@link process_modeling.Resource#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see process_modeling.EResourceStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EResourceStatus value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getResource_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getResource_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getInventory();

	/**
	 * Returns the value of the '<em><b>Material Flow Source</b></em>' reference list.
	 * The list contents are of type {@link process_modeling.Resource}.
	 * It is bidirectional and its opposite is '{@link process_modeling.Resource#getMaterialFlowTarget <em>Material Flow Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Flow Source</em>' reference list.
	 * @see process_modeling.Process_modelingPackage#getResource_MaterialFlowSource()
	 * @see process_modeling.Resource#getMaterialFlowTarget
	 * @model opposite="materialFlowTarget"
	 * @generated
	 */
	EList<Resource> getMaterialFlowSource();

	/**
	 * Returns the value of the '<em><b>Material Flow Target</b></em>' reference list.
	 * The list contents are of type {@link process_modeling.Resource}.
	 * It is bidirectional and its opposite is '{@link process_modeling.Resource#getMaterialFlowSource <em>Material Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Flow Target</em>' reference list.
	 * @see process_modeling.Process_modelingPackage#getResource_MaterialFlowTarget()
	 * @see process_modeling.Resource#getMaterialFlowSource
	 * @model opposite="materialFlowSource"
	 * @generated
	 */
	EList<Resource> getMaterialFlowTarget();

} // Resource
