/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Information;
import ioT_metamodel.InformationResource;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.PhysicalThing;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.InformationResourceImpl#getHas_information_about <em>Has information about</em>}</li>
 *   <li>{@link ioT_metamodel.impl.InformationResourceImpl#getHas <em>Has</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationResourceImpl extends MinimalEObjectImpl.Container implements InformationResource {
	/**
	 * The cached value of the '{@link #getHas_information_about() <em>Has information about</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_information_about()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalThing> has_information_about;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> has;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.INFORMATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalThing> getHas_information_about() {
		if (has_information_about == null) {
			has_information_about = new EObjectResolvingEList<PhysicalThing>(PhysicalThing.class, this, IoT_metamodelPackage.INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT);
		}
		return has_information_about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getHas() {
		if (has == null) {
			has = new EObjectContainmentEList<Information>(Information.class, this, IoT_metamodelPackage.INFORMATION_RESOURCE__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
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
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT:
				return getHas_information_about();
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS:
				return getHas();
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
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT:
				getHas_information_about().clear();
				getHas_information_about().addAll((Collection<? extends PhysicalThing>)newValue);
				return;
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Information>)newValue);
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
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT:
				getHas_information_about().clear();
				return;
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS:
				getHas().clear();
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
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT:
				return has_information_about != null && !has_information_about.isEmpty();
			case IoT_metamodelPackage.INFORMATION_RESOURCE__HAS:
				return has != null && !has.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationResourceImpl
