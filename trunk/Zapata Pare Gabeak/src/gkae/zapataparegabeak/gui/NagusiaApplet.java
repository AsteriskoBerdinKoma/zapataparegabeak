package gkae.zapataparegabeak.gui;

import java.awt.BorderLayout;

import javax.swing.JApplet;

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
		{
			NagusiaPanel nagusiaPanel = new NagusiaPanel();
			getContentPane().add(nagusiaPanel, BorderLayout.CENTER);
		}
	}

}
