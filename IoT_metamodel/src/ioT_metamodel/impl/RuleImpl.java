/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.Action;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Rule;

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
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.RuleImpl#getConditionLiteral <em>Condition Literal</em>}</li>
 *   <li>{@link ioT_metamodel.impl.RuleImpl#getConditionValue <em>Condition Value</em>}</li>
 *   <li>{@link ioT_metamodel.impl.RuleImpl#getInvolves <em>Involves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #getConditionLiteral() <em>Condition Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionLiteral() <em>Condition Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionLiteral()
	 * @generated
	 * @ordered
	 */
	protected String conditionLiteral = CONDITION_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionValue() <em>Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionValue()
	 * @generated
	 * @ordered
	 */
	protected static final double CONDITION_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConditionValue() <em>Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionValue()
	 * @generated
	 * @ordered
	 */
	protected double conditionValue = CONDITION_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvolves() <em>Involves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolves()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> involves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionLiteral() {
		return conditionLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionLiteral(String newConditionLiteral) {
		String oldConditionLiteral = conditionLiteral;
		conditionLiteral = newConditionLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.RULE__CONDITION_LITERAL, oldConditionLiteral, conditionLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConditionValue() {
		return conditionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionValue(double newConditionValue) {
		double oldConditionValue = conditionValue;
		conditionValue = newConditionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.RULE__CONDITION_VALUE, oldConditionValue, conditionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getInvolves() {
		if (involves == null) {
			involves = new EObjectContainmentEList<Action>(Action.class, this, IoT_metamodelPackage.RULE__INVOLVES);
		}
		return involves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoT_metamodelPackage.RULE__INVOLVES:
				return ((InternalEList<?>)getInvolves()).basicRemove(otherEnd, msgs);
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
			case IoT_metamodelPackage.RULE__CONDITION_LITERAL:
				return getConditionLiteral();
			case IoT_metamodelPackage.RULE__CONDITION_VALUE:
				return getConditionValue();
			case IoT_metamodelPackage.RULE__INVOLVES:
				return getInvolves();
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
			case IoT_metamodelPackage.RULE__CONDITION_LITERAL:
				setConditionLiteral((String)newValue);
				return;
			case IoT_metamodelPackage.RULE__CONDITION_VALUE:
				setConditionValue((Double)newValue);
				return;
			case IoT_metamodelPackage.RULE__INVOLVES:
				getInvolves().clear();
				getInvolves().addAll((Collection<? extends Action>)newValue);
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
			case IoT_metamodelPackage.RULE__CONDITION_LITERAL:
				setConditionLiteral(CONDITION_LITERAL_EDEFAULT);
				return;
			case IoT_metamodelPackage.RULE__CONDITION_VALUE:
				setConditionValue(CONDITION_VALUE_EDEFAULT);
				return;
			case IoT_metamodelPackage.RULE__INVOLVES:
				getInvolves().clear();
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
			case IoT_metamodelPackage.RULE__CONDITION_LITERAL:
				return CONDITION_LITERAL_EDEFAULT == null ? conditionLiteral != null : !CONDITION_LITERAL_EDEFAULT.equals(conditionLiteral);
			case IoT_metamodelPackage.RULE__CONDITION_VALUE:
				return conditionValue != CONDITION_VALUE_EDEFAULT;
			case IoT_metamodelPackage.RULE__INVOLVES:
				return involves != null && !involves.isEmpty();
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
		result.append(" (conditionLiteral: ");
		result.append(conditionLiteral);
		result.append(", conditionValue: ");
		result.append(conditionValue);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
