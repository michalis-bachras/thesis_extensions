/**
 */
package ioT_metamodel.tests;

import ioT_metamodel.Analytics_Engine;
import ioT_metamodel.IoT_metamodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analytics Engine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Analytics_EngineTest extends TestCase {

	/**
	 * The fixture for this Analytics Engine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Analytics_Engine fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Analytics_EngineTest.class);
	}

	/**
	 * Constructs a new Analytics Engine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analytics_EngineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Analytics Engine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Analytics_Engine fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Analytics Engine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Analytics_Engine getFixture() {
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
		setFixture(IoT_metamodelFactory.eINSTANCE.createAnalytics_Engine());
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

} //Analytics_EngineTest
