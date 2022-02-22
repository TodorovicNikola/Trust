/**
 */
package process_modeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Traceable#isIsTraced <em>Is Traced</em>}</li>
 *   <li>{@link process_modeling.Traceable#isLogStartTime <em>Log Start Time</em>}</li>
 *   <li>{@link process_modeling.Traceable#isLogEndTime <em>Log End Time</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getTraceable()
 * @model abstract="true"
 * @generated
 */
public interface Traceable extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Traced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Traced</em>' attribute.
	 * @see #setIsTraced(boolean)
	 * @see process_modeling.Process_modelingPackage#getTraceable_IsTraced()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsTraced();

	/**
	 * Sets the value of the '{@link process_modeling.Traceable#isIsTraced <em>Is Traced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Traced</em>' attribute.
	 * @see #isIsTraced()
	 * @generated
	 */
	void setIsTraced(boolean value);

	/**
	 * Returns the value of the '<em><b>Log Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Start Time</em>' attribute.
	 * @see #setLogStartTime(boolean)
	 * @see process_modeling.Process_modelingPackage#getTraceable_LogStartTime()
	 * @model
	 * @generated
	 */
	boolean isLogStartTime();

	/**
	 * Sets the value of the '{@link process_modeling.Traceable#isLogStartTime <em>Log Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Start Time</em>' attribute.
	 * @see #isLogStartTime()
	 * @generated
	 */
	void setLogStartTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Log End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log End Time</em>' attribute.
	 * @see #setLogEndTime(boolean)
	 * @see process_modeling.Process_modelingPackage#getTraceable_LogEndTime()
	 * @model
	 * @generated
	 */
	boolean isLogEndTime();

	/**
	 * Sets the value of the '{@link process_modeling.Traceable#isLogEndTime <em>Log End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log End Time</em>' attribute.
	 * @see #isLogEndTime()
	 * @generated
	 */
	void setLogEndTime(boolean value);

} // Traceable
