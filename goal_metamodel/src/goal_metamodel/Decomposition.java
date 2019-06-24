/**
 */
package goal_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Decomposition#getType <em>Type</em>}</li>
 *   <li>{@link goal_metamodel.Decomposition#getDecomposed_to <em>Decomposed to</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getDecomposition()
 * @model
 * @generated
 */
public interface Decomposition extends ContextualComponent {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link goal_metamodel.DecompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see goal_metamodel.DecompositionType
	 * @see #setType(DecompositionType)
	 * @see goal_metamodel.Goal_metamodelPackage#getDecomposition_Type()
	 * @model default="AND"
	 * @generated
	 */
	DecompositionType getType();

	/**
	 * Sets the value of the '{@link goal_metamodel.Decomposition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see goal_metamodel.DecompositionType
	 * @see #getType()
	 * @generated
	 */
	void setType(DecompositionType value);

	/**
	 * Returns the value of the '<em><b>Decomposed to</b></em>' containment reference list.
	 * The list contents are of type {@link goal_metamodel.GoalNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposed to</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposed to</em>' containment reference list.
	 * @see goal_metamodel.Goal_metamodelPackage#getDecomposition_Decomposed_to()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GoalNode> getDecomposed_to();
	
	public void setORid(String OR_id);
	
	public String getORid();
	
	public void setANDid(String AND_id);
	
	public String getANDid();
	
	public void set_OR_dec_id(String OR_dec_id);
	
	public String get_OR_dec_id();

} // Decomposition
