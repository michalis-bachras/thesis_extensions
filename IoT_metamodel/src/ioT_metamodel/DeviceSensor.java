/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.DeviceSensor#getSensor_actions <em>Sensor actions</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getDeviceSensor()
 * @model
 * @generated
 */
public interface DeviceSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Sensor actions</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor actions</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getDeviceSensor_Sensor_actions()
	 * @model
	 * @generated
	 */
	EList<Action> getSensor_actions();

} // DeviceSensor
