/**
 */
package goal_metamodel.impl;

import goal_metamodel.Action;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.TimeoutLink;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timeout Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.TimeoutLinkImpl#getTimeoutPeriod <em>Timeout Period</em>}</li>
 *   <li>{@link goal_metamodel.impl.TimeoutLinkImpl#getFrom_action <em>From action</em>}</li>
 *   <li>{@link goal_metamodel.impl.TimeoutLinkImpl#getTo_action <em>To action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeoutLinkImpl extends TemporalPrecedenceImpl implements TimeoutLink,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;

	/**
	 * The default value of the '{@link #getTimeoutPeriod() <em>Timeout Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMEOUT_PERIOD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeoutPeriod() <em>Timeout Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutPeriod()
	 * @generated
	 * @ordered
	 */
	protected long timeoutPeriod = TIMEOUT_PERIOD_EDEFAULT;

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
	 * The cached value of the '{@link #getTo_action() <em>To action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_action()
	 * @generated
	 * @ordered
	 */
	protected Action to_action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeoutLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.TIMEOUT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeoutPeriod() {
		return timeoutPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutPeriod(long newTimeoutPeriod) {
		long oldTimeoutPeriod = timeoutPeriod;
		timeoutPeriod = newTimeoutPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.TIMEOUT_LINK__TIMEOUT_PERIOD, oldTimeoutPeriod, timeoutPeriod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.TIMEOUT_LINK__FROM_ACTION, oldFrom_action, from_action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.TIMEOUT_LINK__FROM_ACTION, oldFrom_action, from_action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getTo_action() {
		if (to_action != null && to_action.eIsProxy()) {
			InternalEObject oldTo_action = (InternalEObject)to_action;
			to_action = (Action)eResolveProxy(oldTo_action);
			if (to_action != oldTo_action) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.TIMEOUT_LINK__TO_ACTION, oldTo_action, to_action));
			}
		}
		return to_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetTo_action() {
		return to_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_action(Action newTo_action) {
		Action oldTo_action = to_action;
		to_action = newTo_action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.TIMEOUT_LINK__TO_ACTION, oldTo_action, to_action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Goal_metamodelPackage.TIMEOUT_LINK__TIMEOUT_PERIOD:
				return getTimeoutPeriod();
			case Goal_metamodelPackage.TIMEOUT_LINK__FROM_ACTION:
				if (resolve) return getFrom_action();
				return basicGetFrom_action();
			case Goal_metamodelPackage.TIMEOUT_LINK__TO_ACTION:
				if (resolve) return getTo_action();
				return basicGetTo_action();
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
			case Goal_metamodelPackage.TIMEOUT_LINK__TIMEOUT_PERIOD:
				setTimeoutPeriod((Long)newValue);
				return;
			case Goal_metamodelPackage.TIMEOUT_LINK__FROM_ACTION:
				setFrom_action((Action)newValue);
				return;
			case Goal_metamodelPackage.TIMEOUT_LINK__TO_ACTION:
				setTo_action((Action)newValue);
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
			case Goal_metamodelPackage.TIMEOUT_LINK__TIMEOUT_PERIOD:
				setTimeoutPeriod(TIMEOUT_PERIOD_EDEFAULT);
				return;
			case Goal_metamodelPackage.TIMEOUT_LINK__FROM_ACTION:
				setFrom_action((Action)null);
				return;
			case Goal_metamodelPackage.TIMEOUT_LINK__TO_ACTION:
				setTo_action((Action)null);
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
			case Goal_metamodelPackage.TIMEOUT_LINK__TIMEOUT_PERIOD:
				return timeoutPeriod != TIMEOUT_PERIOD_EDEFAULT;
			case Goal_metamodelPackage.TIMEOUT_LINK__FROM_ACTION:
				return from_action != null;
			case Goal_metamodelPackage.TIMEOUT_LINK__TO_ACTION:
				return to_action != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (TimeoutPeriod: ");
		result.append(timeoutPeriod);
		result.append(')');
		return result.toString();
	}

} //TimeoutLinkImpl
