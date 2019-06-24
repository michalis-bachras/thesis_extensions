/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Reference_Monitor#getOrchestrate_policies <em>Orchestrate policies</em>}</li>
 *   <li>{@link ioT_metamodel.Reference_Monitor#getEnforces <em>Enforces</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getReference_Monitor()
 * @model
 * @generated
 */
public interface Reference_Monitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Orchestrate policies</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Policy_Repository#getInteracts_with <em>Interacts with</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orchestrate policies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestrate policies</em>' reference.
	 * @see #setOrchestrate_policies(Policy_Repository)
	 * @see ioT_metamodel.IoT_metamodelPackage#getReference_Monitor_Orchestrate_policies()
	 * @see ioT_metamodel.Policy_Repository#getInteracts_with
	 * @model opposite="interacts_with" required="true"
	 * @generated
	 */
	Policy_Repository getOrchestrate_policies();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Reference_Monitor#getOrchestrate_policies <em>Orchestrate policies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orchestrate policies</em>' reference.
	 * @see #getOrchestrate_policies()
	 * @generated
	 */
	void setOrchestrate_policies(Policy_Repository value);

	/**
	 * Returns the value of the '<em><b>Enforces</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Authorizor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enforces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enforces</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getReference_Monitor_Enforces()
	 * @model
	 * @generated
	 */
	EList<Authorizor> getEnforces();

} // Reference_Monitor
