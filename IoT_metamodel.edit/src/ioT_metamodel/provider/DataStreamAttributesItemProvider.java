/**
 */
package ioT_metamodel.provider;


import ioT_metamodel.DataStreamAttributes;
import ioT_metamodel.IoT_metamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ioT_metamodel.DataStreamAttributes} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataStreamAttributesItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStreamAttributesItemProvider(AdapterFactory adapterFactory) {
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

			addMeanBitRatePropertyDescriptor(object);
			addTimestampPropertyDescriptor(object);
			addMaxBitratePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDataFormatPropertyDescriptor(object);
			addDataEncodingPropertyDescriptor(object);
			addDeviceIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mean Bit Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeanBitRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataStreamAttributes_MeanBitRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataStreamAttributes_MeanBitRate_feature", "_UI_DataStreamAttributes_type"),
				 IoT_metamodelPackage.Literals.DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataStreamAttributes_Timestamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataStreamAttributes_Timestamp_feature", "_UI_DataStreamAttributes_type"),
				 IoT_metamodelPackage.Literals.DATA_STREAM_ATTRIBUTES__TIMESTAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Bitrate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxBitratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataStreamAttributes_MaxBitrate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataStreamAttributes_MaxBitrate_feature", "_UI_DataStreamAttributes_type"),
				 IoT_metamodelPackage.Literals.DATA_STREAM_ATTRIBUTES__MAX_BITRATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataStreamAttributes_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataStreamAttributes_Description_feature", "_UI_DataStreamAttributes_type"),
				 IoT_metamodelPackage.Literals.DATA_STREAM_ATTRIBUTES__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataStreamAttributes_DataFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataStreamAttributes_DataFormat_feature", "_UI_DataStreamAttributes_type"),
				 IoT_metamodelPackage.Literals.DATA_STREAM_ATTRIBUTES__DATA_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataStreamAttributes_DataEncoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataStreamAttributes_DataEncoding_feature", "_UI_DataStreamAttributes_type"),
				 IoT_metamodelPackage.Literals.DATA_STREAM_ATTRIBUTES__DATA_ENCODING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Device ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeviceIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataStreamAttributes_DeviceID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataStreamAttributes_DeviceID_feature", "_UI_DataStreamAttributes_type"),
				 IoT_metamodelPackage.Literals.DATA_STREAM_ATTRIBUTES__DEVICE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DataStreamAttributes.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataStreamAttributes"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DataStreamAttributes dataStreamAttributes = (DataStreamAttributes)object;
		return getString("_UI_DataStreamAttributes_type") + " " + dataStreamAttributes.getMeanBitRate();
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

		switch (notification.getFeatureID(DataStreamAttributes.class)) {
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE:
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__TIMESTAMP:
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__MAX_BITRATE:
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DESCRIPTION:
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_FORMAT:
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DATA_ENCODING:
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES__DEVICE_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IoT_metamodelEditPlugin.INSTANCE;
	}

}
