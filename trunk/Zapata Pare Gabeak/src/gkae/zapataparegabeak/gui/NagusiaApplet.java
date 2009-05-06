package gkae.zapataparegabeak.gui;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NagusiaApplet extends JApplet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void start() {
		resize(800, 600);
	}
	
	/**
	 * Create the applet.
	 */
	public NagusiaApplet() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		{
			NagusiaPanel nagusiaPanel = new NagusiaPanel();
			getContentPane().add(nagusiaPanel, BorderLayout.CENTER);
		}
	}

}
