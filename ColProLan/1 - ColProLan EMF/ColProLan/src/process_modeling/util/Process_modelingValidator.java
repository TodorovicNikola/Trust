/**
 */
package process_modeling.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import process_modeling.Capability;
import process_modeling.CollaborativeNetwork;
import process_modeling.Constraint;
import process_modeling.ContractualObligation;
import process_modeling.EErrorDetection;
import process_modeling.EErrorDomain;
import process_modeling.EErrorOccurrence;
import process_modeling.EErrorSeverity;
import process_modeling.EErrorStatus;
import process_modeling.EErrorType;
import process_modeling.EGateType;
import process_modeling.EOrganizationRole;
import process_modeling.EPersistenceType;
import process_modeling.EProcessElementObligationsFulfilled;
import process_modeling.EProcessElementStatus;
import process_modeling.EProcessParameterType;
import process_modeling.EProcessStepNotation;
import process_modeling.EProcessStepType;
import process_modeling.ERelationshipType;
import process_modeling.EResourceStatus;
import process_modeling.EResourceType;
import process_modeling.Gate;
import process_modeling.IDNamedElement;
import process_modeling.Organization;
import process_modeling.Parameter;
import process_modeling.Persistable;
import process_modeling.ProcessElement;
import process_modeling.ProcessParameter;
import process_modeling.ProcessStep;
import process_modeling.Process_modelingPackage;
import process_modeling.Product;
import process_modeling.Relationship;
import process_modeling.Resource;
import process_modeling.SubProcess;
import process_modeling.Traceable;
import process_modeling.UnorderedSteps;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingPackage
 * @generated
 */
public class Process_modelingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Process_modelingValidator INSTANCE = new Process_modelingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "process_modeling";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Exists End' of 'Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS__MUST_EXISTS_END = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One End Process Step' of 'Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS__ONE_END_PROCESS_STEP = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Start Process Step2' of 'Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS__ONE_START_PROCESS_STEP2 = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Exists Start' of 'Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS__MUST_EXISTS_START = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Start Process Step' of 'Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS__ONE_START_PROCESS_STEP = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Process Step Has Only One Link To' of 'Process Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS_STEP__START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Flow Relation Process Step' of 'Process Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS_STEP__ONLY_ONE_FLOW_RELATION_PROCESS_STEP = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Process Step Has Only One Link To2' of 'Process Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS_STEP__START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO2 = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'End Process Step Has Only One Link From' of 'Process Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS_STEP__END_PROCESS_STEP_HAS_ONLY_ONE_LINK_FROM = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Collaboration Between Steps' of 'Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATIONSHIP__COLLABORATION_BETWEEN_STEPS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Flow Between Steps And Gates' of 'Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATIONSHIP__FLOW_BETWEEN_STEPS_AND_GATES = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Relation Between Elements' of 'Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RELATIONSHIP__ONLY_ONE_RELATION_BETWEEN_ELEMENTS = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Process_modelingValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Process_modelingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Process_modelingPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case Process_modelingPackage.PROCESS:
				return validateProcess((process_modeling.Process)value, diagnostics, context);
			case Process_modelingPackage.PROCESS_STEP:
				return validateProcessStep((ProcessStep)value, diagnostics, context);
			case Process_modelingPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case Process_modelingPackage.CAPABILITY:
				return validateCapability((Capability)value, diagnostics, context);
			case Process_modelingPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case Process_modelingPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case Process_modelingPackage.PROCESS_ELEMENT:
				return validateProcessElement((ProcessElement)value, diagnostics, context);
			case Process_modelingPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case Process_modelingPackage.ID_NAMED_ELEMENT:
				return validateIDNamedElement((IDNamedElement)value, diagnostics, context);
			case Process_modelingPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case Process_modelingPackage.ERROR:
				return validateError((process_modeling.Error)value, diagnostics, context);
			case Process_modelingPackage.SUB_PROCESS:
				return validateSubProcess((SubProcess)value, diagnostics, context);
			case Process_modelingPackage.UNORDERED_STEPS:
				return validateUnorderedSteps((UnorderedSteps)value, diagnostics, context);
			case Process_modelingPackage.PROCESS_PARAMETER:
				return validateProcessParameter((ProcessParameter)value, diagnostics, context);
			case Process_modelingPackage.TRACEABLE:
				return validateTraceable((Traceable)value, diagnostics, context);
			case Process_modelingPackage.PERSISTABLE:
				return validatePersistable((Persistable)value, diagnostics, context);
			case Process_modelingPackage.COLLABORATIVE_NETWORK:
				return validateCollaborativeNetwork((CollaborativeNetwork)value, diagnostics, context);
			case Process_modelingPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION:
				return validateContractualObligation((ContractualObligation)value, diagnostics, context);
			case Process_modelingPackage.ERESOURCE_TYPE:
				return validateEResourceType((EResourceType)value, diagnostics, context);
			case Process_modelingPackage.ERESOURCE_STATUS:
				return validateEResourceStatus((EResourceStatus)value, diagnostics, context);
			case Process_modelingPackage.EPROCESS_STEP_TYPE:
				return validateEProcessStepType((EProcessStepType)value, diagnostics, context);
			case Process_modelingPackage.EPROCESS_STEP_NOTATION:
				return validateEProcessStepNotation((EProcessStepNotation)value, diagnostics, context);
			case Process_modelingPackage.EGATE_TYPE:
				return validateEGateType((EGateType)value, diagnostics, context);
			case Process_modelingPackage.ERELATIONSHIP_TYPE:
				return validateERelationshipType((ERelationshipType)value, diagnostics, context);
			case Process_modelingPackage.EERROR_SEVERITY:
				return validateEErrorSeverity((EErrorSeverity)value, diagnostics, context);
			case Process_modelingPackage.EERROR_DOMAIN:
				return validateEErrorDomain((EErrorDomain)value, diagnostics, context);
			case Process_modelingPackage.EERROR_OCCURRENCE:
				return validateEErrorOccurrence((EErrorOccurrence)value, diagnostics, context);
			case Process_modelingPackage.EERROR_DETECTION:
				return validateEErrorDetection((EErrorDetection)value, diagnostics, context);
			case Process_modelingPackage.EPROCESS_ELEMENT_STATUS:
				return validateEProcessElementStatus((EProcessElementStatus)value, diagnostics, context);
			case Process_modelingPackage.EERROR_TYPE:
				return validateEErrorType((EErrorType)value, diagnostics, context);
			case Process_modelingPackage.EERROR_STATUS:
				return validateEErrorStatus((EErrorStatus)value, diagnostics, context);
			case Process_modelingPackage.EPROCESS_PARAMETER_TYPE:
				return validateEProcessParameterType((EProcessParameterType)value, diagnostics, context);
			case Process_modelingPackage.EPERSISTENCE_TYPE:
				return validateEPersistenceType((EPersistenceType)value, diagnostics, context);
			case Process_modelingPackage.EORGANIZATION_ROLE:
				return validateEOrganizationRole((EOrganizationRole)value, diagnostics, context);
			case Process_modelingPackage.EPROCESS_ELEMENT_OBLIGATIONS_FULFILLED:
				return validateEProcessElementObligationsFulfilled((EProcessElementObligationsFulfilled)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_oneStartProcessStep(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustExistsEnd(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_oneEndProcessStep(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_oneStartProcessStep2(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustExistsStart(process, diagnostics, context);
		return result;
	}

	/**
	 * Validates the oneStartProcessStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_oneStartProcessStep(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return process.oneStartProcessStep(diagnostics, context);
	}

	/**
	 * Validates the mustExistsEnd constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_mustExistsEnd(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return process.mustExistsEnd(diagnostics, context);
	}

	/**
	 * Validates the oneEndProcessStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_oneEndProcessStep(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return process.oneEndProcessStep(diagnostics, context);
	}

	/**
	 * Validates the oneStartProcessStep2 constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_oneStartProcessStep2(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return process.oneStartProcessStep2(diagnostics, context);
	}

	/**
	 * Validates the mustExistsStart constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_mustExistsStart(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return process.mustExistsStart(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_endProcessStepHasOnlyOneLinkFrom(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_startProcessStepHasOnlyOneLinkTo(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_onlyOneFlowRelationProcessStep(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_startProcessStepHasOnlyOneLinkTo2(processStep, diagnostics, context);
		return result;
	}

	/**
	 * Validates the endProcessStepHasOnlyOneLinkFrom constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_endProcessStepHasOnlyOneLinkFrom(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return processStep.endProcessStepHasOnlyOneLinkFrom(diagnostics, context);
	}

	/**
	 * Validates the startProcessStepHasOnlyOneLinkTo constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_startProcessStepHasOnlyOneLinkTo(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return processStep.startProcessStepHasOnlyOneLinkTo(diagnostics, context);
	}

	/**
	 * Validates the onlyOneFlowRelationProcessStep constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_onlyOneFlowRelationProcessStep(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return processStep.onlyOneFlowRelationProcessStep(diagnostics, context);
	}

	/**
	 * Validates the startProcessStepHasOnlyOneLinkTo2 constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_startProcessStepHasOnlyOneLinkTo2(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return processStep.startProcessStepHasOnlyOneLinkTo2(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_onlyOneRelationBetweenElements(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_collaborationBetweenSteps(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_flowBetweenStepsAndGates(relationship, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyOneRelationBetweenElements constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_onlyOneRelationBetweenElements(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relationship.onlyOneRelationBetweenElements(diagnostics, context);
	}

	/**
	 * Validates the collaborationBetweenSteps constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_collaborationBetweenSteps(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relationship.collaborationBetweenSteps(diagnostics, context);
	}

	/**
	 * Validates the flowBetweenStepsAndGates constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_flowBetweenStepsAndGates(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return relationship.flowBetweenStepsAndGates(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapability(Capability capability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessElement(ProcessElement processElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDNamedElement(IDNamedElement idNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(idNamedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateError(process_modeling.Error error, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(error, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubProcess(SubProcess subProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnorderedSteps(UnorderedSteps unorderedSteps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unorderedSteps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessParameter(ProcessParameter processParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceable(Traceable traceable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistable(Persistable persistable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborativeNetwork(CollaborativeNetwork collaborativeNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collaborativeNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractualObligation(ContractualObligation contractualObligation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractualObligation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEResourceType(EResourceType eResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEResourceStatus(EResourceStatus eResourceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEProcessStepType(EProcessStepType eProcessStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEProcessStepNotation(EProcessStepNotation eProcessStepNotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGateType(EGateType eGateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERelationshipType(ERelationshipType eRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEErrorSeverity(EErrorSeverity eErrorSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEErrorDomain(EErrorDomain eErrorDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEErrorOccurrence(EErrorOccurrence eErrorOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEErrorDetection(EErrorDetection eErrorDetection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEProcessElementStatus(EProcessElementStatus eProcessElementStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEErrorType(EErrorType eErrorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEErrorStatus(EErrorStatus eErrorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEProcessParameterType(EProcessParameterType eProcessParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPersistenceType(EPersistenceType ePersistenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOrganizationRole(EOrganizationRole eOrganizationRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEProcessElementObligationsFulfilled(EProcessElementObligationsFulfilled eProcessElementObligationsFulfilled, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Process_modelingValidator
