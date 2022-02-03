/**
 */
package process_modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import process_modeling.Constraint;
import process_modeling.EPersistenceType;
import process_modeling.Persistable;
import process_modeling.Process_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ConstraintImpl#isIsPersisted <em>Is Persisted</em>}</li>
 *   <li>{@link process_modeling.impl.ConstraintImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link process_modeling.impl.ConstraintImpl#getPhysicalDimension <em>Physical Dimension</em>}</li>
 *   <li>{@link process_modeling.impl.ConstraintImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link process_modeling.impl.ConstraintImpl#getValue <em>Value</em>}</li>
 *   <li>{@link process_modeling.impl.ConstraintImpl#getMetricUnit <em>Metric Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends IDNamedElementImpl implements Constraint {
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
	 * The default value of the '{@link #getPhysicalDimension() <em>Physical Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalDimension()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalDimension() <em>Physical Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalDimension()
	 * @generated
	 * @ordered
	 */
	protected String physicalDimension = PHYSICAL_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONAL_OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected String relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;

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
	 * The default value of the '{@link #getMetricUnit() <em>Metric Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetricUnit() <em>Metric Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricUnit()
	 * @generated
	 * @ordered
	 */
	protected String metricUnit = METRIC_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONSTRAINT__IS_PERSISTED, oldIsPersisted, isPersisted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONSTRAINT__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicalDimension() {
		return physicalDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalDimension(String newPhysicalDimension) {
		String oldPhysicalDimension = physicalDimension;
		physicalDimension = newPhysicalDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONSTRAINT__PHYSICAL_DIMENSION, oldPhysicalDimension, physicalDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationalOperator() {
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationalOperator(String newRelationalOperator) {
		String oldRelationalOperator = relationalOperator;
		relationalOperator = newRelationalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONSTRAINT__RELATIONAL_OPERATOR, oldRelationalOperator, relationalOperator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONSTRAINT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetricUnit() {
		return metricUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetricUnit(String newMetricUnit) {
		String oldMetricUnit = metricUnit;
		metricUnit = newMetricUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONSTRAINT__METRIC_UNIT, oldMetricUnit, metricUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Process_modelingPackage.CONSTRAINT__IS_PERSISTED:
				return isIsPersisted();
			case Process_modelingPackage.CONSTRAINT__PERSISTENCE_TYPE:
				return getPersistenceType();
			case Process_modelingPackage.CONSTRAINT__PHYSICAL_DIMENSION:
				return getPhysicalDimension();
			case Process_modelingPackage.CONSTRAINT__RELATIONAL_OPERATOR:
				return getRelationalOperator();
			case Process_modelingPackage.CONSTRAINT__VALUE:
				return getValue();
			case Process_modelingPackage.CONSTRAINT__METRIC_UNIT:
				return getMetricUnit();
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
			case Process_modelingPackage.CONSTRAINT__IS_PERSISTED:
				setIsPersisted((Boolean)newValue);
				return;
			case Process_modelingPackage.CONSTRAINT__PERSISTENCE_TYPE:
				setPersistenceType((EPersistenceType)newValue);
				return;
			case Process_modelingPackage.CONSTRAINT__PHYSICAL_DIMENSION:
				setPhysicalDimension((String)newValue);
				return;
			case Process_modelingPackage.CONSTRAINT__RELATIONAL_OPERATOR:
				setRelationalOperator((String)newValue);
				return;
			case Process_modelingPackage.CONSTRAINT__VALUE:
				setValue((String)newValue);
				return;
			case Process_modelingPackage.CONSTRAINT__METRIC_UNIT:
				setMetricUnit((String)newValue);
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
			case Process_modelingPackage.CONSTRAINT__IS_PERSISTED:
				setIsPersisted(IS_PERSISTED_EDEFAULT);
				return;
			case Process_modelingPackage.CONSTRAINT__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.CONSTRAINT__PHYSICAL_DIMENSION:
				setPhysicalDimension(PHYSICAL_DIMENSION_EDEFAULT);
				return;
			case Process_modelingPackage.CONSTRAINT__RELATIONAL_OPERATOR:
				setRelationalOperator(RELATIONAL_OPERATOR_EDEFAULT);
				return;
			case Process_modelingPackage.CONSTRAINT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Process_modelingPackage.CONSTRAINT__METRIC_UNIT:
				setMetricUnit(METRIC_UNIT_EDEFAULT);
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
			case Process_modelingPackage.CONSTRAINT__IS_PERSISTED:
				return isPersisted != IS_PERSISTED_EDEFAULT;
			case Process_modelingPackage.CONSTRAINT__PERSISTENCE_TYPE:
				return persistenceType != PERSISTENCE_TYPE_EDEFAULT;
			case Process_modelingPackage.CONSTRAINT__PHYSICAL_DIMENSION:
				return PHYSICAL_DIMENSION_EDEFAULT == null ? physicalDimension != null : !PHYSICAL_DIMENSION_EDEFAULT.equals(physicalDimension);
			case Process_modelingPackage.CONSTRAINT__RELATIONAL_OPERATOR:
				return RELATIONAL_OPERATOR_EDEFAULT == null ? relationalOperator != null : !RELATIONAL_OPERATOR_EDEFAULT.equals(relationalOperator);
			case Process_modelingPackage.CONSTRAINT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Process_modelingPackage.CONSTRAINT__METRIC_UNIT:
				return METRIC_UNIT_EDEFAULT == null ? metricUnit != null : !METRIC_UNIT_EDEFAULT.equals(metricUnit);
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
				case Process_modelingPackage.CONSTRAINT__IS_PERSISTED: return Process_modelingPackage.PERSISTABLE__IS_PERSISTED;
				case Process_modelingPackage.CONSTRAINT__PERSISTENCE_TYPE: return Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE;
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
				case Process_modelingPackage.PERSISTABLE__IS_PERSISTED: return Process_modelingPackage.CONSTRAINT__IS_PERSISTED;
				case Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE: return Process_modelingPackage.CONSTRAINT__PERSISTENCE_TYPE;
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
		result.append(", physicalDimension: ");
		result.append(physicalDimension);
		result.append(", relationalOperator: ");
		result.append(relationalOperator);
		result.append(", value: ");
		result.append(value);
		result.append(", metricUnit: ");
		result.append(metricUnit);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
