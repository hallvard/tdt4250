package no.hal.pg.runtime.ui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.views.properties.PropertySheetPage;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.Engine;
import no.hal.pg.runtime.engine.IEngine;
import no.hal.pg.runtime.engine.IEngineFactory;
import no.hal.pg.runtime.provider.PgruntimeEditPlugin;

public class RuntimeView extends AbstractSelectionView {

	private Map<URI, IEngine> engines = new HashMap<URI, IEngine>();
	
	private ComboViewer eOperationSelector;
	private PropertySheetPage propertySheetPage;

	@Override
	protected boolean isValidSelection(Object o) {
		if (o instanceof EObject) {
			return getGame((EObject) o) != null || getGameDef((EObject) o) != null;
		}
		return false;
	}

	protected EObject getContainer(EObject eObject, EClass eClass) {
		while (eObject != null) {
			if (eClass.isInstance(eObject)) {
				return eObject;
			}
			eObject = eObject.eContainer();
		}
		return null;
	}

	protected IEngine getEngine(EObject eObject) {
		Game game = getGame(eObject);
		if (game != null && game.eResource() != null) {
			URI uri = game.eResource().getURI();
			return engines.get(uri);
		}
		return null;
	}
	
	public void runGame(GameDef gameDef) {
		IEngine engine = createEngine();
		if (engine == null) {
			return;
		}
		engine.init(gameDef);
		Resource resource = engine.getGame().eResource();
		engine.start();
		try {
			resource.save(null);
		} catch (IOException e) {
			System.err.println("Exception when saving game: " + e);
		}
		engines.put(resource.getURI(), engine);

		updateView();
	}

	private IEngine createEngine() {
		IEngineFactory engineFactory = PgruntimeEditPlugin.getPlugin().getEngineFactory();
		if (engineFactory == null) {
			MessageDialog.openError(engineLabel.getShell(), "Engine creation error", "No EngineFactory");
			return null;
		}
		return engineFactory.createEngine();
	}

	public void resumeGame(Game game) {
		IEngine engine = getEngine(game);
		if (engine == null) {
			engine = createEngine();
			if (engine == null) {
				return;
			}
			engines.put(game.eResource().getURI(), engine);
			engine.init(game);
		}
		updateView();
	}

	private IEngine getEngine(Game game) {
		return engines.get(game.eResource().getURI());
	}
	
	protected Game getGame(EObject eObject) {
		return (Game) getContainer(eObject, RuntimePackage.eINSTANCE.getGame());
	}

	protected GameDef getGameDef(EObject eObject) {
		return (GameDef) getContainer(eObject, ModelPackage.eINSTANCE.getGameDef());
	}

	private static String noEngineLabel = "<No engine selected for current selection>";
	private Label engineLabel;

	private IAction runGameAction;
	
	@Override
	protected void createActions() {
		runGameAction = new Action("Run game") {
			public void run() {
				EObject eObject = getSelectedEObject();
				if (eObject instanceof GameDef) {
					runGame((GameDef) eObject);
				} else if (eObject instanceof Game) {
					resumeGame((Game) eObject);
				}
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
		super.createPartControl(parent);
		parent.setLayout(new GridLayout(2, false));

		engineLabel = new Label(parent, SWT.NONE);
		engineLabel.setText(noEngineLabel);
		engineLabel.setLayoutData(new GridData( SWT.FILL, SWT.CENTER, true, false, 2, 1));
		eOperationSelector = new ComboViewer(parent, SWT.READ_ONLY | SWT.DROP_DOWN);
		eOperationSelector.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		eOperationSelector.setLabelProvider(new EOperationLabelProvider());
		eOperationSelector.setContentProvider(new EOperationContentProvider());
		eOperationSelector.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection) {
					Object object = ((IStructuredSelection) selection).getFirstElement();
					if (object instanceof EOperation) {
						operationSelected((EOperation) object);
					}
				}				
			}
		});

		invokeButton = new Button(parent, SWT.PUSH);
		invokeButton.setText("Invoke!");
		invokeButton.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
		invokeButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				EOperationInvocation invocation = currentInvocation;
				currentInvocation = null;
				if (invocation != null) {
					invocation.execute(editingDomainProvider, parentShell);
					if (invocation.getInvocationResult() instanceof Exception) {
						//
					}
				}
			}
		});

		propertySheetPage = new PropertySheetPage();
		propertySheetPage.createControl(parent);
		propertySheetPage.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
	}

	@Override
	public void setFocus() {
		eOperationSelector.getControl().setFocus();
	}
	
	public void dispose() {
		eOperationSelector.getControl().dispose();
		propertySheetPage.dispose();
		super.dispose();
	}

	private EOperationInvocation currentInvocation;

	protected EObject getSelectedEObject() {
		return (EObject) getSelection();
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
		engineLabel.setText(engine != null ? engine.getGame().eResource().getURI().toString() : noEngineLabel);
		invokeButton.setEnabled(selection instanceof Service<?>);
		if (selection instanceof Service<?>) {
			if (currentInvocation == null || selection != currentInvocation.getOperationOwner()) {
				currentInvocation = new EOperationInvocation(selection);
				setInputAndSelectFirst(eOperationSelector, selection);
			}
		}
		super.updateView();
	}

	private void setInputAndSelectFirst(ComboViewer comboViewer, Object input) {
		eOperationSelector.setInput(input);
		IStructuredContentProvider contentProvider = (IStructuredContentProvider) eOperationSelector.getContentProvider();
		Object[] elements = contentProvider.getElements(input);
		if (elements.length > 0) {
			eOperationSelector.setSelection(new StructuredSelection(elements[0]));
		}
	}
	
	private EOperationEClassManager operationEClassManager = new EOperationEClassManager();
	
	private Map<EOperation, EObject> operationObjects = new HashMap<EOperation, EObject>();
	
	protected void operationSelected(EOperation operation) {
		EObject operationArguments = null;
		if (currentInvocation != null && operation != null) {
			EObject operationObject = operationObjects.get(operation);
			if (operationObject == null) {
				operationObject = operationEClassManager.getEOperationObject(operation, currentInvocation.getOperationOwner());
				operationObjects.put(operation, operationObject);
			} else {
				operationEClassManager.setEOperationObjectEObject(operationObject, currentInvocation.getOperationOwner());
			}
			operationArguments = operationEClassManager.getEOperationObjectArguments(operationObject);
			currentInvocation.setOperation(operation, operationArguments);
		}
		updatePropertySheet(operationArguments);
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