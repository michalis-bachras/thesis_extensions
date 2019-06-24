/**
 */
package ioT_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Container#getID <em>ID</em>}</li>
 *   <li>{@link ioT_metamodel.Container#getIP_address <em>IP address</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getContainer_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Container#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>IP address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP address</em>' attribute.
	 * @see #setIP_address(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getContainer_IP_address()
	 * @model
	 * @generated
	 */
	String getIP_address();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Container#getIP_address <em>IP address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP address</em>' attribute.
	 * @see #getIP_address()
	 * @generated
	 */
	void setIP_address(String value);

} // Container
