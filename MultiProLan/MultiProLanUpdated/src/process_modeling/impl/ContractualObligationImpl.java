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
import process_modeling.ContractualObligation;
import process_modeling.IDNamedElement;
import process_modeling.Process_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contractual Obligation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.impl.ContractualObligationImpl#getId <em>Id</em>}</li>
 *   <li>{@link process_modeling.impl.ContractualObligationImpl#getName <em>Name</em>}</li>
 *   <li>{@link process_modeling.impl.ContractualObligationImpl#isExposeToCollaboratingParties <em>Expose To Collaborating Parties</em>}</li>
 *   <li>{@link process_modeling.impl.ContractualObligationImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link process_modeling.impl.ContractualObligationImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractualObligationImpl extends PersistableImpl implements ContractualObligation {
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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractualObligationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Process_modelingPackage.Literals.CONTRACTUAL_OBLIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONTRACTUAL_OBLIGATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONTRACTUAL_OBLIGATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExposeToCollaboratingParties() {
		return exposeToCollaboratingParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposeToCollaboratingParties(boolean newExposeToCollaboratingParties) {
		boolean oldExposeToCollaboratingParties = exposeToCollaboratingParties;
		exposeToCollaboratingParties = newExposeToCollaboratingParties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONTRACTUAL_OBLIGATION__EXPOSE_TO_COLLABORATING_PARTIES, oldExposeToCollaboratingParties, exposeToCollaboratingParties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Process_modelingPackage.CONTRACTUAL_OBLIGATION__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, Process_modelingPackage.CONTRACTUAL_OBLIGATION__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ID:
				return getId();
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__NAME:
				return getName();
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__EXPOSE_TO_COLLABORATING_PARTIES:
				return isExposeToCollaboratingParties();
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ALIAS:
				return getAlias();
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__CONSTRAINTS:
				return getConstraints();
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
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ID:
				setId((String)newValue);
				return;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__NAME:
				setName((String)newValue);
				return;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__EXPOSE_TO_COLLABORATING_PARTIES:
				setExposeToCollaboratingParties((Boolean)newValue);
				return;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ALIAS:
				setAlias((String)newValue);
				return;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ID:
				setId(ID_EDEFAULT);
				return;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__EXPOSE_TO_COLLABORATING_PARTIES:
				setExposeToCollaboratingParties(EXPOSE_TO_COLLABORATING_PARTIES_EDEFAULT);
				return;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__CONSTRAINTS:
				getConstraints().clear();
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
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__EXPOSE_TO_COLLABORATING_PARTIES:
				return exposeToCollaboratingParties != EXPOSE_TO_COLLABORATING_PARTIES_EDEFAULT;
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case Process_modelingPackage.CONTRACTUAL_OBLIGATION__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
		if (baseClass == IDNamedElement.class) {
			switch (derivedFeatureID) {
				case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ID: return Process_modelingPackage.ID_NAMED_ELEMENT__ID;
				case Process_modelingPackage.CONTRACTUAL_OBLIGATION__NAME: return Process_modelingPackage.ID_NAMED_ELEMENT__NAME;
				case Process_modelingPackage.CONTRACTUAL_OBLIGATION__EXPOSE_TO_COLLABORATING_PARTIES: return Process_modelingPackage.ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES;
				case Process_modelingPackage.CONTRACTUAL_OBLIGATION__ALIAS: return Process_modelingPackage.ID_NAMED_ELEMENT__ALIAS;
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
		if (baseClass == IDNamedElement.class) {
			switch (baseFeatureID) {
				case Process_modelingPackage.ID_NAMED_ELEMENT__ID: return Process_modelingPackage.CONTRACTUAL_OBLIGATION__ID;
				case Process_modelingPackage.ID_NAMED_ELEMENT__NAME: return Process_modelingPackage.CONTRACTUAL_OBLIGATION__NAME;
				case Process_modelingPackage.ID_NAMED_ELEMENT__EXPOSE_TO_COLLABORATING_PARTIES: return Process_modelingPackage.CONTRACTUAL_OBLIGATION__EXPOSE_TO_COLLABORATING_PARTIES;
				case Process_modelingPackage.ID_NAMED_ELEMENT__ALIAS: return Process_modelingPackage.CONTRACTUAL_OBLIGATION__ALIAS;
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

} //ContractualObligationImpl
