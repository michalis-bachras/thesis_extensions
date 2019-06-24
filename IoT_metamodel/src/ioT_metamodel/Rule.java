/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Rule#getConditionLiteral <em>Condition Literal</em>}</li>
 *   <li>{@link ioT_metamodel.Rule#getConditionValue <em>Condition Value</em>}</li>
 *   <li>{@link ioT_metamodel.Rule#getInvolves <em>Involves</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Literal</em>' attribute.
	 * @see #setConditionLiteral(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getRule_ConditionLiteral()
	 * @model
	 * @generated
	 */
	String getConditionLiteral();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Rule#getConditionLiteral <em>Condition Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Literal</em>' attribute.
	 * @see #getConditionLiteral()
	 * @generated
	 */
	void setConditionLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Condition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Value</em>' attribute.
	 * @see #setConditionValue(double)
	 * @see ioT_metamodel.IoT_metamodelPackage#getRule_ConditionValue()
	 * @model
	 * @generated
	 */
	double getConditionValue();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Rule#getConditionValue <em>Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Value</em>' attribute.
	 * @see #getConditionValue()
	 * @generated
	 */
	void setConditionValue(double value);

	/**
	 * Returns the value of the '<em><b>Involves</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getRule_Involves()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getInvolves();

} // Rule
