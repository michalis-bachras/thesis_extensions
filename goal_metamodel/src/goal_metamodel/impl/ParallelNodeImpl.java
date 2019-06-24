/**
 */
package goal_metamodel.impl;

import goal_metamodel.GoalNode;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.ParallelNode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.ParallelNodeImpl#getNumberOfNodes <em>Number Of Nodes</em>}</li>
 *   <li>{@link goal_metamodel.impl.ParallelNodeImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelNodeImpl extends ControlNodeImpl implements ParallelNode,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8L;

	protected int depth;
	
	public void set_depth(int depth) {
		this.depth = depth;
	}
	
	public int get_depth() {
		return depth;
	}
	
	protected HashSet<String> necessary_or_ids = new HashSet<String>();
	
	public HashSet<String> get_necessary_or_ids(){
		return necessary_or_ids;
	}
	
	public void add_necessary_or_ids(String OR_dec_id) {
		necessary_or_ids.add(OR_dec_id);
	}
	
	protected String current_parallel  ;
	
	public void set_current_parallel(String P) {
		this.current_parallel = P;
	}
	
	public String get_current_parallel() {
		return current_parallel;
	}
	
	
	protected HashSet<String> invalid_nodes = new HashSet<String>();
	
	protected HashSet<String> invalid_orids = new HashSet<String>();
	
	protected HashSet<String> valid_andids = new HashSet<String>();
	
	public void add_valid_andids(HashSet<String> AND_ids) {
		valid_andids.addAll(AND_ids);
	}
	
	public HashSet<String> get_valid_andids(){
		return valid_andids;
	}
	
	public void add_invalid_ancestors(HashSet<String> ancestors) {
		invalid_nodes.addAll(ancestors);
	}
	
	public HashSet<String> get_invalid_nodes(){
		return invalid_nodes;
	}
	
	public void add_invalid_orids(HashSet<String> OR_ids) {
		invalid_orids.addAll(OR_ids);
	}
	
	public void add_invalid_orid(String OR_id) {
		invalid_orids.add(OR_id);
	}
	
	public void add_invalid_node(String node) {
		invalid_nodes.add(node);
	}
	
	public HashSet<String> get_invalid_orids(){
		return invalid_orids;
	}
	
	ArrayList<GoalNode> nodes = new ArrayList<GoalNode>();
	
	public void addNode(GoalNode g) {
		nodes.add(g);
	}
	
	protected ArrayList<GoalNode> OR_GoalNodes = new ArrayList<GoalNode>();
	
	public void addORGoalNode(GoalNode a) {
		OR_GoalNodes.add(a);
	}
	
	public ArrayList<GoalNode> getORGoalNodes() {
		return OR_GoalNodes;
	}
	
	public ArrayList<GoalNode> getnodes(){
		return nodes;
	}
	
	protected ArrayList<ArrayList<ArrayList<String>>> allActions_AND_children = new ArrayList<ArrayList<ArrayList<String>>>();
	
	public ArrayList<ArrayList<ArrayList<String>>> get_allActions_AND_children(){
		return allActions_AND_children;
	}
	
	
	/**
	 * The default value of the '{@link #getNumberOfNodes() <em>Number Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_NODES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfNodes() <em>Number Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfNodes()
	 * @generated
	 * @ordered
	 */
	protected int numberOfNodes = NUMBER_OF_NODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	protected EList<GoalNode> node;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.PARALLEL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfNodes() {
		return numberOfNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfNodes(int newNumberOfNodes) {
		int oldNumberOfNodes = numberOfNodes;
		numberOfNodes = newNumberOfNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.PARALLEL_NODE__NUMBER_OF_NODES, oldNumberOfNodes, numberOfNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.PARALLEL_NODE__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Goal_metamodelPackage.PARALLEL_NODE__NUMBER_OF_NODES:
				return getNumberOfNodes();
			case Goal_metamodelPackage.PARALLEL_NODE__TIMEOUT:
				return getTimeout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Goal_metamodelPackage.PARALLEL_NODE__NUMBER_OF_NODES:
				setNumberOfNodes((Integer)newValue);
				return;
			case Goal_metamodelPackage.PARALLEL_NODE__TIMEOUT:
				setTimeout((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Goal_metamodelPackage.PARALLEL_NODE__NUMBER_OF_NODES:
				setNumberOfNodes(NUMBER_OF_NODES_EDEFAULT);
				return;
			case Goal_metamodelPackage.PARALLEL_NODE__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Goal_metamodelPackage.PARALLEL_NODE__NUMBER_OF_NODES:
				return numberOfNodes != NUMBER_OF_NODES_EDEFAULT;
			case Goal_metamodelPackage.PARALLEL_NODE__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (NumberOfNodes: ");
		result.append(numberOfNodes);
		result.append(", Timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //ParallelNodeImpl
