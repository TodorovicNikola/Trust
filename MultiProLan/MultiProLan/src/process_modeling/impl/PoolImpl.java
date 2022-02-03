/**
 */
package process_modeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import process_modeling.Pool;
import process_modeling.Process_modelingPackage;
import process_modeling.SwimLane;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.PoolImpl#getSwimlanes <em>Swimlanes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoolImpl extends ProcessElementImpl implements Pool {
	/**
	 * The cached value of the '{@link #getSwimlanes() <em>Swimlanes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwimlanes()
	 * @generated
	 * @ordered
	 */
	protected EList<SwimLane> swimlanes;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwimLane> getSwimlanes() {
		if (swimlanes == null) {
			swimlanes = new EObjectContainmentEList<SwimLane>(SwimLane.class, this, Process_modelingPackage.POOL__SWIMLANES);
		}
		return swimlanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.POOL__SWIMLANES:
				return ((InternalEList<?>)getSwimlanes()).basicRemove(otherEnd, msgs);
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
			case Process_modelingPackage.POOL__SWIMLANES:
				return getSwimlanes();
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
			case Process_modelingPackage.POOL__SWIMLANES:
				getSwimlanes().clear();
				getSwimlanes().addAll((Collection<? extends SwimLane>)newValue);
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
			case Process_modelingPackage.POOL__SWIMLANES:
				getSwimlanes().clear();
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
			case Process_modelingPackage.POOL__SWIMLANES:
				return swimlanes != null && !swimlanes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PoolImpl
