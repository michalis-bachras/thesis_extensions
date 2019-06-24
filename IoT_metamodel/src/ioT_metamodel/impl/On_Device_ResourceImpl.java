/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Device_Resource;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.On_Device_Resource;
import ioT_metamodel.Service_Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Device Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.On_Device_ResourceImpl#getContains_device_resource <em>Contains device resource</em>}</li>
 *   <li>{@link ioT_metamodel.impl.On_Device_ResourceImpl#getContains_service_resource <em>Contains service resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class On_Device_ResourceImpl extends InformationResourceImpl implements On_Device_Resource {
	/**
	 * The cached value of the '{@link #getContains_device_resource() <em>Contains device resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_device_resource()
	 * @generated
	 * @ordered
	 */
	protected EList<Device_Resource> contains_device_resource;

	/**
	 * The cached value of the '{@link #getContains_service_resource() <em>Contains service resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_service_resource()
	 * @generated
	 * @ordered
	 */
	protected EList<Service_Resource> contains_service_resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected On_Device_ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.ON_DEVICE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device_Resource> getContains_device_resource() {
		if (contains_device_resource == null) {
			contains_device_resource = new EObjectContainmentEList<Device_Resource>(Device_Resource.class, this, IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_DEVICE_RESOURCE);
		}
		return contains_device_resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service_Resource> getContains_service_resource() {
		if (contains_service_resource == null) {
			contains_service_resource = new EObjectContainmentEList<Service_Resource>(Service_Resource.class, this, IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_SERVICE_RESOURCE);
		}
		return contains_service_resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_DEVICE_RESOURCE:
				return ((InternalEList<?>)getContains_device_resource()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_SERVICE_RESOURCE:
				return ((InternalEList<?>)getContains_service_resource()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_DEVICE_RESOURCE:
				return getContains_device_resource();
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_SERVICE_RESOURCE:
				return getContains_service_resource();
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
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_DEVICE_RESOURCE:
				getContains_device_resource().clear();
				getContains_device_resource().addAll((Collection<? extends Device_Resource>)newValue);
				return;
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_SERVICE_RESOURCE:
				getContains_service_resource().clear();
				getContains_service_resource().addAll((Collection<? extends Service_Resource>)newValue);
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
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_DEVICE_RESOURCE:
				getContains_device_resource().clear();
				return;
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_SERVICE_RESOURCE:
				getContains_service_resource().clear();
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
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_DEVICE_RESOURCE:
				return contains_device_resource != null && !contains_device_resource.isEmpty();
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE__CONTAINS_SERVICE_RESOURCE:
				return contains_service_resource != null && !contains_service_resource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //On_Device_ResourceImpl
