/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.AtomicData;
import ioT_metamodel.DataStreamAttributes;
import ioT_metamodel.DataStreams;
import ioT_metamodel.IoT_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Streams</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.DataStreamsImpl#getConsists_of <em>Consists of</em>}</li>
 *   <li>{@link ioT_metamodel.impl.DataStreamsImpl#getHas_datastreamattributes <em>Has datastreamattributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStreamsImpl extends MinimalEObjectImpl.Container implements DataStreams {
	/**
	 * The cached value of the '{@link #getConsists_of() <em>Consists of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsists_of()
	 * @generated
	 * @ordered
	 */
	protected EList<AtomicData> consists_of;

	/**
	 * The cached value of the '{@link #getHas_datastreamattributes() <em>Has datastreamattributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_datastreamattributes()
	 * @generated
	 * @ordered
	 */
	protected DataStreamAttributes has_datastreamattributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStreamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.DATA_STREAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtomicData> getConsists_of() {
		if (consists_of == null) {
			consists_of = new EObjectResolvingEList<AtomicData>(AtomicData.class, this, IoT_metamodelPackage.DATA_STREAMS__CONSISTS_OF);
		}
		return consists_of;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStreamAttributes getHas_datastreamattributes() {
		if (has_datastreamattributes != null && has_datastreamattributes.eIsProxy()) {
			InternalEObject oldHas_datastreamattributes = (InternalEObject)has_datastreamattributes;
			has_datastreamattributes = (DataStreamAttributes)eResolveProxy(oldHas_datastreamattributes);
			if (has_datastreamattributes != oldHas_datastreamattributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.DATA_STREAMS__HAS_DATASTREAMATTRIBUTES, oldHas_datastreamattributes, has_datastreamattributes));
			}
		}
		return has_datastreamattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStreamAttributes basicGetHas_datastreamattributes() {
		return has_datastreamattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_datastreamattributes(DataStreamAttributes newHas_datastreamattributes) {
		DataStreamAttributes oldHas_datastreamattributes = has_datastreamattributes;
		has_datastreamattributes = newHas_datastreamattributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATA_STREAMS__HAS_DATASTREAMATTRIBUTES, oldHas_datastreamattributes, has_datastreamattributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.DATA_STREAMS__CONSISTS_OF:
				return getConsists_of();
			case IoT_metamodelPackage.DATA_STREAMS__HAS_DATASTREAMATTRIBUTES:
				if (resolve) return getHas_datastreamattributes();
				return basicGetHas_datastreamattributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IoT_metamodelPackage.DATA_STREAMS__CONSISTS_OF:
				getConsists_of().clear();
				getConsists_of().addAll((Collection<? extends AtomicData>)newValue);
				return;
			case IoT_metamodelPackage.DATA_STREAMS__HAS_DATASTREAMATTRIBUTES:
				setHas_datastreamattributes((DataStreamAttributes)newValue);
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
			case IoT_metamodelPackage.DATA_STREAMS__CONSISTS_OF:
				getConsists_of().clear();
				return;
			case IoT_metamodelPackage.DATA_STREAMS__HAS_DATASTREAMATTRIBUTES:
				setHas_datastreamattributes((DataStreamAttributes)null);
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
			case IoT_metamodelPackage.DATA_STREAMS__CONSISTS_OF:
				return consists_of != null && !consists_of.isEmpty();
			case IoT_metamodelPackage.DATA_STREAMS__HAS_DATASTREAMATTRIBUTES:
				return has_datastreamattributes != null;
		}
		return super.eIsSet(featureID);
	}

} //DataStreamsImpl
