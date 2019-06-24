/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.ParallelLink#getTo <em>To</em>}</li>
 *   <li>{@link goal_metamodel.ParallelLink#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getParallelLink()
 * @model
 * @generated
 */
public interface ParallelLink extends DependencyLink {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ParallelNode)
	 * @see goal_metamodel.Goal_metamodelPackage#getParallelLink_To()
	 * @model required="true"
	 * @generated
	 */
	ParallelNode getTo();

	/**
	 * Sets the value of the '{@link goal_metamodel.ParallelLink#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ParallelNode value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(GoalNode)
	 * @see goal_metamodel.Goal_metamodelPackage#getParallelLink_From()
	 * @model required="true"
	 * @generated
	 */
	GoalNode getFrom();

	/**
	 * Sets the value of the '{@link goal_metamodel.ParallelLink#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(GoalNode value);

} // ParallelLink
