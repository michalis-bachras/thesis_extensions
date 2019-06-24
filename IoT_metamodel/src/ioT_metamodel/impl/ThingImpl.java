/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Fog;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.PhysicalThing;
import ioT_metamodel.Property;
import ioT_metamodel.Thing;
import ioT_metamodel.VirtualThing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.ThingImpl#getVirtual_entity <em>Virtual entity</em>}</li>
 *   <li>{@link ioT_metamodel.impl.ThingImpl#getFog <em>Fog</em>}</li>
 *   <li>{@link ioT_metamodel.impl.ThingImpl#getPhysical_entity <em>Physical entity</em>}</li>
 *   <li>{@link ioT_metamodel.impl.ThingImpl#getName <em>Name</em>}</li>
 *   <li>{@link ioT_metamodel.impl.ThingImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link ioT_metamodel.impl.ThingImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends EntityImpl implements Thing {
	/**
	 * The cached value of the '{@link #getVirtual_entity() <em>Virtual entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtual_entity()
	 * @generated
	 * @ordered
	 */
	protected VirtualThing virtual_entity;

	/**
	 * The cached value of the '{@link #getFog() <em>Fog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFog()
	 * @generated
	 * @ordered
	 */
	protected Fog fog;

	/**
	 * The cached value of the '{@link #getPhysical_entity() <em>Physical entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_entity()
	 * @generated
	 * @ordered
	 */
	protected PhysicalThing physical_entity;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> contains;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualThing getVirtual_entity() {
		return virtual_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtual_entity(VirtualThing newVirtual_entity, NotificationChain msgs) {
		VirtualThing oldVirtual_entity = virtual_entity;
		virtual_entity = newVirtual_entity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.THING__VIRTUAL_ENTITY, oldVirtual_entity, newVirtual_entity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtual_entity(VirtualThing newVirtual_entity) {
		if (newVirtual_entity != virtual_entity) {
			NotificationChain msgs = null;
			if (virtual_entity != null)
				msgs = ((InternalEObject)virtual_entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.THING__VIRTUAL_ENTITY, null, msgs);
			if (newVirtual_entity != null)
				msgs = ((InternalEObject)newVirtual_entity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.THING__VIRTUAL_ENTITY, null, msgs);
			msgs = basicSetVirtual_entity(newVirtual_entity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.THING__VIRTUAL_ENTITY, newVirtual_entity, newVirtual_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fog getFog() {
		if (fog != null && fog.eIsProxy()) {
			InternalEObject oldFog = (InternalEObject)fog;
			fog = (Fog)eResolveProxy(oldFog);
			if (fog != oldFog) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.THING__FOG, oldFog, fog));
			}
		}
		return fog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fog basicGetFog() {
		return fog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFog(Fog newFog, NotificationChain msgs) {
		Fog oldFog = fog;
		fog = newFog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.THING__FOG, oldFog, newFog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFog(Fog newFog) {
		if (newFog != fog) {
			NotificationChain msgs = null;
			if (fog != null)
				msgs = ((InternalEObject)fog).eInverseRemove(this, IoT_metamodelPackage.FOG__REQUEST_SERVICE, Fog.class, msgs);
			if (newFog != null)
				msgs = ((InternalEObject)newFog).eInverseAdd(this, IoT_metamodelPackage.FOG__REQUEST_SERVICE, Fog.class, msgs);
			msgs = basicSetFog(newFog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.THING__FOG, newFog, newFog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalThing getPhysical_entity() {
		return physical_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysical_entity(PhysicalThing newPhysical_entity, NotificationChain msgs) {
		PhysicalThing oldPhysical_entity = physical_entity;
		physical_entity = newPhysical_entity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.THING__PHYSICAL_ENTITY, oldPhysical_entity, newPhysical_entity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysical_entity(PhysicalThing newPhysical_entity) {
		if (newPhysical_entity != physical_entity) {
			NotificationChain msgs = null;
			if (physical_entity != null)
				msgs = ((InternalEObject)physical_entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.THING__PHYSICAL_ENTITY, null, msgs);
			if (newPhysical_entity != null)
				msgs = ((InternalEObject)newPhysical_entity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.THING__PHYSICAL_ENTITY, null, msgs);
			msgs = basicSetPhysical_entity(newPhysical_entity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.THING__PHYSICAL_ENTITY, newPhysical_entity, newPhysical_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.THING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getContains() {
		if (contains == null) {
			contains = new EObjectResolvingEList<Thing>(Thing.class, this, IoT_metamodelPackage.THING__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, IoT_metamodelPackage.THING__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.THING__FOG:
				if (fog != null)
					msgs = ((InternalEObject)fog).eInverseRemove(this, IoT_metamodelPackage.FOG__REQUEST_SERVICE, Fog.class, msgs);
				return basicSetFog((Fog)otherEnd, msgs);
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
			case IoT_metamodelPackage.THING__VIRTUAL_ENTITY:
				return basicSetVirtual_entity(null, msgs);
			case IoT_metamodelPackage.THING__FOG:
				return basicSetFog(null, msgs);
			case IoT_metamodelPackage.THING__PHYSICAL_ENTITY:
				return basicSetPhysical_entity(null, msgs);
			case IoT_metamodelPackage.THING__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case IoT_metamodelPackage.THING__VIRTUAL_ENTITY:
				return getVirtual_entity();
			case IoT_metamodelPackage.THING__FOG:
				if (resolve) return getFog();
				return basicGetFog();
			case IoT_metamodelPackage.THING__PHYSICAL_ENTITY:
				return getPhysical_entity();
			case IoT_metamodelPackage.THING__NAME:
				return getName();
			case IoT_metamodelPackage.THING__CONTAINS:
				return getContains();
			case IoT_metamodelPackage.THING__PROPERTY:
				return getProperty();
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
			case IoT_metamodelPackage.THING__VIRTUAL_ENTITY:
				setVirtual_entity((VirtualThing)newValue);
				return;
			case IoT_metamodelPackage.THING__FOG:
				setFog((Fog)newValue);
				return;
			case IoT_metamodelPackage.THING__PHYSICAL_ENTITY:
				setPhysical_entity((PhysicalThing)newValue);
				return;
			case IoT_metamodelPackage.THING__NAME:
				setName((String)newValue);
				return;
			case IoT_metamodelPackage.THING__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Thing>)newValue);
				return;
			case IoT_metamodelPackage.THING__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
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
			case IoT_metamodelPackage.THING__VIRTUAL_ENTITY:
				setVirtual_entity((VirtualThing)null);
				return;
			case IoT_metamodelPackage.THING__FOG:
				setFog((Fog)null);
				return;
			case IoT_metamodelPackage.THING__PHYSICAL_ENTITY:
				setPhysical_entity((PhysicalThing)null);
				return;
			case IoT_metamodelPackage.THING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IoT_metamodelPackage.THING__CONTAINS:
				getContains().clear();
				return;
			case IoT_metamodelPackage.THING__PROPERTY:
				getProperty().clear();
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
			case IoT_metamodelPackage.THING__VIRTUAL_ENTITY:
				return virtual_entity != null;
			case IoT_metamodelPackage.THING__FOG:
				return fog != null;
			case IoT_metamodelPackage.THING__PHYSICAL_ENTITY:
				return physical_entity != null;
			case IoT_metamodelPackage.THING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IoT_metamodelPackage.THING__CONTAINS:
				return contains != null && !contains.isEmpty();
			case IoT_metamodelPackage.THING__PROPERTY:
				return property != null && !property.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
