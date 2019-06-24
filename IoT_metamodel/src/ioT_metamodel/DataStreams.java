/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Streams</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.DataStreams#getConsists_of <em>Consists of</em>}</li>
 *   <li>{@link ioT_metamodel.DataStreams#getHas_datastreamattributes <em>Has datastreamattributes</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreams()
 * @model
 * @generated
 */
public interface DataStreams extends EObject {
	/**
	 * Returns the value of the '<em><b>Consists of</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.AtomicData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists of</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreams_Consists_of()
	 * @model required="true"
	 * @generated
	 */
	EList<AtomicData> getConsists_of();

	/**
	 * Returns the value of the '<em><b>Has datastreamattributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has datastreamattributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has datastreamattributes</em>' reference.
	 * @see #setHas_datastreamattributes(DataStreamAttributes)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreams_Has_datastreamattributes()
	 * @model required="true"
	 * @generated
	 */
	DataStreamAttributes getHas_datastreamattributes();

	/**
	 * Sets the value of the '{@link ioT_metamodel.DataStreams#getHas_datastreamattributes <em>Has datastreamattributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has datastreamattributes</em>' reference.
	 * @see #getHas_datastreamattributes()
	 * @generated
	 */
	void setHas_datastreamattributes(DataStreamAttributes value);

} // DataStreams
