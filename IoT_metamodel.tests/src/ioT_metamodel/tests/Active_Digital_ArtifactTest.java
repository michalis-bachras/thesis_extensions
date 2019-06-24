/**
 */
package ioT_metamodel.tests;

import ioT_metamodel.Active_Digital_Artifact;
import ioT_metamodel.IoT_metamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Active Digital Artifact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Active_Digital_ArtifactTest extends Digital_ArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Active_Digital_ArtifactTest.class);
	}

	/**
	 * Constructs a new Active Digital Artifact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Active_Digital_ArtifactTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Active Digital Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Active_Digital_Artifact getFixture() {
		return (Active_Digital_Artifact)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IoT_metamodelFactory.eINSTANCE.createActive_Digital_Artifact());
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

} //Active_Digital_ArtifactTest
