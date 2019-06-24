/**
 */
package goal_metamodel.impl;

import goal_metamodel.GoalNode;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.ParallelLink;

import java.io.Serializable;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.GoalNodeImpl#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalNodeImpl extends NodeImpl implements GoalNode,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 15L;

	/**
	 * The default value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABLE_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalNodeImpl() {
		super();
	}
	
	protected boolean available = true;
	
	public void set_availability_status(boolean status) {
		available = status;
	}
	
	public boolean get_availability_status() {
		return available;
	}
	
	protected boolean can_be_eliminated = false;
	
	public void set_elimination(boolean value) {
		can_be_eliminated = value;
	}
	
	public boolean get_elimination() {
		return can_be_eliminated;
	}
	
	protected String current_parallel ="0" ;
	
	public void set_current_parallel(String P) {
		this.current_parallel = P;
	}
	
	public String get_current_parallel() {
		return current_parallel;
	}
	
	protected boolean OR_child_status = false;
	
	public void set_OR_child_status() {
		OR_child_status = true;
	}
	
	public boolean get_OR_child_status() {
		return OR_child_status;
	}
	
	protected HashSet<String> ancestors = new HashSet<String>();
	
	
	
	public void add_anchestors(String s,HashSet<String> ancestors_p) {
		HashSet<String> ancestors1 = new HashSet<String>();
		ancestors1.add(s);
		ancestors1.addAll(ancestors_p);
		ancestors.addAll(ancestors1);
	}
	
	public HashSet<String> get_anchestors(){
		return ancestors;
	}
	
	protected HashSet<String> AND_ids = new HashSet<String>();
	
	public void addANDidlist(HashSet<String> AND_ids1) {
		AND_ids.addAll(AND_ids1);
	}
	
	protected String AND_id;
	
	public void addANDid(String AND_id) {
		AND_ids.add(AND_id);
		this.AND_id = AND_id;
	}
	
	public String get_AND_id() {
		return AND_id;
	}
	
	public HashSet<String> getANDids(){
		return AND_ids;
	}
	
	public void addORidlist(HashSet<String> OR_ids1) {
		OR_ids.addAll(OR_ids1);
	}
	
	protected HashSet<String> OR_ids = new HashSet<String>();
	
	protected String OR_id = "0" ;
	
	protected String parent_OR_id = "0" ;
	
	public void set_parent_OR_id(String parent_OR_id) {
		this.parent_OR_id = parent_OR_id;
	}
	
	public String get_parent_OR_id() {
		return parent_OR_id;
	}
	
	public void addORid(String OR_id) {
		
		OR_ids.add(OR_id);
		this.OR_id = OR_id;
		
		
	}
	
	public String get_OR_id() {
		return OR_id;
	}
	
	public HashSet<String> getORids(){
		return OR_ids;
	}
	
	protected String OR_dec_id = "0";
	
	public void set_OR_dec_id(String OR_dec_id) {
		this.OR_dec_id = OR_dec_id;
	}
	
	public String get_OR_dec_id() {
		return OR_dec_id;
	}
	
	protected HashSet<String> OR_dec_ids = new HashSet<String>();
	
	public void addOR_dec_idlist(HashSet<String> OR_dec_ids1) {
		OR_dec_ids.addAll(OR_dec_ids1);
	}
	
	public void addOR_dec_id(String OR_dec_id) {
		
		OR_dec_ids.add(OR_dec_id);
		//this.OR_id = OR_id;
	
	}
	
	public HashSet<String> getOR_dec_ids(){
		return OR_dec_ids;
	}
	
	protected String id = "0";  //id ��� �� ADG collection ��� ������ � goalnode
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	protected String parent_id = "0";
	
	public String get_parent_id() {
		return parent_id;
	}
	
	public void set_parent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	
	protected int depth;
	
	public int getdepth() {
		return depth;
	}
	
	public void setdepth(int depth) {
		this.depth = depth;
	}

	protected EList<ParallelLink> ParallelLinks;
	
	public EList<ParallelLink> getParallelLinks(){
		if (ParallelLinks == null) {
			ParallelLinks = new EObjectContainmentEList<ParallelLink>(ParallelLink.class, this, Goal_metamodelPackage.PARALLELLINK__LIST);
		}
		return ParallelLinks;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.GOAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailable(boolean newAvailable) {
		boolean oldAvailable = available;
		available = newAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.GOAL_NODE__AVAILABLE, oldAvailable, available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Goal_metamodelPackage.GOAL_NODE__AVAILABLE:
				return isAvailable();
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
			case Goal_metamodelPackage.GOAL_NODE__AVAILABLE:
				setAvailable((Boolean)newValue);
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
			case Goal_metamodelPackage.GOAL_NODE__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
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
			case Goal_metamodelPackage.GOAL_NODE__AVAILABLE:
				return available != AVAILABLE_EDEFAULT;
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
		result.append(" (available: ");
		result.append(available);
		result.append(')');
		return result.toString();
	}

} //GoalNodeImpl
