/**
 */
package ioT_metamodel;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Stream Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.DataStreamAttributes#getMeanBitRate <em>Mean Bit Rate</em>}</li>
 *   <li>{@link ioT_metamodel.DataStreamAttributes#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ioT_metamodel.DataStreamAttributes#getMaxBitrate <em>Max Bitrate</em>}</li>
 *   <li>{@link ioT_metamodel.DataStreamAttributes#getDescription <em>Description</em>}</li>
 *   <li>{@link ioT_metamodel.DataStreamAttributes#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link ioT_metamodel.DataStreamAttributes#getDataEncoding <em>Data Encoding</em>}</li>
 *   <li>{@link ioT_metamodel.DataStreamAttributes#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreamAttributes()
 * @model
 * @generated
 */
public interface DataStreamAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Mean Bit Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Bit Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Bit Rate</em>' attribute.
	 * @see #setMeanBitRate(long)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreamAttributes_MeanBitRate()
	 * @model
	 * @generated
	 */
	long getMeanBitRate();

	/**
	 * Sets the value of the '{@link ioT_metamodel.DataStreamAttributes#getMeanBitRate <em>Mean Bit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Bit Rate</em>' attribute.
	 * @see #getMeanBitRate()
	 * @generated
	 */
	void setMeanBitRate(long value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreamAttributes_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link ioT_metamodel.DataStreamAttributes#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Max Bitrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Bitrate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Bitrate</em>' attribute.
	 * @see #setMaxBitrate(long)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreamAttributes_MaxBitrate()
	 * @model
	 * @generated
	 */
	long getMaxBitrate();

	/**
	 * Sets the value of the '{@link ioT_metamodel.DataStreamAttributes#getMaxBitrate <em>Max Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Bitrate</em>' attribute.
	 * @see #getMaxBitrate()
	 * @generated
	 */
	void setMaxBitrate(long value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreamAttributes_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ioT_metamodel.DataStreamAttributes#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format</em>' attribute.
	 * @see #setDataFormat(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreamAttributes_DataFormat()
	 * @model
	 * @generated
	 */
	String getDataFormat();

	/**
	 * Sets the value of the '{@link ioT_metamodel.DataStreamAttributes#getDataFormat <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' attribute.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(String value);

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
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreamAttributes_DataEncoding()
	 * @model
	 * @generated
	 */
	String getDataEncoding();

	/**
	 * Sets the value of the '{@link ioT_metamodel.DataStreamAttributes#getDataEncoding <em>Data Encoding</em>}' attribute.
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
	 * @see ioT_metamodel.IoT_metamodelPackage#getDataStreamAttributes_DeviceID()
	 * @model
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Sets the value of the '{@link ioT_metamodel.DataStreamAttributes#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(String value);

} // DataStreamAttributes
