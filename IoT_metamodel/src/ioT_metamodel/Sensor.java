/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Sensor#getName <em>Name</em>}</li>
 *   <li>{@link ioT_metamodel.Sensor#isState <em>State</em>}</li>
 *   <li>{@link ioT_metamodel.Sensor#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link ioT_metamodel.Sensor#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link ioT_metamodel.Sensor#getObserves <em>Observes</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getSensor()
 * @model abstract="true"
 * @generated
 */
public interface Sensor extends Device {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getSensor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Sensor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(boolean)
	 * @see ioT_metamodel.IoT_metamodelPackage#getSensor_State()
	 * @model
	 * @generated
	 */
	boolean isState();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Sensor#isState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #isState()
	 * @generated
	 */
	void setState(boolean value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(double)
	 * @see ioT_metamodel.IoT_metamodelPackage#getSensor_Frequency()
	 * @model
	 * @generated
	 */
	double getFrequency();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Sensor#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(double value);

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.PhysicalThing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getSensor_Monitors()
	 * @model
	 * @generated
	 */
	EList<PhysicalThing> getMonitors();

	/**
	 * Returns the value of the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observes</em>' reference.
	 * @see #setObserves(DeviceState)
	 * @see ioT_metamodel.IoT_metamodelPackage#getSensor_Observes()
	 * @model
	 * @generated
	 */
	DeviceState getObserves();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Sensor#getObserves <em>Observes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observes</em>' reference.
	 * @see #getObserves()
	 * @generated
	 */
	void setObserves(DeviceState value);

} // Sensor
