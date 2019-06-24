/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.AtomicDataAttributes;
import ioT_metamodel.IoT_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Data Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.AtomicDataAttributesImpl#getDataEncoding <em>Data Encoding</em>}</li>
 *   <li>{@link ioT_metamodel.impl.AtomicDataAttributesImpl#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicDataAttributesImpl extends MinimalEObjectImpl.Container implements AtomicDataAttributes {
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
	protected AtomicDataAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.ATOMIC_DATA_ATTRIBUTES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DATA_ENCODING, oldDataEncoding, dataEncoding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DEVICE_ID, oldDeviceID, deviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DATA_ENCODING:
				return getDataEncoding();
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DEVICE_ID:
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
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DATA_ENCODING:
				setDataEncoding((String)newValue);
				return;
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DEVICE_ID:
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
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DATA_ENCODING:
				setDataEncoding(DATA_ENCODING_EDEFAULT);
				return;
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DEVICE_ID:
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
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DATA_ENCODING:
				return DATA_ENCODING_EDEFAULT == null ? dataEncoding != null : !DATA_ENCODING_EDEFAULT.equals(dataEncoding);
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES__DEVICE_ID:
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
		result.append(" (DataEncoding: ");
		result.append(dataEncoding);
		result.append(", DeviceID: ");
		result.append(deviceID);
		result.append(')');
		return result.toString();
	}

} //AtomicDataAttributesImpl
