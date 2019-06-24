/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timeout Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.TimeoutLink#getTimeoutPeriod <em>Timeout Period</em>}</li>
 *   <li>{@link goal_metamodel.TimeoutLink#getFrom_action <em>From action</em>}</li>
 *   <li>{@link goal_metamodel.TimeoutLink#getTo_action <em>To action</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getTimeoutLink()
 * @model
 * @generated
 */
public interface TimeoutLink extends TemporalPrecedence {
	/**
	 * Returns the value of the '<em><b>Timeout Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Period</em>' attribute.
	 * @see #setTimeoutPeriod(long)
	 * @see goal_metamodel.Goal_metamodelPackage#getTimeoutLink_TimeoutPeriod()
	 * @model
	 * @generated
	 */
	long getTimeoutPeriod();

	/**
	 * Sets the value of the '{@link goal_metamodel.TimeoutLink#getTimeoutPeriod <em>Timeout Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Period</em>' attribute.
	 * @see #getTimeoutPeriod()
	 * @generated
	 */
	void setTimeoutPeriod(long value);

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
	 * @see goal_metamodel.Goal_metamodelPackage#getTimeoutLink_From_action()
	 * @model required="true"
	 * @generated
	 */
	Action getFrom_action();

	/**
	 * Sets the value of the '{@link goal_metamodel.TimeoutLink#getFrom_action <em>From action</em>}' reference.
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
	 * @see goal_metamodel.Goal_metamodelPackage#getTimeoutLink_To_action()
	 * @model required="true"
	 * @generated
	 */
	Action getTo_action();

	/**
	 * Sets the value of the '{@link goal_metamodel.TimeoutLink#getTo_action <em>To action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To action</em>' reference.
	 * @see #getTo_action()
	 * @generated
	 */
	void setTo_action(Action value);

} // TimeoutLink
