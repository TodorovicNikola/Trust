/**
 */
package process_modeling.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import process_modeling.Capability;
import process_modeling.Constraint;
import process_modeling.EErrorDetection;
import process_modeling.EErrorDomain;
import process_modeling.EErrorOccurrence;
import process_modeling.EErrorSeverity;
import process_modeling.EErrorStatus;
import process_modeling.EErrorType;
import process_modeling.EGateType;
import process_modeling.EOrganizationRole;
import process_modeling.EPersistenceType;
import process_modeling.EProcessElementStatus;
import process_modeling.EProcessParameterType;
import process_modeling.EProcessStepNotation;
import process_modeling.EProcessStepType;
import process_modeling.ERelationshipType;
import process_modeling.EResourceStatus;
import process_modeling.EResourceType;
import process_modeling.Gate;
import process_modeling.IDNamedElement;
import process_modeling.Parameter;
import process_modeling.Persistable;
import process_modeling.Pool;
import process_modeling.ProcessElement;
import process_modeling.ProcessParameter;
import process_modeling.ProcessStep;
import process_modeling.Process_modelingPackage;
import process_modeling.Product;
import process_modeling.Relationship;
import process_modeling.Resource;
import process_modeling.SubProcess;
import process_modeling.SwimLane;
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
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
			case Process_modelingPackage.POOL:
				return validatePool((Pool)value, diagnostics, context);
			case Process_modelingPackage.SWIM_LANE:
				return validateSwimLane((SwimLane)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateProcess_oneStartProcessStep2(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_oneEndProcessStep(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustExistsStart(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustExistsEnd(process, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneStartProcessStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__ONE_START_PROCESS_STEP__EEXPRESSION = "\n" +
		"\t\t\tProcessStep.allInstances()->forAll(ps1, ps2 | ((ps1.type = EProcessStepType::START) and (ps2.type = EProcessStepType::START)) implies (ps1 = ps2))";

	/**
	 * Validates the oneStartProcessStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_oneStartProcessStep(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oneStartProcessStep",
				 PROCESS__ONE_START_PROCESS_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the oneStartProcessStep2 constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__ONE_START_PROCESS_STEP2__EEXPRESSION = "\n" +
		"\t\t\tnot(ProcessStep.allInstances()->exists(ps1, ps2 | ps1.type = EProcessStepType::START and ps2.type = EProcessStepType::START and ps1 <> ps2))";

	/**
	 * Validates the oneStartProcessStep2 constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_oneStartProcessStep2(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oneStartProcessStep2",
				 PROCESS__ONE_START_PROCESS_STEP2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the oneEndProcessStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__ONE_END_PROCESS_STEP__EEXPRESSION = "\n" +
		"\t\t\tProcessStep.allInstances()->forAll(ps1, ps2 | ((ps1.type = EProcessStepType::END) and (ps2.type = EProcessStepType::END)) implies (ps1 = ps2))";

	/**
	 * Validates the oneEndProcessStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_oneEndProcessStep(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oneEndProcessStep",
				 PROCESS__ONE_END_PROCESS_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the mustExistsStart constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__MUST_EXISTS_START__EEXPRESSION = "\n" +
		"\t\t\tProcessStep.allInstances()->exists(ps | ps.type = EProcessStepType::START)";

	/**
	 * Validates the mustExistsStart constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_mustExistsStart(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustExistsStart",
				 PROCESS__MUST_EXISTS_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the mustExistsEnd constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__MUST_EXISTS_END__EEXPRESSION = "\n" +
		"\t\t\tProcessStep.allInstances()->exists(ps | ps.type = EProcessStepType::END)";

	/**
	 * Validates the mustExistsEnd constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_mustExistsEnd(process_modeling.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustExistsEnd",
				 PROCESS__MUST_EXISTS_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateProcessStep_onlyOneFlowRelationProcessStep(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_startProcessStepHasOnlyOneLinkTo(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_startProcessStepHasOnlyOneLinkTo2(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_endProcessStepHasOnlyOneLinkFrom(processStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyOneFlowRelationProcessStep constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__ONLY_ONE_FLOW_RELATION_PROCESS_STEP__EEXPRESSION = "\n" +
		"\t\t\tProcessStep.allInstances()->forAll(ps | ps.inRelationships->forAll(r1, r2 | (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW) implies (r1 = r2)) \n" +
		"\t\t\t\tand ps.outRelationships->forAll(r1, r2 | (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW) implies (r1 = r2)))";

	/**
	 * Validates the onlyOneFlowRelationProcessStep constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_onlyOneFlowRelationProcessStep(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneFlowRelationProcessStep",
				 PROCESS_STEP__ONLY_ONE_FLOW_RELATION_PROCESS_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the startProcessStepHasOnlyOneLinkTo constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO__EEXPRESSION = "\n" +
		"\t\t\tProcessStep.allInstances()->forAll(ps | (ps.type = EProcessStepType::START) implies ((ps.inRelationships->size() = 0) and (ps.outRelationships->size() = 1) and \n" +
		"\t\t\t\t(ps.outRelationships->select(r | r.type = ERelationshipType::FLOW)->notEmpty())))";

	/**
	 * Validates the startProcessStepHasOnlyOneLinkTo constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_startProcessStepHasOnlyOneLinkTo(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "startProcessStepHasOnlyOneLinkTo",
				 PROCESS_STEP__START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the startProcessStepHasOnlyOneLinkTo2 constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO2__EEXPRESSION = "\n" +
		"\t\t\tProcessStep.allInstances()->forAll(ps | (ps.type = EProcessStepType::START) implies (not((ps.inRelationships->exists(r | true))) and (ps.outRelationships->exists(r | true) and ps.outRelationships->forAll(r1, r2 | r1 = r2)) and \n" +
		"\t\t\t\t(Relationship.allInstances()->exists(r | r.source.id = ps.id and r.type = ERelationshipType::FLOW))))";

	/**
	 * Validates the startProcessStepHasOnlyOneLinkTo2 constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_startProcessStepHasOnlyOneLinkTo2(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "startProcessStepHasOnlyOneLinkTo2",
				 PROCESS_STEP__START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the endProcessStepHasOnlyOneLinkFrom constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__END_PROCESS_STEP_HAS_ONLY_ONE_LINK_FROM__EEXPRESSION = "\n" +
		"\t\t\tProcessStep.allInstances()->forAll(ps | (ps.type = EProcessStepType::END) implies ((ps.outRelationships->size() = 0) and (ps.inRelationships->size() = 1) and \n" +
		"\t\t\t\t(ps.inRelationships->select(r | r.type = ERelationshipType::FLOW)->notEmpty())))";

	/**
	 * Validates the endProcessStepHasOnlyOneLinkFrom constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_endProcessStepHasOnlyOneLinkFrom(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "endProcessStepHasOnlyOneLinkFrom",
				 PROCESS_STEP__END_PROCESS_STEP_HAS_ONLY_ONE_LINK_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateRelationship_flowBetweenStepsAndGates(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_collaborationBetweenSteps(relationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyOneRelationBetweenElements constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__ONLY_ONE_RELATION_BETWEEN_ELEMENTS__EEXPRESSION = "\n" +
		"\t\t\tRelationship.allInstances()->forAll(r1, r2 | ((r1.target.id = r2.target.id and r1.source.id = r2.source.id) or\n" +
		"\t\t\t\t(r1.target.id = r2.source.id and r1.source.id = r2.target.id) implies (r1 = r2)))";

	/**
	 * Validates the onlyOneRelationBetweenElements constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_onlyOneRelationBetweenElements(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneRelationBetweenElements",
				 RELATIONSHIP__ONLY_ONE_RELATION_BETWEEN_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the flowBetweenStepsAndGates constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__FLOW_BETWEEN_STEPS_AND_GATES__EEXPRESSION = "\n" +
		"\t\t\tRelationship.allInstances()->forAll(r | (r.type = ERelationshipType::FLOW) implies ((r.target.oclIsTypeOf(ProcessStep) or r.target.oclIsTypeOf(Gate)) and\n" +
		"\t\t\t\t(r.source.oclIsTypeOf(ProcessStep) or r.source.oclIsTypeOf(Gate))))";

	/**
	 * Validates the flowBetweenStepsAndGates constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_flowBetweenStepsAndGates(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "flowBetweenStepsAndGates",
				 RELATIONSHIP__FLOW_BETWEEN_STEPS_AND_GATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the collaborationBetweenSteps constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__COLLABORATION_BETWEEN_STEPS__EEXPRESSION = "\n" +
		"\t\t\tRelationship.allInstances()->forAll(r | (r.type = ERelationshipType::COLLABORATION) implies (r.target.oclIsTypeOf(ProcessStep) and r.source.oclIsTypeOf(ProcessStep)))";

	/**
	 * Validates the collaborationBetweenSteps constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_collaborationBetweenSteps(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Process_modelingPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "collaborationBetweenSteps",
				 RELATIONSHIP__COLLABORATION_BETWEEN_STEPS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validatePool(Pool pool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pool, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwimLane(SwimLane swimLane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(swimLane, diagnostics, context);
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
