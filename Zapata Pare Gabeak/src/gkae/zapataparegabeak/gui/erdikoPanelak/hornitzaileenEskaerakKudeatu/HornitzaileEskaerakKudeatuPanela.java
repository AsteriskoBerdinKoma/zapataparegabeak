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
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu.HornitzaileEskaeraDatuakPanela;
import gkae.zapataparegabeak.objektuak.HornitzaileEskaera;
import gkae.zapataparegabeak.objektuak.HornitzaileEskaeraZerrenda;
import gkae.zapataparegabeak.objektuak.HornitzaileZerrenda;
import gkae.zapataparegabeak.objektuak.Hornitzailea;

import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.swtdesigner.SwingResourceManager;

public class HornitzaileEskaerakKudeatuPanela extends JPanel {

	private HornitzaileEskaeraDatuakPanela hornitzaileEskaeraDatuakPanela;
	private DefaultListModel listModel;
	private JList list;

	/**
	 * Create the panel
	 */
	public HornitzaileEskaerakKudeatuPanela() {
		super();
		setAutoscrolls(true);
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent e) {
				HornitzaileEskaera h = (HornitzaileEskaera) list
						.getSelectedValue();

				hornitzaileEskaeraDatuakPanela.setDatuak(h);
				list.repaint();
			}
		});

		list.setBorder(new TitledBorder(null, "Hornitzaileen Eskaerak",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));

		hornitzaileEskaeraDatuakPanela = new HornitzaileEskaeraDatuakPanela();
		hornitzaileEskaeraDatuakPanela.setEditable(false);

		zerrendaKargatu();
		JButton editatuButton;
		editatuButton = new JButton();
		editatuButton.setHorizontalAlignment(SwingConstants.LEFT);
		editatuButton.setIcon(SwingResourceManager.getIcon(
				HornitzaileEskaerakKudeatuPanela.class,
				"/gkae/zapataparegabeak/resources/ikonoak/edit_item24.png"));
		editatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				HornitzaileEskaera h = (HornitzaileEskaera) list.getSelectedValue();
				if (h != null) {
					HEDatuakEditatu HEdatu = new HEDatuakEditatu();
					HEdatu.setLocationRelativeTo(null);
					HEdatu.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					HEdatu.setDatuak(h);
					HEdatu.setVisible(true);
				}
			}
		});
		editatuButton.setText("Editatu");

		JButton konfirmatuButton;
		konfirmatuButton = new JButton();
		konfirmatuButton.setHorizontalAlignment(SwingConstants.LEFT);
		konfirmatuButton.setIcon(SwingResourceManager.getIcon(
				HornitzaileEskaerakKudeatuPanela.class,
				"/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		konfirmatuButton.setText("Konfirmatu");

		JSeparator separator;
		separator = new JSeparator();

		JLabel eskaerenHistorikoaLabel;
		eskaerenHistorikoaLabel = new JLabel();
		eskaerenHistorikoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		eskaerenHistorikoaLabel.setText("Hornitzaileen Eskaerak Kudeatu");

		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												separator,
																												GroupLayout.DEFAULT_SIZE,
																												542,
																												Short.MAX_VALUE)
																										.addGap(
																												12,
																												12,
																												12))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												list,
																												GroupLayout.PREFERRED_SIZE,
																												148,
																												GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												hornitzaileEskaeraDatuakPanela,
																												GroupLayout.DEFAULT_SIZE,
																												269,
																												Short.MAX_VALUE)
																										.addPreferredGap(
																												LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																editatuButton,
																																GroupLayout.PREFERRED_SIZE,
																																109,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																konfirmatuButton,
																																GroupLayout.PREFERRED_SIZE,
																																125,
																																GroupLayout.PREFERRED_SIZE))))
																		.addGap(
																				11,
																				11,
																				11))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				eskaerenHistorikoaLabel,
																				GroupLayout.PREFERRED_SIZE,
																				266,
																				GroupLayout.PREFERRED_SIZE)
																		.addContainerGap(
																				299,
																				Short.MAX_VALUE)))));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(eskaerenHistorikoaLabel,
												GroupLayout.PREFERRED_SIZE, 24,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(separator,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(
																				23,
																				23,
																				23)
																		.addComponent(
																				editatuButton)
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				konfirmatuButton))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(
																				15,
																				15,
																				15)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								list,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								hornitzaileEskaeraDatuakPanela,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))))
										.addContainerGap(17, Short.MAX_VALUE)));
		groupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { editatuButton, konfirmatuButton });
		groupLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { editatuButton, konfirmatuButton });

		setLayout(groupLayout);
		//
	}

	private void zerrendaKargatu() {
		listModel.removeAllElements();
		Vector<HornitzaileEskaera> heZerrenda = HornitzaileEskaeraZerrenda
				.getInstance().getZerrenda();
		for (HornitzaileEskaera h : heZerrenda)
			listModel.addElement(h);
		if (list.getModel().getSize() > 0) {
			list.setSelectedIndex(0);
		}

	}

}
