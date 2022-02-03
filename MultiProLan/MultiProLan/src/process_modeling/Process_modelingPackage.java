/**
 */
package process_modeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Process_modelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "process_modeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.trust40.com/process-modeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mod";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Process_modelingPackage eINSTANCE = process_modeling.impl.Process_modelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link process_modeling.impl.IDNamedElementImpl <em>ID Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.IDNamedElementImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getIDNamedElement()
	 * @generated
	 */
	int ID_NAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAMED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAMED_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAMED_ELEMENT__ALIAS = 3;

	/**
	 * The number of structural features of the '<em>ID Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAMED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ID Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ResourceImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Persisted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_PERSISTED = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PERSISTENCE_TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Actuator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_ACTUATOR = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_STORAGE = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROTOCOL = ID_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__STATUS = ID_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CAPABILITIES = ID_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__INVENTORY = ID_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Material Flow Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MATERIAL_FLOW_SOURCE = ID_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Material Flow Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MATERIAL_FLOW_TARGET = ID_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ProcessImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VERSION = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ELEMENTS = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RELATIONSHIPS = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__START_STEP = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unidentified Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__UNIDENTIFIED_ERROR_HANDLER = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Proposed Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROPOSED_PROCESS = ID_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__COMPANY = ID_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AUTHOR = ID_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DATE = ID_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARAMETERS = ID_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ProcessElementImpl <em>Process Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ProcessElementImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getProcessElement()
	 * @generated
	 */
	int PROCESS_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Traced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__IS_TRACED = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__LOG_START_TIME = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Log End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__LOG_END_TIME = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__IN_RELATIONSHIPS = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__OUT_RELATIONSHIPS = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Error Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__IS_ERROR_GROUP = ID_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__STATUS = ID_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Process Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Process Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ProcessStepImpl <em>Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ProcessStepImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getProcessStep()
	 * @generated
	 */
	int PROCESS_STEP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__ID = PROCESS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__EXPOSE_TO_COLLABORATING_PARTIES = PROCESS_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__ALIAS = PROCESS_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Traced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__IS_TRACED = PROCESS_ELEMENT__IS_TRACED;

	/**
	 * The feature id for the '<em><b>Log Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__LOG_START_TIME = PROCESS_ELEMENT__LOG_START_TIME;

	/**
	 * The feature id for the '<em><b>Log End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__LOG_END_TIME = PROCESS_ELEMENT__LOG_END_TIME;

	/**
	 * The feature id for the '<em><b>In Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__IN_RELATIONSHIPS = PROCESS_ELEMENT__IN_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Out Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__OUT_RELATIONSHIPS = PROCESS_ELEMENT__OUT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Is Error Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__IS_ERROR_GROUP = PROCESS_ELEMENT__IS_ERROR_GROUP;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__STATUS = PROCESS_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__TYPE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__NOTATION = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__CAPABILITY = PROCESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__IN_PRODUCTS = PROCESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__OUT_PRODUCTS = PROCESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__DESCRIPTION = PROCESS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__RESOURCE = PROCESS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__ACCEPTANCE_CRITERION = PROCESS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Completion Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__COMPLETION_CRITERION = PROCESS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__ERRORS = PROCESS_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.RelationshipImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LOGICAL_CONDITION = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MESSAGE = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.CapabilityImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Persisted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_PERSISTED = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PERSISTENCE_TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CONSTRAINTS = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__REQUIRES_STORAGE = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PARAMETERS = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ProductImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Persisted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IS_PERSISTED = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PERSISTENCE_TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Stored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IS_STORED = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONSTRAINTS = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Equivalent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__EQUIVALENT = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__STORAGE = ID_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__QUANTITY = ID_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IS_FINAL = ID_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ConstraintImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Persisted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__IS_PERSISTED = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PERSISTENCE_TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PHYSICAL_DIMENSION = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relational Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RELATIONAL_OPERATOR = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VALUE = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metric Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__METRIC_UNIT = ID_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.GateImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = PROCESS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__EXPOSE_TO_COLLABORATING_PARTIES = PROCESS_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ALIAS = PROCESS_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Traced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__IS_TRACED = PROCESS_ELEMENT__IS_TRACED;

	/**
	 * The feature id for the '<em><b>Log Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__LOG_START_TIME = PROCESS_ELEMENT__LOG_START_TIME;

	/**
	 * The feature id for the '<em><b>Log End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__LOG_END_TIME = PROCESS_ELEMENT__LOG_END_TIME;

	/**
	 * The feature id for the '<em><b>In Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__IN_RELATIONSHIPS = PROCESS_ELEMENT__IN_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Out Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OUT_RELATIONSHIPS = PROCESS_ELEMENT__OUT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Is Error Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__IS_ERROR_GROUP = PROCESS_ELEMENT__IS_ERROR_GROUP;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__STATUS = PROCESS_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__TYPE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ParameterImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Persisted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_PERSISTED = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PERSISTENCE_TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ErrorImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__DOMAIN = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__STATUS = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__MESSAGE = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__DESCRIPTION = ID_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__MODE = ID_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__EFFECT = ID_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__CAUSE = ID_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Prevention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__PREVENTION = ID_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__SEVERITY = ID_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__OCCURRENCE = ID_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__DETECTION = ID_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Global Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__GLOBAL_ERROR_HANDLER = ID_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Local Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__LOCAL_ERROR_HANDLER = ID_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.SubProcessImpl <em>Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.SubProcessImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getSubProcess()
	 * @generated
	 */
	int SUB_PROCESS = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ID = PROCESS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__EXPOSE_TO_COLLABORATING_PARTIES = PROCESS_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ALIAS = PROCESS_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Traced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IS_TRACED = PROCESS_ELEMENT__IS_TRACED;

	/**
	 * The feature id for the '<em><b>Log Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LOG_START_TIME = PROCESS_ELEMENT__LOG_START_TIME;

	/**
	 * The feature id for the '<em><b>Log End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LOG_END_TIME = PROCESS_ELEMENT__LOG_END_TIME;

	/**
	 * The feature id for the '<em><b>In Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IN_RELATIONSHIPS = PROCESS_ELEMENT__IN_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Out Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__OUT_RELATIONSHIPS = PROCESS_ELEMENT__OUT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Is Error Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IS_ERROR_GROUP = PROCESS_ELEMENT__IS_ERROR_GROUP;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__STATUS = PROCESS_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__PROCESS = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__PARAMETERS = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.UnorderedStepsImpl <em>Unordered Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.UnorderedStepsImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getUnorderedSteps()
	 * @generated
	 */
	int UNORDERED_STEPS = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__ID = PROCESS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__EXPOSE_TO_COLLABORATING_PARTIES = PROCESS_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__ALIAS = PROCESS_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Traced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__IS_TRACED = PROCESS_ELEMENT__IS_TRACED;

	/**
	 * The feature id for the '<em><b>Log Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__LOG_START_TIME = PROCESS_ELEMENT__LOG_START_TIME;

	/**
	 * The feature id for the '<em><b>Log End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__LOG_END_TIME = PROCESS_ELEMENT__LOG_END_TIME;

	/**
	 * The feature id for the '<em><b>In Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__IN_RELATIONSHIPS = PROCESS_ELEMENT__IN_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Out Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__OUT_RELATIONSHIPS = PROCESS_ELEMENT__OUT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Is Error Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__IS_ERROR_GROUP = PROCESS_ELEMENT__IS_ERROR_GROUP;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__STATUS = PROCESS_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS__STEPS = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unordered Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unordered Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_STEPS_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.ProcessParameterImpl <em>Process Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.ProcessParameterImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getProcessParameter()
	 * @generated
	 */
	int PROCESS_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__ID = ID_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__NAME = ID_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__EXPOSE_TO_COLLABORATING_PARTIES = ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__ALIAS = ID_NAMED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__TYPE = ID_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__PRODUCT = ID_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__PARAMETER = ID_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER_FEATURE_COUNT = ID_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Process Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER_OPERATION_COUNT = ID_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.TraceableImpl <em>Traceable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.TraceableImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getTraceable()
	 * @generated
	 */
	int TRACEABLE = 15;

	/**
	 * The feature id for the '<em><b>Is Traced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__IS_TRACED = 0;

	/**
	 * The feature id for the '<em><b>Log Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__LOG_START_TIME = 1;

	/**
	 * The feature id for the '<em><b>Log End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__LOG_END_TIME = 2;

	/**
	 * The number of structural features of the '<em>Traceable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traceable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.PersistableImpl <em>Persistable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.PersistableImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getPersistable()
	 * @generated
	 */
	int PERSISTABLE = 16;

	/**
	 * The feature id for the '<em><b>Is Persisted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE__IS_PERSISTED = 0;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE__PERSISTENCE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Persistable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Persistable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.PoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.PoolImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getPool()
	 * @generated
	 */
	int POOL = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__ID = PROCESS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__EXPOSE_TO_COLLABORATING_PARTIES = PROCESS_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__ALIAS = PROCESS_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Traced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__IS_TRACED = PROCESS_ELEMENT__IS_TRACED;

	/**
	 * The feature id for the '<em><b>Log Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LOG_START_TIME = PROCESS_ELEMENT__LOG_START_TIME;

	/**
	 * The feature id for the '<em><b>Log End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LOG_END_TIME = PROCESS_ELEMENT__LOG_END_TIME;

	/**
	 * The feature id for the '<em><b>In Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__IN_RELATIONSHIPS = PROCESS_ELEMENT__IN_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Out Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__OUT_RELATIONSHIPS = PROCESS_ELEMENT__OUT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Is Error Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__IS_ERROR_GROUP = PROCESS_ELEMENT__IS_ERROR_GROUP;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__STATUS = PROCESS_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Swimlanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__SWIMLANES = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link process_modeling.impl.SwimLaneImpl <em>Swim Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.impl.SwimLaneImpl
	 * @see process_modeling.impl.Process_modelingPackageImpl#getSwimLane()
	 * @generated
	 */
	int SWIM_LANE = 18;

	/**
	 * The feature id for the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIM_LANE__ORGANIZATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Organization Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIM_LANE__ORGANIZATION_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIM_LANE__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Swim Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIM_LANE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Swim Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIM_LANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process_modeling.EResourceType <em>EResource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EResourceType
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEResourceType()
	 * @generated
	 */
	int ERESOURCE_TYPE = 19;

	/**
	 * The meta object id for the '{@link process_modeling.EResourceStatus <em>EResource Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EResourceStatus
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEResourceStatus()
	 * @generated
	 */
	int ERESOURCE_STATUS = 20;

	/**
	 * The meta object id for the '{@link process_modeling.EProcessStepType <em>EProcess Step Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EProcessStepType
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEProcessStepType()
	 * @generated
	 */
	int EPROCESS_STEP_TYPE = 21;

	/**
	 * The meta object id for the '{@link process_modeling.EProcessStepNotation <em>EProcess Step Notation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EProcessStepNotation
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEProcessStepNotation()
	 * @generated
	 */
	int EPROCESS_STEP_NOTATION = 22;

	/**
	 * The meta object id for the '{@link process_modeling.EGateType <em>EGate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EGateType
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEGateType()
	 * @generated
	 */
	int EGATE_TYPE = 23;

	/**
	 * The meta object id for the '{@link process_modeling.ERelationshipType <em>ERelationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.ERelationshipType
	 * @see process_modeling.impl.Process_modelingPackageImpl#getERelationshipType()
	 * @generated
	 */
	int ERELATIONSHIP_TYPE = 24;

	/**
	 * The meta object id for the '{@link process_modeling.EErrorSeverity <em>EError Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EErrorSeverity
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorSeverity()
	 * @generated
	 */
	int EERROR_SEVERITY = 25;

	/**
	 * The meta object id for the '{@link process_modeling.EErrorDomain <em>EError Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EErrorDomain
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorDomain()
	 * @generated
	 */
	int EERROR_DOMAIN = 26;

	/**
	 * The meta object id for the '{@link process_modeling.EErrorOccurrence <em>EError Occurrence</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EErrorOccurrence
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorOccurrence()
	 * @generated
	 */
	int EERROR_OCCURRENCE = 27;

	/**
	 * The meta object id for the '{@link process_modeling.EErrorDetection <em>EError Detection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EErrorDetection
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorDetection()
	 * @generated
	 */
	int EERROR_DETECTION = 28;

	/**
	 * The meta object id for the '{@link process_modeling.EProcessElementStatus <em>EProcess Element Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EProcessElementStatus
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEProcessElementStatus()
	 * @generated
	 */
	int EPROCESS_ELEMENT_STATUS = 29;

	/**
	 * The meta object id for the '{@link process_modeling.EErrorType <em>EError Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EErrorType
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorType()
	 * @generated
	 */
	int EERROR_TYPE = 30;

	/**
	 * The meta object id for the '{@link process_modeling.EErrorStatus <em>EError Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EErrorStatus
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorStatus()
	 * @generated
	 */
	int EERROR_STATUS = 31;

	/**
	 * The meta object id for the '{@link process_modeling.EProcessParameterType <em>EProcess Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EProcessParameterType
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEProcessParameterType()
	 * @generated
	 */
	int EPROCESS_PARAMETER_TYPE = 32;


	/**
	 * The meta object id for the '{@link process_modeling.EPersistenceType <em>EPersistence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EPersistenceType
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEPersistenceType()
	 * @generated
	 */
	int EPERSISTENCE_TYPE = 33;


	/**
	 * The meta object id for the '{@link process_modeling.EOrganizationRole <em>EOrganization Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process_modeling.EOrganizationRole
	 * @see process_modeling.impl.Process_modelingPackageImpl#getEOrganizationRole()
	 * @generated
	 */
	int EORGANIZATION_ROLE = 34;


	/**
	 * Returns the meta object for class '{@link process_modeling.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see process_modeling.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Resource#isIsActuator <em>Is Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Actuator</em>'.
	 * @see process_modeling.Resource#isIsActuator()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_IsActuator();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Resource#isIsStorage <em>Is Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Storage</em>'.
	 * @see process_modeling.Resource#isIsStorage()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_IsStorage();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see process_modeling.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Resource#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see process_modeling.Resource#getProtocol()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Resource#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see process_modeling.Resource#getStatus()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Resource#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see process_modeling.Resource#getCapabilities()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Resource#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory</em>'.
	 * @see process_modeling.Resource#getInventory()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Inventory();

	/**
	 * Returns the meta object for the reference list '{@link process_modeling.Resource#getMaterialFlowSource <em>Material Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Flow Source</em>'.
	 * @see process_modeling.Resource#getMaterialFlowSource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_MaterialFlowSource();

	/**
	 * Returns the meta object for the reference list '{@link process_modeling.Resource#getMaterialFlowTarget <em>Material Flow Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Flow Target</em>'.
	 * @see process_modeling.Resource#getMaterialFlowTarget()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_MaterialFlowTarget();

	/**
	 * Returns the meta object for class '{@link process_modeling.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see process_modeling.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Process#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see process_modeling.Process#getVersion()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Process#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see process_modeling.Process#getElements()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Process#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see process_modeling.Process#getRelationships()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Relationships();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.Process#getStartStep <em>Start Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Step</em>'.
	 * @see process_modeling.Process#getStartStep()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_StartStep();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.Process#getUnidentifiedErrorHandler <em>Unidentified Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unidentified Error Handler</em>'.
	 * @see process_modeling.Process#getUnidentifiedErrorHandler()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_UnidentifiedErrorHandler();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Process#isProposedProcess <em>Proposed Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Process</em>'.
	 * @see process_modeling.Process#isProposedProcess()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ProposedProcess();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Process#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see process_modeling.Process#getCompany()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Company();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Process#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see process_modeling.Process#getAuthor()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Author();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Process#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see process_modeling.Process#getDate()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Process#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see process_modeling.Process#getParameters()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Parameters();

	/**
	 * Returns the meta object for class '{@link process_modeling.ProcessStep <em>Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Step</em>'.
	 * @see process_modeling.ProcessStep
	 * @generated
	 */
	EClass getProcessStep();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.ProcessStep#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see process_modeling.ProcessStep#getType()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_Type();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.ProcessStep#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation</em>'.
	 * @see process_modeling.ProcessStep#getNotation()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_Notation();

	/**
	 * Returns the meta object for the containment reference '{@link process_modeling.ProcessStep#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability</em>'.
	 * @see process_modeling.ProcessStep#getCapability()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Capability();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.ProcessStep#getInProducts <em>In Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Products</em>'.
	 * @see process_modeling.ProcessStep#getInProducts()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_InProducts();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.ProcessStep#getOutProducts <em>Out Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Products</em>'.
	 * @see process_modeling.ProcessStep#getOutProducts()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_OutProducts();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.ProcessStep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see process_modeling.ProcessStep#getDescription()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_Description();

	/**
	 * Returns the meta object for the containment reference '{@link process_modeling.ProcessStep#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see process_modeling.ProcessStep#getResource()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Resource();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.ProcessStep#getAcceptanceCriterion <em>Acceptance Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance Criterion</em>'.
	 * @see process_modeling.ProcessStep#getAcceptanceCriterion()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_AcceptanceCriterion();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.ProcessStep#getCompletionCriterion <em>Completion Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Criterion</em>'.
	 * @see process_modeling.ProcessStep#getCompletionCriterion()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_CompletionCriterion();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.ProcessStep#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errors</em>'.
	 * @see process_modeling.ProcessStep#getErrors()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Errors();

	/**
	 * Returns the meta object for class '{@link process_modeling.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see process_modeling.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see process_modeling.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Relationship#getLogicalCondition <em>Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Condition</em>'.
	 * @see process_modeling.Relationship#getLogicalCondition()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_LogicalCondition();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Relationship#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see process_modeling.Relationship#getMessage()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Message();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see process_modeling.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see process_modeling.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link process_modeling.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see process_modeling.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Capability#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see process_modeling.Capability#getConstraints()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Capability#isRequiresStorage <em>Requires Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Storage</em>'.
	 * @see process_modeling.Capability#isRequiresStorage()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_RequiresStorage();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Capability#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see process_modeling.Capability#getParameters()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Parameters();

	/**
	 * Returns the meta object for class '{@link process_modeling.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see process_modeling.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Product#isIsStored <em>Is Stored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Stored</em>'.
	 * @see process_modeling.Product#isIsStored()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_IsStored();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Product#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see process_modeling.Product#getConstraints()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Constraints();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.Product#getEquivalent <em>Equivalent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equivalent</em>'.
	 * @see process_modeling.Product#getEquivalent()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Equivalent();

	/**
	 * Returns the meta object for the containment reference '{@link process_modeling.Product#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storage</em>'.
	 * @see process_modeling.Product#getStorage()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Storage();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Product#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see process_modeling.Product#getQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Product#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see process_modeling.Product#isIsFinal()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_IsFinal();

	/**
	 * Returns the meta object for class '{@link process_modeling.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see process_modeling.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Constraint#getPhysicalDimension <em>Physical Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Dimension</em>'.
	 * @see process_modeling.Constraint#getPhysicalDimension()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_PhysicalDimension();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Constraint#getRelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relational Operator</em>'.
	 * @see process_modeling.Constraint#getRelationalOperator()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_RelationalOperator();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Constraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see process_modeling.Constraint#getValue()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Value();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Constraint#getMetricUnit <em>Metric Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric Unit</em>'.
	 * @see process_modeling.Constraint#getMetricUnit()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_MetricUnit();

	/**
	 * Returns the meta object for class '{@link process_modeling.ProcessElement <em>Process Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Element</em>'.
	 * @see process_modeling.ProcessElement
	 * @generated
	 */
	EClass getProcessElement();

	/**
	 * Returns the meta object for the reference list '{@link process_modeling.ProcessElement#getInRelationships <em>In Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Relationships</em>'.
	 * @see process_modeling.ProcessElement#getInRelationships()
	 * @see #getProcessElement()
	 * @generated
	 */
	EReference getProcessElement_InRelationships();

	/**
	 * Returns the meta object for the reference list '{@link process_modeling.ProcessElement#getOutRelationships <em>Out Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Relationships</em>'.
	 * @see process_modeling.ProcessElement#getOutRelationships()
	 * @see #getProcessElement()
	 * @generated
	 */
	EReference getProcessElement_OutRelationships();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.ProcessElement#isIsErrorGroup <em>Is Error Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Error Group</em>'.
	 * @see process_modeling.ProcessElement#isIsErrorGroup()
	 * @see #getProcessElement()
	 * @generated
	 */
	EAttribute getProcessElement_IsErrorGroup();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.ProcessElement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see process_modeling.ProcessElement#getStatus()
	 * @see #getProcessElement()
	 * @generated
	 */
	EAttribute getProcessElement_Status();

	/**
	 * Returns the meta object for class '{@link process_modeling.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see process_modeling.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Gate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see process_modeling.Gate#getType()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Type();

	/**
	 * Returns the meta object for class '{@link process_modeling.IDNamedElement <em>ID Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Named Element</em>'.
	 * @see process_modeling.IDNamedElement
	 * @generated
	 */
	EClass getIDNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.IDNamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see process_modeling.IDNamedElement#getId()
	 * @see #getIDNamedElement()
	 * @generated
	 */
	EAttribute getIDNamedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.IDNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see process_modeling.IDNamedElement#getName()
	 * @see #getIDNamedElement()
	 * @generated
	 */
	EAttribute getIDNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.IDNamedElement#isExposeToCollaboratingParties <em>Expose To Collaborating Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expose To Collaborating Parties</em>'.
	 * @see process_modeling.IDNamedElement#isExposeToCollaboratingParties()
	 * @see #getIDNamedElement()
	 * @generated
	 */
	EAttribute getIDNamedElement_ExposeToCollaboratingParties();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.IDNamedElement#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see process_modeling.IDNamedElement#getAlias()
	 * @see #getIDNamedElement()
	 * @generated
	 */
	EAttribute getIDNamedElement_Alias();

	/**
	 * Returns the meta object for class '{@link process_modeling.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see process_modeling.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see process_modeling.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see process_modeling.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link process_modeling.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see process_modeling.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see process_modeling.Error#getDomain()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Domain();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see process_modeling.Error#getType()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Type();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see process_modeling.Error#getStatus()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Status();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see process_modeling.Error#getMessage()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Message();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see process_modeling.Error#getDescription()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Description();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see process_modeling.Error#getMode()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Mode();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see process_modeling.Error#getEffect()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Effect();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see process_modeling.Error#getCause()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Cause();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getPrevention <em>Prevention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prevention</em>'.
	 * @see process_modeling.Error#getPrevention()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Prevention();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see process_modeling.Error#getSeverity()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Severity();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see process_modeling.Error#getOccurrence()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Occurrence();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Error#getDetection <em>Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detection</em>'.
	 * @see process_modeling.Error#getDetection()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Detection();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.Error#getGlobalErrorHandler <em>Global Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global Error Handler</em>'.
	 * @see process_modeling.Error#getGlobalErrorHandler()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_GlobalErrorHandler();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.Error#getLocalErrorHandler <em>Local Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Error Handler</em>'.
	 * @see process_modeling.Error#getLocalErrorHandler()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_LocalErrorHandler();

	/**
	 * Returns the meta object for class '{@link process_modeling.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Process</em>'.
	 * @see process_modeling.SubProcess
	 * @generated
	 */
	EClass getSubProcess();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.SubProcess#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see process_modeling.SubProcess#getProcess()
	 * @see #getSubProcess()
	 * @generated
	 */
	EReference getSubProcess_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.SubProcess#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see process_modeling.SubProcess#getParameters()
	 * @see #getSubProcess()
	 * @generated
	 */
	EReference getSubProcess_Parameters();

	/**
	 * Returns the meta object for class '{@link process_modeling.UnorderedSteps <em>Unordered Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered Steps</em>'.
	 * @see process_modeling.UnorderedSteps
	 * @generated
	 */
	EClass getUnorderedSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.UnorderedSteps#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see process_modeling.UnorderedSteps#getSteps()
	 * @see #getUnorderedSteps()
	 * @generated
	 */
	EReference getUnorderedSteps_Steps();

	/**
	 * Returns the meta object for class '{@link process_modeling.ProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Parameter</em>'.
	 * @see process_modeling.ProcessParameter
	 * @generated
	 */
	EClass getProcessParameter();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.ProcessParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see process_modeling.ProcessParameter#getType()
	 * @see #getProcessParameter()
	 * @generated
	 */
	EAttribute getProcessParameter_Type();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.ProcessParameter#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see process_modeling.ProcessParameter#getProduct()
	 * @see #getProcessParameter()
	 * @generated
	 */
	EReference getProcessParameter_Product();

	/**
	 * Returns the meta object for the reference '{@link process_modeling.ProcessParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see process_modeling.ProcessParameter#getParameter()
	 * @see #getProcessParameter()
	 * @generated
	 */
	EReference getProcessParameter_Parameter();

	/**
	 * Returns the meta object for class '{@link process_modeling.Traceable <em>Traceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable</em>'.
	 * @see process_modeling.Traceable
	 * @generated
	 */
	EClass getTraceable();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Traceable#isIsTraced <em>Is Traced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Traced</em>'.
	 * @see process_modeling.Traceable#isIsTraced()
	 * @see #getTraceable()
	 * @generated
	 */
	EAttribute getTraceable_IsTraced();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Traceable#isLogStartTime <em>Log Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Start Time</em>'.
	 * @see process_modeling.Traceable#isLogStartTime()
	 * @see #getTraceable()
	 * @generated
	 */
	EAttribute getTraceable_LogStartTime();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Traceable#isLogEndTime <em>Log End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log End Time</em>'.
	 * @see process_modeling.Traceable#isLogEndTime()
	 * @see #getTraceable()
	 * @generated
	 */
	EAttribute getTraceable_LogEndTime();

	/**
	 * Returns the meta object for class '{@link process_modeling.Persistable <em>Persistable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistable</em>'.
	 * @see process_modeling.Persistable
	 * @generated
	 */
	EClass getPersistable();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Persistable#isIsPersisted <em>Is Persisted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Persisted</em>'.
	 * @see process_modeling.Persistable#isIsPersisted()
	 * @see #getPersistable()
	 * @generated
	 */
	EAttribute getPersistable_IsPersisted();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.Persistable#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Type</em>'.
	 * @see process_modeling.Persistable#getPersistenceType()
	 * @see #getPersistable()
	 * @generated
	 */
	EAttribute getPersistable_PersistenceType();

	/**
	 * Returns the meta object for class '{@link process_modeling.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see process_modeling.Pool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.Pool#getSwimlanes <em>Swimlanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swimlanes</em>'.
	 * @see process_modeling.Pool#getSwimlanes()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Swimlanes();

	/**
	 * Returns the meta object for class '{@link process_modeling.SwimLane <em>Swim Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swim Lane</em>'.
	 * @see process_modeling.SwimLane
	 * @generated
	 */
	EClass getSwimLane();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.SwimLane#getOrganizationName <em>Organization Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Name</em>'.
	 * @see process_modeling.SwimLane#getOrganizationName()
	 * @see #getSwimLane()
	 * @generated
	 */
	EAttribute getSwimLane_OrganizationName();

	/**
	 * Returns the meta object for the attribute '{@link process_modeling.SwimLane#getOrganizationRole <em>Organization Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Role</em>'.
	 * @see process_modeling.SwimLane#getOrganizationRole()
	 * @see #getSwimLane()
	 * @generated
	 */
	EAttribute getSwimLane_OrganizationRole();

	/**
	 * Returns the meta object for the containment reference list '{@link process_modeling.SwimLane#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see process_modeling.SwimLane#getElements()
	 * @see #getSwimLane()
	 * @generated
	 */
	EReference getSwimLane_Elements();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EResourceType <em>EResource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EResource Type</em>'.
	 * @see process_modeling.EResourceType
	 * @generated
	 */
	EEnum getEResourceType();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EResourceStatus <em>EResource Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EResource Status</em>'.
	 * @see process_modeling.EResourceStatus
	 * @generated
	 */
	EEnum getEResourceStatus();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EProcessStepType <em>EProcess Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EProcess Step Type</em>'.
	 * @see process_modeling.EProcessStepType
	 * @generated
	 */
	EEnum getEProcessStepType();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EProcessStepNotation <em>EProcess Step Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EProcess Step Notation</em>'.
	 * @see process_modeling.EProcessStepNotation
	 * @generated
	 */
	EEnum getEProcessStepNotation();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EGateType <em>EGate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EGate Type</em>'.
	 * @see process_modeling.EGateType
	 * @generated
	 */
	EEnum getEGateType();

	/**
	 * Returns the meta object for enum '{@link process_modeling.ERelationshipType <em>ERelationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERelationship Type</em>'.
	 * @see process_modeling.ERelationshipType
	 * @generated
	 */
	EEnum getERelationshipType();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EErrorSeverity <em>EError Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EError Severity</em>'.
	 * @see process_modeling.EErrorSeverity
	 * @generated
	 */
	EEnum getEErrorSeverity();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EErrorDomain <em>EError Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EError Domain</em>'.
	 * @see process_modeling.EErrorDomain
	 * @generated
	 */
	EEnum getEErrorDomain();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EErrorOccurrence <em>EError Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EError Occurrence</em>'.
	 * @see process_modeling.EErrorOccurrence
	 * @generated
	 */
	EEnum getEErrorOccurrence();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EErrorDetection <em>EError Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EError Detection</em>'.
	 * @see process_modeling.EErrorDetection
	 * @generated
	 */
	EEnum getEErrorDetection();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EProcessElementStatus <em>EProcess Element Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EProcess Element Status</em>'.
	 * @see process_modeling.EProcessElementStatus
	 * @generated
	 */
	EEnum getEProcessElementStatus();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EErrorType <em>EError Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EError Type</em>'.
	 * @see process_modeling.EErrorType
	 * @generated
	 */
	EEnum getEErrorType();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EErrorStatus <em>EError Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EError Status</em>'.
	 * @see process_modeling.EErrorStatus
	 * @generated
	 */
	EEnum getEErrorStatus();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EProcessParameterType <em>EProcess Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EProcess Parameter Type</em>'.
	 * @see process_modeling.EProcessParameterType
	 * @generated
	 */
	EEnum getEProcessParameterType();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EPersistenceType <em>EPersistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EPersistence Type</em>'.
	 * @see process_modeling.EPersistenceType
	 * @generated
	 */
	EEnum getEPersistenceType();

	/**
	 * Returns the meta object for enum '{@link process_modeling.EOrganizationRole <em>EOrganization Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EOrganization Role</em>'.
	 * @see process_modeling.EOrganizationRole
	 * @generated
	 */
	EEnum getEOrganizationRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Process_modelingFactory getProcess_modelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link process_modeling.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ResourceImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Is Actuator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IS_ACTUATOR = eINSTANCE.getResource_IsActuator();

		/**
		 * The meta object literal for the '<em><b>Is Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IS_STORAGE = eINSTANCE.getResource_IsStorage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PROTOCOL = eINSTANCE.getResource_Protocol();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__STATUS = eINSTANCE.getResource_Status();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CAPABILITIES = eINSTANCE.getResource_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__INVENTORY = eINSTANCE.getResource_Inventory();

		/**
		 * The meta object literal for the '<em><b>Material Flow Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__MATERIAL_FLOW_SOURCE = eINSTANCE.getResource_MaterialFlowSource();

		/**
		 * The meta object literal for the '<em><b>Material Flow Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__MATERIAL_FLOW_TARGET = eINSTANCE.getResource_MaterialFlowTarget();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ProcessImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__VERSION = eINSTANCE.getProcess_Version();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ELEMENTS = eINSTANCE.getProcess_Elements();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RELATIONSHIPS = eINSTANCE.getProcess_Relationships();

		/**
		 * The meta object literal for the '<em><b>Start Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__START_STEP = eINSTANCE.getProcess_StartStep();

		/**
		 * The meta object literal for the '<em><b>Unidentified Error Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__UNIDENTIFIED_ERROR_HANDLER = eINSTANCE.getProcess_UnidentifiedErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Proposed Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PROPOSED_PROCESS = eINSTANCE.getProcess_ProposedProcess();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__COMPANY = eINSTANCE.getProcess_Company();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__AUTHOR = eINSTANCE.getProcess_Author();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DATE = eINSTANCE.getProcess_Date();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PARAMETERS = eINSTANCE.getProcess_Parameters();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.ProcessStepImpl <em>Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ProcessStepImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getProcessStep()
		 * @generated
		 */
		EClass PROCESS_STEP = eINSTANCE.getProcessStep();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__TYPE = eINSTANCE.getProcessStep_Type();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__NOTATION = eINSTANCE.getProcessStep_Notation();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__CAPABILITY = eINSTANCE.getProcessStep_Capability();

		/**
		 * The meta object literal for the '<em><b>In Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__IN_PRODUCTS = eINSTANCE.getProcessStep_InProducts();

		/**
		 * The meta object literal for the '<em><b>Out Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__OUT_PRODUCTS = eINSTANCE.getProcessStep_OutProducts();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__DESCRIPTION = eINSTANCE.getProcessStep_Description();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__RESOURCE = eINSTANCE.getProcessStep_Resource();

		/**
		 * The meta object literal for the '<em><b>Acceptance Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__ACCEPTANCE_CRITERION = eINSTANCE.getProcessStep_AcceptanceCriterion();

		/**
		 * The meta object literal for the '<em><b>Completion Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__COMPLETION_CRITERION = eINSTANCE.getProcessStep_CompletionCriterion();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__ERRORS = eINSTANCE.getProcessStep_Errors();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.RelationshipImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Logical Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__LOGICAL_CONDITION = eINSTANCE.getRelationship_LogicalCondition();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__MESSAGE = eINSTANCE.getRelationship_Message();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.CapabilityImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__CONSTRAINTS = eINSTANCE.getCapability_Constraints();

		/**
		 * The meta object literal for the '<em><b>Requires Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__REQUIRES_STORAGE = eINSTANCE.getCapability_RequiresStorage();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__PARAMETERS = eINSTANCE.getCapability_Parameters();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ProductImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Is Stored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__IS_STORED = eINSTANCE.getProduct_IsStored();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CONSTRAINTS = eINSTANCE.getProduct_Constraints();

		/**
		 * The meta object literal for the '<em><b>Equivalent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__EQUIVALENT = eINSTANCE.getProduct_Equivalent();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__STORAGE = eINSTANCE.getProduct_Storage();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__QUANTITY = eINSTANCE.getProduct_Quantity();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__IS_FINAL = eINSTANCE.getProduct_IsFinal();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ConstraintImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Physical Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__PHYSICAL_DIMENSION = eINSTANCE.getConstraint_PhysicalDimension();

		/**
		 * The meta object literal for the '<em><b>Relational Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__RELATIONAL_OPERATOR = eINSTANCE.getConstraint_RelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__VALUE = eINSTANCE.getConstraint_Value();

		/**
		 * The meta object literal for the '<em><b>Metric Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__METRIC_UNIT = eINSTANCE.getConstraint_MetricUnit();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.ProcessElementImpl <em>Process Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ProcessElementImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getProcessElement()
		 * @generated
		 */
		EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

		/**
		 * The meta object literal for the '<em><b>In Relationships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_ELEMENT__IN_RELATIONSHIPS = eINSTANCE.getProcessElement_InRelationships();

		/**
		 * The meta object literal for the '<em><b>Out Relationships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_ELEMENT__OUT_RELATIONSHIPS = eINSTANCE.getProcessElement_OutRelationships();

		/**
		 * The meta object literal for the '<em><b>Is Error Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT__IS_ERROR_GROUP = eINSTANCE.getProcessElement_IsErrorGroup();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT__STATUS = eINSTANCE.getProcessElement_Status();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.GateImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__TYPE = eINSTANCE.getGate_Type();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.IDNamedElementImpl <em>ID Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.IDNamedElementImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getIDNamedElement()
		 * @generated
		 */
		EClass ID_NAMED_ELEMENT = eINSTANCE.getIDNamedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NAMED_ELEMENT__ID = eINSTANCE.getIDNamedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NAMED_ELEMENT__NAME = eINSTANCE.getIDNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Expose To Collaborating Parties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES = eINSTANCE.getIDNamedElement_ExposeToCollaboratingParties();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NAMED_ELEMENT__ALIAS = eINSTANCE.getIDNamedElement_Alias();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ParameterImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ErrorImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__DOMAIN = eINSTANCE.getError_Domain();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__TYPE = eINSTANCE.getError_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__STATUS = eINSTANCE.getError_Status();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__MESSAGE = eINSTANCE.getError_Message();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__DESCRIPTION = eINSTANCE.getError_Description();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__MODE = eINSTANCE.getError_Mode();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__EFFECT = eINSTANCE.getError_Effect();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__CAUSE = eINSTANCE.getError_Cause();

		/**
		 * The meta object literal for the '<em><b>Prevention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__PREVENTION = eINSTANCE.getError_Prevention();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__SEVERITY = eINSTANCE.getError_Severity();

		/**
		 * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__OCCURRENCE = eINSTANCE.getError_Occurrence();

		/**
		 * The meta object literal for the '<em><b>Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__DETECTION = eINSTANCE.getError_Detection();

		/**
		 * The meta object literal for the '<em><b>Global Error Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__GLOBAL_ERROR_HANDLER = eINSTANCE.getError_GlobalErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Local Error Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__LOCAL_ERROR_HANDLER = eINSTANCE.getError_LocalErrorHandler();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.SubProcessImpl <em>Sub Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.SubProcessImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getSubProcess()
		 * @generated
		 */
		EClass SUB_PROCESS = eINSTANCE.getSubProcess();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PROCESS__PROCESS = eINSTANCE.getSubProcess_Process();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PROCESS__PARAMETERS = eINSTANCE.getSubProcess_Parameters();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.UnorderedStepsImpl <em>Unordered Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.UnorderedStepsImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getUnorderedSteps()
		 * @generated
		 */
		EClass UNORDERED_STEPS = eINSTANCE.getUnorderedSteps();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNORDERED_STEPS__STEPS = eINSTANCE.getUnorderedSteps_Steps();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.ProcessParameterImpl <em>Process Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.ProcessParameterImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getProcessParameter()
		 * @generated
		 */
		EClass PROCESS_PARAMETER = eINSTANCE.getProcessParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_PARAMETER__TYPE = eINSTANCE.getProcessParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PARAMETER__PRODUCT = eINSTANCE.getProcessParameter_Product();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_PARAMETER__PARAMETER = eINSTANCE.getProcessParameter_Parameter();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.TraceableImpl <em>Traceable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.TraceableImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getTraceable()
		 * @generated
		 */
		EClass TRACEABLE = eINSTANCE.getTraceable();

		/**
		 * The meta object literal for the '<em><b>Is Traced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABLE__IS_TRACED = eINSTANCE.getTraceable_IsTraced();

		/**
		 * The meta object literal for the '<em><b>Log Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABLE__LOG_START_TIME = eINSTANCE.getTraceable_LogStartTime();

		/**
		 * The meta object literal for the '<em><b>Log End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABLE__LOG_END_TIME = eINSTANCE.getTraceable_LogEndTime();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.PersistableImpl <em>Persistable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.PersistableImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getPersistable()
		 * @generated
		 */
		EClass PERSISTABLE = eINSTANCE.getPersistable();

		/**
		 * The meta object literal for the '<em><b>Is Persisted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTABLE__IS_PERSISTED = eINSTANCE.getPersistable_IsPersisted();

		/**
		 * The meta object literal for the '<em><b>Persistence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTABLE__PERSISTENCE_TYPE = eINSTANCE.getPersistable_PersistenceType();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.PoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.PoolImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getPool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getPool();

		/**
		 * The meta object literal for the '<em><b>Swimlanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__SWIMLANES = eINSTANCE.getPool_Swimlanes();

		/**
		 * The meta object literal for the '{@link process_modeling.impl.SwimLaneImpl <em>Swim Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.impl.SwimLaneImpl
		 * @see process_modeling.impl.Process_modelingPackageImpl#getSwimLane()
		 * @generated
		 */
		EClass SWIM_LANE = eINSTANCE.getSwimLane();

		/**
		 * The meta object literal for the '<em><b>Organization Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIM_LANE__ORGANIZATION_NAME = eINSTANCE.getSwimLane_OrganizationName();

		/**
		 * The meta object literal for the '<em><b>Organization Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIM_LANE__ORGANIZATION_ROLE = eINSTANCE.getSwimLane_OrganizationRole();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIM_LANE__ELEMENTS = eINSTANCE.getSwimLane_Elements();

		/**
		 * The meta object literal for the '{@link process_modeling.EResourceType <em>EResource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EResourceType
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEResourceType()
		 * @generated
		 */
		EEnum ERESOURCE_TYPE = eINSTANCE.getEResourceType();

		/**
		 * The meta object literal for the '{@link process_modeling.EResourceStatus <em>EResource Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EResourceStatus
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEResourceStatus()
		 * @generated
		 */
		EEnum ERESOURCE_STATUS = eINSTANCE.getEResourceStatus();

		/**
		 * The meta object literal for the '{@link process_modeling.EProcessStepType <em>EProcess Step Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EProcessStepType
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEProcessStepType()
		 * @generated
		 */
		EEnum EPROCESS_STEP_TYPE = eINSTANCE.getEProcessStepType();

		/**
		 * The meta object literal for the '{@link process_modeling.EProcessStepNotation <em>EProcess Step Notation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EProcessStepNotation
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEProcessStepNotation()
		 * @generated
		 */
		EEnum EPROCESS_STEP_NOTATION = eINSTANCE.getEProcessStepNotation();

		/**
		 * The meta object literal for the '{@link process_modeling.EGateType <em>EGate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EGateType
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEGateType()
		 * @generated
		 */
		EEnum EGATE_TYPE = eINSTANCE.getEGateType();

		/**
		 * The meta object literal for the '{@link process_modeling.ERelationshipType <em>ERelationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.ERelationshipType
		 * @see process_modeling.impl.Process_modelingPackageImpl#getERelationshipType()
		 * @generated
		 */
		EEnum ERELATIONSHIP_TYPE = eINSTANCE.getERelationshipType();

		/**
		 * The meta object literal for the '{@link process_modeling.EErrorSeverity <em>EError Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EErrorSeverity
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorSeverity()
		 * @generated
		 */
		EEnum EERROR_SEVERITY = eINSTANCE.getEErrorSeverity();

		/**
		 * The meta object literal for the '{@link process_modeling.EErrorDomain <em>EError Domain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EErrorDomain
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorDomain()
		 * @generated
		 */
		EEnum EERROR_DOMAIN = eINSTANCE.getEErrorDomain();

		/**
		 * The meta object literal for the '{@link process_modeling.EErrorOccurrence <em>EError Occurrence</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EErrorOccurrence
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorOccurrence()
		 * @generated
		 */
		EEnum EERROR_OCCURRENCE = eINSTANCE.getEErrorOccurrence();

		/**
		 * The meta object literal for the '{@link process_modeling.EErrorDetection <em>EError Detection</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EErrorDetection
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorDetection()
		 * @generated
		 */
		EEnum EERROR_DETECTION = eINSTANCE.getEErrorDetection();

		/**
		 * The meta object literal for the '{@link process_modeling.EProcessElementStatus <em>EProcess Element Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EProcessElementStatus
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEProcessElementStatus()
		 * @generated
		 */
		EEnum EPROCESS_ELEMENT_STATUS = eINSTANCE.getEProcessElementStatus();

		/**
		 * The meta object literal for the '{@link process_modeling.EErrorType <em>EError Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EErrorType
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorType()
		 * @generated
		 */
		EEnum EERROR_TYPE = eINSTANCE.getEErrorType();

		/**
		 * The meta object literal for the '{@link process_modeling.EErrorStatus <em>EError Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EErrorStatus
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEErrorStatus()
		 * @generated
		 */
		EEnum EERROR_STATUS = eINSTANCE.getEErrorStatus();

		/**
		 * The meta object literal for the '{@link process_modeling.EProcessParameterType <em>EProcess Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EProcessParameterType
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEProcessParameterType()
		 * @generated
		 */
		EEnum EPROCESS_PARAMETER_TYPE = eINSTANCE.getEProcessParameterType();

		/**
		 * The meta object literal for the '{@link process_modeling.EPersistenceType <em>EPersistence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EPersistenceType
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEPersistenceType()
		 * @generated
		 */
		EEnum EPERSISTENCE_TYPE = eINSTANCE.getEPersistenceType();

		/**
		 * The meta object literal for the '{@link process_modeling.EOrganizationRole <em>EOrganization Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process_modeling.EOrganizationRole
		 * @see process_modeling.impl.Process_modelingPackageImpl#getEOrganizationRole()
		 * @generated
		 */
		EEnum EORGANIZATION_ROLE = eINSTANCE.getEOrganizationRole();

	}

} //Process_modelingPackage
