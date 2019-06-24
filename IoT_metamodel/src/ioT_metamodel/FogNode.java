/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fog Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.FogNode#getRuns_on_vm <em>Runs on vm</em>}</li>
 *   <li>{@link ioT_metamodel.FogNode#getRuns_in_container <em>Runs in container</em>}</li>
 *   <li>{@link ioT_metamodel.FogNode#getAnalytics_engine <em>Analytics engine</em>}</li>
 *   <li>{@link ioT_metamodel.FogNode#getAssociates_with <em>Associates with</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getFogNode()
 * @model
 * @generated
 */
public interface FogNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs on vm</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.VM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs on vm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs on vm</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFogNode_Runs_on_vm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VM> getRuns_on_vm();

	/**
	 * Returns the value of the '<em><b>Runs in container</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs in container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs in container</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFogNode_Runs_in_container()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Container> getRuns_in_container();

	/**
	 * Returns the value of the '<em><b>Analytics engine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analytics engine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analytics engine</em>' containment reference.
	 * @see #setAnalytics_engine(Analytics_Engine)
	 * @see ioT_metamodel.IoT_metamodelPackage#getFogNode_Analytics_engine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Analytics_Engine getAnalytics_engine();

	/**
	 * Sets the value of the '{@link ioT_metamodel.FogNode#getAnalytics_engine <em>Analytics engine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analytics engine</em>' containment reference.
	 * @see #getAnalytics_engine()
	 * @generated
	 */
	void setAnalytics_engine(Analytics_Engine value);

	/**
	 * Returns the value of the '<em><b>Associates with</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Fog_Services}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associates with</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associates with</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFogNode_Associates_with()
	 * @model required="true"
	 * @generated
	 */
	EList<Fog_Services> getAssociates_with();

} // FogNode
