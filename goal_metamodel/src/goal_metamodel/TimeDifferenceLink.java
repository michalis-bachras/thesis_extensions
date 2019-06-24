/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Difference Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.TimeDifferenceLink#getTimeDifference <em>Time Difference</em>}</li>
 *   <li>{@link goal_metamodel.TimeDifferenceLink#getFrom_action <em>From action</em>}</li>
 *   <li>{@link goal_metamodel.TimeDifferenceLink#getTo_action <em>To action</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getTimeDifferenceLink()
 * @model
 * @generated
 */
public interface TimeDifferenceLink extends TemporalPrecedence {
	/**
	 * Returns the value of the '<em><b>Time Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Difference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Difference</em>' attribute.
	 * @see #setTimeDifference(long)
	 * @see goal_metamodel.Goal_metamodelPackage#getTimeDifferenceLink_TimeDifference()
	 * @model
	 * @generated
	 */
	long getTimeDifference();

	/**
	 * Sets the value of the '{@link goal_metamodel.TimeDifferenceLink#getTimeDifference <em>Time Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Difference</em>' attribute.
	 * @see #getTimeDifference()
	 * @generated
	 */
	void setTimeDifference(long value);

	/**
	 * Returns the value of the '<em><b>From action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From action</em>' reference.
	 * @see #setFrom_action(Action)
	 * @see goal_metamodel.Goal_metamodelPackage#getTimeDifferenceLink_From_action()
	 * @model required="true"
	 * @generated
	 */
	Action getFrom_action();

	/**
	 * Sets the value of the '{@link goal_metamodel.TimeDifferenceLink#getFrom_action <em>From action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From action</em>' reference.
	 * @see #getFrom_action()
	 * @generated
	 */
	void setFrom_action(Action value);

	/**
	 * Returns the value of the '<em><b>To action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To action</em>' reference.
	 * @see #setTo_action(Action)
	 * @see goal_metamodel.Goal_metamodelPackage#getTimeDifferenceLink_To_action()
	 * @model required="true"
	 * @generated
	 */
	Action getTo_action();

	/**
	 * Sets the value of the '{@link goal_metamodel.TimeDifferenceLink#getTo_action <em>To action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To action</em>' reference.
	 * @see #getTo_action()
	 * @generated
	 */
	void setTo_action(Action value);

} // TimeDifferenceLink
