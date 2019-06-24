/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Resource#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Node {
	
	public Action get_parent_action();
	public void set_parent_action(Action action);

	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(boolean)
	 * @see goal_metamodel.Goal_metamodelPackage#getResource_Available()
	 * @model
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link goal_metamodel.Resource#isAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #isAvailable()
	 * @generated
	 */
	void setAvailable(boolean value);
} // Resource
