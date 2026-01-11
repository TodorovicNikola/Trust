/**
 */
package process_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EProcess Step Notation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingPackage#getEProcessStepNotation()
 * @model
 * @generated
 */
public enum EProcessStepNotation implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>OPERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION(1, "OPERATION", "OPERATION"),

	/**
	 * The '<em><b>INSPECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INSPECTION(2, "INSPECTION", "INSPECTION"),

	/**
	 * The '<em><b>TRANSPORTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPORTATION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPORTATION(3, "TRANSPORTATION", "TRANSPORTATION"),

	/**
	 * The '<em><b>CONFIGURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION(4, "CONFIGURATION", "CONFIGURATION"),

	/**
	 * The '<em><b>DELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	DELAY(5, "DELAY", "DELAY");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>OPERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_VALUE = 1;

	/**
	 * The '<em><b>INSPECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_VALUE = 2;

	/**
	 * The '<em><b>TRANSPORTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPORTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPORTATION_VALUE = 3;

	/**
	 * The '<em><b>CONFIGURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_VALUE = 4;

	/**
	 * The '<em><b>DELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELAY_VALUE = 5;

	/**
	 * An array of all the '<em><b>EProcess Step Notation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EProcessStepNotation[] VALUES_ARRAY =
		new EProcessStepNotation[] {
			NONE,
			OPERATION,
			INSPECTION,
			TRANSPORTATION,
			CONFIGURATION,
			DELAY,
		};

	/**
	 * A public read-only list of all the '<em><b>EProcess Step Notation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EProcessStepNotation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EProcess Step Notation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EProcessStepNotation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EProcessStepNotation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EProcess Step Notation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EProcessStepNotation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EProcessStepNotation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EProcess Step Notation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EProcessStepNotation get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case OPERATION_VALUE: return OPERATION;
			case INSPECTION_VALUE: return INSPECTION;
			case TRANSPORTATION_VALUE: return TRANSPORTATION;
			case CONFIGURATION_VALUE: return CONFIGURATION;
			case DELAY_VALUE: return DELAY;
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
	private EProcessStepNotation(int value, String name, String literal) {
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
	
} //EProcessStepNotation
