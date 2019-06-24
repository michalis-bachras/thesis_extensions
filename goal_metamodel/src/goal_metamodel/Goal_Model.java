/**
 */
package goal_metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Goal_Model#getContextcondition <em>Contextcondition</em>}</li>
 *   <li>{@link goal_metamodel.Goal_Model#getLink <em>Link</em>}</li>
 *   <li>{@link goal_metamodel.Goal_Model#getRefers_to <em>Refers to</em>}</li>
 *   <li>{@link goal_metamodel.Goal_Model#getName <em>Name</em>}</li>
 *   <li>{@link goal_metamodel.Goal_Model#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getGoal_Model()
 * @model
 * @generated
 */
public interface Goal_Model extends EObject {
	
	public void setTasks(HashMap<String,Task> tasks);
	
	public HashMap<String,Task> getTasks();
	
	public void setActions(HashMap<String,Action> actions);
	
	public HashMap<String,Action> getActions();
	
	public void setResources(HashMap<String,Resource> resources);
	
	public HashMap<String,Resource> getResoures();
	
	public void setParallelNodes(HashMap<String,ParallelNode> parallelnodes);
	
	public HashMap<String,ParallelNode> getParallelNodes();
	
	public void setlplinks(ArrayList<LogicalPrecedence> lplinks);
	
	public ArrayList<LogicalPrecedence> getlplinks();
	
	public void settplinks(ArrayList<TemporalPrecedence> tplinks);
	
	public ArrayList<TemporalPrecedence> gettplinks();
	
	public void setrdlinks(ArrayList<ResourceDependency> rdlinks);
	
	public ArrayList<ResourceDependency> getrdlinks();
	
	public void setcontributionlinks(ArrayList<Contribution> contributionlinks);
	
	public  ArrayList<Contribution> getcontributionlinks();
	
	public void settimeoutlinks(ArrayList<TimeoutLink> timeout_links);
	
	public ArrayList<TimeoutLink> gettimeoutlinks();
	
	public void settimedifferencelinks(ArrayList<TimeDifferenceLink> time_difference_links);
	
	public ArrayList<TimeDifferenceLink> gettimedifferencelinks();
	
	public void set_components_per_OR_id(HashMap<String,Integer> components_per_OR_id);
	
	public HashMap<String,Integer> get_components__per_OR_id();
	
	public void set_context_conditions(List<ContextCondition> context_conditions);
	
	public List<ContextCondition> get_context_conditions();
	
	
	
	/**
	 * Returns the value of the '<em><b>Contextcondition</b></em>' containment reference list.
	 * The list contents are of type {@link goal_metamodel.ContextCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextcondition</em>' containment reference list.
	 * @see goal_metamodel.Goal_metamodelPackage#getGoal_Model_Contextcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextCondition> getContextcondition();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link goal_metamodel.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see goal_metamodel.Goal_metamodelPackage#getGoal_Model_Link()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Refers to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers to</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers to</em>' reference.
	 * @see #setRefers_to(Task)
	 * @see goal_metamodel.Goal_metamodelPackage#getGoal_Model_Refers_to()
	 * @model required="true"
	 * @generated
	 */
	Task getRefers_to();

	/**
	 * Sets the value of the '{@link goal_metamodel.Goal_Model#getRefers_to <em>Refers to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers to</em>' reference.
	 * @see #getRefers_to()
	 * @generated
	 */
	void setRefers_to(Task value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see goal_metamodel.Goal_metamodelPackage#getGoal_Model_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link goal_metamodel.Goal_Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see goal_metamodel.Goal_metamodelPackage#getGoal_Model_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link goal_metamodel.Goal_Model#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Goal_Model
