/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.DataStreamAttributes;
import ioT_metamodel.IoT_metamodelPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Stream Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.DataStreamAttributesImpl#getMeanBitRate <em>Mean Bit Rate</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DataStreamAttributesImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DataStreamAttributesImpl#getMaxBitrate <em>Max Bitrate</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DataStreamAttributesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DataStreamAttributesImpl#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DataStreamAttributesImpl#getDataEncoding <em>Data Encoding</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DataStreamAttributesImpl#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStreamAttributesImpl extends MinimalEObjectImpl.Container implements DataStreamAttributes {
	/**
	 * The default value of the '{@link #getMeanBitRate() <em>Mean Bit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanBitRate()
	 * @generated
	 * @ordered
	 */
	protected static final long MEAN_BIT_RATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMeanBitRate() <em>Mean Bit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanBitRate()
	 * @generated
	 * @ordered
	 */
	protected long meanBitRate = MEAN_BIT_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBitrate() <em>Max Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBitrate()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_BITRATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxBitrate() <em>Max Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBitrate()
	 * @generated
	 * @ordered
	 */
	protected long maxBitrate = MAX_BITRATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected String dataFormat = DATA_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataEncoding() <em>Data Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataEncoding() <em>Data Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEncoding()
	 * @generated
	 * @ordered
	 */
	protected String dataEncoding = DATA_ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String deviceID = DEVICE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStreamAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.DATA_STREAM_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMeanBitRate() {
		return meanBitRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanBitRate(long newMeanBitRate) {
		long oldMeanBitRate = meanBitRate;
		meanBitRate = newMeanBitRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE, oldMeanBitRate, meanBitRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxBitrate() {
		return maxBitrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBitrate(long newMaxBitrate) {
		long oldMaxBitrate = maxBitrate;
		maxBitrate = newMaxBitrate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MAX_BITRATE, oldMaxBitrate, maxBitrate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataFormat() {
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFormat(String newDataFormat) {
		String oldDataFormat = dataFormat;
		dataFormat = newDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_FORMAT, oldDataFormat, dataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataEncoding() {
		return dataEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEncoding(String newDataEncoding) {
		String oldDataEncoding = dataEncoding;
		dataEncoding = newDataEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_ENCODING, oldDataEncoding, dataEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(String newDeviceID) {
		String oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DEVICE_ID, oldDeviceID, deviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE:
				return getMeanBitRate();
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__TIMESTAMP:
				return getTimestamp();
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MAX_BITRATE:
				return getMaxBitrate();
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DESCRIPTION:
				return getDescription();
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_FORMAT:
				return getDataFormat();
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_ENCODING:
				return getDataEncoding();
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DEVICE_ID:
				return getDeviceID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE:
				setMeanBitRate((Long)newValue);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MAX_BITRATE:
				setMaxBitrate((Long)newValue);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_FORMAT:
				setDataFormat((String)newValue);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_ENCODING:
				setDataEncoding((String)newValue);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DEVICE_ID:
				setDeviceID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE:
				setMeanBitRate(MEAN_BIT_RATE_EDEFAULT);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MAX_BITRATE:
				setMaxBitrate(MAX_BITRATE_EDEFAULT);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_FORMAT:
				setDataFormat(DATA_FORMAT_EDEFAULT);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_ENCODING:
				setDataEncoding(DATA_ENCODING_EDEFAULT);
				return;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DEVICE_ID:
				setDeviceID(DEVICE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE:
				return meanBitRate != MEAN_BIT_RATE_EDEFAULT;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MAX_BITRATE:
				return maxBitrate != MAX_BITRATE_EDEFAULT;
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_FORMAT:
				return DATA_FORMAT_EDEFAULT == null ? dataFormat != null : !DATA_FORMAT_EDEFAULT.equals(dataFormat);
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_ENCODING:
				return DATA_ENCODING_EDEFAULT == null ? dataEncoding != null : !DATA_ENCODING_EDEFAULT.equals(dataEncoding);
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceID != null : !DEVICE_ID_EDEFAULT.equals(deviceID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (MeanBitRate: ");
		result.append(meanBitRate);
		result.append(", Timestamp: ");
		result.append(timestamp);
		result.append(", MaxBitrate: ");
		result.append(maxBitrate);
		result.append(", Description: ");
		result.append(description);
		result.append(", DataFormat: ");
		result.append(dataFormat);
		result.append(", DataEncoding: ");
		result.append(dataEncoding);
		result.append(", DeviceID: ");
		result.append(deviceID);
		result.append(')');
		return result.toString();
	}

} //DataStreamAttributesImpl
