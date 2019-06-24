/**
 */
package ioT_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorizor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Authorizor#getConnects_with <em>Connects with</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getAuthorizor()
 * @model
 * @generated
 */
public interface Authorizor extends EObject {
	/**
	 * Returns the value of the '<em><b>Connects with</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Fog#getDefine_control_policies_to <em>Define control policies to</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects with</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects with</em>' reference.
	 * @see #setConnects_with(Fog)
	 * @see ioT_metamodel.IoT_metamodelPackage#getAuthorizor_Connects_with()
	 * @see ioT_metamodel.Fog#getDefine_control_policies_to
	 * @model opposite="define_control_policies_to" required="true"
	 * @generated
	 */
	Fog getConnects_with();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Authorizor#getConnects_with <em>Connects with</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connects with</em>' reference.
	 * @see #getConnects_with()
	 * @generated
	 */
	void setConnects_with(Fog value);

} // Authorizor
