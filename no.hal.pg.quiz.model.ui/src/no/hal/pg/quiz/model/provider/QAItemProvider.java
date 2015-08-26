/**
 */
package no.hal.pg.quiz.model.provider;


import java.util.Collection;
import java.util.List;

import no.hal.pg.model.util.Util;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.model.QA;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link no.hal.pg.quiz.model.QA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QAItemProvider extends AbstractQAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_QA_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QA_name_feature", "_UI_QA_type"),
				 ModelPackage.Literals.QA__NAME,
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
			childrenFeatures.add(ModelPackage.Literals.QA__Q);
			childrenFeatures.add(ModelPackage.Literals.QA__A);
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
	 * This returns QA.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QA"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		QA qa = (QA)object;
		String label = qa.getName();
		if (label == null || label.length() == 0) {
			label = "#" + (Util.indexOf(qa.eContainer()) + 1) + "-" + (Util.indexOf(qa) + 1);
		}
		return label == null || label.length() == 0 ?
			getString("_UI_QA_type") :
			getString("_UI_QA_type") + " " + label;
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

		switch (notification.getFeatureID(QA.class)) {
			case ModelPackage.QA__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.QA__Q:
			case ModelPackage.QA__A:
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
				(ModelPackage.Literals.QA__Q,
				 ModelFactory.eINSTANCE.createStringQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.QA__Q,
				 ModelFactory.eINSTANCE.createXmlQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.QA__A,
				 ModelFactory.eINSTANCE.createStringAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.QA__A,
				 ModelFactory.eINSTANCE.createNumberAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.QA__A,
				 ModelFactory.eINSTANCE.createBooleanAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.QA__A,
				 ModelFactory.eINSTANCE.createXmlAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.QA__A,
				 ModelFactory.eINSTANCE.createOptionsAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.QA__A,
				 ModelFactory.eINSTANCE.createSingleOptionsAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.QA__A,
				 ModelFactory.eINSTANCE.createManyOptionsAnswer()));
	}

}
