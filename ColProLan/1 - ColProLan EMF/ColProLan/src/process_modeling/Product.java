/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Product#isIsStored <em>Is Stored</em>}</li>
 *   <li>{@link process_modeling.Product#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link process_modeling.Product#getEquivalent <em>Equivalent</em>}</li>
 *   <li>{@link process_modeling.Product#getStorage <em>Storage</em>}</li>
 *   <li>{@link process_modeling.Product#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link process_modeling.Product#isIsFinal <em>Is Final</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends IDNamedElement, Persistable {
	/**
	 * Returns the value of the '<em><b>Is Stored</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stored</em>' attribute.
	 * @see #setIsStored(boolean)
	 * @see process_modeling.Process_modelingPackage#getProduct_IsStored()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsStored();

	/**
	 * Sets the value of the '{@link process_modeling.Product#isIsStored <em>Is Stored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stored</em>' attribute.
	 * @see #isIsStored()
	 * @generated
	 */
	void setIsStored(boolean value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getProduct_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Equivalent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent</em>' reference.
	 * @see #setEquivalent(Product)
	 * @see process_modeling.Process_modelingPackage#getProduct_Equivalent()
	 * @model
	 * @generated
	 */
	Product getEquivalent();

	/**
	 * Sets the value of the '{@link process_modeling.Product#getEquivalent <em>Equivalent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent</em>' reference.
	 * @see #getEquivalent()
	 * @generated
	 */
	void setEquivalent(Product value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' containment reference.
	 * @see #setStorage(Resource)
	 * @see process_modeling.Process_modelingPackage#getProduct_Storage()
	 * @model containment="true"
	 * @generated
	 */
	Resource getStorage();

	/**
	 * Sets the value of the '{@link process_modeling.Product#getStorage <em>Storage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' containment reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Resource value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see process_modeling.Process_modelingPackage#getProduct_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link process_modeling.Product#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see process_modeling.Process_modelingPackage#getProduct_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link process_modeling.Product#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

} // Product
