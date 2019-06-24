/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.ExternalActuator#getActuator_actions <em>Actuator actions</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getExternalActuator()
 * @model
 * @generated
 */
public interface ExternalActuator extends Actuator {
	/**
	 * Returns the value of the '<em><b>Actuator actions</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator actions</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getExternalActuator_Actuator_actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActuator_actions();

} // ExternalActuator
