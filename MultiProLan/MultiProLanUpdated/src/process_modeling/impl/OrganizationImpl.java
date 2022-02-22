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

import process_modeling.EOrganizationRole;
import process_modeling.Organization;
import process_modeling.ProcessElement;
import process_modeling.Process_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.OrganizationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link process_modeling.impl.OrganizationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link process_modeling.impl.OrganizationImpl#getDltPeerAddress <em>Dlt Peer Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends ProcessElementImpl implements Organization {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final EOrganizationRole ROLE_EDEFAULT = EOrganizationRole.BROKER;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EOrganizationRole role = ROLE_EDEFAULT;

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
	 * The default value of the '{@link #getDltPeerAddress() <em>Dlt Peer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDltPeerAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DLT_PEER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDltPeerAddress() <em>Dlt Peer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDltPeerAddress()
	 * @generated
	 * @ordered
	 */
	protected String dltPeerAddress = DLT_PEER_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOrganizationRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(EOrganizationRole newRole) {
		EOrganizationRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ORGANIZATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ProcessElement>(ProcessElement.class, this, Process_modelingPackage.ORGANIZATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDltPeerAddress() {
		return dltPeerAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDltPeerAddress(String newDltPeerAddress) {
		String oldDltPeerAddress = dltPeerAddress;
		dltPeerAddress = newDltPeerAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ORGANIZATION__DLT_PEER_ADDRESS, oldDltPeerAddress, dltPeerAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.ORGANIZATION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case Process_modelingPackage.ORGANIZATION__ROLE:
				return getRole();
			case Process_modelingPackage.ORGANIZATION__ELEMENTS:
				return getElements();
			case Process_modelingPackage.ORGANIZATION__DLT_PEER_ADDRESS:
				return getDltPeerAddress();
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
			case Process_modelingPackage.ORGANIZATION__ROLE:
				setRole((EOrganizationRole)newValue);
				return;
			case Process_modelingPackage.ORGANIZATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ProcessElement>)newValue);
				return;
			case Process_modelingPackage.ORGANIZATION__DLT_PEER_ADDRESS:
				setDltPeerAddress((String)newValue);
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
			case Process_modelingPackage.ORGANIZATION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Process_modelingPackage.ORGANIZATION__ELEMENTS:
				getElements().clear();
				return;
			case Process_modelingPackage.ORGANIZATION__DLT_PEER_ADDRESS:
				setDltPeerAddress(DLT_PEER_ADDRESS_EDEFAULT);
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
			case Process_modelingPackage.ORGANIZATION__ROLE:
				return role != ROLE_EDEFAULT;
			case Process_modelingPackage.ORGANIZATION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case Process_modelingPackage.ORGANIZATION__DLT_PEER_ADDRESS:
				return DLT_PEER_ADDRESS_EDEFAULT == null ? dltPeerAddress != null : !DLT_PEER_ADDRESS_EDEFAULT.equals(dltPeerAddress);
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
		result.append(" (role: ");
		result.append(role);
		result.append(", dltPeerAddress: ");
		result.append(dltPeerAddress);
		result.append(')');
		return result.toString();
	}

} //OrganizationImpl
