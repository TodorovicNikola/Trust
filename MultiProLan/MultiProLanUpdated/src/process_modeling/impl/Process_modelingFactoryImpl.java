/**
 */
package process_modeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import process_modeling.Capability;
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
import process_modeling.Organization;
import process_modeling.Parameter;
import process_modeling.ProcessParameter;
import process_modeling.ProcessStep;
import process_modeling.Process_modelingFactory;
import process_modeling.Process_modelingPackage;
import process_modeling.Product;
import process_modeling.Relationship;
import process_modeling.Resource;
import process_modeling.SubProcess;
import process_modeling.UnorderedSteps;
import process_modeling.VirtualOrganization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Process_modelingFactoryImpl extends EFactoryImpl implements Process_modelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Process_modelingFactory init() {
		try {
			Process_modelingFactory theProcess_modelingFactory = (Process_modelingFactory)EPackage.Registry.INSTANCE.getEFactory(Process_modelingPackage.eNS_URI);
			if (theProcess_modelingFactory != null) {
				return theProcess_modelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Process_modelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Process_modelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Process_modelingPackage.RESOURCE: return createResource();
			case Process_modelingPackage.PROCESS: return createProcess();
			case Process_modelingPackage.PROCESS_STEP: return createProcessStep();
			case Process_modelingPackage.RELATIONSHIP: return createRelationship();
			case Process_modelingPackage.CAPABILITY: return createCapability();
			case Process_modelingPackage.PRODUCT: return createProduct();
			case Process_modelingPackage.CONSTRAINT: return createConstraint();
			case Process_modelingPackage.GATE: return createGate();
			case Process_modelingPackage.PARAMETER: return createParameter();
			case Process_modelingPackage.ERROR: return createError();
			case Process_modelingPackage.SUB_PROCESS: return createSubProcess();
			case Process_modelingPackage.UNORDERED_STEPS: return createUnorderedSteps();
			case Process_modelingPackage.PROCESS_PARAMETER: return createProcessParameter();
			case Process_modelingPackage.VIRTUAL_ORGANIZATION: return createVirtualOrganization();
			case Process_modelingPackage.ORGANIZATION: return createOrganization();
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION: return createContractualObligation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Process_modelingPackage.ERESOURCE_TYPE:
				return createEResourceTypeFromString(eDataType, initialValue);
			case Process_modelingPackage.ERESOURCE_STATUS:
				return createEResourceStatusFromString(eDataType, initialValue);
			case Process_modelingPackage.EPROCESS_STEP_TYPE:
				return createEProcessStepTypeFromString(eDataType, initialValue);
			case Process_modelingPackage.EPROCESS_STEP_NOTATION:
				return createEProcessStepNotationFromString(eDataType, initialValue);
			case Process_modelingPackage.EGATE_TYPE:
				return createEGateTypeFromString(eDataType, initialValue);
			case Process_modelingPackage.ERELATIONSHIP_TYPE:
				return createERelationshipTypeFromString(eDataType, initialValue);
			case Process_modelingPackage.EERROR_SEVERITY:
				return createEErrorSeverityFromString(eDataType, initialValue);
			case Process_modelingPackage.EERROR_DOMAIN:
				return createEErrorDomainFromString(eDataType, initialValue);
			case Process_modelingPackage.EERROR_OCCURRENCE:
				return createEErrorOccurrenceFromString(eDataType, initialValue);
			case Process_modelingPackage.EERROR_DETECTION:
				return createEErrorDetectionFromString(eDataType, initialValue);
			case Process_modelingPackage.EPROCESS_ELEMENT_STATUS:
				return createEProcessElementStatusFromString(eDataType, initialValue);
			case Process_modelingPackage.EERROR_TYPE:
				return createEErrorTypeFromString(eDataType, initialValue);
			case Process_modelingPackage.EERROR_STATUS:
				return createEErrorStatusFromString(eDataType, initialValue);
			case Process_modelingPackage.EPROCESS_PARAMETER_TYPE:
				return createEProcessParameterTypeFromString(eDataType, initialValue);
			case Process_modelingPackage.EPERSISTENCE_TYPE:
				return createEPersistenceTypeFromString(eDataType, initialValue);
			case Process_modelingPackage.EORGANIZATION_ROLE:
				return createEOrganizationRoleFromString(eDataType, initialValue);
			case Process_modelingPackage.EPROCESS_ELEMENT_OBLIGATIONS_FULFILLED:
				return createEProcessElementObligationsFulfilledFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Process_modelingPackage.ERESOURCE_TYPE:
				return convertEResourceTypeToString(eDataType, instanceValue);
			case Process_modelingPackage.ERESOURCE_STATUS:
				return convertEResourceStatusToString(eDataType, instanceValue);
			case Process_modelingPackage.EPROCESS_STEP_TYPE:
				return convertEProcessStepTypeToString(eDataType, instanceValue);
			case Process_modelingPackage.EPROCESS_STEP_NOTATION:
				return convertEProcessStepNotationToString(eDataType, instanceValue);
			case Process_modelingPackage.EGATE_TYPE:
				return convertEGateTypeToString(eDataType, instanceValue);
			case Process_modelingPackage.ERELATIONSHIP_TYPE:
				return convertERelationshipTypeToString(eDataType, instanceValue);
			case Process_modelingPackage.EERROR_SEVERITY:
				return convertEErrorSeverityToString(eDataType, instanceValue);
			case Process_modelingPackage.EERROR_DOMAIN:
				return convertEErrorDomainToString(eDataType, instanceValue);
			case Process_modelingPackage.EERROR_OCCURRENCE:
				return convertEErrorOccurrenceToString(eDataType, instanceValue);
			case Process_modelingPackage.EERROR_DETECTION:
				return convertEErrorDetectionToString(eDataType, instanceValue);
			case Process_modelingPackage.EPROCESS_ELEMENT_STATUS:
				return convertEProcessElementStatusToString(eDataType, instanceValue);
			case Process_modelingPackage.EERROR_TYPE:
				return convertEErrorTypeToString(eDataType, instanceValue);
			case Process_modelingPackage.EERROR_STATUS:
				return convertEErrorStatusToString(eDataType, instanceValue);
			case Process_modelingPackage.EPROCESS_PARAMETER_TYPE:
				return convertEProcessParameterTypeToString(eDataType, instanceValue);
			case Process_modelingPackage.EPERSISTENCE_TYPE:
				return convertEPersistenceTypeToString(eDataType, instanceValue);
			case Process_modelingPackage.EORGANIZATION_ROLE:
				return convertEOrganizationRoleToString(eDataType, instanceValue);
			case Process_modelingPackage.EPROCESS_ELEMENT_OBLIGATIONS_FULFILLED:
				return convertEProcessElementObligationsFulfilledToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public process_modeling.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessStep createProcessStep() {
		ProcessStepImpl processStep = new ProcessStepImpl();
		return processStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public process_modeling.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubProcess createSubProcess() {
		SubProcessImpl subProcess = new SubProcessImpl();
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnorderedSteps createUnorderedSteps() {
		UnorderedStepsImpl unorderedSteps = new UnorderedStepsImpl();
		return unorderedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessParameter createProcessParameter() {
		ProcessParameterImpl processParameter = new ProcessParameterImpl();
		return processParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualOrganization createVirtualOrganization() {
		VirtualOrganizationImpl virtualOrganization = new VirtualOrganizationImpl();
		return virtualOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractualObligation createContractualObligation() {
		ContractualObligationImpl contractualObligation = new ContractualObligationImpl();
		return contractualObligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EResourceType createEResourceTypeFromString(EDataType eDataType, String initialValue) {
		EResourceType result = EResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EResourceStatus createEResourceStatusFromString(EDataType eDataType, String initialValue) {
		EResourceStatus result = EResourceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEResourceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessStepType createEProcessStepTypeFromString(EDataType eDataType, String initialValue) {
		EProcessStepType result = EProcessStepType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEProcessStepTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessStepNotation createEProcessStepNotationFromString(EDataType eDataType, String initialValue) {
		EProcessStepNotation result = EProcessStepNotation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEProcessStepNotationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGateType createEGateTypeFromString(EDataType eDataType, String initialValue) {
		EGateType result = EGateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEGateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERelationshipType createERelationshipTypeFromString(EDataType eDataType, String initialValue) {
		ERelationshipType result = ERelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorSeverity createEErrorSeverityFromString(EDataType eDataType, String initialValue) {
		EErrorSeverity result = EErrorSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEErrorSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorDomain createEErrorDomainFromString(EDataType eDataType, String initialValue) {
		EErrorDomain result = EErrorDomain.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEErrorDomainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorOccurrence createEErrorOccurrenceFromString(EDataType eDataType, String initialValue) {
		EErrorOccurrence result = EErrorOccurrence.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEErrorOccurrenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorDetection createEErrorDetectionFromString(EDataType eDataType, String initialValue) {
		EErrorDetection result = EErrorDetection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEErrorDetectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessElementStatus createEProcessElementStatusFromString(EDataType eDataType, String initialValue) {
		EProcessElementStatus result = EProcessElementStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEProcessElementStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorType createEErrorTypeFromString(EDataType eDataType, String initialValue) {
		EErrorType result = EErrorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEErrorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorStatus createEErrorStatusFromString(EDataType eDataType, String initialValue) {
		EErrorStatus result = EErrorStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEErrorStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessParameterType createEProcessParameterTypeFromString(EDataType eDataType, String initialValue) {
		EProcessParameterType result = EProcessParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEProcessParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPersistenceType createEPersistenceTypeFromString(EDataType eDataType, String initialValue) {
		EPersistenceType result = EPersistenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPersistenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOrganizationRole createEOrganizationRoleFromString(EDataType eDataType, String initialValue) {
		EOrganizationRole result = EOrganizationRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEOrganizationRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessElementObligationsFulfilled createEProcessElementObligationsFulfilledFromString(EDataType eDataType, String initialValue) {
		EProcessElementObligationsFulfilled result = EProcessElementObligationsFulfilled.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEProcessElementObligationsFulfilledToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Process_modelingPackage getProcess_modelingPackage() {
		return (Process_modelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Process_modelingPackage getPackage() {
		return Process_modelingPackage.eINSTANCE;
	}

} //Process_modelingFactoryImpl
