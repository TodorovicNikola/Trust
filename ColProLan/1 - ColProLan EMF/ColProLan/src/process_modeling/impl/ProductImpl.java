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

import process_modeling.Constraint;
import process_modeling.EPersistenceType;
import process_modeling.Persistable;
import process_modeling.Process_modelingPackage;
import process_modeling.Product;
import process_modeling.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ProductImpl#isIsPersisted <em>Is Persisted</em>}</li>
 *   <li>{@link process_modeling.impl.ProductImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link process_modeling.impl.ProductImpl#isIsStored <em>Is Stored</em>}</li>
 *   <li>{@link process_modeling.impl.ProductImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link process_modeling.impl.ProductImpl#getEquivalent <em>Equivalent</em>}</li>
 *   <li>{@link process_modeling.impl.ProductImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link process_modeling.impl.ProductImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link process_modeling.impl.ProductImpl#isIsFinal <em>Is Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends IDNamedElementImpl implements Product {
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
	 * The default value of the '{@link #isIsStored() <em>Is Stored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStored() <em>Is Stored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStored()
	 * @generated
	 * @ordered
	 */
	protected boolean isStored = IS_STORED_EDEFAULT;

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
	 * The cached value of the '{@link #getEquivalent() <em>Equivalent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalent()
	 * @generated
	 * @ordered
	 */
	protected Product equivalent;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected Resource storage;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PRODUCT__IS_PERSISTED, oldIsPersisted, isPersisted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PRODUCT__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStored() {
		return isStored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStored(boolean newIsStored) {
		boolean oldIsStored = isStored;
		isStored = newIsStored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PRODUCT__IS_STORED, oldIsStored, isStored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, Process_modelingPackage.PRODUCT__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getEquivalent() {
		if (equivalent != null && equivalent.eIsProxy()) {
			InternalEObject oldEquivalent = (InternalEObject)equivalent;
			equivalent = (Product)eResolveProxy(oldEquivalent);
			if (equivalent != oldEquivalent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Process_modelingPackage.PRODUCT__EQUIVALENT, oldEquivalent, equivalent));
			}
		}
		return equivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetEquivalent() {
		return equivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquivalent(Product newEquivalent) {
		Product oldEquivalent = equivalent;
		equivalent = newEquivalent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PRODUCT__EQUIVALENT, oldEquivalent, equivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorage(Resource newStorage, NotificationChain msgs) {
		Resource oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PRODUCT__STORAGE, oldStorage, newStorage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(Resource newStorage) {
		if (newStorage != storage) {
			NotificationChain msgs = null;
			if (storage != null)
				msgs = ((InternalEObject)storage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Process_modelingPackage.PRODUCT__STORAGE, null, msgs);
			if (newStorage != null)
				msgs = ((InternalEObject)newStorage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Process_modelingPackage.PRODUCT__STORAGE, null, msgs);
			msgs = basicSetStorage(newStorage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PRODUCT__STORAGE, newStorage, newStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PRODUCT__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.PRODUCT__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.PRODUCT__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case Process_modelingPackage.PRODUCT__STORAGE:
				return basicSetStorage(null, msgs);
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
			case Process_modelingPackage.PRODUCT__IS_PERSISTED:
				return isIsPersisted();
			case Process_modelingPackage.PRODUCT__PERSISTENCE_TYPE:
				return getPersistenceType();
			case Process_modelingPackage.PRODUCT__IS_STORED:
				return isIsStored();
			case Process_modelingPackage.PRODUCT__CONSTRAINTS:
				return getConstraints();
			case Process_modelingPackage.PRODUCT__EQUIVALENT:
				if (resolve) return getEquivalent();
				return basicGetEquivalent();
			case Process_modelingPackage.PRODUCT__STORAGE:
				return getStorage();
			case Process_modelingPackage.PRODUCT__QUANTITY:
				return getQuantity();
			case Process_modelingPackage.PRODUCT__IS_FINAL:
				return isIsFinal();
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
			case Process_modelingPackage.PRODUCT__IS_PERSISTED:
				setIsPersisted((Boolean)newValue);
				return;
			case Process_modelingPackage.PRODUCT__PERSISTENCE_TYPE:
				setPersistenceType((EPersistenceType)newValue);
				return;
			case Process_modelingPackage.PRODUCT__IS_STORED:
				setIsStored((Boolean)newValue);
				return;
			case Process_modelingPackage.PRODUCT__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Process_modelingPackage.PRODUCT__EQUIVALENT:
				setEquivalent((Product)newValue);
				return;
			case Process_modelingPackage.PRODUCT__STORAGE:
				setStorage((Resource)newValue);
				return;
			case Process_modelingPackage.PRODUCT__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case Process_modelingPackage.PRODUCT__IS_FINAL:
				setIsFinal((Boolean)newValue);
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
			case Process_modelingPackage.PRODUCT__IS_PERSISTED:
				setIsPersisted(IS_PERSISTED_EDEFAULT);
				return;
			case Process_modelingPackage.PRODUCT__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case Process_modelingPackage.PRODUCT__IS_STORED:
				setIsStored(IS_STORED_EDEFAULT);
				return;
			case Process_modelingPackage.PRODUCT__CONSTRAINTS:
				getConstraints().clear();
				return;
			case Process_modelingPackage.PRODUCT__EQUIVALENT:
				setEquivalent((Product)null);
				return;
			case Process_modelingPackage.PRODUCT__STORAGE:
				setStorage((Resource)null);
				return;
			case Process_modelingPackage.PRODUCT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case Process_modelingPackage.PRODUCT__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
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
			case Process_modelingPackage.PRODUCT__IS_PERSISTED:
				return isPersisted != IS_PERSISTED_EDEFAULT;
			case Process_modelingPackage.PRODUCT__PERSISTENCE_TYPE:
				return persistenceType != PERSISTENCE_TYPE_EDEFAULT;
			case Process_modelingPackage.PRODUCT__IS_STORED:
				return isStored != IS_STORED_EDEFAULT;
			case Process_modelingPackage.PRODUCT__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case Process_modelingPackage.PRODUCT__EQUIVALENT:
				return equivalent != null;
			case Process_modelingPackage.PRODUCT__STORAGE:
				return storage != null;
			case Process_modelingPackage.PRODUCT__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case Process_modelingPackage.PRODUCT__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
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
				case Process_modelingPackage.PRODUCT__IS_PERSISTED: return Process_modelingPackage.PERSISTABLE__IS_PERSISTED;
				case Process_modelingPackage.PRODUCT__PERSISTENCE_TYPE: return Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE;
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
				case Process_modelingPackage.PERSISTABLE__IS_PERSISTED: return Process_modelingPackage.PRODUCT__IS_PERSISTED;
				case Process_modelingPackage.PERSISTABLE__PERSISTENCE_TYPE: return Process_modelingPackage.PRODUCT__PERSISTENCE_TYPE;
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
		result.append(", isStored: ");
		result.append(isStored);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
