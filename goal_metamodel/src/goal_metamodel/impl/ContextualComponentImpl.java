/**
 */
package goal_metamodel.impl;

import goal_metamodel.ContextCondition;
import goal_metamodel.ContextualComponent;
import goal_metamodel.Goal_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contextual Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.ContextualComponentImpl#getHas_contextcondition <em>Has contextcondition</em>}</li>
 *   <li>{@link goal_metamodel.impl.ContextualComponentImpl#isContext_enabled <em>Context enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContextualComponentImpl extends MinimalEObjectImpl.Container implements ContextualComponent {
	/**
	 * The cached value of the '{@link #getHas_contextcondition() <em>Has contextcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_contextcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextCondition> has_contextcondition;

	/**
	 * The default value of the '{@link #isContext_enabled() <em>Context enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContext_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTEXT_ENABLED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isContext_enabled() <em>Context enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContext_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean context_enabled = CONTEXT_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextualComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.CONTEXTUAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextCondition> getHas_contextcondition() {
		if (has_contextcondition == null) {
			has_contextcondition = new EObjectResolvingEList<ContextCondition>(ContextCondition.class, this, Goal_metamodelPackage.CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION);
		}
		return has_contextcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContext_enabled() {
		return context_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext_enabled(boolean newContext_enabled) {
		boolean oldContext_enabled = context_enabled;
		context_enabled = newContext_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.CONTEXTUAL_COMPONENT__CONTEXT_ENABLED, oldContext_enabled, context_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION:
				return getHas_contextcondition();
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT__CONTEXT_ENABLED:
				return isContext_enabled();
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
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION:
				getHas_contextcondition().clear();
				getHas_contextcondition().addAll((Collection<? extends ContextCondition>)newValue);
				return;
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT__CONTEXT_ENABLED:
				setContext_enabled((Boolean)newValue);
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
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION:
				getHas_contextcondition().clear();
				return;
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT__CONTEXT_ENABLED:
				setContext_enabled(CONTEXT_ENABLED_EDEFAULT);
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
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION:
				return has_contextcondition != null && !has_contextcondition.isEmpty();
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT__CONTEXT_ENABLED:
				return context_enabled != CONTEXT_ENABLED_EDEFAULT;
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
		result.append(" (context_enabled: ");
		result.append(context_enabled);
		result.append(')');
		return result.toString();
	}

} //ContextualComponentImpl
