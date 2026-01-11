/**
 */
package process_modeling;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.Relationship#getLogicalCondition <em>Logical Condition</em>}</li>
 *   <li>{@link process_modeling.Relationship#getMessage <em>Message</em>}</li>
 *   <li>{@link process_modeling.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link process_modeling.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneRelationBetweenElements'"
 * @generated
 */
public interface Relationship extends IDNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.ERelationshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see process_modeling.ERelationshipType
	 * @see #setType(ERelationshipType)
	 * @see process_modeling.Process_modelingPackage#getRelationship_Type()
	 * @model required="true"
	 * @generated
	 */
	ERelationshipType getType();

	/**
	 * Sets the value of the '{@link process_modeling.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see process_modeling.ERelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(ERelationshipType value);

	/**
	 * Returns the value of the '<em><b>Logical Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Condition</em>' attribute.
	 * @see #setLogicalCondition(String)
	 * @see process_modeling.Process_modelingPackage#getRelationship_LogicalCondition()
	 * @model
	 * @generated
	 */
	String getLogicalCondition();

	/**
	 * Sets the value of the '{@link process_modeling.Relationship#getLogicalCondition <em>Logical Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Condition</em>' attribute.
	 * @see #getLogicalCondition()
	 * @generated
	 */
	void setLogicalCondition(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see process_modeling.Process_modelingPackage#getRelationship_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link process_modeling.Relationship#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link process_modeling.ProcessElement#getOutRelationships <em>Out Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ProcessElement)
	 * @see process_modeling.Process_modelingPackage#getRelationship_Source()
	 * @see process_modeling.ProcessElement#getOutRelationships
	 * @model opposite="outRelationships" required="true"
	 * @generated
	 */
	ProcessElement getSource();

	/**
	 * Sets the value of the '{@link process_modeling.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ProcessElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link process_modeling.ProcessElement#getInRelationships <em>In Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ProcessElement)
	 * @see process_modeling.Process_modelingPackage#getRelationship_Target()
	 * @see process_modeling.ProcessElement#getInRelationships
	 * @model opposite="inRelationships" required="true"
	 * @generated
	 */
	ProcessElement getTarget();

	/**
	 * Sets the value of the '{@link process_modeling.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ProcessElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tRelationship.allInstances()-&gt;forAll(r | (r.type = ERelationshipType::COLLABORATION) implies (r.target.oclIsTypeOf(ProcessStep) and r.source.oclIsTypeOf(ProcessStep)))'"
	 * @generated
	 */
	boolean collaborationBetweenSteps(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tRelationship.allInstances()-&gt;forAll(r | (r.type = ERelationshipType::FLOW) implies ((r.target.oclIsTypeOf(ProcessStep) or r.target.oclIsTypeOf(Gate)) and\n\t\t\t\t(r.source.oclIsTypeOf(ProcessStep) or r.source.oclIsTypeOf(Gate))))'"
	 * @generated
	 */
	boolean flowBetweenStepsAndGates(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tRelationship.allInstances()-&gt;forAll(r1, r2 | ((r1.target.id = r2.target.id and r1.source.id = r2.source.id) or\n\t\t\t\t(r1.target.id = r2.source.id and r1.source.id = r2.target.id) implies (r1 = r2)))'"
	 * @generated
	 */
	boolean onlyOneRelationBetweenElements(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Relationship
