/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Link#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends ContextualComponent {

	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(boolean)
	 * @see goal_metamodel.Goal_metamodelPackage#getLink_Available()
	 * @model default="true"
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link goal_metamodel.Link#isAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #isAvailable()
	 * @generated
	 */
	void setAvailable(boolean value);
} // Link
