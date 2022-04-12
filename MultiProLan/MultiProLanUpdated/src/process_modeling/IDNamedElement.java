/**
 */
package process_modeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.IDNamedElement#getId <em>Id</em>}</li>
 *   <li>{@link process_modeling.IDNamedElement#getName <em>Name</em>}</li>
 *   <li>{@link process_modeling.IDNamedElement#isExposeToCollaboratingParties <em>Expose To Collaborating Parties</em>}</li>
 *   <li>{@link process_modeling.IDNamedElement#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getIDNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface IDNamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see process_modeling.Process_modelingPackage#getIDNamedElement_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link process_modeling.IDNamedElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see process_modeling.Process_modelingPackage#getIDNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link process_modeling.IDNamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expose To Collaborating Parties</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose To Collaborating Parties</em>' attribute.
	 * @see #setExposeToCollaboratingParties(boolean)
	 * @see process_modeling.Process_modelingPackage#getIDNamedElement_ExposeToCollaboratingParties()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isExposeToCollaboratingParties();

	/**
	 * Sets the value of the '{@link process_modeling.IDNamedElement#isExposeToCollaboratingParties <em>Expose To Collaborating Parties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose To Collaborating Parties</em>' attribute.
	 * @see #isExposeToCollaboratingParties()
	 * @generated
	 */
	void setExposeToCollaboratingParties(boolean value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see process_modeling.Process_modelingPackage#getIDNamedElement_Alias()
	 * @model default=""
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link process_modeling.IDNamedElement#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // IDNamedElement
