package no.hal.pg.runtime.ui.html;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import no.hal.pg.runtime.provider.PgruntimeEditPlugin;
import no.hal.pg.runtime.ui.AbstractSelectionView;

public class HtmlPreview extends AbstractSelectionView {

	@Override
	protected boolean isValidSelection(Object o) {
		return o instanceof EObject;
	}
	
	private ComboViewer generatorSelector;
	private Control htmlParent;
	private Browser htmlViewer;
	private Text htmlSourceViewer;
	
	@Override
	public void createPartControl(Composite parent) {
//		super.createPartControl(parent);
		parent.setLayout(new GridLayout(1, false));
		generatorSelector = new ComboViewer(parent);
		generatorSelector.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		TabFolder tabFolder = new TabFolder(parent, SWT.BOTTOM);
		TabItem htmlViewerTab = new TabItem(tabFolder, SWT.NONE);
		htmlViewerTab.setText("Preview");
		htmlViewer = new Browser(tabFolder, SWT.NONE);
		htmlViewerTab.setControl(htmlViewer);
		TabItem htmlSourceViewerTab = new TabItem(tabFolder, SWT.NONE);
		htmlSourceViewerTab.setText("Source");
		htmlSourceViewer = new Text(tabFolder, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
		htmlSourceViewerTab.setControl(htmlSourceViewer);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		htmlParent = tabFolder;
		
		generatorSelector.setLabelProvider(new LabelProvider());
		generatorSelector.setContentProvider(new ArrayContentProvider());
		generatorSelector.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection) {
					Object object = ((IStructuredSelection) selection).getFirstElement();
					if (object instanceof HtmlGenerator) {
						htmlGeneratorSelected((HtmlGenerator) object, currentRoot);
					}
				}				
			}
		});
	}

	protected void htmlGeneratorSelected(HtmlGenerator htmlGenerator, EObject eObject) {
		String html = htmlGenerator.generateHtml(eObject);
		htmlViewer.setText(html != null ? html : "<html><head></head><body>&lt;empty&gt;</body></html>");
		htmlSourceViewer.setText(html != null ? html : "<empty>");
	}

	@Override
	public void setFocus() {
		generatorSelector.getControl().setFocus();
	}
	
	public void dispose() {
		generatorSelector.getControl().dispose();
		htmlParent.dispose();
		super.dispose();
	}

	protected EObject getSelectedEObject() {
		return (EObject) getSelection();
	}

	private EObject currentRoot = null;

	@Override
	protected void updateView() {
		EObject selection = getSelectedEObject();
		if (selection != null) {
			EObject root = EcoreUtil.getRootContainer(selection);
			if (root != currentRoot) {
				Collection<HtmlGenerator> generators = PgruntimeEditPlugin.getPlugin().getGenerators(root);
				currentRoot = root;
				setInputAndSelectFirst(generatorSelector, generators);
			}
		}
	}
}
