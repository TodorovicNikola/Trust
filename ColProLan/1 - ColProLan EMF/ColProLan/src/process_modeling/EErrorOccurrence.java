/**
 */
package process_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EError Occurrence</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingPackage#getEErrorOccurrence()
 * @model
 * @generated
 */
public enum EErrorOccurrence implements Enumerator {
	/**
	 * The '<em><b>REMOTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE(1, "REMOTE", "REMOTE"),

	/**
	 * The '<em><b>VERY LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_LOW_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_LOW(2, "VERY_LOW", "VERY_LOW"),

	/**
	 * The '<em><b>LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(3, "LOW", "LOW"),

	/**
	 * The '<em><b>MODERATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE(4, "MODERATE", "MODERATE"),

	/**
	 * The '<em><b>HIGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(5, "HIGH", "HIGH"),

	/**
	 * The '<em><b>VERY HIGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_HIGH(6, "VERY_HIGH", "VERY_HIGH");

	/**
	 * The '<em><b>REMOTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_VALUE = 1;

	/**
	 * The '<em><b>VERY LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_LOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERY_LOW_VALUE = 2;

	/**
	 * The '<em><b>LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 3;

	/**
	 * The '<em><b>MODERATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_VALUE = 4;

	/**
	 * The '<em><b>HIGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 5;

	/**
	 * The '<em><b>VERY HIGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_HIGH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERY_HIGH_VALUE = 6;

	/**
	 * An array of all the '<em><b>EError Occurrence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EErrorOccurrence[] VALUES_ARRAY =
		new EErrorOccurrence[] {
			REMOTE,
			VERY_LOW,
			LOW,
			MODERATE,
			HIGH,
			VERY_HIGH,
		};

	/**
	 * A public read-only list of all the '<em><b>EError Occurrence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EErrorOccurrence> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EError Occurrence</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EErrorOccurrence get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EErrorOccurrence result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EError Occurrence</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EErrorOccurrence getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EErrorOccurrence result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EError Occurrence</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EErrorOccurrence get(int value) {
		switch (value) {
			case REMOTE_VALUE: return REMOTE;
			case VERY_LOW_VALUE: return VERY_LOW;
			case LOW_VALUE: return LOW;
			case MODERATE_VALUE: return MODERATE;
			case HIGH_VALUE: return HIGH;
			case VERY_HIGH_VALUE: return VERY_HIGH;
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
	private EErrorOccurrence(int value, String name, String literal) {
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
	
} //EErrorOccurrence
