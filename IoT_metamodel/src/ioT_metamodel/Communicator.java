/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Communicator#getHas_ports <em>Has ports</em>}</li>
 *   <li>{@link ioT_metamodel.Communicator#getType <em>Type</em>}</li>
 *   <li>{@link ioT_metamodel.Communicator#getPorts_number <em>Ports number</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getCommunicator()
 * @model
 * @generated
 */
public interface Communicator extends EObject {
	/**
	 * Returns the value of the '<em><b>Has ports</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has ports</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getCommunicator_Has_ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getHas_ports();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getCommunicator_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Communicator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Ports number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports number</em>' attribute.
	 * @see #setPorts_number(int)
	 * @see ioT_metamodel.IoT_metamodelPackage#getCommunicator_Ports_number()
	 * @model
	 * @generated
	 */
	int getPorts_number();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Communicator#getPorts_number <em>Ports number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports number</em>' attribute.
	 * @see #getPorts_number()
	 * @generated
	 */
	void setPorts_number(int value);

} // Communicator
