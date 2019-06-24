/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Device#getIs_attached_to <em>Is attached to</em>}</li>
 *   <li>{@link ioT_metamodel.Device#getContains <em>Contains</em>}</li>
 *   <li>{@link ioT_metamodel.Device#getTechnology <em>Technology</em>}</li>
 *   <li>{@link ioT_metamodel.Device#getHas_rules <em>Has rules</em>}</li>
 *   <li>{@link ioT_metamodel.Device#getDevicestate <em>Devicestate</em>}</li>
 *   <li>{@link ioT_metamodel.Device#getHas_communicators <em>Has communicators</em>}</li>
 *   <li>{@link ioT_metamodel.Device#getHosts <em>Hosts</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends PhysicalThing {
	/**
	 * Returns the value of the '<em><b>Is attached to</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.PhysicalThing}.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.PhysicalThing#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is attached to</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is attached to</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getDevice_Is_attached_to()
	 * @see ioT_metamodel.PhysicalThing#getHas
	 * @model opposite="has"
	 * @generated
	 */
	EList<PhysicalThing> getIs_attached_to();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getDevice_Contains()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Device> getContains();

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDevice_Technology()
	 * @model default=""
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Device#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

	/**
	 * Returns the value of the '<em><b>Has rules</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has rules</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getDevice_Has_rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getHas_rules();

	/**
	 * Returns the value of the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devicestate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devicestate</em>' containment reference.
	 * @see #setDevicestate(DeviceState)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDevice_Devicestate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeviceState getDevicestate();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Device#getDevicestate <em>Devicestate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devicestate</em>' containment reference.
	 * @see #getDevicestate()
	 * @generated
	 */
	void setDevicestate(DeviceState value);

	/**
	 * Returns the value of the '<em><b>Has communicators</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Communicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has communicators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has communicators</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getDevice_Has_communicators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Communicator> getHas_communicators();

	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.On_Device_Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getDevice_Hosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<On_Device_Resource> getHosts();

} // Device
