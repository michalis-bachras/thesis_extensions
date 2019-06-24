/**
 */
package ioT_metamodel.tests;

import ioT_metamodel.IoT_metamodelFactory;
import ioT_metamodel.Network_Resource;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Network_ResourceTest extends InformationResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Network_ResourceTest.class);
	}

	/**
	 * Constructs a new Network Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network_ResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Network_Resource getFixture() {
		return (Network_Resource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IoT_metamodelFactory.eINSTANCE.createNetwork_Resource());
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

} //Network_ResourceTest
