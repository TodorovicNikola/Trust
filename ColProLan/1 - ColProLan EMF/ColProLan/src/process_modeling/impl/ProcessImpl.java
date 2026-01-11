/**
 */
package process_modeling.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
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

import process_modeling.EProcessStepType;
import process_modeling.ProcessElement;
import process_modeling.ProcessParameter;
import process_modeling.ProcessStep;
import process_modeling.Process_modelingPackage;
import process_modeling.Process_modelingTables;
import process_modeling.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ProcessImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#getStartStep <em>Start Step</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#getUnidentifiedErrorHandler <em>Unidentified Error Handler</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#isProposedProcess <em>Proposed Process</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#getDate <em>Date</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends IDNamedElementImpl implements process_modeling.Process {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessElement> elements;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getStartStep() <em>Start Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStep()
	 * @generated
	 * @ordered
	 */
	protected ProcessStep startStep;

	/**
	 * The cached value of the '{@link #getUnidentifiedErrorHandler() <em>Unidentified Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidentifiedErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected process_modeling.Process unidentifiedErrorHandler;

	/**
	 * The default value of the '{@link #isProposedProcess() <em>Proposed Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProposedProcess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROPOSED_PROCESS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isProposedProcess() <em>Proposed Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProposedProcess()
	 * @generated
	 * @ordered
	 */
	protected boolean proposedProcess = PROPOSED_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected String company = COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ProcessElement>(ProcessElement.class, this, Process_modelingPackage.PROCESS__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, Process_modelingPackage.PROCESS__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStep getStartStep() {
		if (startStep != null && startStep.eIsProxy()) {
			InternalEObject oldStartStep = (InternalEObject)startStep;
			startStep = (ProcessStep)eResolveProxy(oldStartStep);
			if (startStep != oldStartStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Process_modelingPackage.PROCESS__START_STEP, oldStartStep, startStep));
			}
		}
		return startStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStep basicGetStartStep() {
		return startStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartStep(ProcessStep newStartStep) {
		ProcessStep oldStartStep = startStep;
		startStep = newStartStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS__START_STEP, oldStartStep, startStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process_modeling.Process getUnidentifiedErrorHandler() {
		if (unidentifiedErrorHandler != null && unidentifiedErrorHandler.eIsProxy()) {
			InternalEObject oldUnidentifiedErrorHandler = (InternalEObject)unidentifiedErrorHandler;
			unidentifiedErrorHandler = (process_modeling.Process)eResolveProxy(oldUnidentifiedErrorHandler);
			if (unidentifiedErrorHandler != oldUnidentifiedErrorHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Process_modelingPackage.PROCESS__UNIDENTIFIED_ERROR_HANDLER, oldUnidentifiedErrorHandler, unidentifiedErrorHandler));
			}
		}
		return unidentifiedErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process_modeling.Process basicGetUnidentifiedErrorHandler() {
		return unidentifiedErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidentifiedErrorHandler(process_modeling.Process newUnidentifiedErrorHandler) {
		process_modeling.Process oldUnidentifiedErrorHandler = unidentifiedErrorHandler;
		unidentifiedErrorHandler = newUnidentifiedErrorHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS__UNIDENTIFIED_ERROR_HANDLER, oldUnidentifiedErrorHandler, unidentifiedErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProposedProcess() {
		return proposedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedProcess(boolean newProposedProcess) {
		boolean oldProposedProcess = proposedProcess;
		proposedProcess = newProposedProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS__PROPOSED_PROCESS, oldProposedProcess, proposedProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(String newCompany) {
		String oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ProcessParameter>(ProcessParameter.class, this, Process_modelingPackage.PROCESS__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustExistsEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Process::mustExistsEnd";
		try {
			/**
			 *
			 * inv mustExistsEnd:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ProcessStep.allInstances()
			 *         ->exists(ps | ps.type = EProcessStepType::END)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS___MUST_EXISTS_END__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_0 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep_0);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_ps = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_ps.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ ProcessStep ps = (ProcessStep)ITERATOR_ps.next();
					/**
					 * ps.type = EProcessStepType::END
					 */
					final /*@NonInvalid*/ EProcessStepType type = ps.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_END;
					//
					if (eq) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (!eq) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Process_modelingTables.INT_0).booleanValue();
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
	public boolean oneEndProcessStep(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Process::oneEndProcessStep";
		try {
			/**
			 *
			 * inv oneEndProcessStep:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ProcessStep.allInstances()
			 *         ->forAll(ps1, ps2 | ps1.type = EProcessStepType::END and ps2.type = EProcessStepType::END implies ps1 = ps2)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS___ONE_END_PROCESS_STEP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_0 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep_0);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, allInstances);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * ps1.type = EProcessStepType::END and ps2.type = EProcessStepType::END implies ps1 = ps2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue allInstances = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object ps1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object ps2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ ProcessStep local_2 = (ProcessStep)ps1;
								final /*@NonInvalid*/ ProcessStep local_3 = (ProcessStep)ps2;
								/*@Caught*/ Object CAUGHT_and;
								try {
									/*@Caught*/ Object CAUGHT_eq;
									try {
										if (local_2 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::ProcessStep::type\'");
										}
										final /*@Thrown*/ EProcessStepType type = local_2.getType();
										final /*@Thrown*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
										final /*@Thrown*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_END;
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
												throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::ProcessStep::type\'");
											}
											final /*@Thrown*/ EProcessStepType type_0 = local_3.getType();
											final /*@Thrown*/ EnumerationLiteralId BOXED_type_0 = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
											final /*@Thrown*/ boolean eq_0 = BOXED_type_0 == Process_modelingTables.ELITid_END;
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
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, allInstances, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Process_modelingTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
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
	public boolean oneStartProcessStep2(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Process::oneStartProcessStep2";
		try {
			/**
			 *
			 * inv oneStartProcessStep2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not ProcessStep.allInstances()
			 *         ->exists(ps1, ps2 |
			 *           (ps1.type = EProcessStepType::START and ps2.type = EProcessStepType::START and ps1 <> ps2
			 *           ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS___ONE_START_PROCESS_STEP2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_0 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep_0);
						final org.eclipse.ocl.pivot.Class TYPE_exists_0 = executor.getStaticTypeOfValue(null, allInstances);
						final LibraryIterationExtension IMPL_exists_0 = (LibraryIterationExtension)TYPE_exists_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_exists);
						final /*@NonNull*/ Object ACC_exists_0 = IMPL_exists_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
						/**
						 * Implementation of the iterator body.
						 */
						final AbstractSimpleOperation BODY_exists_0 = new AbstractSimpleOperation() {
							/**
							 * ps1.type = EProcessStepType::START and ps2.type = EProcessStepType::START and ps1 <> ps2
							 */
							@Override
							public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
								final /*@NonInvalid*/ SetValue allInstances = (SetValue)sourceAndArgumentValues[0];
								final /*@NonInvalid*/ Object ps1 = sourceAndArgumentValues[1];
								final /*@NonInvalid*/ Object ps2 = sourceAndArgumentValues[2];
								/*@Caught*/ Object CAUGHT_and_0;
								try {
									final /*@NonInvalid*/ ProcessStep local_2 = (ProcessStep)ps1;
									final /*@NonInvalid*/ ProcessStep local_3 = (ProcessStep)ps2;
									/*@Caught*/ Object CAUGHT_and;
									try {
										/*@Caught*/ Object CAUGHT_eq;
										try {
											if (local_2 == null) {
												throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::ProcessStep::type\'");
											}
											final /*@Thrown*/ EProcessStepType type = local_2.getType();
											final /*@Thrown*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
											final /*@Thrown*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_START;
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
													throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::ProcessStep::type\'");
												}
												final /*@Thrown*/ EProcessStepType type_0 = local_3.getType();
												final /*@Thrown*/ EnumerationLiteralId BOXED_type_0 = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
												final /*@Thrown*/ boolean eq_0 = BOXED_type_0 == Process_modelingTables.ELITid_START;
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
									final /*@Thrown*/ Boolean and_0;
									if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
										and_0 = ValueUtil.FALSE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean ne = (local_2 != null) ? !local_2.equals(local_3) : (local_3 != null);
										if (!ne) {
											and_0 = ValueUtil.FALSE_VALUE;
										}
										else {
											if (CAUGHT_and instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_and;
											}
											if (CAUGHT_and == null) {
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
								return CAUGHT_and_0;
							}
						};
						final ExecutorMultipleIterationManager MGR_exists_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_exists_0, allInstances, ACC_exists_0);
						final /*@Thrown*/ Boolean exists = (Boolean)IMPL_exists_0.evaluateIteration(MGR_exists_0);
						CAUGHT_exists = exists;
					}
					catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_exists instanceof InvalidValueException) {
						throw (InvalidValueException)CAUGHT_exists;
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							result = null;
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Process_modelingTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
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
	public boolean mustExistsStart(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Process::mustExistsStart";
		try {
			/**
			 *
			 * inv mustExistsStart:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ProcessStep.allInstances()
			 *         ->exists(ps | ps.type = EProcessStepType::START)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS___MUST_EXISTS_START__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_0 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep_0);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_ps = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_ps.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ ProcessStep ps = (ProcessStep)ITERATOR_ps.next();
					/**
					 * ps.type = EProcessStepType::START
					 */
					final /*@NonInvalid*/ EProcessStepType type = ps.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_START;
					//
					if (eq) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (!eq) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Process_modelingTables.INT_0).booleanValue();
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
	public boolean oneStartProcessStep(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Process::oneStartProcessStep";
		try {
			/**
			 *
			 * inv oneStartProcessStep:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ProcessStep.allInstances()
			 *         ->forAll(ps1, ps2 | ps1.type = EProcessStepType::START and ps2.type = EProcessStepType::START implies ps1 = ps2)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.PROCESS___ONE_START_PROCESS_STEP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_ProcessStep, TYP_process_modeling_c_c_ProcessStep);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, allInstances);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * ps1.type = EProcessStepType::START and ps2.type = EProcessStepType::START implies ps1 = ps2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue allInstances = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object ps1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object ps2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ ProcessStep local_2 = (ProcessStep)ps1;
								final /*@NonInvalid*/ ProcessStep local_3 = (ProcessStep)ps2;
								/*@Caught*/ Object CAUGHT_and;
								try {
									/*@Caught*/ Object CAUGHT_eq;
									try {
										if (local_2 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::ProcessStep::type\'");
										}
										final /*@Thrown*/ EProcessStepType type = local_2.getType();
										final /*@Thrown*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
										final /*@Thrown*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_START;
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
												throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::ProcessStep::type\'");
											}
											final /*@Thrown*/ EProcessStepType type_0 = local_3.getType();
											final /*@Thrown*/ EnumerationLiteralId BOXED_type_0 = Process_modelingTables.ENUMid_EProcessStepType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
											final /*@Thrown*/ boolean eq_0 = BOXED_type_0 == Process_modelingTables.ELITid_START;
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
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, allInstances, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Process_modelingTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
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
			case Process_modelingPackage.PROCESS__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.PROCESS__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.PROCESS__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case Process_modelingPackage.PROCESS__VERSION:
				return getVersion();
			case Process_modelingPackage.PROCESS__ELEMENTS:
				return getElements();
			case Process_modelingPackage.PROCESS__RELATIONSHIPS:
				return getRelationships();
			case Process_modelingPackage.PROCESS__START_STEP:
				if (resolve) return getStartStep();
				return basicGetStartStep();
			case Process_modelingPackage.PROCESS__UNIDENTIFIED_ERROR_HANDLER:
				if (resolve) return getUnidentifiedErrorHandler();
				return basicGetUnidentifiedErrorHandler();
			case Process_modelingPackage.PROCESS__PROPOSED_PROCESS:
				return isProposedProcess();
			case Process_modelingPackage.PROCESS__COMPANY:
				return getCompany();
			case Process_modelingPackage.PROCESS__AUTHOR:
				return getAuthor();
			case Process_modelingPackage.PROCESS__DATE:
				return getDate();
			case Process_modelingPackage.PROCESS__PARAMETERS:
				return getParameters();
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
			case Process_modelingPackage.PROCESS__VERSION:
				setVersion((Integer)newValue);
				return;
			case Process_modelingPackage.PROCESS__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ProcessElement>)newValue);
				return;
			case Process_modelingPackage.PROCESS__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case Process_modelingPackage.PROCESS__START_STEP:
				setStartStep((ProcessStep)newValue);
				return;
			case Process_modelingPackage.PROCESS__UNIDENTIFIED_ERROR_HANDLER:
				setUnidentifiedErrorHandler((process_modeling.Process)newValue);
				return;
			case Process_modelingPackage.PROCESS__PROPOSED_PROCESS:
				setProposedProcess((Boolean)newValue);
				return;
			case Process_modelingPackage.PROCESS__COMPANY:
				setCompany((String)newValue);
				return;
			case Process_modelingPackage.PROCESS__AUTHOR:
				setAuthor((String)newValue);
				return;
			case Process_modelingPackage.PROCESS__DATE:
				setDate((String)newValue);
				return;
			case Process_modelingPackage.PROCESS__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ProcessParameter>)newValue);
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
			case Process_modelingPackage.PROCESS__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS__ELEMENTS:
				getElements().clear();
				return;
			case Process_modelingPackage.PROCESS__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case Process_modelingPackage.PROCESS__START_STEP:
				setStartStep((ProcessStep)null);
				return;
			case Process_modelingPackage.PROCESS__UNIDENTIFIED_ERROR_HANDLER:
				setUnidentifiedErrorHandler((process_modeling.Process)null);
				return;
			case Process_modelingPackage.PROCESS__PROPOSED_PROCESS:
				setProposedProcess(PROPOSED_PROCESS_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS__COMPANY:
				setCompany(COMPANY_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS__PARAMETERS:
				getParameters().clear();
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
			case Process_modelingPackage.PROCESS__VERSION:
				return version != VERSION_EDEFAULT;
			case Process_modelingPackage.PROCESS__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case Process_modelingPackage.PROCESS__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case Process_modelingPackage.PROCESS__START_STEP:
				return startStep != null;
			case Process_modelingPackage.PROCESS__UNIDENTIFIED_ERROR_HANDLER:
				return unidentifiedErrorHandler != null;
			case Process_modelingPackage.PROCESS__PROPOSED_PROCESS:
				return proposedProcess != PROPOSED_PROCESS_EDEFAULT;
			case Process_modelingPackage.PROCESS__COMPANY:
				return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
			case Process_modelingPackage.PROCESS__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case Process_modelingPackage.PROCESS__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case Process_modelingPackage.PROCESS__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
			case Process_modelingPackage.PROCESS___MUST_EXISTS_END__DIAGNOSTICCHAIN_MAP:
				return mustExistsEnd((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.PROCESS___ONE_END_PROCESS_STEP__DIAGNOSTICCHAIN_MAP:
				return oneEndProcessStep((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.PROCESS___ONE_START_PROCESS_STEP2__DIAGNOSTICCHAIN_MAP:
				return oneStartProcessStep2((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.PROCESS___MUST_EXISTS_START__DIAGNOSTICCHAIN_MAP:
				return mustExistsStart((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.PROCESS___ONE_START_PROCESS_STEP__DIAGNOSTICCHAIN_MAP:
				return oneStartProcessStep((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (version: ");
		result.append(version);
		result.append(", proposedProcess: ");
		result.append(proposedProcess);
		result.append(", company: ");
		result.append(company);
		result.append(", author: ");
		result.append(author);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
