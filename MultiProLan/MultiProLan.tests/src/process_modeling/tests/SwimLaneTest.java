/**
 */
package process_modeling.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import process_modeling.Process_modelingFactory;
import process_modeling.SwimLane;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Swim Lane</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwimLaneTest extends TestCase {

	/**
	 * The fixture for this Swim Lane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwimLane fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwimLaneTest.class);
	}

	/**
	 * Constructs a new Swim Lane test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwimLaneTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Swim Lane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SwimLane fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Swim Lane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwimLane getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createSwimLane());
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

} //SwimLaneTest
