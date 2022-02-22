/**
 */
package process_modeling.tests;

import junit.textui.TestRunner;

import process_modeling.Process_modelingFactory;
import process_modeling.SubProcess;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubProcessTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubProcessTest.class);
	}

	/**
	 * Constructs a new Sub Process test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sub Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubProcess getFixture() {
		return (SubProcess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createSubProcess());
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

} //SubProcessTest
