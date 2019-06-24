/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.InformationResource#getHas_information_about <em>Has information about</em>}</li>
 *   <li>{@link ioT_metamodel.InformationResource#getHas <em>Has</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getInformationResource()
 * @model
 * @generated
 */
public interface InformationResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Has information about</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.PhysicalThing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has information about</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has information about</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getInformationResource_Has_information_about()
	 * @model
	 * @generated
	 */
	EList<PhysicalThing> getHas_information_about();

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Information}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getInformationResource_Has()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Information> getHas();

} // InformationResource
