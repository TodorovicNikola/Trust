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

import process_modeling.Process_modelingFactory;
import process_modeling.Process_modelingPackage;

/**
 * This is the item provider adapter for a {@link process_modeling.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider extends IDNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
			addStartStepPropertyDescriptor(object);
			addUnidentifiedErrorHandlerPropertyDescriptor(object);
			addProposedProcessPropertyDescriptor(object);
			addCompanyPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_version_feature", "_UI_Process_type"),
				 Process_modelingPackage.Literals.PROCESS__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_startStep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_startStep_feature", "_UI_Process_type"),
				 Process_modelingPackage.Literals.PROCESS__START_STEP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unidentified Error Handler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnidentifiedErrorHandlerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_unidentifiedErrorHandler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_unidentifiedErrorHandler_feature", "_UI_Process_type"),
				 Process_modelingPackage.Literals.PROCESS__UNIDENTIFIED_ERROR_HANDLER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Proposed Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProposedProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_proposedProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_proposedProcess_feature", "_UI_Process_type"),
				 Process_modelingPackage.Literals.PROCESS__PROPOSED_PROCESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Company feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompanyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_company_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_company_feature", "_UI_Process_type"),
				 Process_modelingPackage.Literals.PROCESS__COMPANY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_author_feature", "_UI_Process_type"),
				 Process_modelingPackage.Literals.PROCESS__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_date_feature", "_UI_Process_type"),
				 Process_modelingPackage.Literals.PROCESS__DATE,
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
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS__ELEMENTS);
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS__RELATIONSHIPS);
			childrenFeatures.add(Process_modelingPackage.Literals.PROCESS__PARAMETERS);
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
	 * This returns Process.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Process"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((process_modeling.Process)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Process_type") :
			getString("_UI_Process_type") + " " + label;
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

		switch (notification.getFeatureID(process_modeling.Process.class)) {
			case Process_modelingPackage.PROCESS__VERSION:
			case Process_modelingPackage.PROCESS__PROPOSED_PROCESS:
			case Process_modelingPackage.PROCESS__COMPANY:
			case Process_modelingPackage.PROCESS__AUTHOR:
			case Process_modelingPackage.PROCESS__DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Process_modelingPackage.PROCESS__ELEMENTS:
			case Process_modelingPackage.PROCESS__RELATIONSHIPS:
			case Process_modelingPackage.PROCESS__PARAMETERS:
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
				(Process_modelingPackage.Literals.PROCESS__ELEMENTS,
				 Process_modelingFactory.eINSTANCE.createProcessStep()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS__ELEMENTS,
				 Process_modelingFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS__ELEMENTS,
				 Process_modelingFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS__ELEMENTS,
				 Process_modelingFactory.eINSTANCE.createUnorderedSteps()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS__ELEMENTS,
				 Process_modelingFactory.eINSTANCE.createCollaborativeNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS__ELEMENTS,
				 Process_modelingFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS__RELATIONSHIPS,
				 Process_modelingFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Process_modelingPackage.Literals.PROCESS__PARAMETERS,
				 Process_modelingFactory.eINSTANCE.createProcessParameter()));
	}

}
