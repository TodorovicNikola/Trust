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

import process_modeling.Capability;
import process_modeling.EProcessStepNotation;
import process_modeling.EProcessStepType;
import process_modeling.ProcessStep;
import process_modeling.Process_modelingPackage;
import process_modeling.Product;
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
	@Override
	public EProcessStepType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EProcessStepNotation getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
	public String getAcceptanceCriterion() {
		return acceptanceCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getCompletionCriterion() {
		return completionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
