/**
 */
package process_modeling.tests;

import junit.textui.TestRunner;

import process_modeling.Process_modelingFactory;
import process_modeling.VirtualOrganization;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Organization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualOrganizationTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualOrganizationTest.class);
	}

	/**
	 * Constructs a new Virtual Organization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualOrganizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Virtual Organization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VirtualOrganization getFixture() {
		return (VirtualOrganization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createVirtualOrganization());
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

} //VirtualOrganizationTest
