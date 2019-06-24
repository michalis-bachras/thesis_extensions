/**
 */
package goal_metamodel.impl;

import goal_metamodel.ContextCondition;
import goal_metamodel.Goal_metamodelPackage;

import java.io.Serializable;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContextConditionImpl extends MinimalEObjectImpl.Container implements ContextCondition,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 19L;

	protected String affected_node ;
	
	protected String description;
	
	public void set_affected_node(String name) {
		affected_node = name;
	}
	
	public String get_affected_node() {
		return affected_node;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goal_metamodelPackage.Literals.CONTEXT_CONDITION;
	}

} //ContextConditionImpl
