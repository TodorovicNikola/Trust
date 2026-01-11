/**
 */
package process_modeling.tests;

import junit.textui.TestRunner;

import process_modeling.Capability;
import process_modeling.Process_modelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityTest extends IDNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CapabilityTest.class);
	}

	/**
	 * Constructs a new Capability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Capability getFixture() {
		return (Capability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createCapability());
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

} //CapabilityTest
