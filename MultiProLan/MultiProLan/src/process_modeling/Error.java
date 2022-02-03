/**
 */
package process_modeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process_modeling.Error#getDomain <em>Domain</em>}</li>
 *   <li>{@link process_modeling.Error#getType <em>Type</em>}</li>
 *   <li>{@link process_modeling.Error#getStatus <em>Status</em>}</li>
 *   <li>{@link process_modeling.Error#getMessage <em>Message</em>}</li>
 *   <li>{@link process_modeling.Error#getDescription <em>Description</em>}</li>
 *   <li>{@link process_modeling.Error#getMode <em>Mode</em>}</li>
 *   <li>{@link process_modeling.Error#getEffect <em>Effect</em>}</li>
 *   <li>{@link process_modeling.Error#getCause <em>Cause</em>}</li>
 *   <li>{@link process_modeling.Error#getPrevention <em>Prevention</em>}</li>
 *   <li>{@link process_modeling.Error#getSeverity <em>Severity</em>}</li>
 *   <li>{@link process_modeling.Error#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link process_modeling.Error#getDetection <em>Detection</em>}</li>
 *   <li>{@link process_modeling.Error#getGlobalErrorHandler <em>Global Error Handler</em>}</li>
 *   <li>{@link process_modeling.Error#getLocalErrorHandler <em>Local Error Handler</em>}</li>
 * </ul>
 *
 * @see process_modeling.Process_modelingPackage#getError()
 * @model
 * @generated
 */
public interface Error extends IDNamedElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EErrorDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see process_modeling.EErrorDomain
	 * @see #setDomain(EErrorDomain)
	 * @see process_modeling.Process_modelingPackage#getError_Domain()
	 * @model required="true"
	 * @generated
	 */
	EErrorDomain getDomain();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see process_modeling.EErrorDomain
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(EErrorDomain value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NAMED_ERROR"</code>.
	 * The literals are from the enumeration {@link process_modeling.EErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EErrorType
	 * @see #setType(EErrorType)
	 * @see process_modeling.Process_modelingPackage#getError_Type()
	 * @model default="NAMED_ERROR" required="true"
	 * @generated
	 */
	EErrorType getType();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see process_modeling.EErrorType
	 * @see #getType()
	 * @generated
	 */
	void setType(EErrorType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link process_modeling.EErrorStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see process_modeling.EErrorStatus
	 * @see #setStatus(EErrorStatus)
	 * @see process_modeling.Process_modelingPackage#getError_Status()
	 * @model required="true"
	 * @generated
	 */
	EErrorStatus getStatus();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see process_modeling.EErrorStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EErrorStatus value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see process_modeling.Process_modelingPackage#getError_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see process_modeling.Process_modelingPackage#getError_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see process_modeling.Process_modelingPackage#getError_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see process_modeling.Process_modelingPackage#getError_Effect()
	 * @model
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' attribute.
	 * @see #setCause(String)
	 * @see process_modeling.Process_modelingPackage#getError_Cause()
	 * @model
	 * @generated
	 */
	String getCause();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getCause <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' attribute.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(String value);

	/**
	 * Returns the value of the '<em><b>Prevention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prevention</em>' attribute.
	 * @see #setPrevention(String)
	 * @see process_modeling.Process_modelingPackage#getError_Prevention()
	 * @model
	 * @generated
	 */
	String getPrevention();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getPrevention <em>Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prevention</em>' attribute.
	 * @see #getPrevention()
	 * @generated
	 */
	void setPrevention(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(int)
	 * @see process_modeling.Process_modelingPackage#getError_Severity()
	 * @model
	 * @generated
	 */
	int getSeverity();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(int value);

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' attribute.
	 * @see #setOccurrence(int)
	 * @see process_modeling.Process_modelingPackage#getError_Occurrence()
	 * @model
	 * @generated
	 */
	int getOccurrence();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' attribute.
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(int value);

	/**
	 * Returns the value of the '<em><b>Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detection</em>' attribute.
	 * @see #setDetection(int)
	 * @see process_modeling.Process_modelingPackage#getError_Detection()
	 * @model
	 * @generated
	 */
	int getDetection();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getDetection <em>Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detection</em>' attribute.
	 * @see #getDetection()
	 * @generated
	 */
	void setDetection(int value);

	/**
	 * Returns the value of the '<em><b>Global Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Error Handler</em>' reference.
	 * @see #setGlobalErrorHandler(process_modeling.Process)
	 * @see process_modeling.Process_modelingPackage#getError_GlobalErrorHandler()
	 * @model
	 * @generated
	 */
	process_modeling.Process getGlobalErrorHandler();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getGlobalErrorHandler <em>Global Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Error Handler</em>' reference.
	 * @see #getGlobalErrorHandler()
	 * @generated
	 */
	void setGlobalErrorHandler(process_modeling.Process value);

	/**
	 * Returns the value of the '<em><b>Local Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Error Handler</em>' reference.
	 * @see #setLocalErrorHandler(ProcessElement)
	 * @see process_modeling.Process_modelingPackage#getError_LocalErrorHandler()
	 * @model
	 * @generated
	 */
	ProcessElement getLocalErrorHandler();

	/**
	 * Sets the value of the '{@link process_modeling.Error#getLocalErrorHandler <em>Local Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Error Handler</em>' reference.
	 * @see #getLocalErrorHandler()
	 * @generated
	 */
	void setLocalErrorHandler(ProcessElement value);

} // Error
