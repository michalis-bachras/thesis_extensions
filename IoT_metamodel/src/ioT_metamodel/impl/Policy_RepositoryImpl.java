/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Authorizor;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Policy_Repository;
import ioT_metamodel.Reference_Monitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.Policy_RepositoryImpl#getInteracts_with <em>Interacts with</em>}</li>
 *   <li>{@link ioT_metamodel.impl.Policy_RepositoryImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Policy_RepositoryImpl extends MinimalEObjectImpl.Container implements Policy_Repository {
	/**
	 * The cached value of the '{@link #getInteracts_with() <em>Interacts with</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteracts_with()
	 * @generated
	 * @ordered
	 */
	protected Reference_Monitor interacts_with;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected Authorizor contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Policy_RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.POLICY_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference_Monitor getInteracts_with() {
		if (interacts_with != null && interacts_with.eIsProxy()) {
			InternalEObject oldInteracts_with = (InternalEObject)interacts_with;
			interacts_with = (Reference_Monitor)eResolveProxy(oldInteracts_with);
			if (interacts_with != oldInteracts_with) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH, oldInteracts_with, interacts_with));
			}
		}
		return interacts_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference_Monitor basicGetInteracts_with() {
		return interacts_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteracts_with(Reference_Monitor newInteracts_with, NotificationChain msgs) {
		Reference_Monitor oldInteracts_with = interacts_with;
		interacts_with = newInteracts_with;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH, oldInteracts_with, newInteracts_with);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteracts_with(Reference_Monitor newInteracts_with) {
		if (newInteracts_with != interacts_with) {
			NotificationChain msgs = null;
			if (interacts_with != null)
				msgs = ((InternalEObject)interacts_with).eInverseRemove(this, IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES, Reference_Monitor.class, msgs);
			if (newInteracts_with != null)
				msgs = ((InternalEObject)newInteracts_with).eInverseAdd(this, IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES, Reference_Monitor.class, msgs);
			msgs = basicSetInteracts_with(newInteracts_with, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH, newInteracts_with, newInteracts_with));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorizor getContains() {
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContains(Authorizor newContains, NotificationChain msgs) {
		Authorizor oldContains = contains;
		contains = newContains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS, oldContains, newContains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContains(Authorizor newContains) {
		if (newContains != contains) {
			NotificationChain msgs = null;
			if (contains != null)
				msgs = ((InternalEObject)contains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS, null, msgs);
			if (newContains != null)
				msgs = ((InternalEObject)newContains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS, null, msgs);
			msgs = basicSetContains(newContains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS, newContains, newContains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH:
				if (interacts_with != null)
					msgs = ((InternalEObject)interacts_with).eInverseRemove(this, IoT_metamodelPackage.REFERENCE_MONITOR__ORCHESTRATE_POLICIES, Reference_Monitor.class, msgs);
				return basicSetInteracts_with((Reference_Monitor)otherEnd, msgs);
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
			case IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH:
				return basicSetInteracts_with(null, msgs);
			case IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS:
				return basicSetContains(null, msgs);
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
			case IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH:
				if (resolve) return getInteracts_with();
				return basicGetInteracts_with();
			case IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS:
				return getContains();
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
			case IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH:
				setInteracts_with((Reference_Monitor)newValue);
				return;
			case IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS:
				setContains((Authorizor)newValue);
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
			case IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH:
				setInteracts_with((Reference_Monitor)null);
				return;
			case IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS:
				setContains((Authorizor)null);
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
			case IoT_metamodelPackage.POLICY_REPOSITORY__INTERACTS_WITH:
				return interacts_with != null;
			case IoT_metamodelPackage.POLICY_REPOSITORY__CONTAINS:
				return contains != null;
		}
		return super.eIsSet(featureID);
	}

} //Policy_RepositoryImpl
