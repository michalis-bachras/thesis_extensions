/**
 */
package ioT_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Policy_Repository#getInteracts_with <em>Interacts with</em>}</li>
 *   <li>{@link ioT_metamodel.Policy_Repository#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getPolicy_Repository()
 * @model
 * @generated
 */
public interface Policy_Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Interacts with</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Reference_Monitor#getOrchestrate_policies <em>Orchestrate policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interacts with</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interacts with</em>' reference.
	 * @see #setInteracts_with(Reference_Monitor)
	 * @see ioT_metamodel.IoT_metamodelPackage#getPolicy_Repository_Interacts_with()
	 * @see ioT_metamodel.Reference_Monitor#getOrchestrate_policies
	 * @model opposite="orchestrate_policies" required="true"
	 * @generated
	 */
	Reference_Monitor getInteracts_with();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Policy_Repository#getInteracts_with <em>Interacts with</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interacts with</em>' reference.
	 * @see #getInteracts_with()
	 * @generated
	 */
	void setInteracts_with(Reference_Monitor value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(Authorizor)
	 * @see ioT_metamodel.IoT_metamodelPackage#getPolicy_Repository_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Authorizor getContains();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Policy_Repository#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Authorizor value);

} // Policy_Repository
