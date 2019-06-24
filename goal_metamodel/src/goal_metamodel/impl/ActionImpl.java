/**
 */
package goal_metamodel.impl;

import goal_metamodel.Action;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.Resource;
import goal_metamodel.Task;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.ActionImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link goal_metamodel.impl.ActionImpl#isResource_enabled <em>Resource enabled</em>}</li>
 *   <li>{@link goal_metamodel.impl.ActionImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link goal_metamodel.impl.ActionImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link goal_metamodel.impl.ActionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends GoalNodeImpl implements Action,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	protected int cost;
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		 this.cost = cost;
	}

	protected Task parent ; 
	
	public void set_parent(Task parent) {
		this.parent = parent;
	}
	
	public Task get_parent() {
		return parent;
	}
	
	protected HashSet<String> exist_node_list = new HashSet<String>();
	
	public HashSet<String> get_exist_node_list() {
		return exist_node_list;
		
	}
	
	protected HashSet<String> non_exist_node_list = new HashSet<String>();
	
	public HashSet<String> get_non_exist_node_list() {
		return non_exist_node_list;
		
	}
	
	
	protected boolean negated = false;
	
	public void setNegation() {
		negated = true;
	}
	
	public boolean getNegationStatus() {
		return negated;
	}
	
	protected boolean isParallelAction = false;  //����� ��  P actions ��� ��� ����������� ��� ���� ��� �� ���� ��� ���� ��� ���� �� actions ��������� actions ���� ���� ����������
	
	public void setIsParallelAction() {
		isParallelAction = true;
	}
	
	public boolean getIsParallelAction() {
		return isParallelAction;
	}
	
	
	
	
	
	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> requires;

	/**
	 * The default value of the '{@link #isResource_enabled() <em>Resource enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResource_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOURCE_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isResource_enabled() <em>Resource enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResource_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean resource_enabled = RESOURCE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

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
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<Resource>(Resource.class, this, Goal_metamodelPackage.ACTION__REQUIRES);
		}
		return requires;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResource_enabled() {
		return resource_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource_enabled(boolean newResource_enabled) {
		boolean oldResource_enabled = resource_enabled;
		resource_enabled = newResource_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.ACTION__RESOURCE_ENABLED, oldResource_enabled, resource_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.ACTION__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.ACTION__END_TIME, oldEndTime, endTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.ACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Goal_metamodelPackage.ACTION__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
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
			case Goal_metamodelPackage.ACTION__REQUIRES:
				return getRequires();
			case Goal_metamodelPackage.ACTION__RESOURCE_ENABLED:
				return isResource_enabled();
			case Goal_metamodelPackage.ACTION__START_TIME:
				return getStartTime();
			case Goal_metamodelPackage.ACTION__END_TIME:
				return getEndTime();
			case Goal_metamodelPackage.ACTION__ID:
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
			case Goal_metamodelPackage.ACTION__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Resource>)newValue);
				return;
			case Goal_metamodelPackage.ACTION__RESOURCE_ENABLED:
				setResource_enabled((Boolean)newValue);
				return;
			case Goal_metamodelPackage.ACTION__START_TIME:
				setStartTime((Date)newValue);
				return;
			case Goal_metamodelPackage.ACTION__END_TIME:
				setEndTime((Date)newValue);
				return;
			case Goal_metamodelPackage.ACTION__ID:
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
			case Goal_metamodelPackage.ACTION__REQUIRES:
				getRequires().clear();
				return;
			case Goal_metamodelPackage.ACTION__RESOURCE_ENABLED:
				setResource_enabled(RESOURCE_ENABLED_EDEFAULT);
				return;
			case Goal_metamodelPackage.ACTION__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case Goal_metamodelPackage.ACTION__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case Goal_metamodelPackage.ACTION__ID:
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
			case Goal_metamodelPackage.ACTION__REQUIRES:
				return requires != null && !requires.isEmpty();
			case Goal_metamodelPackage.ACTION__RESOURCE_ENABLED:
				return resource_enabled != RESOURCE_ENABLED_EDEFAULT;
			case Goal_metamodelPackage.ACTION__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case Goal_metamodelPackage.ACTION__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case Goal_metamodelPackage.ACTION__ID:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resource_enabled: ");
		result.append(resource_enabled);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", EndTime: ");
		result.append(endTime);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
