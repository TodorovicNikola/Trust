/**
 */
package process_modeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Constraint#getPhysicalDimension <em>Physical Dimension</em>}</li>
 *   <li>{@link process_modeling.Constraint#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link process_modeling.Constraint#getValue <em>Value</em>}</li>
 *   <li>{@link process_modeling.Constraint#getMetricUnit <em>Metric Unit</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends IDNamedElement, Persistable {
	/**
	 * Returns the value of the '<em><b>Physical Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Dimension</em>' attribute.
	 * @see #setPhysicalDimension(String)
	 * @see process_modeling.Process_modelingPackage#getConstraint_PhysicalDimension()
	 * @model required="true"
	 * @generated
	 */
	String getPhysicalDimension();

	/**
	 * Sets the value of the '{@link process_modeling.Constraint#getPhysicalDimension <em>Physical Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Dimension</em>' attribute.
	 * @see #getPhysicalDimension()
	 * @generated
	 */
	void setPhysicalDimension(String value);

	/**
	 * Returns the value of the '<em><b>Relational Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Operator</em>' attribute.
	 * @see #setRelationalOperator(String)
	 * @see process_modeling.Process_modelingPackage#getConstraint_RelationalOperator()
	 * @model required="true"
	 * @generated
	 */
	String getRelationalOperator();

	/**
	 * Sets the value of the '{@link process_modeling.Constraint#getRelationalOperator <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Operator</em>' attribute.
	 * @see #getRelationalOperator()
	 * @generated
	 */
	void setRelationalOperator(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see process_modeling.Process_modelingPackage#getConstraint_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link process_modeling.Constraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Metric Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Unit</em>' attribute.
	 * @see #setMetricUnit(String)
	 * @see process_modeling.Process_modelingPackage#getConstraint_MetricUnit()
	 * @model
	 * @generated
	 */
	String getMetricUnit();

	/**
	 * Sets the value of the '{@link process_modeling.Constraint#getMetricUnit <em>Metric Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Unit</em>' attribute.
	 * @see #getMetricUnit()
	 * @generated
	 */
	void setMetricUnit(String value);

} // Constraint
