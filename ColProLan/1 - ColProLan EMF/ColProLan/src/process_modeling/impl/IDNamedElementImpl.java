/**
 */
package process_modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import process_modeling.IDNamedElement;
import process_modeling.Process_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ID Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.IDNamedElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link process_modeling.impl.IDNamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link process_modeling.impl.IDNamedElementImpl#isExposeToCollaboratingParties <em>Expose To Collaborating Parties</em>}</li>
 *   <li>{@link process_modeling.impl.IDNamedElementImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IDNamedElementImpl extends MinimalEObjectImpl.Container implements IDNamedElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isExposeToCollaboratingParties() <em>Expose To Collaborating Parties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExposeToCollaboratingParties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPOSE_TO_COLLABORATING_PARTIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExposeToCollaboratingParties() <em>Expose To Collaborating Parties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExposeToCollaboratingParties()
	 * @generated
	 * @ordered
	 */
	protected boolean exposeToCollaboratingParties = EXPOSE_TO_COLLABORATING_PARTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.ID_NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ID_NAMED_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ID_NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExposeToCollaboratingParties() {
		return exposeToCollaboratingParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposeToCollaboratingParties(boolean newExposeToCollaboratingParties) {
		boolean oldExposeToCollaboratingParties = exposeToCollaboratingParties;
		exposeToCollaboratingParties = newExposeToCollaboratingParties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES, oldExposeToCollaboratingParties, exposeToCollaboratingParties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.ID_NAMED_ELEMENT__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Process_modelingPackage.ID_NAMED_ELEMENT__ID:
				return getId();
			case Process_modelingPackage.ID_NAMED_ELEMENT__NAME:
				return getName();
			case Process_modelingPackage.ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES:
				return isExposeToCollaboratingParties();
			case Process_modelingPackage.ID_NAMED_ELEMENT__ALIAS:
				return getAlias();
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
			case Process_modelingPackage.ID_NAMED_ELEMENT__ID:
				setId((String)newValue);
				return;
			case Process_modelingPackage.ID_NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case Process_modelingPackage.ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES:
				setExposeToCollaboratingParties((Boolean)newValue);
				return;
			case Process_modelingPackage.ID_NAMED_ELEMENT__ALIAS:
				setAlias((String)newValue);
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
			case Process_modelingPackage.ID_NAMED_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case Process_modelingPackage.ID_NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Process_modelingPackage.ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES:
				setExposeToCollaboratingParties(EXPOSE_TO_COLLABORATING_PARTIES_EDEFAULT);
				return;
			case Process_modelingPackage.ID_NAMED_ELEMENT__ALIAS:
				setAlias(ALIAS_EDEFAULT);
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
			case Process_modelingPackage.ID_NAMED_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Process_modelingPackage.ID_NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Process_modelingPackage.ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES:
				return exposeToCollaboratingParties != EXPOSE_TO_COLLABORATING_PARTIES_EDEFAULT;
			case Process_modelingPackage.ID_NAMED_ELEMENT__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", exposeToCollaboratingParties: ");
		result.append(exposeToCollaboratingParties);
		result.append(", alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

} //IDNamedElementImpl
