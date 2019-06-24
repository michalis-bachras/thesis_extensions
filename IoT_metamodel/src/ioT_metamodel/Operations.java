/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Operations#getPoints_to_processing_logic <em>Points to processing logic</em>}</li>
 *   <li>{@link ioT_metamodel.Operations#getRuns_in <em>Runs in</em>}</li>
 *   <li>{@link ioT_metamodel.Operations#getSubscribes_to <em>Subscribes to</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getOperations()
 * @model
 * @generated
 */
public interface Operations extends EObject {
	/**
	 * Returns the value of the '<em><b>Points to processing logic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points to processing logic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points to processing logic</em>' reference.
	 * @see #setPoints_to_processing_logic(Evaluators)
	 * @see ioT_metamodel.IoT_metamodelPackage#getOperations_Points_to_processing_logic()
	 * @model
	 * @generated
	 */
	Evaluators getPoints_to_processing_logic();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Operations#getPoints_to_processing_logic <em>Points to processing logic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points to processing logic</em>' reference.
	 * @see #getPoints_to_processing_logic()
	 * @generated
	 */
	void setPoints_to_processing_logic(Evaluators value);

	/**
	 * Returns the value of the '<em><b>Runs in</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs in</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs in</em>' reference.
	 * @see #setRuns_in(Container)
	 * @see ioT_metamodel.IoT_metamodelPackage#getOperations_Runs_in()
	 * @model
	 * @generated
	 */
	Container getRuns_in();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Operations#getRuns_in <em>Runs in</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs in</em>' reference.
	 * @see #getRuns_in()
	 * @generated
	 */
	void setRuns_in(Container value);

	/**
	 * Returns the value of the '<em><b>Subscribes to</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.InformationResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribes to</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribes to</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getOperations_Subscribes_to()
	 * @model required="true"
	 * @generated
	 */
	EList<InformationResource> getSubscribes_to();

} // Operations
