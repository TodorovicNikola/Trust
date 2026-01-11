/**
 */
package process_modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import process_modeling.EErrorDomain;
import process_modeling.EErrorStatus;
import process_modeling.EErrorType;
import process_modeling.ProcessElement;
import process_modeling.Process_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ErrorImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getPrevention <em>Prevention</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getDetection <em>Detection</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getGlobalErrorHandler <em>Global Error Handler</em>}</li>
 *   <li>{@link process_modeling.impl.ErrorImpl#getLocalErrorHandler <em>Local Error Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorImpl extends IDNamedElementImpl implements process_modeling.Error {
	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final EErrorDomain DOMAIN_EDEFAULT = EErrorDomain.LOCAL;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EErrorDomain domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EErrorType TYPE_EDEFAULT = EErrorType.NAMED_ERROR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EErrorType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EErrorStatus STATUS_EDEFAULT = EErrorStatus.INACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EErrorStatus status = STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected String cause = CAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrevention() <em>Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevention()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevention() <em>Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevention()
	 * @generated
	 * @ordered
	 */
	protected String prevention = PREVENTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final int SEVERITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected int severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURRENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected int occurrence = OCCURRENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetection() <em>Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetection()
	 * @generated
	 * @ordered
	 */
	protected static final int DETECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDetection() <em>Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetection()
	 * @generated
	 * @ordered
	 */
	protected int detection = DETECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGlobalErrorHandler() <em>Global Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected process_modeling.Process globalErrorHandler;

	/**
	 * The cached value of the '{@link #getLocalErrorHandler() <em>Local Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected ProcessElement localErrorHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorDomain getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(EErrorDomain newDomain) {
		EErrorDomain oldDomain = domain;
		domain = newDomain == null ? DOMAIN_EDEFAULT : newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EErrorType newType) {
		EErrorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErrorStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EErrorStatus newStatus) {
		EErrorStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__MESSAGE, oldMessage, message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(String newCause) {
		String oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrevention() {
		return prevention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevention(String newPrevention) {
		String oldPrevention = prevention;
		prevention = newPrevention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__PREVENTION, oldPrevention, prevention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(int newSeverity) {
		int oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrence(int newOccurrence) {
		int oldOccurrence = occurrence;
		occurrence = newOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__OCCURRENCE, oldOccurrence, occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDetection() {
		return detection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetection(int newDetection) {
		int oldDetection = detection;
		detection = newDetection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__DETECTION, oldDetection, detection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process_modeling.Process getGlobalErrorHandler() {
		if (globalErrorHandler != null && globalErrorHandler.eIsProxy()) {
			InternalEObject oldGlobalErrorHandler = (InternalEObject)globalErrorHandler;
			globalErrorHandler = (process_modeling.Process)eResolveProxy(oldGlobalErrorHandler);
			if (globalErrorHandler != oldGlobalErrorHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Process_modelingPackage.ERROR__GLOBAL_ERROR_HANDLER, oldGlobalErrorHandler, globalErrorHandler));
			}
		}
		return globalErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process_modeling.Process basicGetGlobalErrorHandler() {
		return globalErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalErrorHandler(process_modeling.Process newGlobalErrorHandler) {
		process_modeling.Process oldGlobalErrorHandler = globalErrorHandler;
		globalErrorHandler = newGlobalErrorHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__GLOBAL_ERROR_HANDLER, oldGlobalErrorHandler, globalErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElement getLocalErrorHandler() {
		if (localErrorHandler != null && localErrorHandler.eIsProxy()) {
			InternalEObject oldLocalErrorHandler = (InternalEObject)localErrorHandler;
			localErrorHandler = (ProcessElement)eResolveProxy(oldLocalErrorHandler);
			if (localErrorHandler != oldLocalErrorHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Process_modelingPackage.ERROR__LOCAL_ERROR_HANDLER, oldLocalErrorHandler, localErrorHandler));
			}
		}
		return localErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElement basicGetLocalErrorHandler() {
		return localErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalErrorHandler(ProcessElement newLocalErrorHandler) {
		ProcessElement oldLocalErrorHandler = localErrorHandler;
		localErrorHandler = newLocalErrorHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ERROR__LOCAL_ERROR_HANDLER, oldLocalErrorHandler, localErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Process_modelingPackage.ERROR__DOMAIN:
				return getDomain();
			case Process_modelingPackage.ERROR__TYPE:
				return getType();
			case Process_modelingPackage.ERROR__STATUS:
				return getStatus();
			case Process_modelingPackage.ERROR__MESSAGE:
				return getMessage();
			case Process_modelingPackage.ERROR__DESCRIPTION:
				return getDescription();
			case Process_modelingPackage.ERROR__MODE:
				return getMode();
			case Process_modelingPackage.ERROR__EFFECT:
				return getEffect();
			case Process_modelingPackage.ERROR__CAUSE:
				return getCause();
			case Process_modelingPackage.ERROR__PREVENTION:
				return getPrevention();
			case Process_modelingPackage.ERROR__SEVERITY:
				return getSeverity();
			case Process_modelingPackage.ERROR__OCCURRENCE:
				return getOccurrence();
			case Process_modelingPackage.ERROR__DETECTION:
				return getDetection();
			case Process_modelingPackage.ERROR__GLOBAL_ERROR_HANDLER:
				if (resolve) return getGlobalErrorHandler();
				return basicGetGlobalErrorHandler();
			case Process_modelingPackage.ERROR__LOCAL_ERROR_HANDLER:
				if (resolve) return getLocalErrorHandler();
				return basicGetLocalErrorHandler();
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
			case Process_modelingPackage.ERROR__DOMAIN:
				setDomain((EErrorDomain)newValue);
				return;
			case Process_modelingPackage.ERROR__TYPE:
				setType((EErrorType)newValue);
				return;
			case Process_modelingPackage.ERROR__STATUS:
				setStatus((EErrorStatus)newValue);
				return;
			case Process_modelingPackage.ERROR__MESSAGE:
				setMessage((String)newValue);
				return;
			case Process_modelingPackage.ERROR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Process_modelingPackage.ERROR__MODE:
				setMode((String)newValue);
				return;
			case Process_modelingPackage.ERROR__EFFECT:
				setEffect((String)newValue);
				return;
			case Process_modelingPackage.ERROR__CAUSE:
				setCause((String)newValue);
				return;
			case Process_modelingPackage.ERROR__PREVENTION:
				setPrevention((String)newValue);
				return;
			case Process_modelingPackage.ERROR__SEVERITY:
				setSeverity((Integer)newValue);
				return;
			case Process_modelingPackage.ERROR__OCCURRENCE:
				setOccurrence((Integer)newValue);
				return;
			case Process_modelingPackage.ERROR__DETECTION:
				setDetection((Integer)newValue);
				return;
			case Process_modelingPackage.ERROR__GLOBAL_ERROR_HANDLER:
				setGlobalErrorHandler((process_modeling.Process)newValue);
				return;
			case Process_modelingPackage.ERROR__LOCAL_ERROR_HANDLER:
				setLocalErrorHandler((ProcessElement)newValue);
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
			case Process_modelingPackage.ERROR__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__CAUSE:
				setCause(CAUSE_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__PREVENTION:
				setPrevention(PREVENTION_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__OCCURRENCE:
				setOccurrence(OCCURRENCE_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__DETECTION:
				setDetection(DETECTION_EDEFAULT);
				return;
			case Process_modelingPackage.ERROR__GLOBAL_ERROR_HANDLER:
				setGlobalErrorHandler((process_modeling.Process)null);
				return;
			case Process_modelingPackage.ERROR__LOCAL_ERROR_HANDLER:
				setLocalErrorHandler((ProcessElement)null);
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
			case Process_modelingPackage.ERROR__DOMAIN:
				return domain != DOMAIN_EDEFAULT;
			case Process_modelingPackage.ERROR__TYPE:
				return type != TYPE_EDEFAULT;
			case Process_modelingPackage.ERROR__STATUS:
				return status != STATUS_EDEFAULT;
			case Process_modelingPackage.ERROR__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case Process_modelingPackage.ERROR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Process_modelingPackage.ERROR__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case Process_modelingPackage.ERROR__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case Process_modelingPackage.ERROR__CAUSE:
				return CAUSE_EDEFAULT == null ? cause != null : !CAUSE_EDEFAULT.equals(cause);
			case Process_modelingPackage.ERROR__PREVENTION:
				return PREVENTION_EDEFAULT == null ? prevention != null : !PREVENTION_EDEFAULT.equals(prevention);
			case Process_modelingPackage.ERROR__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case Process_modelingPackage.ERROR__OCCURRENCE:
				return occurrence != OCCURRENCE_EDEFAULT;
			case Process_modelingPackage.ERROR__DETECTION:
				return detection != DETECTION_EDEFAULT;
			case Process_modelingPackage.ERROR__GLOBAL_ERROR_HANDLER:
				return globalErrorHandler != null;
			case Process_modelingPackage.ERROR__LOCAL_ERROR_HANDLER:
				return localErrorHandler != null;
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
		result.append(" (domain: ");
		result.append(domain);
		result.append(", type: ");
		result.append(type);
		result.append(", status: ");
		result.append(status);
		result.append(", message: ");
		result.append(message);
		result.append(", description: ");
		result.append(description);
		result.append(", mode: ");
		result.append(mode);
		result.append(", effect: ");
		result.append(effect);
		result.append(", cause: ");
		result.append(cause);
		result.append(", prevention: ");
		result.append(prevention);
		result.append(", severity: ");
		result.append(severity);
		result.append(", occurrence: ");
		result.append(occurrence);
		result.append(", detection: ");
		result.append(detection);
		result.append(')');
		return result.toString();
	}

} //ErrorImpl
