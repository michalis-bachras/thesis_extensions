/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Actuator#getActs <em>Acts</em>}</li>
 *   <li>{@link ioT_metamodel.Actuator#getName <em>Name</em>}</li>
 *   <li>{@link ioT_metamodel.Actuator#getActions <em>Actions</em>}</li>
 *   <li>{@link ioT_metamodel.Actuator#getObserves <em>Observes</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device {
	/**
	 * Returns the value of the '<em><b>Acts</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.PhysicalThing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acts</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getActuator_Acts()
	 * @model
	 * @generated
	 */
	EList<PhysicalThing> getActs();

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
	 * @see ioT_metamodel.IoT_metamodelPackage#getActuator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Actuator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute.
	 * @see #setActions(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getActuator_Actions()
	 * @model
	 * @generated
	 */
	String getActions();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Actuator#getActions <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' attribute.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(String value);

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
	 * @see ioT_metamodel.IoT_metamodelPackage#getActuator_Observes()
	 * @model
	 * @generated
	 */
	DeviceState getObserves();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Actuator#getObserves <em>Observes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observes</em>' reference.
	 * @see #getObserves()
	 * @generated
	 */
	void setObserves(DeviceState value);

} // Actuator
