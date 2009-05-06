package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu.HornitzaileEskaeraDatuakPanela;
import gkae.zapataparegabeak.objektuak.HornitzaileEskaera;
import gkae.zapataparegabeak.objektuak.HornitzaileEskaeraZerrenda;
import gkae.zapataparegabeak.objektuak.HornitzaileZerrenda;
import gkae.zapataparegabeak.objektuak.Hornitzailea;

import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class HornitzaileEskaerakKudeatuPanela extends JPanel {

	private HornitzaileEskaeraDatuakPanela HEDatuak;
	private DefaultListModel listModel;
	private JList list;
	/**
	 * Create the panel
	 */
	public HornitzaileEskaerakKudeatuPanela() {
		super();
		listModel = new DefaultListModel();
		list = new JList();

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent e) {
				HornitzaileEskaera h = (HornitzaileEskaera) list.getSelectedValue();
				
				HEDatuak.setDatuak(h);
				list.repaint();
			}
		});
		
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

		JSeparator separator;
		separator = new JSeparator();

		JLabel eskaerenHistorikoaLabel;
		eskaerenHistorikoaLabel = new JLabel();
		eskaerenHistorikoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		eskaerenHistorikoaLabel.setText("Hornitzaileen Eskaerak Kudeatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
							.addGap(12, 12, 12))
						.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(hornitzaileEskaeraDatuakPanela, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(editatuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(konfirmatuButton))))
					.addGap(11, 11, 11))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23, 23, 23)
							.addComponent(editatuButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(konfirmatuButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(15, 15, 15)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(list, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(hornitzaileEskaeraDatuakPanela, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		
		setLayout(groupLayout);
		//
	}
	private void zerrendaKargatu() {
		listModel.removeAllElements();
		Vector<HornitzaileEskaera> heZerrenda = HornitzaileEskaeraZerrenda.getInstance()
				.getZerrenda();
		for (HornitzaileEskaera h : heZerrenda)
			listModel.addElement(h);
		if (list.getModel().getSize() > 0) {
			list.setSelectedIndex(0);
		}

	}

}
