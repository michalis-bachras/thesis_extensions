/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.PhysicalThing#getHas <em>Has</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getPhysicalThing()
 * @model
 * @generated
 */
public interface PhysicalThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Device}.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Device#getIs_attached_to <em>Is attached to</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getPhysicalThing_Has()
	 * @see ioT_metamodel.Device#getIs_attached_to
	 * @model opposite="is_attached_to"
	 * @generated
	 */
	EList<Device> getHas();

} // PhysicalThing
