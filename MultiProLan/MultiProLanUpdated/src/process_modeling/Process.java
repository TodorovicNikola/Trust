/**
 */
package process_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Process#getVersion <em>Version</em>}</li>
 *   <li>{@link process_modeling.Process#getElements <em>Elements</em>}</li>
 *   <li>{@link process_modeling.Process#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link process_modeling.Process#getStartStep <em>Start Step</em>}</li>
 *   <li>{@link process_modeling.Process#getUnidentifiedErrorHandler <em>Unidentified Error Handler</em>}</li>
 *   <li>{@link process_modeling.Process#isProposedProcess <em>Proposed Process</em>}</li>
 *   <li>{@link process_modeling.Process#getCompany <em>Company</em>}</li>
 *   <li>{@link process_modeling.Process#getAuthor <em>Author</em>}</li>
 *   <li>{@link process_modeling.Process#getDate <em>Date</em>}</li>
 *   <li>{@link process_modeling.Process#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneStartProcessStep oneStartProcessStep2 oneEndProcessStep mustExistsStart mustExistsEnd'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot oneStartProcessStep='\n\t\t\tProcessStep.allInstances()-&gt;forAll(ps1, ps2 | ((ps1.type = EProcessStepType::START) and (ps2.type = EProcessStepType::START)) implies (ps1 = ps2))' oneStartProcessStep2='\n\t\t\tnot(ProcessStep.allInstances()-&gt;exists(ps1, ps2 | ps1.type = EProcessStepType::START and ps2.type = EProcessStepType::START and ps1 &lt;&gt; ps2))' oneEndProcessStep='\n\t\t\tProcessStep.allInstances()-&gt;forAll(ps1, ps2 | ((ps1.type = EProcessStepType::END) and (ps2.type = EProcessStepType::END)) implies (ps1 = ps2))' mustExistsStart='\n\t\t\tProcessStep.allInstances()-&gt;exists(ps | ps.type = EProcessStepType::START)' mustExistsEnd='\n\t\t\tProcessStep.allInstances()-&gt;exists(ps | ps.type = EProcessStepType::END)'"
 * @generated
 */
public interface Process extends IDNamedElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see process_modeling.Process_modelingPackage#getProcess_Version()
	 * @model required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link process_modeling.Process#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.ProcessElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getProcess_Elements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ProcessElement> getElements();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getProcess_Relationships()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Start Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Step</em>' reference.
	 * @see #setStartStep(ProcessStep)
	 * @see process_modeling.Process_modelingPackage#getProcess_StartStep()
	 * @model required="true"
	 * @generated
	 */
	ProcessStep getStartStep();

	/**
	 * Sets the value of the '{@link process_modeling.Process#getStartStep <em>Start Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Step</em>' reference.
	 * @see #getStartStep()
	 * @generated
	 */
	void setStartStep(ProcessStep value);

	/**
	 * Returns the value of the '<em><b>Unidentified Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidentified Error Handler</em>' reference.
	 * @see #setUnidentifiedErrorHandler(Process)
	 * @see process_modeling.Process_modelingPackage#getProcess_UnidentifiedErrorHandler()
	 * @model
	 * @generated
	 */
	Process getUnidentifiedErrorHandler();

	/**
	 * Sets the value of the '{@link process_modeling.Process#getUnidentifiedErrorHandler <em>Unidentified Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidentified Error Handler</em>' reference.
	 * @see #getUnidentifiedErrorHandler()
	 * @generated
	 */
	void setUnidentifiedErrorHandler(Process value);

	/**
	 * Returns the value of the '<em><b>Proposed Process</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Process</em>' attribute.
	 * @see #setProposedProcess(boolean)
	 * @see process_modeling.Process_modelingPackage#getProcess_ProposedProcess()
	 * @model default="true"
	 * @generated
	 */
	boolean isProposedProcess();

	/**
	 * Sets the value of the '{@link process_modeling.Process#isProposedProcess <em>Proposed Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Process</em>' attribute.
	 * @see #isProposedProcess()
	 * @generated
	 */
	void setProposedProcess(boolean value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see #setCompany(String)
	 * @see process_modeling.Process_modelingPackage#getProcess_Company()
	 * @model
	 * @generated
	 */
	String getCompany();

	/**
	 * Sets the value of the '{@link process_modeling.Process#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see process_modeling.Process_modelingPackage#getProcess_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link process_modeling.Process#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see process_modeling.Process_modelingPackage#getProcess_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link process_modeling.Process#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link process_modeling.ProcessParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see process_modeling.Process_modelingPackage#getProcess_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessParameter> getParameters();

} // Process
