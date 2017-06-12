package ui;

import org.eclipse.swt.widgets.Composite;

public class NeuesGericht extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public NeuesGericht(Composite parent, int style) {
		super(parent, style);
		setLayout(null);
		

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
