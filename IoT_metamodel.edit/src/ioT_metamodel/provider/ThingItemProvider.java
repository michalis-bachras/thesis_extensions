/**
 */
package ioT_metamodel.provider;


import ioT_metamodel.IoT_metamodelFactory;
import ioT_metamodel.IoT_metamodelPackage;
import ioT_metamodel.Thing;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ioT_metamodel.Thing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFogPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addContainsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fog feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thing_fog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thing_fog_feature", "_UI_Thing_type"),
				 IoT_metamodelPackage.Literals.THING__FOG,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thing_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thing_name_feature", "_UI_Thing_type"),
				 IoT_metamodelPackage.Literals.THING__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thing_contains_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thing_contains_feature", "_UI_Thing_type"),
				 IoT_metamodelPackage.Literals.THING__CONTAINS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IoT_metamodelPackage.Literals.THING__VIRTUAL_ENTITY);
			childrenFeatures.add(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY);
			childrenFeatures.add(IoT_metamodelPackage.Literals.THING__PROPERTY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Thing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Thing"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Thing)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Thing_type") :
			getString("_UI_Thing_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Thing.class)) {
			case IoT_metamodelPackage.THING__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IoT_metamodelPackage.THING__VIRTUAL_ENTITY:
			case IoT_metamodelPackage.THING__PHYSICAL_ENTITY:
			case IoT_metamodelPackage.THING__PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__VIRTUAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createVirtualThing()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createPhysicalThing()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createExternalSensor()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createDeviceActuator()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createExternalActuator()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PHYSICAL_ENTITY,
				 IoT_metamodelFactory.eINSTANCE.createDeviceSensor()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.THING__PROPERTY,
				 IoT_metamodelFactory.eINSTANCE.createProperty()));
	}

}
