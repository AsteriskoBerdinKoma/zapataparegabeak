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
import javax.swing.SwingConstants;
import com.swtdesigner.SwingResourceManager;
import gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu.HornitzaileEskaeraDatuakPanela;
import gkae.zapataparegabeak.objektuak.HornitzaileEskaera;
import gkae.zapataparegabeak.objektuak.Hornitzailea;

public class HEDatuakEditatu extends JDialog {
	
	private HornitzaileEskaeraDatuakPanela hornitzaileEskaeraDatuakPanela;
	private HornitzaileEskaera h;
	
	/**
	 * Create the dialog
	 */
	public HEDatuakEditatu() {
		super();

		
		hornitzaileEskaeraDatuakPanela = new HornitzaileEskaeraDatuakPanela();

		JButton aldaketakOnartuButton;
		aldaketakOnartuButton = new JButton();
		aldaketakOnartuButton.setHorizontalAlignment(SwingConstants.LEFT);
		aldaketakOnartuButton.setIcon(SwingResourceManager.getIcon(HEDatuakEditatu.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		aldaketakOnartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		aldaketakOnartuButton.setText("Aldaketak onartu");

		JButton utziButton;
		utziButton = new JButton();
		utziButton.setHorizontalAlignment(SwingConstants.LEFT);
		utziButton.setIcon(SwingResourceManager.getIcon(HEDatuakEditatu.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
		utziButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		utziButton.setText("Utzi");
		final GroupLayout groupLayout = new GroupLayout((JComponent) getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(296, Short.MAX_VALUE)
					.addComponent(utziButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(aldaketakOnartuButton)
					.addContainerGap())
				.addComponent(hornitzaileEskaeraDatuakPanela, GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(hornitzaileEskaeraDatuakPanela, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(utziButton)
						.addComponent(aldaketakOnartuButton))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		pack();
		//
	}
	public void setDatuak(HornitzaileEskaera h) {

		this.h = h;
		hornitzaileEskaeraDatuakPanela.setDatuak(h);
	}

}
