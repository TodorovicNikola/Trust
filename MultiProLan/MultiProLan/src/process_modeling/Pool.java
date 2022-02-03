/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Pool#getSwimlanes <em>Swimlanes</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getPool()
 * @model
 * @generated
 */
public interface Pool extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Swimlanes</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.SwimLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swimlanes</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getPool_Swimlanes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwimLane> getSwimlanes();

} // Pool
