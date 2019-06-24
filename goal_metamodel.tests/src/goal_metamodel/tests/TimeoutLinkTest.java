/**
 */
package goal_metamodel.tests;

import goal_metamodel.Goal_metamodelFactory;
import goal_metamodel.TimeoutLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timeout Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeoutLinkTest extends TemporalPrecedenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeoutLinkTest.class);
	}

	/**
	 * Constructs a new Timeout Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeoutLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timeout Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeoutLink getFixture() {
		return (TimeoutLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Goal_metamodelFactory.eINSTANCE.createTimeoutLink());
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

} //TimeoutLinkTest
