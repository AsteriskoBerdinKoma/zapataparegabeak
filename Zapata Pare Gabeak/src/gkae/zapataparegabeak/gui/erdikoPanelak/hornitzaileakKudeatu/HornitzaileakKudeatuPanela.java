package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileakKudeatu;

import java.awt.Font;
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
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.swtdesigner.SwingResourceManager;

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
		editatuButton.setHorizontalAlignment(SwingConstants.LEFT);
		editatuButton.setIcon(SwingResourceManager.getIcon(HornitzaileakKudeatuPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/edit_item24.png"));
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
					dE.setLocationRelativeTo(null);
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
		berriaGehituButton.setHorizontalAlignment(SwingConstants.LEFT);
		berriaGehituButton.setIcon(SwingResourceManager.getIcon(HornitzaileakKudeatuPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/add_item24.png"));
		berriaGehituButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Hornitzailea h = new Hornitzailea(HornitzaileZerrenda
						.getInstance().getZerrenda().lastElement().getId() + 1);
				// h.setIzena("  ");
				HornitzaileZerrenda.getInstance().hornitzaileaGehitu(h);
				// zerrendaKargatu();
				DatuakEditatu dE = new DatuakEditatu();
				dE.setDatuak(h);
				dE.setLocationRelativeTo(null);
				dE.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dE.setVisible(true);
				dE.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosed(WindowEvent e) {
						// TODO Auto-generated method stub
						super.windowClosed(e);
						// list.repaint();
						zerrendaKargatu();
					}
				});
				// list.repaint();
			}
		});
		berriaGehituButton.setText("Berria Gehitu");

		hornitzaileDatuak = new HornitzaileDatuakPanela();
		hornitzaileDatuak.setEditable(false);
		//
		zerrendaKargatu();

		JButton ezabatuButton;
		ezabatuButton = new JButton();
		ezabatuButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		ezabatuButton.setIcon(SwingResourceManager.getIcon(HornitzaileakKudeatuPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
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

		JSeparator separator;
		separator = new JSeparator();

		JLabel eskaerenHistorikoaLabel;
		eskaerenHistorikoaLabel = new JLabel();
		eskaerenHistorikoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		eskaerenHistorikoaLabel.setText("Hornitzaileak Kudeatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12, 12, 12)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(hornitzaileDatuak, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(editatuButton)
								.addComponent(ezabatuButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addComponent(berriaGehituButton)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
							.addGap(13, 13, 13)))
					.addGap(9, 9, 9))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(13, 13, 13)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(hornitzaileDatuak, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(list, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
									.addGap(12, 12, 12))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21, 21, 21)
							.addComponent(editatuButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(berriaGehituButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(ezabatuButton)
							.addContainerGap())))
		);
		groupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {berriaGehituButton, editatuButton, ezabatuButton});
		groupLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {berriaGehituButton, editatuButton, ezabatuButton});
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
