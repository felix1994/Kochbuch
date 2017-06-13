package ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

import model.Kochbuch;
import model.Rezept;

import org.eclipse.swt.SWT;

public class NeuesGericht extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 * @param kochbuch 
	 */
	public NeuesGericht(Composite parent, int style, Kochbuch kochbuch) {
		super(parent, style);
		setLayout(new GridLayout(1, false));
		
		for(Rezept r : kochbuch.getRezepte()){
			new Label(this, SWT.NONE).setText(r.getRezeptname());
		}
		

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
