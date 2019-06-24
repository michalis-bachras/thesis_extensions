/**
 */
package goal_metamodel.impl;
import goal_metamodel.Decomposition;
import goal_metamodel.Goal_metamodelPackage;
import goal_metamodel.Task;

import java.io.Serializable;
import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.impl.TaskImpl#getHasdecomposition <em>Hasdecomposition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends GoalNodeImpl implements Task,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;



	/**
	 * The cached value of the '{@link #getHasdecomposition() <em>Hasdecomposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasdecomposition()
	 * @generated
	 * @ordered
	 */
	protected Decomposition hasdecomposition;
	
	
	
	protected ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();
	
	public void setOuterList(ArrayList<String> list) {
		outer.add(list);
	}
	
	public void equateOuterList(ArrayList<ArrayList<String>> list) {
		outer = list;
	}
	
	public ArrayList<ArrayList<String>> getOuterList(){
		return outer;
	}
	//protected ArrayList<Action> inner = new ArrayList<Action>();  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition getHasdecomposition() {
		return hasdecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasdecomposition(Decomposition newHasdecomposition, NotificationChain msgs) {
		Decomposition oldHasdecomposition = hasdecomposition;
		hasdecomposition = newHasdecomposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.TASK__HASDECOMPOSITION, oldHasdecomposition, newHasdecomposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasdecomposition(Decomposition newHasdecomposition) {
		if (newHasdecomposition != hasdecomposition) {
			NotificationChain msgs = null;
			if (hasdecomposition != null)
				msgs = ((InternalEObject)hasdecomposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Goal_metamodelPackage.TASK__HASDECOMPOSITION, null, msgs);
			if (newHasdecomposition != null)
				msgs = ((InternalEObject)newHasdecomposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Goal_metamodelPackage.TASK__HASDECOMPOSITION, null, msgs);
			msgs = basicSetHasdecomposition(newHasdecomposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goal_metamodelPackage.TASK__HASDECOMPOSITION, newHasdecomposition, newHasdecomposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Goal_metamodelPackage.TASK__HASDECOMPOSITION:
				return basicSetHasdecomposition(null, msgs);
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
			case Goal_metamodelPackage.TASK__HASDECOMPOSITION:
				return getHasdecomposition();
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
			case Goal_metamodelPackage.TASK__HASDECOMPOSITION:
				setHasdecomposition((Decomposition)newValue);
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
			case Goal_metamodelPackage.TASK__HASDECOMPOSITION:
				setHasdecomposition((Decomposition)null);
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
			case Goal_metamodelPackage.TASK__HASDECOMPOSITION:
				return hasdecomposition != null;
		}
		return super.eIsSet(featureID);
	}
	

} //TaskImpl
