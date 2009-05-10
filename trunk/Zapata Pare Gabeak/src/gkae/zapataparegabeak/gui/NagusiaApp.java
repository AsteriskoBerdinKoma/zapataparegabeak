package gkae.zapataparegabeak.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.objektuak.Kudeaketa;

public class NagusiaApp {

	private JFrame frame;

	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NagusiaApp window = new NagusiaApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application
	 */
	public NagusiaApp() {
		createContents();
	}

	/**
	 * Initialize the contents of the frame
	 */
	private void createContents() {
		Kudeaketa.getInstance();
		frame = new JFrame();
		frame.setTitle("Zapata Pare Gabeak");
		frame.setBounds(100, 100, 1180, 718);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final NagusiaPanel nagusiaPanel = new NagusiaPanel();
		frame.getContentPane().add(nagusiaPanel, BorderLayout.CENTER);
	}

}
