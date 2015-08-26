package no.hal.pg.runtime.ui;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.TextActionHandler;
import org.eclipse.ui.part.ViewPart;

public abstract class AbstractSelectionView extends ViewPart {

	protected IEditingDomainProvider editingDomainProvider;
	protected ISelectionProvider selectionProvider;
	
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		getSite().getWorkbenchWindow().getPartService().addPartListener(partListener);
	}
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(partListener);
		editingDomainProvider = null;
		super.dispose();
	}

	private ISelectionChangedListener selectionChangedListener = new ISelectionChangedListener(){
		public void selectionChanged(SelectionChangedEvent event) {
			AbstractSelectionView.this.selectionChanged(event.getSelection());
		}
	};
	
	protected void setSelectionProvider(ISelectionProvider selectionProvider) {
		if (this.selectionProvider == selectionProvider) {
			return;
		}
		if (this.selectionProvider != null) {
			this.selectionProvider.removeSelectionChangedListener(selectionChangedListener);
		}
		this.selectionProvider = selectionProvider;
		if (this.selectionProvider != null) {
			this.selectionProvider.addSelectionChangedListener(selectionChangedListener);
		}
		selectionChanged(this.selectionProvider != null ? this.selectionProvider.getSelection() : StructuredSelection.EMPTY);
	}

	protected void setEditingDomainProvider(IEditingDomainProvider editingDomainProvider) {
		if (this.editingDomainProvider == editingDomainProvider) {
			return;
		}
		if (this.editingDomainProvider != null) {
		}
		this.editingDomainProvider = editingDomainProvider;
		if (this.editingDomainProvider != null) {
		}
		updateView();
	}

	protected void updateView() {
	}
	
	@Override
	public <T> T getAdapter(Class<T> type) {
		T t =  super.getAdapter(type);
		if (t == null && editingDomainProvider instanceof IAdaptable) {
			t = ((IAdaptable) editingDomainProvider).getAdapter(type);
		}
		return t;
	}

	private void updateProviders(IWorkbenchPart part) {
		setSelectionProvider(getAdapter(part, ISelectionProvider.class));
		setEditingDomainProvider(getAdapter(part, IEditingDomainProvider.class));
	}

	protected <T> T getAdapter(IWorkbenchPart part, Class<T> c) {
		IWorkbenchPage workbenchPage = getViewSite().getWorkbenchWindow().getActivePage();
		if (workbenchPage == null) {
			return null;
		}
		IEditorPart editorPart = workbenchPage.getActiveEditor();
		return (editorPart != null ? (T)editorPart.getAdapter(c) : null);
	}
	
	private IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart part) {
			updateProviders(part);
		}
		public void partBroughtToTop(IWorkbenchPart part) {
			updateProviders(part);
		}
		public void partClosed(IWorkbenchPart part) {
			updateProviders(part);
		}
		public void partDeactivated(IWorkbenchPart part) {
			updateProviders(part);
		}
		public void partOpened(IWorkbenchPart part) {
			updateProviders(part);
		}
	};

	private Object selection = null;
	
	protected Object getSelection() {
		return this.selection;
	}
	
	public void selectionChanged(SelectionChangedEvent event) {
		selectionChanged(event.getSelection());
	}
	protected void selectionChanged(ISelection selection) {
		Object oldSelection = getSelection();
		this.selection = null;
		if (selection.isEmpty()) {
		} else if (selection instanceof IStructuredSelection) {
			Object o = ((IStructuredSelection)selection).getFirstElement();
			if (isValidSelection(o)) {
				this.selection = o;
			}
		}
		if (getSelection() != oldSelection) {
			updateView();
		}
	}
	protected boolean isValidSelection(Object o) {
		return true;
	}
	
	private TextActionHandler textActionHandler;
	
	void registerTextControl(final Text textControl) {
		textControl.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				textActionHandler.addText(textControl);
			}
			public void focusLost(FocusEvent e) {
				textActionHandler.removeText(textControl);
			}
		});
	}

	public void createPartControl(Composite parent) {
		textActionHandler = new TextActionHandler(getViewSite().getActionBars());
		createActions();
		createMenu();
		createToolbar();
	}
	protected Text createTextControl(Composite parent, int style) {
		Text textControl = new Text(parent, style);
		textActionHandler.addText(textControl);
		return textControl;
	}
	protected void disposeTextControl(Text textControl) {
		if (! textControl.isDisposed()) {
			textActionHandler.removeText(textControl);
			textControl.dispose();
		}
	}

	protected void createActions() {
	}

	private void createMenu() {
		createMenu(getViewSite().getActionBars().getMenuManager());
	}
	protected void createMenu(IMenuManager mgr) {
	}

	private void createToolbar() {
		createToolbar(getViewSite().getActionBars().getToolBarManager());
	}
	protected void createToolbar(IToolBarManager mgr) {
	}
}