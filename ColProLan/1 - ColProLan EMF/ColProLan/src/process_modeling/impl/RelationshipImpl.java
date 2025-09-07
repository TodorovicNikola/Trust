/**
 */
package process_modeling.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
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

import process_modeling.ERelationshipType;
import process_modeling.ProcessElement;
import process_modeling.Process_modelingPackage;
import process_modeling.Process_modelingTables;
import process_modeling.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.RelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.impl.RelationshipImpl#getLogicalCondition <em>Logical Condition</em>}</li>
 *   <li>{@link process_modeling.impl.RelationshipImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link process_modeling.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link process_modeling.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends IDNamedElementImpl implements Relationship {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ERelationshipType TYPE_EDEFAULT = ERelationshipType.FLOW;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ERelationshipType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalCondition() <em>Logical Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGICAL_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalCondition() <em>Logical Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalCondition()
	 * @generated
	 * @ordered
	 */
	protected String logicalCondition = LOGICAL_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ProcessElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ProcessElement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERelationshipType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ERelationshipType newType) {
		ERelationshipType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RELATIONSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogicalCondition() {
		return logicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalCondition(String newLogicalCondition) {
		String oldLogicalCondition = logicalCondition;
		logicalCondition = newLogicalCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RELATIONSHIP__LOGICAL_CONDITION, oldLogicalCondition, logicalCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RELATIONSHIP__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ProcessElement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Process_modelingPackage.RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ProcessElement newSource, NotificationChain msgs) {
		ProcessElement oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RELATIONSHIP__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ProcessElement newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS, ProcessElement.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS, ProcessElement.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RELATIONSHIP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ProcessElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Process_modelingPackage.RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ProcessElement newTarget, NotificationChain msgs) {
		ProcessElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RELATIONSHIP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ProcessElement newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS, ProcessElement.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS, ProcessElement.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RELATIONSHIP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean collaborationBetweenSteps(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relationship::collaborationBetweenSteps";
		try {
			/**
			 *
			 * inv collaborationBetweenSteps:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Relationship.allInstances()
			 *         ->forAll(r | r.type = ERelationshipType::COLLABORATION implies
			 *           r.target.oclIsTypeOf(ProcessStep) and
			 *           r.source.oclIsTypeOf(ProcessStep))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.RELATIONSHIP___COLLABORATION_BETWEEN_STEPS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_Relationship_0 = idResolver.getClass(Process_modelingTables.CLSSid_Relationship, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_Relationship, TYP_process_modeling_c_c_Relationship_0);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r = allInstances.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
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
						/*@NonInvalid*/ Relationship r = (Relationship)ITERATOR_r.next();
						/**
						 * r.type = ERelationshipType::COLLABORATION implies
						 * r.target.oclIsTypeOf(ProcessStep) and
						 * r.source.oclIsTypeOf(ProcessStep)
						 */
						/*@Caught*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_1 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
							final /*@NonInvalid*/ ERelationshipType type = r.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_COLLABORATION;
							final /*@Thrown*/ Boolean implies;
							if (!eq) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ ProcessElement target = r.getTarget();
								final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, target, TYP_process_modeling_c_c_ProcessStep_1).booleanValue();
								final /*@NonInvalid*/ Boolean and;
								if (!oclIsTypeOf) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									final /*@NonInvalid*/ ProcessElement source = r.getSource();
									final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, source, TYP_process_modeling_c_c_ProcessStep_1).booleanValue();
									if (!oclIsTypeOf_0) {
										and = ValueUtil.FALSE_VALUE;
									}
									else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
								if (and == ValueUtil.TRUE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									if (and == null) {
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
	public boolean flowBetweenStepsAndGates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relationship::flowBetweenStepsAndGates";
		try {
			/**
			 *
			 * inv flowBetweenStepsAndGates:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Relationship.allInstances()
			 *         ->forAll(r | r.type = ERelationshipType::FLOW implies
			 *           (
			 *             r.target.oclIsTypeOf(ProcessStep) or
			 *             r.target.oclIsTypeOf(Gate)
			 *           ) and
			 *           (
			 *             r.source.oclIsTypeOf(ProcessStep) or
			 *             r.source.oclIsTypeOf(Gate)
			 *           ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.RELATIONSHIP___FLOW_BETWEEN_STEPS_AND_GATES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_Relationship_0 = idResolver.getClass(Process_modelingTables.CLSSid_Relationship, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_Relationship, TYP_process_modeling_c_c_Relationship_0);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r = allInstances.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
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
						/*@NonInvalid*/ Relationship r = (Relationship)ITERATOR_r.next();
						/**
						 * r.type = ERelationshipType::FLOW implies
						 * (r.target.oclIsTypeOf(ProcessStep) or r.target.oclIsTypeOf(Gate)
						 * ) and
						 * (r.source.oclIsTypeOf(ProcessStep) or r.source.oclIsTypeOf(Gate)
						 * )
						 */
						/*@Caught*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ ERelationshipType type = r.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Process_modelingTables.ENUMid_ERelationshipType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type == Process_modelingTables.ELITid_FLOW;
							final /*@Thrown*/ Boolean implies;
							if (!eq) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_and;
								try {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_Gate_0 = idResolver.getClass(Process_modelingTables.CLSSid_Gate, null);
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_ProcessStep_1 = idResolver.getClass(Process_modelingTables.CLSSid_ProcessStep, null);
									final /*@NonInvalid*/ ProcessElement source_0 = r.getSource();
									final /*@NonInvalid*/ ProcessElement target_0 = r.getTarget();
									final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, target_0, TYP_process_modeling_c_c_ProcessStep_1).booleanValue();
									final /*@NonInvalid*/ Boolean or;
									if (oclIsTypeOf) {
										or = ValueUtil.TRUE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, target_0, TYP_process_modeling_c_c_Gate_0).booleanValue();
										if (oclIsTypeOf_0) {
											or = ValueUtil.TRUE_VALUE;
										}
										else {
											or = ValueUtil.FALSE_VALUE;
										}
									}
									final /*@Thrown*/ Boolean and;
									if (or == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, source_0, TYP_process_modeling_c_c_ProcessStep_1).booleanValue();
										final /*@NonInvalid*/ Boolean or_0;
										if (oclIsTypeOf_1) {
											or_0 = ValueUtil.TRUE_VALUE;
										}
										else {
											final /*@NonInvalid*/ boolean oclIsTypeOf_2 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, source_0, TYP_process_modeling_c_c_Gate_0).booleanValue();
											if (oclIsTypeOf_2) {
												or_0 = ValueUtil.TRUE_VALUE;
											}
											else {
												or_0 = ValueUtil.FALSE_VALUE;
											}
										}
										if (or_0 == ValueUtil.FALSE_VALUE) {
											and = ValueUtil.FALSE_VALUE;
										}
										else {
											if ((or == null) || (or_0 == null)) {
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
								if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
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
	public boolean onlyOneRelationBetweenElements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Relationship::onlyOneRelationBetweenElements";
		try {
			/**
			 *
			 * inv onlyOneRelationBetweenElements:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Relationship.allInstances()
			 *         ->forAll(r1, r2 | r1.target.id = r2.target.id and r1.source.id = r2.source.id or r1.target.id = r2.source.id and r1.source.id = r2.target.id implies r1 = r2)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Process_modelingPackage.Literals.RELATIONSHIP___ONLY_ONE_RELATION_BETWEEN_ELEMENTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Process_modelingTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_10;
			if (le) {
				local_10 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_process_modeling_c_c_Relationship_0 = idResolver.getClass(Process_modelingTables.CLSSid_Relationship, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Process_modelingTables.SET_CLSSid_Relationship, TYP_process_modeling_c_c_Relationship_0);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, allInstances);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * r1.target.id = r2.target.id and r1.source.id = r2.source.id or r1.target.id = r2.source.id and r1.source.id = r2.target.id implies r1 = r2
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue allInstances = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object r1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object r2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Relationship local_8 = (Relationship)r1;
								final /*@NonInvalid*/ Relationship local_9 = (Relationship)r2;
								/*@Caught*/ Object CAUGHT_or;
								try {
									/*@Caught*/ Object CAUGHT_and;
									try {
										/*@Caught*/ Object CAUGHT_eq;
										try {
											if (local_8 == null) {
												throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::target\'");
											}
											final /*@Thrown*/ ProcessElement target = local_8.getTarget();
											final /*@Thrown*/ String id = target.getId();
											if (local_9 == null) {
												throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::target\'");
											}
											final /*@Thrown*/ ProcessElement target_0 = local_9.getTarget();
											final /*@Thrown*/ String id_0 = target_0.getId();
											final /*@Thrown*/ boolean eq = id.equals(id_0);
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
												if (local_8 == null) {
													throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::source\'");
												}
												final /*@Thrown*/ ProcessElement source = local_8.getSource();
												final /*@Thrown*/ String id_1 = source.getId();
												if (local_9 == null) {
													throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::source\'");
												}
												final /*@Thrown*/ ProcessElement source_0 = local_9.getSource();
												final /*@Thrown*/ String id_2 = source_0.getId();
												final /*@Thrown*/ boolean eq_0 = id_1.equals(id_2);
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
									final /*@Thrown*/ Boolean or;
									if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
										or = ValueUtil.TRUE_VALUE;
									}
									else {
										/*@Caught*/ Object CAUGHT_and_0;
										try {
											/*@Caught*/ Object CAUGHT_eq_1;
											try {
												if (local_8 == null) {
													throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::target\'");
												}
												final /*@Thrown*/ ProcessElement target_1 = local_8.getTarget();
												final /*@Thrown*/ String id_3 = target_1.getId();
												if (local_9 == null) {
													throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::source\'");
												}
												final /*@Thrown*/ ProcessElement source_1 = local_9.getSource();
												final /*@Thrown*/ String id_4 = source_1.getId();
												final /*@Thrown*/ boolean eq_1 = id_3.equals(id_4);
												CAUGHT_eq_1 = eq_1;
											}
											catch (Exception e) {
												CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean and_0;
											if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
												and_0 = ValueUtil.FALSE_VALUE;
											}
											else {
												/*@Caught*/ Object CAUGHT_eq_2;
												try {
													if (local_8 == null) {
														throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::source\'");
													}
													final /*@Thrown*/ ProcessElement source_2 = local_8.getSource();
													final /*@Thrown*/ String id_5 = source_2.getId();
													if (local_9 == null) {
														throw new InvalidValueException("Null source for \'\'http://www.trust40.com/process-modeling\'::Relationship::target\'");
													}
													final /*@Thrown*/ ProcessElement target_2 = local_9.getTarget();
													final /*@Thrown*/ String id_6 = target_2.getId();
													final /*@Thrown*/ boolean eq_2 = id_5.equals(id_6);
													CAUGHT_eq_2 = eq_2;
												}
												catch (Exception e) {
													CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_eq_2 == ValueUtil.FALSE_VALUE) {
													and_0 = ValueUtil.FALSE_VALUE;
												}
												else {
													if (CAUGHT_eq_1 instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_eq_1;
													}
													if (CAUGHT_eq_2 instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_eq_2;
													}
													and_0 = ValueUtil.TRUE_VALUE;
												}
											}
											CAUGHT_and_0 = and_0;
										}
										catch (Exception e) {
											CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
											or = ValueUtil.TRUE_VALUE;
										}
										else {
											if (CAUGHT_and instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_and;
											}
											if (CAUGHT_and_0 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_and_0;
											}
											if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
												or = null;
											}
											else {
												or = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_or = or;
								}
								catch (Exception e) {
									CAUGHT_or = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean implies;
								if (CAUGHT_or == ValueUtil.FALSE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean eq_3 = (local_8 != null) ? local_8.equals(local_9) : (local_9 == null);
									if (eq_3) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_or instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_or;
										}
										if (CAUGHT_or == null) {
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
				local_10 = logDiagnostic;
			}
			return local_10;
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.RELATIONSHIP__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS, ProcessElement.class, msgs);
				return basicSetSource((ProcessElement)otherEnd, msgs);
			case Process_modelingPackage.RELATIONSHIP__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS, ProcessElement.class, msgs);
				return basicSetTarget((ProcessElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.RELATIONSHIP__SOURCE:
				return basicSetSource(null, msgs);
			case Process_modelingPackage.RELATIONSHIP__TARGET:
				return basicSetTarget(null, msgs);
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
			case Process_modelingPackage.RELATIONSHIP__TYPE:
				return getType();
			case Process_modelingPackage.RELATIONSHIP__LOGICAL_CONDITION:
				return getLogicalCondition();
			case Process_modelingPackage.RELATIONSHIP__MESSAGE:
				return getMessage();
			case Process_modelingPackage.RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Process_modelingPackage.RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Process_modelingPackage.RELATIONSHIP__TYPE:
				setType((ERelationshipType)newValue);
				return;
			case Process_modelingPackage.RELATIONSHIP__LOGICAL_CONDITION:
				setLogicalCondition((String)newValue);
				return;
			case Process_modelingPackage.RELATIONSHIP__MESSAGE:
				setMessage((String)newValue);
				return;
			case Process_modelingPackage.RELATIONSHIP__SOURCE:
				setSource((ProcessElement)newValue);
				return;
			case Process_modelingPackage.RELATIONSHIP__TARGET:
				setTarget((ProcessElement)newValue);
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
			case Process_modelingPackage.RELATIONSHIP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.RELATIONSHIP__LOGICAL_CONDITION:
				setLogicalCondition(LOGICAL_CONDITION_EDEFAULT);
				return;
			case Process_modelingPackage.RELATIONSHIP__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case Process_modelingPackage.RELATIONSHIP__SOURCE:
				setSource((ProcessElement)null);
				return;
			case Process_modelingPackage.RELATIONSHIP__TARGET:
				setTarget((ProcessElement)null);
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
			case Process_modelingPackage.RELATIONSHIP__TYPE:
				return type != TYPE_EDEFAULT;
			case Process_modelingPackage.RELATIONSHIP__LOGICAL_CONDITION:
				return LOGICAL_CONDITION_EDEFAULT == null ? logicalCondition != null : !LOGICAL_CONDITION_EDEFAULT.equals(logicalCondition);
			case Process_modelingPackage.RELATIONSHIP__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case Process_modelingPackage.RELATIONSHIP__SOURCE:
				return source != null;
			case Process_modelingPackage.RELATIONSHIP__TARGET:
				return target != null;
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
			case Process_modelingPackage.RELATIONSHIP___COLLABORATION_BETWEEN_STEPS__DIAGNOSTICCHAIN_MAP:
				return collaborationBetweenSteps((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.RELATIONSHIP___FLOW_BETWEEN_STEPS_AND_GATES__DIAGNOSTICCHAIN_MAP:
				return flowBetweenStepsAndGates((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Process_modelingPackage.RELATIONSHIP___ONLY_ONE_RELATION_BETWEEN_ELEMENTS__DIAGNOSTICCHAIN_MAP:
				return onlyOneRelationBetweenElements((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", logicalCondition: ");
		result.append(logicalCondition);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
