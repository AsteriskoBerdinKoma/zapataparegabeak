package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileakKudeatu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
	// private boolean eguneratu;
	private DefaultListModel listModel;
	private HornitzaileDatuakPanela hornitzaileDatuak;
	private JList list;

	/**
	 * Create the panel
	 */

	public HornitzaileakKudeatuPanela() {
		super();
		setAutoscrolls(true);
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent arg0) {
				Hornitzailea h = (Hornitzailea) list.getSelectedValue();

				hornitzaileDatuak.setDatuak(h);
				list.repaint();
			}
		});
		list.setBorder(new TitledBorder(null, "Hornitzaile zerrenda",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));

		JButton editatuButton;
		editatuButton = new JButton();
		editatuButton.addFocusListener(new FocusAdapter() {
			public void focusGained(final FocusEvent e) {
				// if(eguneratu){

				list.repaint();
				
				Hornitzailea h = (Hornitzailea) list.getSelectedValue();
				// if(h != null)
				hornitzaileDatuak.setDatuak(h);
				// }
			}
		});
		editatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// eguneratu = false;
				Hornitzailea h = (Hornitzailea) list.getSelectedValue();

				if (h != null) {
					DatuakEditatu dE = new DatuakEditatu();
					dE.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dE.setDatuak(h);
					dE.setVisible(true);
					// eguneratu = true;
				}

			}
		});
		editatuButton.setText("Editatu");

		JButton berriaGehituButton;
		berriaGehituButton = new JButton();
		berriaGehituButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Hornitzailea h = new Hornitzailea(HornitzaileZerrenda.getInstance().getZerrenda().lastElement().getId()+1);
				//h.setIzena("  ");
				HornitzaileZerrenda.getInstance().hornitzaileaGehitu(h);
				//zerrendaKargatu();
				DatuakEditatu dE = new DatuakEditatu();
				dE.setDatuak(h);
				dE.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dE.setVisible(true);
				dE.addWindowListener(new WindowAdapter(){
					@Override
					public void windowClosed(WindowEvent e) {
						// TODO Auto-generated method stub
						super.windowClosed(e);
						//list.repaint();
						zerrendaKargatu();
					}
				});
				//list.repaint();
			}
		});
		berriaGehituButton.setText("Berria Gehitu");

		hornitzaileDatuak = new HornitzaileDatuakPanela();
		hornitzaileDatuak.setEditable(false);
		//
		zerrendaKargatu();

		JButton ezabatuButton;
		ezabatuButton = new JButton();
		ezabatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Hornitzailea h = (Hornitzailea) list.getSelectedValue();

				if (h != null) {
					HornitzaileZerrenda.getInstance().hornitzaileaEzabatu(h);
					zerrendaKargatu();
				}

			}
		});
		ezabatuButton.setText("Ezabatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(list,
												GroupLayout.PREFERRED_SIZE,
												125, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(hornitzaileDatuak,
												GroupLayout.DEFAULT_SIZE, 226,
												Short.MAX_VALUE)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																editatuButton,
																GroupLayout.Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																berriaGehituButton,
																GroupLayout.Alignment.TRAILING)
														.addComponent(
																ezabatuButton,
																GroupLayout.PREFERRED_SIZE,
																95,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								GroupLayout.Alignment.LEADING)
																						.addComponent(
																								list,
																								GroupLayout.DEFAULT_SIZE,
																								199,
																								Short.MAX_VALUE)
																						.addComponent(
																								hornitzaileDatuak,
																								GroupLayout.DEFAULT_SIZE,
																								199,
																								Short.MAX_VALUE)))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(
																				19,
																				19,
																				19)
																		.addComponent(
																				editatuButton)
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				berriaGehituButton)
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				ezabatuButton)))
										.addContainerGap()));
		setLayout(groupLayout);
	}

	private void zerrendaKargatu() {
		listModel.removeAllElements();
		Vector<Hornitzailea> hZerrenda = HornitzaileZerrenda.getInstance()
				.getZerrenda();
		for (Hornitzailea h : hZerrenda)
			listModel.addElement(h);
		if (list.getModel().getSize() > 0) {
			list.setSelectedIndex(0);
		}

	}
}
