/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Fog_Services;
import ioT_metamodel.InformationResource;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Operations;
import ioT_metamodel.VirtualThing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fog Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.Fog_ServicesImpl#getRuns_in <em>Runs in</em>}</li>
 *   <li>{@link ioT_metamodel.impl.Fog_ServicesImpl#getInvokes <em>Invokes</em>}</li>
 *   <li>{@link ioT_metamodel.impl.Fog_ServicesImpl#getInvokes_fog_services <em>Invokes fog services</em>}</li>
 *   <li>{@link ioT_metamodel.impl.Fog_ServicesImpl#getExposes <em>Exposes</em>}</li>
 *   <li>{@link ioT_metamodel.impl.Fog_ServicesImpl#getIs_connected_with <em>Is connected with</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fog_ServicesImpl extends MinimalEObjectImpl.Container implements Fog_Services {
	/**
	 * The cached value of the '{@link #getRuns_in() <em>Runs in</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_in()
	 * @generated
	 * @ordered
	 */
	protected ioT_metamodel.Container runs_in;

	/**
	 * The cached value of the '{@link #getInvokes() <em>Invokes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokes()
	 * @generated
	 * @ordered
	 */
	protected EList<Operations> invokes;

	/**
	 * The cached value of the '{@link #getInvokes_fog_services() <em>Invokes fog services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokes_fog_services()
	 * @generated
	 * @ordered
	 */
	protected EList<Fog_Services> invokes_fog_services;

	/**
	 * The cached value of the '{@link #getExposes() <em>Exposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposes()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationResource> exposes;

	/**
	 * The cached value of the '{@link #getIs_connected_with() <em>Is connected with</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_connected_with()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualThing> is_connected_with;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fog_ServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.FOG_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ioT_metamodel.Container getRuns_in() {
		if (runs_in != null && runs_in.eIsProxy()) {
			InternalEObject oldRuns_in = (InternalEObject)runs_in;
			runs_in = (ioT_metamodel.Container)eResolveProxy(oldRuns_in);
			if (runs_in != oldRuns_in) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.FOG_SERVICES__RUNS_IN, oldRuns_in, runs_in));
			}
		}
		return runs_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ioT_metamodel.Container basicGetRuns_in() {
		return runs_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuns_in(ioT_metamodel.Container newRuns_in) {
		ioT_metamodel.Container oldRuns_in = runs_in;
		runs_in = newRuns_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.FOG_SERVICES__RUNS_IN, oldRuns_in, runs_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operations> getInvokes() {
		if (invokes == null) {
			invokes = new EObjectContainmentEList<Operations>(Operations.class, this, IoT_metamodelPackage.FOG_SERVICES__INVOKES);
		}
		return invokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fog_Services> getInvokes_fog_services() {
		if (invokes_fog_services == null) {
			invokes_fog_services = new EObjectResolvingEList<Fog_Services>(Fog_Services.class, this, IoT_metamodelPackage.FOG_SERVICES__INVOKES_FOG_SERVICES);
		}
		return invokes_fog_services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationResource> getExposes() {
		if (exposes == null) {
			exposes = new EObjectResolvingEList<InformationResource>(InformationResource.class, this, IoT_metamodelPackage.FOG_SERVICES__EXPOSES);
		}
		return exposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualThing> getIs_connected_with() {
		if (is_connected_with == null) {
			is_connected_with = new EObjectResolvingEList<VirtualThing>(VirtualThing.class, this, IoT_metamodelPackage.FOG_SERVICES__IS_CONNECTED_WITH);
		}
		return is_connected_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES:
				return ((InternalEList<?>)getInvokes()).basicRemove(otherEnd, msgs);
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
			case IoT_metamodelPackage.FOG_SERVICES__RUNS_IN:
				if (resolve) return getRuns_in();
				return basicGetRuns_in();
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES:
				return getInvokes();
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES_FOG_SERVICES:
				return getInvokes_fog_services();
			case IoT_metamodelPackage.FOG_SERVICES__EXPOSES:
				return getExposes();
			case IoT_metamodelPackage.FOG_SERVICES__IS_CONNECTED_WITH:
				return getIs_connected_with();
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
			case IoT_metamodelPackage.FOG_SERVICES__RUNS_IN:
				setRuns_in((ioT_metamodel.Container)newValue);
				return;
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES:
				getInvokes().clear();
				getInvokes().addAll((Collection<? extends Operations>)newValue);
				return;
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES_FOG_SERVICES:
				getInvokes_fog_services().clear();
				getInvokes_fog_services().addAll((Collection<? extends Fog_Services>)newValue);
				return;
			case IoT_metamodelPackage.FOG_SERVICES__EXPOSES:
				getExposes().clear();
				getExposes().addAll((Collection<? extends InformationResource>)newValue);
				return;
			case IoT_metamodelPackage.FOG_SERVICES__IS_CONNECTED_WITH:
				getIs_connected_with().clear();
				getIs_connected_with().addAll((Collection<? extends VirtualThing>)newValue);
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
			case IoT_metamodelPackage.FOG_SERVICES__RUNS_IN:
				setRuns_in((ioT_metamodel.Container)null);
				return;
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES:
				getInvokes().clear();
				return;
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES_FOG_SERVICES:
				getInvokes_fog_services().clear();
				return;
			case IoT_metamodelPackage.FOG_SERVICES__EXPOSES:
				getExposes().clear();
				return;
			case IoT_metamodelPackage.FOG_SERVICES__IS_CONNECTED_WITH:
				getIs_connected_with().clear();
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
			case IoT_metamodelPackage.FOG_SERVICES__RUNS_IN:
				return runs_in != null;
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES:
				return invokes != null && !invokes.isEmpty();
			case IoT_metamodelPackage.FOG_SERVICES__INVOKES_FOG_SERVICES:
				return invokes_fog_services != null && !invokes_fog_services.isEmpty();
			case IoT_metamodelPackage.FOG_SERVICES__EXPOSES:
				return exposes != null && !exposes.isEmpty();
			case IoT_metamodelPackage.FOG_SERVICES__IS_CONNECTED_WITH:
				return is_connected_with != null && !is_connected_with.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Fog_ServicesImpl
