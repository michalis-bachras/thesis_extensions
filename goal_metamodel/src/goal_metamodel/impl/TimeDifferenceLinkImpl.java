/**
 */
package goal_metamodel.impl;

import goal_metamodel.Action;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.TimeDifferenceLink;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Difference Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.TimeDifferenceLinkImpl#getTimeDifference <em>Time Difference</em>}</li>
 *   <li>{@link goal_metamodel.impl.TimeDifferenceLinkImpl#getFrom_action <em>From action</em>}</li>
 *   <li>{@link goal_metamodel.impl.TimeDifferenceLinkImpl#getTo_action <em>To action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeDifferenceLinkImpl extends TemporalPrecedenceImpl implements TimeDifferenceLink,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 10L;

	/**
	 * The default value of the '{@link #getTimeDifference() <em>Time Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDifference()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_DIFFERENCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeDifference() <em>Time Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDifference()
	 * @generated
	 * @ordered
	 */
	protected long timeDifference = TIME_DIFFERENCE_EDEFAULT;

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
	protected TimeDifferenceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.TIME_DIFFERENCE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeDifference() {
		return timeDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDifference(long newTimeDifference) {
		long oldTimeDifference = timeDifference;
		timeDifference = newTimeDifference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TIME_DIFFERENCE, oldTimeDifference, timeDifference));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.TIME_DIFFERENCE_LINK__FROM_ACTION, oldFrom_action, from_action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.TIME_DIFFERENCE_LINK__FROM_ACTION, oldFrom_action, from_action));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TO_ACTION, oldTo_action, to_action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TO_ACTION, oldTo_action, to_action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TIME_DIFFERENCE:
				return getTimeDifference();
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__FROM_ACTION:
				if (resolve) return getFrom_action();
				return basicGetFrom_action();
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TO_ACTION:
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
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TIME_DIFFERENCE:
				setTimeDifference((Long)newValue);
				return;
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__FROM_ACTION:
				setFrom_action((Action)newValue);
				return;
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TO_ACTION:
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
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TIME_DIFFERENCE:
				setTimeDifference(TIME_DIFFERENCE_EDEFAULT);
				return;
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__FROM_ACTION:
				setFrom_action((Action)null);
				return;
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TO_ACTION:
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
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TIME_DIFFERENCE:
				return timeDifference != TIME_DIFFERENCE_EDEFAULT;
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__FROM_ACTION:
				return from_action != null;
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK__TO_ACTION:
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
		result.append(" (TimeDifference: ");
		result.append(timeDifference);
		result.append(')');
		return result.toString();
	}

} //TimeDifferenceLinkImpl
