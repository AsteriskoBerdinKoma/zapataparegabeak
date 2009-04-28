package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileakKudeatu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JDialog;
import javax.swing.LayoutStyle;
import gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileakKudeatu.HornitzaileDatuakPanela;
import gkae.zapataparegabeak.objektuak.Hornitzailea;

public class DatuakEditatu extends JDialog {
	private HornitzaileDatuakPanela hornitzaileDatuakPanela;
	

	/**
	 * Create the dialog
	 */
	public DatuakEditatu() {
		super();

		
		hornitzaileDatuakPanela = new HornitzaileDatuakPanela();

		JButton aldaketakOnartuButton;
		aldaketakOnartuButton = new JButton();
		aldaketakOnartuButton.setText("Aldaketak onartu");

		JButton hornitzaileaEzabatuButton;
		hornitzaileaEzabatuButton = new JButton();
		hornitzaileaEzabatuButton.setText("Hornitzailea ezabatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(hornitzaileDatuakPanela, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(124, Short.MAX_VALUE)
					.addComponent(aldaketakOnartuButton)
					.addGap(56, 56, 56)
					.addComponent(hornitzaileaEzabatuButton)
					.addGap(66, 66, 66))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(hornitzaileDatuakPanela, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					.addGap(22, 22, 22)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hornitzaileaEzabatuButton)
						.addComponent(aldaketakOnartuButton))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		pack();
		//
	}

	public void setDatuak(Hornitzailea h) {
		// TODO Auto-generated method stub
		hornitzaileDatuakPanela.setDatuak(h);
	}

}
