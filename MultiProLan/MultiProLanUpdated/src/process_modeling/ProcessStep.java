/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.ProcessStep#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getNotation <em>Notation</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getCapability <em>Capability</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getInProducts <em>In Products</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getOutProducts <em>Out Products</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getDescription <em>Description</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getResource <em>Resource</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getAcceptanceCriterion <em>Acceptance Criterion</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getCompletionCriterion <em>Completion Criterion</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getErrors <em>Errors</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getContractualObligation <em>Contractual Obligation</em>}</li>
 *   <li>{@link process_modeling.ProcessStep#getRelatedInterfaceProcess <em>Related Interface Process</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getProcessStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneFlowRelationProcessStep startProcessStepHasOnlyOneLinkTo startProcessStepHasOnlyOneLinkTo2 endProcessStepHasOnlyOneLinkFrom'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot onlyOneFlowRelationProcessStep='\n\t\t\tProcessStep.allInstances()-&gt;forAll(ps | ps.inRelationships-&gt;forAll(r1, r2 | (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW) implies (r1 = r2)) \n\t\t\t\tand ps.outRelationships-&gt;forAll(r1, r2 | (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW) implies (r1 = r2)))' startProcessStepHasOnlyOneLinkTo='\n\t\t\tProcessStep.allInstances()-&gt;forAll(ps | (ps.type = EProcessStepType::START) implies ((ps.inRelationships-&gt;size() = 0) and (ps.outRelationships-&gt;size() = 1) and \n\t\t\t\t(ps.outRelationships-&gt;select(r | r.type = ERelationshipType::FLOW)-&gt;notEmpty())))' startProcessStepHasOnlyOneLinkTo2='\n\t\t\tProcessStep.allInstances()-&gt;forAll(ps | (ps.type = EProcessStepType::START) implies (not((ps.inRelationships-&gt;exists(r | true))) and (ps.outRelationships-&gt;exists(r | true) and ps.outRelationships-&gt;forAll(r1, r2 | r1 = r2)) and \n\t\t\t\t(Relationship.allInstances()-&gt;exists(r | r.source.id = ps.id and r.type = ERelationshipType::FLOW))))' endProcessStepHasOnlyOneLinkFrom='\n\t\t\tProcessStep.allInstances()-&gt;forAll(ps | (ps.type = EProcessStepType::END) implies ((ps.outRelationships-&gt;size() = 0) and (ps.inRelationships-&gt;size() = 1) and \n\t\t\t\t(ps.inRelationships-&gt;select(r | r.type = ERelationshipType::FLOW)-&gt;notEmpty())))'"
 * @generated
 */
public interface ProcessStep extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"REGULAR"</code>.
	 * The literals are from the enumeration {@link process_modeling.EProcessStepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EProcessStepType
	 * @see #setType(EProcessStepType)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_Type()
	 * @model default="REGULAR" required="true"
	 * @generated
	 */
	EProcessStepType getType();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EProcessStepType
	 * @see #getType()
	 * @generated
	 */
	void setType(EProcessStepType value);

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' attribute.
	 * The default value is <code>"OPERATION"</code>.
	 * The literals are from the enumeration {@link process_modeling.EProcessStepNotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' attribute.
	 * @see process_modeling.EProcessStepNotation
	 * @see #setNotation(EProcessStepNotation)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_Notation()
	 * @model default="OPERATION" required="true"
	 * @generated
	 */
	EProcessStepNotation getNotation();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' attribute.
	 * @see process_modeling.EProcessStepNotation
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(EProcessStepNotation value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference.
	 * @see #setCapability(Capability)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_Capability()
	 * @model containment="true"
	 * @generated
	 */
	Capability getCapability();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getCapability <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' containment reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Capability value);

	/**
	 * Returns the value of the '<em><b>In Products</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Products</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getProcessStep_InProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getInProducts();

	/**
	 * Returns the value of the '<em><b>Out Products</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Products</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getProcessStep_OutProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getOutProducts();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Resource)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Criterion</em>' attribute.
	 * @see #setAcceptanceCriterion(String)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_AcceptanceCriterion()
	 * @model
	 * @generated
	 */
	String getAcceptanceCriterion();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getAcceptanceCriterion <em>Acceptance Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Criterion</em>' attribute.
	 * @see #getAcceptanceCriterion()
	 * @generated
	 */
	void setAcceptanceCriterion(String value);

	/**
	 * Returns the value of the '<em><b>Completion Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Criterion</em>' attribute.
	 * @see #setCompletionCriterion(String)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_CompletionCriterion()
	 * @model
	 * @generated
	 */
	String getCompletionCriterion();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getCompletionCriterion <em>Completion Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Criterion</em>' attribute.
	 * @see #getCompletionCriterion()
	 * @generated
	 */
	void setCompletionCriterion(String value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Error}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getProcessStep_Errors()
	 * @model containment="true"
	 * @generated
	 */
	EList<process_modeling.Error> getErrors();

	/**
	 * Returns the value of the '<em><b>Contractual Obligation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractual Obligation</em>' containment reference.
	 * @see #setContractualObligation(ContractualObligation)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_ContractualObligation()
	 * @model containment="true"
	 * @generated
	 */
	ContractualObligation getContractualObligation();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getContractualObligation <em>Contractual Obligation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contractual Obligation</em>' containment reference.
	 * @see #getContractualObligation()
	 * @generated
	 */
	void setContractualObligation(ContractualObligation value);

	/**
	 * Returns the value of the '<em><b>Related Interface Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Interface Process</em>' reference.
	 * @see #setRelatedInterfaceProcess(process_modeling.Process)
	 * @see process_modeling.Process_modelingPackage#getProcessStep_RelatedInterfaceProcess()
	 * @model
	 * @generated
	 */
	process_modeling.Process getRelatedInterfaceProcess();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessStep#getRelatedInterfaceProcess <em>Related Interface Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Interface Process</em>' reference.
	 * @see #getRelatedInterfaceProcess()
	 * @generated
	 */
	void setRelatedInterfaceProcess(process_modeling.Process value);

} // ProcessStep
