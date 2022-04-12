/**
 */
package process_modeling.tests;

import junit.textui.TestRunner;

import process_modeling.ContractualObligation;
import process_modeling.Process_modelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contractual Obligation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContractualObligationTest extends PersistableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContractualObligationTest.class);
	}

	/**
	 * Constructs a new Contractual Obligation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractualObligationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Contractual Obligation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContractualObligation getFixture() {
		return (ContractualObligation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createContractualObligation());
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

} //ContractualObligationTest
