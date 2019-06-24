/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Cloud#getRespond_to_fog <em>Respond to fog</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getCloud()
 * @model
 * @generated
 */
public interface Cloud extends EObject {
	/**
	 * Returns the value of the '<em><b>Respond to fog</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Fog}.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Fog#getRequest_cloud_service <em>Request cloud service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Respond to fog</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respond to fog</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getCloud_Respond_to_fog()
	 * @see ioT_metamodel.Fog#getRequest_cloud_service
	 * @model opposite="request_cloud_service" required="true"
	 * @generated
	 */
	EList<Fog> getRespond_to_fog();

} // Cloud
