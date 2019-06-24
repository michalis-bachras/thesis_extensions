/**
 */
package goal_metamodel.tests;

import goal_metamodel.Goal_metamodelFactory;
import goal_metamodel.TimeDifferenceLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Difference Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeDifferenceLinkTest extends TemporalPrecedenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeDifferenceLinkTest.class);
	}

	/**
	 * Constructs a new Time Difference Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDifferenceLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Difference Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeDifferenceLink getFixture() {
		return (TimeDifferenceLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Goal_metamodelFactory.eINSTANCE.createTimeDifferenceLink());
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

} //TimeDifferenceLinkTest
