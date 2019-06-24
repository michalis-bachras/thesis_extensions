/**
 */
package goal_metamodel;

import java.util.Date;
import java.util.HashSet;


import org.eclipse.emf.common.util.EList;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Action#getRequires <em>Requires</em>}</li>
 *   <li>{@link goal_metamodel.Action#isResource_enabled <em>Resource enabled</em>}</li>
 *   <li>{@link goal_metamodel.Action#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link goal_metamodel.Action#getEndTime <em>End Time</em>}</li>
 *   <li>{@link goal_metamodel.Action#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends GoalNode {
	
	public int getCost();
	
	public void setCost(int cost);
	
	public void set_parent(Task parent);
	
	public Task get_parent();
	
	public HashSet<String> get_exist_node_list();
	
	public HashSet<String> get_non_exist_node_list();
	
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link goal_metamodel.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see goal_metamodel.Goal_metamodelPackage#getAction_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getRequires();

	/**
	 * Returns the value of the '<em><b>Resource enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource enabled</em>' attribute.
	 * @see #setResource_enabled(boolean)
	 * @see goal_metamodel.Goal_metamodelPackage#getAction_Resource_enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isResource_enabled();

	/**
	 * Sets the value of the '{@link goal_metamodel.Action#isResource_enabled <em>Resource enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource enabled</em>' attribute.
	 * @see #isResource_enabled()
	 * @generated
	 */
	void setResource_enabled(boolean value);
	
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see goal_metamodel.Goal_metamodelPackage#getAction_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link goal_metamodel.Action#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see goal_metamodel.Goal_metamodelPackage#getAction_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link goal_metamodel.Action#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see goal_metamodel.Goal_metamodelPackage#getAction_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link goal_metamodel.Action#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	public void setIsParallelAction();
	
	public boolean getIsParallelAction();
	
	public void setNegation();
	
	public boolean getNegationStatus();

} // Action
