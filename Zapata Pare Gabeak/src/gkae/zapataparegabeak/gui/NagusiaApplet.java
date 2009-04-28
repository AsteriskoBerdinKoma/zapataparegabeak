package gkae.zapataparegabeak.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NagusiaApplet extends JApplet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Frame frame;
	
	@Override
	public void start() {
		resize(800, 600);
	}
	
	private Frame findParentFrame(){ 
	    Container c = this; 
	    while(c != null){ 
	      if (c instanceof Frame) 
	        return (Frame)c; 

	      c = c.getParent(); 
	    } 
	    return (Frame)null; 
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
			//frame = findParentFrame();
			frame = (Frame)SwingUtilities.getAncestorOfClass(Frame.class, this);
			System.out.println(frame);
			NagusiaPanel nagusiaPanel = new NagusiaPanel(frame);
			getContentPane().add(nagusiaPanel, BorderLayout.CENTER);
		}
	}

}
