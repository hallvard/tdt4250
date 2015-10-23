/**
 */
package no.hal.sokoban.model.provider;


import java.util.Collection;
import java.util.List;

import no.hal.gridgame.model.ModelPackage;

import no.hal.gridgame.model.provider.GridItemProvider;

import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.SokobanGrid;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link no.hal.sokoban.model.SokobanGrid} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SokobanGridItemProvider extends GridItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanGridItemProvider(AdapterFactory adapterFactory) {
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

			addPlayerXPropertyDescriptor(object);
			addPlayerYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Player X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayerXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SokobanGrid_playerX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SokobanGrid_playerX_feature", "_UI_SokobanGrid_type"),
				 no.hal.sokoban.model.ModelPackage.Literals.SOKOBAN_GRID__PLAYER_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Player Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayerYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SokobanGrid_playerY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SokobanGrid_playerY_feature", "_UI_SokobanGrid_type"),
				 no.hal.sokoban.model.ModelPackage.Literals.SOKOBAN_GRID__PLAYER_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SokobanGrid.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SokobanGrid"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SokobanGrid sokobanGrid = (SokobanGrid)object;
		return getString("_UI_SokobanGrid_type") + " " + sokobanGrid.getWidth();
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

		switch (notification.getFeatureID(SokobanGrid.class)) {
			case no.hal.sokoban.model.ModelPackage.SOKOBAN_GRID__PLAYER_X:
			case no.hal.sokoban.model.ModelPackage.SOKOBAN_GRID__PLAYER_Y:
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

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.GRID__OBJECTS,
				 ModelFactory.eINSTANCE.createUoD()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.GRID__OBJECTS,
				 ModelFactory.eINSTANCE.createSokobanGrid()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.GRID__OBJECTS,
				 ModelFactory.eINSTANCE.createSokobanGame()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.GRID__OBJECTS,
				 ModelFactory.eINSTANCE.createMovePlayerCommand()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.GRID__OBJECTS,
				 ModelFactory.eINSTANCE.createSokobanLevel()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.GRID__OBJECTS,
				 ModelFactory.eINSTANCE.create(no.hal.sokoban.model.ModelPackage.Literals.STRING2_STRING_MAP_ENTRY)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return sokobanEditPlugin.INSTANCE;
	}

}
