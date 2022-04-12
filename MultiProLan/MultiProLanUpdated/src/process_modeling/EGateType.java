/**
 */
package process_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EGate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingPackage#getEGateType()
 * @model
 * @generated
 */
public enum EGateType implements Enumerator {
	/**
	 * The '<em><b>DECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION(0, "DECISION", "DECISION"),

	/**
	 * The '<em><b>PARALLELISM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLELISM_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLELISM(1, "PARALLELISM", "PARALLELISM"),

	/**
	 * The '<em><b>COLLABORATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLABORATION(2, "COLLABORATION", "COLLABORATION"),

	/**
	 * The '<em><b>VARIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIATION_VALUE
	 * @generated
	 * @ordered
	 */
	VARIATION(3, "VARIATION", "VARIATION");

	/**
	 * The '<em><b>DECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_VALUE = 0;

	/**
	 * The '<em><b>PARALLELISM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLELISM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLELISM_VALUE = 1;

	/**
	 * The '<em><b>COLLABORATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLABORATION_VALUE = 2;

	/**
	 * The '<em><b>VARIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARIATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>EGate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EGateType[] VALUES_ARRAY =
		new EGateType[] {
			DECISION,
			PARALLELISM,
			COLLABORATION,
			VARIATION,
		};

	/**
	 * A public read-only list of all the '<em><b>EGate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EGateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EGate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EGateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EGateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EGate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EGateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EGateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EGate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EGateType get(int value) {
		switch (value) {
			case DECISION_VALUE: return DECISION;
			case PARALLELISM_VALUE: return PARALLELISM;
			case COLLABORATION_VALUE: return COLLABORATION;
			case VARIATION_VALUE: return VARIATION;
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
	private EGateType(int value, String name, String literal) {
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
	
} //EGateType
