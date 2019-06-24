/**
 */
package aDG_metamodel.tests;

import aDG_metamodel.ADG_metamodelFactory;
import aDG_metamodel.SplitNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Split Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplitNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SplitNodeTest.class);
	}

	/**
	 * Constructs a new Split Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Split Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SplitNode getFixture() {
		return (SplitNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADG_metamodelFactory.eINSTANCE.createSplitNode());
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

} //SplitNodeTest
