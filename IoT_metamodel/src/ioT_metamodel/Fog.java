/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Fog#getRequest_service <em>Request service</em>}</li>
 *   <li>{@link ioT_metamodel.Fog#getFognode <em>Fognode</em>}</li>
 *   <li>{@link ioT_metamodel.Fog#getRequest_cloud_service <em>Request cloud service</em>}</li>
 *   <li>{@link ioT_metamodel.Fog#getDatabase <em>Database</em>}</li>
 *   <li>{@link ioT_metamodel.Fog#getDefine_control_policies_to <em>Define control policies to</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getFog()
 * @model
 * @generated
 */
public interface Fog extends EObject {
	/**
	 * Returns the value of the '<em><b>Request service</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Thing}.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Thing#getFog <em>Fog</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request service</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Request_service()
	 * @see ioT_metamodel.Thing#getFog
	 * @model opposite="fog" required="true"
	 * @generated
	 */
	EList<Thing> getRequest_service();

	/**
	 * Returns the value of the '<em><b>Fognode</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.FogNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fognode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fognode</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Fognode()
	 * @model containment="true"
	 * @generated
	 */
	EList<FogNode> getFognode();

	/**
	 * Returns the value of the '<em><b>Request cloud service</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Cloud}.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Cloud#getRespond_to_fog <em>Respond to fog</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request cloud service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request cloud service</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Request_cloud_service()
	 * @see ioT_metamodel.Cloud#getRespond_to_fog
	 * @model opposite="respond_to_fog" required="true"
	 * @generated
	 */
	EList<Cloud> getRequest_cloud_service();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Database}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Database()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Database> getDatabase();

	/**
	 * Returns the value of the '<em><b>Define control policies to</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Authorizor#getConnects_with <em>Connects with</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define control policies to</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define control policies to</em>' reference.
	 * @see #setDefine_control_policies_to(Authorizor)
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Define_control_policies_to()
	 * @see ioT_metamodel.Authorizor#getConnects_with
	 * @model opposite="connects_with" required="true"
	 * @generated
	 */
	Authorizor getDefine_control_policies_to();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Fog#getDefine_control_policies_to <em>Define control policies to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Define control policies to</em>' reference.
	 * @see #getDefine_control_policies_to()
	 * @generated
	 */
	void setDefine_control_policies_to(Authorizor value);

} // Fog
