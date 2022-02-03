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
import process_modeling.Constraint;
import process_modeling.EPersistenceType;
import process_modeling.Parameter;
import process_modeling.Persistable;
import process_modeling.Process_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.CapabilityImpl#isIsPersisted <em>Is Persisted</em>}</li>
 *   <li>{@link process_modeling.impl.CapabilityImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link process_modeling.impl.CapabilityImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link process_modeling.impl.CapabilityImpl#isRequiresStorage <em>Requires Storage</em>}</li>
 *   <li>{@link process_modeling.impl.CapabilityImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends IDNamedElementImpl implements Capability {
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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The default value of the '{@link #isRequiresStorage() <em>Requires Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresStorage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_STORAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresStorage() <em>Requires Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresStorage()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresStorage = REQUIRES_STORAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPersisted() {
		return isPersisted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPersisted(boolean newIsPersisted) {
		boolean oldIsPersisted = isPersisted;
		isPersisted = newIsPersisted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CAPABILITY__IS_PERSISTED, oldIsPersisted, isPersisted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPersistenceType getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistenceType(EPersistenceType newPersistenceType) {
		EPersistenceType oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType == null ? PERSISTENCE_TYPE_EDEFAULT : newPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CAPABILITY__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, Process_modelingPackage.CAPABILITY__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequiresStorage() {
		return requiresStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresStorage(boolean newRequiresStorage) {
		boolean oldRequiresStorage = requiresStorage;
		requiresStorage = newRequiresStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CAPABILITY__REQUIRES_STORAGE, oldRequiresStorage, requiresStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, Process_modelingPackage.CAPABILITY__PARAMETERS);
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
			case Process_modelingPackage.CAPABILITY__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.CAPABILITY__PARAMETERS:
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
			case Process_modelingPackage.CAPABILITY__IS_PERSISTED:
				return isIsPersisted();
			case Process_modelingPackage.CAPABILITY__PERSISTENCE_TYPE:
				return getPersistenceType();
			case Process_modelingPackage.CAPABILITY__CONSTRAINTS:
				return getConstraints();
			case Process_modelingPackage.CAPABILITY__REQUIRES_STORAGE:
				return isRequiresStorage();
			case Process_modelingPackage.CAPABILITY__PARAMETERS:
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
			case Process_modelingPackage.CAPABILITY__IS_PERSISTED:
				setIsPersisted((Boolean)newValue);
				return;
			case Process_modelingPackage.CAPABILITY__PERSISTENCE_TYPE:
				setPersistenceType((EPersistenceType)newValue);
				return;
			case Process_modelingPackage.CAPABILITY__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Process_modelingPackage.CAPABILITY__REQUIRES_STORAGE:
				setRequiresStorage((Boolean)newValue);
				return;
			case Process_modelingPackage.CAPABILITY__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case Process_modelingPackage.CAPABILITY__IS_PERSISTED:
				setIsPersisted(IS_PERSISTED_EDEFAULT);
				return;
			case Process_modelingPackage.CAPABILITY__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.CAPABILITY__CONSTRAINTS:
				getConstraints().clear();
				return;
			case Process_modelingPackage.CAPABILITY__REQUIRES_STORAGE:
				setRequiresStorage(REQUIRES_STORAGE_EDEFAULT);
				return;
			case Process_modelingPackage.CAPABILITY__PARAMETERS:
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
			case Process_modelingPackage.CAPABILITY__IS_PERSISTED:
				return isPersisted != IS_PERSISTED_EDEFAULT;
			case Process_modelingPackage.CAPABILITY__PERSISTENCE_TYPE:
				return persistenceType != PERSISTENCE_TYPE_EDEFAULT;
			case Process_modelingPackage.CAPABILITY__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case Process_modelingPackage.CAPABILITY__REQUIRES_STORAGE:
				return requiresStorage != REQUIRES_STORAGE_EDEFAULT;
			case Process_modelingPackage.CAPABILITY__PARAMETERS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Persistable.class) {
			switch (derivedFeatureID) {
				case Process_modelingPackage.CAPABILITY__IS_PERSISTED: return Process_modelingPackage.PERSISTABLE__IS_PERSISTED;
				case Process_modelingPackage.CAPABILITY__PERSISTENCE_TYPE: return Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE;
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
				case Process_modelingPackage.PERSISTABLE__IS_PERSISTED: return Process_modelingPackage.CAPABILITY__IS_PERSISTED;
				case Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE: return Process_modelingPackage.CAPABILITY__PERSISTENCE_TYPE;
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
		result.append(", requiresStorage: ");
		result.append(requiresStorage);
		result.append(')');
		return result.toString();
	}

} //CapabilityImpl
