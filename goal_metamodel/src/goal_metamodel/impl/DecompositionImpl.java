/**
 */
package goal_metamodel.impl;

import goal_metamodel.Decomposition;
import goal_metamodel.DecompositionType;
import goal_metamodel.GoalNode;
import goal_metamodel.Goal_metamodelPackage;

import java.io.Serializable;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.DecompositionImpl#getType <em>Type</em>}</li>
 *   <li>{@link goal_metamodel.impl.DecompositionImpl#getDecomposed_to <em>Decomposed to</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecompositionImpl extends ContextualComponentImpl implements Decomposition,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;

	protected String AND_id;
	
	public void setANDid(String AND_id) {
		this.AND_id = AND_id;
	}
	
	public String getANDid() {
		return AND_id;
	}
	
	
	
	protected String OR_id;
	
	public void setORid(String OR_id) {
		this.OR_id = OR_id;
	}
	
	public String getORid() {
		return OR_id;
	}
	
	protected String OR_dec_id = "0" ;
	
	public void set_OR_dec_id(String OR_dec_id) {
		this.OR_dec_id = OR_dec_id;
	}
	
	public String get_OR_dec_id() {
		return OR_dec_id;
	}
	
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DecompositionType TYPE_EDEFAULT = DecompositionType.AND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DecompositionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecomposed_to() <em>Decomposed to</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposed_to()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalNode> decomposed_to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.DECOMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DecompositionType newType) {
		DecompositionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.DECOMPOSITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalNode> getDecomposed_to() {
		if (decomposed_to == null) {
			decomposed_to = new EObjectContainmentEList<GoalNode>(GoalNode.class, this, Goal_metamodelPackage.DECOMPOSITION__DECOMPOSED_TO);
		}
		return decomposed_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Goal_metamodelPackage.DECOMPOSITION__DECOMPOSED_TO:
				return ((InternalEList<?>)getDecomposed_to()).basicRemove(otherEnd, msgs);
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
			case Goal_metamodelPackage.DECOMPOSITION__TYPE:
				return getType();
			case Goal_metamodelPackage.DECOMPOSITION__DECOMPOSED_TO:
				return getDecomposed_to();
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
			case Goal_metamodelPackage.DECOMPOSITION__TYPE:
				setType((DecompositionType)newValue);
				return;
			case Goal_metamodelPackage.DECOMPOSITION__DECOMPOSED_TO:
				getDecomposed_to().clear();
				getDecomposed_to().addAll((Collection<? extends GoalNode>)newValue);
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
			case Goal_metamodelPackage.DECOMPOSITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Goal_metamodelPackage.DECOMPOSITION__DECOMPOSED_TO:
				getDecomposed_to().clear();
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
			case Goal_metamodelPackage.DECOMPOSITION__TYPE:
				return type != TYPE_EDEFAULT;
			case Goal_metamodelPackage.DECOMPOSITION__DECOMPOSED_TO:
				return decomposed_to != null && !decomposed_to.isEmpty();
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

} //DecompositionImpl
