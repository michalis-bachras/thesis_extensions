/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.DeviceState;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.PhysicalThing;
import ioT_metamodel.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.SensorImpl#getName <em>Name</em>}</li>
 *   <li>{@link ioT_metamodel.impl.SensorImpl#isState <em>State</em>}</li>
 *   <li>{@link ioT_metamodel.impl.SensorImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link ioT_metamodel.impl.SensorImpl#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link ioT_metamodel.impl.SensorImpl#getObserves <em>Observes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SensorImpl extends DeviceImpl implements Sensor {
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
	 * The default value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected boolean state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final double FREQUENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected double frequency = FREQUENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalThing> monitors;

	/**
	 * The cached value of the '{@link #getObserves() <em>Observes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserves()
	 * @generated
	 * @ordered
	 */
	protected DeviceState observes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.SENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.SENSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(boolean newState) {
		boolean oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.SENSOR__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(double newFrequency) {
		double oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.SENSOR__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalThing> getMonitors() {
		if (monitors == null) {
			monitors = new EObjectResolvingEList<PhysicalThing>(PhysicalThing.class, this, IoT_metamodelPackage.SENSOR__MONITORS);
		}
		return monitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceState getObserves() {
		if (observes != null && observes.eIsProxy()) {
			InternalEObject oldObserves = (InternalEObject)observes;
			observes = (DeviceState)eResolveProxy(oldObserves);
			if (observes != oldObserves) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.SENSOR__OBSERVES, oldObserves, observes));
			}
		}
		return observes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceState basicGetObserves() {
		return observes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserves(DeviceState newObserves) {
		DeviceState oldObserves = observes;
		observes = newObserves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.SENSOR__OBSERVES, oldObserves, observes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.SENSOR__NAME:
				return getName();
			case IoT_metamodelPackage.SENSOR__STATE:
				return isState();
			case IoT_metamodelPackage.SENSOR__FREQUENCY:
				return getFrequency();
			case IoT_metamodelPackage.SENSOR__MONITORS:
				return getMonitors();
			case IoT_metamodelPackage.SENSOR__OBSERVES:
				if (resolve) return getObserves();
				return basicGetObserves();
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
			case IoT_metamodelPackage.SENSOR__NAME:
				setName((String)newValue);
				return;
			case IoT_metamodelPackage.SENSOR__STATE:
				setState((Boolean)newValue);
				return;
			case IoT_metamodelPackage.SENSOR__FREQUENCY:
				setFrequency((Double)newValue);
				return;
			case IoT_metamodelPackage.SENSOR__MONITORS:
				getMonitors().clear();
				getMonitors().addAll((Collection<? extends PhysicalThing>)newValue);
				return;
			case IoT_metamodelPackage.SENSOR__OBSERVES:
				setObserves((DeviceState)newValue);
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
			case IoT_metamodelPackage.SENSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IoT_metamodelPackage.SENSOR__STATE:
				setState(STATE_EDEFAULT);
				return;
			case IoT_metamodelPackage.SENSOR__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case IoT_metamodelPackage.SENSOR__MONITORS:
				getMonitors().clear();
				return;
			case IoT_metamodelPackage.SENSOR__OBSERVES:
				setObserves((DeviceState)null);
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
			case IoT_metamodelPackage.SENSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IoT_metamodelPackage.SENSOR__STATE:
				return state != STATE_EDEFAULT;
			case IoT_metamodelPackage.SENSOR__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case IoT_metamodelPackage.SENSOR__MONITORS:
				return monitors != null && !monitors.isEmpty();
			case IoT_metamodelPackage.SENSOR__OBSERVES:
				return observes != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", State: ");
		result.append(state);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
