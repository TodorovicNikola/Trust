/**
 */
package process_modeling.tests;

import junit.textui.TestRunner;

import process_modeling.CollaborativeNetwork;
import process_modeling.Process_modelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collaborative Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborativeNetworkTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollaborativeNetworkTest.class);
	}

	/**
	 * Constructs a new Collaborative Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeNetworkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collaborative Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CollaborativeNetwork getFixture() {
		return (CollaborativeNetwork)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Process_modelingFactory.eINSTANCE.createCollaborativeNetwork());
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

} //CollaborativeNetworkTest
