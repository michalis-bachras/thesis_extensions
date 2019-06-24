/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.InformationResource;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.PhysicalThing;
import ioT_metamodel.VirtualThing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioT_metamodel.impl.VirtualThingImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link ioT_metamodel.impl.VirtualThingImpl#getURI <em>URI</em>}</li>
 *   <li>{@link ioT_metamodel.impl.VirtualThingImpl#getIs_associated_with <em>Is associated with</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualThingImpl extends Active_Digital_ArtifactImpl implements VirtualThing {
	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected PhysicalThing represents;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIs_associated_with() <em>Is associated with</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_associated_with()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationResource> is_associated_with;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoT_metamodelPackage.Literals.VIRTUAL_THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalThing getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (PhysicalThing)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoT_metamodelPackage.VIRTUAL_THING__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalThing basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(PhysicalThing newRepresents) {
		PhysicalThing oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.VIRTUAL_THING__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoT_metamodelPackage.VIRTUAL_THING__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationResource> getIs_associated_with() {
		if (is_associated_with == null) {
			is_associated_with = new EObjectResolvingEList<InformationResource>(InformationResource.class, this, IoT_metamodelPackage.VIRTUAL_THING__IS_ASSOCIATED_WITH);
		}
		return is_associated_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoT_metamodelPackage.VIRTUAL_THING__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case IoT_metamodelPackage.VIRTUAL_THING__URI:
				return getURI();
			case IoT_metamodelPackage.VIRTUAL_THING__IS_ASSOCIATED_WITH:
				return getIs_associated_with();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IoT_metamodelPackage.VIRTUAL_THING__REPRESENTS:
				setRepresents((PhysicalThing)newValue);
				return;
			case IoT_metamodelPackage.VIRTUAL_THING__URI:
				setURI((String)newValue);
				return;
			case IoT_metamodelPackage.VIRTUAL_THING__IS_ASSOCIATED_WITH:
				getIs_associated_with().clear();
				getIs_associated_with().addAll((Collection<? extends InformationResource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IoT_metamodelPackage.VIRTUAL_THING__REPRESENTS:
				setRepresents((PhysicalThing)null);
				return;
			case IoT_metamodelPackage.VIRTUAL_THING__URI:
				setURI(URI_EDEFAULT);
				return;
			case IoT_metamodelPackage.VIRTUAL_THING__IS_ASSOCIATED_WITH:
				getIs_associated_with().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IoT_metamodelPackage.VIRTUAL_THING__REPRESENTS:
				return represents != null;
			case IoT_metamodelPackage.VIRTUAL_THING__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case IoT_metamodelPackage.VIRTUAL_THING__IS_ASSOCIATED_WITH:
				return is_associated_with != null && !is_associated_with.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (URI: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //VirtualThingImpl
