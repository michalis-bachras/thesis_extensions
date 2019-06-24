/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Information#getAtomicdata <em>Atomicdata</em>}</li>
 *   <li>{@link ioT_metamodel.Information#getDatastreams <em>Datastreams</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends EObject {
	/**
	 * Returns the value of the '<em><b>Atomicdata</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.AtomicData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atomicdata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomicdata</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getInformation_Atomicdata()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtomicData> getAtomicdata();

	/**
	 * Returns the value of the '<em><b>Datastreams</b></em>' containment reference list.
	 * The list contents are of type {@link ioT_metamodel.DataStreams}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datastreams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastreams</em>' containment reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getInformation_Datastreams()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStreams> getDatastreams();

} // Information
