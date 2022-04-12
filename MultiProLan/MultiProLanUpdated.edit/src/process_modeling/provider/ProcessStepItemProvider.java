/**
 */
package process_modeling.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import process_modeling.ProcessStep;
import process_modeling.Process_modelingFactory;
import process_modeling.Process_modelingPackage;

/**
 * This is the item provider adapter for a {@link process_modeling.ProcessStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessStepItemProvider extends ProcessElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStepItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addNotationPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addAcceptanceCriterionPropertyDescriptor(object);
			addCompletionCriterionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessStep_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessStep_type_feature", "_UI_ProcessStep_type"),
				 Process_modelingPackage.Literals.PROCESS_STEP__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessStep_notation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessStep_notation_feature", "_UI_ProcessStep_type"),
				 Process_modelingPackage.Literals.PROCESS_STEP__NOTATION,
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
				 getString("_UI_ProcessStep_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessStep_description_feature", "_UI_ProcessStep_type"),
				 Process_modelingPackage.Literals.PROCESS_STEP__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Acceptance Criterion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcceptanceCriterionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessStep_acceptanceCriterion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessStep_acceptanceCriterion_feature", "_UI_ProcessStep_type"),
				 Process_modelingPackage.Literals.PROCESS_STEP__ACCEPTANCE_CRITERION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completion Criterion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletionCriterionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessStep_completionCriterion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessStep_completionCriterion_feature", "_UI_ProcessStep_type"),
				 Process_modelingPackage.Literals.PROCESS_STEP__COMPLETION_CRITERION,
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
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS_STEP__CAPABILITY);
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS_STEP__IN_PRODUCTS);
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS_STEP__OUT_PRODUCTS);
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS_STEP__RESOURCE);
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS_STEP__ERRORS);
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS_STEP__CONTRACTUAL_OBLIGATION);
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
	 * This returns ProcessStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcessStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessStep_type") :
			getString("_UI_ProcessStep_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessStep.class)) {
			case Process_modelingPackage.PROCESS_STEP__TYPE:
			case Process_modelingPackage.PROCESS_STEP__NOTATION:
			case Process_modelingPackage.PROCESS_STEP__DESCRIPTION:
			case Process_modelingPackage.PROCESS_STEP__ACCEPTANCE_CRITERION:
			case Process_modelingPackage.PROCESS_STEP__COMPLETION_CRITERION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Process_modelingPackage.PROCESS_STEP__CAPABILITY:
			case Process_modelingPackage.PROCESS_STEP__IN_PRODUCTS:
			case Process_modelingPackage.PROCESS_STEP__OUT_PRODUCTS:
			case Process_modelingPackage.PROCESS_STEP__RESOURCE:
			case Process_modelingPackage.PROCESS_STEP__ERRORS:
			case Process_modelingPackage.PROCESS_STEP__CONTRACTUAL_OBLIGATION:
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
				(Process_modelingPackage.Literals.PROCESS_STEP__CAPABILITY,
				 Process_modelingFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS_STEP__IN_PRODUCTS,
				 Process_modelingFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS_STEP__OUT_PRODUCTS,
				 Process_modelingFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS_STEP__RESOURCE,
				 Process_modelingFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS_STEP__ERRORS,
				 Process_modelingFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS_STEP__CONTRACTUAL_OBLIGATION,
				 Process_modelingFactory.eINSTANCE.createContractualObligation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Process_modelingPackage.Literals.PROCESS_STEP__IN_PRODUCTS ||
			childFeature == Process_modelingPackage.Literals.PROCESS_STEP__OUT_PRODUCTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
