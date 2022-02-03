/**
 */
package process_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EError Detection</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingPackage#getEErrorDetection()
 * @model
 * @generated
 */
public enum EErrorDetection implements Enumerator {
	/**
	 * The '<em><b>VERY HIGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_HIGH(1, "VERY_HIGH", "VERY_HIGH"),

	/**
	 * The '<em><b>HIGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(2, "HIGH", "HIGH"),

	/**
	 * The '<em><b>MODERATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE(3, "MODERATE", "MODERATE"),

	/**
	 * The '<em><b>LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(4, "LOW", "LOW"),

	/**
	 * The '<em><b>VERY LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_LOW_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_LOW(5, "VERY_LOW", "VERY_LOW"),

	/**
	 * The '<em><b>NON DETECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	NON_DETECTION(6, "NON_DETECTION", "NON_DETECTION");

	/**
	 * The '<em><b>VERY HIGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_HIGH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERY_HIGH_VALUE = 1;

	/**
	 * The '<em><b>HIGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 2;

	/**
	 * The '<em><b>MODERATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_VALUE = 3;

	/**
	 * The '<em><b>LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 4;

	/**
	 * The '<em><b>VERY LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_LOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERY_LOW_VALUE = 5;

	/**
	 * The '<em><b>NON DETECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_DETECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_DETECTION_VALUE = 6;

	/**
	 * An array of all the '<em><b>EError Detection</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EErrorDetection[] VALUES_ARRAY =
		new EErrorDetection[] {
			VERY_HIGH,
			HIGH,
			MODERATE,
			LOW,
			VERY_LOW,
			NON_DETECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>EError Detection</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EErrorDetection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EError Detection</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EErrorDetection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EErrorDetection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EError Detection</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EErrorDetection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EErrorDetection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EError Detection</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EErrorDetection get(int value) {
		switch (value) {
			case VERY_HIGH_VALUE: return VERY_HIGH;
			case HIGH_VALUE: return HIGH;
			case MODERATE_VALUE: return MODERATE;
			case LOW_VALUE: return LOW;
			case VERY_LOW_VALUE: return VERY_LOW;
			case NON_DETECTION_VALUE: return NON_DETECTION;
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
	private EErrorDetection(int value, String name, String literal) {
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
	
} //EErrorDetection
