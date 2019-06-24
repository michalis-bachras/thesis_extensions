/**
 */
package ioT_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.AtomicData#getHas_atomicdataattributes <em>Has atomicdataattributes</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getAtomicData()
 * @model
 * @generated
 */
public interface AtomicData extends EObject {
	/**
	 * Returns the value of the '<em><b>Has atomicdataattributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has atomicdataattributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has atomicdataattributes</em>' reference.
	 * @see #setHas_atomicdataattributes(AtomicDataAttributes)
	 * @see ioT_metamodel.IoT_metamodelPackage#getAtomicData_Has_atomicdataattributes()
	 * @model required="true"
	 * @generated
	 */
	AtomicDataAttributes getHas_atomicdataattributes();

	/**
	 * Sets the value of the '{@link ioT_metamodel.AtomicData#getHas_atomicdataattributes <em>Has atomicdataattributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has atomicdataattributes</em>' reference.
	 * @see #getHas_atomicdataattributes()
	 * @generated
	 */
	void setHas_atomicdataattributes(AtomicDataAttributes value);

} // AtomicData
