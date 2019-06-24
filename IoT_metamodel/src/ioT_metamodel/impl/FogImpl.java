/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Authorizor;
import ioT_metamodel.Cloud;
import ioT_metamodel.Database;
import ioT_metamodel.Fog;
import ioT_metamodel.FogNode;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Thing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.FogImpl#getRequest_service <em>Request service</em>}</li>
 *   <li>{@link ioT_metamodel.impl.FogImpl#getFognode <em>Fognode</em>}</li>
 *   <li>{@link ioT_metamodel.impl.FogImpl#getRequest_cloud_service <em>Request cloud service</em>}</li>
 *   <li>{@link ioT_metamodel.impl.FogImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link ioT_metamodel.impl.FogImpl#getDefine_control_policies_to <em>Define control policies to</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FogImpl extends MinimalEObjectImpl.Container implements Fog {
	/**
	 * The cached value of the '{@link #getRequest_service() <em>Request service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest_service()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> request_service;

	/**
	 * The cached value of the '{@link #getFognode() <em>Fognode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFognode()
	 * @generated
	 * @ordered
	 */
	protected EList<FogNode> fognode;

	/**
	 * The cached value of the '{@link #getRequest_cloud_service() <em>Request cloud service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest_cloud_service()
	 * @generated
	 * @ordered
	 */
	protected EList<Cloud> request_cloud_service;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> database;

	/**
	 * The cached value of the '{@link #getDefine_control_policies_to() <em>Define control policies to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefine_control_policies_to()
	 * @generated
	 * @ordered
	 */
	protected Authorizor define_control_policies_to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.FOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getRequest_service() {
		if (request_service == null) {
			request_service = new EObjectWithInverseResolvingEList<Thing>(Thing.class, this, IoT_metamodelPackage.FOG__REQUEST_SERVICE, IoT_metamodelPackage.THING__FOG);
		}
		return request_service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FogNode> getFognode() {
		if (fognode == null) {
			fognode = new EObjectContainmentEList<FogNode>(FogNode.class, this, IoT_metamodelPackage.FOG__FOGNODE);
		}
		return fognode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cloud> getRequest_cloud_service() {
		if (request_cloud_service == null) {
			request_cloud_service = new EObjectWithInverseResolvingEList.ManyInverse<Cloud>(Cloud.class, this, IoT_metamodelPackage.FOG__REQUEST_CLOUD_SERVICE, IoT_metamodelPackage.CLOUD__RESPOND_TO_FOG);
		}
		return request_cloud_service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Database> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<Database>(Database.class, this, IoT_metamodelPackage.FOG__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorizor getDefine_control_policies_to() {
		if (define_control_policies_to != null && define_control_policies_to.eIsProxy()) {
			InternalEObject oldDefine_control_policies_to = (InternalEObject)define_control_policies_to;
			define_control_policies_to = (Authorizor)eResolveProxy(oldDefine_control_policies_to);
			if (define_control_policies_to != oldDefine_control_policies_to) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO, oldDefine_control_policies_to, define_control_policies_to));
			}
		}
		return define_control_policies_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorizor basicGetDefine_control_policies_to() {
		return define_control_policies_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefine_control_policies_to(Authorizor newDefine_control_policies_to, NotificationChain msgs) {
		Authorizor oldDefine_control_policies_to = define_control_policies_to;
		define_control_policies_to = newDefine_control_policies_to;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO, oldDefine_control_policies_to, newDefine_control_policies_to);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefine_control_policies_to(Authorizor newDefine_control_policies_to) {
		if (newDefine_control_policies_to != define_control_policies_to) {
			NotificationChain msgs = null;
			if (define_control_policies_to != null)
				msgs = ((InternalEObject)define_control_policies_to).eInverseRemove(this, IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH, Authorizor.class, msgs);
			if (newDefine_control_policies_to != null)
				msgs = ((InternalEObject)newDefine_control_policies_to).eInverseAdd(this, IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH, Authorizor.class, msgs);
			msgs = basicSetDefine_control_policies_to(newDefine_control_policies_to, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO, newDefine_control_policies_to, newDefine_control_policies_to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.FOG__REQUEST_SERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequest_service()).basicAdd(otherEnd, msgs);
			case IoT_metamodelPackage.FOG__REQUEST_CLOUD_SERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequest_cloud_service()).basicAdd(otherEnd, msgs);
			case IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO:
				if (define_control_policies_to != null)
					msgs = ((InternalEObject)define_control_policies_to).eInverseRemove(this, IoT_metamodelPackage.AUTHORIZOR__CONNECTS_WITH, Authorizor.class, msgs);
				return basicSetDefine_control_policies_to((Authorizor)otherEnd, msgs);
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
			case IoT_metamodelPackage.FOG__REQUEST_SERVICE:
				return ((InternalEList<?>)getRequest_service()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.FOG__FOGNODE:
				return ((InternalEList<?>)getFognode()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.FOG__REQUEST_CLOUD_SERVICE:
				return ((InternalEList<?>)getRequest_cloud_service()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.FOG__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
			case IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO:
				return basicSetDefine_control_policies_to(null, msgs);
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
			case IoT_metamodelPackage.FOG__REQUEST_SERVICE:
				return getRequest_service();
			case IoT_metamodelPackage.FOG__FOGNODE:
				return getFognode();
			case IoT_metamodelPackage.FOG__REQUEST_CLOUD_SERVICE:
				return getRequest_cloud_service();
			case IoT_metamodelPackage.FOG__DATABASE:
				return getDatabase();
			case IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO:
				if (resolve) return getDefine_control_policies_to();
				return basicGetDefine_control_policies_to();
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
			case IoT_metamodelPackage.FOG__REQUEST_SERVICE:
				getRequest_service().clear();
				getRequest_service().addAll((Collection<? extends Thing>)newValue);
				return;
			case IoT_metamodelPackage.FOG__FOGNODE:
				getFognode().clear();
				getFognode().addAll((Collection<? extends FogNode>)newValue);
				return;
			case IoT_metamodelPackage.FOG__REQUEST_CLOUD_SERVICE:
				getRequest_cloud_service().clear();
				getRequest_cloud_service().addAll((Collection<? extends Cloud>)newValue);
				return;
			case IoT_metamodelPackage.FOG__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends Database>)newValue);
				return;
			case IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO:
				setDefine_control_policies_to((Authorizor)newValue);
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
			case IoT_metamodelPackage.FOG__REQUEST_SERVICE:
				getRequest_service().clear();
				return;
			case IoT_metamodelPackage.FOG__FOGNODE:
				getFognode().clear();
				return;
			case IoT_metamodelPackage.FOG__REQUEST_CLOUD_SERVICE:
				getRequest_cloud_service().clear();
				return;
			case IoT_metamodelPackage.FOG__DATABASE:
				getDatabase().clear();
				return;
			case IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO:
				setDefine_control_policies_to((Authorizor)null);
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
			case IoT_metamodelPackage.FOG__REQUEST_SERVICE:
				return request_service != null && !request_service.isEmpty();
			case IoT_metamodelPackage.FOG__FOGNODE:
				return fognode != null && !fognode.isEmpty();
			case IoT_metamodelPackage.FOG__REQUEST_CLOUD_SERVICE:
				return request_cloud_service != null && !request_cloud_service.isEmpty();
			case IoT_metamodelPackage.FOG__DATABASE:
				return database != null && !database.isEmpty();
			case IoT_metamodelPackage.FOG__DEFINE_CONTROL_POLICIES_TO:
				return define_control_policies_to != null;
		}
		return super.eIsSet(featureID);
	}

} //FogImpl
