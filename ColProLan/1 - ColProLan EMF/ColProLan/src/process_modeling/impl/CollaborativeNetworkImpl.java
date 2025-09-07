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

import process_modeling.CollaborativeNetwork;
import process_modeling.Organization;
import process_modeling.Process_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.CollaborativeNetworkImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link process_modeling.impl.CollaborativeNetworkImpl#getEndorsementPolicy <em>Endorsement Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeNetworkImpl extends ProcessElementImpl implements CollaborativeNetwork {
	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> organizations;

	/**
	 * The default value of the '{@link #getEndorsementPolicy() <em>Endorsement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorsementPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDORSEMENT_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndorsementPolicy() <em>Endorsement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorsementPolicy()
	 * @generated
	 * @ordered
	 */
	protected String endorsementPolicy = ENDORSEMENT_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.COLLABORATIVE_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getOrganizations() {
		if (organizations == null) {
			organizations = new EObjectContainmentEList<Organization>(Organization.class, this, Process_modelingPackage.COLLABORATIVE_NETWORK__ORGANIZATIONS);
		}
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndorsementPolicy() {
		return endorsementPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndorsementPolicy(String newEndorsementPolicy) {
		String oldEndorsementPolicy = endorsementPolicy;
		endorsementPolicy = newEndorsementPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.COLLABORATIVE_NETWORK__ENDORSEMENT_POLICY, oldEndorsementPolicy, endorsementPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
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
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ORGANIZATIONS:
				return getOrganizations();
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ENDORSEMENT_POLICY:
				return getEndorsementPolicy();
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
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends Organization>)newValue);
				return;
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ENDORSEMENT_POLICY:
				setEndorsementPolicy((String)newValue);
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
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ENDORSEMENT_POLICY:
				setEndorsementPolicy(ENDORSEMENT_POLICY_EDEFAULT);
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
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ORGANIZATIONS:
				return organizations != null && !organizations.isEmpty();
			case Process_modelingPackage.COLLABORATIVE_NETWORK__ENDORSEMENT_POLICY:
				return ENDORSEMENT_POLICY_EDEFAULT == null ? endorsementPolicy != null : !ENDORSEMENT_POLICY_EDEFAULT.equals(endorsementPolicy);
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
		result.append(" (endorsementPolicy: ");
		result.append(endorsementPolicy);
		result.append(')');
		return result.toString();
	}

} //CollaborativeNetworkImpl
