package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileakKudeatu;

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
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileakKudeatu.HornitzaileDatuakPanela;
import gkae.zapataparegabeak.objektuak.HornitzaileZerrenda;
import gkae.zapataparegabeak.objektuak.Hornitzailea;

public class HornitzaileakKudeatuPanela extends JPanel {


	private HornitzaileDatuakPanela hornitzaileDatuak;
	private JList list;
	/**
	 * Create the panel
	 */
	
	public HornitzaileakKudeatuPanela() {
		super();
		setAutoscrolls(true);
		DefaultListModel listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent arg0) {
				Hornitzailea h = (Hornitzailea) list.getSelectedValue();
				hornitzaileDatuak.setDatuak(h);
			}
		});
		list.setBorder(new TitledBorder(null, "Hornitzaile zerrenda", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		Vector<Hornitzailea> hZerrenda = HornitzaileZerrenda.getInstance().getZerrenda();
		for(Hornitzailea h: hZerrenda)
			listModel.addElement(h);
		

		JButton editatuButton;
		editatuButton = new JButton();
		editatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				DatuakEditatu dE = new DatuakEditatu();
				dE.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dE.setDatuak((Hornitzailea) list.getSelectedValue());
				dE.setVisible(true);
			}
		});
		editatuButton.setText("Editatu");

		JButton berriaGehituButton;
		berriaGehituButton = new JButton();
		berriaGehituButton.setText("Berria Gehitu");

		

		
		hornitzaileDatuak = new HornitzaileDatuakPanela();
		hornitzaileDatuak.setEditable(false);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(hornitzaileDatuak, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addComponent(editatuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(berriaGehituButton))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(list, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
								.addComponent(hornitzaileDatuak, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19, 19, 19)
							.addComponent(editatuButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(berriaGehituButton)))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
