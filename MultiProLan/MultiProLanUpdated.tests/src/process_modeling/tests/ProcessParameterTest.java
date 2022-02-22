/**
 */
package process_modeling.tests;

import junit.textui.TestRunner;

import process_modeling.ProcessParameter;
import process_modeling.Process_modelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessParameterTest extends IDNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessParameterTest.class);
	}

	/**
	 * Constructs a new Process Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessParameter getFixture() {
		return (ProcessParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createProcessParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProcessParameterTest
