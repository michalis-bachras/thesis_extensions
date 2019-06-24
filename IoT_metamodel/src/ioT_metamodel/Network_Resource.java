/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Network_Resource#getContains_device_resource <em>Contains device resource</em>}</li>
 *   <li>{@link ioT_metamodel.Network_Resource#getContains_service_resource <em>Contains service resource</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getNetwork_Resource()
 * @model
 * @generated
 */
public interface Network_Resource extends InformationResource {
	/**
	 * Returns the value of the '<em><b>Contains device resource</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Device_Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains device resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains device resource</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getNetwork_Resource_Contains_device_resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device_Resource> getContains_device_resource();

	/**
	 * Returns the value of the '<em><b>Contains service resource</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Service_Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains service resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains service resource</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getNetwork_Resource_Contains_service_resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service_Resource> getContains_service_resource();

} // Network_Resource
