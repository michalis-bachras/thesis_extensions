/**
 */
package goal_metamodel.tests;

import goal_metamodel.Goal_metamodelFactory;
import goal_metamodel.ParallelLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parallel Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParallelLinkTest extends DependencyLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParallelLinkTest.class);
	}

	/**
	 * Constructs a new Parallel Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parallel Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParallelLink getFixture() {
		return (ParallelLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Goal_metamodelFactory.eINSTANCE.createParallelLink());
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

} //ParallelLinkTest
