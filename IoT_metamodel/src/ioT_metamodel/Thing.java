/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Thing#getVirtual_entity <em>Virtual entity</em>}</li>
 *   <li>{@link ioT_metamodel.Thing#getFog <em>Fog</em>}</li>
 *   <li>{@link ioT_metamodel.Thing#getPhysical_entity <em>Physical entity</em>}</li>
 *   <li>{@link ioT_metamodel.Thing#getName <em>Name</em>}</li>
 *   <li>{@link ioT_metamodel.Thing#getContains <em>Contains</em>}</li>
 *   <li>{@link ioT_metamodel.Thing#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends Entity {
	/**
	 * Returns the value of the '<em><b>Virtual entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual entity</em>' containment reference.
	 * @see #setVirtual_entity(VirtualThing)
	 * @see ioT_metamodel.IoT_metamodelPackage#getThing_Virtual_entity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VirtualThing getVirtual_entity();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Thing#getVirtual_entity <em>Virtual entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual entity</em>' containment reference.
	 * @see #getVirtual_entity()
	 * @generated
	 */
	void setVirtual_entity(VirtualThing value);

	/**
	 * Returns the value of the '<em><b>Fog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ioT_metamodel.Fog#getRequest_service <em>Request service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fog</em>' reference.
	 * @see #setFog(Fog)
	 * @see ioT_metamodel.IoT_metamodelPackage#getThing_Fog()
	 * @see ioT_metamodel.Fog#getRequest_service
	 * @model opposite="request_service" required="true"
	 * @generated
	 */
	Fog getFog();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Thing#getFog <em>Fog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fog</em>' reference.
	 * @see #getFog()
	 * @generated
	 */
	void setFog(Fog value);

	/**
	 * Returns the value of the '<em><b>Physical entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical entity</em>' containment reference.
	 * @see #setPhysical_entity(PhysicalThing)
	 * @see ioT_metamodel.IoT_metamodelPackage#getThing_Physical_entity()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalThing getPhysical_entity();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Thing#getPhysical_entity <em>Physical entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical entity</em>' containment reference.
	 * @see #getPhysical_entity()
	 * @generated
	 */
	void setPhysical_entity(PhysicalThing value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getThing_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Thing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.Thing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getThing_Contains()
	 * @model
	 * @generated
	 */
	EList<Thing> getContains();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getThing_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

} // Thing
