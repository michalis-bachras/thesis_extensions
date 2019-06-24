/**
 */
package goal_metamodel.tests;

import goal_metamodel.Goal_metamodelFactory;
import goal_metamodel.ResourceDependency;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDependencyTest extends DependencyLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceDependencyTest.class);
	}

	/**
	 * Constructs a new Resource Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceDependency getFixture() {
		return (ResourceDependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Goal_metamodelFactory.eINSTANCE.createResourceDependency());
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

} //ResourceDependencyTest
