/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Analytics_Engine;
import ioT_metamodel.FogNode;
import ioT_metamodel.Fog_Services;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.VM;

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
 * An implementation of the model object '<em><b>Fog Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.FogNodeImpl#getRuns_on_vm <em>Runs on vm</em>}</li>
 *   <li>{@link ioT_metamodel.impl.FogNodeImpl#getRuns_in_container <em>Runs in container</em>}</li>
 *   <li>{@link ioT_metamodel.impl.FogNodeImpl#getAnalytics_engine <em>Analytics engine</em>}</li>
 *   <li>{@link ioT_metamodel.impl.FogNodeImpl#getAssociates_with <em>Associates with</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FogNodeImpl extends MinimalEObjectImpl.Container implements FogNode {
	/**
	 * The cached value of the '{@link #getRuns_on_vm() <em>Runs on vm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_on_vm()
	 * @generated
	 * @ordered
	 */
	protected EList<VM> runs_on_vm;

	/**
	 * The cached value of the '{@link #getRuns_in_container() <em>Runs in container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_in_container()
	 * @generated
	 * @ordered
	 */
	protected EList<ioT_metamodel.Container> runs_in_container;

	/**
	 * The cached value of the '{@link #getAnalytics_engine() <em>Analytics engine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalytics_engine()
	 * @generated
	 * @ordered
	 */
	protected Analytics_Engine analytics_engine;

	/**
	 * The cached value of the '{@link #getAssociates_with() <em>Associates with</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociates_with()
	 * @generated
	 * @ordered
	 */
	protected EList<Fog_Services> associates_with;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.FOG_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VM> getRuns_on_vm() {
		if (runs_on_vm == null) {
			runs_on_vm = new EObjectContainmentEList<VM>(VM.class, this, IoT_metamodelPackage.FOG_NODE__RUNS_ON_VM);
		}
		return runs_on_vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ioT_metamodel.Container> getRuns_in_container() {
		if (runs_in_container == null) {
			runs_in_container = new EObjectContainmentEList<ioT_metamodel.Container>(ioT_metamodel.Container.class, this, IoT_metamodelPackage.FOG_NODE__RUNS_IN_CONTAINER);
		}
		return runs_in_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analytics_Engine getAnalytics_engine() {
		return analytics_engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalytics_engine(Analytics_Engine newAnalytics_engine, NotificationChain msgs) {
		Analytics_Engine oldAnalytics_engine = analytics_engine;
		analytics_engine = newAnalytics_engine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE, oldAnalytics_engine, newAnalytics_engine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalytics_engine(Analytics_Engine newAnalytics_engine) {
		if (newAnalytics_engine != analytics_engine) {
			NotificationChain msgs = null;
			if (analytics_engine != null)
				msgs = ((InternalEObject)analytics_engine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE, null, msgs);
			if (newAnalytics_engine != null)
				msgs = ((InternalEObject)newAnalytics_engine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE, null, msgs);
			msgs = basicSetAnalytics_engine(newAnalytics_engine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE, newAnalytics_engine, newAnalytics_engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fog_Services> getAssociates_with() {
		if (associates_with == null) {
			associates_with = new EObjectResolvingEList<Fog_Services>(Fog_Services.class, this, IoT_metamodelPackage.FOG_NODE__ASSOCIATES_WITH);
		}
		return associates_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.FOG_NODE__RUNS_ON_VM:
				return ((InternalEList<?>)getRuns_on_vm()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.FOG_NODE__RUNS_IN_CONTAINER:
				return ((InternalEList<?>)getRuns_in_container()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE:
				return basicSetAnalytics_engine(null, msgs);
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
			case IoT_metamodelPackage.FOG_NODE__RUNS_ON_VM:
				return getRuns_on_vm();
			case IoT_metamodelPackage.FOG_NODE__RUNS_IN_CONTAINER:
				return getRuns_in_container();
			case IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE:
				return getAnalytics_engine();
			case IoT_metamodelPackage.FOG_NODE__ASSOCIATES_WITH:
				return getAssociates_with();
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
			case IoT_metamodelPackage.FOG_NODE__RUNS_ON_VM:
				getRuns_on_vm().clear();
				getRuns_on_vm().addAll((Collection<? extends VM>)newValue);
				return;
			case IoT_metamodelPackage.FOG_NODE__RUNS_IN_CONTAINER:
				getRuns_in_container().clear();
				getRuns_in_container().addAll((Collection<? extends ioT_metamodel.Container>)newValue);
				return;
			case IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE:
				setAnalytics_engine((Analytics_Engine)newValue);
				return;
			case IoT_metamodelPackage.FOG_NODE__ASSOCIATES_WITH:
				getAssociates_with().clear();
				getAssociates_with().addAll((Collection<? extends Fog_Services>)newValue);
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
			case IoT_metamodelPackage.FOG_NODE__RUNS_ON_VM:
				getRuns_on_vm().clear();
				return;
			case IoT_metamodelPackage.FOG_NODE__RUNS_IN_CONTAINER:
				getRuns_in_container().clear();
				return;
			case IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE:
				setAnalytics_engine((Analytics_Engine)null);
				return;
			case IoT_metamodelPackage.FOG_NODE__ASSOCIATES_WITH:
				getAssociates_with().clear();
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
			case IoT_metamodelPackage.FOG_NODE__RUNS_ON_VM:
				return runs_on_vm != null && !runs_on_vm.isEmpty();
			case IoT_metamodelPackage.FOG_NODE__RUNS_IN_CONTAINER:
				return runs_in_container != null && !runs_in_container.isEmpty();
			case IoT_metamodelPackage.FOG_NODE__ANALYTICS_ENGINE:
				return analytics_engine != null;
			case IoT_metamodelPackage.FOG_NODE__ASSOCIATES_WITH:
				return associates_with != null && !associates_with.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FogNodeImpl
