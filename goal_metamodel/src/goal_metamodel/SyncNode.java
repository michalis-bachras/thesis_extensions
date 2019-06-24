/**
 */
package goal_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goal_metamodel.SyncNode#getNumberOfNodes <em>Number Of Nodes</em>}</li>
 *   <li>{@link goal_metamodel.SyncNode#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see goal_metamodel.Goal_metamodelPackage#getSyncNode()
 * @model
 * @generated
 */
public interface SyncNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Number Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Nodes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Nodes</em>' attribute.
	 * @see #setNumberOfNodes(int)
	 * @see goal_metamodel.Goal_metamodelPackage#getSyncNode_NumberOfNodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNumberOfNodes();

	/**
	 * Sets the value of the '{@link goal_metamodel.SyncNode#getNumberOfNodes <em>Number Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Nodes</em>' attribute.
	 * @see #getNumberOfNodes()
	 * @generated
	 */
	void setNumberOfNodes(int value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see goal_metamodel.Goal_metamodelPackage#getSyncNode_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link goal_metamodel.SyncNode#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

} // SyncNode
