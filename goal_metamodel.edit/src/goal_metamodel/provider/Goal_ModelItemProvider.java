/**
 */
package goal_metamodel.provider;


import goal_metamodel.Goal_Model;
import goal_metamodel.Goal_metamodelFactory;
import goal_metamodel.Goal_metamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link goal_metamodel.Goal_Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Goal_ModelItemProvider 
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
	public Goal_ModelItemProvider(AdapterFactory adapterFactory) {
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

			addRefers_toPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Refers to feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefers_toPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Goal_Model_refers_to_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Goal_Model_refers_to_feature", "_UI_Goal_Model_type"),
				 Goal_metamodelPackage.Literals.GOAL_MODEL__REFERS_TO,
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
				 getString("_UI_Goal_Model_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Goal_Model_name_feature", "_UI_Goal_Model_type"),
				 Goal_metamodelPackage.Literals.GOAL_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Goal_Model_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Goal_Model_description_feature", "_UI_Goal_Model_type"),
				 Goal_metamodelPackage.Literals.GOAL_MODEL__DESCRIPTION,
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
			childrenFeatures.add(Goal_metamodelPackage.Literals.GOAL_MODEL__CONTEXTCONDITION);
			childrenFeatures.add(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK);
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
	 * This returns Goal_Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Goal_Model"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Goal_Model)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Goal_Model_type") :
			getString("_UI_Goal_Model_type") + " " + label;
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

		switch (notification.getFeatureID(Goal_Model.class)) {
			case Goal_metamodelPackage.GOAL_MODEL__NAME:
			case Goal_metamodelPackage.GOAL_MODEL__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Goal_metamodelPackage.GOAL_MODEL__CONTEXTCONDITION:
			case Goal_metamodelPackage.GOAL_MODEL__LINK:
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
				(Goal_metamodelPackage.Literals.GOAL_MODEL__CONTEXTCONDITION,
				 Goal_metamodelFactory.eINSTANCE.createContextCondition()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createDependencyLink()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createLogicalPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createTemporalLink()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createTemporalPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createTimeoutLink()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createTimeDifferenceLink()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createContribution()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createResourceDependency()));

		newChildDescriptors.add
			(createChildParameter
				(Goal_metamodelPackage.Literals.GOAL_MODEL__LINK,
				 Goal_metamodelFactory.eINSTANCE.createParallelLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Goal_metamodelEditPlugin.INSTANCE;
	}

}
