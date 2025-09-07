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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import process_modeling.Capability;
import process_modeling.EPersistenceType;
import process_modeling.EResourceStatus;
import process_modeling.EResourceType;
import process_modeling.Persistable;
import process_modeling.Process_modelingPackage;
import process_modeling.Product;
import process_modeling.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ResourceImpl#isIsPersisted <em>Is Persisted</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#isIsActuator <em>Is Actuator</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#isIsStorage <em>Is Storage</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#getMaterialFlowSource <em>Material Flow Source</em>}</li>
 *   <li>{@link process_modeling.impl.ResourceImpl#getMaterialFlowTarget <em>Material Flow Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends IDNamedElementImpl implements Resource {
	/**
	 * The default value of the '{@link #isIsPersisted() <em>Is Persisted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersisted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERSISTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPersisted() <em>Is Persisted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersisted()
	 * @generated
	 * @ordered
	 */
	protected boolean isPersisted = IS_PERSISTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final EPersistenceType PERSISTENCE_TYPE_EDEFAULT = EPersistenceType.HASHED;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected EPersistenceType persistenceType = PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActuator() <em>Is Actuator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActuator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTUATOR_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsActuator() <em>Is Actuator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActuator()
	 * @generated
	 * @ordered
	 */
	protected boolean isActuator = IS_ACTUATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStorage() <em>Is Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStorage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STORAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStorage() <em>Is Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStorage()
	 * @generated
	 * @ordered
	 */
	protected boolean isStorage = IS_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EResourceType TYPE_EDEFAULT = EResourceType.NONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EResourceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EResourceStatus STATUS_EDEFAULT = EResourceStatus.STOPPED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EResourceStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> inventory;

	/**
	 * The cached value of the '{@link #getMaterialFlowSource() <em>Material Flow Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialFlowSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> materialFlowSource;

	/**
	 * The cached value of the '{@link #getMaterialFlowTarget() <em>Material Flow Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialFlowTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> materialFlowTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPersisted() {
		return isPersisted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPersisted(boolean newIsPersisted) {
		boolean oldIsPersisted = isPersisted;
		isPersisted = newIsPersisted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RESOURCE__IS_PERSISTED, oldIsPersisted, isPersisted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPersistenceType getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceType(EPersistenceType newPersistenceType) {
		EPersistenceType oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType == null ? PERSISTENCE_TYPE_EDEFAULT : newPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RESOURCE__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActuator() {
		return isActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActuator(boolean newIsActuator) {
		boolean oldIsActuator = isActuator;
		isActuator = newIsActuator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RESOURCE__IS_ACTUATOR, oldIsActuator, isActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStorage() {
		return isStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStorage(boolean newIsStorage) {
		boolean oldIsStorage = isStorage;
		isStorage = newIsStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RESOURCE__IS_STORAGE, oldIsStorage, isStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EResourceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EResourceType newType) {
		EResourceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RESOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RESOURCE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EResourceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EResourceStatus newStatus) {
		EResourceStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.RESOURCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, Process_modelingPackage.RESOURCE__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getInventory() {
		if (inventory == null) {
			inventory = new EObjectContainmentEList<Product>(Product.class, this, Process_modelingPackage.RESOURCE__INVENTORY);
		}
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getMaterialFlowSource() {
		if (materialFlowSource == null) {
			materialFlowSource = new EObjectWithInverseResolvingEList.ManyInverse<Resource>(Resource.class, this, Process_modelingPackage.RESOURCE__MATERIAL_FLOW_SOURCE, Process_modelingPackage.RESOURCE__MATERIAL_FLOW_TARGET);
		}
		return materialFlowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getMaterialFlowTarget() {
		if (materialFlowTarget == null) {
			materialFlowTarget = new EObjectWithInverseResolvingEList.ManyInverse<Resource>(Resource.class, this, Process_modelingPackage.RESOURCE__MATERIAL_FLOW_TARGET, Process_modelingPackage.RESOURCE__MATERIAL_FLOW_SOURCE);
		}
		return materialFlowTarget;
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
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialFlowSource()).basicAdd(otherEnd, msgs);
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialFlowTarget()).basicAdd(otherEnd, msgs);
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
			case Process_modelingPackage.RESOURCE__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.RESOURCE__INVENTORY:
				return ((InternalEList<?>)getInventory()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_SOURCE:
				return ((InternalEList<?>)getMaterialFlowSource()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_TARGET:
				return ((InternalEList<?>)getMaterialFlowTarget()).basicRemove(otherEnd, msgs);
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
			case Process_modelingPackage.RESOURCE__IS_PERSISTED:
				return isIsPersisted();
			case Process_modelingPackage.RESOURCE__PERSISTENCE_TYPE:
				return getPersistenceType();
			case Process_modelingPackage.RESOURCE__IS_ACTUATOR:
				return isIsActuator();
			case Process_modelingPackage.RESOURCE__IS_STORAGE:
				return isIsStorage();
			case Process_modelingPackage.RESOURCE__TYPE:
				return getType();
			case Process_modelingPackage.RESOURCE__PROTOCOL:
				return getProtocol();
			case Process_modelingPackage.RESOURCE__STATUS:
				return getStatus();
			case Process_modelingPackage.RESOURCE__CAPABILITIES:
				return getCapabilities();
			case Process_modelingPackage.RESOURCE__INVENTORY:
				return getInventory();
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_SOURCE:
				return getMaterialFlowSource();
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_TARGET:
				return getMaterialFlowTarget();
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
			case Process_modelingPackage.RESOURCE__IS_PERSISTED:
				setIsPersisted((Boolean)newValue);
				return;
			case Process_modelingPackage.RESOURCE__PERSISTENCE_TYPE:
				setPersistenceType((EPersistenceType)newValue);
				return;
			case Process_modelingPackage.RESOURCE__IS_ACTUATOR:
				setIsActuator((Boolean)newValue);
				return;
			case Process_modelingPackage.RESOURCE__IS_STORAGE:
				setIsStorage((Boolean)newValue);
				return;
			case Process_modelingPackage.RESOURCE__TYPE:
				setType((EResourceType)newValue);
				return;
			case Process_modelingPackage.RESOURCE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case Process_modelingPackage.RESOURCE__STATUS:
				setStatus((EResourceStatus)newValue);
				return;
			case Process_modelingPackage.RESOURCE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case Process_modelingPackage.RESOURCE__INVENTORY:
				getInventory().clear();
				getInventory().addAll((Collection<? extends Product>)newValue);
				return;
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_SOURCE:
				getMaterialFlowSource().clear();
				getMaterialFlowSource().addAll((Collection<? extends Resource>)newValue);
				return;
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_TARGET:
				getMaterialFlowTarget().clear();
				getMaterialFlowTarget().addAll((Collection<? extends Resource>)newValue);
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
			case Process_modelingPackage.RESOURCE__IS_PERSISTED:
				setIsPersisted(IS_PERSISTED_EDEFAULT);
				return;
			case Process_modelingPackage.RESOURCE__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.RESOURCE__IS_ACTUATOR:
				setIsActuator(IS_ACTUATOR_EDEFAULT);
				return;
			case Process_modelingPackage.RESOURCE__IS_STORAGE:
				setIsStorage(IS_STORAGE_EDEFAULT);
				return;
			case Process_modelingPackage.RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.RESOURCE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case Process_modelingPackage.RESOURCE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case Process_modelingPackage.RESOURCE__CAPABILITIES:
				getCapabilities().clear();
				return;
			case Process_modelingPackage.RESOURCE__INVENTORY:
				getInventory().clear();
				return;
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_SOURCE:
				getMaterialFlowSource().clear();
				return;
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_TARGET:
				getMaterialFlowTarget().clear();
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
			case Process_modelingPackage.RESOURCE__IS_PERSISTED:
				return isPersisted != IS_PERSISTED_EDEFAULT;
			case Process_modelingPackage.RESOURCE__PERSISTENCE_TYPE:
				return persistenceType != PERSISTENCE_TYPE_EDEFAULT;
			case Process_modelingPackage.RESOURCE__IS_ACTUATOR:
				return isActuator != IS_ACTUATOR_EDEFAULT;
			case Process_modelingPackage.RESOURCE__IS_STORAGE:
				return isStorage != IS_STORAGE_EDEFAULT;
			case Process_modelingPackage.RESOURCE__TYPE:
				return type != TYPE_EDEFAULT;
			case Process_modelingPackage.RESOURCE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case Process_modelingPackage.RESOURCE__STATUS:
				return status != STATUS_EDEFAULT;
			case Process_modelingPackage.RESOURCE__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case Process_modelingPackage.RESOURCE__INVENTORY:
				return inventory != null && !inventory.isEmpty();
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_SOURCE:
				return materialFlowSource != null && !materialFlowSource.isEmpty();
			case Process_modelingPackage.RESOURCE__MATERIAL_FLOW_TARGET:
				return materialFlowTarget != null && !materialFlowTarget.isEmpty();
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
		if (baseClass == Persistable.class) {
			switch (derivedFeatureID) {
				case Process_modelingPackage.RESOURCE__IS_PERSISTED: return Process_modelingPackage.PERSISTABLE__IS_PERSISTED;
				case Process_modelingPackage.RESOURCE__PERSISTENCE_TYPE: return Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE;
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
		if (baseClass == Persistable.class) {
			switch (baseFeatureID) {
				case Process_modelingPackage.PERSISTABLE__IS_PERSISTED: return Process_modelingPackage.RESOURCE__IS_PERSISTED;
				case Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE: return Process_modelingPackage.RESOURCE__PERSISTENCE_TYPE;
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
		result.append(" (isPersisted: ");
		result.append(isPersisted);
		result.append(", persistenceType: ");
		result.append(persistenceType);
		result.append(", isActuator: ");
		result.append(isActuator);
		result.append(", isStorage: ");
		result.append(isStorage);
		result.append(", type: ");
		result.append(type);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
