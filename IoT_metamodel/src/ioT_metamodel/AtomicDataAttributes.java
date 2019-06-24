/**
 */
package ioT_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Data Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.AtomicDataAttributes#getDataEncoding <em>Data Encoding</em>}</li>
 *   <li>{@link ioT_metamodel.AtomicDataAttributes#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getAtomicDataAttributes()
 * @model
 * @generated
 */
public interface AtomicDataAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Encoding</em>' attribute.
	 * @see #setDataEncoding(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getAtomicDataAttributes_DataEncoding()
	 * @model
	 * @generated
	 */
	String getDataEncoding();

	/**
	 * Sets the value of the '{@link ioT_metamodel.AtomicDataAttributes#getDataEncoding <em>Data Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Encoding</em>' attribute.
	 * @see #getDataEncoding()
	 * @generated
	 */
	void setDataEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getAtomicDataAttributes_DeviceID()
	 * @model
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Sets the value of the '{@link ioT_metamodel.AtomicDataAttributes#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(String value);

} // AtomicDataAttributes
