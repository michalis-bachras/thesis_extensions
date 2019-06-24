/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.AtomicData;
import ioT_metamodel.DataStreams;
import ioT_metamodel.Information;
import ioT_metamodel.IoT_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.InformationImpl#getAtomicdata <em>Atomicdata</em>}</li>
 *   <li>{@link ioT_metamodel.impl.InformationImpl#getDatastreams <em>Datastreams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationImpl extends MinimalEObjectImpl.Container implements Information {
	/**
	 * The cached value of the '{@link #getAtomicdata() <em>Atomicdata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicdata()
	 * @generated
	 * @ordered
	 */
	protected EList<AtomicData> atomicdata;

	/**
	 * The cached value of the '{@link #getDatastreams() <em>Datastreams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastreams()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStreams> datastreams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtomicData> getAtomicdata() {
		if (atomicdata == null) {
			atomicdata = new EObjectContainmentEList<AtomicData>(AtomicData.class, this, IoT_metamodelPackage.INFORMATION__ATOMICDATA);
		}
		return atomicdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStreams> getDatastreams() {
		if (datastreams == null) {
			datastreams = new EObjectContainmentEList<DataStreams>(DataStreams.class, this, IoT_metamodelPackage.INFORMATION__DATASTREAMS);
		}
		return datastreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.INFORMATION__ATOMICDATA:
				return ((InternalEList<?>)getAtomicdata()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.INFORMATION__DATASTREAMS:
				return ((InternalEList<?>)getDatastreams()).basicRemove(otherEnd, msgs);
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
			case IoT_metamodelPackage.INFORMATION__ATOMICDATA:
				return getAtomicdata();
			case IoT_metamodelPackage.INFORMATION__DATASTREAMS:
				return getDatastreams();
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
			case IoT_metamodelPackage.INFORMATION__ATOMICDATA:
				getAtomicdata().clear();
				getAtomicdata().addAll((Collection<? extends AtomicData>)newValue);
				return;
			case IoT_metamodelPackage.INFORMATION__DATASTREAMS:
				getDatastreams().clear();
				getDatastreams().addAll((Collection<? extends DataStreams>)newValue);
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
			case IoT_metamodelPackage.INFORMATION__ATOMICDATA:
				getAtomicdata().clear();
				return;
			case IoT_metamodelPackage.INFORMATION__DATASTREAMS:
				getDatastreams().clear();
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
			case IoT_metamodelPackage.INFORMATION__ATOMICDATA:
				return atomicdata != null && !atomicdata.isEmpty();
			case IoT_metamodelPackage.INFORMATION__DATASTREAMS:
				return datastreams != null && !datastreams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationImpl
