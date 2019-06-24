/**
 */
package goal_metamodel.tests;

import goal_metamodel.Goal_metamodelFactory;
import goal_metamodel.TemporalLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalLinkTest extends DependencyLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalLinkTest.class);
	}

	/**
	 * Constructs a new Temporal Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Temporal Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TemporalLink getFixture() {
		return (TemporalLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Goal_metamodelFactory.eINSTANCE.createTemporalLink());
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

} //TemporalLinkTest
