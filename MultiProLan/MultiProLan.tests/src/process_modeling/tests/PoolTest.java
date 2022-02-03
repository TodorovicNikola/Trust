/**
 */
package process_modeling.tests;

import junit.textui.TestRunner;

import process_modeling.Pool;
import process_modeling.Process_modelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PoolTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PoolTest.class);
	}

	/**
	 * Constructs a new Pool test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pool getFixture() {
		return (Pool)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createPool());
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

} //PoolTest
