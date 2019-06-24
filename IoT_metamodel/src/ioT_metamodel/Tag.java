/**
 */
package ioT_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.Tag#getName <em>Name</em>}</li>
 *   <li>{@link ioT_metamodel.Tag#getIdentifies <em>Identifies</em>}</li>
 * </ul>
 *
 * @see ioT_metamodel.IoT_metamodelPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Device {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ioT_metamodel.IoT_metamodelPackage#getTag_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ioT_metamodel.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Identifies</b></em>' reference list.
	 * The list contents are of type {@link ioT_metamodel.PhysicalThing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifies</em>' reference list.
	 * @see ioT_metamodel.IoT_metamodelPackage#getTag_Identifies()
	 * @model
	 * @generated
	 */
	EList<PhysicalThing> getIdentifies();

} // Tag
