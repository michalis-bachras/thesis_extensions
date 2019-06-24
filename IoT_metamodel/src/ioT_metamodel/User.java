/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.User#getSubscribes_invokes <em>Subscribes invokes</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Entity {
	/**
	 * Returns the value of the '<em><b>Subscribes invokes</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Fog_Services}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribes invokes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribes invokes</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getUser_Subscribes_invokes()
	 * @model
	 * @generated
	 */
	EList<Fog_Services> getSubscribes_invokes();

} // User
