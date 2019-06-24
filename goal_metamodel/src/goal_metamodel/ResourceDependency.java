/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.ResourceDependency#getTo_resource <em>To resource</em>}</li>
 *   <li>{@link goal_metamodel.ResourceDependency#getFrom_action <em>From action</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getResourceDependency()
 * @model
 * @generated
 */
public interface ResourceDependency extends DependencyLink {
	/**
	 * Returns the value of the '<em><b>To resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To resource</em>' reference.
	 * @see #setTo_resource(Resource)
	 * @see goal_metamodel.Goal_metamodelPackage#getResourceDependency_To_resource()
	 * @model required="true"
	 * @generated
	 */
	Resource getTo_resource();

	/**
	 * Sets the value of the '{@link goal_metamodel.ResourceDependency#getTo_resource <em>To resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To resource</em>' reference.
	 * @see #getTo_resource()
	 * @generated
	 */
	void setTo_resource(Resource value);

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
	 * @see goal_metamodel.Goal_metamodelPackage#getResourceDependency_From_action()
	 * @model required="true"
	 * @generated
	 */
	Action getFrom_action();

	/**
	 * Sets the value of the '{@link goal_metamodel.ResourceDependency#getFrom_action <em>From action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From action</em>' reference.
	 * @see #getFrom_action()
	 * @generated
	 */
	void setFrom_action(Action value);

} // ResourceDependency
