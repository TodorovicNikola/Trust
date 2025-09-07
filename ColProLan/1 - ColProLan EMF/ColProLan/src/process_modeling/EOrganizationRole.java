/**
 */
package process_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EOrganization Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingPackage#getEOrganizationRole()
 * @model
 * @generated
 */
public enum EOrganizationRole implements Enumerator {
	/**
	 * The '<em><b>BROKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROKER_VALUE
	 * @generated
	 * @ordered
	 */
	BROKER(0, "BROKER", "BROKER"),

	/**
	 * The '<em><b>CORE PARTNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_PARTNER_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_PARTNER(1, "CORE_PARTNER", "CORE_PARTNER"),

	/**
	 * The '<em><b>ADDITIONAL PARTNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_PARTNER_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITIONAL_PARTNER(2, "ADDITIONAL_PARTNER", "ADDITIONAL_PARTNER");

	/**
	 * The '<em><b>BROKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BROKER_VALUE = 0;

	/**
	 * The '<em><b>CORE PARTNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_PARTNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORE_PARTNER_VALUE = 1;

	/**
	 * The '<em><b>ADDITIONAL PARTNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_PARTNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDITIONAL_PARTNER_VALUE = 2;

	/**
	 * An array of all the '<em><b>EOrganization Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EOrganizationRole[] VALUES_ARRAY =
		new EOrganizationRole[] {
			BROKER,
			CORE_PARTNER,
			ADDITIONAL_PARTNER,
		};

	/**
	 * A public read-only list of all the '<em><b>EOrganization Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EOrganizationRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EOrganization Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOrganizationRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EOrganizationRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EOrganization Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOrganizationRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EOrganizationRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EOrganization Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOrganizationRole get(int value) {
		switch (value) {
			case BROKER_VALUE: return BROKER;
			case CORE_PARTNER_VALUE: return CORE_PARTNER;
			case ADDITIONAL_PARTNER_VALUE: return ADDITIONAL_PARTNER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EOrganizationRole(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EOrganizationRole
