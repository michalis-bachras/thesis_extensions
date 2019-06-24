/**
 */
package goal_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.Model#getContextcondition <em>Contextcondition</em>}</li>
 *   <li>{@link goal_metamodel.Model#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Contextcondition</b></em>' containment reference list.
	 * The list contents are of type {@link goal_metamodel.ContextCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextcondition</em>' containment reference list.
	 * @see goal_metamodel.Goal_metamodelPackage#getModel_Contextcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextCondition> getContextcondition();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link goal_metamodel.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see goal_metamodel.Goal_metamodelPackage#getModel_Link()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Link> getLink();

} // Model
