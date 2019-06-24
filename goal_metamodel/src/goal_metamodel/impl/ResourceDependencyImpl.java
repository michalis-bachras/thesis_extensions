/**
 */
package goal_metamodel.impl;

import goal_metamodel.Action;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.Resource;
import goal_metamodel.ResourceDependency;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.ResourceDependencyImpl#getTo_resource <em>To resource</em>}</li>
 *   <li>{@link goal_metamodel.impl.ResourceDependencyImpl#getFrom_action <em>From action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceDependencyImpl extends DependencyLinkImpl implements ResourceDependency,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9L;

	/**
	 * The cached value of the '{@link #getTo_resource() <em>To resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_resource()
	 * @generated
	 * @ordered
	 */
	protected Resource to_resource;

	/**
	 * The cached value of the '{@link #getFrom_action() <em>From action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_action()
	 * @generated
	 * @ordered
	 */
	protected Action from_action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.RESOURCE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getTo_resource() {
		if (to_resource != null && to_resource.eIsProxy()) {
			InternalEObject oldTo_resource = (InternalEObject)to_resource;
			to_resource = (Resource)eResolveProxy(oldTo_resource);
			if (to_resource != oldTo_resource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.RESOURCE_DEPENDENCY__TO_RESOURCE, oldTo_resource, to_resource));
			}
		}
		return to_resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetTo_resource() {
		return to_resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_resource(Resource newTo_resource) {
		Resource oldTo_resource = to_resource;
		to_resource = newTo_resource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.RESOURCE_DEPENDENCY__TO_RESOURCE, oldTo_resource, to_resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getFrom_action() {
		if (from_action != null && from_action.eIsProxy()) {
			InternalEObject oldFrom_action = (InternalEObject)from_action;
			from_action = (Action)eResolveProxy(oldFrom_action);
			if (from_action != oldFrom_action) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.RESOURCE_DEPENDENCY__FROM_ACTION, oldFrom_action, from_action));
			}
		}
		return from_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetFrom_action() {
		return from_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_action(Action newFrom_action) {
		Action oldFrom_action = from_action;
		from_action = newFrom_action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.RESOURCE_DEPENDENCY__FROM_ACTION, oldFrom_action, from_action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY__TO_RESOURCE:
				if (resolve) return getTo_resource();
				return basicGetTo_resource();
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY__FROM_ACTION:
				if (resolve) return getFrom_action();
				return basicGetFrom_action();
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
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY__TO_RESOURCE:
				setTo_resource((Resource)newValue);
				return;
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY__FROM_ACTION:
				setFrom_action((Action)newValue);
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
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY__TO_RESOURCE:
				setTo_resource((Resource)null);
				return;
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY__FROM_ACTION:
				setFrom_action((Action)null);
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
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY__TO_RESOURCE:
				return to_resource != null;
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY__FROM_ACTION:
				return from_action != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceDependencyImpl
