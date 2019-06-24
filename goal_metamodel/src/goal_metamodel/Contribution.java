/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Contribution#getType <em>Type</em>}</li>
 *   <li>{@link goal_metamodel.Contribution#getFrom_goalnode <em>From goalnode</em>}</li>
 *   <li>{@link goal_metamodel.Contribution#getTo_goalnode <em>To goalnode</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends Link {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"PPS"</code>.
	 * The literals are from the enumeration {@link goal_metamodel.ContributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see goal_metamodel.ContributionType
	 * @see #setType(ContributionType)
	 * @see goal_metamodel.Goal_metamodelPackage#getContribution_Type()
	 * @model default="PPS"
	 * @generated
	 */
	ContributionType getType();

	/**
	 * Sets the value of the '{@link goal_metamodel.Contribution#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see goal_metamodel.ContributionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContributionType value);

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
	 * @see goal_metamodel.Goal_metamodelPackage#getContribution_From_goalnode()
	 * @model required="true"
	 * @generated
	 */
	GoalNode getFrom_goalnode();

	/**
	 * Sets the value of the '{@link goal_metamodel.Contribution#getFrom_goalnode <em>From goalnode</em>}' reference.
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
	 * @see goal_metamodel.Goal_metamodelPackage#getContribution_To_goalnode()
	 * @model required="true"
	 * @generated
	 */
	GoalNode getTo_goalnode();

	/**
	 * Sets the value of the '{@link goal_metamodel.Contribution#getTo_goalnode <em>To goalnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To goalnode</em>' reference.
	 * @see #getTo_goalnode()
	 * @generated
	 */
	void setTo_goalnode(GoalNode value);

} // Contribution
