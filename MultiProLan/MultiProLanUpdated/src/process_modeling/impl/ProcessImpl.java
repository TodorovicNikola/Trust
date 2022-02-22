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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import process_modeling.ProcessElement;
import process_modeling.ProcessParameter;
import process_modeling.ProcessStep;
import process_modeling.Process_modelingPackage;
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
	@Override
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
	public boolean isProposedProcess() {
		return proposedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
