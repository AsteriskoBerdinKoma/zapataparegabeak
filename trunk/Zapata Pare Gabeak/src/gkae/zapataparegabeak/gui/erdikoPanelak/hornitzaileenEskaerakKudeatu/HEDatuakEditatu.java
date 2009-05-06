package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JDialog;
import javax.swing.LayoutStyle;
import gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu.HornitzaileEskaeraDatuakPanela;

public class HEDatuakEditatu extends JDialog {

	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HEDatuakEditatu dialog = new HEDatuakEditatu();
					dialog.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent e) {
							System.exit(0);
						}
					});
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog
	 */
	public HEDatuakEditatu() {
		super();

		HornitzaileEskaeraDatuakPanela hornitzaileEskaeraDatuakPanela;
		hornitzaileEskaeraDatuakPanela = new HornitzaileEskaeraDatuakPanela();

		JButton aldaketakOnartuButton;
		aldaketakOnartuButton = new JButton();
		aldaketakOnartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		aldaketakOnartuButton.setText("Aldaketak onartu");

		JButton utziButton;
		utziButton = new JButton();
		utziButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		utziButton.setText("Utzi");
		final GroupLayout groupLayout = new GroupLayout((JComponent) getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addComponent(hornitzaileEskaeraDatuakPanela, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(296, Short.MAX_VALUE)
					.addComponent(utziButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(aldaketakOnartuButton)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(hornitzaileEskaeraDatuakPanela, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(utziButton)
						.addComponent(aldaketakOnartuButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		pack();
		//
	}

}
