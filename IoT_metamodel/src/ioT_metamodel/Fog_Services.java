/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fog Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Fog_Services#getRuns_in <em>Runs in</em>}</li>
 *   <li>{@link ioT_metamodel.Fog_Services#getInvokes <em>Invokes</em>}</li>
 *   <li>{@link ioT_metamodel.Fog_Services#getInvokes_fog_services <em>Invokes fog services</em>}</li>
 *   <li>{@link ioT_metamodel.Fog_Services#getExposes <em>Exposes</em>}</li>
 *   <li>{@link ioT_metamodel.Fog_Services#getIs_connected_with <em>Is connected with</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Services()
 * @model
 * @generated
 */
public interface Fog_Services extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs in</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs in</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs in</em>' reference.
	 * @see #setRuns_in(Container)
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Services_Runs_in()
	 * @model required="true"
	 * @generated
	 */
	Container getRuns_in();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Fog_Services#getRuns_in <em>Runs in</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs in</em>' reference.
	 * @see #getRuns_in()
	 * @generated
	 */
	void setRuns_in(Container value);

	/**
	 * Returns the value of the '<em><b>Invokes</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Operations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokes</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Services_Invokes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operations> getInvokes();

	/**
	 * Returns the value of the '<em><b>Invokes fog services</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Fog_Services}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokes fog services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokes fog services</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Services_Invokes_fog_services()
	 * @model
	 * @generated
	 */
	EList<Fog_Services> getInvokes_fog_services();

	/**
	 * Returns the value of the '<em><b>Exposes</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.InformationResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposes</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Services_Exposes()
	 * @model required="true"
	 * @generated
	 */
	EList<InformationResource> getExposes();

	/**
	 * Returns the value of the '<em><b>Is connected with</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.VirtualThing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is connected with</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is connected with</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getFog_Services_Is_connected_with()
	 * @model required="true"
	 * @generated
	 */
	EList<VirtualThing> getIs_connected_with();

} // Fog_Services
