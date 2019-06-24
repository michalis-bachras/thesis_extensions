/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.VirtualThing#getRepresents <em>Represents</em>}</li>
 *   <li>{@link ioT_metamodel.VirtualThing#getURI <em>URI</em>}</li>
 *   <li>{@link ioT_metamodel.VirtualThing#getIs_associated_with <em>Is associated with</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getVirtualThing()
 * @model
 * @generated
 */
public interface VirtualThing extends Active_Digital_Artifact, Passive_Digital_Artifact {
	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(PhysicalThing)
	 * @see ioT_metamodel.IoT_metamodelPackage#getVirtualThing_Represents()
	 * @model required="true"
	 * @generated
	 */
	PhysicalThing getRepresents();

	/**
	 * Sets the value of the '{@link ioT_metamodel.VirtualThing#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(PhysicalThing value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getVirtualThing_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link ioT_metamodel.VirtualThing#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Is associated with</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.InformationResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is associated with</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is associated with</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getVirtualThing_Is_associated_with()
	 * @model
	 * @generated
	 */
	EList<InformationResource> getIs_associated_with();

} // VirtualThing
