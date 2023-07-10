/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.ProcessElement#getInRelationships <em>In Relationships</em>}</li>
 *   <li>{@link process_modeling.ProcessElement#getOutRelationships <em>Out Relationships</em>}</li>
 *   <li>{@link process_modeling.ProcessElement#isIsErrorGroup <em>Is Error Group</em>}</li>
 *   <li>{@link process_modeling.ProcessElement#getStatus <em>Status</em>}</li>
 *   <li>{@link process_modeling.ProcessElement#getObligationsFulfilled <em>Obligations Fulfilled</em>}</li>
 *   <li>{@link process_modeling.ProcessElement#getRelatedDltContent <em>Related Dlt Content</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getProcessElement()
 * @model abstract="true"
 * @generated
 */
public interface ProcessElement extends IDNamedElement, Traceable {
	/**
	 * Returns the value of the '<em><b>In Relationships</b></em>' reference list.
	 * The list contents are of type {@link process_modeling.Relationship}.
	 * It is bidirectional and its opposite is '{@link process_modeling.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Relationships</em>' reference list.
	 * @see process_modeling.Process_modelingPackage#getProcessElement_InRelationships()
	 * @see process_modeling.Relationship#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<Relationship> getInRelationships();

	/**
	 * Returns the value of the '<em><b>Out Relationships</b></em>' reference list.
	 * The list contents are of type {@link process_modeling.Relationship}.
	 * It is bidirectional and its opposite is '{@link process_modeling.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Relationships</em>' reference list.
	 * @see process_modeling.Process_modelingPackage#getProcessElement_OutRelationships()
	 * @see process_modeling.Relationship#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<Relationship> getOutRelationships();

	/**
	 * Returns the value of the '<em><b>Is Error Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Error Group</em>' attribute.
	 * @see #setIsErrorGroup(boolean)
	 * @see process_modeling.Process_modelingPackage#getProcessElement_IsErrorGroup()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsErrorGroup();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessElement#isIsErrorGroup <em>Is Error Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Error Group</em>' attribute.
	 * @see #isIsErrorGroup()
	 * @generated
	 */
	void setIsErrorGroup(boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EProcessElementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see process_modeling.EProcessElementStatus
	 * @see #setStatus(EProcessElementStatus)
	 * @see process_modeling.Process_modelingPackage#getProcessElement_Status()
	 * @model required="true"
	 * @generated
	 */
	EProcessElementStatus getStatus();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessElement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see process_modeling.EProcessElementStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EProcessElementStatus value);

	/**
	 * Returns the value of the '<em><b>Obligations Fulfilled</b></em>' attribute.
	 * The default value is <code>"TRUE"</code>.
	 * The literals are from the enumeration {@link process_modeling.EProcessElementObligationsFulfilled}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligations Fulfilled</em>' attribute.
	 * @see process_modeling.EProcessElementObligationsFulfilled
	 * @see #setObligationsFulfilled(EProcessElementObligationsFulfilled)
	 * @see process_modeling.Process_modelingPackage#getProcessElement_ObligationsFulfilled()
	 * @model default="TRUE"
	 * @generated
	 */
	EProcessElementObligationsFulfilled getObligationsFulfilled();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessElement#getObligationsFulfilled <em>Obligations Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligations Fulfilled</em>' attribute.
	 * @see process_modeling.EProcessElementObligationsFulfilled
	 * @see #getObligationsFulfilled()
	 * @generated
	 */
	void setObligationsFulfilled(EProcessElementObligationsFulfilled value);

	/**
	 * Returns the value of the '<em><b>Related Dlt Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Dlt Content</em>' attribute.
	 * @see #setRelatedDltContent(String)
	 * @see process_modeling.Process_modelingPackage#getProcessElement_RelatedDltContent()
	 * @model
	 * @generated
	 */
	String getRelatedDltContent();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessElement#getRelatedDltContent <em>Related Dlt Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Dlt Content</em>' attribute.
	 * @see #getRelatedDltContent()
	 * @generated
	 */
	void setRelatedDltContent(String value);

} // ProcessElement
