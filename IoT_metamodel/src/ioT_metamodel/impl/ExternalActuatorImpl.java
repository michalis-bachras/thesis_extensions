/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Action;
import ioT_metamodel.ExternalActuator;
import ioT_metamodel.IoT_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.ExternalActuatorImpl#getActuator_actions <em>Actuator actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalActuatorImpl extends ActuatorImpl implements ExternalActuator {
	/**
	 * The cached value of the '{@link #getActuator_actions() <em>Actuator actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator_actions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actuator_actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.EXTERNAL_ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActuator_actions() {
		if (actuator_actions == null) {
			actuator_actions = new EObjectResolvingEList<Action>(Action.class, this, IoT_metamodelPackage.EXTERNAL_ACTUATOR__ACTUATOR_ACTIONS);
		}
		return actuator_actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.EXTERNAL_ACTUATOR__ACTUATOR_ACTIONS:
				return getActuator_actions();
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
			case IoT_metamodelPackage.EXTERNAL_ACTUATOR__ACTUATOR_ACTIONS:
				getActuator_actions().clear();
				getActuator_actions().addAll((Collection<? extends Action>)newValue);
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
			case IoT_metamodelPackage.EXTERNAL_ACTUATOR__ACTUATOR_ACTIONS:
				getActuator_actions().clear();
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
			case IoT_metamodelPackage.EXTERNAL_ACTUATOR__ACTUATOR_ACTIONS:
				return actuator_actions != null && !actuator_actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalActuatorImpl
