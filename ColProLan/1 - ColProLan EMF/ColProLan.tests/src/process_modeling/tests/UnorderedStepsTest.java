/**
 */
package process_modeling.tests;

import junit.textui.TestRunner;

import process_modeling.Process_modelingFactory;
import process_modeling.UnorderedSteps;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unordered Steps</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnorderedStepsTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnorderedStepsTest.class);
	}

	/**
	 * Constructs a new Unordered Steps test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnorderedStepsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unordered Steps test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnorderedSteps getFixture() {
		return (UnorderedSteps)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createUnorderedSteps());
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

} //UnorderedStepsTest
