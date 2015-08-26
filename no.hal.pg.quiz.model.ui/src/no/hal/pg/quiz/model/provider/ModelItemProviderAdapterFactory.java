/**
 */
package no.hal.pg.quiz.model.provider;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import no.hal.pg.model.GameDef;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.model.util.ModelSwitch;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.util.ModelAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.Quiz} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizItemProvider quizItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.Quiz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuizAdapter() {
		if (quizItemProvider == null) {
			quizItemProvider = new QuizItemProvider(this);
		}

		return quizItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.QuizTaskDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTaskDefItemProvider quizTaskDefItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.QuizTaskDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuizTaskDefAdapter() {
		if (quizTaskDefItemProvider == null) {
			quizTaskDefItemProvider = new QuizTaskDefItemProvider(this);
		}

		return quizTaskDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.QuizPartRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizPartRefItemProvider quizPartRefItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.QuizPartRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuizPartRefAdapter() {
		if (quizPartRefItemProvider == null) {
			quizPartRefItemProvider = new QuizPartRefItemProvider(this);
		}

		return quizPartRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.QuizPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizPartItemProvider quizPartItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.QuizPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuizPartAdapter() {
		if (quizPartItemProvider == null) {
			quizPartItemProvider = new QuizPartItemProvider(this);
		}

		return quizPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.QARef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QARefItemProvider qaRefItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.QARef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQARefAdapter() {
		if (qaRefItemProvider == null) {
			qaRefItemProvider = new QARefItemProvider(this);
		}

		return qaRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.QA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAItemProvider qaItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.QA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQAAdapter() {
		if (qaItemProvider == null) {
			qaItemProvider = new QAItemProvider(this);
		}

		return qaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.StringQuestion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringQuestionItemProvider stringQuestionItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.StringQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringQuestionAdapter() {
		if (stringQuestionItemProvider == null) {
			stringQuestionItemProvider = new StringQuestionItemProvider(this);
		}

		return stringQuestionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.XmlQuestion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlQuestionItemProvider xmlQuestionItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.XmlQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXmlQuestionAdapter() {
		if (xmlQuestionItemProvider == null) {
			xmlQuestionItemProvider = new XmlQuestionItemProvider(this);
		}

		return xmlQuestionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.StringAnswer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringAnswerItemProvider stringAnswerItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.StringAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringAnswerAdapter() {
		if (stringAnswerItemProvider == null) {
			stringAnswerItemProvider = new StringAnswerItemProvider(this);
		}

		return stringAnswerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.NumberAnswer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberAnswerItemProvider numberAnswerItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.NumberAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberAnswerAdapter() {
		if (numberAnswerItemProvider == null) {
			numberAnswerItemProvider = new NumberAnswerItemProvider(this);
		}

		return numberAnswerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.BooleanAnswer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanAnswerItemProvider booleanAnswerItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.BooleanAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAnswerAdapter() {
		if (booleanAnswerItemProvider == null) {
			booleanAnswerItemProvider = new BooleanAnswerItemProvider(this);
		}

		return booleanAnswerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.XmlAnswer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlAnswerItemProvider xmlAnswerItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.XmlAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXmlAnswerAdapter() {
		if (xmlAnswerItemProvider == null) {
			xmlAnswerItemProvider = new XmlAnswerItemProvider(this);
		}

		return xmlAnswerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.OptionsAnswer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsAnswerItemProvider optionsAnswerItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.OptionsAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionsAnswerAdapter() {
		if (optionsAnswerItemProvider == null) {
			optionsAnswerItemProvider = new OptionsAnswerItemProvider(this);
		}

		return optionsAnswerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.Option} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionItemProvider optionItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionAdapter() {
		if (optionItemProvider == null) {
			optionItemProvider = new OptionItemProvider(this);
		}

		return optionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.SingleOptionsAnswer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleOptionsAnswerItemProvider singleOptionsAnswerItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.SingleOptionsAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleOptionsAnswerAdapter() {
		if (singleOptionsAnswerItemProvider == null) {
			singleOptionsAnswerItemProvider = new SingleOptionsAnswerItemProvider(this);
		}

		return singleOptionsAnswerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.ManyOptionsAnswer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyOptionsAnswerItemProvider manyOptionsAnswerItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.ManyOptionsAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManyOptionsAnswerAdapter() {
		if (manyOptionsAnswerItemProvider == null) {
			manyOptionsAnswerItemProvider = new ManyOptionsAnswerItemProvider(this);
		}

		return manyOptionsAnswerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.Xml} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlItemProvider xmlItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.Xml}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXmlAdapter() {
		if (xmlItemProvider == null) {
			xmlItemProvider = new XmlItemProvider(this);
		}

		return xmlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.XmlContents} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlContentsItemProvider xmlContentsItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.XmlContents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXmlContentsAdapter() {
		if (xmlContentsItemProvider == null) {
			xmlContentsItemProvider = new XmlContentsItemProvider(this);
		}

		return xmlContentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.XmlPIAnswerElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlPIAnswerElementItemProvider xmlPIAnswerElementItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.XmlPIAnswerElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXmlPIAnswerElementAdapter() {
		if (xmlPIAnswerElementItemProvider == null) {
			xmlPIAnswerElementItemProvider = new XmlPIAnswerElementItemProvider(this);
		}

		return xmlPIAnswerElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.XmlTagElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlTagElementItemProvider xmlTagElementItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.XmlTagElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXmlTagElementAdapter() {
		if (xmlTagElementItemProvider == null) {
			xmlTagElementItemProvider = new XmlTagElementItemProvider(this);
		}

		return xmlTagElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.XmlTag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlTagItemProvider xmlTagItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.XmlTag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXmlTagAdapter() {
		if (xmlTagItemProvider == null) {
			xmlTagItemProvider = new XmlTagItemProvider(this);
		}

		return xmlTagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.hal.pg.quiz.model.XmlAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlAttributeItemProvider xmlAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link no.hal.pg.quiz.model.XmlAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXmlAttributeAdapter() {
		if (xmlAttributeItemProvider == null) {
			xmlAttributeItemProvider = new XmlAttributeItemProvider(this);
		}

		return xmlAttributeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (quizItemProvider != null) quizItemProvider.dispose();
		if (quizTaskDefItemProvider != null) quizTaskDefItemProvider.dispose();
		if (quizPartRefItemProvider != null) quizPartRefItemProvider.dispose();
		if (quizPartItemProvider != null) quizPartItemProvider.dispose();
		if (qaRefItemProvider != null) qaRefItemProvider.dispose();
		if (qaItemProvider != null) qaItemProvider.dispose();
		if (stringQuestionItemProvider != null) stringQuestionItemProvider.dispose();
		if (xmlQuestionItemProvider != null) xmlQuestionItemProvider.dispose();
		if (stringAnswerItemProvider != null) stringAnswerItemProvider.dispose();
		if (numberAnswerItemProvider != null) numberAnswerItemProvider.dispose();
		if (booleanAnswerItemProvider != null) booleanAnswerItemProvider.dispose();
		if (xmlAnswerItemProvider != null) xmlAnswerItemProvider.dispose();
		if (optionsAnswerItemProvider != null) optionsAnswerItemProvider.dispose();
		if (optionItemProvider != null) optionItemProvider.dispose();
		if (singleOptionsAnswerItemProvider != null) singleOptionsAnswerItemProvider.dispose();
		if (manyOptionsAnswerItemProvider != null) manyOptionsAnswerItemProvider.dispose();
		if (xmlItemProvider != null) xmlItemProvider.dispose();
		if (xmlContentsItemProvider != null) xmlContentsItemProvider.dispose();
		if (xmlPIAnswerElementItemProvider != null) xmlPIAnswerElementItemProvider.dispose();
		if (xmlTagElementItemProvider != null) xmlTagElementItemProvider.dispose();
		if (xmlTagItemProvider != null) xmlTagItemProvider.dispose();
		if (xmlAttributeItemProvider != null) xmlAttributeItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link ModelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ModelChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ModelSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseGameDef(GameDef object) {
				newChildDescriptors.add
					(createChildParameter
						(ModelPackage.Literals.GAME_DEF__TASKS,
						 ModelFactory.eINSTANCE.createQuizTaskDef()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return QuizEditPlugin.INSTANCE;
		}
	}

}
