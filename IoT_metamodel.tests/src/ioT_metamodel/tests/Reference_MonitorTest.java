/**
 */
package ioT_metamodel.tests;

import ioT_metamodel.IoT_metamodelFactory;
import ioT_metamodel.Reference_Monitor;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reference Monitor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Reference_MonitorTest extends TestCase {

	/**
	 * The fixture for this Reference Monitor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reference_Monitor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Reference_MonitorTest.class);
	}

	/**
	 * Constructs a new Reference Monitor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference_MonitorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reference Monitor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Reference_Monitor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reference Monitor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reference_Monitor getFixture() {
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
		setFixture(IoT_metamodelFactory.eINSTANCE.createReference_Monitor());
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

} //Reference_MonitorTest
