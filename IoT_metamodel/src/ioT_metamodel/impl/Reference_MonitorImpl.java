/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Authorizor;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Policy_Repository;
import ioT_metamodel.Reference_Monitor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.Reference_MonitorImpl#getOrchestrate_policies <em>Orchestrate policies</em>}</li>
 *   <li>{@link ioT_metamodel.impl.Reference_MonitorImpl#getEnforces <em>Enforces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Reference_MonitorImpl extends MinimalEObjectImpl.Container implements Reference_Monitor {
	/**
	 * The cached value of the '{@link #getOrchestrate_policies() <em>Orchestrate policies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrchestrate_policies()
	 * @generated
	 * @ordered
	 */
	protected Policy_Repository orchestrate_policies;

	/**
	 * The cached value of the '{@link #getEnforces() <em>Enforces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnforces()
	 * @generated
	 * @ordered
	 */
	protected EList<Authorizor> enforces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reference_MonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.REFERENCE_MONITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy_Repository getOrchestrate_policies() {
		if (orchestrate_policies != null && orchestrate_policies.eIsProxy()) {
			InternalEObject oldOrchestrate_policies = (InternalEObject)orchestrate_policies;
			orchestrate_policies = (Policy_Repository)eResolveProxy(oldOrchestrate_policies);
			if (orchestrate_policies != oldOrchestrate_policies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES, oldOrchestrate_policies, orchestrate_policies));
			}
		}
		return orchestrate_policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy_Repository basicGetOrchestrate_policies() {
		return orchestrate_policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrchestrate_policies(Policy_Repository newOrchestrate_policies, NotificationChain msgs) {
		Policy_Repository oldOrchestrate_policies = orchestrate_policies;
		orchestrate_policies = newOrchestrate_policies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES, oldOrchestrate_policies, newOrchestrate_policies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrchestrate_policies(Policy_Repository newOrchestrate_policies) {
		if (newOrchestrate_policies != orchestrate_policies) {
			NotificationChain msgs = null;
			if (orchestrate_policies != null)
				msgs = ((InternalEObject)orchestrate_policies).eInverseRemove(this, IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH, Policy_Repository.class, msgs);
			if (newOrchestrate_policies != null)
				msgs = ((InternalEObject)newOrchestrate_policies).eInverseAdd(this, IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH, Policy_Repository.class, msgs);
			msgs = basicSetOrchestrate_policies(newOrchestrate_policies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES, newOrchestrate_policies, newOrchestrate_policies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Authorizor> getEnforces() {
		if (enforces == null) {
			enforces = new EObjectResolvingEList<Authorizor>(Authorizor.class, this, IoT_metamodelPackage.REFERENCE_MONITOR__ENFORCES);
		}
		return enforces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES:
				if (orchestrate_policies != null)
					msgs = ((InternalEObject)orchestrate_policies).eInverseRemove(this, IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH, Policy_Repository.class, msgs);
				return basicSetOrchestrate_policies((Policy_Repository)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES:
				return basicSetOrchestrate_policies(null, msgs);
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
			case IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES:
				if (resolve) return getOrchestrate_policies();
				return basicGetOrchestrate_policies();
			case IoT_metamodelPackage.REFERENCE_MONITOR__ENFORCES:
				return getEnforces();
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
			case IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES:
				setOrchestrate_policies((Policy_Repository)newValue);
				return;
			case IoT_metamodelPackage.REFERENCE_MONITOR__ENFORCES:
				getEnforces().clear();
				getEnforces().addAll((Collection<? extends Authorizor>)newValue);
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
			case IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES:
				setOrchestrate_policies((Policy_Repository)null);
				return;
			case IoT_metamodelPackage.REFERENCE_MONITOR__ENFORCES:
				getEnforces().clear();
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
			case IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES:
				return orchestrate_policies != null;
			case IoT_metamodelPackage.REFERENCE_MONITOR__ENFORCES:
				return enforces != null && !enforces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Reference_MonitorImpl
