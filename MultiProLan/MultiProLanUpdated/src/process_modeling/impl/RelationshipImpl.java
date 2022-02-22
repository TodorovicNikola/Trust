/**
 */
package process_modeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import process_modeling.ERelationshipType;
import process_modeling.ProcessElement;
import process_modeling.Process_modelingPackage;
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
	@Override
	public ERelationshipType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getLogicalCondition() {
		return logicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
