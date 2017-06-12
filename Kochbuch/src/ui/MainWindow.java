package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class MainWindow {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.SHELL_TRIM & (~SWT.RESIZE));
		shell.setSize(1000, 750);
		shell.setText("Kochbuch Anwendung");
		shell.setLayout(new GridLayout(1, false));
		
		Menu menuBar = new Menu(shell, SWT.BAR);
        MenuItem cascadeFileMenu = new MenuItem(menuBar, SWT.CASCADE);
        cascadeFileMenu.setText("&Menü");

        Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
        cascadeFileMenu.setMenu(fileMenu);
        
        MenuItem subMenuItem2 = new MenuItem(fileMenu, SWT.PUSH);
        subMenuItem2.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent e) {
        		System.out.println("hier");
        		new NeuesGericht(shell, SWT.NONE);
        		shell.layout();
        		
        	}
        });
        subMenuItem2.setText("Neues Gericht");

        MenuItem subMenuItem3 = new MenuItem(fileMenu, SWT.PUSH);
        subMenuItem3.setText("Neuen Essensplan");
        
        MenuItem subMenuItem4 = new MenuItem(fileMenu, SWT.PUSH);
        subMenuItem4.setText("Kochbuch Import");
        
        MenuItem subMenuItem5 = new MenuItem(fileMenu, SWT.PUSH);
        subMenuItem5.setText("Kochbuch Export");
        
        MenuItem subMenuItem6 = new MenuItem(fileMenu, SWT.PUSH);
        subMenuItem6.setText("Gerichte durchstöbern");

        shell.setMenuBar(menuBar);
        
        
        

	}
}
