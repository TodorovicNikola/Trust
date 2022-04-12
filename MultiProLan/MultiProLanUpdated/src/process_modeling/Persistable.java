/**
 */
package process_modeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Persistable#isIsPersisted <em>Is Persisted</em>}</li>
 *   <li>{@link process_modeling.Persistable#getPersistenceType <em>Persistence Type</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getPersistable()
 * @model abstract="true"
 * @generated
 */
public interface Persistable extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Persisted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Persisted</em>' attribute.
	 * @see #setIsPersisted(boolean)
	 * @see process_modeling.Process_modelingPackage#getPersistable_IsPersisted()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPersisted();

	/**
	 * Sets the value of the '{@link process_modeling.Persistable#isIsPersisted <em>Is Persisted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Persisted</em>' attribute.
	 * @see #isIsPersisted()
	 * @generated
	 */
	void setIsPersisted(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EPersistenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see process_modeling.EPersistenceType
	 * @see #setPersistenceType(EPersistenceType)
	 * @see process_modeling.Process_modelingPackage#getPersistable_PersistenceType()
	 * @model required="true"
	 * @generated
	 */
	EPersistenceType getPersistenceType();

	/**
	 * Sets the value of the '{@link process_modeling.Persistable#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see process_modeling.EPersistenceType
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(EPersistenceType value);

} // Persistable
