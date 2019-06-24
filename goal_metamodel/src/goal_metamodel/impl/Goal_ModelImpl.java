/**
 */
package goal_metamodel.impl;

import goal_metamodel.Action;
import goal_metamodel.ContextCondition;
import goal_metamodel.Contribution;
import goal_metamodel.Goal_Model;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.Link;
import goal_metamodel.LogicalPrecedence;
import goal_metamodel.ParallelNode;
import goal_metamodel.Resource;
import goal_metamodel.ResourceDependency;
import goal_metamodel.Task;
import goal_metamodel.TemporalPrecedence;
import goal_metamodel.TimeDifferenceLink;
import goal_metamodel.TimeoutLink;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.Goal_ModelImpl#getContextcondition <em>Contextcondition</em>}</li>
 *   <li>{@link goal_metamodel.impl.Goal_ModelImpl#getLink <em>Link</em>}</li>
 *   <li>{@link goal_metamodel.impl.Goal_ModelImpl#getRefers_to <em>Refers to</em>}</li>
 *   <li>{@link goal_metamodel.impl.Goal_ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link goal_metamodel.impl.Goal_ModelImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Goal_ModelImpl extends MinimalEObjectImpl.Container implements Goal_Model,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<String,Task> tasks = new HashMap<String,Task>();
	private HashMap<String,Action> actions = new HashMap<String,Action>(); 
	private HashMap<String,Resource> resources = new HashMap<String,Resource>(); 
	private HashMap<String,ParallelNode> parallelnodes = new HashMap<String,ParallelNode>();
	private ArrayList<LogicalPrecedence> lplinks = new ArrayList<LogicalPrecedence>();
	private ArrayList<TemporalPrecedence> tplinks = new ArrayList<TemporalPrecedence>();
	private ArrayList<ResourceDependency> rdlinks = new ArrayList<ResourceDependency>();
	private ArrayList<Contribution> contributionlinks = new ArrayList<Contribution>();
	private ArrayList<TimeDifferenceLink> time_difference_links = new ArrayList<TimeDifferenceLink>();
	private ArrayList<TimeoutLink> timeout_links = new ArrayList<TimeoutLink>();
	
	private HashMap<String,Integer> components_per_OR_id = new HashMap<String,Integer>();
	private List<ContextCondition> context_conditions = new ArrayList<ContextCondition>();
	
	
	public void setTasks(HashMap<String,Task> tasks) {
		this.tasks.putAll(tasks);
	}

	public HashMap<String,Task> getTasks(){
		return tasks;
	}
	
	public void setActions(HashMap<String,Action> actions) {
		this.actions.putAll(actions);
	}
	
	public HashMap<String,Action> getActions(){
		return actions;
	}
	
	public void setResources(HashMap<String,Resource> resources) {
		this.resources.putAll(resources);
	}
	
	public HashMap<String,Resource> getResoures(){
		return resources;
	}
	
	public void setParallelNodes(HashMap<String,ParallelNode> parallelnodes) {
		this.parallelnodes.putAll(parallelnodes);
	}
	
	public HashMap<String,ParallelNode> getParallelNodes(){
		return parallelnodes;
	}
	
	public void setlplinks(ArrayList<LogicalPrecedence> lplinks) {
		this.lplinks.addAll(lplinks);
	}
	
	public ArrayList<LogicalPrecedence> getlplinks(){
		return lplinks;
	}
	
	public void settplinks(ArrayList<TemporalPrecedence> tplinks) {
		this.tplinks.addAll(tplinks);
	}
	
	public ArrayList<TemporalPrecedence> gettplinks(){
		return tplinks;
	}
	
	public void setrdlinks(ArrayList<ResourceDependency> rdlinks) {
		this.rdlinks.addAll(rdlinks);
	}
	
	public ArrayList<ResourceDependency> getrdlinks(){
		return rdlinks;
	}
	
	public void setcontributionlinks(ArrayList<Contribution> contributionlinks) {
		this.contributionlinks.addAll(contributionlinks);
	}
	
	public  ArrayList<Contribution> getcontributionlinks(){
		return contributionlinks;
	}
	
	public void settimeoutlinks(ArrayList<TimeoutLink> timeout_links) {
		this.timeout_links.addAll(timeout_links);
	}
	
	public ArrayList<TimeoutLink> gettimeoutlinks(){
		return timeout_links;
	}
	
	public void settimedifferencelinks(ArrayList<TimeDifferenceLink> time_difference_links) {
		this.time_difference_links.addAll(time_difference_links);
	}
	
	public ArrayList<TimeDifferenceLink> gettimedifferencelinks(){
		return time_difference_links;
	}
	
	public void set_components_per_OR_id(HashMap<String,Integer> components_per_OR_id) {
		this.components_per_OR_id.putAll(components_per_OR_id);
	}
	
	public HashMap<String,Integer> get_components__per_OR_id(){
		return components_per_OR_id;
	}
	
	public void set_context_conditions(List<ContextCondition> context_conditions) {
		this.context_conditions.addAll(context_conditions);
	}
	
	public List<ContextCondition> get_context_conditions(){
		return context_conditions;
	}
	
	
	
	
	/**
	 * The cached value of the '{@link #getContextcondition() <em>Contextcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextCondition> contextcondition;

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
	 * The cached value of the '{@link #getRefers_to() <em>Refers to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefers_to()
	 * @generated
	 * @ordered
	 */
	protected Task refers_to;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Goal_ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.GOAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextCondition> getContextcondition() {
		if (contextcondition == null) {
			contextcondition = new EObjectContainmentEList<ContextCondition>(ContextCondition.class, this, Goal_metamodelPackage.GOAL_MODEL__CONTEXTCONDITION);
		}
		return contextcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, Goal_metamodelPackage.GOAL_MODEL__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getRefers_to() {
		if (refers_to != null && refers_to.eIsProxy()) {
			InternalEObject oldRefers_to = (InternalEObject)refers_to;
			refers_to = (Task)eResolveProxy(oldRefers_to);
			if (refers_to != oldRefers_to) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.GOAL_MODEL__REFERS_TO, oldRefers_to, refers_to));
			}
		}
		return refers_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetRefers_to() {
		return refers_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefers_to(Task newRefers_to) {
		Task oldRefers_to = refers_to;
		refers_to = newRefers_to;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.GOAL_MODEL__REFERS_TO, oldRefers_to, refers_to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.GOAL_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.GOAL_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Goal_metamodelPackage.GOAL_MODEL__CONTEXTCONDITION:
				return ((InternalEList<?>)getContextcondition()).basicRemove(otherEnd, msgs);
			case Goal_metamodelPackage.GOAL_MODEL__LINK:
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
			case Goal_metamodelPackage.GOAL_MODEL__CONTEXTCONDITION:
				return getContextcondition();
			case Goal_metamodelPackage.GOAL_MODEL__LINK:
				return getLink();
			case Goal_metamodelPackage.GOAL_MODEL__REFERS_TO:
				if (resolve) return getRefers_to();
				return basicGetRefers_to();
			case Goal_metamodelPackage.GOAL_MODEL__NAME:
				return getName();
			case Goal_metamodelPackage.GOAL_MODEL__DESCRIPTION:
				return getDescription();
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
			case Goal_metamodelPackage.GOAL_MODEL__CONTEXTCONDITION:
				getContextcondition().clear();
				getContextcondition().addAll((Collection<? extends ContextCondition>)newValue);
				return;
			case Goal_metamodelPackage.GOAL_MODEL__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case Goal_metamodelPackage.GOAL_MODEL__REFERS_TO:
				setRefers_to((Task)newValue);
				return;
			case Goal_metamodelPackage.GOAL_MODEL__NAME:
				setName((String)newValue);
				return;
			case Goal_metamodelPackage.GOAL_MODEL__DESCRIPTION:
				setDescription((String)newValue);
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
			case Goal_metamodelPackage.GOAL_MODEL__CONTEXTCONDITION:
				getContextcondition().clear();
				return;
			case Goal_metamodelPackage.GOAL_MODEL__LINK:
				getLink().clear();
				return;
			case Goal_metamodelPackage.GOAL_MODEL__REFERS_TO:
				setRefers_to((Task)null);
				return;
			case Goal_metamodelPackage.GOAL_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Goal_metamodelPackage.GOAL_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case Goal_metamodelPackage.GOAL_MODEL__CONTEXTCONDITION:
				return contextcondition != null && !contextcondition.isEmpty();
			case Goal_metamodelPackage.GOAL_MODEL__LINK:
				return link != null && !link.isEmpty();
			case Goal_metamodelPackage.GOAL_MODEL__REFERS_TO:
				return refers_to != null;
			case Goal_metamodelPackage.GOAL_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Goal_metamodelPackage.GOAL_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //Goal_ModelImpl
