/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Evaluators;
import ioT_metamodel.InformationResource;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Operations;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.OperationsImpl#getPoints_to_processing_logic <em>Points to processing logic</em>}</li>
 *   <li>{@link ioT_metamodel.impl.OperationsImpl#getRuns_in <em>Runs in</em>}</li>
 *   <li>{@link ioT_metamodel.impl.OperationsImpl#getSubscribes_to <em>Subscribes to</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsImpl extends MinimalEObjectImpl.Container implements Operations {
	/**
	 * The cached value of the '{@link #getPoints_to_processing_logic() <em>Points to processing logic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints_to_processing_logic()
	 * @generated
	 * @ordered
	 */
	protected Evaluators points_to_processing_logic;

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
	 * The cached value of the '{@link #getSubscribes_to() <em>Subscribes to</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribes_to()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationResource> subscribes_to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.OPERATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluators getPoints_to_processing_logic() {
		if (points_to_processing_logic != null && points_to_processing_logic.eIsProxy()) {
			InternalEObject oldPoints_to_processing_logic = (InternalEObject)points_to_processing_logic;
			points_to_processing_logic = (Evaluators)eResolveProxy(oldPoints_to_processing_logic);
			if (points_to_processing_logic != oldPoints_to_processing_logic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.OPERATIONS__POINTS_TO_PROCESSING_LOGIC, oldPoints_to_processing_logic, points_to_processing_logic));
			}
		}
		return points_to_processing_logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluators basicGetPoints_to_processing_logic() {
		return points_to_processing_logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints_to_processing_logic(Evaluators newPoints_to_processing_logic) {
		Evaluators oldPoints_to_processing_logic = points_to_processing_logic;
		points_to_processing_logic = newPoints_to_processing_logic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.OPERATIONS__POINTS_TO_PROCESSING_LOGIC, oldPoints_to_processing_logic, points_to_processing_logic));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.OPERATIONS__RUNS_IN, oldRuns_in, runs_in));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.OPERATIONS__RUNS_IN, oldRuns_in, runs_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationResource> getSubscribes_to() {
		if (subscribes_to == null) {
			subscribes_to = new EObjectResolvingEList<InformationResource>(InformationResource.class, this, IoT_metamodelPackage.OPERATIONS__SUBSCRIBES_TO);
		}
		return subscribes_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.OPERATIONS__POINTS_TO_PROCESSING_LOGIC:
				if (resolve) return getPoints_to_processing_logic();
				return basicGetPoints_to_processing_logic();
			case IoT_metamodelPackage.OPERATIONS__RUNS_IN:
				if (resolve) return getRuns_in();
				return basicGetRuns_in();
			case IoT_metamodelPackage.OPERATIONS__SUBSCRIBES_TO:
				return getSubscribes_to();
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
			case IoT_metamodelPackage.OPERATIONS__POINTS_TO_PROCESSING_LOGIC:
				setPoints_to_processing_logic((Evaluators)newValue);
				return;
			case IoT_metamodelPackage.OPERATIONS__RUNS_IN:
				setRuns_in((ioT_metamodel.Container)newValue);
				return;
			case IoT_metamodelPackage.OPERATIONS__SUBSCRIBES_TO:
				getSubscribes_to().clear();
				getSubscribes_to().addAll((Collection<? extends InformationResource>)newValue);
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
			case IoT_metamodelPackage.OPERATIONS__POINTS_TO_PROCESSING_LOGIC:
				setPoints_to_processing_logic((Evaluators)null);
				return;
			case IoT_metamodelPackage.OPERATIONS__RUNS_IN:
				setRuns_in((ioT_metamodel.Container)null);
				return;
			case IoT_metamodelPackage.OPERATIONS__SUBSCRIBES_TO:
				getSubscribes_to().clear();
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
			case IoT_metamodelPackage.OPERATIONS__POINTS_TO_PROCESSING_LOGIC:
				return points_to_processing_logic != null;
			case IoT_metamodelPackage.OPERATIONS__RUNS_IN:
				return runs_in != null;
			case IoT_metamodelPackage.OPERATIONS__SUBSCRIBES_TO:
				return subscribes_to != null && !subscribes_to.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationsImpl
