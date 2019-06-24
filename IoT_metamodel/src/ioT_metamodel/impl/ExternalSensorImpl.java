/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Action;
import ioT_metamodel.ExternalSensor;
import ioT_metamodel.IoT_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.ExternalSensorImpl#getSensor_actions <em>Sensor actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalSensorImpl extends SensorImpl implements ExternalSensor {
	/**
	 * The cached value of the '{@link #getSensor_actions() <em>Sensor actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor_actions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> sensor_actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.EXTERNAL_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getSensor_actions() {
		if (sensor_actions == null) {
			sensor_actions = new EObjectResolvingEList<Action>(Action.class, this, IoT_metamodelPackage.EXTERNAL_SENSOR__SENSOR_ACTIONS);
		}
		return sensor_actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.EXTERNAL_SENSOR__SENSOR_ACTIONS:
				return getSensor_actions();
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
			case IoT_metamodelPackage.EXTERNAL_SENSOR__SENSOR_ACTIONS:
				getSensor_actions().clear();
				getSensor_actions().addAll((Collection<? extends Action>)newValue);
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
			case IoT_metamodelPackage.EXTERNAL_SENSOR__SENSOR_ACTIONS:
				getSensor_actions().clear();
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
			case IoT_metamodelPackage.EXTERNAL_SENSOR__SENSOR_ACTIONS:
				return sensor_actions != null && !sensor_actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalSensorImpl
