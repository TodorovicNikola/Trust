/**
 */
package process_modeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.ProcessParameter#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.ProcessParameter#getProduct <em>Product</em>}</li>
 *   <li>{@link process_modeling.ProcessParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getProcessParameter()
 * @model
 * @generated
 */
public interface ProcessParameter extends IDNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EProcessParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EProcessParameterType
	 * @see #setType(EProcessParameterType)
	 * @see process_modeling.Process_modelingPackage#getProcessParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	EProcessParameterType getType();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EProcessParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(EProcessParameterType value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see process_modeling.Process_modelingPackage#getProcessParameter_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessParameter#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ProcessParameter)
	 * @see process_modeling.Process_modelingPackage#getProcessParameter_Parameter()
	 * @model
	 * @generated
	 */
	ProcessParameter getParameter();

	/**
	 * Sets the value of the '{@link process_modeling.ProcessParameter#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ProcessParameter value);

} // ProcessParameter
