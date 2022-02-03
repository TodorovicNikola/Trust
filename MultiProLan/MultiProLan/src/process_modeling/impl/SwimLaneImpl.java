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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import process_modeling.EOrganizationRole;
import process_modeling.ProcessElement;
import process_modeling.Process_modelingPackage;
import process_modeling.SwimLane;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swim Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.SwimLaneImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link process_modeling.impl.SwimLaneImpl#getOrganizationRole <em>Organization Role</em>}</li>
 *   <li>{@link process_modeling.impl.SwimLaneImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwimLaneImpl extends MinimalEObjectImpl.Container implements SwimLane {
	/**
	 * The default value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected String organizationName = ORGANIZATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationRole() <em>Organization Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRole()
	 * @generated
	 * @ordered
	 */
	protected static final EOrganizationRole ORGANIZATION_ROLE_EDEFAULT = EOrganizationRole.BROKER;

	/**
	 * The cached value of the '{@link #getOrganizationRole() <em>Organization Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRole()
	 * @generated
	 * @ordered
	 */
	protected EOrganizationRole organizationRole = ORGANIZATION_ROLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwimLaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.SWIM_LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationName(String newOrganizationName) {
		String oldOrganizationName = organizationName;
		organizationName = newOrganizationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.SWIM_LANE__ORGANIZATION_NAME, oldOrganizationName, organizationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOrganizationRole getOrganizationRole() {
		return organizationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationRole(EOrganizationRole newOrganizationRole) {
		EOrganizationRole oldOrganizationRole = organizationRole;
		organizationRole = newOrganizationRole == null ? ORGANIZATION_ROLE_EDEFAULT : newOrganizationRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.SWIM_LANE__ORGANIZATION_ROLE, oldOrganizationRole, organizationRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ProcessElement>(ProcessElement.class, this, Process_modelingPackage.SWIM_LANE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.SWIM_LANE__ELEMENTS:
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
			case Process_modelingPackage.SWIM_LANE__ORGANIZATION_NAME:
				return getOrganizationName();
			case Process_modelingPackage.SWIM_LANE__ORGANIZATION_ROLE:
				return getOrganizationRole();
			case Process_modelingPackage.SWIM_LANE__ELEMENTS:
				return getElements();
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
			case Process_modelingPackage.SWIM_LANE__ORGANIZATION_NAME:
				setOrganizationName((String)newValue);
				return;
			case Process_modelingPackage.SWIM_LANE__ORGANIZATION_ROLE:
				setOrganizationRole((EOrganizationRole)newValue);
				return;
			case Process_modelingPackage.SWIM_LANE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ProcessElement>)newValue);
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
			case Process_modelingPackage.SWIM_LANE__ORGANIZATION_NAME:
				setOrganizationName(ORGANIZATION_NAME_EDEFAULT);
				return;
			case Process_modelingPackage.SWIM_LANE__ORGANIZATION_ROLE:
				setOrganizationRole(ORGANIZATION_ROLE_EDEFAULT);
				return;
			case Process_modelingPackage.SWIM_LANE__ELEMENTS:
				getElements().clear();
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
			case Process_modelingPackage.SWIM_LANE__ORGANIZATION_NAME:
				return ORGANIZATION_NAME_EDEFAULT == null ? organizationName != null : !ORGANIZATION_NAME_EDEFAULT.equals(organizationName);
			case Process_modelingPackage.SWIM_LANE__ORGANIZATION_ROLE:
				return organizationRole != ORGANIZATION_ROLE_EDEFAULT;
			case Process_modelingPackage.SWIM_LANE__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
		result.append(" (OrganizationName: ");
		result.append(organizationName);
		result.append(", OrganizationRole: ");
		result.append(organizationRole);
		result.append(')');
		return result.toString();
	}

} //SwimLaneImpl
