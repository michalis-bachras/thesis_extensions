/**
 */
package aDG_metamodel;

import java.util.HashMap;
import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDG_metamodel.ADG#getNode <em>Node</em>}</li>
 *   <li>{@link aDG_metamodel.ADG#getLink <em>Link</em>}</li>
 *   <li>{@link aDG_metamodel.ADG#isParallelStatus <em>Parallel Status</em>}</li>
 *   <li>{@link aDG_metamodel.ADG#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see aDG_metamodel.ADG_metamodelPackage#getADG()
 * @model
 * @generated
 */
public interface ADG extends EObject {
	
	public void add_to_solution(String s);
	
	public String get_solution();
	
	public void add_parallel_nodes(String parallel_node);
	
	public String get_parallel_nodes();
	
	public void add_unnecessary_nodes_in_orids(String OR__dec_id);
	
	public HashSet<String> get_unnecessary_nodes_in_orids();
	
	public void set_node_names(String solution_name);
	
	public String get_node_names();
	
	
	
	public HashSet<String> get_link_names();
	
	public void add_link_name(String s);
	
	public void addConstraint(String s);
	
	public String getConstraints();
	
	public void make_same_nodes(EList<Node> node);
	
	public void make_same_links(EList<Link> link);
	
	public void addSPLinks(Link link);
	
	public HashMap<String,Link> getSPLinks();
	
	public void addJPLinks(Link link);
	
	public HashMap<String,Link> getJPLinks();
	
	public void addActionNode(ActionNode a);
	
	public HashMap<String,ActionNode> getActionNodes();
	
	public void setSP(SplitNode sp);
	
	public SplitNode getSP();
	
	public void setJP(JoinNode jp);
	
	public JoinNode getJP();
	
	public void setNegation();
	
	public void restore_negation();
	
	public boolean getNegationStatus();
	
	
	Object clone() throws CloneNotSupportedException;
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link aDG_metamodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see aDG_metamodel.ADG_metamodelPackage#getADG_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link aDG_metamodel.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see aDG_metamodel.ADG_metamodelPackage#getADG_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Parallel Status</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Status</em>' attribute.
	 * @see #setParallelStatus(boolean)
	 * @see aDG_metamodel.ADG_metamodelPackage#getADG_ParallelStatus()
	 * @model default="false"
	 * @generated
	 */
	boolean isParallelStatus();

	/**
	 * Sets the value of the '{@link aDG_metamodel.ADG#isParallelStatus <em>Parallel Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Status</em>' attribute.
	 * @see #isParallelStatus()
	 * @generated
	 */
	void setParallelStatus(boolean value);

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
	 * @see aDG_metamodel.ADG_metamodelPackage#getADG_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link aDG_metamodel.ADG#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ADG
