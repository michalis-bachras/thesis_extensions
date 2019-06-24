/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Database;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Policy_Repository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.DatabaseImpl#getPolicy_repository <em>Policy repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements Database {
	/**
	 * The cached value of the '{@link #getPolicy_repository() <em>Policy repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy_repository()
	 * @generated
	 * @ordered
	 */
	protected Policy_Repository policy_repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy_Repository getPolicy_repository() {
		return policy_repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy_repository(Policy_Repository newPolicy_repository, NotificationChain msgs) {
		Policy_Repository oldPolicy_repository = policy_repository;
		policy_repository = newPolicy_repository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY, oldPolicy_repository, newPolicy_repository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy_repository(Policy_Repository newPolicy_repository) {
		if (newPolicy_repository != policy_repository) {
			NotificationChain msgs = null;
			if (policy_repository != null)
				msgs = ((InternalEObject)policy_repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY, null, msgs);
			if (newPolicy_repository != null)
				msgs = ((InternalEObject)newPolicy_repository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY, null, msgs);
			msgs = basicSetPolicy_repository(newPolicy_repository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY, newPolicy_repository, newPolicy_repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY:
				return basicSetPolicy_repository(null, msgs);
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
			case IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY:
				return getPolicy_repository();
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
			case IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY:
				setPolicy_repository((Policy_Repository)newValue);
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
			case IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY:
				setPolicy_repository((Policy_Repository)null);
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
			case IoT_metamodelPackage.DATABASE__POLICY_REPOSITORY:
				return policy_repository != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseImpl
