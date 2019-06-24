/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Communicator;
import ioT_metamodel.Device;
import ioT_metamodel.DeviceState;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.On_Device_Resource;
import ioT_metamodel.PhysicalThing;
import ioT_metamodel.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.DeviceImpl#getIs_attached_to <em>Is attached to</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DeviceImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DeviceImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DeviceImpl#getHas_rules <em>Has rules</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DeviceImpl#getDevicestate <em>Devicestate</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DeviceImpl#getHas_communicators <em>Has communicators</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DeviceImpl#getHosts <em>Hosts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends PhysicalThingImpl implements Device {
	/**
	 * The cached value of the '{@link #getIs_attached_to() <em>Is attached to</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_attached_to()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalThing> is_attached_to;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> contains;

	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas_rules() <em>Has rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_rules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> has_rules;

	/**
	 * The cached value of the '{@link #getDevicestate() <em>Devicestate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicestate()
	 * @generated
	 * @ordered
	 */
	protected DeviceState devicestate;

	/**
	 * The cached value of the '{@link #getHas_communicators() <em>Has communicators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_communicators()
	 * @generated
	 * @ordered
	 */
	protected EList<Communicator> has_communicators;

	/**
	 * The cached value of the '{@link #getHosts() <em>Hosts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHosts()
	 * @generated
	 * @ordered
	 */
	protected EList<On_Device_Resource> hosts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalThing> getIs_attached_to() {
		if (is_attached_to == null) {
			is_attached_to = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalThing>(PhysicalThing.class, this, IoT_metamodelPackage.DEVICE__IS_ATTACHED_TO, IoT_metamodelPackage.PHYSICAL_THING__HAS);
		}
		return is_attached_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Device>(Device.class, this, IoT_metamodelPackage.DEVICE__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DEVICE__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getHas_rules() {
		if (has_rules == null) {
			has_rules = new EObjectContainmentEList<Rule>(Rule.class, this, IoT_metamodelPackage.DEVICE__HAS_RULES);
		}
		return has_rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceState getDevicestate() {
		return devicestate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevicestate(DeviceState newDevicestate, NotificationChain msgs) {
		DeviceState oldDevicestate = devicestate;
		devicestate = newDevicestate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DEVICE__DEVICESTATE, oldDevicestate, newDevicestate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevicestate(DeviceState newDevicestate) {
		if (newDevicestate != devicestate) {
			NotificationChain msgs = null;
			if (devicestate != null)
				msgs = ((InternalEObject)devicestate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.DEVICE__DEVICESTATE, null, msgs);
			if (newDevicestate != null)
				msgs = ((InternalEObject)newDevicestate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.DEVICE__DEVICESTATE, null, msgs);
			msgs = basicSetDevicestate(newDevicestate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DEVICE__DEVICESTATE, newDevicestate, newDevicestate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Communicator> getHas_communicators() {
		if (has_communicators == null) {
			has_communicators = new EObjectContainmentEList<Communicator>(Communicator.class, this, IoT_metamodelPackage.DEVICE__HAS_COMMUNICATORS);
		}
		return has_communicators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<On_Device_Resource> getHosts() {
		if (hosts == null) {
			hosts = new EObjectContainmentEList<On_Device_Resource>(On_Device_Resource.class, this, IoT_metamodelPackage.DEVICE__HOSTS);
		}
		return hosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.DEVICE__IS_ATTACHED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIs_attached_to()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.DEVICE__IS_ATTACHED_TO:
				return ((InternalEList<?>)getIs_attached_to()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.DEVICE__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.DEVICE__HAS_RULES:
				return ((InternalEList<?>)getHas_rules()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.DEVICE__DEVICESTATE:
				return basicSetDevicestate(null, msgs);
			case IoT_metamodelPackage.DEVICE__HAS_COMMUNICATORS:
				return ((InternalEList<?>)getHas_communicators()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.DEVICE__HOSTS:
				return ((InternalEList<?>)getHosts()).basicRemove(otherEnd, msgs);
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
			case IoT_metamodelPackage.DEVICE__IS_ATTACHED_TO:
				return getIs_attached_to();
			case IoT_metamodelPackage.DEVICE__CONTAINS:
				return getContains();
			case IoT_metamodelPackage.DEVICE__TECHNOLOGY:
				return getTechnology();
			case IoT_metamodelPackage.DEVICE__HAS_RULES:
				return getHas_rules();
			case IoT_metamodelPackage.DEVICE__DEVICESTATE:
				return getDevicestate();
			case IoT_metamodelPackage.DEVICE__HAS_COMMUNICATORS:
				return getHas_communicators();
			case IoT_metamodelPackage.DEVICE__HOSTS:
				return getHosts();
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
			case IoT_metamodelPackage.DEVICE__IS_ATTACHED_TO:
				getIs_attached_to().clear();
				getIs_attached_to().addAll((Collection<? extends PhysicalThing>)newValue);
				return;
			case IoT_metamodelPackage.DEVICE__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Device>)newValue);
				return;
			case IoT_metamodelPackage.DEVICE__TECHNOLOGY:
				setTechnology((String)newValue);
				return;
			case IoT_metamodelPackage.DEVICE__HAS_RULES:
				getHas_rules().clear();
				getHas_rules().addAll((Collection<? extends Rule>)newValue);
				return;
			case IoT_metamodelPackage.DEVICE__DEVICESTATE:
				setDevicestate((DeviceState)newValue);
				return;
			case IoT_metamodelPackage.DEVICE__HAS_COMMUNICATORS:
				getHas_communicators().clear();
				getHas_communicators().addAll((Collection<? extends Communicator>)newValue);
				return;
			case IoT_metamodelPackage.DEVICE__HOSTS:
				getHosts().clear();
				getHosts().addAll((Collection<? extends On_Device_Resource>)newValue);
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
			case IoT_metamodelPackage.DEVICE__IS_ATTACHED_TO:
				getIs_attached_to().clear();
				return;
			case IoT_metamodelPackage.DEVICE__CONTAINS:
				getContains().clear();
				return;
			case IoT_metamodelPackage.DEVICE__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case IoT_metamodelPackage.DEVICE__HAS_RULES:
				getHas_rules().clear();
				return;
			case IoT_metamodelPackage.DEVICE__DEVICESTATE:
				setDevicestate((DeviceState)null);
				return;
			case IoT_metamodelPackage.DEVICE__HAS_COMMUNICATORS:
				getHas_communicators().clear();
				return;
			case IoT_metamodelPackage.DEVICE__HOSTS:
				getHosts().clear();
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
			case IoT_metamodelPackage.DEVICE__IS_ATTACHED_TO:
				return is_attached_to != null && !is_attached_to.isEmpty();
			case IoT_metamodelPackage.DEVICE__CONTAINS:
				return contains != null && !contains.isEmpty();
			case IoT_metamodelPackage.DEVICE__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
			case IoT_metamodelPackage.DEVICE__HAS_RULES:
				return has_rules != null && !has_rules.isEmpty();
			case IoT_metamodelPackage.DEVICE__DEVICESTATE:
				return devicestate != null;
			case IoT_metamodelPackage.DEVICE__HAS_COMMUNICATORS:
				return has_communicators != null && !has_communicators.isEmpty();
			case IoT_metamodelPackage.DEVICE__HOSTS:
				return hosts != null && !hosts.isEmpty();
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
		result.append(" (Technology: ");
		result.append(technology);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
