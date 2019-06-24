/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.LogicalPrecedence#getFrom_goalnode <em>From goalnode</em>}</li>
 *   <li>{@link goal_metamodel.LogicalPrecedence#getTo_goalnode <em>To goalnode</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getLogicalPrecedence()
 * @model
 * @generated
 */
public interface LogicalPrecedence extends DependencyLink {
	/**
	 * Returns the value of the '<em><b>From goalnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From goalnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From goalnode</em>' reference.
	 * @see #setFrom_goalnode(GoalNode)
	 * @see goal_metamodel.Goal_metamodelPackage#getLogicalPrecedence_From_goalnode()
	 * @model required="true"
	 * @generated
	 */
	GoalNode getFrom_goalnode();

	/**
	 * Sets the value of the '{@link goal_metamodel.LogicalPrecedence#getFrom_goalnode <em>From goalnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From goalnode</em>' reference.
	 * @see #getFrom_goalnode()
	 * @generated
	 */
	void setFrom_goalnode(GoalNode value);

	/**
	 * Returns the value of the '<em><b>To goalnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To goalnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To goalnode</em>' reference.
	 * @see #setTo_goalnode(GoalNode)
	 * @see goal_metamodel.Goal_metamodelPackage#getLogicalPrecedence_To_goalnode()
	 * @model required="true"
	 * @generated
	 */
	GoalNode getTo_goalnode();

	/**
	 * Sets the value of the '{@link goal_metamodel.LogicalPrecedence#getTo_goalnode <em>To goalnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To goalnode</em>' reference.
	 * @see #getTo_goalnode()
	 * @generated
	 */
	void setTo_goalnode(GoalNode value);

} // LogicalPrecedence
