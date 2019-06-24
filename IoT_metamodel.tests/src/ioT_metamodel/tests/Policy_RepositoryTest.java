/**
 */
package ioT_metamodel.tests;

import ioT_metamodel.IoT_metamodelFactory;
import ioT_metamodel.Policy_Repository;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Policy Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Policy_RepositoryTest extends TestCase {

	/**
	 * The fixture for this Policy Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Policy_Repository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Policy_RepositoryTest.class);
	}

	/**
	 * Constructs a new Policy Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy_RepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Policy Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Policy_Repository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Policy Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Policy_Repository getFixture() {
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
		setFixture(IoT_metamodelFactory.eINSTANCE.createPolicy_Repository());
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

} //Policy_RepositoryTest
