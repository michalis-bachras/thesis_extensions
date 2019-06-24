/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Authorizor;
import ioT_metamodel.Fog;
import ioT_metamodel.IoT_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorizor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.AuthorizorImpl#getConnects_with <em>Connects with</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizorImpl extends MinimalEObjectImpl.Container implements Authorizor {
	/**
	 * The cached value of the '{@link #getConnects_with() <em>Connects with</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnects_with()
	 * @generated
	 * @ordered
	 */
	protected Fog connects_with;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.AUTHORIZOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fog getConnects_with() {
		if (connects_with != null && connects_with.eIsProxy()) {
			InternalEObject oldConnects_with = (InternalEObject)connects_with;
			connects_with = (Fog)eResolveProxy(oldConnects_with);
			if (connects_with != oldConnects_with) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH, oldConnects_with, connects_with));
			}
		}
		return connects_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fog basicGetConnects_with() {
		return connects_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnects_with(Fog newConnects_with, NotificationChain msgs) {
		Fog oldConnects_with = connects_with;
		connects_with = newConnects_with;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH, oldConnects_with, newConnects_with);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnects_with(Fog newConnects_with) {
		if (newConnects_with != connects_with) {
			NotificationChain msgs = null;
			if (connects_with != null)
				msgs = ((InternalEObject)connects_with).eInverseRemove(this, IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO, Fog.class, msgs);
			if (newConnects_with != null)
				msgs = ((InternalEObject)newConnects_with).eInverseAdd(this, IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO, Fog.class, msgs);
			msgs = basicSetConnects_with(newConnects_with, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH, newConnects_with, newConnects_with));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH:
				if (connects_with != null)
					msgs = ((InternalEObject)connects_with).eInverseRemove(this, IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO, Fog.class, msgs);
				return basicSetConnects_with((Fog)otherEnd, msgs);
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
			case IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH:
				return basicSetConnects_with(null, msgs);
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
			case IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH:
				if (resolve) return getConnects_with();
				return basicGetConnects_with();
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
			case IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH:
				setConnects_with((Fog)newValue);
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
			case IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH:
				setConnects_with((Fog)null);
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
			case IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH:
				return connects_with != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthorizorImpl
