/**
 */
package process_modeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import process_modeling.EProcessElementObligationsFulfilled;
import process_modeling.EProcessElementStatus;
import process_modeling.ProcessElement;
import process_modeling.Process_modelingPackage;
import process_modeling.Relationship;
import process_modeling.Traceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#isIsTraced <em>Is Traced</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#isLogStartTime <em>Log Start Time</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#isLogEndTime <em>Log End Time</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#getInRelationships <em>In Relationships</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#getOutRelationships <em>Out Relationships</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#isIsErrorGroup <em>Is Error Group</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#getObligationsFulfilled <em>Obligations Fulfilled</em>}</li>
 *   <li>{@link process_modeling.impl.ProcessElementImpl#getRelatedDltContent <em>Related Dlt Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessElementImpl extends IDNamedElementImpl implements ProcessElement {
	/**
	 * The default value of the '{@link #isIsTraced() <em>Is Traced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTraced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRACED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTraced() <em>Is Traced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTraced()
	 * @generated
	 * @ordered
	 */
	protected boolean isTraced = IS_TRACED_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogStartTime() <em>Log Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_START_TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogStartTime() <em>Log Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogStartTime()
	 * @generated
	 * @ordered
	 */
	protected boolean logStartTime = LOG_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogEndTime() <em>Log End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_END_TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogEndTime() <em>Log End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogEndTime()
	 * @generated
	 * @ordered
	 */
	protected boolean logEndTime = LOG_END_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInRelationships() <em>In Relationships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> inRelationships;

	/**
	 * The cached value of the '{@link #getOutRelationships() <em>Out Relationships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> outRelationships;

	/**
	 * The default value of the '{@link #isIsErrorGroup() <em>Is Error Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsErrorGroup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ERROR_GROUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsErrorGroup() <em>Is Error Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsErrorGroup()
	 * @generated
	 * @ordered
	 */
	protected boolean isErrorGroup = IS_ERROR_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EProcessElementStatus STATUS_EDEFAULT = EProcessElementStatus.INACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EProcessElementStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getObligationsFulfilled() <em>Obligations Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationsFulfilled()
	 * @generated
	 * @ordered
	 */
	protected static final EProcessElementObligationsFulfilled OBLIGATIONS_FULFILLED_EDEFAULT = EProcessElementObligationsFulfilled.TRUE;

	/**
	 * The cached value of the '{@link #getObligationsFulfilled() <em>Obligations Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationsFulfilled()
	 * @generated
	 * @ordered
	 */
	protected EProcessElementObligationsFulfilled obligationsFulfilled = OBLIGATIONS_FULFILLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelatedDltContent() <em>Related Dlt Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDltContent()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATED_DLT_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedDltContent() <em>Related Dlt Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDltContent()
	 * @generated
	 * @ordered
	 */
	protected String relatedDltContent = RELATED_DLT_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.PROCESS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTraced() {
		return isTraced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTraced(boolean newIsTraced) {
		boolean oldIsTraced = isTraced;
		isTraced = newIsTraced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_ELEMENT__IS_TRACED, oldIsTraced, isTraced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogStartTime() {
		return logStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogStartTime(boolean newLogStartTime) {
		boolean oldLogStartTime = logStartTime;
		logStartTime = newLogStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_ELEMENT__LOG_START_TIME, oldLogStartTime, logStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogEndTime() {
		return logEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogEndTime(boolean newLogEndTime) {
		boolean oldLogEndTime = logEndTime;
		logEndTime = newLogEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_ELEMENT__LOG_END_TIME, oldLogEndTime, logEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getInRelationships() {
		if (inRelationships == null) {
			inRelationships = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS, Process_modelingPackage.RELATIONSHIP__TARGET);
		}
		return inRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getOutRelationships() {
		if (outRelationships == null) {
			outRelationships = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS, Process_modelingPackage.RELATIONSHIP__SOURCE);
		}
		return outRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsErrorGroup() {
		return isErrorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsErrorGroup(boolean newIsErrorGroup) {
		boolean oldIsErrorGroup = isErrorGroup;
		isErrorGroup = newIsErrorGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_ELEMENT__IS_ERROR_GROUP, oldIsErrorGroup, isErrorGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessElementStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EProcessElementStatus newStatus) {
		EProcessElementStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_ELEMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcessElementObligationsFulfilled getObligationsFulfilled() {
		return obligationsFulfilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligationsFulfilled(EProcessElementObligationsFulfilled newObligationsFulfilled) {
		EProcessElementObligationsFulfilled oldObligationsFulfilled = obligationsFulfilled;
		obligationsFulfilled = newObligationsFulfilled == null ? OBLIGATIONS_FULFILLED_EDEFAULT : newObligationsFulfilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_ELEMENT__OBLIGATIONS_FULFILLED, oldObligationsFulfilled, obligationsFulfilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelatedDltContent() {
		return relatedDltContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedDltContent(String newRelatedDltContent) {
		String oldRelatedDltContent = relatedDltContent;
		relatedDltContent = newRelatedDltContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PROCESS_ELEMENT__RELATED_DLT_CONTENT, oldRelatedDltContent, relatedDltContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInRelationships()).basicAdd(otherEnd, msgs);
			case Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutRelationships()).basicAdd(otherEnd, msgs);
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
			case Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS:
				return ((InternalEList<?>)getInRelationships()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS:
				return ((InternalEList<?>)getOutRelationships()).basicRemove(otherEnd, msgs);
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
			case Process_modelingPackage.PROCESS_ELEMENT__IS_TRACED:
				return isIsTraced();
			case Process_modelingPackage.PROCESS_ELEMENT__LOG_START_TIME:
				return isLogStartTime();
			case Process_modelingPackage.PROCESS_ELEMENT__LOG_END_TIME:
				return isLogEndTime();
			case Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS:
				return getInRelationships();
			case Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS:
				return getOutRelationships();
			case Process_modelingPackage.PROCESS_ELEMENT__IS_ERROR_GROUP:
				return isIsErrorGroup();
			case Process_modelingPackage.PROCESS_ELEMENT__STATUS:
				return getStatus();
			case Process_modelingPackage.PROCESS_ELEMENT__OBLIGATIONS_FULFILLED:
				return getObligationsFulfilled();
			case Process_modelingPackage.PROCESS_ELEMENT__RELATED_DLT_CONTENT:
				return getRelatedDltContent();
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
			case Process_modelingPackage.PROCESS_ELEMENT__IS_TRACED:
				setIsTraced((Boolean)newValue);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__LOG_START_TIME:
				setLogStartTime((Boolean)newValue);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__LOG_END_TIME:
				setLogEndTime((Boolean)newValue);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS:
				getInRelationships().clear();
				getInRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS:
				getOutRelationships().clear();
				getOutRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__IS_ERROR_GROUP:
				setIsErrorGroup((Boolean)newValue);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__STATUS:
				setStatus((EProcessElementStatus)newValue);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__OBLIGATIONS_FULFILLED:
				setObligationsFulfilled((EProcessElementObligationsFulfilled)newValue);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__RELATED_DLT_CONTENT:
				setRelatedDltContent((String)newValue);
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
			case Process_modelingPackage.PROCESS_ELEMENT__IS_TRACED:
				setIsTraced(IS_TRACED_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__LOG_START_TIME:
				setLogStartTime(LOG_START_TIME_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__LOG_END_TIME:
				setLogEndTime(LOG_END_TIME_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS:
				getInRelationships().clear();
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS:
				getOutRelationships().clear();
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__IS_ERROR_GROUP:
				setIsErrorGroup(IS_ERROR_GROUP_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__OBLIGATIONS_FULFILLED:
				setObligationsFulfilled(OBLIGATIONS_FULFILLED_EDEFAULT);
				return;
			case Process_modelingPackage.PROCESS_ELEMENT__RELATED_DLT_CONTENT:
				setRelatedDltContent(RELATED_DLT_CONTENT_EDEFAULT);
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
			case Process_modelingPackage.PROCESS_ELEMENT__IS_TRACED:
				return isTraced != IS_TRACED_EDEFAULT;
			case Process_modelingPackage.PROCESS_ELEMENT__LOG_START_TIME:
				return logStartTime != LOG_START_TIME_EDEFAULT;
			case Process_modelingPackage.PROCESS_ELEMENT__LOG_END_TIME:
				return logEndTime != LOG_END_TIME_EDEFAULT;
			case Process_modelingPackage.PROCESS_ELEMENT__IN_RELATIONSHIPS:
				return inRelationships != null && !inRelationships.isEmpty();
			case Process_modelingPackage.PROCESS_ELEMENT__OUT_RELATIONSHIPS:
				return outRelationships != null && !outRelationships.isEmpty();
			case Process_modelingPackage.PROCESS_ELEMENT__IS_ERROR_GROUP:
				return isErrorGroup != IS_ERROR_GROUP_EDEFAULT;
			case Process_modelingPackage.PROCESS_ELEMENT__STATUS:
				return status != STATUS_EDEFAULT;
			case Process_modelingPackage.PROCESS_ELEMENT__OBLIGATIONS_FULFILLED:
				return obligationsFulfilled != OBLIGATIONS_FULFILLED_EDEFAULT;
			case Process_modelingPackage.PROCESS_ELEMENT__RELATED_DLT_CONTENT:
				return RELATED_DLT_CONTENT_EDEFAULT == null ? relatedDltContent != null : !RELATED_DLT_CONTENT_EDEFAULT.equals(relatedDltContent);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Traceable.class) {
			switch (derivedFeatureID) {
				case Process_modelingPackage.PROCESS_ELEMENT__IS_TRACED: return Process_modelingPackage.TRACEABLE__IS_TRACED;
				case Process_modelingPackage.PROCESS_ELEMENT__LOG_START_TIME: return Process_modelingPackage.TRACEABLE__LOG_START_TIME;
				case Process_modelingPackage.PROCESS_ELEMENT__LOG_END_TIME: return Process_modelingPackage.TRACEABLE__LOG_END_TIME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Traceable.class) {
			switch (baseFeatureID) {
				case Process_modelingPackage.TRACEABLE__IS_TRACED: return Process_modelingPackage.PROCESS_ELEMENT__IS_TRACED;
				case Process_modelingPackage.TRACEABLE__LOG_START_TIME: return Process_modelingPackage.PROCESS_ELEMENT__LOG_START_TIME;
				case Process_modelingPackage.TRACEABLE__LOG_END_TIME: return Process_modelingPackage.PROCESS_ELEMENT__LOG_END_TIME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isTraced: ");
		result.append(isTraced);
		result.append(", logStartTime: ");
		result.append(logStartTime);
		result.append(", logEndTime: ");
		result.append(logEndTime);
		result.append(", isErrorGroup: ");
		result.append(isErrorGroup);
		result.append(", status: ");
		result.append(status);
		result.append(", obligationsFulfilled: ");
		result.append(obligationsFulfilled);
		result.append(", relatedDltContent: ");
		result.append(relatedDltContent);
		result.append(')');
		return result.toString();
	}

} //ProcessElementImpl
