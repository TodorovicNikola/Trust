/**
 */
package process_modeling.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import process_modeling.Capability;
import process_modeling.ContractualObligation;
import process_modeling.EProcessStepNotation;
import process_modeling.EProcessStepType;
import process_modeling.ERelationshipType;
import process_modeling.ProcessElement;
import process_modeling.ProcessStep;
import process_modeling.Process_modelingPackage;
import process_modeling.Process_modelingTables;
import process_modeling.Product;
import process_modeling.Relationship;
import process_modeling.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getInProducts <em>In Products</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getOutProducts <em>Out Products</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getAcceptanceCriterion <em>Acceptance Criterion</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getCompletionCriterion <em>Completion Criterion</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getContractualObligation <em>Contractual Obligation</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessStepImpl#getRelatedInterfaceProcess <em>Related Interface Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessStepImpl extends ProcessElementImpl implements ProcessStep {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EProcessStepType TYPE_EDEFAULT = EProcessStepType.REGULAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EProcessStepType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected static final EProcessStepNotation NOTATION_EDEFAULT = EProcessStepNotation.OPERATION;

	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected EProcessStepNotation notation = NOTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected Capability capability;

	/**
	 * The cached value of the '{@link #getInProducts() <em>In Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> inProducts;

	/**
	 * The cached value of the '{@link #getOutProducts() <em>Out Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> outProducts;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The default value of the '{@link #getAcceptanceCriterion() <em>Acceptance Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPTANCE_CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptanceCriterion() <em>Acceptance Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriterion()
	 * @generated
	 * @ordered
	 */
	protected String acceptanceCriterion = ACCEPTANCE_CRITERION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionCriterion() <em>Completion Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionCriterion() <em>Completion Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCriterion()
	 * @generated
	 * @ordered
	 */
	protected String completionCriterion = COMPLETION_CRITERION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<process_modeling.Error> errors;

	/**
	 * The cached value of the '{@link #getContractualObligation() <em>Contractual Obligation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractualObligation()
	 * @generated
	 * @ordered
	 */
	protected ContractualObligation contractualObligation;

	/**
	 * The cached value of the '{@link #getRelatedInterfaceProcess() <em>Related Interface Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedInterfaceProcess()
	 * @generated
	 * @ordered
	 */
	protected process_modeling.Process relatedInterfaceProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.PROCESS_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessStepType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EProcessStepType newType) {
		EProcessStepType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessStepNotation getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(EProcessStepNotation newNotation) {
		EProcessStepNotation oldNotation = notation;
		notation = newNotation == null ? NOTATION_EDEFAULT : newNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__NOTATION, oldNotation, notation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapability(Capability newCapability, NotificationChain msgs) {
		Capability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__CAPABILITY, oldCapability, newCapability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(Capability newCapability) {
		if (newCapability != capability) {
			NotificationChain msgs = null;
			if (capability != null)
				msgs = ((InternalEObject)capability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Process_modelingPackage.PROCESS_STEP__CAPABILITY, null, msgs);
			if (newCapability != null)
				msgs = ((InternalEObject)newCapability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Process_modelingPackage.PROCESS_STEP__CAPABILITY, null, msgs);
			msgs = basicSetCapability(newCapability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__CAPABILITY, newCapability, newCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getInProducts() {
		if (inProducts == null) {
			inProducts = new EObjectContainmentEList<Product>(Product.class, this, Process_modelingPackage.PROCESS_STEP__IN_PRODUCTS);
		}
		return inProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getOutProducts() {
		if (outProducts == null) {
			outProducts = new EObjectContainmentEList<Product>(Product.class, this, Process_modelingPackage.PROCESS_STEP__OUT_PRODUCTS);
		}
		return outProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Process_modelingPackage.PROCESS_STEP__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Process_modelingPackage.PROCESS_STEP__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptanceCriterion() {
		return acceptanceCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceCriterion(String newAcceptanceCriterion) {
		String oldAcceptanceCriterion = acceptanceCriterion;
		acceptanceCriterion = newAcceptanceCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__ACCEPTANCE_CRITERION, oldAcceptanceCriterion, acceptanceCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompletionCriterion() {
		return completionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCriterion(String newCompletionCriterion) {
		String oldCompletionCriterion = completionCriterion;
		completionCriterion = newCompletionCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__COMPLETION_CRITERION, oldCompletionCriterion, completionCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<process_modeling.Error> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<process_modeling.Error>(process_modeling.Error.class, this, Process_modelingPackage.PROCESS_STEP__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractualObligation getContractualObligation() {
		return contractualObligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContractualObligation(ContractualObligation newContractualObligation, NotificationChain msgs) {
		ContractualObligation oldContractualObligation = contractualObligation;
		contractualObligation = newContractualObligation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION, oldContractualObligation, newContractualObligation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContractualObligation(ContractualObligation newContractualObligation) {
		if (newContractualObligation != contractualObligation) {
			NotificationChain msgs = null;
			if (contractualObligation != null)
				msgs = ((InternalEObject)contractualObligation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION, null, msgs);
			if (newContractualObligation != null)
				msgs = ((InternalEObject)newContractualObligation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION, null, msgs);
			msgs = basicSetContractualObligation(newContractualObligation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION, newContractualObligation, newContractualObligation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process_modeling.Process getRelatedInterfaceProcess() {
		if (relatedInterfaceProcess != null && relatedInterfaceProcess.eIsProxy()) {
			InternalEObject oldRelatedInterfaceProcess = (InternalEObject)relatedInterfaceProcess;
			relatedInterfaceProcess = (process_modeling.Process)eResolveProxy(oldRelatedInterfaceProcess);
			if (relatedInterfaceProcess != oldRelatedInterfaceProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Process_modelingPackage.PROCESS_STEP__RELATED_INTERFACE_PROCESS, oldRelatedInterfaceProcess, relatedInterfaceProcess));
			}
		}
		return relatedInterfaceProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process_modeling.Process basicGetRelatedInterfaceProcess() {
		return relatedInterfaceProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedInterfaceProcess(process_modeling.Process newRelatedInterfaceProcess) {
		process_modeling.Process oldRelatedInterfaceProcess = relatedInterfaceProcess;
		relatedInterfaceProcess = newRelatedInterfaceProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_STEP__RELATED_INTERFACE_PROCESS, oldRelatedInterfaceProcess, relatedInterfaceProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean startProcessStepHasOnlyOneLinkTo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ProcessStep::startProcessStepHasOnlyOneLinkTo";
		try {
			/**
			 *
			 * inv startProcessStepHasOnlyOneLinkTo:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ProcessStep.allInstances()
			 *         ->forAll(ps | ps.type = EProcessStepType::START implies
			 *           ps.inRelationships->size() = 0 and
			 *           ps.outRelationships->size() = 1 and
			 *           ps.outRelationships->select(r | r.type = ERelationshipType::FLOW)
			 *           ->notEmpty())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS_STEP___START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_0 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep_0);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_ps = allInstances.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_ps.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ ProcessStep ps = (ProcessStep)ITERATOR_ps.next();
						/**
						 * ps.type = EProcessStepType::START implies
						 * ps.inRelationships->size() = 0 and
						 * ps.outRelationships->size() = 1 and
						 * ps.outRelationships->select(r | r.type = ERelationshipType::FLOW)
						 * ->notEmpty()
						 */
						/*@Caught*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ EProcessStepType type = ps.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_START;
							final /*@Thrown*/ Boolean implies;
							if (!eq) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_and_0;
								try {
									final /*@NonInvalid*/ List<Relationship> outRelationships_0 = ps.getOutRelationships();
									final /*@NonInvalid*/ SetValue BOXED_outRelationships_0 = idResolver.createSetOfAll(Process_modelingTables.SET_CLSSid_Relationship, outRelationships_0);
									final /*@NonInvalid*/ List<Relationship> inRelationships = ps.getInRelationships();
									final /*@NonInvalid*/ SetValue BOXED_inRelationships = idResolver.createSetOfAll(Process_modelingTables.SET_CLSSid_Relationship, inRelationships);
									final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_inRelationships);
									final /*@NonInvalid*/ boolean eq_0 = size.equals(Process_modelingTables.INT_0);
									final /*@NonInvalid*/ Boolean and;
									if (!eq_0) {
										and = ValueUtil.FALSE_VALUE;
									}
									else {
										final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_outRelationships_0);
										final /*@NonInvalid*/ boolean eq_1 = size_0.equals(Process_modelingTables.INT_1);
										if (!eq_1) {
											and = ValueUtil.FALSE_VALUE;
										}
										else {
											and = ValueUtil.TRUE_VALUE;
										}
									}
									final /*@Thrown*/ Boolean and_0;
									if (and == ValueUtil.FALSE_VALUE) {
										and_0 = ValueUtil.FALSE_VALUE;
									}
									else {
										/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(Process_modelingTables.SET_CLSSid_Relationship);
										Iterator<Object> ITERATOR_r = BOXED_outRelationships_0.iterator();
										/*@NonInvalid*/ SetValue select;
										while (true) {
											if (!ITERATOR_r.hasNext()) {
												select = accumulator_0;
												break;
											}
											/*@NonInvalid*/ Relationship r = (Relationship)ITERATOR_r.next();
											/**
											 * r.type = ERelationshipType::FLOW
											 */
											final /*@NonInvalid*/ ERelationshipType type_0 = r.getType();
											final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
											final /*@NonInvalid*/ boolean eq_2 = BOXED_type_0 == Process_modelingTables.ELITid_FLOW;
											//
											if (eq_2) {
												accumulator_0.add(r);
											}
										}
										final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(select).booleanValue();
										if (!notEmpty) {
											and_0 = ValueUtil.FALSE_VALUE;
										}
										else {
											if (and == null) {
												and_0 = null;
											}
											else {
												and_0 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									CAUGHT_and_0 = and_0;
								}
								catch (Exception e) {
									CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and_0;
									}
									if (CAUGHT_and_0 == null) {
										implies = null;
									}
									else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies = implies;
						}
						catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_implies;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Process_modelingTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean onlyOneFlowRelationProcessStep(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ProcessStep::onlyOneFlowRelationProcessStep";
		try {
			/**
			 *
			 * inv onlyOneFlowRelationProcessStep:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ProcessStep.allInstances()
			 *         ->forAll(ps |
			 *           ps.inRelationships->forAll(r1, r2 |
			 *             (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW implies r1 = r2
			 *             )) and
			 *           ps.outRelationships->forAll(r1, r2 |
			 *             (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW implies r1 = r2
			 *             )))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS_STEP___ONLY_ONE_FLOW_RELATION_PROCESS_STEP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_8;
			if (le) {
				local_8 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_0 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep_0);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_ps = allInstances.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_ps.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ ProcessStep ps = (ProcessStep)ITERATOR_ps.next();
						/**
						 *
						 * ps.inRelationships->forAll(r1, r2 |
						 *   (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW implies r1 = r2
						 *   )) and
						 * ps.outRelationships->forAll(r1, r2 |
						 *   (r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW implies r1 = r2
						 *   ))
						 */
						final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
						/*@Caught*/ Object CAUGHT_and_1;
						try {
							/*@Caught*/ Object CAUGHT_forAll;
							try {
								final /*@NonInvalid*/ List<Relationship> inRelationships = ps.getInRelationships();
								final /*@NonInvalid*/ SetValue BOXED_inRelationships = idResolver.createSetOfAll(Process_modelingTables.SET_CLSSid_Relationship, inRelationships);
								final org.eclipse.ocl.pivot.Class TYPE_forAll_1 = executor.getStaticTypeOfValue(null, BOXED_inRelationships);
								final LibraryIterationExtension IMPL_forAll_1 = (LibraryIterationExtension)TYPE_forAll_1.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
								final /*@NonNull*/ Object ACC_forAll_1 = IMPL_forAll_1.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
								/**
								 * Implementation of the iterator body.
								 */
								final AbstractSimpleOperation BODY_forAll_1 = new AbstractSimpleOperation() {
									/**
									 * r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW implies r1 = r2
									 */
									@Override
									public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
										final /*@NonInvalid*/ SetValue BOXED_inRelationships = (SetValue)sourceAndArgumentValues[0];
										final /*@NonInvalid*/ Object r1 = sourceAndArgumentValues[1];
										final /*@NonInvalid*/ Object r2 = sourceAndArgumentValues[2];
										/*@Caught*/ Object CAUGHT_implies;
										try {
											final /*@NonInvalid*/ Relationship local_2 = (Relationship)r1;
											final /*@NonInvalid*/ Relationship local_3 = (Relationship)r2;
											/*@Caught*/ Object CAUGHT_and;
											try {
												/*@Caught*/ Object CAUGHT_eq;
												try {
													if (local_2 == null) {
														throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::type\'");
													}
													final /*@Thrown*/ ERelationshipType type = local_2.getType();
													final /*@Thrown*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
													final /*@Thrown*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_FLOW;
													CAUGHT_eq = eq;
												}
												catch (Exception e) {
													CAUGHT_eq = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean and;
												if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
													and = ValueUtil.FALSE_VALUE;
												}
												else {
													/*@Caught*/ Object CAUGHT_eq_0;
													try {
														if (local_3 == null) {
															throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::type\'");
														}
														final /*@Thrown*/ ERelationshipType type_0 = local_3.getType();
														final /*@Thrown*/ EnumerationLiteralId BOXED_type_0 = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
														final /*@Thrown*/ boolean eq_0 = BOXED_type_0 == Process_modelingTables.ELITid_FLOW;
														CAUGHT_eq_0 = eq_0;
													}
													catch (Exception e) {
														CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
														and = ValueUtil.FALSE_VALUE;
													}
													else {
														if (CAUGHT_eq instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_eq;
														}
														if (CAUGHT_eq_0 instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_eq_0;
														}
														and = ValueUtil.TRUE_VALUE;
													}
												}
												CAUGHT_and = and;
											}
											catch (Exception e) {
												CAUGHT_and = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean implies;
											if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
												implies = ValueUtil.TRUE_VALUE;
											}
											else {
												final /*@NonInvalid*/ boolean eq_1 = (local_2 != null) ? local_2.equals(local_3) : (local_3 == null);
												if (eq_1) {
													implies = ValueUtil.TRUE_VALUE;
												}
												else {
													if (CAUGHT_and instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_and;
													}
													if (CAUGHT_and == null) {
														implies = null;
													}
													else {
														implies = ValueUtil.FALSE_VALUE;
													}
												}
											}
											CAUGHT_implies = implies;
										}
										catch (Exception e) {
											CAUGHT_implies = ValueUtil.createInvalidValue(e);
										}
										return CAUGHT_implies;
									}
								};
								final ExecutorMultipleIterationManager MGR_forAll_1 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_forAll_1, BOXED_inRelationships, ACC_forAll_1);
								final /*@Thrown*/ Boolean forAll = (Boolean)IMPL_forAll_1.evaluateIteration(MGR_forAll_1);
								CAUGHT_forAll = forAll;
							}
							catch (Exception e) {
								CAUGHT_forAll = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_1;
							if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_forAll_0;
								try {
									final /*@NonInvalid*/ List<Relationship> outRelationships = ps.getOutRelationships();
									final /*@NonInvalid*/ SetValue BOXED_outRelationships = idResolver.createSetOfAll(Process_modelingTables.SET_CLSSid_Relationship, outRelationships);
									final org.eclipse.ocl.pivot.Class TYPE_forAll_0_0 = executor.getStaticTypeOfValue(null, BOXED_outRelationships);
									final LibraryIterationExtension IMPL_forAll_0_0 = (LibraryIterationExtension)TYPE_forAll_0_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
									final /*@NonNull*/ Object ACC_forAll_0_0 = IMPL_forAll_0_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
									/**
									 * Implementation of the iterator body.
									 */
									final AbstractSimpleOperation BODY_forAll_0_0 = new AbstractSimpleOperation() {
										/**
										 * r1.type = ERelationshipType::FLOW and r2.type = ERelationshipType::FLOW implies r1 = r2
										 */
										@Override
										public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
											final /*@NonInvalid*/ SetValue BOXED_outRelationships = (SetValue)sourceAndArgumentValues[0];
											final /*@NonInvalid*/ Object r1_0 = sourceAndArgumentValues[1];
											final /*@NonInvalid*/ Object r2_0 = sourceAndArgumentValues[2];
											/*@Caught*/ Object CAUGHT_implies_0;
											try {
												final /*@NonInvalid*/ Relationship local_6 = (Relationship)r1_0;
												final /*@NonInvalid*/ Relationship local_7 = (Relationship)r2_0;
												/*@Caught*/ Object CAUGHT_and_0;
												try {
													/*@Caught*/ Object CAUGHT_eq_2;
													try {
														if (local_6 == null) {
															throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::type\'");
														}
														final /*@Thrown*/ ERelationshipType type_1 = local_6.getType();
														final /*@Thrown*/ EnumerationLiteralId BOXED_type_1 = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type_1.getName()));
														final /*@Thrown*/ boolean eq_2 = BOXED_type_1 == Process_modelingTables.ELITid_FLOW;
														CAUGHT_eq_2 = eq_2;
													}
													catch (Exception e) {
														CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
													}
													final /*@Thrown*/ Boolean and_0;
													if (CAUGHT_eq_2 == ValueUtil.FALSE_VALUE) {
														and_0 = ValueUtil.FALSE_VALUE;
													}
													else {
														/*@Caught*/ Object CAUGHT_eq_3;
														try {
															if (local_7 == null) {
																throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::type\'");
															}
															final /*@Thrown*/ ERelationshipType type_2 = local_7.getType();
															final /*@Thrown*/ EnumerationLiteralId BOXED_type_2 = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type_2.getName()));
															final /*@Thrown*/ boolean eq_3 = BOXED_type_2 == Process_modelingTables.ELITid_FLOW;
															CAUGHT_eq_3 = eq_3;
														}
														catch (Exception e) {
															CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
														}
														if (CAUGHT_eq_3 == ValueUtil.FALSE_VALUE) {
															and_0 = ValueUtil.FALSE_VALUE;
														}
														else {
															if (CAUGHT_eq_2 instanceof InvalidValueException) {
																throw (InvalidValueException)CAUGHT_eq_2;
															}
															if (CAUGHT_eq_3 instanceof InvalidValueException) {
																throw (InvalidValueException)CAUGHT_eq_3;
															}
															and_0 = ValueUtil.TRUE_VALUE;
														}
													}
													CAUGHT_and_0 = and_0;
												}
												catch (Exception e) {
													CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean implies_0;
												if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
													implies_0 = ValueUtil.TRUE_VALUE;
												}
												else {
													final /*@NonInvalid*/ boolean eq_4 = (local_6 != null) ? local_6.equals(local_7) : (local_7 == null);
													if (eq_4) {
														implies_0 = ValueUtil.TRUE_VALUE;
													}
													else {
														if (CAUGHT_and_0 instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_and_0;
														}
														if (CAUGHT_and_0 == null) {
															implies_0 = null;
														}
														else {
															implies_0 = ValueUtil.FALSE_VALUE;
														}
													}
												}
												CAUGHT_implies_0 = implies_0;
											}
											catch (Exception e) {
												CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
											}
											return CAUGHT_implies_0;
										}
									};
									final ExecutorMultipleIterationManager MGR_forAll_0_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_forAll_0_0, BOXED_outRelationships, ACC_forAll_0_0);
									final /*@Thrown*/ Boolean forAll_0 = (Boolean)IMPL_forAll_0_0.evaluateIteration(MGR_forAll_0_0);
									CAUGHT_forAll_0 = forAll_0;
								}
								catch (Exception e) {
									CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) {
									and_1 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_forAll instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_forAll;
									}
									if (CAUGHT_forAll_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_forAll_0;
									}
									if ((CAUGHT_forAll == null) || (CAUGHT_forAll_0 == null)) {
										and_1 = null;
									}
									else {
										and_1 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_1 = and_1;
						}
						catch (Exception e) {
							CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_and_1 == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_and_1 instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_and_1;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Process_modelingTables.INT_0).booleanValue();
				local_8 = logDiagnostic;
			}
			return local_8;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean startProcessStepHasOnlyOneLinkTo2(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ProcessStep::startProcessStepHasOnlyOneLinkTo2";
		try {
			/**
			 *
			 * inv startProcessStepHasOnlyOneLinkTo2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ProcessStep.allInstances()
			 *         ->forAll(ps | ps.type = EProcessStepType::START implies
			 *           not ps.inRelationships->exists(r | true) and
			 *           ps.outRelationships->exists(r | true) and
			 *           ps.outRelationships->forAll(r1, r2 | r1 = r2) and
			 *           Relationship.allInstances()
			 *           ->exists(r | r.source.id = ps.id and r.type = ERelationshipType::FLOW))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS_STEP___START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_0 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep_0);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_ps = allInstances.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_ps.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ ProcessStep ps = (ProcessStep)ITERATOR_ps.next();
						/**
						 * ps.type = EProcessStepType::START implies
						 * not ps.inRelationships->exists(r | true) and
						 * ps.outRelationships->exists(r | true) and
						 * ps.outRelationships->forAll(r1, r2 | r1 = r2) and
						 * Relationship.allInstances()
						 * ->exists(r | r.source.id = ps.id and r.type = ERelationshipType::FLOW)
						 */
						final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
						/*@Caught*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ EProcessStepType type = ps.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_START;
							final /*@Thrown*/ Boolean implies;
							if (!eq) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_and_2;
								try {
									/*@Caught*/ Object CAUGHT_and_0;
									try {
										/*@Caught*/ Object CAUGHT_not;
										try {
											final /*@NonInvalid*/ List<Relationship> inRelationships = ps.getInRelationships();
											final /*@NonInvalid*/ SetValue BOXED_inRelationships = idResolver.createSetOfAll(Process_modelingTables.SET_CLSSid_Relationship, inRelationships);
											/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_r = BOXED_inRelationships.iterator();
											/*@NonInvalid*/ Boolean exists;
											while (true) {
												if (!ITERATOR_r.hasNext()) {
													if (accumulator_0 == ValueUtil.FALSE_VALUE) {
														exists = ValueUtil.FALSE_VALUE;
													}
													else {
														throw (InvalidValueException)accumulator_0;
													}
													break;
												}
												/*@NonInvalid*/ Relationship r = (Relationship)ITERATOR_r.next();
												/**
												 * true
												 */
												//
												exists = ValueUtil.TRUE_VALUE;
												break;
											}
											final /*@Thrown*/ Boolean not;
											if (exists == ValueUtil.FALSE_VALUE) {
												not = ValueUtil.TRUE_VALUE;
											}
											else {
												if (exists == ValueUtil.TRUE_VALUE) {
													not = ValueUtil.FALSE_VALUE;
												}
												else {
													not = null;
												}
											}
											CAUGHT_not = not;
										}
										catch (Exception e) {
											CAUGHT_not = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean and_0;
										if (CAUGHT_not == ValueUtil.FALSE_VALUE) {
											and_0 = ValueUtil.FALSE_VALUE;
										}
										else {
											/*@Caught*/ Object CAUGHT_and;
											try {
												final /*@NonInvalid*/ List<Relationship> outRelationships = ps.getOutRelationships();
												final /*@NonInvalid*/ SetValue BOXED_outRelationships = idResolver.createSetOfAll(Process_modelingTables.SET_CLSSid_Relationship, outRelationships);
												/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
												Iterator<Object> ITERATOR_r_0 = BOXED_outRelationships.iterator();
												/*@NonInvalid*/ Boolean exists_0;
												while (true) {
													if (!ITERATOR_r_0.hasNext()) {
														if (accumulator_1 == ValueUtil.FALSE_VALUE) {
															exists_0 = ValueUtil.FALSE_VALUE;
														}
														else {
															throw (InvalidValueException)accumulator_1;
														}
														break;
													}
													/*@NonInvalid*/ Relationship r_0 = (Relationship)ITERATOR_r_0.next();
													/**
													 * true
													 */
													//
													exists_0 = ValueUtil.TRUE_VALUE;
													break;
												}
												final /*@Thrown*/ Boolean and;
												if (exists_0 == ValueUtil.FALSE_VALUE) {
													and = ValueUtil.FALSE_VALUE;
												}
												else {
													/*@Caught*/ Object CAUGHT_forAll;
													try {
														final org.eclipse.ocl.pivot.Class TYPE_forAll_0 = executor.getStaticTypeOfValue(null, BOXED_outRelationships);
														final LibraryIterationExtension IMPL_forAll_0 = (LibraryIterationExtension)TYPE_forAll_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
														final /*@NonNull*/ Object ACC_forAll_0 = IMPL_forAll_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
														/**
														 * Implementation of the iterator body.
														 */
														final AbstractSimpleOperation BODY_forAll_0 = new AbstractSimpleOperation() {
															/**
															 * r1 = r2
															 */
															@Override
															public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
																final /*@NonInvalid*/ SetValue BOXED_outRelationships = (SetValue)sourceAndArgumentValues[0];
																final /*@NonInvalid*/ Object r1 = sourceAndArgumentValues[1];
																final /*@NonInvalid*/ Object r2 = sourceAndArgumentValues[2];
																final /*@NonInvalid*/ Relationship local_0 = (Relationship)r1;
																final /*@NonInvalid*/ Relationship local_1 = (Relationship)r2;
																final /*@NonInvalid*/ boolean eq_0 = (local_0 != null) ? local_0.equals(local_1) : (local_1 == null);
																return eq_0;
															}
														};
														final ExecutorMultipleIterationManager MGR_forAll_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_forAll_0, BOXED_outRelationships, ACC_forAll_0);
														final /*@Thrown*/ Boolean forAll = (Boolean)IMPL_forAll_0.evaluateIteration(MGR_forAll_0);
														CAUGHT_forAll = forAll;
													}
													catch (Exception e) {
														CAUGHT_forAll = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
														and = ValueUtil.FALSE_VALUE;
													}
													else {
														if (CAUGHT_forAll instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_forAll;
														}
														if ((exists_0 == null) || (CAUGHT_forAll == null)) {
															and = null;
														}
														else {
															and = ValueUtil.TRUE_VALUE;
														}
													}
												}
												CAUGHT_and = and;
											}
											catch (Exception e) {
												CAUGHT_and = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
												and_0 = ValueUtil.FALSE_VALUE;
											}
											else {
												if (CAUGHT_not instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_not;
												}
												if (CAUGHT_and instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_and;
												}
												if ((CAUGHT_not == null) || (CAUGHT_and == null)) {
													and_0 = null;
												}
												else {
													and_0 = ValueUtil.TRUE_VALUE;
												}
											}
										}
										CAUGHT_and_0 = and_0;
									}
									catch (Exception e) {
										CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and_2;
									if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
										and_2 = ValueUtil.FALSE_VALUE;
									}
									else {
										/*@Caught*/ Object CAUGHT_exists_1;
										try {
											final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_Relationship = idResolver.getClass(Process_modelingTables.CLSSid_Relationship, null);
											final /*@NonInvalid*/ SetValue allInstances_0 = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_Relationship, TYP_process_modeling_c_c_Relationship);
											/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_r_1 = allInstances_0.iterator();
											/*@Thrown*/ Boolean exists_1;
											while (true) {
												if (!ITERATOR_r_1.hasNext()) {
													if (accumulator_2 == null) {
														exists_1 = null;
													}
													else if (accumulator_2 == ValueUtil.FALSE_VALUE) {
														exists_1 = ValueUtil.FALSE_VALUE;
													}
													else {
														throw (InvalidValueException)accumulator_2;
													}
													break;
												}
												/*@NonInvalid*/ Relationship r_1 = (Relationship)ITERATOR_r_1.next();
												/**
												 * r.source.id = ps.id and r.type = ERelationshipType::FLOW
												 */
												final /*@NonInvalid*/ ProcessElement source = r_1.getSource();
												final /*@NonInvalid*/ String id = source.getId();
												final /*@NonInvalid*/ String id_0 = ps.getId();
												final /*@NonInvalid*/ boolean eq_1 = id.equals(id_0);
												final /*@NonInvalid*/ Boolean and_1;
												if (!eq_1) {
													and_1 = ValueUtil.FALSE_VALUE;
												}
												else {
													final /*@NonInvalid*/ ERelationshipType type_0 = r_1.getType();
													final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
													final /*@NonInvalid*/ boolean eq_2 = BOXED_type_0 == Process_modelingTables.ELITid_FLOW;
													if (!eq_2) {
														and_1 = ValueUtil.FALSE_VALUE;
													}
													else {
														and_1 = ValueUtil.TRUE_VALUE;
													}
												}
												//
												if (and_1 == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
													exists_1 = ValueUtil.TRUE_VALUE;
													break;														// Stop immediately
												}
												else if (and_1 == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
													;															// Carry on
												}
												else if (and_1 == null) {								// Abnormal null body evaluation result
													if (accumulator_2 == ValueUtil.FALSE_VALUE) {
														accumulator_2 = null;										// Cache a null failure
													}
												}
												else {															// Impossible badly typed result
													accumulator_2 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
												}
											}
											CAUGHT_exists_1 = exists_1;
										}
										catch (Exception e) {
											CAUGHT_exists_1 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_exists_1 == ValueUtil.FALSE_VALUE) {
											and_2 = ValueUtil.FALSE_VALUE;
										}
										else {
											if (CAUGHT_and_0 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_and_0;
											}
											if (CAUGHT_exists_1 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_exists_1;
											}
											if ((CAUGHT_and_0 == null) || (CAUGHT_exists_1 == null)) {
												and_2 = null;
											}
											else {
												and_2 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									CAUGHT_and_2 = and_2;
								}
								catch (Exception e) {
									CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_2 == ValueUtil.TRUE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_and_2 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and_2;
									}
									if (CAUGHT_and_2 == null) {
										implies = null;
									}
									else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies = implies;
						}
						catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_implies;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Process_modelingTables.INT_0).booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean endProcessStepHasOnlyOneLinkFrom(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ProcessStep::endProcessStepHasOnlyOneLinkFrom";
		try {
			/**
			 *
			 * inv endProcessStepHasOnlyOneLinkFrom:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ProcessStep.allInstances()
			 *         ->forAll(ps | ps.type = EProcessStepType::END implies
			 *           ps.outRelationships->size() = 0 and
			 *           ps.inRelationships->size() = 1 and
			 *           ps.inRelationships->select(r | r.type = ERelationshipType::FLOW)
			 *           ->notEmpty())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS_STEP___END_PROCESS_STEP_HAS_ONLY_ONE_LINK_FROM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_0 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep_0);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_ps = allInstances.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_ps.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ ProcessStep ps = (ProcessStep)ITERATOR_ps.next();
						/**
						 * ps.type = EProcessStepType::END implies
						 * ps.outRelationships->size() = 0 and
						 * ps.inRelationships->size() = 1 and
						 * ps.inRelationships->select(r | r.type = ERelationshipType::FLOW)
						 * ->notEmpty()
						 */
						/*@Caught*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ EProcessStepType type = ps.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_END;
							final /*@Thrown*/ Boolean implies;
							if (!eq) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_and_0;
								try {
									final /*@NonInvalid*/ List<Relationship> inRelationships_0 = ps.getInRelationships();
									final /*@NonInvalid*/ SetValue BOXED_inRelationships_0 = idResolver.createSetOfAll(Process_modelingTables.SET_CLSSid_Relationship, inRelationships_0);
									final /*@NonInvalid*/ List<Relationship> outRelationships = ps.getOutRelationships();
									final /*@NonInvalid*/ SetValue BOXED_outRelationships = idResolver.createSetOfAll(Process_modelingTables.SET_CLSSid_Relationship, outRelationships);
									final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_outRelationships);
									final /*@NonInvalid*/ boolean eq_0 = size.equals(Process_modelingTables.INT_0);
									final /*@NonInvalid*/ Boolean and;
									if (!eq_0) {
										and = ValueUtil.FALSE_VALUE;
									}
									else {
										final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_inRelationships_0);
										final /*@NonInvalid*/ boolean eq_1 = size_0.equals(Process_modelingTables.INT_1);
										if (!eq_1) {
											and = ValueUtil.FALSE_VALUE;
										}
										else {
											and = ValueUtil.TRUE_VALUE;
										}
									}
									final /*@Thrown*/ Boolean and_0;
									if (and == ValueUtil.FALSE_VALUE) {
										and_0 = ValueUtil.FALSE_VALUE;
									}
									else {
										/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(Process_modelingTables.SET_CLSSid_Relationship);
										Iterator<Object> ITERATOR_r = BOXED_inRelationships_0.iterator();
										/*@NonInvalid*/ SetValue select;
										while (true) {
											if (!ITERATOR_r.hasNext()) {
												select = accumulator_0;
												break;
											}
											/*@NonInvalid*/ Relationship r = (Relationship)ITERATOR_r.next();
											/**
											 * r.type = ERelationshipType::FLOW
											 */
											final /*@NonInvalid*/ ERelationshipType type_0 = r.getType();
											final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
											final /*@NonInvalid*/ boolean eq_2 = BOXED_type_0 == Process_modelingTables.ELITid_FLOW;
											//
											if (eq_2) {
												accumulator_0.add(r);
											}
										}
										final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(select).booleanValue();
										if (!notEmpty) {
											and_0 = ValueUtil.FALSE_VALUE;
										}
										else {
											if (and == null) {
												and_0 = null;
											}
											else {
												and_0 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									CAUGHT_and_0 = and_0;
								}
								catch (Exception e) {
									CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and_0;
									}
									if (CAUGHT_and_0 == null) {
										implies = null;
									}
									else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies = implies;
						}
						catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_implies;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Process_modelingTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.PROCESS_STEP__CAPABILITY:
				return basicSetCapability(null, msgs);
			case Process_modelingPackage.PROCESS_STEP__IN_PRODUCTS:
				return ((InternalEList<?>)getInProducts()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.PROCESS_STEP__OUT_PRODUCTS:
				return ((InternalEList<?>)getOutProducts()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.PROCESS_STEP__RESOURCE:
				return basicSetResource(null, msgs);
			case Process_modelingPackage.PROCESS_STEP__ERRORS:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION:
				return basicSetContractualObligation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Process_modelingPackage.PROCESS_STEP__TYPE:
				return getType();
			case Process_modelingPackage.PROCESS_STEP__NOTATION:
				return getNotation();
			case Process_modelingPackage.PROCESS_STEP__CAPABILITY:
				return getCapability();
			case Process_modelingPackage.PROCESS_STEP__IN_PRODUCTS:
				return getInProducts();
			case Process_modelingPackage.PROCESS_STEP__OUT_PRODUCTS:
				return getOutProducts();
			case Process_modelingPackage.PROCESS_STEP__DESCRIPTION:
				return getDescription();
			case Process_modelingPackage.PROCESS_STEP__RESOURCE:
				return getResource();
			case Process_modelingPackage.PROCESS_STEP__ACCEPTANCE_CRITERION:
				return getAcceptanceCriterion();
			case Process_modelingPackage.PROCESS_STEP__COMPLETION_CRITERION:
				return getCompletionCriterion();
			case Process_modelingPackage.PROCESS_STEP__ERRORS:
				return getErrors();
			case Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION:
				return getContractualObligation();
			case Process_modelingPackage.PROCESS_STEP__RELATED_INTERFACE_PROCESS:
				if (resolve) return getRelatedInterfaceProcess();
				return basicGetRelatedInterfaceProcess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Process_modelingPackage.PROCESS_STEP__TYPE:
				setType((EProcessStepType)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__NOTATION:
				setNotation((EProcessStepNotation)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__CAPABILITY:
				setCapability((Capability)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__IN_PRODUCTS:
				getInProducts().clear();
				getInProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__OUT_PRODUCTS:
				getOutProducts().clear();
				getOutProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__RESOURCE:
				setResource((Resource)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__ACCEPTANCE_CRITERION:
				setAcceptanceCriterion((String)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__COMPLETION_CRITERION:
				setCompletionCriterion((String)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends process_modeling.Error>)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION:
				setContractualObligation((ContractualObligation)newValue);
				return;
			case Process_modelingPackage.PROCESS_STEP__RELATED_INTERFACE_PROCESS:
				setRelatedInterfaceProcess((process_modeling.Process)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Process_modelingPackage.PROCESS_STEP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_STEP__NOTATION:
				setNotation(NOTATION_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_STEP__CAPABILITY:
				setCapability((Capability)null);
				return;
			case Process_modelingPackage.PROCESS_STEP__IN_PRODUCTS:
				getInProducts().clear();
				return;
			case Process_modelingPackage.PROCESS_STEP__OUT_PRODUCTS:
				getOutProducts().clear();
				return;
			case Process_modelingPackage.PROCESS_STEP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_STEP__RESOURCE:
				setResource((Resource)null);
				return;
			case Process_modelingPackage.PROCESS_STEP__ACCEPTANCE_CRITERION:
				setAcceptanceCriterion(ACCEPTANCE_CRITERION_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_STEP__COMPLETION_CRITERION:
				setCompletionCriterion(COMPLETION_CRITERION_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_STEP__ERRORS:
				getErrors().clear();
				return;
			case Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION:
				setContractualObligation((ContractualObligation)null);
				return;
			case Process_modelingPackage.PROCESS_STEP__RELATED_INTERFACE_PROCESS:
				setRelatedInterfaceProcess((process_modeling.Process)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Process_modelingPackage.PROCESS_STEP__TYPE:
				return type != TYPE_EDEFAULT;
			case Process_modelingPackage.PROCESS_STEP__NOTATION:
				return notation != NOTATION_EDEFAULT;
			case Process_modelingPackage.PROCESS_STEP__CAPABILITY:
				return capability != null;
			case Process_modelingPackage.PROCESS_STEP__IN_PRODUCTS:
				return inProducts != null && !inProducts.isEmpty();
			case Process_modelingPackage.PROCESS_STEP__OUT_PRODUCTS:
				return outProducts != null && !outProducts.isEmpty();
			case Process_modelingPackage.PROCESS_STEP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Process_modelingPackage.PROCESS_STEP__RESOURCE:
				return resource != null;
			case Process_modelingPackage.PROCESS_STEP__ACCEPTANCE_CRITERION:
				return ACCEPTANCE_CRITERION_EDEFAULT == null ? acceptanceCriterion != null : !ACCEPTANCE_CRITERION_EDEFAULT.equals(acceptanceCriterion);
			case Process_modelingPackage.PROCESS_STEP__COMPLETION_CRITERION:
				return COMPLETION_CRITERION_EDEFAULT == null ? completionCriterion != null : !COMPLETION_CRITERION_EDEFAULT.equals(completionCriterion);
			case Process_modelingPackage.PROCESS_STEP__ERRORS:
				return errors != null && !errors.isEmpty();
			case Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION:
				return contractualObligation != null;
			case Process_modelingPackage.PROCESS_STEP__RELATED_INTERFACE_PROCESS:
				return relatedInterfaceProcess != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Process_modelingPackage.PROCESS_STEP___START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO__DIAGNOSTICCHAIN_MAP:
				return startProcessStepHasOnlyOneLinkTo((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.PROCESS_STEP___ONLY_ONE_FLOW_RELATION_PROCESS_STEP__DIAGNOSTICCHAIN_MAP:
				return onlyOneFlowRelationProcessStep((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.PROCESS_STEP___START_PROCESS_STEP_HAS_ONLY_ONE_LINK_TO2__DIAGNOSTICCHAIN_MAP:
				return startProcessStepHasOnlyOneLinkTo2((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.PROCESS_STEP___END_PROCESS_STEP_HAS_ONLY_ONE_LINK_FROM__DIAGNOSTICCHAIN_MAP:
				return endProcessStepHasOnlyOneLinkFrom((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", notation: ");
		result.append(notation);
		result.append(", description: ");
		result.append(description);
		result.append(", acceptanceCriterion: ");
		result.append(acceptanceCriterion);
		result.append(", completionCriterion: ");
		result.append(completionCriterion);
		result.append(')');
		return result.toString();
	}

} //ProcessStepImpl
