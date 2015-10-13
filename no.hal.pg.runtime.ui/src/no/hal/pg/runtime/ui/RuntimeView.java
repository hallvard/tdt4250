package no.hal.pg.runtime.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.IEngine;
import no.hal.pg.runtime.engine.IServiceProvider;
import no.hal.pg.runtime.provider.PgruntimeEditPlugin;

public class RuntimeView extends AbstractSelectionView {

//	private ComboViewer eOperationSelector;
	private TreeViewer serviceOperationsViewer;
	private PropertySheetPage propertySheetPage;

	@Override
	protected boolean isValidSelection(Object o) {
		if (o instanceof EObject) {
			return getGame((EObject) o) != null || getGameDef((EObject) o) != null;
		}
		return false;
	}

	private Collection<IEngine> engines = new ArrayList<IEngine>();
	
	protected IEngine getEngine(EObject eObject) {
		Game game = getGame(eObject);
		for (IEngine engine : engines) {
			if (engine.getGame() == game) {
				return engine;
			}
		}
		return null;
	}

	protected void addEngine(IEngine engine) {
		engines.add(engine);
	}
	
	public void runGame(GameDef gameDef) {
		IEngine engine = createEngine(gameDef.eResource().getURI().lastSegment());
		if (engine == null) {
			return;
		}
		engine.init(gameDef);
		Resource resource = engine.getGame().eResource();
		engine.start();
//		boolean exists = resource.getResourceSet().getURIConverter().exists(resource.getURI(), null);
//		try {
//			if (! exists) {
//				resource.save(null);
//			}
//		} catch (IOException e) {
//			System.err.println("Exception when saving game: " + e);
//		}
		addEngine(engine);

		updateView();
	}

	private IEngine createEngine(String key) {
		Dictionary<String, Object> engineConfig = new Hashtable<String, Object>();
		engineConfig.put("IEngine.key", key);
		IEngine engine = PgruntimeEditPlugin.getPlugin().createEngine(engineConfig);
		if (engine == null) {
			MessageDialog.openError(engineLabel.getShell(), "Engine creation error", "Couldn't create Engine");
			return null;
		}
		return engine;
	}

	public void resumeGame(Game game) {
		IEngine engine = getEngine(game);
		if (engine == null) {
			engine = createEngine(game.eResource().getURI().lastSegment());
			if (engine == null) {
				return;
			}
			addEngine(engine);
			engine.init(game);
		}
		updateView();
	}

	protected Game getGame(EObject eObject) {
		return (Game) getContainer(eObject, RuntimePackage.eINSTANCE.getGame());
	}

	protected GameDef getGameDef(EObject eObject) {
		return (GameDef) getContainer(eObject, ModelPackage.eINSTANCE.getGameDef());
	}

	private static String noEngineLabel = "<No engine for current selection>";
	private Label engineLabel;

	private IAction runGameAction;
	
	private void executeAction(final CommandAction action, final EObject context, Notifier scope) {
		if (editingDomainProvider != null) {
			ChangeCommand changeCommand = new ChangeCommand(scope) {
				@Override
				protected void doExecute() {
					action.execute(context);
				}
			};
			CommandStack commandStack = editingDomainProvider.getEditingDomain().getCommandStack();
			commandStack.execute(changeCommand);
		} else {
			action.execute(context);
		}
	}
	
	@Override
	protected void createActions() {
		runGameAction = new CommandAction("Run game") {
			public void execute(EObject context) {
				if (context instanceof GameDef) {
					runGame((GameDef) context);
				} else if (context instanceof Game) {
					resumeGame((Game) context);
				}
			}
			public void run() {
				EObject context = getSelectedEObject();
				executeAction(this, context, context.eResource().getResourceSet());
			}
		};
		super.createActions();
	}

	@Override
	protected void createToolbar(IToolBarManager mgr) {
		super.createToolbar(mgr);
		mgr.add(runGameAction);
	}
	
	private Button invokeButton;
	
	@Override
	public void createPartControl(Composite parent) {
		parentShell = parent.getShell();
		parent.setLayout(new GridLayout(1, false));
		super.createPartControl(parent);

		engineLabel = new Label(parent, SWT.NONE);
		engineLabel.setText(noEngineLabel);
		engineLabel.setLayoutData(new GridData( SWT.FILL, SWT.CENTER, true, false, 1, 1));
		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		{
			Composite treeParent = new Composite(sashForm, SWT.NONE);
			GridLayout treeParentLayout = new GridLayout(2, false);
			{
				treeParentLayout.marginWidth = 0;
				treeParentLayout.marginHeight = 0;
				treeParent.setLayout(treeParentLayout);
				serviceOperationsViewer = new TreeViewer(treeParent, SWT.NONE);
				serviceOperationsViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				serviceOperationsViewer.setLabelProvider(new ServiceLabelProvider());
				serviceOperationsViewer.setContentProvider(new ServiceContentProvider());
				serviceOperationsViewer.addSelectionChangedListener(operationSelectionListener);
		
				invokeButton = new Button(treeParent, SWT.PUSH);
				invokeButton.setText("Invoke!");
				invokeButton.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
				invokeButton.addSelectionListener(invokeButtonSelected);
			}
			propertySheetPage = new PropertySheetPage();
			propertySheetPage.createControl(sashForm);		
	
			sashForm.setWeights(new int[]{30, 70});
		}
	}
	
	private SelectionListener invokeButtonSelected = new SelectionAdapter() {
		public void widgetSelected(SelectionEvent e) {
			ISelection selection = serviceOperationsViewer.getSelection();
			if (selection instanceof IStructuredSelection) {
				Object object = ((IStructuredSelection) selection).getFirstElement();
				if (object instanceof EObject) {
					EObject operationObject = (EObject) object;
					if (EOperationEClassManager.isEOperationObject(operationObject)) {
						EOperationInvocation operationInvocation = new EOperationInvocation(operationObject);
						operationInvocation.execute(editingDomainProvider, parentShell);
						if (operationInvocation.getInvocationResult() instanceof Exception) {
							//
						}
					}
				}
			}
		}
	};

	private ISelectionChangedListener operationSelectionListener = new ISelectionChangedListener() {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			ISelection selection = event.getSelection();
			if (selection instanceof IStructuredSelection) {
				Object object = ((IStructuredSelection) selection).getFirstElement();
				if (object instanceof Service<?>) {
					serviceSelected((Service<?>) object);
				} else if (object instanceof EObject) {
					EObject eObject = (EObject) object;
					if (EOperationEClassManager.isEOperationObject(eObject)) {
						operationObjectSelected(eObject);
						invokeButton.setEnabled(true);
						return;
					}
				}
				invokeButton.setEnabled(false);
			}
		}
	};
	
	@Override
	public void setFocus() {
//		eOperationSelector.getControl().setFocus();
		serviceOperationsViewer.getControl().setFocus();
	}
	
	public void dispose() {
//		eOperationSelector.getControl().dispose();
		serviceOperationsViewer.getControl().dispose();
		propertySheetPage.dispose();
		super.dispose();
	}

	protected EObject getSelectedEObject() {
		return (EObject) getSelection();
	}

	private Collection<Service<?>> getServices(EObject selection) {
		BundleContext bundleContext = PgruntimeEditPlugin.getPlugin().getBundle().getBundleContext();
		Collection<ServiceReference<IServiceProvider>> serviceReferences = null;
		try {
			serviceReferences = bundleContext.getServiceReferences(IServiceProvider.class, null);
		} catch (InvalidSyntaxException e) {
		}
		Collection<Service<?>> services = new ArrayList<Service<?>>();
		if (serviceReferences != null) {
			for (ServiceReference<IServiceProvider> serviceReference : serviceReferences) {
				IServiceProvider serviceProvider = bundleContext.getService(serviceReference);
				if (serviceProvider != null) {
					Service<?> service = serviceProvider.getService(selection);
					if (service != null) {
						services.add(service);
					}
				}
			}
		}
		return services;
	}

	@Override
	protected void updateView() {
		EObject selection = getSelectedEObject();
		IEngine engine = null;
		Game game = getGame(selection);
		if (game != null) {
			engine = getEngine(game);
		}
		runGameAction.setEnabled(getGameDef(selection) != null || (game != null && engine == null));
		engineLabel.setText(engine != null ? ("Engine #" + engine.getKey()) : noEngineLabel);
		Collection<Service<?>> services = getServices(selection);
		Collection<EClass> serviceClasses = new ArrayList<EClass>();
		for (Service<?> service : services) {
			serviceClasses.add(service.eClass());
		}
		setInputAndSelectFirst(serviceOperationsViewer, services, EOperation.class);
		super.updateView();
	}
	
	protected void serviceSelected(Service<?> service) {
		updatePropertySheet(service);
	}
	
	protected void operationObjectSelected(EObject operationObject) {
		updatePropertySheet(EOperationEClassManager.getEOperationObjectArguments(operationObject));
	}
	
	private Shell parentShell;

	private void updatePropertySheet(EObject eObject) {
		if (editingDomainProvider != null) {
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) editingDomainProvider.getEditingDomain();
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(editingDomain.getAdapterFactory()));
		}
		StructuredSelection selection = (eObject != null && editingDomainProvider != null ? new StructuredSelection(eObject) : StructuredSelection.EMPTY);
		propertySheetPage.selectionChanged(null, selection);
	}
}