/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /ColProLan/model/process_modeling.ecore
 * using:
 *   /ColProLan/model/process_modeling.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package process_modeling;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import process_modeling.Process_modelingPackage;
// import process_modeling.Process_modelingTables;

/**
 * Process_modelingTables provides the dispatch tables for the process_modeling for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Process_modelingTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Process_modelingPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling = IdManager.getNsURIPackageId("http://www.trust40.com/process-modeling", null, Process_modelingPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Capability = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Capability", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Process_modelingTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CollaborativeNetwork = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("CollaborativeNetwork", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Constraint = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Constraint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ContractualObligation = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("ContractualObligation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Error = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Error", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Gate = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Gate", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Organization = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Organization", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parameter = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Process = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Process", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessElement = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("ProcessElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessParameter = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("ProcessParameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessStep = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("ProcessStep", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Product = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Product", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Relationship = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Relationship", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Resource = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SubProcess = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("SubProcess", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UnorderedSteps = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getClassId("UnorderedSteps", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Process_modelingTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EErrorDomain = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EErrorDomain");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EErrorStatus = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EErrorStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EErrorType = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EErrorType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EGateType = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EGateType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EOrganizationRole = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EOrganizationRole");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EPersistenceType = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EPersistenceType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EProcessElementObligationsFulfilled = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EProcessElementObligationsFulfilled");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EProcessElementStatus = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EProcessElementStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EProcessParameterType = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EProcessParameterType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EProcessStepNotation = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EProcessStepNotation");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EProcessStepType = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EProcessStepType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ERelationshipType = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("ERelationshipType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EResourceStatus = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EResourceStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EResourceType = Process_modelingTables.PACKid_http_c_s_s_www_trust40_com_s_process_m_modeling.getEnumerationId("EResourceType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Error = TypeId.BAG.getSpecializedId(Process_modelingTables.CLSSid_Error);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Process = TypeId.BAG.getSpecializedId(Process_modelingTables.CLSSid_Process);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ProcessParameter = TypeId.BAG.getSpecializedId(Process_modelingTables.CLSSid_ProcessParameter);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ProcessStep = TypeId.BAG.getSpecializedId(Process_modelingTables.CLSSid_ProcessStep);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Product = TypeId.BAG.getSpecializedId(Process_modelingTables.CLSSid_Product);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SubProcess = TypeId.BAG.getSpecializedId(Process_modelingTables.CLSSid_SubProcess);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_COLLABORATION = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId("COLLABORATION");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_END = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId("END");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_FLOW = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId("FLOW");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_START = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId("START");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Capability = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_Capability);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Constraint = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_Constraint);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Error = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_Error);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Organization = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_Organization);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_Parameter);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProcessElement = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_ProcessElement);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProcessParameter = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_ProcessParameter);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProcessStep = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_ProcessStep);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Product = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_Product);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Relationship = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_Relationship);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Resource = TypeId.ORDERED_SET.getSpecializedId(Process_modelingTables.CLSSid_Resource);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Constraint = TypeId.SET.getSpecializedId(Process_modelingTables.CLSSid_Constraint);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ProcessElement = TypeId.SET.getSpecializedId(Process_modelingTables.CLSSid_ProcessElement);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ProcessStep = TypeId.SET.getSpecializedId(Process_modelingTables.CLSSid_ProcessStep);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Relationship = TypeId.SET.getSpecializedId(Process_modelingTables.CLSSid_Relationship);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Process_modelingTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Capability = new EcoreExecutorType(Process_modelingPackage.Literals.CAPABILITY, PACKAGE, 0);
		public static final EcoreExecutorType _CollaborativeNetwork = new EcoreExecutorType(Process_modelingPackage.Literals.COLLABORATIVE_NETWORK, PACKAGE, 0);
		public static final EcoreExecutorType _Constraint = new EcoreExecutorType(Process_modelingPackage.Literals.CONSTRAINT, PACKAGE, 0);
		public static final EcoreExecutorType _ContractualObligation = new EcoreExecutorType(Process_modelingPackage.Literals.CONTRACTUAL_OBLIGATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EErrorDetection = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EERROR_DETECTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EErrorDomain = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EERROR_DOMAIN, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EErrorOccurrence = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EERROR_OCCURRENCE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EErrorSeverity = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EERROR_SEVERITY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EErrorStatus = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EERROR_STATUS, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EErrorType = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EERROR_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EGateType = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EGATE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EOrganizationRole = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EORGANIZATION_ROLE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EPersistenceType = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EPERSISTENCE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EProcessElementObligationsFulfilled = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EPROCESS_ELEMENT_OBLIGATIONS_FULFILLED, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EProcessElementStatus = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EPROCESS_ELEMENT_STATUS, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EProcessParameterType = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EPROCESS_PARAMETER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EProcessStepNotation = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EPROCESS_STEP_NOTATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EProcessStepType = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.EPROCESS_STEP_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ERelationshipType = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.ERELATIONSHIP_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EResourceStatus = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.ERESOURCE_STATUS, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EResourceType = new EcoreExecutorEnumeration(Process_modelingPackage.Literals.ERESOURCE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Error = new EcoreExecutorType(Process_modelingPackage.Literals.ERROR, PACKAGE, 0);
		public static final EcoreExecutorType _Gate = new EcoreExecutorType(Process_modelingPackage.Literals.GATE, PACKAGE, 0);
		public static final EcoreExecutorType _IDNamedElement = new EcoreExecutorType(Process_modelingPackage.Literals.ID_NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Organization = new EcoreExecutorType(Process_modelingPackage.Literals.ORGANIZATION, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(Process_modelingPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _Persistable = new EcoreExecutorType(Process_modelingPackage.Literals.PERSISTABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Process = new EcoreExecutorType(Process_modelingPackage.Literals.PROCESS, PACKAGE, 0);
		public static final EcoreExecutorType _ProcessElement = new EcoreExecutorType(Process_modelingPackage.Literals.PROCESS_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ProcessParameter = new EcoreExecutorType(Process_modelingPackage.Literals.PROCESS_PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _ProcessStep = new EcoreExecutorType(Process_modelingPackage.Literals.PROCESS_STEP, PACKAGE, 0);
		public static final EcoreExecutorType _Product = new EcoreExecutorType(Process_modelingPackage.Literals.PRODUCT, PACKAGE, 0);
		public static final EcoreExecutorType _Relationship = new EcoreExecutorType(Process_modelingPackage.Literals.RELATIONSHIP, PACKAGE, 0);
		public static final EcoreExecutorType _Resource = new EcoreExecutorType(Process_modelingPackage.Literals.RESOURCE, PACKAGE, 0);
		public static final EcoreExecutorType _SubProcess = new EcoreExecutorType(Process_modelingPackage.Literals.SUB_PROCESS, PACKAGE, 0);
		public static final EcoreExecutorType _Traceable = new EcoreExecutorType(Process_modelingPackage.Literals.TRACEABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _UnorderedSteps = new EcoreExecutorType(Process_modelingPackage.Literals.UNORDERED_STEPS, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Capability,
			_CollaborativeNetwork,
			_Constraint,
			_ContractualObligation,
			_EErrorDetection,
			_EErrorDomain,
			_EErrorOccurrence,
			_EErrorSeverity,
			_EErrorStatus,
			_EErrorType,
			_EGateType,
			_EOrganizationRole,
			_EPersistenceType,
			_EProcessElementObligationsFulfilled,
			_EProcessElementStatus,
			_EProcessParameterType,
			_EProcessStepNotation,
			_EProcessStepType,
			_ERelationshipType,
			_EResourceStatus,
			_EResourceType,
			_Error,
			_Gate,
			_IDNamedElement,
			_Organization,
			_Parameter,
			_Persistable,
			_Process,
			_ProcessElement,
			_ProcessParameter,
			_ProcessStep,
			_Product,
			_Relationship,
			_Resource,
			_SubProcess,
			_Traceable,
			_UnorderedSteps
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Capability__Capability = new ExecutorFragment(Types._Capability, Process_modelingTables.Types._Capability);
		private static final ExecutorFragment _Capability__IDNamedElement = new ExecutorFragment(Types._Capability, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Capability__OclAny = new ExecutorFragment(Types._Capability, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Capability__OclElement = new ExecutorFragment(Types._Capability, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Capability__Persistable = new ExecutorFragment(Types._Capability, Process_modelingTables.Types._Persistable);

		private static final ExecutorFragment _CollaborativeNetwork__CollaborativeNetwork = new ExecutorFragment(Types._CollaborativeNetwork, Process_modelingTables.Types._CollaborativeNetwork);
		private static final ExecutorFragment _CollaborativeNetwork__IDNamedElement = new ExecutorFragment(Types._CollaborativeNetwork, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _CollaborativeNetwork__OclAny = new ExecutorFragment(Types._CollaborativeNetwork, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CollaborativeNetwork__OclElement = new ExecutorFragment(Types._CollaborativeNetwork, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CollaborativeNetwork__ProcessElement = new ExecutorFragment(Types._CollaborativeNetwork, Process_modelingTables.Types._ProcessElement);
		private static final ExecutorFragment _CollaborativeNetwork__Traceable = new ExecutorFragment(Types._CollaborativeNetwork, Process_modelingTables.Types._Traceable);

		private static final ExecutorFragment _Constraint__Constraint = new ExecutorFragment(Types._Constraint, Process_modelingTables.Types._Constraint);
		private static final ExecutorFragment _Constraint__IDNamedElement = new ExecutorFragment(Types._Constraint, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Constraint__OclAny = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Constraint__OclElement = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Constraint__Persistable = new ExecutorFragment(Types._Constraint, Process_modelingTables.Types._Persistable);

		private static final ExecutorFragment _ContractualObligation__ContractualObligation = new ExecutorFragment(Types._ContractualObligation, Process_modelingTables.Types._ContractualObligation);
		private static final ExecutorFragment _ContractualObligation__IDNamedElement = new ExecutorFragment(Types._ContractualObligation, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _ContractualObligation__OclAny = new ExecutorFragment(Types._ContractualObligation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContractualObligation__OclElement = new ExecutorFragment(Types._ContractualObligation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ContractualObligation__Persistable = new ExecutorFragment(Types._ContractualObligation, Process_modelingTables.Types._Persistable);

		private static final ExecutorFragment _EErrorDetection__EErrorDetection = new ExecutorFragment(Types._EErrorDetection, Process_modelingTables.Types._EErrorDetection);
		private static final ExecutorFragment _EErrorDetection__OclAny = new ExecutorFragment(Types._EErrorDetection, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EErrorDetection__OclElement = new ExecutorFragment(Types._EErrorDetection, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EErrorDetection__OclEnumeration = new ExecutorFragment(Types._EErrorDetection, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EErrorDetection__OclType = new ExecutorFragment(Types._EErrorDetection, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EErrorDomain__EErrorDomain = new ExecutorFragment(Types._EErrorDomain, Process_modelingTables.Types._EErrorDomain);
		private static final ExecutorFragment _EErrorDomain__OclAny = new ExecutorFragment(Types._EErrorDomain, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EErrorDomain__OclElement = new ExecutorFragment(Types._EErrorDomain, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EErrorDomain__OclEnumeration = new ExecutorFragment(Types._EErrorDomain, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EErrorDomain__OclType = new ExecutorFragment(Types._EErrorDomain, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EErrorOccurrence__EErrorOccurrence = new ExecutorFragment(Types._EErrorOccurrence, Process_modelingTables.Types._EErrorOccurrence);
		private static final ExecutorFragment _EErrorOccurrence__OclAny = new ExecutorFragment(Types._EErrorOccurrence, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EErrorOccurrence__OclElement = new ExecutorFragment(Types._EErrorOccurrence, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EErrorOccurrence__OclEnumeration = new ExecutorFragment(Types._EErrorOccurrence, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EErrorOccurrence__OclType = new ExecutorFragment(Types._EErrorOccurrence, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EErrorSeverity__EErrorSeverity = new ExecutorFragment(Types._EErrorSeverity, Process_modelingTables.Types._EErrorSeverity);
		private static final ExecutorFragment _EErrorSeverity__OclAny = new ExecutorFragment(Types._EErrorSeverity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EErrorSeverity__OclElement = new ExecutorFragment(Types._EErrorSeverity, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EErrorSeverity__OclEnumeration = new ExecutorFragment(Types._EErrorSeverity, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EErrorSeverity__OclType = new ExecutorFragment(Types._EErrorSeverity, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EErrorStatus__EErrorStatus = new ExecutorFragment(Types._EErrorStatus, Process_modelingTables.Types._EErrorStatus);
		private static final ExecutorFragment _EErrorStatus__OclAny = new ExecutorFragment(Types._EErrorStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EErrorStatus__OclElement = new ExecutorFragment(Types._EErrorStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EErrorStatus__OclEnumeration = new ExecutorFragment(Types._EErrorStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EErrorStatus__OclType = new ExecutorFragment(Types._EErrorStatus, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EErrorType__EErrorType = new ExecutorFragment(Types._EErrorType, Process_modelingTables.Types._EErrorType);
		private static final ExecutorFragment _EErrorType__OclAny = new ExecutorFragment(Types._EErrorType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EErrorType__OclElement = new ExecutorFragment(Types._EErrorType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EErrorType__OclEnumeration = new ExecutorFragment(Types._EErrorType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EErrorType__OclType = new ExecutorFragment(Types._EErrorType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EGateType__EGateType = new ExecutorFragment(Types._EGateType, Process_modelingTables.Types._EGateType);
		private static final ExecutorFragment _EGateType__OclAny = new ExecutorFragment(Types._EGateType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EGateType__OclElement = new ExecutorFragment(Types._EGateType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EGateType__OclEnumeration = new ExecutorFragment(Types._EGateType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EGateType__OclType = new ExecutorFragment(Types._EGateType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EOrganizationRole__EOrganizationRole = new ExecutorFragment(Types._EOrganizationRole, Process_modelingTables.Types._EOrganizationRole);
		private static final ExecutorFragment _EOrganizationRole__OclAny = new ExecutorFragment(Types._EOrganizationRole, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EOrganizationRole__OclElement = new ExecutorFragment(Types._EOrganizationRole, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EOrganizationRole__OclEnumeration = new ExecutorFragment(Types._EOrganizationRole, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EOrganizationRole__OclType = new ExecutorFragment(Types._EOrganizationRole, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EPersistenceType__EPersistenceType = new ExecutorFragment(Types._EPersistenceType, Process_modelingTables.Types._EPersistenceType);
		private static final ExecutorFragment _EPersistenceType__OclAny = new ExecutorFragment(Types._EPersistenceType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EPersistenceType__OclElement = new ExecutorFragment(Types._EPersistenceType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EPersistenceType__OclEnumeration = new ExecutorFragment(Types._EPersistenceType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EPersistenceType__OclType = new ExecutorFragment(Types._EPersistenceType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EProcessElementObligationsFulfilled__EProcessElementObligationsFulfilled = new ExecutorFragment(Types._EProcessElementObligationsFulfilled, Process_modelingTables.Types._EProcessElementObligationsFulfilled);
		private static final ExecutorFragment _EProcessElementObligationsFulfilled__OclAny = new ExecutorFragment(Types._EProcessElementObligationsFulfilled, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EProcessElementObligationsFulfilled__OclElement = new ExecutorFragment(Types._EProcessElementObligationsFulfilled, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EProcessElementObligationsFulfilled__OclEnumeration = new ExecutorFragment(Types._EProcessElementObligationsFulfilled, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EProcessElementObligationsFulfilled__OclType = new ExecutorFragment(Types._EProcessElementObligationsFulfilled, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EProcessElementStatus__EProcessElementStatus = new ExecutorFragment(Types._EProcessElementStatus, Process_modelingTables.Types._EProcessElementStatus);
		private static final ExecutorFragment _EProcessElementStatus__OclAny = new ExecutorFragment(Types._EProcessElementStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EProcessElementStatus__OclElement = new ExecutorFragment(Types._EProcessElementStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EProcessElementStatus__OclEnumeration = new ExecutorFragment(Types._EProcessElementStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EProcessElementStatus__OclType = new ExecutorFragment(Types._EProcessElementStatus, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EProcessParameterType__EProcessParameterType = new ExecutorFragment(Types._EProcessParameterType, Process_modelingTables.Types._EProcessParameterType);
		private static final ExecutorFragment _EProcessParameterType__OclAny = new ExecutorFragment(Types._EProcessParameterType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EProcessParameterType__OclElement = new ExecutorFragment(Types._EProcessParameterType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EProcessParameterType__OclEnumeration = new ExecutorFragment(Types._EProcessParameterType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EProcessParameterType__OclType = new ExecutorFragment(Types._EProcessParameterType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EProcessStepNotation__EProcessStepNotation = new ExecutorFragment(Types._EProcessStepNotation, Process_modelingTables.Types._EProcessStepNotation);
		private static final ExecutorFragment _EProcessStepNotation__OclAny = new ExecutorFragment(Types._EProcessStepNotation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EProcessStepNotation__OclElement = new ExecutorFragment(Types._EProcessStepNotation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EProcessStepNotation__OclEnumeration = new ExecutorFragment(Types._EProcessStepNotation, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EProcessStepNotation__OclType = new ExecutorFragment(Types._EProcessStepNotation, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EProcessStepType__EProcessStepType = new ExecutorFragment(Types._EProcessStepType, Process_modelingTables.Types._EProcessStepType);
		private static final ExecutorFragment _EProcessStepType__OclAny = new ExecutorFragment(Types._EProcessStepType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EProcessStepType__OclElement = new ExecutorFragment(Types._EProcessStepType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EProcessStepType__OclEnumeration = new ExecutorFragment(Types._EProcessStepType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EProcessStepType__OclType = new ExecutorFragment(Types._EProcessStepType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ERelationshipType__ERelationshipType = new ExecutorFragment(Types._ERelationshipType, Process_modelingTables.Types._ERelationshipType);
		private static final ExecutorFragment _ERelationshipType__OclAny = new ExecutorFragment(Types._ERelationshipType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ERelationshipType__OclElement = new ExecutorFragment(Types._ERelationshipType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ERelationshipType__OclEnumeration = new ExecutorFragment(Types._ERelationshipType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ERelationshipType__OclType = new ExecutorFragment(Types._ERelationshipType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EResourceStatus__EResourceStatus = new ExecutorFragment(Types._EResourceStatus, Process_modelingTables.Types._EResourceStatus);
		private static final ExecutorFragment _EResourceStatus__OclAny = new ExecutorFragment(Types._EResourceStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EResourceStatus__OclElement = new ExecutorFragment(Types._EResourceStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EResourceStatus__OclEnumeration = new ExecutorFragment(Types._EResourceStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EResourceStatus__OclType = new ExecutorFragment(Types._EResourceStatus, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EResourceType__EResourceType = new ExecutorFragment(Types._EResourceType, Process_modelingTables.Types._EResourceType);
		private static final ExecutorFragment _EResourceType__OclAny = new ExecutorFragment(Types._EResourceType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EResourceType__OclElement = new ExecutorFragment(Types._EResourceType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EResourceType__OclEnumeration = new ExecutorFragment(Types._EResourceType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EResourceType__OclType = new ExecutorFragment(Types._EResourceType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Error__Error = new ExecutorFragment(Types._Error, Process_modelingTables.Types._Error);
		private static final ExecutorFragment _Error__IDNamedElement = new ExecutorFragment(Types._Error, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Error__OclAny = new ExecutorFragment(Types._Error, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Error__OclElement = new ExecutorFragment(Types._Error, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Gate__Gate = new ExecutorFragment(Types._Gate, Process_modelingTables.Types._Gate);
		private static final ExecutorFragment _Gate__IDNamedElement = new ExecutorFragment(Types._Gate, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Gate__OclAny = new ExecutorFragment(Types._Gate, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Gate__OclElement = new ExecutorFragment(Types._Gate, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Gate__ProcessElement = new ExecutorFragment(Types._Gate, Process_modelingTables.Types._ProcessElement);
		private static final ExecutorFragment _Gate__Traceable = new ExecutorFragment(Types._Gate, Process_modelingTables.Types._Traceable);

		private static final ExecutorFragment _IDNamedElement__IDNamedElement = new ExecutorFragment(Types._IDNamedElement, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _IDNamedElement__OclAny = new ExecutorFragment(Types._IDNamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IDNamedElement__OclElement = new ExecutorFragment(Types._IDNamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Organization__IDNamedElement = new ExecutorFragment(Types._Organization, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Organization__OclAny = new ExecutorFragment(Types._Organization, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Organization__OclElement = new ExecutorFragment(Types._Organization, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Organization__Organization = new ExecutorFragment(Types._Organization, Process_modelingTables.Types._Organization);
		private static final ExecutorFragment _Organization__ProcessElement = new ExecutorFragment(Types._Organization, Process_modelingTables.Types._ProcessElement);
		private static final ExecutorFragment _Organization__Traceable = new ExecutorFragment(Types._Organization, Process_modelingTables.Types._Traceable);

		private static final ExecutorFragment _Parameter__IDNamedElement = new ExecutorFragment(Types._Parameter, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, Process_modelingTables.Types._Parameter);
		private static final ExecutorFragment _Parameter__Persistable = new ExecutorFragment(Types._Parameter, Process_modelingTables.Types._Persistable);

		private static final ExecutorFragment _Persistable__OclAny = new ExecutorFragment(Types._Persistable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Persistable__OclElement = new ExecutorFragment(Types._Persistable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Persistable__Persistable = new ExecutorFragment(Types._Persistable, Process_modelingTables.Types._Persistable);

		private static final ExecutorFragment _Process__IDNamedElement = new ExecutorFragment(Types._Process, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Process__OclAny = new ExecutorFragment(Types._Process, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Process__OclElement = new ExecutorFragment(Types._Process, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Process__Process = new ExecutorFragment(Types._Process, Process_modelingTables.Types._Process);

		private static final ExecutorFragment _ProcessElement__IDNamedElement = new ExecutorFragment(Types._ProcessElement, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _ProcessElement__OclAny = new ExecutorFragment(Types._ProcessElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessElement__OclElement = new ExecutorFragment(Types._ProcessElement, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessElement__ProcessElement = new ExecutorFragment(Types._ProcessElement, Process_modelingTables.Types._ProcessElement);
		private static final ExecutorFragment _ProcessElement__Traceable = new ExecutorFragment(Types._ProcessElement, Process_modelingTables.Types._Traceable);

		private static final ExecutorFragment _ProcessParameter__IDNamedElement = new ExecutorFragment(Types._ProcessParameter, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _ProcessParameter__OclAny = new ExecutorFragment(Types._ProcessParameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessParameter__OclElement = new ExecutorFragment(Types._ProcessParameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessParameter__ProcessParameter = new ExecutorFragment(Types._ProcessParameter, Process_modelingTables.Types._ProcessParameter);

		private static final ExecutorFragment _ProcessStep__IDNamedElement = new ExecutorFragment(Types._ProcessStep, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _ProcessStep__OclAny = new ExecutorFragment(Types._ProcessStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessStep__OclElement = new ExecutorFragment(Types._ProcessStep, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessStep__ProcessElement = new ExecutorFragment(Types._ProcessStep, Process_modelingTables.Types._ProcessElement);
		private static final ExecutorFragment _ProcessStep__ProcessStep = new ExecutorFragment(Types._ProcessStep, Process_modelingTables.Types._ProcessStep);
		private static final ExecutorFragment _ProcessStep__Traceable = new ExecutorFragment(Types._ProcessStep, Process_modelingTables.Types._Traceable);

		private static final ExecutorFragment _Product__IDNamedElement = new ExecutorFragment(Types._Product, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Product__OclAny = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Product__OclElement = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Product__Persistable = new ExecutorFragment(Types._Product, Process_modelingTables.Types._Persistable);
		private static final ExecutorFragment _Product__Product = new ExecutorFragment(Types._Product, Process_modelingTables.Types._Product);

		private static final ExecutorFragment _Relationship__IDNamedElement = new ExecutorFragment(Types._Relationship, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Relationship__OclAny = new ExecutorFragment(Types._Relationship, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Relationship__OclElement = new ExecutorFragment(Types._Relationship, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Relationship__Relationship = new ExecutorFragment(Types._Relationship, Process_modelingTables.Types._Relationship);

		private static final ExecutorFragment _Resource__IDNamedElement = new ExecutorFragment(Types._Resource, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _Resource__OclAny = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Resource__OclElement = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Resource__Persistable = new ExecutorFragment(Types._Resource, Process_modelingTables.Types._Persistable);
		private static final ExecutorFragment _Resource__Resource = new ExecutorFragment(Types._Resource, Process_modelingTables.Types._Resource);

		private static final ExecutorFragment _SubProcess__IDNamedElement = new ExecutorFragment(Types._SubProcess, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _SubProcess__OclAny = new ExecutorFragment(Types._SubProcess, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SubProcess__OclElement = new ExecutorFragment(Types._SubProcess, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SubProcess__ProcessElement = new ExecutorFragment(Types._SubProcess, Process_modelingTables.Types._ProcessElement);
		private static final ExecutorFragment _SubProcess__SubProcess = new ExecutorFragment(Types._SubProcess, Process_modelingTables.Types._SubProcess);
		private static final ExecutorFragment _SubProcess__Traceable = new ExecutorFragment(Types._SubProcess, Process_modelingTables.Types._Traceable);

		private static final ExecutorFragment _Traceable__OclAny = new ExecutorFragment(Types._Traceable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Traceable__OclElement = new ExecutorFragment(Types._Traceable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Traceable__Traceable = new ExecutorFragment(Types._Traceable, Process_modelingTables.Types._Traceable);

		private static final ExecutorFragment _UnorderedSteps__IDNamedElement = new ExecutorFragment(Types._UnorderedSteps, Process_modelingTables.Types._IDNamedElement);
		private static final ExecutorFragment _UnorderedSteps__OclAny = new ExecutorFragment(Types._UnorderedSteps, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UnorderedSteps__OclElement = new ExecutorFragment(Types._UnorderedSteps, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UnorderedSteps__ProcessElement = new ExecutorFragment(Types._UnorderedSteps, Process_modelingTables.Types._ProcessElement);
		private static final ExecutorFragment _UnorderedSteps__Traceable = new ExecutorFragment(Types._UnorderedSteps, Process_modelingTables.Types._Traceable);
		private static final ExecutorFragment _UnorderedSteps__UnorderedSteps = new ExecutorFragment(Types._UnorderedSteps, Process_modelingTables.Types._UnorderedSteps);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Capability__constraints = new EcoreExecutorProperty(Process_modelingPackage.Literals.CAPABILITY__CONSTRAINTS, Types._Capability, 0);
		public static final ExecutorProperty _Capability__parameters = new EcoreExecutorProperty(Process_modelingPackage.Literals.CAPABILITY__PARAMETERS, Types._Capability, 1);
		public static final ExecutorProperty _Capability__requiresStorage = new EcoreExecutorProperty(Process_modelingPackage.Literals.CAPABILITY__REQUIRES_STORAGE, Types._Capability, 2);
		public static final ExecutorProperty _Capability__ProcessStep__capability = new ExecutorPropertyWithImplementation("ProcessStep", Types._Capability, 3, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_STEP__CAPABILITY));
		public static final ExecutorProperty _Capability__Resource__capabilities = new ExecutorPropertyWithImplementation("Resource", Types._Capability, 4, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.RESOURCE__CAPABILITIES));

		public static final ExecutorProperty _CollaborativeNetwork__endorsementPolicy = new EcoreExecutorProperty(Process_modelingPackage.Literals.COLLABORATIVE_NETWORK__ENDORSEMENT_POLICY, Types._CollaborativeNetwork, 0);
		public static final ExecutorProperty _CollaborativeNetwork__organizations = new EcoreExecutorProperty(Process_modelingPackage.Literals.COLLABORATIVE_NETWORK__ORGANIZATIONS, Types._CollaborativeNetwork, 1);

		public static final ExecutorProperty _Constraint__metricUnit = new EcoreExecutorProperty(Process_modelingPackage.Literals.CONSTRAINT__METRIC_UNIT, Types._Constraint, 0);
		public static final ExecutorProperty _Constraint__physicalDimension = new EcoreExecutorProperty(Process_modelingPackage.Literals.CONSTRAINT__PHYSICAL_DIMENSION, Types._Constraint, 1);
		public static final ExecutorProperty _Constraint__relationalOperator = new EcoreExecutorProperty(Process_modelingPackage.Literals.CONSTRAINT__RELATIONAL_OPERATOR, Types._Constraint, 2);
		public static final ExecutorProperty _Constraint__value = new EcoreExecutorProperty(Process_modelingPackage.Literals.CONSTRAINT__VALUE, Types._Constraint, 3);
		public static final ExecutorProperty _Constraint__Capability__constraints = new ExecutorPropertyWithImplementation("Capability", Types._Constraint, 4, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.CAPABILITY__CONSTRAINTS));
		public static final ExecutorProperty _Constraint__ContractualObligation__constraints = new ExecutorPropertyWithImplementation("ContractualObligation", Types._Constraint, 5, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.CONTRACTUAL_OBLIGATION__CONSTRAINTS));
		public static final ExecutorProperty _Constraint__Product__constraints = new ExecutorPropertyWithImplementation("Product", Types._Constraint, 6, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PRODUCT__CONSTRAINTS));

		public static final ExecutorProperty _ContractualObligation__constraints = new EcoreExecutorProperty(Process_modelingPackage.Literals.CONTRACTUAL_OBLIGATION__CONSTRAINTS, Types._ContractualObligation, 0);
		public static final ExecutorProperty _ContractualObligation__ProcessStep__contractualObligation = new ExecutorPropertyWithImplementation("ProcessStep", Types._ContractualObligation, 1, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_STEP__CONTRACTUAL_OBLIGATION));

		public static final ExecutorProperty _Error__cause = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__CAUSE, Types._Error, 0);
		public static final ExecutorProperty _Error__description = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__DESCRIPTION, Types._Error, 1);
		public static final ExecutorProperty _Error__detection = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__DETECTION, Types._Error, 2);
		public static final ExecutorProperty _Error__domain = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__DOMAIN, Types._Error, 3);
		public static final ExecutorProperty _Error__effect = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__EFFECT, Types._Error, 4);
		public static final ExecutorProperty _Error__globalErrorHandler = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__GLOBAL_ERROR_HANDLER, Types._Error, 5);
		public static final ExecutorProperty _Error__localErrorHandler = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__LOCAL_ERROR_HANDLER, Types._Error, 6);
		public static final ExecutorProperty _Error__message = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__MESSAGE, Types._Error, 7);
		public static final ExecutorProperty _Error__mode = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__MODE, Types._Error, 8);
		public static final ExecutorProperty _Error__occurrence = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__OCCURRENCE, Types._Error, 9);
		public static final ExecutorProperty _Error__prevention = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__PREVENTION, Types._Error, 10);
		public static final ExecutorProperty _Error__severity = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__SEVERITY, Types._Error, 11);
		public static final ExecutorProperty _Error__status = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__STATUS, Types._Error, 12);
		public static final ExecutorProperty _Error__type = new EcoreExecutorProperty(Process_modelingPackage.Literals.ERROR__TYPE, Types._Error, 13);
		public static final ExecutorProperty _Error__ProcessStep__errors = new ExecutorPropertyWithImplementation("ProcessStep", Types._Error, 14, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_STEP__ERRORS));

		public static final ExecutorProperty _Gate__type = new EcoreExecutorProperty(Process_modelingPackage.Literals.GATE__TYPE, Types._Gate, 0);

		public static final ExecutorProperty _IDNamedElement__alias = new EcoreExecutorProperty(Process_modelingPackage.Literals.ID_NAMED_ELEMENT__ALIAS, Types._IDNamedElement, 0);
		public static final ExecutorProperty _IDNamedElement__exposeToCollaboratingParties = new EcoreExecutorProperty(Process_modelingPackage.Literals.ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES, Types._IDNamedElement, 1);
		public static final ExecutorProperty _IDNamedElement__id = new EcoreExecutorProperty(Process_modelingPackage.Literals.ID_NAMED_ELEMENT__ID, Types._IDNamedElement, 2);
		public static final ExecutorProperty _IDNamedElement__name = new EcoreExecutorProperty(Process_modelingPackage.Literals.ID_NAMED_ELEMENT__NAME, Types._IDNamedElement, 3);

		public static final ExecutorProperty _Organization__dltPeerAddress = new EcoreExecutorProperty(Process_modelingPackage.Literals.ORGANIZATION__DLT_PEER_ADDRESS, Types._Organization, 0);
		public static final ExecutorProperty _Organization__elements = new EcoreExecutorProperty(Process_modelingPackage.Literals.ORGANIZATION__ELEMENTS, Types._Organization, 1);
		public static final ExecutorProperty _Organization__role = new EcoreExecutorProperty(Process_modelingPackage.Literals.ORGANIZATION__ROLE, Types._Organization, 2);
		public static final ExecutorProperty _Organization__CollaborativeNetwork__organizations = new ExecutorPropertyWithImplementation("CollaborativeNetwork", Types._Organization, 3, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.COLLABORATIVE_NETWORK__ORGANIZATIONS));

		public static final ExecutorProperty _Parameter__key = new EcoreExecutorProperty(Process_modelingPackage.Literals.PARAMETER__KEY, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__value = new EcoreExecutorProperty(Process_modelingPackage.Literals.PARAMETER__VALUE, Types._Parameter, 1);
		public static final ExecutorProperty _Parameter__Capability__parameters = new ExecutorPropertyWithImplementation("Capability", Types._Parameter, 2, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.CAPABILITY__PARAMETERS));

		public static final ExecutorProperty _Persistable__isPersisted = new EcoreExecutorProperty(Process_modelingPackage.Literals.PERSISTABLE__IS_PERSISTED, Types._Persistable, 0);
		public static final ExecutorProperty _Persistable__persistenceType = new EcoreExecutorProperty(Process_modelingPackage.Literals.PERSISTABLE__PERSISTENCE_TYPE, Types._Persistable, 1);

		public static final ExecutorProperty _Process__author = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__AUTHOR, Types._Process, 0);
		public static final ExecutorProperty _Process__company = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__COMPANY, Types._Process, 1);
		public static final ExecutorProperty _Process__date = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__DATE, Types._Process, 2);
		public static final ExecutorProperty _Process__elements = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__ELEMENTS, Types._Process, 3);
		public static final ExecutorProperty _Process__parameters = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__PARAMETERS, Types._Process, 4);
		public static final ExecutorProperty _Process__proposedProcess = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__PROPOSED_PROCESS, Types._Process, 5);
		public static final ExecutorProperty _Process__relationships = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__RELATIONSHIPS, Types._Process, 6);
		public static final ExecutorProperty _Process__startStep = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__START_STEP, Types._Process, 7);
		public static final ExecutorProperty _Process__unidentifiedErrorHandler = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__UNIDENTIFIED_ERROR_HANDLER, Types._Process, 8);
		public static final ExecutorProperty _Process__version = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS__VERSION, Types._Process, 9);
		public static final ExecutorProperty _Process__Error__globalErrorHandler = new ExecutorPropertyWithImplementation("Error", Types._Process, 10, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.ERROR__GLOBAL_ERROR_HANDLER));
		public static final ExecutorProperty _Process__Process__unidentifiedErrorHandler = new ExecutorPropertyWithImplementation("Process", Types._Process, 11, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS__UNIDENTIFIED_ERROR_HANDLER));
		public static final ExecutorProperty _Process__ProcessStep__relatedInterfaceProcess = new ExecutorPropertyWithImplementation("ProcessStep", Types._Process, 12, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_STEP__RELATED_INTERFACE_PROCESS));
		public static final ExecutorProperty _Process__SubProcess__process = new ExecutorPropertyWithImplementation("SubProcess", Types._Process, 13, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.SUB_PROCESS__PROCESS));

		public static final ExecutorProperty _ProcessElement__inRelationships = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_ELEMENT__IN_RELATIONSHIPS, Types._ProcessElement, 0);
		public static final ExecutorProperty _ProcessElement__isErrorGroup = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_ELEMENT__IS_ERROR_GROUP, Types._ProcessElement, 1);
		public static final ExecutorProperty _ProcessElement__obligationsFulfilled = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_ELEMENT__OBLIGATIONS_FULFILLED, Types._ProcessElement, 2);
		public static final ExecutorProperty _ProcessElement__outRelationships = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_ELEMENT__OUT_RELATIONSHIPS, Types._ProcessElement, 3);
		public static final ExecutorProperty _ProcessElement__relatedDltContent = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_ELEMENT__RELATED_DLT_CONTENT, Types._ProcessElement, 4);
		public static final ExecutorProperty _ProcessElement__status = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_ELEMENT__STATUS, Types._ProcessElement, 5);
		public static final ExecutorProperty _ProcessElement__Error__localErrorHandler = new ExecutorPropertyWithImplementation("Error", Types._ProcessElement, 6, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.ERROR__LOCAL_ERROR_HANDLER));
		public static final ExecutorProperty _ProcessElement__Organization__elements = new ExecutorPropertyWithImplementation("Organization", Types._ProcessElement, 7, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.ORGANIZATION__ELEMENTS));
		public static final ExecutorProperty _ProcessElement__Process__elements = new ExecutorPropertyWithImplementation("Process", Types._ProcessElement, 8, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS__ELEMENTS));

		public static final ExecutorProperty _ProcessParameter__parameter = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_PARAMETER__PARAMETER, Types._ProcessParameter, 0);
		public static final ExecutorProperty _ProcessParameter__product = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_PARAMETER__PRODUCT, Types._ProcessParameter, 1);
		public static final ExecutorProperty _ProcessParameter__type = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_PARAMETER__TYPE, Types._ProcessParameter, 2);
		public static final ExecutorProperty _ProcessParameter__Process__parameters = new ExecutorPropertyWithImplementation("Process", Types._ProcessParameter, 3, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS__PARAMETERS));
		public static final ExecutorProperty _ProcessParameter__ProcessParameter__parameter = new ExecutorPropertyWithImplementation("ProcessParameter", Types._ProcessParameter, 4, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_PARAMETER__PARAMETER));
		public static final ExecutorProperty _ProcessParameter__SubProcess__parameters = new ExecutorPropertyWithImplementation("SubProcess", Types._ProcessParameter, 5, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.SUB_PROCESS__PARAMETERS));

		public static final ExecutorProperty _ProcessStep__acceptanceCriterion = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__ACCEPTANCE_CRITERION, Types._ProcessStep, 0);
		public static final ExecutorProperty _ProcessStep__capability = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__CAPABILITY, Types._ProcessStep, 1);
		public static final ExecutorProperty _ProcessStep__completionCriterion = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__COMPLETION_CRITERION, Types._ProcessStep, 2);
		public static final ExecutorProperty _ProcessStep__contractualObligation = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__CONTRACTUAL_OBLIGATION, Types._ProcessStep, 3);
		public static final ExecutorProperty _ProcessStep__description = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__DESCRIPTION, Types._ProcessStep, 4);
		public static final ExecutorProperty _ProcessStep__errors = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__ERRORS, Types._ProcessStep, 5);
		public static final ExecutorProperty _ProcessStep__inProducts = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__IN_PRODUCTS, Types._ProcessStep, 6);
		public static final ExecutorProperty _ProcessStep__notation = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__NOTATION, Types._ProcessStep, 7);
		public static final ExecutorProperty _ProcessStep__outProducts = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__OUT_PRODUCTS, Types._ProcessStep, 8);
		public static final ExecutorProperty _ProcessStep__relatedInterfaceProcess = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__RELATED_INTERFACE_PROCESS, Types._ProcessStep, 9);
		public static final ExecutorProperty _ProcessStep__resource = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__RESOURCE, Types._ProcessStep, 10);
		public static final ExecutorProperty _ProcessStep__type = new EcoreExecutorProperty(Process_modelingPackage.Literals.PROCESS_STEP__TYPE, Types._ProcessStep, 11);
		public static final ExecutorProperty _ProcessStep__Process__startStep = new ExecutorPropertyWithImplementation("Process", Types._ProcessStep, 12, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS__START_STEP));
		public static final ExecutorProperty _ProcessStep__UnorderedSteps__steps = new ExecutorPropertyWithImplementation("UnorderedSteps", Types._ProcessStep, 13, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.UNORDERED_STEPS__STEPS));

		public static final ExecutorProperty _Product__constraints = new EcoreExecutorProperty(Process_modelingPackage.Literals.PRODUCT__CONSTRAINTS, Types._Product, 0);
		public static final ExecutorProperty _Product__equivalent = new EcoreExecutorProperty(Process_modelingPackage.Literals.PRODUCT__EQUIVALENT, Types._Product, 1);
		public static final ExecutorProperty _Product__isFinal = new EcoreExecutorProperty(Process_modelingPackage.Literals.PRODUCT__IS_FINAL, Types._Product, 2);
		public static final ExecutorProperty _Product__isStored = new EcoreExecutorProperty(Process_modelingPackage.Literals.PRODUCT__IS_STORED, Types._Product, 3);
		public static final ExecutorProperty _Product__quantity = new EcoreExecutorProperty(Process_modelingPackage.Literals.PRODUCT__QUANTITY, Types._Product, 4);
		public static final ExecutorProperty _Product__storage = new EcoreExecutorProperty(Process_modelingPackage.Literals.PRODUCT__STORAGE, Types._Product, 5);
		public static final ExecutorProperty _Product__ProcessParameter__product = new ExecutorPropertyWithImplementation("ProcessParameter", Types._Product, 6, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_PARAMETER__PRODUCT));
		public static final ExecutorProperty _Product__ProcessStep__inProducts = new ExecutorPropertyWithImplementation("ProcessStep", Types._Product, 7, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_STEP__IN_PRODUCTS));
		public static final ExecutorProperty _Product__ProcessStep__outProducts = new ExecutorPropertyWithImplementation("ProcessStep", Types._Product, 8, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_STEP__OUT_PRODUCTS));
		public static final ExecutorProperty _Product__Product__equivalent = new ExecutorPropertyWithImplementation("Product", Types._Product, 9, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PRODUCT__EQUIVALENT));
		public static final ExecutorProperty _Product__Resource__inventory = new ExecutorPropertyWithImplementation("Resource", Types._Product, 10, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.RESOURCE__INVENTORY));

		public static final ExecutorProperty _Relationship__logicalCondition = new EcoreExecutorProperty(Process_modelingPackage.Literals.RELATIONSHIP__LOGICAL_CONDITION, Types._Relationship, 0);
		public static final ExecutorProperty _Relationship__message = new EcoreExecutorProperty(Process_modelingPackage.Literals.RELATIONSHIP__MESSAGE, Types._Relationship, 1);
		public static final ExecutorProperty _Relationship__source = new EcoreExecutorProperty(Process_modelingPackage.Literals.RELATIONSHIP__SOURCE, Types._Relationship, 2);
		public static final ExecutorProperty _Relationship__target = new EcoreExecutorProperty(Process_modelingPackage.Literals.RELATIONSHIP__TARGET, Types._Relationship, 3);
		public static final ExecutorProperty _Relationship__type = new EcoreExecutorProperty(Process_modelingPackage.Literals.RELATIONSHIP__TYPE, Types._Relationship, 4);
		public static final ExecutorProperty _Relationship__Process__relationships = new ExecutorPropertyWithImplementation("Process", Types._Relationship, 5, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS__RELATIONSHIPS));

		public static final ExecutorProperty _Resource__capabilities = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__CAPABILITIES, Types._Resource, 0);
		public static final ExecutorProperty _Resource__inventory = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__INVENTORY, Types._Resource, 1);
		public static final ExecutorProperty _Resource__isActuator = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__IS_ACTUATOR, Types._Resource, 2);
		public static final ExecutorProperty _Resource__isStorage = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__IS_STORAGE, Types._Resource, 3);
		public static final ExecutorProperty _Resource__materialFlowSource = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__MATERIAL_FLOW_SOURCE, Types._Resource, 4);
		public static final ExecutorProperty _Resource__materialFlowTarget = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__MATERIAL_FLOW_TARGET, Types._Resource, 5);
		public static final ExecutorProperty _Resource__protocol = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__PROTOCOL, Types._Resource, 6);
		public static final ExecutorProperty _Resource__status = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__STATUS, Types._Resource, 7);
		public static final ExecutorProperty _Resource__type = new EcoreExecutorProperty(Process_modelingPackage.Literals.RESOURCE__TYPE, Types._Resource, 8);
		public static final ExecutorProperty _Resource__ProcessStep__resource = new ExecutorPropertyWithImplementation("ProcessStep", Types._Resource, 9, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PROCESS_STEP__RESOURCE));
		public static final ExecutorProperty _Resource__Product__storage = new ExecutorPropertyWithImplementation("Product", Types._Resource, 10, new EcoreLibraryOppositeProperty(Process_modelingPackage.Literals.PRODUCT__STORAGE));

		public static final ExecutorProperty _SubProcess__parameters = new EcoreExecutorProperty(Process_modelingPackage.Literals.SUB_PROCESS__PARAMETERS, Types._SubProcess, 0);
		public static final ExecutorProperty _SubProcess__process = new EcoreExecutorProperty(Process_modelingPackage.Literals.SUB_PROCESS__PROCESS, Types._SubProcess, 1);

		public static final ExecutorProperty _Traceable__isTraced = new EcoreExecutorProperty(Process_modelingPackage.Literals.TRACEABLE__IS_TRACED, Types._Traceable, 0);
		public static final ExecutorProperty _Traceable__logEndTime = new EcoreExecutorProperty(Process_modelingPackage.Literals.TRACEABLE__LOG_END_TIME, Types._Traceable, 1);
		public static final ExecutorProperty _Traceable__logStartTime = new EcoreExecutorProperty(Process_modelingPackage.Literals.TRACEABLE__LOG_START_TIME, Types._Traceable, 2);

		public static final ExecutorProperty _UnorderedSteps__steps = new EcoreExecutorProperty(Process_modelingPackage.Literals.UNORDERED_STEPS__STEPS, Types._UnorderedSteps, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Capability =
			{
				Fragments._Capability__OclAny /* 0 */,
				Fragments._Capability__OclElement /* 1 */,
				Fragments._Capability__IDNamedElement /* 2 */,
				Fragments._Capability__Persistable /* 2 */,
				Fragments._Capability__Capability /* 3 */
			};
		private static final int /*@NonNull*/ [] __Capability = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CollaborativeNetwork =
			{
				Fragments._CollaborativeNetwork__OclAny /* 0 */,
				Fragments._CollaborativeNetwork__OclElement /* 1 */,
				Fragments._CollaborativeNetwork__IDNamedElement /* 2 */,
				Fragments._CollaborativeNetwork__Traceable /* 2 */,
				Fragments._CollaborativeNetwork__ProcessElement /* 3 */,
				Fragments._CollaborativeNetwork__CollaborativeNetwork /* 4 */
			};
		private static final int /*@NonNull*/ [] __CollaborativeNetwork = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Constraint =
			{
				Fragments._Constraint__OclAny /* 0 */,
				Fragments._Constraint__OclElement /* 1 */,
				Fragments._Constraint__IDNamedElement /* 2 */,
				Fragments._Constraint__Persistable /* 2 */,
				Fragments._Constraint__Constraint /* 3 */
			};
		private static final int /*@NonNull*/ [] __Constraint = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContractualObligation =
			{
				Fragments._ContractualObligation__OclAny /* 0 */,
				Fragments._ContractualObligation__OclElement /* 1 */,
				Fragments._ContractualObligation__IDNamedElement /* 2 */,
				Fragments._ContractualObligation__Persistable /* 2 */,
				Fragments._ContractualObligation__ContractualObligation /* 3 */
			};
		private static final int /*@NonNull*/ [] __ContractualObligation = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EErrorDetection =
			{
				Fragments._EErrorDetection__OclAny /* 0 */,
				Fragments._EErrorDetection__OclElement /* 1 */,
				Fragments._EErrorDetection__OclType /* 2 */,
				Fragments._EErrorDetection__OclEnumeration /* 3 */,
				Fragments._EErrorDetection__EErrorDetection /* 4 */
			};
		private static final int /*@NonNull*/ [] __EErrorDetection = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EErrorDomain =
			{
				Fragments._EErrorDomain__OclAny /* 0 */,
				Fragments._EErrorDomain__OclElement /* 1 */,
				Fragments._EErrorDomain__OclType /* 2 */,
				Fragments._EErrorDomain__OclEnumeration /* 3 */,
				Fragments._EErrorDomain__EErrorDomain /* 4 */
			};
		private static final int /*@NonNull*/ [] __EErrorDomain = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EErrorOccurrence =
			{
				Fragments._EErrorOccurrence__OclAny /* 0 */,
				Fragments._EErrorOccurrence__OclElement /* 1 */,
				Fragments._EErrorOccurrence__OclType /* 2 */,
				Fragments._EErrorOccurrence__OclEnumeration /* 3 */,
				Fragments._EErrorOccurrence__EErrorOccurrence /* 4 */
			};
		private static final int /*@NonNull*/ [] __EErrorOccurrence = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EErrorSeverity =
			{
				Fragments._EErrorSeverity__OclAny /* 0 */,
				Fragments._EErrorSeverity__OclElement /* 1 */,
				Fragments._EErrorSeverity__OclType /* 2 */,
				Fragments._EErrorSeverity__OclEnumeration /* 3 */,
				Fragments._EErrorSeverity__EErrorSeverity /* 4 */
			};
		private static final int /*@NonNull*/ [] __EErrorSeverity = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EErrorStatus =
			{
				Fragments._EErrorStatus__OclAny /* 0 */,
				Fragments._EErrorStatus__OclElement /* 1 */,
				Fragments._EErrorStatus__OclType /* 2 */,
				Fragments._EErrorStatus__OclEnumeration /* 3 */,
				Fragments._EErrorStatus__EErrorStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __EErrorStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EErrorType =
			{
				Fragments._EErrorType__OclAny /* 0 */,
				Fragments._EErrorType__OclElement /* 1 */,
				Fragments._EErrorType__OclType /* 2 */,
				Fragments._EErrorType__OclEnumeration /* 3 */,
				Fragments._EErrorType__EErrorType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EErrorType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EGateType =
			{
				Fragments._EGateType__OclAny /* 0 */,
				Fragments._EGateType__OclElement /* 1 */,
				Fragments._EGateType__OclType /* 2 */,
				Fragments._EGateType__OclEnumeration /* 3 */,
				Fragments._EGateType__EGateType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EGateType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EOrganizationRole =
			{
				Fragments._EOrganizationRole__OclAny /* 0 */,
				Fragments._EOrganizationRole__OclElement /* 1 */,
				Fragments._EOrganizationRole__OclType /* 2 */,
				Fragments._EOrganizationRole__OclEnumeration /* 3 */,
				Fragments._EOrganizationRole__EOrganizationRole /* 4 */
			};
		private static final int /*@NonNull*/ [] __EOrganizationRole = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EPersistenceType =
			{
				Fragments._EPersistenceType__OclAny /* 0 */,
				Fragments._EPersistenceType__OclElement /* 1 */,
				Fragments._EPersistenceType__OclType /* 2 */,
				Fragments._EPersistenceType__OclEnumeration /* 3 */,
				Fragments._EPersistenceType__EPersistenceType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EPersistenceType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EProcessElementObligationsFulfilled =
			{
				Fragments._EProcessElementObligationsFulfilled__OclAny /* 0 */,
				Fragments._EProcessElementObligationsFulfilled__OclElement /* 1 */,
				Fragments._EProcessElementObligationsFulfilled__OclType /* 2 */,
				Fragments._EProcessElementObligationsFulfilled__OclEnumeration /* 3 */,
				Fragments._EProcessElementObligationsFulfilled__EProcessElementObligationsFulfilled /* 4 */
			};
		private static final int /*@NonNull*/ [] __EProcessElementObligationsFulfilled = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EProcessElementStatus =
			{
				Fragments._EProcessElementStatus__OclAny /* 0 */,
				Fragments._EProcessElementStatus__OclElement /* 1 */,
				Fragments._EProcessElementStatus__OclType /* 2 */,
				Fragments._EProcessElementStatus__OclEnumeration /* 3 */,
				Fragments._EProcessElementStatus__EProcessElementStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __EProcessElementStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EProcessParameterType =
			{
				Fragments._EProcessParameterType__OclAny /* 0 */,
				Fragments._EProcessParameterType__OclElement /* 1 */,
				Fragments._EProcessParameterType__OclType /* 2 */,
				Fragments._EProcessParameterType__OclEnumeration /* 3 */,
				Fragments._EProcessParameterType__EProcessParameterType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EProcessParameterType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EProcessStepNotation =
			{
				Fragments._EProcessStepNotation__OclAny /* 0 */,
				Fragments._EProcessStepNotation__OclElement /* 1 */,
				Fragments._EProcessStepNotation__OclType /* 2 */,
				Fragments._EProcessStepNotation__OclEnumeration /* 3 */,
				Fragments._EProcessStepNotation__EProcessStepNotation /* 4 */
			};
		private static final int /*@NonNull*/ [] __EProcessStepNotation = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EProcessStepType =
			{
				Fragments._EProcessStepType__OclAny /* 0 */,
				Fragments._EProcessStepType__OclElement /* 1 */,
				Fragments._EProcessStepType__OclType /* 2 */,
				Fragments._EProcessStepType__OclEnumeration /* 3 */,
				Fragments._EProcessStepType__EProcessStepType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EProcessStepType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ERelationshipType =
			{
				Fragments._ERelationshipType__OclAny /* 0 */,
				Fragments._ERelationshipType__OclElement /* 1 */,
				Fragments._ERelationshipType__OclType /* 2 */,
				Fragments._ERelationshipType__OclEnumeration /* 3 */,
				Fragments._ERelationshipType__ERelationshipType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ERelationshipType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EResourceStatus =
			{
				Fragments._EResourceStatus__OclAny /* 0 */,
				Fragments._EResourceStatus__OclElement /* 1 */,
				Fragments._EResourceStatus__OclType /* 2 */,
				Fragments._EResourceStatus__OclEnumeration /* 3 */,
				Fragments._EResourceStatus__EResourceStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __EResourceStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EResourceType =
			{
				Fragments._EResourceType__OclAny /* 0 */,
				Fragments._EResourceType__OclElement /* 1 */,
				Fragments._EResourceType__OclType /* 2 */,
				Fragments._EResourceType__OclEnumeration /* 3 */,
				Fragments._EResourceType__EResourceType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EResourceType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Error =
			{
				Fragments._Error__OclAny /* 0 */,
				Fragments._Error__OclElement /* 1 */,
				Fragments._Error__IDNamedElement /* 2 */,
				Fragments._Error__Error /* 3 */
			};
		private static final int /*@NonNull*/ [] __Error = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Gate =
			{
				Fragments._Gate__OclAny /* 0 */,
				Fragments._Gate__OclElement /* 1 */,
				Fragments._Gate__IDNamedElement /* 2 */,
				Fragments._Gate__Traceable /* 2 */,
				Fragments._Gate__ProcessElement /* 3 */,
				Fragments._Gate__Gate /* 4 */
			};
		private static final int /*@NonNull*/ [] __Gate = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IDNamedElement =
			{
				Fragments._IDNamedElement__OclAny /* 0 */,
				Fragments._IDNamedElement__OclElement /* 1 */,
				Fragments._IDNamedElement__IDNamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __IDNamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Organization =
			{
				Fragments._Organization__OclAny /* 0 */,
				Fragments._Organization__OclElement /* 1 */,
				Fragments._Organization__IDNamedElement /* 2 */,
				Fragments._Organization__Traceable /* 2 */,
				Fragments._Organization__ProcessElement /* 3 */,
				Fragments._Organization__Organization /* 4 */
			};
		private static final int /*@NonNull*/ [] __Organization = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__IDNamedElement /* 2 */,
				Fragments._Parameter__Persistable /* 2 */,
				Fragments._Parameter__Parameter /* 3 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Persistable =
			{
				Fragments._Persistable__OclAny /* 0 */,
				Fragments._Persistable__OclElement /* 1 */,
				Fragments._Persistable__Persistable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Persistable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Process =
			{
				Fragments._Process__OclAny /* 0 */,
				Fragments._Process__OclElement /* 1 */,
				Fragments._Process__IDNamedElement /* 2 */,
				Fragments._Process__Process /* 3 */
			};
		private static final int /*@NonNull*/ [] __Process = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessElement =
			{
				Fragments._ProcessElement__OclAny /* 0 */,
				Fragments._ProcessElement__OclElement /* 1 */,
				Fragments._ProcessElement__IDNamedElement /* 2 */,
				Fragments._ProcessElement__Traceable /* 2 */,
				Fragments._ProcessElement__ProcessElement /* 3 */
			};
		private static final int /*@NonNull*/ [] __ProcessElement = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessParameter =
			{
				Fragments._ProcessParameter__OclAny /* 0 */,
				Fragments._ProcessParameter__OclElement /* 1 */,
				Fragments._ProcessParameter__IDNamedElement /* 2 */,
				Fragments._ProcessParameter__ProcessParameter /* 3 */
			};
		private static final int /*@NonNull*/ [] __ProcessParameter = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessStep =
			{
				Fragments._ProcessStep__OclAny /* 0 */,
				Fragments._ProcessStep__OclElement /* 1 */,
				Fragments._ProcessStep__IDNamedElement /* 2 */,
				Fragments._ProcessStep__Traceable /* 2 */,
				Fragments._ProcessStep__ProcessElement /* 3 */,
				Fragments._ProcessStep__ProcessStep /* 4 */
			};
		private static final int /*@NonNull*/ [] __ProcessStep = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Product =
			{
				Fragments._Product__OclAny /* 0 */,
				Fragments._Product__OclElement /* 1 */,
				Fragments._Product__IDNamedElement /* 2 */,
				Fragments._Product__Persistable /* 2 */,
				Fragments._Product__Product /* 3 */
			};
		private static final int /*@NonNull*/ [] __Product = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Relationship =
			{
				Fragments._Relationship__OclAny /* 0 */,
				Fragments._Relationship__OclElement /* 1 */,
				Fragments._Relationship__IDNamedElement /* 2 */,
				Fragments._Relationship__Relationship /* 3 */
			};
		private static final int /*@NonNull*/ [] __Relationship = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Resource =
			{
				Fragments._Resource__OclAny /* 0 */,
				Fragments._Resource__OclElement /* 1 */,
				Fragments._Resource__IDNamedElement /* 2 */,
				Fragments._Resource__Persistable /* 2 */,
				Fragments._Resource__Resource /* 3 */
			};
		private static final int /*@NonNull*/ [] __Resource = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SubProcess =
			{
				Fragments._SubProcess__OclAny /* 0 */,
				Fragments._SubProcess__OclElement /* 1 */,
				Fragments._SubProcess__IDNamedElement /* 2 */,
				Fragments._SubProcess__Traceable /* 2 */,
				Fragments._SubProcess__ProcessElement /* 3 */,
				Fragments._SubProcess__SubProcess /* 4 */
			};
		private static final int /*@NonNull*/ [] __SubProcess = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Traceable =
			{
				Fragments._Traceable__OclAny /* 0 */,
				Fragments._Traceable__OclElement /* 1 */,
				Fragments._Traceable__Traceable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Traceable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UnorderedSteps =
			{
				Fragments._UnorderedSteps__OclAny /* 0 */,
				Fragments._UnorderedSteps__OclElement /* 1 */,
				Fragments._UnorderedSteps__IDNamedElement /* 2 */,
				Fragments._UnorderedSteps__Traceable /* 2 */,
				Fragments._UnorderedSteps__ProcessElement /* 3 */,
				Fragments._UnorderedSteps__UnorderedSteps /* 4 */
			};
		private static final int /*@NonNull*/ [] __UnorderedSteps = { 1,1,2,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Capability.initFragments(_Capability, __Capability);
			Types._CollaborativeNetwork.initFragments(_CollaborativeNetwork, __CollaborativeNetwork);
			Types._Constraint.initFragments(_Constraint, __Constraint);
			Types._ContractualObligation.initFragments(_ContractualObligation, __ContractualObligation);
			Types._EErrorDetection.initFragments(_EErrorDetection, __EErrorDetection);
			Types._EErrorDomain.initFragments(_EErrorDomain, __EErrorDomain);
			Types._EErrorOccurrence.initFragments(_EErrorOccurrence, __EErrorOccurrence);
			Types._EErrorSeverity.initFragments(_EErrorSeverity, __EErrorSeverity);
			Types._EErrorStatus.initFragments(_EErrorStatus, __EErrorStatus);
			Types._EErrorType.initFragments(_EErrorType, __EErrorType);
			Types._EGateType.initFragments(_EGateType, __EGateType);
			Types._EOrganizationRole.initFragments(_EOrganizationRole, __EOrganizationRole);
			Types._EPersistenceType.initFragments(_EPersistenceType, __EPersistenceType);
			Types._EProcessElementObligationsFulfilled.initFragments(_EProcessElementObligationsFulfilled, __EProcessElementObligationsFulfilled);
			Types._EProcessElementStatus.initFragments(_EProcessElementStatus, __EProcessElementStatus);
			Types._EProcessParameterType.initFragments(_EProcessParameterType, __EProcessParameterType);
			Types._EProcessStepNotation.initFragments(_EProcessStepNotation, __EProcessStepNotation);
			Types._EProcessStepType.initFragments(_EProcessStepType, __EProcessStepType);
			Types._ERelationshipType.initFragments(_ERelationshipType, __ERelationshipType);
			Types._EResourceStatus.initFragments(_EResourceStatus, __EResourceStatus);
			Types._EResourceType.initFragments(_EResourceType, __EResourceType);
			Types._Error.initFragments(_Error, __Error);
			Types._Gate.initFragments(_Gate, __Gate);
			Types._IDNamedElement.initFragments(_IDNamedElement, __IDNamedElement);
			Types._Organization.initFragments(_Organization, __Organization);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._Persistable.initFragments(_Persistable, __Persistable);
			Types._Process.initFragments(_Process, __Process);
			Types._ProcessElement.initFragments(_ProcessElement, __ProcessElement);
			Types._ProcessParameter.initFragments(_ProcessParameter, __ProcessParameter);
			Types._ProcessStep.initFragments(_ProcessStep, __ProcessStep);
			Types._Product.initFragments(_Product, __Product);
			Types._Relationship.initFragments(_Relationship, __Relationship);
			Types._Resource.initFragments(_Resource, __Resource);
			Types._SubProcess.initFragments(_SubProcess, __SubProcess);
			Types._Traceable.initFragments(_Traceable, __Traceable);
			Types._UnorderedSteps.initFragments(_UnorderedSteps, __UnorderedSteps);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Capability__Capability = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Capability__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Capability__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Capability__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Capability__Persistable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CollaborativeNetwork__CollaborativeNetwork = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CollaborativeNetwork__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CollaborativeNetwork__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CollaborativeNetwork__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CollaborativeNetwork__ProcessElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CollaborativeNetwork__Traceable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__Constraint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__Persistable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ContractualObligation__ContractualObligation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContractualObligation__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContractualObligation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContractualObligation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContractualObligation__Persistable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDetection__EErrorDetection = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDetection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDetection__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDetection__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDetection__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDomain__EErrorDomain = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDomain__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDomain__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDomain__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorDomain__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EErrorOccurrence__EErrorOccurrence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorOccurrence__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorOccurrence__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorOccurrence__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorOccurrence__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EErrorSeverity__EErrorSeverity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorSeverity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorSeverity__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorSeverity__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorSeverity__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EErrorStatus__EErrorStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EErrorType__EErrorType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EErrorType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EGateType__EGateType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EGateType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EGateType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EGateType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EGateType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EOrganizationRole__EOrganizationRole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EOrganizationRole__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOrganizationRole__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOrganizationRole__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOrganizationRole__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EPersistenceType__EPersistenceType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EPersistenceType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPersistenceType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPersistenceType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPersistenceType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementObligationsFulfilled__EProcessElementObligationsFulfilled = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementObligationsFulfilled__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementObligationsFulfilled__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementObligationsFulfilled__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementObligationsFulfilled__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementStatus__EProcessElementStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessElementStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EProcessParameterType__EProcessParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessParameterType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessParameterType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessParameterType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessParameterType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepNotation__EProcessStepNotation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepNotation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepNotation__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepNotation__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepNotation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepType__EProcessStepType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProcessStepType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ERelationshipType__ERelationshipType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERelationshipType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ERelationshipType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ERelationshipType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ERelationshipType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EResourceStatus__EResourceStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EResourceStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EResourceStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EResourceStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EResourceStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EResourceType__EResourceType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EResourceType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EResourceType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EResourceType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EResourceType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Error__Error = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Error__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Error__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Error__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Gate__Gate = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gate__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gate__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gate__ProcessElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gate__Traceable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IDNamedElement__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IDNamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IDNamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Organization__Organization = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Organization__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Organization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Organization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Organization__ProcessElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Organization__Traceable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Persistable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Persistable__Persistable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Persistable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Persistable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Process__Process = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Process__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Process__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Process__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessElement__ProcessElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessElement__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessElement__Traceable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessParameter__ProcessParameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessParameter__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessParameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessParameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessStep__ProcessStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessStep__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessStep__ProcessElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessStep__Traceable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Product__Product = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__Persistable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Relationship__Relationship = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Relationship__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Relationship__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Relationship__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Resource__Resource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Resource__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Resource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Resource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Resource__Persistable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SubProcess__SubProcess = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubProcess__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubProcess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubProcess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubProcess__ProcessElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubProcess__Traceable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Traceable__Traceable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Traceable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Traceable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UnorderedSteps__UnorderedSteps = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnorderedSteps__IDNamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnorderedSteps__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnorderedSteps__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnorderedSteps__ProcessElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnorderedSteps__Traceable = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Capability__Capability.initOperations(_Capability__Capability);
			Fragments._Capability__IDNamedElement.initOperations(_Capability__IDNamedElement);
			Fragments._Capability__OclAny.initOperations(_Capability__OclAny);
			Fragments._Capability__OclElement.initOperations(_Capability__OclElement);
			Fragments._Capability__Persistable.initOperations(_Capability__Persistable);

			Fragments._CollaborativeNetwork__CollaborativeNetwork.initOperations(_CollaborativeNetwork__CollaborativeNetwork);
			Fragments._CollaborativeNetwork__IDNamedElement.initOperations(_CollaborativeNetwork__IDNamedElement);
			Fragments._CollaborativeNetwork__OclAny.initOperations(_CollaborativeNetwork__OclAny);
			Fragments._CollaborativeNetwork__OclElement.initOperations(_CollaborativeNetwork__OclElement);
			Fragments._CollaborativeNetwork__ProcessElement.initOperations(_CollaborativeNetwork__ProcessElement);
			Fragments._CollaborativeNetwork__Traceable.initOperations(_CollaborativeNetwork__Traceable);

			Fragments._Constraint__Constraint.initOperations(_Constraint__Constraint);
			Fragments._Constraint__IDNamedElement.initOperations(_Constraint__IDNamedElement);
			Fragments._Constraint__OclAny.initOperations(_Constraint__OclAny);
			Fragments._Constraint__OclElement.initOperations(_Constraint__OclElement);
			Fragments._Constraint__Persistable.initOperations(_Constraint__Persistable);

			Fragments._ContractualObligation__ContractualObligation.initOperations(_ContractualObligation__ContractualObligation);
			Fragments._ContractualObligation__IDNamedElement.initOperations(_ContractualObligation__IDNamedElement);
			Fragments._ContractualObligation__OclAny.initOperations(_ContractualObligation__OclAny);
			Fragments._ContractualObligation__OclElement.initOperations(_ContractualObligation__OclElement);
			Fragments._ContractualObligation__Persistable.initOperations(_ContractualObligation__Persistable);

			Fragments._EErrorDetection__EErrorDetection.initOperations(_EErrorDetection__EErrorDetection);
			Fragments._EErrorDetection__OclAny.initOperations(_EErrorDetection__OclAny);
			Fragments._EErrorDetection__OclElement.initOperations(_EErrorDetection__OclElement);
			Fragments._EErrorDetection__OclEnumeration.initOperations(_EErrorDetection__OclEnumeration);
			Fragments._EErrorDetection__OclType.initOperations(_EErrorDetection__OclType);

			Fragments._EErrorDomain__EErrorDomain.initOperations(_EErrorDomain__EErrorDomain);
			Fragments._EErrorDomain__OclAny.initOperations(_EErrorDomain__OclAny);
			Fragments._EErrorDomain__OclElement.initOperations(_EErrorDomain__OclElement);
			Fragments._EErrorDomain__OclEnumeration.initOperations(_EErrorDomain__OclEnumeration);
			Fragments._EErrorDomain__OclType.initOperations(_EErrorDomain__OclType);

			Fragments._EErrorOccurrence__EErrorOccurrence.initOperations(_EErrorOccurrence__EErrorOccurrence);
			Fragments._EErrorOccurrence__OclAny.initOperations(_EErrorOccurrence__OclAny);
			Fragments._EErrorOccurrence__OclElement.initOperations(_EErrorOccurrence__OclElement);
			Fragments._EErrorOccurrence__OclEnumeration.initOperations(_EErrorOccurrence__OclEnumeration);
			Fragments._EErrorOccurrence__OclType.initOperations(_EErrorOccurrence__OclType);

			Fragments._EErrorSeverity__EErrorSeverity.initOperations(_EErrorSeverity__EErrorSeverity);
			Fragments._EErrorSeverity__OclAny.initOperations(_EErrorSeverity__OclAny);
			Fragments._EErrorSeverity__OclElement.initOperations(_EErrorSeverity__OclElement);
			Fragments._EErrorSeverity__OclEnumeration.initOperations(_EErrorSeverity__OclEnumeration);
			Fragments._EErrorSeverity__OclType.initOperations(_EErrorSeverity__OclType);

			Fragments._EErrorStatus__EErrorStatus.initOperations(_EErrorStatus__EErrorStatus);
			Fragments._EErrorStatus__OclAny.initOperations(_EErrorStatus__OclAny);
			Fragments._EErrorStatus__OclElement.initOperations(_EErrorStatus__OclElement);
			Fragments._EErrorStatus__OclEnumeration.initOperations(_EErrorStatus__OclEnumeration);
			Fragments._EErrorStatus__OclType.initOperations(_EErrorStatus__OclType);

			Fragments._EErrorType__EErrorType.initOperations(_EErrorType__EErrorType);
			Fragments._EErrorType__OclAny.initOperations(_EErrorType__OclAny);
			Fragments._EErrorType__OclElement.initOperations(_EErrorType__OclElement);
			Fragments._EErrorType__OclEnumeration.initOperations(_EErrorType__OclEnumeration);
			Fragments._EErrorType__OclType.initOperations(_EErrorType__OclType);

			Fragments._EGateType__EGateType.initOperations(_EGateType__EGateType);
			Fragments._EGateType__OclAny.initOperations(_EGateType__OclAny);
			Fragments._EGateType__OclElement.initOperations(_EGateType__OclElement);
			Fragments._EGateType__OclEnumeration.initOperations(_EGateType__OclEnumeration);
			Fragments._EGateType__OclType.initOperations(_EGateType__OclType);

			Fragments._EOrganizationRole__EOrganizationRole.initOperations(_EOrganizationRole__EOrganizationRole);
			Fragments._EOrganizationRole__OclAny.initOperations(_EOrganizationRole__OclAny);
			Fragments._EOrganizationRole__OclElement.initOperations(_EOrganizationRole__OclElement);
			Fragments._EOrganizationRole__OclEnumeration.initOperations(_EOrganizationRole__OclEnumeration);
			Fragments._EOrganizationRole__OclType.initOperations(_EOrganizationRole__OclType);

			Fragments._EPersistenceType__EPersistenceType.initOperations(_EPersistenceType__EPersistenceType);
			Fragments._EPersistenceType__OclAny.initOperations(_EPersistenceType__OclAny);
			Fragments._EPersistenceType__OclElement.initOperations(_EPersistenceType__OclElement);
			Fragments._EPersistenceType__OclEnumeration.initOperations(_EPersistenceType__OclEnumeration);
			Fragments._EPersistenceType__OclType.initOperations(_EPersistenceType__OclType);

			Fragments._EProcessElementObligationsFulfilled__EProcessElementObligationsFulfilled.initOperations(_EProcessElementObligationsFulfilled__EProcessElementObligationsFulfilled);
			Fragments._EProcessElementObligationsFulfilled__OclAny.initOperations(_EProcessElementObligationsFulfilled__OclAny);
			Fragments._EProcessElementObligationsFulfilled__OclElement.initOperations(_EProcessElementObligationsFulfilled__OclElement);
			Fragments._EProcessElementObligationsFulfilled__OclEnumeration.initOperations(_EProcessElementObligationsFulfilled__OclEnumeration);
			Fragments._EProcessElementObligationsFulfilled__OclType.initOperations(_EProcessElementObligationsFulfilled__OclType);

			Fragments._EProcessElementStatus__EProcessElementStatus.initOperations(_EProcessElementStatus__EProcessElementStatus);
			Fragments._EProcessElementStatus__OclAny.initOperations(_EProcessElementStatus__OclAny);
			Fragments._EProcessElementStatus__OclElement.initOperations(_EProcessElementStatus__OclElement);
			Fragments._EProcessElementStatus__OclEnumeration.initOperations(_EProcessElementStatus__OclEnumeration);
			Fragments._EProcessElementStatus__OclType.initOperations(_EProcessElementStatus__OclType);

			Fragments._EProcessParameterType__EProcessParameterType.initOperations(_EProcessParameterType__EProcessParameterType);
			Fragments._EProcessParameterType__OclAny.initOperations(_EProcessParameterType__OclAny);
			Fragments._EProcessParameterType__OclElement.initOperations(_EProcessParameterType__OclElement);
			Fragments._EProcessParameterType__OclEnumeration.initOperations(_EProcessParameterType__OclEnumeration);
			Fragments._EProcessParameterType__OclType.initOperations(_EProcessParameterType__OclType);

			Fragments._EProcessStepNotation__EProcessStepNotation.initOperations(_EProcessStepNotation__EProcessStepNotation);
			Fragments._EProcessStepNotation__OclAny.initOperations(_EProcessStepNotation__OclAny);
			Fragments._EProcessStepNotation__OclElement.initOperations(_EProcessStepNotation__OclElement);
			Fragments._EProcessStepNotation__OclEnumeration.initOperations(_EProcessStepNotation__OclEnumeration);
			Fragments._EProcessStepNotation__OclType.initOperations(_EProcessStepNotation__OclType);

			Fragments._EProcessStepType__EProcessStepType.initOperations(_EProcessStepType__EProcessStepType);
			Fragments._EProcessStepType__OclAny.initOperations(_EProcessStepType__OclAny);
			Fragments._EProcessStepType__OclElement.initOperations(_EProcessStepType__OclElement);
			Fragments._EProcessStepType__OclEnumeration.initOperations(_EProcessStepType__OclEnumeration);
			Fragments._EProcessStepType__OclType.initOperations(_EProcessStepType__OclType);

			Fragments._ERelationshipType__ERelationshipType.initOperations(_ERelationshipType__ERelationshipType);
			Fragments._ERelationshipType__OclAny.initOperations(_ERelationshipType__OclAny);
			Fragments._ERelationshipType__OclElement.initOperations(_ERelationshipType__OclElement);
			Fragments._ERelationshipType__OclEnumeration.initOperations(_ERelationshipType__OclEnumeration);
			Fragments._ERelationshipType__OclType.initOperations(_ERelationshipType__OclType);

			Fragments._EResourceStatus__EResourceStatus.initOperations(_EResourceStatus__EResourceStatus);
			Fragments._EResourceStatus__OclAny.initOperations(_EResourceStatus__OclAny);
			Fragments._EResourceStatus__OclElement.initOperations(_EResourceStatus__OclElement);
			Fragments._EResourceStatus__OclEnumeration.initOperations(_EResourceStatus__OclEnumeration);
			Fragments._EResourceStatus__OclType.initOperations(_EResourceStatus__OclType);

			Fragments._EResourceType__EResourceType.initOperations(_EResourceType__EResourceType);
			Fragments._EResourceType__OclAny.initOperations(_EResourceType__OclAny);
			Fragments._EResourceType__OclElement.initOperations(_EResourceType__OclElement);
			Fragments._EResourceType__OclEnumeration.initOperations(_EResourceType__OclEnumeration);
			Fragments._EResourceType__OclType.initOperations(_EResourceType__OclType);

			Fragments._Error__Error.initOperations(_Error__Error);
			Fragments._Error__IDNamedElement.initOperations(_Error__IDNamedElement);
			Fragments._Error__OclAny.initOperations(_Error__OclAny);
			Fragments._Error__OclElement.initOperations(_Error__OclElement);

			Fragments._Gate__Gate.initOperations(_Gate__Gate);
			Fragments._Gate__IDNamedElement.initOperations(_Gate__IDNamedElement);
			Fragments._Gate__OclAny.initOperations(_Gate__OclAny);
			Fragments._Gate__OclElement.initOperations(_Gate__OclElement);
			Fragments._Gate__ProcessElement.initOperations(_Gate__ProcessElement);
			Fragments._Gate__Traceable.initOperations(_Gate__Traceable);

			Fragments._IDNamedElement__IDNamedElement.initOperations(_IDNamedElement__IDNamedElement);
			Fragments._IDNamedElement__OclAny.initOperations(_IDNamedElement__OclAny);
			Fragments._IDNamedElement__OclElement.initOperations(_IDNamedElement__OclElement);

			Fragments._Organization__IDNamedElement.initOperations(_Organization__IDNamedElement);
			Fragments._Organization__OclAny.initOperations(_Organization__OclAny);
			Fragments._Organization__OclElement.initOperations(_Organization__OclElement);
			Fragments._Organization__Organization.initOperations(_Organization__Organization);
			Fragments._Organization__ProcessElement.initOperations(_Organization__ProcessElement);
			Fragments._Organization__Traceable.initOperations(_Organization__Traceable);

			Fragments._Parameter__IDNamedElement.initOperations(_Parameter__IDNamedElement);
			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);
			Fragments._Parameter__Persistable.initOperations(_Parameter__Persistable);

			Fragments._Persistable__OclAny.initOperations(_Persistable__OclAny);
			Fragments._Persistable__OclElement.initOperations(_Persistable__OclElement);
			Fragments._Persistable__Persistable.initOperations(_Persistable__Persistable);

			Fragments._Process__IDNamedElement.initOperations(_Process__IDNamedElement);
			Fragments._Process__OclAny.initOperations(_Process__OclAny);
			Fragments._Process__OclElement.initOperations(_Process__OclElement);
			Fragments._Process__Process.initOperations(_Process__Process);

			Fragments._ProcessElement__IDNamedElement.initOperations(_ProcessElement__IDNamedElement);
			Fragments._ProcessElement__OclAny.initOperations(_ProcessElement__OclAny);
			Fragments._ProcessElement__OclElement.initOperations(_ProcessElement__OclElement);
			Fragments._ProcessElement__ProcessElement.initOperations(_ProcessElement__ProcessElement);
			Fragments._ProcessElement__Traceable.initOperations(_ProcessElement__Traceable);

			Fragments._ProcessParameter__IDNamedElement.initOperations(_ProcessParameter__IDNamedElement);
			Fragments._ProcessParameter__OclAny.initOperations(_ProcessParameter__OclAny);
			Fragments._ProcessParameter__OclElement.initOperations(_ProcessParameter__OclElement);
			Fragments._ProcessParameter__ProcessParameter.initOperations(_ProcessParameter__ProcessParameter);

			Fragments._ProcessStep__IDNamedElement.initOperations(_ProcessStep__IDNamedElement);
			Fragments._ProcessStep__OclAny.initOperations(_ProcessStep__OclAny);
			Fragments._ProcessStep__OclElement.initOperations(_ProcessStep__OclElement);
			Fragments._ProcessStep__ProcessElement.initOperations(_ProcessStep__ProcessElement);
			Fragments._ProcessStep__ProcessStep.initOperations(_ProcessStep__ProcessStep);
			Fragments._ProcessStep__Traceable.initOperations(_ProcessStep__Traceable);

			Fragments._Product__IDNamedElement.initOperations(_Product__IDNamedElement);
			Fragments._Product__OclAny.initOperations(_Product__OclAny);
			Fragments._Product__OclElement.initOperations(_Product__OclElement);
			Fragments._Product__Persistable.initOperations(_Product__Persistable);
			Fragments._Product__Product.initOperations(_Product__Product);

			Fragments._Relationship__IDNamedElement.initOperations(_Relationship__IDNamedElement);
			Fragments._Relationship__OclAny.initOperations(_Relationship__OclAny);
			Fragments._Relationship__OclElement.initOperations(_Relationship__OclElement);
			Fragments._Relationship__Relationship.initOperations(_Relationship__Relationship);

			Fragments._Resource__IDNamedElement.initOperations(_Resource__IDNamedElement);
			Fragments._Resource__OclAny.initOperations(_Resource__OclAny);
			Fragments._Resource__OclElement.initOperations(_Resource__OclElement);
			Fragments._Resource__Persistable.initOperations(_Resource__Persistable);
			Fragments._Resource__Resource.initOperations(_Resource__Resource);

			Fragments._SubProcess__IDNamedElement.initOperations(_SubProcess__IDNamedElement);
			Fragments._SubProcess__OclAny.initOperations(_SubProcess__OclAny);
			Fragments._SubProcess__OclElement.initOperations(_SubProcess__OclElement);
			Fragments._SubProcess__ProcessElement.initOperations(_SubProcess__ProcessElement);
			Fragments._SubProcess__SubProcess.initOperations(_SubProcess__SubProcess);
			Fragments._SubProcess__Traceable.initOperations(_SubProcess__Traceable);

			Fragments._Traceable__OclAny.initOperations(_Traceable__OclAny);
			Fragments._Traceable__OclElement.initOperations(_Traceable__OclElement);
			Fragments._Traceable__Traceable.initOperations(_Traceable__Traceable);

			Fragments._UnorderedSteps__IDNamedElement.initOperations(_UnorderedSteps__IDNamedElement);
			Fragments._UnorderedSteps__OclAny.initOperations(_UnorderedSteps__OclAny);
			Fragments._UnorderedSteps__OclElement.initOperations(_UnorderedSteps__OclElement);
			Fragments._UnorderedSteps__ProcessElement.initOperations(_UnorderedSteps__ProcessElement);
			Fragments._UnorderedSteps__Traceable.initOperations(_UnorderedSteps__Traceable);
			Fragments._UnorderedSteps__UnorderedSteps.initOperations(_UnorderedSteps__UnorderedSteps);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Capability = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._Capability__constraints,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._Persistable__isPersisted,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Capability__parameters,
			Process_modelingTables.Properties._Persistable__persistenceType,
			Process_modelingTables.Properties._Capability__requiresStorage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CollaborativeNetwork = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._CollaborativeNetwork__endorsementPolicy,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._ProcessElement__inRelationships,
			Process_modelingTables.Properties._ProcessElement__isErrorGroup,
			Process_modelingTables.Properties._Traceable__isTraced,
			Process_modelingTables.Properties._Traceable__logEndTime,
			Process_modelingTables.Properties._Traceable__logStartTime,
			Process_modelingTables.Properties._IDNamedElement__name,
			Process_modelingTables.Properties._ProcessElement__obligationsFulfilled,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._CollaborativeNetwork__organizations,
			Process_modelingTables.Properties._ProcessElement__outRelationships,
			Process_modelingTables.Properties._ProcessElement__relatedDltContent,
			Process_modelingTables.Properties._ProcessElement__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Constraint = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._Persistable__isPersisted,
			Process_modelingTables.Properties._Constraint__metricUnit,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Persistable__persistenceType,
			Process_modelingTables.Properties._Constraint__physicalDimension,
			Process_modelingTables.Properties._Constraint__relationalOperator,
			Process_modelingTables.Properties._Constraint__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContractualObligation = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._ContractualObligation__constraints,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._Persistable__isPersisted,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Persistable__persistenceType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EErrorDetection = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EErrorDomain = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EErrorOccurrence = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EErrorSeverity = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EErrorStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EErrorType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EGateType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EOrganizationRole = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EPersistenceType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EProcessElementObligationsFulfilled = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EProcessElementStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EProcessParameterType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EProcessStepNotation = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EProcessStepType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ERelationshipType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EResourceStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EResourceType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Error = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._Error__cause,
			Process_modelingTables.Properties._Error__description,
			Process_modelingTables.Properties._Error__detection,
			Process_modelingTables.Properties._Error__domain,
			Process_modelingTables.Properties._Error__effect,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._Error__globalErrorHandler,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._Error__localErrorHandler,
			Process_modelingTables.Properties._Error__message,
			Process_modelingTables.Properties._Error__mode,
			Process_modelingTables.Properties._IDNamedElement__name,
			Process_modelingTables.Properties._Error__occurrence,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Error__prevention,
			Process_modelingTables.Properties._Error__severity,
			Process_modelingTables.Properties._Error__status,
			Process_modelingTables.Properties._Error__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Gate = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._ProcessElement__inRelationships,
			Process_modelingTables.Properties._ProcessElement__isErrorGroup,
			Process_modelingTables.Properties._Traceable__isTraced,
			Process_modelingTables.Properties._Traceable__logEndTime,
			Process_modelingTables.Properties._Traceable__logStartTime,
			Process_modelingTables.Properties._IDNamedElement__name,
			Process_modelingTables.Properties._ProcessElement__obligationsFulfilled,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._ProcessElement__outRelationships,
			Process_modelingTables.Properties._ProcessElement__relatedDltContent,
			Process_modelingTables.Properties._ProcessElement__status,
			Process_modelingTables.Properties._Gate__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IDNamedElement = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Organization = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._Organization__dltPeerAddress,
			Process_modelingTables.Properties._Organization__elements,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._ProcessElement__inRelationships,
			Process_modelingTables.Properties._ProcessElement__isErrorGroup,
			Process_modelingTables.Properties._Traceable__isTraced,
			Process_modelingTables.Properties._Traceable__logEndTime,
			Process_modelingTables.Properties._Traceable__logStartTime,
			Process_modelingTables.Properties._IDNamedElement__name,
			Process_modelingTables.Properties._ProcessElement__obligationsFulfilled,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._ProcessElement__outRelationships,
			Process_modelingTables.Properties._ProcessElement__relatedDltContent,
			Process_modelingTables.Properties._Organization__role,
			Process_modelingTables.Properties._ProcessElement__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._Persistable__isPersisted,
			Process_modelingTables.Properties._Parameter__key,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Persistable__persistenceType,
			Process_modelingTables.Properties._Parameter__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Persistable = {
			Process_modelingTables.Properties._Persistable__isPersisted,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Persistable__persistenceType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Process = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._Process__author,
			Process_modelingTables.Properties._Process__company,
			Process_modelingTables.Properties._Process__date,
			Process_modelingTables.Properties._Process__elements,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Process__parameters,
			Process_modelingTables.Properties._Process__proposedProcess,
			Process_modelingTables.Properties._Process__relationships,
			Process_modelingTables.Properties._Process__startStep,
			Process_modelingTables.Properties._Process__unidentifiedErrorHandler,
			Process_modelingTables.Properties._Process__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessElement = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._ProcessElement__inRelationships,
			Process_modelingTables.Properties._ProcessElement__isErrorGroup,
			Process_modelingTables.Properties._Traceable__isTraced,
			Process_modelingTables.Properties._Traceable__logEndTime,
			Process_modelingTables.Properties._Traceable__logStartTime,
			Process_modelingTables.Properties._IDNamedElement__name,
			Process_modelingTables.Properties._ProcessElement__obligationsFulfilled,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._ProcessElement__outRelationships,
			Process_modelingTables.Properties._ProcessElement__relatedDltContent,
			Process_modelingTables.Properties._ProcessElement__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessParameter = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._ProcessParameter__parameter,
			Process_modelingTables.Properties._ProcessParameter__product,
			Process_modelingTables.Properties._ProcessParameter__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessStep = {
			Process_modelingTables.Properties._ProcessStep__acceptanceCriterion,
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._ProcessStep__capability,
			Process_modelingTables.Properties._ProcessStep__completionCriterion,
			Process_modelingTables.Properties._ProcessStep__contractualObligation,
			Process_modelingTables.Properties._ProcessStep__description,
			Process_modelingTables.Properties._ProcessStep__errors,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._ProcessStep__inProducts,
			Process_modelingTables.Properties._ProcessElement__inRelationships,
			Process_modelingTables.Properties._ProcessElement__isErrorGroup,
			Process_modelingTables.Properties._Traceable__isTraced,
			Process_modelingTables.Properties._Traceable__logEndTime,
			Process_modelingTables.Properties._Traceable__logStartTime,
			Process_modelingTables.Properties._IDNamedElement__name,
			Process_modelingTables.Properties._ProcessStep__notation,
			Process_modelingTables.Properties._ProcessElement__obligationsFulfilled,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._ProcessStep__outProducts,
			Process_modelingTables.Properties._ProcessElement__outRelationships,
			Process_modelingTables.Properties._ProcessElement__relatedDltContent,
			Process_modelingTables.Properties._ProcessStep__relatedInterfaceProcess,
			Process_modelingTables.Properties._ProcessStep__resource,
			Process_modelingTables.Properties._ProcessElement__status,
			Process_modelingTables.Properties._ProcessStep__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Product = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._Product__constraints,
			Process_modelingTables.Properties._Product__equivalent,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._Product__isFinal,
			Process_modelingTables.Properties._Persistable__isPersisted,
			Process_modelingTables.Properties._Product__isStored,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Persistable__persistenceType,
			Process_modelingTables.Properties._Product__quantity,
			Process_modelingTables.Properties._Product__storage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Relationship = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._Relationship__logicalCondition,
			Process_modelingTables.Properties._Relationship__message,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Relationship__source,
			Process_modelingTables.Properties._Relationship__target,
			Process_modelingTables.Properties._Relationship__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Resource = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._Resource__capabilities,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._Resource__inventory,
			Process_modelingTables.Properties._Resource__isActuator,
			Process_modelingTables.Properties._Persistable__isPersisted,
			Process_modelingTables.Properties._Resource__isStorage,
			Process_modelingTables.Properties._Resource__materialFlowSource,
			Process_modelingTables.Properties._Resource__materialFlowTarget,
			Process_modelingTables.Properties._IDNamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._Persistable__persistenceType,
			Process_modelingTables.Properties._Resource__protocol,
			Process_modelingTables.Properties._Resource__status,
			Process_modelingTables.Properties._Resource__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SubProcess = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._ProcessElement__inRelationships,
			Process_modelingTables.Properties._ProcessElement__isErrorGroup,
			Process_modelingTables.Properties._Traceable__isTraced,
			Process_modelingTables.Properties._Traceable__logEndTime,
			Process_modelingTables.Properties._Traceable__logStartTime,
			Process_modelingTables.Properties._IDNamedElement__name,
			Process_modelingTables.Properties._ProcessElement__obligationsFulfilled,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._ProcessElement__outRelationships,
			Process_modelingTables.Properties._SubProcess__parameters,
			Process_modelingTables.Properties._SubProcess__process,
			Process_modelingTables.Properties._ProcessElement__relatedDltContent,
			Process_modelingTables.Properties._ProcessElement__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Traceable = {
			Process_modelingTables.Properties._Traceable__isTraced,
			Process_modelingTables.Properties._Traceable__logEndTime,
			Process_modelingTables.Properties._Traceable__logStartTime,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UnorderedSteps = {
			Process_modelingTables.Properties._IDNamedElement__alias,
			Process_modelingTables.Properties._IDNamedElement__exposeToCollaboratingParties,
			Process_modelingTables.Properties._IDNamedElement__id,
			Process_modelingTables.Properties._ProcessElement__inRelationships,
			Process_modelingTables.Properties._ProcessElement__isErrorGroup,
			Process_modelingTables.Properties._Traceable__isTraced,
			Process_modelingTables.Properties._Traceable__logEndTime,
			Process_modelingTables.Properties._Traceable__logStartTime,
			Process_modelingTables.Properties._IDNamedElement__name,
			Process_modelingTables.Properties._ProcessElement__obligationsFulfilled,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Process_modelingTables.Properties._ProcessElement__outRelationships,
			Process_modelingTables.Properties._ProcessElement__relatedDltContent,
			Process_modelingTables.Properties._ProcessElement__status,
			Process_modelingTables.Properties._UnorderedSteps__steps
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Capability__Capability.initProperties(_Capability);
			Fragments._CollaborativeNetwork__CollaborativeNetwork.initProperties(_CollaborativeNetwork);
			Fragments._Constraint__Constraint.initProperties(_Constraint);
			Fragments._ContractualObligation__ContractualObligation.initProperties(_ContractualObligation);
			Fragments._EErrorDetection__EErrorDetection.initProperties(_EErrorDetection);
			Fragments._EErrorDomain__EErrorDomain.initProperties(_EErrorDomain);
			Fragments._EErrorOccurrence__EErrorOccurrence.initProperties(_EErrorOccurrence);
			Fragments._EErrorSeverity__EErrorSeverity.initProperties(_EErrorSeverity);
			Fragments._EErrorStatus__EErrorStatus.initProperties(_EErrorStatus);
			Fragments._EErrorType__EErrorType.initProperties(_EErrorType);
			Fragments._EGateType__EGateType.initProperties(_EGateType);
			Fragments._EOrganizationRole__EOrganizationRole.initProperties(_EOrganizationRole);
			Fragments._EPersistenceType__EPersistenceType.initProperties(_EPersistenceType);
			Fragments._EProcessElementObligationsFulfilled__EProcessElementObligationsFulfilled.initProperties(_EProcessElementObligationsFulfilled);
			Fragments._EProcessElementStatus__EProcessElementStatus.initProperties(_EProcessElementStatus);
			Fragments._EProcessParameterType__EProcessParameterType.initProperties(_EProcessParameterType);
			Fragments._EProcessStepNotation__EProcessStepNotation.initProperties(_EProcessStepNotation);
			Fragments._EProcessStepType__EProcessStepType.initProperties(_EProcessStepType);
			Fragments._ERelationshipType__ERelationshipType.initProperties(_ERelationshipType);
			Fragments._EResourceStatus__EResourceStatus.initProperties(_EResourceStatus);
			Fragments._EResourceType__EResourceType.initProperties(_EResourceType);
			Fragments._Error__Error.initProperties(_Error);
			Fragments._Gate__Gate.initProperties(_Gate);
			Fragments._IDNamedElement__IDNamedElement.initProperties(_IDNamedElement);
			Fragments._Organization__Organization.initProperties(_Organization);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._Persistable__Persistable.initProperties(_Persistable);
			Fragments._Process__Process.initProperties(_Process);
			Fragments._ProcessElement__ProcessElement.initProperties(_ProcessElement);
			Fragments._ProcessParameter__ProcessParameter.initProperties(_ProcessParameter);
			Fragments._ProcessStep__ProcessStep.initProperties(_ProcessStep);
			Fragments._Product__Product.initProperties(_Product);
			Fragments._Relationship__Relationship.initProperties(_Relationship);
			Fragments._Resource__Resource.initProperties(_Resource);
			Fragments._SubProcess__SubProcess.initProperties(_SubProcess);
			Fragments._Traceable__Traceable.initProperties(_Traceable);
			Fragments._UnorderedSteps__UnorderedSteps.initProperties(_UnorderedSteps);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _EErrorDetection__VERY_HIGH = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_DETECTION.getEEnumLiteral("VERY_HIGH"), Types._EErrorDetection, 0);
		public static final EcoreExecutorEnumerationLiteral _EErrorDetection__HIGH = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_DETECTION.getEEnumLiteral("HIGH"), Types._EErrorDetection, 1);
		public static final EcoreExecutorEnumerationLiteral _EErrorDetection__MODERATE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_DETECTION.getEEnumLiteral("MODERATE"), Types._EErrorDetection, 2);
		public static final EcoreExecutorEnumerationLiteral _EErrorDetection__LOW = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_DETECTION.getEEnumLiteral("LOW"), Types._EErrorDetection, 3);
		public static final EcoreExecutorEnumerationLiteral _EErrorDetection__VERY_LOW = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_DETECTION.getEEnumLiteral("VERY_LOW"), Types._EErrorDetection, 4);
		public static final EcoreExecutorEnumerationLiteral _EErrorDetection__NON_DETECTION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_DETECTION.getEEnumLiteral("NON_DETECTION"), Types._EErrorDetection, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EErrorDetection = {
			_EErrorDetection__VERY_HIGH,
			_EErrorDetection__HIGH,
			_EErrorDetection__MODERATE,
			_EErrorDetection__LOW,
			_EErrorDetection__VERY_LOW,
			_EErrorDetection__NON_DETECTION
		};

		public static final EcoreExecutorEnumerationLiteral _EErrorDomain__LOCAL = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_DOMAIN.getEEnumLiteral("LOCAL"), Types._EErrorDomain, 0);
		public static final EcoreExecutorEnumerationLiteral _EErrorDomain__GLOBAL = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_DOMAIN.getEEnumLiteral("GLOBAL"), Types._EErrorDomain, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EErrorDomain = {
			_EErrorDomain__LOCAL,
			_EErrorDomain__GLOBAL
		};

		public static final EcoreExecutorEnumerationLiteral _EErrorOccurrence__REMOTE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_OCCURRENCE.getEEnumLiteral("REMOTE"), Types._EErrorOccurrence, 0);
		public static final EcoreExecutorEnumerationLiteral _EErrorOccurrence__VERY_LOW = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_OCCURRENCE.getEEnumLiteral("VERY_LOW"), Types._EErrorOccurrence, 1);
		public static final EcoreExecutorEnumerationLiteral _EErrorOccurrence__LOW = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_OCCURRENCE.getEEnumLiteral("LOW"), Types._EErrorOccurrence, 2);
		public static final EcoreExecutorEnumerationLiteral _EErrorOccurrence__MODERATE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_OCCURRENCE.getEEnumLiteral("MODERATE"), Types._EErrorOccurrence, 3);
		public static final EcoreExecutorEnumerationLiteral _EErrorOccurrence__HIGH = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_OCCURRENCE.getEEnumLiteral("HIGH"), Types._EErrorOccurrence, 4);
		public static final EcoreExecutorEnumerationLiteral _EErrorOccurrence__VERY_HIGH = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_OCCURRENCE.getEEnumLiteral("VERY_HIGH"), Types._EErrorOccurrence, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EErrorOccurrence = {
			_EErrorOccurrence__REMOTE,
			_EErrorOccurrence__VERY_LOW,
			_EErrorOccurrence__LOW,
			_EErrorOccurrence__MODERATE,
			_EErrorOccurrence__HIGH,
			_EErrorOccurrence__VERY_HIGH
		};

		public static final EcoreExecutorEnumerationLiteral _EErrorSeverity__MINOR = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_SEVERITY.getEEnumLiteral("MINOR"), Types._EErrorSeverity, 0);
		public static final EcoreExecutorEnumerationLiteral _EErrorSeverity__LOW = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_SEVERITY.getEEnumLiteral("LOW"), Types._EErrorSeverity, 1);
		public static final EcoreExecutorEnumerationLiteral _EErrorSeverity__MODERATE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_SEVERITY.getEEnumLiteral("MODERATE"), Types._EErrorSeverity, 2);
		public static final EcoreExecutorEnumerationLiteral _EErrorSeverity__HIGH = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_SEVERITY.getEEnumLiteral("HIGH"), Types._EErrorSeverity, 3);
		public static final EcoreExecutorEnumerationLiteral _EErrorSeverity__VERY_HIGH = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_SEVERITY.getEEnumLiteral("VERY_HIGH"), Types._EErrorSeverity, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EErrorSeverity = {
			_EErrorSeverity__MINOR,
			_EErrorSeverity__LOW,
			_EErrorSeverity__MODERATE,
			_EErrorSeverity__HIGH,
			_EErrorSeverity__VERY_HIGH
		};

		public static final EcoreExecutorEnumerationLiteral _EErrorStatus__INACTIVE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_STATUS.getEEnumLiteral("INACTIVE"), Types._EErrorStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _EErrorStatus__ACTIVE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_STATUS.getEEnumLiteral("ACTIVE"), Types._EErrorStatus, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EErrorStatus = {
			_EErrorStatus__INACTIVE,
			_EErrorStatus__ACTIVE
		};

		public static final EcoreExecutorEnumerationLiteral _EErrorType__DEFAULT = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_TYPE.getEEnumLiteral("DEFAULT"), Types._EErrorType, 0);
		public static final EcoreExecutorEnumerationLiteral _EErrorType__NAMED_ERROR = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EERROR_TYPE.getEEnumLiteral("NAMED_ERROR"), Types._EErrorType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EErrorType = {
			_EErrorType__DEFAULT,
			_EErrorType__NAMED_ERROR
		};

		public static final EcoreExecutorEnumerationLiteral _EGateType__DECISION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EGATE_TYPE.getEEnumLiteral("DECISION"), Types._EGateType, 0);
		public static final EcoreExecutorEnumerationLiteral _EGateType__PARALLELISM = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EGATE_TYPE.getEEnumLiteral("PARALLELISM"), Types._EGateType, 1);
		public static final EcoreExecutorEnumerationLiteral _EGateType__COLLABORATION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EGATE_TYPE.getEEnumLiteral("COLLABORATION"), Types._EGateType, 2);
		public static final EcoreExecutorEnumerationLiteral _EGateType__VARIATION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EGATE_TYPE.getEEnumLiteral("VARIATION"), Types._EGateType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EGateType = {
			_EGateType__DECISION,
			_EGateType__PARALLELISM,
			_EGateType__COLLABORATION,
			_EGateType__VARIATION
		};

		public static final EcoreExecutorEnumerationLiteral _EOrganizationRole__BROKER = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EORGANIZATION_ROLE.getEEnumLiteral("BROKER"), Types._EOrganizationRole, 0);
		public static final EcoreExecutorEnumerationLiteral _EOrganizationRole__CORE_PARTNER = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EORGANIZATION_ROLE.getEEnumLiteral("CORE_PARTNER"), Types._EOrganizationRole, 1);
		public static final EcoreExecutorEnumerationLiteral _EOrganizationRole__ADDITIONAL_PARTNER = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EORGANIZATION_ROLE.getEEnumLiteral("ADDITIONAL_PARTNER"), Types._EOrganizationRole, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EOrganizationRole = {
			_EOrganizationRole__BROKER,
			_EOrganizationRole__CORE_PARTNER,
			_EOrganizationRole__ADDITIONAL_PARTNER
		};

		public static final EcoreExecutorEnumerationLiteral _EPersistenceType__HASHED = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPERSISTENCE_TYPE.getEEnumLiteral("HASHED"), Types._EPersistenceType, 0);
		public static final EcoreExecutorEnumerationLiteral _EPersistenceType__ENCRYPTED = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPERSISTENCE_TYPE.getEEnumLiteral("ENCRYPTED"), Types._EPersistenceType, 1);
		public static final EcoreExecutorEnumerationLiteral _EPersistenceType__PLAIN_TEXT = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPERSISTENCE_TYPE.getEEnumLiteral("PLAIN_TEXT"), Types._EPersistenceType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EPersistenceType = {
			_EPersistenceType__HASHED,
			_EPersistenceType__ENCRYPTED,
			_EPersistenceType__PLAIN_TEXT
		};

		public static final EcoreExecutorEnumerationLiteral _EProcessElementObligationsFulfilled__TRUE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_ELEMENT_OBLIGATIONS_FULFILLED.getEEnumLiteral("TRUE"), Types._EProcessElementObligationsFulfilled, 0);
		public static final EcoreExecutorEnumerationLiteral _EProcessElementObligationsFulfilled__FALSE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_ELEMENT_OBLIGATIONS_FULFILLED.getEEnumLiteral("FALSE"), Types._EProcessElementObligationsFulfilled, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EProcessElementObligationsFulfilled = {
			_EProcessElementObligationsFulfilled__TRUE,
			_EProcessElementObligationsFulfilled__FALSE
		};

		public static final EcoreExecutorEnumerationLiteral _EProcessElementStatus__INACTIVE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_ELEMENT_STATUS.getEEnumLiteral("INACTIVE"), Types._EProcessElementStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _EProcessElementStatus__ACTIVE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_ELEMENT_STATUS.getEEnumLiteral("ACTIVE"), Types._EProcessElementStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _EProcessElementStatus__ERROR = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_ELEMENT_STATUS.getEEnumLiteral("ERROR"), Types._EProcessElementStatus, 2);
		public static final EcoreExecutorEnumerationLiteral _EProcessElementStatus__NONE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_ELEMENT_STATUS.getEEnumLiteral("NONE"), Types._EProcessElementStatus, 3);
		public static final EcoreExecutorEnumerationLiteral _EProcessElementStatus__COMPLETED = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_ELEMENT_STATUS.getEEnumLiteral("COMPLETED"), Types._EProcessElementStatus, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EProcessElementStatus = {
			_EProcessElementStatus__INACTIVE,
			_EProcessElementStatus__ACTIVE,
			_EProcessElementStatus__ERROR,
			_EProcessElementStatus__NONE,
			_EProcessElementStatus__COMPLETED
		};

		public static final EcoreExecutorEnumerationLiteral _EProcessParameterType__INPUT_PRODUCT = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_PARAMETER_TYPE.getEEnumLiteral("INPUT_PRODUCT"), Types._EProcessParameterType, 0);
		public static final EcoreExecutorEnumerationLiteral _EProcessParameterType__OUTPUT_PRODUCT = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_PARAMETER_TYPE.getEEnumLiteral("OUTPUT_PRODUCT"), Types._EProcessParameterType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EProcessParameterType = {
			_EProcessParameterType__INPUT_PRODUCT,
			_EProcessParameterType__OUTPUT_PRODUCT
		};

		public static final EcoreExecutorEnumerationLiteral _EProcessStepNotation__NONE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_NOTATION.getEEnumLiteral("NONE"), Types._EProcessStepNotation, 0);
		public static final EcoreExecutorEnumerationLiteral _EProcessStepNotation__OPERATION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_NOTATION.getEEnumLiteral("OPERATION"), Types._EProcessStepNotation, 1);
		public static final EcoreExecutorEnumerationLiteral _EProcessStepNotation__INSPECTION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_NOTATION.getEEnumLiteral("INSPECTION"), Types._EProcessStepNotation, 2);
		public static final EcoreExecutorEnumerationLiteral _EProcessStepNotation__TRANSPORTATION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_NOTATION.getEEnumLiteral("TRANSPORTATION"), Types._EProcessStepNotation, 3);
		public static final EcoreExecutorEnumerationLiteral _EProcessStepNotation__CONFIGURATION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_NOTATION.getEEnumLiteral("CONFIGURATION"), Types._EProcessStepNotation, 4);
		public static final EcoreExecutorEnumerationLiteral _EProcessStepNotation__DELAY = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_NOTATION.getEEnumLiteral("DELAY"), Types._EProcessStepNotation, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EProcessStepNotation = {
			_EProcessStepNotation__NONE,
			_EProcessStepNotation__OPERATION,
			_EProcessStepNotation__INSPECTION,
			_EProcessStepNotation__TRANSPORTATION,
			_EProcessStepNotation__CONFIGURATION,
			_EProcessStepNotation__DELAY
		};

		public static final EcoreExecutorEnumerationLiteral _EProcessStepType__REGULAR = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_TYPE.getEEnumLiteral("REGULAR"), Types._EProcessStepType, 0);
		public static final EcoreExecutorEnumerationLiteral _EProcessStepType__START = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_TYPE.getEEnumLiteral("START"), Types._EProcessStepType, 1);
		public static final EcoreExecutorEnumerationLiteral _EProcessStepType__END = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.EPROCESS_STEP_TYPE.getEEnumLiteral("END"), Types._EProcessStepType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EProcessStepType = {
			_EProcessStepType__REGULAR,
			_EProcessStepType__START,
			_EProcessStepType__END
		};

		public static final EcoreExecutorEnumerationLiteral _ERelationshipType__FLOW = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERELATIONSHIP_TYPE.getEEnumLiteral("FLOW"), Types._ERelationshipType, 0);
		public static final EcoreExecutorEnumerationLiteral _ERelationshipType__COLLABORATION = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERELATIONSHIP_TYPE.getEEnumLiteral("COLLABORATION"), Types._ERelationshipType, 1);
		public static final EcoreExecutorEnumerationLiteral _ERelationshipType__ERROR = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERELATIONSHIP_TYPE.getEEnumLiteral("ERROR"), Types._ERelationshipType, 2);
		public static final EcoreExecutorEnumerationLiteral _ERelationshipType__DISPLAY_ONLY = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERELATIONSHIP_TYPE.getEEnumLiteral("DISPLAY_ONLY"), Types._ERelationshipType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ERelationshipType = {
			_ERelationshipType__FLOW,
			_ERelationshipType__COLLABORATION,
			_ERelationshipType__ERROR,
			_ERelationshipType__DISPLAY_ONLY
		};

		public static final EcoreExecutorEnumerationLiteral _EResourceStatus__STOPPED = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERESOURCE_STATUS.getEEnumLiteral("STOPPED"), Types._EResourceStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _EResourceStatus__RUNNING = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERESOURCE_STATUS.getEEnumLiteral("RUNNING"), Types._EResourceStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _EResourceStatus__MALFUNCTIONING = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERESOURCE_STATUS.getEEnumLiteral("MALFUNCTIONING"), Types._EResourceStatus, 2);
		public static final EcoreExecutorEnumerationLiteral _EResourceStatus__MAINTAINING = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERESOURCE_STATUS.getEEnumLiteral("MAINTAINING"), Types._EResourceStatus, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EResourceStatus = {
			_EResourceStatus__STOPPED,
			_EResourceStatus__RUNNING,
			_EResourceStatus__MALFUNCTIONING,
			_EResourceStatus__MAINTAINING
		};

		public static final EcoreExecutorEnumerationLiteral _EResourceType__NONE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERESOURCE_TYPE.getEEnumLiteral("NONE"), Types._EResourceType, 0);
		public static final EcoreExecutorEnumerationLiteral _EResourceType__HUMAN = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERESOURCE_TYPE.getEEnumLiteral("HUMAN"), Types._EResourceType, 1);
		public static final EcoreExecutorEnumerationLiteral _EResourceType__MACHINE = new EcoreExecutorEnumerationLiteral(Process_modelingPackage.Literals.ERESOURCE_TYPE.getEEnumLiteral("MACHINE"), Types._EResourceType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EResourceType = {
			_EResourceType__NONE,
			_EResourceType__HUMAN,
			_EResourceType__MACHINE
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._EErrorDetection.initLiterals(_EErrorDetection);
			Types._EErrorDomain.initLiterals(_EErrorDomain);
			Types._EErrorOccurrence.initLiterals(_EErrorOccurrence);
			Types._EErrorSeverity.initLiterals(_EErrorSeverity);
			Types._EErrorStatus.initLiterals(_EErrorStatus);
			Types._EErrorType.initLiterals(_EErrorType);
			Types._EGateType.initLiterals(_EGateType);
			Types._EOrganizationRole.initLiterals(_EOrganizationRole);
			Types._EPersistenceType.initLiterals(_EPersistenceType);
			Types._EProcessElementObligationsFulfilled.initLiterals(_EProcessElementObligationsFulfilled);
			Types._EProcessElementStatus.initLiterals(_EProcessElementStatus);
			Types._EProcessParameterType.initLiterals(_EProcessParameterType);
			Types._EProcessStepNotation.initLiterals(_EProcessStepNotation);
			Types._EProcessStepType.initLiterals(_EProcessStepType);
			Types._ERelationshipType.initLiterals(_ERelationshipType);
			Types._EResourceStatus.initLiterals(_EResourceStatus);
			Types._EResourceType.initLiterals(_EResourceType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Process_modelingTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Process_modelingTables();
	}

	private Process_modelingTables() {
		super(Process_modelingPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		Process_modelingPackage.Literals.PROCESS_STEP,
		Process_modelingPackage.Literals.RELATIONSHIP
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
