/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Actuator;
import ioT_metamodel.DeviceState;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.PhysicalThing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.ActuatorImpl#getActs <em>Acts</em>}</li>
 *   <li>{@link ioT_metamodel.impl.ActuatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link ioT_metamodel.impl.ActuatorImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link ioT_metamodel.impl.ActuatorImpl#getObserves <em>Observes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends DeviceImpl implements Actuator {
	/**
	 * The cached value of the '{@link #getActs() <em>Acts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalThing> acts;

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
	 * The default value of the '{@link #getActions() <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected String actions = ACTIONS_EDEFAULT;

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
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalThing> getActs() {
		if (acts == null) {
			acts = new EObjectResolvingEList<PhysicalThing>(PhysicalThing.class, this, IoT_metamodelPackage.ACTUATOR__ACTS);
		}
		return acts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.ACTUATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(String newActions) {
		String oldActions = actions;
		actions = newActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.ACTUATOR__ACTIONS, oldActions, actions));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.ACTUATOR__OBSERVES, oldObserves, observes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.ACTUATOR__OBSERVES, oldObserves, observes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.ACTUATOR__ACTS:
				return getActs();
			case IoT_metamodelPackage.ACTUATOR__NAME:
				return getName();
			case IoT_metamodelPackage.ACTUATOR__ACTIONS:
				return getActions();
			case IoT_metamodelPackage.ACTUATOR__OBSERVES:
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
			case IoT_metamodelPackage.ACTUATOR__ACTS:
				getActs().clear();
				getActs().addAll((Collection<? extends PhysicalThing>)newValue);
				return;
			case IoT_metamodelPackage.ACTUATOR__NAME:
				setName((String)newValue);
				return;
			case IoT_metamodelPackage.ACTUATOR__ACTIONS:
				setActions((String)newValue);
				return;
			case IoT_metamodelPackage.ACTUATOR__OBSERVES:
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
			case IoT_metamodelPackage.ACTUATOR__ACTS:
				getActs().clear();
				return;
			case IoT_metamodelPackage.ACTUATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IoT_metamodelPackage.ACTUATOR__ACTIONS:
				setActions(ACTIONS_EDEFAULT);
				return;
			case IoT_metamodelPackage.ACTUATOR__OBSERVES:
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
			case IoT_metamodelPackage.ACTUATOR__ACTS:
				return acts != null && !acts.isEmpty();
			case IoT_metamodelPackage.ACTUATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IoT_metamodelPackage.ACTUATOR__ACTIONS:
				return ACTIONS_EDEFAULT == null ? actions != null : !ACTIONS_EDEFAULT.equals(actions);
			case IoT_metamodelPackage.ACTUATOR__OBSERVES:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", actions: ");
		result.append(actions);
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
