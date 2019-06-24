/**
 */
package aDG_metamodel.impl;

import aDG_metamodel.ADG;
import aDG_metamodel.ADG_metamodelPackage;
import aDG_metamodel.ActionNode;
import aDG_metamodel.JoinNode;
import aDG_metamodel.Link;
import aDG_metamodel.Node;
import aDG_metamodel.SplitNode;


//import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDG_metamodel.impl.ADGImpl#getNode <em>Node</em>}</li>
 *   <li>{@link aDG_metamodel.impl.ADGImpl#getLink <em>Link</em>}</li>
 *   <li>{@link aDG_metamodel.impl.ADGImpl#isParallelStatus <em>Parallel Status</em>}</li>
 *   <li>{@link aDG_metamodel.impl.ADGImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADGImpl extends MinimalEObjectImpl.Container implements ADG,Cloneable {
	
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	protected String solution_name = "";
	
	public String get_solution() {
		return solution_name;
	}
	
	public void add_to_solution(String s) {
		solution_name = solution_name + "'" + s + "'";
	}
	
	protected HashSet<String> unnecessary_nodes_in_orids = new HashSet<String>();
	
	public void add_unnecessary_nodes_in_orids(String OR__dec_id) {
		unnecessary_nodes_in_orids.add(OR__dec_id);
	}
	
	public HashSet<String> get_unnecessary_nodes_in_orids(){
		return unnecessary_nodes_in_orids;
	}
	
	HashSet<String> thread_names = new HashSet<String>();
	
	String node_names;
	
	public void set_node_names(String solution_name) {
		node_names = solution_name;
	}
	
	public String get_node_names() {
		return node_names;
	}
	
	String parallel_nodes = "";
	
	public void add_parallel_nodes(String parallel_node) {
		if(parallel_nodes.equals("")) {
			parallel_nodes += "'" + parallel_node + "'";
		}
		else {
			parallel_node += "," + "'" + parallel_node + "'";
		}
	}
	
	public String get_parallel_nodes() {
		return parallel_nodes;
	}
	
	
	
	String Constraints =  "" ;
	
	HashSet<String> link_names = new HashSet<String>();
	
	public void add_link_name(String s) {
		link_names.add(s);
	}
	
	public HashSet<String> get_link_names(){
		return link_names;
	}
	
	protected boolean negated = false;
	
	
	public void addConstraint(String s) {
		
		if(Constraints.isEmpty()) {
			Constraints += s;
		}
		else{
			Constraints +=  "," + s;
			}
		
	}
	
	public String getConstraints(){
		return Constraints;
	}
	
	public void restore_negation() {
		negated = false;
	}
	
	public void setNegation() {
		negated = true;
	}
	
	public boolean getNegationStatus() {
		return negated;
	}
	
	
	public static <T> EList<T> Join(EList<T> list1,  EList<T> list2) {
        EList<T> result = new BasicEList<T>(list1);
        result.addAll(list2);
        return result;
    }
	
	public void make_same_nodes(EList<Node> node) {
		EList<Node> temp =new BasicEList<Node>(node);
		this.node = temp;
	}
	
	public void make_same_links(EList<Link> link) {
		EList<Link> temp =new BasicEList<Link>(link);
		this.link = temp;
	}
	
	protected HashMap<String,Link> SPLinks = new HashMap<String,Link>();
	protected HashMap<String,Link> JPLinks = new HashMap<String,Link>();
	
	public void addSPLinks(Link link) {
		//System.out.println(link.getTo().getName());
		SPLinks.put(link.getTo().getName(), link);
	}
	
	public HashMap<String,Link> getSPLinks() {
		return SPLinks;
	}
	
	public void addJPLinks(Link link) {
		JPLinks.put(link.getFrom().getName(), link);
	}
	
	public HashMap<String,Link> getJPLinks() {
		return JPLinks;
	}
	
	protected HashMap<String,ActionNode> ActionNodes = new HashMap<String,ActionNode>();
	
	protected SplitNode sp ;
	protected JoinNode jp;
	
	public void setSP(SplitNode sp) {
		this.sp = sp;
	}
	
	public SplitNode getSP() {
		return sp;
	}
	
	public void setJP(JoinNode jp) {
		this.jp = jp;
	}
	
	public JoinNode getJP() {
		return jp;
	}
	
	public void addActionNode(ActionNode a) {
		ActionNodes.put(a.getName(), a);
	}
	
	public HashMap<String,ActionNode> getActionNodes() {
		return ActionNodes;
	}
	
	
	
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The default value of the '{@link #isParallelStatus() <em>Parallel Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallelStatus() <em>Parallel Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean parallelStatus = PARALLEL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADG_metamodelPackage.Literals.ADG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, ADG_metamodelPackage.ADG__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, ADG_metamodelPackage.ADG__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParallelStatus() {
		return parallelStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelStatus(boolean newParallelStatus) {
		boolean oldParallelStatus = parallelStatus;
		parallelStatus = newParallelStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADG_metamodelPackage.ADG__PARALLEL_STATUS, oldParallelStatus, parallelStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADG_metamodelPackage.ADG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ADG_metamodelPackage.ADG__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case ADG_metamodelPackage.ADG__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ADG_metamodelPackage.ADG__NODE:
				return getNode();
			case ADG_metamodelPackage.ADG__LINK:
				return getLink();
			case ADG_metamodelPackage.ADG__PARALLEL_STATUS:
				return isParallelStatus();
			case ADG_metamodelPackage.ADG__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ADG_metamodelPackage.ADG__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case ADG_metamodelPackage.ADG__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case ADG_metamodelPackage.ADG__PARALLEL_STATUS:
				setParallelStatus((Boolean)newValue);
				return;
			case ADG_metamodelPackage.ADG__ID:
				setId((String)newValue);
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
			case ADG_metamodelPackage.ADG__NODE:
				getNode().clear();
				return;
			case ADG_metamodelPackage.ADG__LINK:
				getLink().clear();
				return;
			case ADG_metamodelPackage.ADG__PARALLEL_STATUS:
				setParallelStatus(PARALLEL_STATUS_EDEFAULT);
				return;
			case ADG_metamodelPackage.ADG__ID:
				setId(ID_EDEFAULT);
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
			case ADG_metamodelPackage.ADG__NODE:
				return node != null && !node.isEmpty();
			case ADG_metamodelPackage.ADG__LINK:
				return link != null && !link.isEmpty();
			case ADG_metamodelPackage.ADG__PARALLEL_STATUS:
				return parallelStatus != PARALLEL_STATUS_EDEFAULT;
			case ADG_metamodelPackage.ADG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ParallelStatus: ");
		result.append(parallelStatus);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ADGImpl
