/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.AtomicData;
import ioT_metamodel.AtomicDataAttributes;
import ioT_metamodel.IoT_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.AtomicDataImpl#getHas_atomicdataattributes <em>Has atomicdataattributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicDataImpl extends MinimalEObjectImpl.Container implements AtomicData {
	/**
	 * The cached value of the '{@link #getHas_atomicdataattributes() <em>Has atomicdataattributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_atomicdataattributes()
	 * @generated
	 * @ordered
	 */
	protected AtomicDataAttributes has_atomicdataattributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.ATOMIC_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDataAttributes getHas_atomicdataattributes() {
		if (has_atomicdataattributes != null && has_atomicdataattributes.eIsProxy()) {
			InternalEObject oldHas_atomicdataattributes = (InternalEObject)has_atomicdataattributes;
			has_atomicdataattributes = (AtomicDataAttributes)eResolveProxy(oldHas_atomicdataattributes);
			if (has_atomicdataattributes != oldHas_atomicdataattributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.ATOMIC_DATA__HAS_ATOMICDATAATTRIBUTES, oldHas_atomicdataattributes, has_atomicdataattributes));
			}
		}
		return has_atomicdataattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDataAttributes basicGetHas_atomicdataattributes() {
		return has_atomicdataattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_atomicdataattributes(AtomicDataAttributes newHas_atomicdataattributes) {
		AtomicDataAttributes oldHas_atomicdataattributes = has_atomicdataattributes;
		has_atomicdataattributes = newHas_atomicdataattributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.ATOMIC_DATA__HAS_ATOMICDATAATTRIBUTES, oldHas_atomicdataattributes, has_atomicdataattributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.ATOMIC_DATA__HAS_ATOMICDATAATTRIBUTES:
				if (resolve) return getHas_atomicdataattributes();
				return basicGetHas_atomicdataattributes();
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
			case IoT_metamodelPackage.ATOMIC_DATA__HAS_ATOMICDATAATTRIBUTES:
				setHas_atomicdataattributes((AtomicDataAttributes)newValue);
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
			case IoT_metamodelPackage.ATOMIC_DATA__HAS_ATOMICDATAATTRIBUTES:
				setHas_atomicdataattributes((AtomicDataAttributes)null);
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
			case IoT_metamodelPackage.ATOMIC_DATA__HAS_ATOMICDATAATTRIBUTES:
				return has_atomicdataattributes != null;
		}
		return super.eIsSet(featureID);
	}

} //AtomicDataImpl
