/**
 */
package process_modeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Gate#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EGateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EGateType
	 * @see #setType(EGateType)
	 * @see process_modeling.Process_modelingPackage#getGate_Type()
	 * @model required="true"
	 * @generated
	 */
	EGateType getType();

	/**
	 * Sets the value of the '{@link process_modeling.Gate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EGateType
	 * @see #getType()
	 * @generated
	 */
	void setType(EGateType value);

} // Gate
