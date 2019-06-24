/**
 */
package goal_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.ContextualComponent#getHas_contextcondition <em>Has contextcondition</em>}</li>
 *   <li>{@link goal_metamodel.ContextualComponent#isContext_enabled <em>Context enabled</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getContextualComponent()
 * @model abstract="true"
 * @generated
 */
public interface ContextualComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Has contextcondition</b></em>' reference list.
	 * The list contents are of type {@link goal_metamodel.ContextCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has contextcondition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has contextcondition</em>' reference list.
	 * @see goal_metamodel.Goal_metamodelPackage#getContextualComponent_Has_contextcondition()
	 * @model
	 * @generated
	 */
	EList<ContextCondition> getHas_contextcondition();

	/**
	 * Returns the value of the '<em><b>Context enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context enabled</em>' attribute.
	 * @see #setContext_enabled(boolean)
	 * @see goal_metamodel.Goal_metamodelPackage#getContextualComponent_Context_enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isContext_enabled();

	/**
	 * Sets the value of the '{@link goal_metamodel.ContextualComponent#isContext_enabled <em>Context enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context enabled</em>' attribute.
	 * @see #isContext_enabled()
	 * @generated
	 */
	void setContext_enabled(boolean value);

} // ContextualComponent
