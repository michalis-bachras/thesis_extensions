/**
 */
package goal_metamodel;

import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Task#getHasdecomposition <em>Hasdecomposition</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends GoalNode {
	/**
	 * Returns the value of the '<em><b>Hasdecomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hasdecomposition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasdecomposition</em>' containment reference.
	 * @see #setHasdecomposition(Decomposition)
	 * @see goal_metamodel.Goal_metamodelPackage#getTask_Hasdecomposition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Decomposition getHasdecomposition();

	/**
	 * Sets the value of the '{@link goal_metamodel.Task#getHasdecomposition <em>Hasdecomposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hasdecomposition</em>' containment reference.
	 * @see #getHasdecomposition()
	 * @generated
	 */
	void setHasdecomposition(Decomposition value);
	
	public void setOuterList(ArrayList<String> arraylist);
	
	public void equateOuterList(ArrayList<ArrayList<String>> list);
	
	public ArrayList<ArrayList<String>> getOuterList();
	
	

} // Task
