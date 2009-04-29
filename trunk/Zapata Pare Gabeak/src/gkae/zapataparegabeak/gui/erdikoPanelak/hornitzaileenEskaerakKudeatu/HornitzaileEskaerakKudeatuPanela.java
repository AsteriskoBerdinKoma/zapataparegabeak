package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu.HornitzaileEskaeraDatuakPanela;
import javax.swing.border.TitledBorder;

public class HornitzaileEskaerakKudeatuPanela extends JPanel {

	private JList list;
	/**
	 * Create the panel
	 */
	public HornitzaileEskaerakKudeatuPanela() {
		super();

		list = new JList();
		list.setBorder(new TitledBorder(null, "Hornitzaileen Eskaerak", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		HornitzaileEskaeraDatuakPanela hornitzaileEskaeraDatuakPanela;
		hornitzaileEskaeraDatuakPanela = new HornitzaileEskaeraDatuakPanela();
		hornitzaileEskaeraDatuakPanela.setEditable(false);

		JButton editatuButton;
		editatuButton = new JButton();
		editatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				HEDatuakEditatu HEdatu = new HEDatuakEditatu();
				HEdatu.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				HEdatu.setVisible(true);
			}
		});
		editatuButton.setText("Editatu");

		JButton konfirmatuButton;
		konfirmatuButton = new JButton();
		konfirmatuButton.setText("Konfirmatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGap(15, 15, 15)
					.addComponent(hornitzaileEskaeraDatuakPanela, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(editatuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(konfirmatuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addComponent(list, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(hornitzaileEskaeraDatuakPanela, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19, 19, 19)
							.addComponent(editatuButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(konfirmatuButton)))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
