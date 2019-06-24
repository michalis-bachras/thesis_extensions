/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Fog_Services;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.User;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.UserImpl#getSubscribes_invokes <em>Subscribes invokes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends EntityImpl implements User {
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
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fog_Services> getSubscribes_invokes() {
		if (subscribes_invokes == null) {
			subscribes_invokes = new EObjectResolvingEList<Fog_Services>(Fog_Services.class, this, IoT_metamodelPackage.USER__SUBSCRIBES_INVOKES);
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
			case IoT_metamodelPackage.USER__SUBSCRIBES_INVOKES:
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
			case IoT_metamodelPackage.USER__SUBSCRIBES_INVOKES:
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
			case IoT_metamodelPackage.USER__SUBSCRIBES_INVOKES:
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
			case IoT_metamodelPackage.USER__SUBSCRIBES_INVOKES:
				return subscribes_invokes != null && !subscribes_invokes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
