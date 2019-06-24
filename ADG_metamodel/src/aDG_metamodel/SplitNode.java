/**
 */
package aDG_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDG_metamodel.SplitNode#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see aDG_metamodel.ADG_metamodelPackage#getSplitNode()
 * @model
 * @generated
 */
public interface SplitNode extends Node {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see aDG_metamodel.ADG_metamodelPackage#getSplitNode_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link aDG_metamodel.SplitNode#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // SplitNode
