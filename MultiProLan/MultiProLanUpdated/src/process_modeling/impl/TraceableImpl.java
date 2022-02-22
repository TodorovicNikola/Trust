/**
 */
package process_modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import process_modeling.Process_modelingPackage;
import process_modeling.Traceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.TraceableImpl#isIsTraced <em>Is Traced</em>}</li>
 *   <li>{@link process_modeling.impl.TraceableImpl#isLogStartTime <em>Log Start Time</em>}</li>
 *   <li>{@link process_modeling.impl.TraceableImpl#isLogEndTime <em>Log End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceableImpl extends MinimalEObjectImpl.Container implements Traceable {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.TRACEABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTraced() {
		return isTraced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTraced(boolean newIsTraced) {
		boolean oldIsTraced = isTraced;
		isTraced = newIsTraced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.TRACEABLE__IS_TRACED, oldIsTraced, isTraced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLogStartTime() {
		return logStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogStartTime(boolean newLogStartTime) {
		boolean oldLogStartTime = logStartTime;
		logStartTime = newLogStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.TRACEABLE__LOG_START_TIME, oldLogStartTime, logStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLogEndTime() {
		return logEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogEndTime(boolean newLogEndTime) {
		boolean oldLogEndTime = logEndTime;
		logEndTime = newLogEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.TRACEABLE__LOG_END_TIME, oldLogEndTime, logEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Process_modelingPackage.TRACEABLE__IS_TRACED:
				return isIsTraced();
			case Process_modelingPackage.TRACEABLE__LOG_START_TIME:
				return isLogStartTime();
			case Process_modelingPackage.TRACEABLE__LOG_END_TIME:
				return isLogEndTime();
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
			case Process_modelingPackage.TRACEABLE__IS_TRACED:
				setIsTraced((Boolean)newValue);
				return;
			case Process_modelingPackage.TRACEABLE__LOG_START_TIME:
				setLogStartTime((Boolean)newValue);
				return;
			case Process_modelingPackage.TRACEABLE__LOG_END_TIME:
				setLogEndTime((Boolean)newValue);
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
			case Process_modelingPackage.TRACEABLE__IS_TRACED:
				setIsTraced(IS_TRACED_EDEFAULT);
				return;
			case Process_modelingPackage.TRACEABLE__LOG_START_TIME:
				setLogStartTime(LOG_START_TIME_EDEFAULT);
				return;
			case Process_modelingPackage.TRACEABLE__LOG_END_TIME:
				setLogEndTime(LOG_END_TIME_EDEFAULT);
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
			case Process_modelingPackage.TRACEABLE__IS_TRACED:
				return isTraced != IS_TRACED_EDEFAULT;
			case Process_modelingPackage.TRACEABLE__LOG_START_TIME:
				return logStartTime != LOG_START_TIME_EDEFAULT;
			case Process_modelingPackage.TRACEABLE__LOG_END_TIME:
				return logEndTime != LOG_END_TIME_EDEFAULT;
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
		result.append(" (isTraced: ");
		result.append(isTraced);
		result.append(", logStartTime: ");
		result.append(logStartTime);
		result.append(", logEndTime: ");
		result.append(logEndTime);
		result.append(')');
		return result.toString();
	}

} //TraceableImpl
