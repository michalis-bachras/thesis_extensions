/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Communicator;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.CommunicatorImpl#getHas_ports <em>Has ports</em>}</li>
 *   <li>{@link ioT_metamodel.impl.CommunicatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link ioT_metamodel.impl.CommunicatorImpl#getPorts_number <em>Ports number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicatorImpl extends MinimalEObjectImpl.Container implements Communicator {
	/**
	 * The cached value of the '{@link #getHas_ports() <em>Has ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_ports()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> has_ports;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorts_number() <em>Ports number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts_number()
	 * @generated
	 * @ordered
	 */
	protected static final int PORTS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPorts_number() <em>Ports number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts_number()
	 * @generated
	 * @ordered
	 */
	protected int ports_number = PORTS_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.COMMUNICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getHas_ports() {
		if (has_ports == null) {
			has_ports = new EObjectContainmentEList<Port>(Port.class, this, IoT_metamodelPackage.COMMUNICATOR__HAS_PORTS);
		}
		return has_ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.COMMUNICATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPorts_number() {
		return ports_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts_number(int newPorts_number) {
		int oldPorts_number = ports_number;
		ports_number = newPorts_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.COMMUNICATOR__PORTS_NUMBER, oldPorts_number, ports_number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.COMMUNICATOR__HAS_PORTS:
				return ((InternalEList<?>)getHas_ports()).basicRemove(otherEnd, msgs);
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
			case IoT_metamodelPackage.COMMUNICATOR__HAS_PORTS:
				return getHas_ports();
			case IoT_metamodelPackage.COMMUNICATOR__TYPE:
				return getType();
			case IoT_metamodelPackage.COMMUNICATOR__PORTS_NUMBER:
				return getPorts_number();
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
			case IoT_metamodelPackage.COMMUNICATOR__HAS_PORTS:
				getHas_ports().clear();
				getHas_ports().addAll((Collection<? extends Port>)newValue);
				return;
			case IoT_metamodelPackage.COMMUNICATOR__TYPE:
				setType((String)newValue);
				return;
			case IoT_metamodelPackage.COMMUNICATOR__PORTS_NUMBER:
				setPorts_number((Integer)newValue);
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
			case IoT_metamodelPackage.COMMUNICATOR__HAS_PORTS:
				getHas_ports().clear();
				return;
			case IoT_metamodelPackage.COMMUNICATOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IoT_metamodelPackage.COMMUNICATOR__PORTS_NUMBER:
				setPorts_number(PORTS_NUMBER_EDEFAULT);
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
			case IoT_metamodelPackage.COMMUNICATOR__HAS_PORTS:
				return has_ports != null && !has_ports.isEmpty();
			case IoT_metamodelPackage.COMMUNICATOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IoT_metamodelPackage.COMMUNICATOR__PORTS_NUMBER:
				return ports_number != PORTS_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Type: ");
		result.append(type);
		result.append(", ports_number: ");
		result.append(ports_number);
		result.append(')');
		return result.toString();
	}

} //CommunicatorImpl
