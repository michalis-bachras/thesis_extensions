/**
 */
package goal_metamodel;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.ParallelNode#getNumberOfNodes <em>Number Of Nodes</em>}</li>
 *   <li>{@link goal_metamodel.ParallelNode#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getParallelNode()
 * @model
 * @generated
 */
public interface ParallelNode extends ControlNode {
	
	public ArrayList<ArrayList<ArrayList<String>>> get_allActions_AND_children();
	
	public void set_depth(int depth);
	
	public int get_depth();
	
	public HashSet<String> get_necessary_or_ids();
	
	public void add_necessary_or_ids(String OR_dec_id);
	
	public void set_current_parallel(String P);
	
	public String get_current_parallel();
	
	public void addORGoalNode(GoalNode a);
	
	public ArrayList<GoalNode> getORGoalNodes();
	
	 void addNode(GoalNode g);
	 
	 public void add_invalid_ancestors(HashSet<String> ancestors);
	 
	 public HashSet<String> get_invalid_nodes();
	 
	 public void add_valid_andids(HashSet<String> AND_ids);
	 
	 public HashSet<String> get_valid_andids();
	 
	 public void add_invalid_orids(HashSet<String> OR_ids);
	 
	 public void add_invalid_orid(String OR_id);
	 
	 public HashSet<String> get_invalid_orids();
	 
	 public void add_invalid_node(String node);
	
	 ArrayList<GoalNode> getnodes();
	/**
	 * Returns the value of the '<em><b>Number Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Nodes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Nodes</em>' attribute.
	 * @see #setNumberOfNodes(int)
	 * @see goal_metamodel.Goal_metamodelPackage#getParallelNode_NumberOfNodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNumberOfNodes();

	/**
	 * Sets the value of the '{@link goal_metamodel.ParallelNode#getNumberOfNodes <em>Number Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Nodes</em>' attribute.
	 * @see #getNumberOfNodes()
	 * @generated
	 */
	void setNumberOfNodes(int value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see goal_metamodel.Goal_metamodelPackage#getParallelNode_Timeout()
	 * @model
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link goal_metamodel.ParallelNode#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

} // ParallelNode
