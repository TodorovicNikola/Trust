/**
 */
package process_modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import process_modeling.EPersistenceType;
import process_modeling.Parameter;
import process_modeling.Persistable;
import process_modeling.Process_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ParameterImpl#isIsPersisted <em>Is Persisted</em>}</li>
 *   <li>{@link process_modeling.impl.ParameterImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link process_modeling.impl.ParameterImpl#getKey <em>Key</em>}</li>
 *   <li>{@link process_modeling.impl.ParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends IDNamedElementImpl implements Parameter {
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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PARAMETER__IS_PERSISTED, oldIsPersisted, isPersisted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PARAMETER__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PARAMETER__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Process_modelingPackage.PARAMETER__IS_PERSISTED:
				return isIsPersisted();
			case Process_modelingPackage.PARAMETER__PERSISTENCE_TYPE:
				return getPersistenceType();
			case Process_modelingPackage.PARAMETER__KEY:
				return getKey();
			case Process_modelingPackage.PARAMETER__VALUE:
				return getValue();
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
			case Process_modelingPackage.PARAMETER__IS_PERSISTED:
				setIsPersisted((Boolean)newValue);
				return;
			case Process_modelingPackage.PARAMETER__PERSISTENCE_TYPE:
				setPersistenceType((EPersistenceType)newValue);
				return;
			case Process_modelingPackage.PARAMETER__KEY:
				setKey((String)newValue);
				return;
			case Process_modelingPackage.PARAMETER__VALUE:
				setValue((String)newValue);
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
			case Process_modelingPackage.PARAMETER__IS_PERSISTED:
				setIsPersisted(IS_PERSISTED_EDEFAULT);
				return;
			case Process_modelingPackage.PARAMETER__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.PARAMETER__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case Process_modelingPackage.PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case Process_modelingPackage.PARAMETER__IS_PERSISTED:
				return isPersisted != IS_PERSISTED_EDEFAULT;
			case Process_modelingPackage.PARAMETER__PERSISTENCE_TYPE:
				return persistenceType != PERSISTENCE_TYPE_EDEFAULT;
			case Process_modelingPackage.PARAMETER__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case Process_modelingPackage.PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
				case Process_modelingPackage.PARAMETER__IS_PERSISTED: return Process_modelingPackage.PERSISTABLE__IS_PERSISTED;
				case Process_modelingPackage.PARAMETER__PERSISTENCE_TYPE: return Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE;
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
				case Process_modelingPackage.PERSISTABLE__IS_PERSISTED: return Process_modelingPackage.PARAMETER__IS_PERSISTED;
				case Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE: return Process_modelingPackage.PARAMETER__PERSISTENCE_TYPE;
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
		result.append(", key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
