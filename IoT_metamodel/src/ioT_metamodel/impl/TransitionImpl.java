/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Action;
import ioT_metamodel.DeviceState;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.TransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link ioT_metamodel.impl.TransitionImpl#getIncoming_states <em>Incoming states</em>}</li>
 *   <li>{@link ioT_metamodel.impl.TransitionImpl#getOutgoing_states <em>Outgoing states</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getIncoming_states() <em>Incoming states</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming_states()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceState> incoming_states;

	/**
	 * The cached value of the '{@link #getOutgoing_states() <em>Outgoing states</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing_states()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceState> outgoing_states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, IoT_metamodelPackage.TRANSITION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceState> getIncoming_states() {
		if (incoming_states == null) {
			incoming_states = new EObjectResolvingEList<DeviceState>(DeviceState.class, this, IoT_metamodelPackage.TRANSITION__INCOMING_STATES);
		}
		return incoming_states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceState> getOutgoing_states() {
		if (outgoing_states == null) {
			outgoing_states = new EObjectResolvingEList<DeviceState>(DeviceState.class, this, IoT_metamodelPackage.TRANSITION__OUTGOING_STATES);
		}
		return outgoing_states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.TRANSITION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case IoT_metamodelPackage.TRANSITION__ACTION:
				return getAction();
			case IoT_metamodelPackage.TRANSITION__INCOMING_STATES:
				return getIncoming_states();
			case IoT_metamodelPackage.TRANSITION__OUTGOING_STATES:
				return getOutgoing_states();
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
			case IoT_metamodelPackage.TRANSITION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case IoT_metamodelPackage.TRANSITION__INCOMING_STATES:
				getIncoming_states().clear();
				getIncoming_states().addAll((Collection<? extends DeviceState>)newValue);
				return;
			case IoT_metamodelPackage.TRANSITION__OUTGOING_STATES:
				getOutgoing_states().clear();
				getOutgoing_states().addAll((Collection<? extends DeviceState>)newValue);
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
			case IoT_metamodelPackage.TRANSITION__ACTION:
				getAction().clear();
				return;
			case IoT_metamodelPackage.TRANSITION__INCOMING_STATES:
				getIncoming_states().clear();
				return;
			case IoT_metamodelPackage.TRANSITION__OUTGOING_STATES:
				getOutgoing_states().clear();
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
			case IoT_metamodelPackage.TRANSITION__ACTION:
				return action != null && !action.isEmpty();
			case IoT_metamodelPackage.TRANSITION__INCOMING_STATES:
				return incoming_states != null && !incoming_states.isEmpty();
			case IoT_metamodelPackage.TRANSITION__OUTGOING_STATES:
				return outgoing_states != null && !outgoing_states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
