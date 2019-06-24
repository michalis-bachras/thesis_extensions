/**
 */
package goal_metamodel.impl;

import goal_metamodel.Contribution;
import goal_metamodel.ContributionType;
import goal_metamodel.GoalNode;
import goal_metamodel.Goal_metamodelPackage;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.ContributionImpl#getType <em>Type</em>}</li>
 *   <li>{@link goal_metamodel.impl.ContributionImpl#getFrom_goalnode <em>From goalnode</em>}</li>
 *   <li>{@link goal_metamodel.impl.ContributionImpl#getTo_goalnode <em>To goalnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributionImpl extends LinkImpl implements Contribution,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6L;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ContributionType TYPE_EDEFAULT = ContributionType.PPS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ContributionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom_goalnode() <em>From goalnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_goalnode()
	 * @generated
	 * @ordered
	 */
	protected GoalNode from_goalnode;

	/**
	 * The cached value of the '{@link #getTo_goalnode() <em>To goalnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_goalnode()
	 * @generated
	 * @ordered
	 */
	protected GoalNode to_goalnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ContributionType newType) {
		ContributionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.CONTRIBUTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalNode getFrom_goalnode() {
		if (from_goalnode != null && from_goalnode.eIsProxy()) {
			InternalEObject oldFrom_goalnode = (InternalEObject)from_goalnode;
			from_goalnode = (GoalNode)eResolveProxy(oldFrom_goalnode);
			if (from_goalnode != oldFrom_goalnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.CONTRIBUTION__FROM_GOALNODE, oldFrom_goalnode, from_goalnode));
			}
		}
		return from_goalnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalNode basicGetFrom_goalnode() {
		return from_goalnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_goalnode(GoalNode newFrom_goalnode) {
		GoalNode oldFrom_goalnode = from_goalnode;
		from_goalnode = newFrom_goalnode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.CONTRIBUTION__FROM_GOALNODE, oldFrom_goalnode, from_goalnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalNode getTo_goalnode() {
		if (to_goalnode != null && to_goalnode.eIsProxy()) {
			InternalEObject oldTo_goalnode = (InternalEObject)to_goalnode;
			to_goalnode = (GoalNode)eResolveProxy(oldTo_goalnode);
			if (to_goalnode != oldTo_goalnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goal_metamodelPackage.CONTRIBUTION__TO_GOALNODE, oldTo_goalnode, to_goalnode));
			}
		}
		return to_goalnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalNode basicGetTo_goalnode() {
		return to_goalnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_goalnode(GoalNode newTo_goalnode) {
		GoalNode oldTo_goalnode = to_goalnode;
		to_goalnode = newTo_goalnode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.CONTRIBUTION__TO_GOALNODE, oldTo_goalnode, to_goalnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Goal_metamodelPackage.CONTRIBUTION__TYPE:
				return getType();
			case Goal_metamodelPackage.CONTRIBUTION__FROM_GOALNODE:
				if (resolve) return getFrom_goalnode();
				return basicGetFrom_goalnode();
			case Goal_metamodelPackage.CONTRIBUTION__TO_GOALNODE:
				if (resolve) return getTo_goalnode();
				return basicGetTo_goalnode();
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
			case Goal_metamodelPackage.CONTRIBUTION__TYPE:
				setType((ContributionType)newValue);
				return;
			case Goal_metamodelPackage.CONTRIBUTION__FROM_GOALNODE:
				setFrom_goalnode((GoalNode)newValue);
				return;
			case Goal_metamodelPackage.CONTRIBUTION__TO_GOALNODE:
				setTo_goalnode((GoalNode)newValue);
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
			case Goal_metamodelPackage.CONTRIBUTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Goal_metamodelPackage.CONTRIBUTION__FROM_GOALNODE:
				setFrom_goalnode((GoalNode)null);
				return;
			case Goal_metamodelPackage.CONTRIBUTION__TO_GOALNODE:
				setTo_goalnode((GoalNode)null);
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
			case Goal_metamodelPackage.CONTRIBUTION__TYPE:
				return type != TYPE_EDEFAULT;
			case Goal_metamodelPackage.CONTRIBUTION__FROM_GOALNODE:
				return from_goalnode != null;
			case Goal_metamodelPackage.CONTRIBUTION__TO_GOALNODE:
				return to_goalnode != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ContributionImpl
