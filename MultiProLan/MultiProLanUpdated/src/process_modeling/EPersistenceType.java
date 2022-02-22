/**
 */
package process_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EPersistence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingPackage#getEPersistenceType()
 * @model
 * @generated
 */
public enum EPersistenceType implements Enumerator {
	/**
	 * The '<em><b>HASHED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASHED_VALUE
	 * @generated
	 * @ordered
	 */
	HASHED(0, "HASHED", "HASHED"),

	/**
	 * The '<em><b>ENCRYPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ENCRYPTED(1, "ENCRYPTED", "ENCRYPTED"),

	/**
	 * The '<em><b>PLAIN TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PLAIN_TEXT(2, "PLAIN_TEXT", "PLAIN_TEXT");

	/**
	 * The '<em><b>HASHED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASHED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HASHED_VALUE = 0;

	/**
	 * The '<em><b>ENCRYPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENCRYPTED_VALUE = 1;

	/**
	 * The '<em><b>PLAIN TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAIN_TEXT_VALUE = 2;

	/**
	 * An array of all the '<em><b>EPersistence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EPersistenceType[] VALUES_ARRAY =
		new EPersistenceType[] {
			HASHED,
			ENCRYPTED,
			PLAIN_TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>EPersistence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EPersistenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EPersistence Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPersistenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPersistenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPersistence Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPersistenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPersistenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPersistence Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPersistenceType get(int value) {
		switch (value) {
			case HASHED_VALUE: return HASHED;
			case ENCRYPTED_VALUE: return ENCRYPTED;
			case PLAIN_TEXT_VALUE: return PLAIN_TEXT;
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
	private EPersistenceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	
} //EPersistenceType
