/**
 */
package ioT_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Database#getPolicy_repository <em>Policy repository</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy repository</em>' containment reference.
	 * @see #setPolicy_repository(Policy_Repository)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDatabase_Policy_repository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Policy_Repository getPolicy_repository();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Database#getPolicy_repository <em>Policy repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy repository</em>' containment reference.
	 * @see #getPolicy_repository()
	 * @generated
	 */
	void setPolicy_repository(Policy_Repository value);

} // Database
