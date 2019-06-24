/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Transition#getAction <em>Action</em>}</li>
 *   <li>{@link ioT_metamodel.Transition#getIncoming_states <em>Incoming states</em>}</li>
 *   <li>{@link ioT_metamodel.Transition#getOutgoing_states <em>Outgoing states</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getTransition_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Incoming states</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.DeviceState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming states</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming states</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getTransition_Incoming_states()
	 * @model
	 * @generated
	 */
	EList<DeviceState> getIncoming_states();

	/**
	 * Returns the value of the '<em><b>Outgoing states</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.DeviceState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing states</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing states</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getTransition_Outgoing_states()
	 * @model
	 * @generated
	 */
	EList<DeviceState> getOutgoing_states();

} // Transition
