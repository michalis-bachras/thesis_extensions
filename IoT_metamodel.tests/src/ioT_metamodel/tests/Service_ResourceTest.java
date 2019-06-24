/**
 */
package ioT_metamodel.tests;

import ioT_metamodel.IoT_metamodelFactory;
import ioT_metamodel.Service_Resource;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Service_ResourceTest extends TestCase {

	/**
	 * The fixture for this Service Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Service_Resource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Service_ResourceTest.class);
	}

	/**
	 * Constructs a new Service Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_ResourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Service_Resource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Service_Resource getFixture() {
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
		setFixture(IoT_metamodelFactory.eINSTANCE.createService_Resource());
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

} //Service_ResourceTest
