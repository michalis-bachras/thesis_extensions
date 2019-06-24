/**
 */
package ioT_metamodel.provider;


import ioT_metamodel.Device;
import ioT_metamodel.IoT_metamodelFactory;
import ioT_metamodel.IoT_metamodelPackage;

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
 * This is the item provider adapter for a {@link ioT_metamodel.Device} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceItemProvider extends PhysicalThingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceItemProvider(AdapterFactory adapterFactory) {
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

			addIs_attached_toPropertyDescriptor(object);
			addTechnologyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is attached to feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIs_attached_toPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Device_is_attached_to_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Device_is_attached_to_feature", "_UI_Device_type"),
				 IoT_metamodelPackage.Literals.DEVICE__IS_ATTACHED_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Device_Technology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Device_Technology_feature", "_UI_Device_type"),
				 IoT_metamodelPackage.Literals.DEVICE__TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(IoT_metamodelPackage.Literals.DEVICE__CONTAINS);
			childrenFeatures.add(IoT_metamodelPackage.Literals.DEVICE__HAS_RULES);
			childrenFeatures.add(IoT_metamodelPackage.Literals.DEVICE__DEVICESTATE);
			childrenFeatures.add(IoT_metamodelPackage.Literals.DEVICE__HAS_COMMUNICATORS);
			childrenFeatures.add(IoT_metamodelPackage.Literals.DEVICE__HOSTS);
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
	 * This returns Device.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Device"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Device)object).getTechnology();
		return label == null || label.length() == 0 ?
			getString("_UI_Device_type") :
			getString("_UI_Device_type") + " " + label;
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

		switch (notification.getFeatureID(Device.class)) {
			case IoT_metamodelPackage.DEVICE__TECHNOLOGY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IoT_metamodelPackage.DEVICE__CONTAINS:
			case IoT_metamodelPackage.DEVICE__HAS_RULES:
			case IoT_metamodelPackage.DEVICE__DEVICESTATE:
			case IoT_metamodelPackage.DEVICE__HAS_COMMUNICATORS:
			case IoT_metamodelPackage.DEVICE__HOSTS:
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
				(IoT_metamodelPackage.Literals.DEVICE__CONTAINS,
				 IoT_metamodelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__CONTAINS,
				 IoT_metamodelFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__CONTAINS,
				 IoT_metamodelFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__CONTAINS,
				 IoT_metamodelFactory.eINSTANCE.createExternalSensor()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__CONTAINS,
				 IoT_metamodelFactory.eINSTANCE.createDeviceActuator()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__CONTAINS,
				 IoT_metamodelFactory.eINSTANCE.createExternalActuator()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__CONTAINS,
				 IoT_metamodelFactory.eINSTANCE.createDeviceSensor()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__HAS_RULES,
				 IoT_metamodelFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__DEVICESTATE,
				 IoT_metamodelFactory.eINSTANCE.createDeviceState()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__DEVICESTATE,
				 IoT_metamodelFactory.eINSTANCE.createCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__HAS_COMMUNICATORS,
				 IoT_metamodelFactory.eINSTANCE.createCommunicator()));

		newChildDescriptors.add
			(createChildParameter
				(IoT_metamodelPackage.Literals.DEVICE__HOSTS,
				 IoT_metamodelFactory.eINSTANCE.createOn_Device_Resource()));
	}

}
