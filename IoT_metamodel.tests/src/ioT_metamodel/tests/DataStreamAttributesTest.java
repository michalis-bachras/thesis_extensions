/**
 */
package ioT_metamodel.tests;

import ioT_metamodel.DataStreamAttributes;
import ioT_metamodel.IoT_metamodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Stream Attributes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataStreamAttributesTest extends TestCase {

	/**
	 * The fixture for this Data Stream Attributes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStreamAttributes fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataStreamAttributesTest.class);
	}

	/**
	 * Constructs a new Data Stream Attributes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStreamAttributesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Stream Attributes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataStreamAttributes fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Stream Attributes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStreamAttributes getFixture() {
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
		setFixture(IoT_metamodelFactory.eINSTANCE.createDataStreamAttributes());
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

} //DataStreamAttributesTest
