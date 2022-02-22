/**
 */
package process_modeling.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import process_modeling.Process_modelingFactory;
import process_modeling.Process_modelingPackage;
import process_modeling.Product;
import process_modeling.Relationship;
import process_modeling.Resource;
import process_modeling.SubProcess;
import process_modeling.Traceable;
import process_modeling.UnorderedSteps;
import process_modeling.VirtualOrganization;

import process_modeling.util.Process_modelingValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Process_modelingPackageImpl extends EPackageImpl implements Process_modelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unorderedStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractualObligationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eResourceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eProcessStepTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eProcessStepNotationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eGateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eErrorSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eErrorDomainEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eErrorOccurrenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eErrorDetectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eProcessElementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eErrorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eErrorStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eProcessParameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ePersistenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eOrganizationRoleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see process_modeling.Process_modelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Process_modelingPackageImpl() {
		super(eNS_URI, Process_modelingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Process_modelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Process_modelingPackage init() {
		if (isInited) return (Process_modelingPackage)EPackage.Registry.INSTANCE.getEPackage(Process_modelingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProcess_modelingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Process_modelingPackageImpl theProcess_modelingPackage = registeredProcess_modelingPackage instanceof Process_modelingPackageImpl ? (Process_modelingPackageImpl)registeredProcess_modelingPackage : new Process_modelingPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProcess_modelingPackage.createPackageContents();

		// Initialize created meta-data
		theProcess_modelingPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theProcess_modelingPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Process_modelingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theProcess_modelingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Process_modelingPackage.eNS_URI, theProcess_modelingPackage);
		return theProcess_modelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_IsActuator() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_IsStorage() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Type() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Protocol() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Status() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Capabilities() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Inventory() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_MaterialFlowSource() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_MaterialFlowTarget() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Version() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Elements() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Relationships() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_StartStep() {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_UnidentifiedErrorHandler() {
		return (EReference)processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_ProposedProcess() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Company() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Author() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Date() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Parameters() {
		return (EReference)processEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessStep() {
		return processStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessStep_Type() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessStep_Notation() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_Capability() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_InProducts() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_OutProducts() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessStep_Description() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_Resource() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessStep_AcceptanceCriterion() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessStep_CompletionCriterion() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_Errors() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_ContractualObligation() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_Type() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_LogicalCondition() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_Message() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Constraints() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_RequiresStorage() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Parameters() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IsStored() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Constraints() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Equivalent() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Storage() {
		return (EReference)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Quantity() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IsFinal() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_PhysicalDimension() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_RelationalOperator() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_Value() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_MetricUnit() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessElement() {
		return processElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessElement_InRelationships() {
		return (EReference)processElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessElement_OutRelationships() {
		return (EReference)processElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessElement_IsErrorGroup() {
		return (EAttribute)processElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessElement_Status() {
		return (EAttribute)processElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGate_Type() {
		return (EAttribute)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDNamedElement() {
		return idNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDNamedElement_Id() {
		return (EAttribute)idNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDNamedElement_Name() {
		return (EAttribute)idNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDNamedElement_ExposeToCollaboratingParties() {
		return (EAttribute)idNamedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDNamedElement_Alias() {
		return (EAttribute)idNamedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Key() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Domain() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Type() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Status() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Message() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Description() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Mode() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Effect() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Cause() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Prevention() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Severity() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Occurrence() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getError_Detection() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getError_GlobalErrorHandler() {
		return (EReference)errorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getError_LocalErrorHandler() {
		return (EReference)errorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubProcess() {
		return subProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubProcess_Process() {
		return (EReference)subProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubProcess_Parameters() {
		return (EReference)subProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnorderedSteps() {
		return unorderedStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnorderedSteps_Steps() {
		return (EReference)unorderedStepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessParameter() {
		return processParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessParameter_Type() {
		return (EAttribute)processParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessParameter_Product() {
		return (EReference)processParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessParameter_Parameter() {
		return (EReference)processParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraceable() {
		return traceableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraceable_IsTraced() {
		return (EAttribute)traceableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraceable_LogStartTime() {
		return (EAttribute)traceableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraceable_LogEndTime() {
		return (EAttribute)traceableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistable() {
		return persistableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistable_IsPersisted() {
		return (EAttribute)persistableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistable_PersistenceType() {
		return (EAttribute)persistableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualOrganization() {
		return virtualOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualOrganization_Organizations() {
		return (EReference)virtualOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVirtualOrganization_EndorsementPolicy() {
		return (EAttribute)virtualOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganization_Role() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Elements() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganization_DltPeerAddress() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContractualObligation() {
		return contractualObligationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContractualObligation_Parameters() {
		return (EReference)contractualObligationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEResourceType() {
		return eResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEResourceStatus() {
		return eResourceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEProcessStepType() {
		return eProcessStepTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEProcessStepNotation() {
		return eProcessStepNotationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEGateType() {
		return eGateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getERelationshipType() {
		return eRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEErrorSeverity() {
		return eErrorSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEErrorDomain() {
		return eErrorDomainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEErrorOccurrence() {
		return eErrorOccurrenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEErrorDetection() {
		return eErrorDetectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEProcessElementStatus() {
		return eProcessElementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEErrorType() {
		return eErrorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEErrorStatus() {
		return eErrorStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEProcessParameterType() {
		return eProcessParameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEPersistenceType() {
		return ePersistenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEOrganizationRole() {
		return eOrganizationRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Process_modelingFactory getProcess_modelingFactory() {
		return (Process_modelingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__IS_ACTUATOR);
		createEAttribute(resourceEClass, RESOURCE__IS_STORAGE);
		createEAttribute(resourceEClass, RESOURCE__TYPE);
		createEAttribute(resourceEClass, RESOURCE__PROTOCOL);
		createEAttribute(resourceEClass, RESOURCE__STATUS);
		createEReference(resourceEClass, RESOURCE__CAPABILITIES);
		createEReference(resourceEClass, RESOURCE__INVENTORY);
		createEReference(resourceEClass, RESOURCE__MATERIAL_FLOW_SOURCE);
		createEReference(resourceEClass, RESOURCE__MATERIAL_FLOW_TARGET);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__VERSION);
		createEReference(processEClass, PROCESS__ELEMENTS);
		createEReference(processEClass, PROCESS__RELATIONSHIPS);
		createEReference(processEClass, PROCESS__START_STEP);
		createEReference(processEClass, PROCESS__UNIDENTIFIED_ERROR_HANDLER);
		createEAttribute(processEClass, PROCESS__PROPOSED_PROCESS);
		createEAttribute(processEClass, PROCESS__COMPANY);
		createEAttribute(processEClass, PROCESS__AUTHOR);
		createEAttribute(processEClass, PROCESS__DATE);
		createEReference(processEClass, PROCESS__PARAMETERS);

		processStepEClass = createEClass(PROCESS_STEP);
		createEAttribute(processStepEClass, PROCESS_STEP__TYPE);
		createEAttribute(processStepEClass, PROCESS_STEP__NOTATION);
		createEReference(processStepEClass, PROCESS_STEP__CAPABILITY);
		createEReference(processStepEClass, PROCESS_STEP__IN_PRODUCTS);
		createEReference(processStepEClass, PROCESS_STEP__OUT_PRODUCTS);
		createEAttribute(processStepEClass, PROCESS_STEP__DESCRIPTION);
		createEReference(processStepEClass, PROCESS_STEP__RESOURCE);
		createEAttribute(processStepEClass, PROCESS_STEP__ACCEPTANCE_CRITERION);
		createEAttribute(processStepEClass, PROCESS_STEP__COMPLETION_CRITERION);
		createEReference(processStepEClass, PROCESS_STEP__ERRORS);
		createEReference(processStepEClass, PROCESS_STEP__CONTRACTUAL_OBLIGATION);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);
		createEAttribute(relationshipEClass, RELATIONSHIP__LOGICAL_CONDITION);
		createEAttribute(relationshipEClass, RELATIONSHIP__MESSAGE);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__CONSTRAINTS);
		createEAttribute(capabilityEClass, CAPABILITY__REQUIRES_STORAGE);
		createEReference(capabilityEClass, CAPABILITY__PARAMETERS);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__IS_STORED);
		createEReference(productEClass, PRODUCT__CONSTRAINTS);
		createEReference(productEClass, PRODUCT__EQUIVALENT);
		createEReference(productEClass, PRODUCT__STORAGE);
		createEAttribute(productEClass, PRODUCT__QUANTITY);
		createEAttribute(productEClass, PRODUCT__IS_FINAL);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__PHYSICAL_DIMENSION);
		createEAttribute(constraintEClass, CONSTRAINT__RELATIONAL_OPERATOR);
		createEAttribute(constraintEClass, CONSTRAINT__VALUE);
		createEAttribute(constraintEClass, CONSTRAINT__METRIC_UNIT);

		processElementEClass = createEClass(PROCESS_ELEMENT);
		createEReference(processElementEClass, PROCESS_ELEMENT__IN_RELATIONSHIPS);
		createEReference(processElementEClass, PROCESS_ELEMENT__OUT_RELATIONSHIPS);
		createEAttribute(processElementEClass, PROCESS_ELEMENT__IS_ERROR_GROUP);
		createEAttribute(processElementEClass, PROCESS_ELEMENT__STATUS);

		gateEClass = createEClass(GATE);
		createEAttribute(gateEClass, GATE__TYPE);

		idNamedElementEClass = createEClass(ID_NAMED_ELEMENT);
		createEAttribute(idNamedElementEClass, ID_NAMED_ELEMENT__ID);
		createEAttribute(idNamedElementEClass, ID_NAMED_ELEMENT__NAME);
		createEAttribute(idNamedElementEClass, ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES);
		createEAttribute(idNamedElementEClass, ID_NAMED_ELEMENT__ALIAS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__KEY);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		errorEClass = createEClass(ERROR);
		createEAttribute(errorEClass, ERROR__DOMAIN);
		createEAttribute(errorEClass, ERROR__TYPE);
		createEAttribute(errorEClass, ERROR__STATUS);
		createEAttribute(errorEClass, ERROR__MESSAGE);
		createEAttribute(errorEClass, ERROR__DESCRIPTION);
		createEAttribute(errorEClass, ERROR__MODE);
		createEAttribute(errorEClass, ERROR__EFFECT);
		createEAttribute(errorEClass, ERROR__CAUSE);
		createEAttribute(errorEClass, ERROR__PREVENTION);
		createEAttribute(errorEClass, ERROR__SEVERITY);
		createEAttribute(errorEClass, ERROR__OCCURRENCE);
		createEAttribute(errorEClass, ERROR__DETECTION);
		createEReference(errorEClass, ERROR__GLOBAL_ERROR_HANDLER);
		createEReference(errorEClass, ERROR__LOCAL_ERROR_HANDLER);

		subProcessEClass = createEClass(SUB_PROCESS);
		createEReference(subProcessEClass, SUB_PROCESS__PROCESS);
		createEReference(subProcessEClass, SUB_PROCESS__PARAMETERS);

		unorderedStepsEClass = createEClass(UNORDERED_STEPS);
		createEReference(unorderedStepsEClass, UNORDERED_STEPS__STEPS);

		processParameterEClass = createEClass(PROCESS_PARAMETER);
		createEAttribute(processParameterEClass, PROCESS_PARAMETER__TYPE);
		createEReference(processParameterEClass, PROCESS_PARAMETER__PRODUCT);
		createEReference(processParameterEClass, PROCESS_PARAMETER__PARAMETER);

		traceableEClass = createEClass(TRACEABLE);
		createEAttribute(traceableEClass, TRACEABLE__IS_TRACED);
		createEAttribute(traceableEClass, TRACEABLE__LOG_START_TIME);
		createEAttribute(traceableEClass, TRACEABLE__LOG_END_TIME);

		persistableEClass = createEClass(PERSISTABLE);
		createEAttribute(persistableEClass, PERSISTABLE__IS_PERSISTED);
		createEAttribute(persistableEClass, PERSISTABLE__PERSISTENCE_TYPE);

		virtualOrganizationEClass = createEClass(VIRTUAL_ORGANIZATION);
		createEReference(virtualOrganizationEClass, VIRTUAL_ORGANIZATION__ORGANIZATIONS);
		createEAttribute(virtualOrganizationEClass, VIRTUAL_ORGANIZATION__ENDORSEMENT_POLICY);

		organizationEClass = createEClass(ORGANIZATION);
		createEAttribute(organizationEClass, ORGANIZATION__ROLE);
		createEReference(organizationEClass, ORGANIZATION__ELEMENTS);
		createEAttribute(organizationEClass, ORGANIZATION__DLT_PEER_ADDRESS);

		contractualObligationEClass = createEClass(CONTRACTUAL_OBLIGATION);
		createEReference(contractualObligationEClass, CONTRACTUAL_OBLIGATION__PARAMETERS);

		// Create enums
		eResourceTypeEEnum = createEEnum(ERESOURCE_TYPE);
		eResourceStatusEEnum = createEEnum(ERESOURCE_STATUS);
		eProcessStepTypeEEnum = createEEnum(EPROCESS_STEP_TYPE);
		eProcessStepNotationEEnum = createEEnum(EPROCESS_STEP_NOTATION);
		eGateTypeEEnum = createEEnum(EGATE_TYPE);
		eRelationshipTypeEEnum = createEEnum(ERELATIONSHIP_TYPE);
		eErrorSeverityEEnum = createEEnum(EERROR_SEVERITY);
		eErrorDomainEEnum = createEEnum(EERROR_DOMAIN);
		eErrorOccurrenceEEnum = createEEnum(EERROR_OCCURRENCE);
		eErrorDetectionEEnum = createEEnum(EERROR_DETECTION);
		eProcessElementStatusEEnum = createEEnum(EPROCESS_ELEMENT_STATUS);
		eErrorTypeEEnum = createEEnum(EERROR_TYPE);
		eErrorStatusEEnum = createEEnum(EERROR_STATUS);
		eProcessParameterTypeEEnum = createEEnum(EPROCESS_PARAMETER_TYPE);
		ePersistenceTypeEEnum = createEEnum(EPERSISTENCE_TYPE);
		eOrganizationRoleEEnum = createEEnum(EORGANIZATION_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceEClass.getESuperTypes().add(this.getIDNamedElement());
		resourceEClass.getESuperTypes().add(this.getPersistable());
		processEClass.getESuperTypes().add(this.getIDNamedElement());
		processStepEClass.getESuperTypes().add(this.getProcessElement());
		relationshipEClass.getESuperTypes().add(this.getIDNamedElement());
		capabilityEClass.getESuperTypes().add(this.getIDNamedElement());
		capabilityEClass.getESuperTypes().add(this.getPersistable());
		productEClass.getESuperTypes().add(this.getIDNamedElement());
		productEClass.getESuperTypes().add(this.getPersistable());
		constraintEClass.getESuperTypes().add(this.getIDNamedElement());
		constraintEClass.getESuperTypes().add(this.getPersistable());
		processElementEClass.getESuperTypes().add(this.getIDNamedElement());
		processElementEClass.getESuperTypes().add(this.getTraceable());
		gateEClass.getESuperTypes().add(this.getProcessElement());
		parameterEClass.getESuperTypes().add(this.getIDNamedElement());
		parameterEClass.getESuperTypes().add(this.getPersistable());
		errorEClass.getESuperTypes().add(this.getIDNamedElement());
		subProcessEClass.getESuperTypes().add(this.getProcessElement());
		unorderedStepsEClass.getESuperTypes().add(this.getProcessElement());
		processParameterEClass.getESuperTypes().add(this.getIDNamedElement());
		virtualOrganizationEClass.getESuperTypes().add(this.getProcessElement());
		organizationEClass.getESuperTypes().add(this.getProcessElement());
		contractualObligationEClass.getESuperTypes().add(this.getPersistable());
		contractualObligationEClass.getESuperTypes().add(this.getIDNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_IsActuator(), ecorePackage.getEBoolean(), "isActuator", "true", 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_IsStorage(), ecorePackage.getEBoolean(), "isStorage", "false", 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Type(), this.getEResourceType(), "type", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Status(), this.getEResourceStatus(), "status", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Inventory(), this.getProduct(), null, "inventory", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_MaterialFlowSource(), this.getResource(), this.getResource_MaterialFlowTarget(), "materialFlowSource", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_MaterialFlowTarget(), this.getResource(), this.getResource_MaterialFlowSource(), "materialFlowTarget", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, process_modeling.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Version(), ecorePackage.getEInt(), "version", null, 1, 1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Elements(), this.getProcessElement(), null, "elements", null, 1, -1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_Relationships(), this.getRelationship(), null, "relationships", null, 1, -1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_StartStep(), this.getProcessStep(), null, "startStep", null, 1, 1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_UnidentifiedErrorHandler(), this.getProcess(), null, "unidentifiedErrorHandler", null, 0, 1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_ProposedProcess(), ecorePackage.getEBoolean(), "proposedProcess", "true", 0, 1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Company(), ecorePackage.getEString(), "company", null, 0, 1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Author(), ecorePackage.getEString(), "author", null, 0, 1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Date(), ecorePackage.getEString(), "date", null, 0, 1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Parameters(), this.getProcessParameter(), null, "parameters", null, 0, -1, process_modeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processStepEClass, ProcessStep.class, "ProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessStep_Type(), this.getEProcessStepType(), "type", "REGULAR", 1, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStep_Notation(), this.getEProcessStepNotation(), "notation", "OPERATION", 1, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Capability(), this.getCapability(), null, "capability", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_InProducts(), this.getProduct(), null, "inProducts", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_OutProducts(), this.getProduct(), null, "outProducts", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Resource(), this.getResource(), null, "resource", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStep_AcceptanceCriterion(), ecorePackage.getEString(), "acceptanceCriterion", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStep_CompletionCriterion(), ecorePackage.getEString(), "completionCriterion", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Errors(), this.getError(), null, "errors", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_ContractualObligation(), this.getContractualObligation(), null, "contractualObligation", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Type(), this.getERelationshipType(), "type", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_LogicalCondition(), ecorePackage.getEString(), "logicalCondition", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Message(), ecorePackage.getEString(), "message", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Source(), this.getProcessElement(), this.getProcessElement_OutRelationships(), "source", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getProcessElement(), this.getProcessElement_InRelationships(), "target", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCapability_RequiresStorage(), ecorePackage.getEBoolean(), "requiresStorage", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_IsStored(), ecorePackage.getEBoolean(), "isStored", "false", 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Equivalent(), this.getProduct(), null, "equivalent", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Storage(), this.getResource(), null, "storage", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_PhysicalDimension(), ecorePackage.getEString(), "physicalDimension", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_RelationalOperator(), ecorePackage.getEString(), "relationalOperator", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Value(), ecorePackage.getEString(), "value", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_MetricUnit(), ecorePackage.getEString(), "metricUnit", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processElementEClass, ProcessElement.class, "ProcessElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessElement_InRelationships(), this.getRelationship(), this.getRelationship_Target(), "inRelationships", null, 0, -1, ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessElement_OutRelationships(), this.getRelationship(), this.getRelationship_Source(), "outRelationships", null, 0, -1, ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProcessElement_IsErrorGroup(), ecorePackage.getEBoolean(), "isErrorGroup", null, 1, 1, ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessElement_Status(), this.getEProcessElementStatus(), "status", null, 1, 1, ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGate_Type(), this.getEGateType(), "type", null, 1, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idNamedElementEClass, IDNamedElement.class, "IDNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDNamedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IDNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IDNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDNamedElement_ExposeToCollaboratingParties(), ecorePackage.getEBoolean(), "exposeToCollaboratingParties", "false", 1, 1, IDNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDNamedElement_Alias(), ecorePackage.getEString(), "alias", "", 0, 1, IDNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Key(), ecorePackage.getEString(), "key", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorEClass, process_modeling.Error.class, "Error", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getError_Domain(), this.getEErrorDomain(), "domain", null, 1, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Type(), this.getEErrorType(), "type", "NAMED_ERROR", 1, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Status(), this.getEErrorStatus(), "status", null, 1, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Message(), ecorePackage.getEString(), "message", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Description(), ecorePackage.getEString(), "description", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Effect(), ecorePackage.getEString(), "effect", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Cause(), ecorePackage.getEString(), "cause", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Prevention(), ecorePackage.getEString(), "prevention", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Severity(), ecorePackage.getEInt(), "severity", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Occurrence(), ecorePackage.getEInt(), "occurrence", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Detection(), ecorePackage.getEInt(), "detection", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getError_GlobalErrorHandler(), this.getProcess(), null, "globalErrorHandler", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getError_LocalErrorHandler(), this.getProcessElement(), null, "localErrorHandler", null, 0, 1, process_modeling.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subProcessEClass, SubProcess.class, "SubProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubProcess_Process(), this.getProcess(), null, "process", null, 1, 1, SubProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubProcess_Parameters(), this.getProcessParameter(), null, "parameters", null, 0, -1, SubProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unorderedStepsEClass, UnorderedSteps.class, "UnorderedSteps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnorderedSteps_Steps(), this.getProcessStep(), null, "steps", null, 1, -1, UnorderedSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processParameterEClass, ProcessParameter.class, "ProcessParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessParameter_Type(), this.getEProcessParameterType(), "type", null, 1, 1, ProcessParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessParameter_Product(), this.getProduct(), null, "product", null, 0, 1, ProcessParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessParameter_Parameter(), this.getProcessParameter(), null, "parameter", null, 0, 1, ProcessParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceableEClass, Traceable.class, "Traceable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceable_IsTraced(), ecorePackage.getEBoolean(), "isTraced", null, 1, 1, Traceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceable_LogStartTime(), ecorePackage.getEBoolean(), "logStartTime", null, 0, 1, Traceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceable_LogEndTime(), ecorePackage.getEBoolean(), "logEndTime", null, 0, 1, Traceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistableEClass, Persistable.class, "Persistable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistable_IsPersisted(), ecorePackage.getEBoolean(), "isPersisted", null, 1, 1, Persistable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistable_PersistenceType(), this.getEPersistenceType(), "persistenceType", null, 1, 1, Persistable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualOrganizationEClass, VirtualOrganization.class, "VirtualOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualOrganization_Organizations(), this.getOrganization(), null, "organizations", null, 0, -1, VirtualOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualOrganization_EndorsementPolicy(), ecorePackage.getEString(), "endorsementPolicy", null, 0, 1, VirtualOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganization_Role(), this.getEOrganizationRole(), "role", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Elements(), this.getProcessElement(), null, "elements", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_DltPeerAddress(), ecorePackage.getEString(), "dltPeerAddress", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractualObligationEClass, ContractualObligation.class, "ContractualObligation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContractualObligation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ContractualObligation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eResourceTypeEEnum, EResourceType.class, "EResourceType");
		addEEnumLiteral(eResourceTypeEEnum, EResourceType.NONE);
		addEEnumLiteral(eResourceTypeEEnum, EResourceType.HUMAN);
		addEEnumLiteral(eResourceTypeEEnum, EResourceType.MACHINE);

		initEEnum(eResourceStatusEEnum, EResourceStatus.class, "EResourceStatus");
		addEEnumLiteral(eResourceStatusEEnum, EResourceStatus.STOPPED);
		addEEnumLiteral(eResourceStatusEEnum, EResourceStatus.RUNNING);
		addEEnumLiteral(eResourceStatusEEnum, EResourceStatus.MALFUNCTIONING);
		addEEnumLiteral(eResourceStatusEEnum, EResourceStatus.MAINTAINING);

		initEEnum(eProcessStepTypeEEnum, EProcessStepType.class, "EProcessStepType");
		addEEnumLiteral(eProcessStepTypeEEnum, EProcessStepType.REGULAR);
		addEEnumLiteral(eProcessStepTypeEEnum, EProcessStepType.START);
		addEEnumLiteral(eProcessStepTypeEEnum, EProcessStepType.END);

		initEEnum(eProcessStepNotationEEnum, EProcessStepNotation.class, "EProcessStepNotation");
		addEEnumLiteral(eProcessStepNotationEEnum, EProcessStepNotation.NONE);
		addEEnumLiteral(eProcessStepNotationEEnum, EProcessStepNotation.OPERATION);
		addEEnumLiteral(eProcessStepNotationEEnum, EProcessStepNotation.INSPECTION);
		addEEnumLiteral(eProcessStepNotationEEnum, EProcessStepNotation.TRANSPORTATION);
		addEEnumLiteral(eProcessStepNotationEEnum, EProcessStepNotation.CONFIGURATION);
		addEEnumLiteral(eProcessStepNotationEEnum, EProcessStepNotation.DELAY);

		initEEnum(eGateTypeEEnum, EGateType.class, "EGateType");
		addEEnumLiteral(eGateTypeEEnum, EGateType.DECISION);
		addEEnumLiteral(eGateTypeEEnum, EGateType.PARALLELISM);
		addEEnumLiteral(eGateTypeEEnum, EGateType.COLLABORATION);
		addEEnumLiteral(eGateTypeEEnum, EGateType.VARIATION);

		initEEnum(eRelationshipTypeEEnum, ERelationshipType.class, "ERelationshipType");
		addEEnumLiteral(eRelationshipTypeEEnum, ERelationshipType.FLOW);
		addEEnumLiteral(eRelationshipTypeEEnum, ERelationshipType.COLLABORATION);
		addEEnumLiteral(eRelationshipTypeEEnum, ERelationshipType.ERROR);

		initEEnum(eErrorSeverityEEnum, EErrorSeverity.class, "EErrorSeverity");
		addEEnumLiteral(eErrorSeverityEEnum, EErrorSeverity.MINOR);
		addEEnumLiteral(eErrorSeverityEEnum, EErrorSeverity.LOW);
		addEEnumLiteral(eErrorSeverityEEnum, EErrorSeverity.MODERATE);
		addEEnumLiteral(eErrorSeverityEEnum, EErrorSeverity.HIGH);
		addEEnumLiteral(eErrorSeverityEEnum, EErrorSeverity.VERY_HIGH);

		initEEnum(eErrorDomainEEnum, EErrorDomain.class, "EErrorDomain");
		addEEnumLiteral(eErrorDomainEEnum, EErrorDomain.LOCAL);
		addEEnumLiteral(eErrorDomainEEnum, EErrorDomain.GLOBAL);

		initEEnum(eErrorOccurrenceEEnum, EErrorOccurrence.class, "EErrorOccurrence");
		addEEnumLiteral(eErrorOccurrenceEEnum, EErrorOccurrence.REMOTE);
		addEEnumLiteral(eErrorOccurrenceEEnum, EErrorOccurrence.VERY_LOW);
		addEEnumLiteral(eErrorOccurrenceEEnum, EErrorOccurrence.LOW);
		addEEnumLiteral(eErrorOccurrenceEEnum, EErrorOccurrence.MODERATE);
		addEEnumLiteral(eErrorOccurrenceEEnum, EErrorOccurrence.HIGH);
		addEEnumLiteral(eErrorOccurrenceEEnum, EErrorOccurrence.VERY_HIGH);

		initEEnum(eErrorDetectionEEnum, EErrorDetection.class, "EErrorDetection");
		addEEnumLiteral(eErrorDetectionEEnum, EErrorDetection.VERY_HIGH);
		addEEnumLiteral(eErrorDetectionEEnum, EErrorDetection.HIGH);
		addEEnumLiteral(eErrorDetectionEEnum, EErrorDetection.MODERATE);
		addEEnumLiteral(eErrorDetectionEEnum, EErrorDetection.LOW);
		addEEnumLiteral(eErrorDetectionEEnum, EErrorDetection.VERY_LOW);
		addEEnumLiteral(eErrorDetectionEEnum, EErrorDetection.NON_DETECTION);

		initEEnum(eProcessElementStatusEEnum, EProcessElementStatus.class, "EProcessElementStatus");
		addEEnumLiteral(eProcessElementStatusEEnum, EProcessElementStatus.INACTIVE);
		addEEnumLiteral(eProcessElementStatusEEnum, EProcessElementStatus.ACTIVE);
		addEEnumLiteral(eProcessElementStatusEEnum, EProcessElementStatus.ERROR);
		addEEnumLiteral(eProcessElementStatusEEnum, EProcessElementStatus.NONE);

		initEEnum(eErrorTypeEEnum, EErrorType.class, "EErrorType");
		addEEnumLiteral(eErrorTypeEEnum, EErrorType.DEFAULT);
		addEEnumLiteral(eErrorTypeEEnum, EErrorType.NAMED_ERROR);

		initEEnum(eErrorStatusEEnum, EErrorStatus.class, "EErrorStatus");
		addEEnumLiteral(eErrorStatusEEnum, EErrorStatus.INACTIVE);
		addEEnumLiteral(eErrorStatusEEnum, EErrorStatus.ACTIVE);

		initEEnum(eProcessParameterTypeEEnum, EProcessParameterType.class, "EProcessParameterType");
		addEEnumLiteral(eProcessParameterTypeEEnum, EProcessParameterType.INPUT_PRODUCT);
		addEEnumLiteral(eProcessParameterTypeEEnum, EProcessParameterType.OUTPUT_PRODUCT);

		initEEnum(ePersistenceTypeEEnum, EPersistenceType.class, "EPersistenceType");
		addEEnumLiteral(ePersistenceTypeEEnum, EPersistenceType.HASHED);
		addEEnumLiteral(ePersistenceTypeEEnum, EPersistenceType.ENCRYPTED);
		addEEnumLiteral(ePersistenceTypeEEnum, EPersistenceType.PLAIN_TEXT);

		initEEnum(eOrganizationRoleEEnum, EOrganizationRole.class, "EOrganizationRole");
		addEEnumLiteral(eOrganizationRoleEEnum, EOrganizationRole.BROKER);
		addEEnumLiteral(eOrganizationRoleEEnum, EOrganizationRole.CORE_PARTNER);
		addEEnumLiteral(eOrganizationRoleEEnum, EOrganizationRole.ADDITIONAL_PARTNER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (processEClass,
		   source,
		   new String[] {
			   "constraints", "oneStartProcessStep oneStartProcessStep2 oneEndProcessStep mustExistsStart mustExistsEnd"
		   });
		addAnnotation
		  (processStepEClass,
		   source,
		   new String[] {
			   "constraints", "onlyOneFlowRelationProcessStep startProcessStepHasOnlyOneLinkTo startProcessStepHasOnlyOneLinkTo2 endProcessStepHasOnlyOneLinkFrom"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "constraints", "onlyOneRelationBetweenElements flowBetweenStepsAndGates collaborationBetweenSteps"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (processEClass,
		   source,
		   new String[] {
			   "oneStartProcessStep", "\n\t\t\tProcessStep.allInstances()->forAll(ps1, ps2 | ((ps1.type = EProcessStepType::START) and (ps2.type = EProcessStepType::START)) implies (ps1 = ps2))",
			   "oneStartProcessStep2", "\n\t\t\tnot(ProcessStep.allInstances()->exists(ps1, ps2 | ps1.type = EProcessStepType::START and ps2.type = EProcessStepType::START and ps1 <> ps2))",
			   "oneEndProcessStep", "\n\t\t\tProcessStep.allInstances()->forAll(ps1, ps2 | ((ps1.type = EProcessStepType::END) and (ps2.type = EProcessStepType::END)) implies (ps1 = ps2))",
			   "mustExistsStart", "\n\t\t\tProcessStep.allInstances()->exists(ps | ps.type = EProcessStepType::START)",
			   "mustExistsEnd", "\n\t\t\tProcessStep.allInstances()->exists(ps | ps.type = EProcessStepType::END)"
		   });
		addAnnotation
		  (processStepEClass,
		   source,
		   new String[] {
			   "onlyOneFlowRelationProcessStep", "\n\t\t\tProcessStep.allInstances()->forAll(ps | ps.inRelationships->forAll(r1, r2 | (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW) implies (r1 = r2)) \n\t\t\t\tand ps.outRelationships->forAll(r1, r2 | (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW) implies (r1 = r2)))",
			   "startProcessStepHasOnlyOneLinkTo", "\n\t\t\tProcessStep.allInstances()->forAll(ps | (ps.type = EProcessStepType::START) implies ((ps.inRelationships->size() = 0) and (ps.outRelationships->size() = 1) and \n\t\t\t\t(ps.outRelationships->select(r | r.type = ERelationshipType::FLOW)->notEmpty())))",
			   "startProcessStepHasOnlyOneLinkTo2", "\n\t\t\tProcessStep.allInstances()->forAll(ps | (ps.type = EProcessStepType::START) implies (not((ps.inRelationships->exists(r | true))) and (ps.outRelationships->exists(r | true) and ps.outRelationships->forAll(r1, r2 | r1 = r2)) and \n\t\t\t\t(Relationship.allInstances()->exists(r | r.source.id = ps.id and r.type = ERelationshipType::FLOW))))",
			   "endProcessStepHasOnlyOneLinkFrom", "\n\t\t\tProcessStep.allInstances()->forAll(ps | (ps.type = EProcessStepType::END) implies ((ps.outRelationships->size() = 0) and (ps.inRelationships->size() = 1) and \n\t\t\t\t(ps.inRelationships->select(r | r.type = ERelationshipType::FLOW)->notEmpty())))"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "onlyOneRelationBetweenElements", "\n\t\t\tRelationship.allInstances()->forAll(r1, r2 | ((r1.target.id = r2.target.id and r1.source.id = r2.source.id) or\n\t\t\t\t(r1.target.id = r2.source.id and r1.source.id = r2.target.id) implies (r1 = r2)))",
			   "flowBetweenStepsAndGates", "\n\t\t\tRelationship.allInstances()->forAll(r | (r.type = ERelationshipType::FLOW) implies ((r.target.oclIsTypeOf(ProcessStep) or r.target.oclIsTypeOf(Gate)) and\n\t\t\t\t(r.source.oclIsTypeOf(ProcessStep) or r.source.oclIsTypeOf(Gate))))",
			   "collaborationBetweenSteps", "\n\t\t\tRelationship.allInstances()->forAll(r | (r.type = ERelationshipType::COLLABORATION) implies (r.target.oclIsTypeOf(ProcessStep) and r.source.oclIsTypeOf(ProcessStep)))"
		   });
	}

} //Process_modelingPackageImpl
