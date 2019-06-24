/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Active_Digital_Artifact;
import ioT_metamodel.Entity;
import ioT_metamodel.Fog_Services;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.User;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Digital Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.Active_Digital_ArtifactImpl#getSubscribes_invokes <em>Subscribes invokes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Active_Digital_ArtifactImpl extends Digital_ArtifactImpl implements Active_Digital_Artifact {
	/**
	 * The cached value of the '{@link #getSubscribes_invokes() <em>Subscribes invokes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribes_invokes()
	 * @generated
	 * @ordered
	 */
	protected EList<Fog_Services> subscribes_invokes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Active_Digital_ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.ACTIVE_DIGITAL_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fog_Services> getSubscribes_invokes() {
		if (subscribes_invokes == null) {
			subscribes_invokes = new EObjectResolvingEList<Fog_Services>(Fog_Services.class, this, IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES);
		}
		return subscribes_invokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES:
				return getSubscribes_invokes();
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
			case IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES:
				getSubscribes_invokes().clear();
				getSubscribes_invokes().addAll((Collection<? extends Fog_Services>)newValue);
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
			case IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES:
				getSubscribes_invokes().clear();
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
			case IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES:
				return subscribes_invokes != null && !subscribes_invokes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == User.class) {
			switch (derivedFeatureID) {
				case IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES: return IoT_metamodelPackage.USER__SUBSCRIBES_INVOKES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == User.class) {
			switch (baseFeatureID) {
				case IoT_metamodelPackage.USER__SUBSCRIBES_INVOKES: return IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Active_Digital_ArtifactImpl
