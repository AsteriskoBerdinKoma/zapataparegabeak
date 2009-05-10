package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Erabiltzaileak;
import gkae.zapataparegabeak.objektuak.ProzesatzekoEskaera;
import gkae.zapataparegabeak.objektuak.ProzesatzekoEskaeraLista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class BezeroekEgindakoEskaerenLista extends JPanel {

	private JList list_1;
	private DefaultListModel listModel;
	private BezeroenEskaerakPanel owner;
	
	JLabel kodea;
	JLabel erabiltzailea;
	JLabel deskribapena;
	JLabel zenbatekoa;
	JLabel eskuz;
	JLabel txartelez;
	
	/**
	 * Create the panel
	 */
	public BezeroekEgindakoEskaerenLista(BezeroenEskaerakPanel bezeroenEskaerakPanel) {
		super();

		owner = bezeroenEskaerakPanel;
		
		JLabel bezeroenEskaerenListaLabel;
		bezeroenEskaerenListaLabel = new JLabel();
		bezeroenEskaerenListaLabel.setText("Bezeroen Eskaerak Kudeatu");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();
		
		
		
		
		
		listModel = new DefaultListModel();
		list_1 = new JList(listModel);
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent arg0) {
				ProzesatzekoEskaera e = (ProzesatzekoEskaera) list_1.getSelectedValue();
				kodea.setText(e.getKodea());
				erabiltzailea.setText(e.getErabiltzaile());
				deskribapena.setText(e.getDeskribapena());
				zenbatekoa.setText(e.getZenbatekoa());
				eskuz.setText(e.getEskuzordaindu());
				txartelez.setText(e.getTxartelbidez());
				list_1.repaint();
			}
		});
		scrollPane.setViewportView(list_1);

		JButton prozesatutakoEskaerenAlbaranakButton;
		prozesatutakoEskaerenAlbaranakButton = new JButton();
		prozesatutakoEskaerenAlbaranakButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				owner.changeCard("albaranenLista");
			}
		});
		prozesatutakoEskaerenAlbaranakButton.setText("Albaranak ikusi");
		
		//zerrendaKargatu();

		JButton eskuzkoProzesamenduaButton;
		eskuzkoProzesamenduaButton = new JButton();
		eskuzkoProzesamenduaButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("emailbidalizaio");
			}
		});
		eskuzkoProzesamenduaButton.setText("Eskuzko ordainketa bada: Onartu");

		JButton txartelBidezkoProzesamenduaButton;
		txartelBidezkoProzesamenduaButton = new JButton();
		txartelBidezkoProzesamenduaButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("datuKonprobaketa");
			}
		});
		
		
		txartelBidezkoProzesamenduaButton.setText("Txartelezko ordainketa bada: Prozesatu");

		JLabel kodeaLabel;
		kodeaLabel = new JLabel();
		kodeaLabel.setText("Kodea:");

		JLabel erabiltzaileaLabel;
		erabiltzaileaLabel = new JLabel();
		erabiltzaileaLabel.setText("Erabiltzailea:");

		JLabel deskribapenaLabel;
		deskribapenaLabel = new JLabel();
		deskribapenaLabel.setText("Deskribapena:");

		JLabel zenbatekoaLabel;
		zenbatekoaLabel = new JLabel();
		zenbatekoaLabel.setText("Zenbatekoa:");

		JLabel eskuzkoOrdainketaLabel;
		eskuzkoOrdainketaLabel = new JLabel();
		eskuzkoOrdainketaLabel.setText("Eskuzko ordainketa? :");

		JLabel txartelezkoOrdainketaLabel;
		txartelezkoOrdainketaLabel = new JLabel();
		txartelezkoOrdainketaLabel.setText("Txartelezko ordainketa?:");

		JLabel kodea;
		kodea = new JLabel();
		kodea.setText("New JLabel");

		JLabel erabiltzailea;
		erabiltzailea = new JLabel();
		erabiltzailea.setText("New JLabel");

		JLabel deskribapena;
		deskribapena = new JLabel();
		deskribapena.setText("New JLabel");

		JLabel zenbatekoa;
		zenbatekoa = new JLabel();
		zenbatekoa.setText("New Jlabel");

		JLabel eskuz;
		eskuz = new JLabel();
		eskuz.setText("New JLabel");

		JLabel txartelez;
		txartelez = new JLabel();
		txartelez.setText("New JLabel");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(45, 45, 45)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(erabiltzaileaLabel)
									.addGap(14, 14, 14)
									.addComponent(erabiltzailea))
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(txartelBidezkoProzesamenduaButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(eskuzkoProzesamenduaButton, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(deskribapenaLabel)
										.addComponent(zenbatekoaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(zenbatekoa)
										.addComponent(deskribapena)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(kodeaLabel)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(kodea))
											.addComponent(eskuzkoOrdainketaLabel, GroupLayout.Alignment.LEADING))
										.addComponent(txartelezkoOrdainketaLabel))
									.addGap(4, 4, 4)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(txartelez)
										.addComponent(eskuz)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bezeroenEskaerenListaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
							.addComponent(prozesatutakoEskaerenAlbaranakButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bezeroenEskaerenListaLabel)
							.addGap(38, 38, 38)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(prozesatutakoEskaerenAlbaranakButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(39, 39, 39)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(kodeaLabel)
								.addComponent(kodea))
							.addGap(16, 16, 16)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(erabiltzaileaLabel)
								.addComponent(erabiltzailea))
							.addGap(18, 18, 18)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(deskribapenaLabel)
								.addComponent(deskribapena))
							.addGap(15, 15, 15)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(zenbatekoaLabel)
								.addComponent(zenbatekoa))
							.addGap(15, 15, 15)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(eskuzkoOrdainketaLabel)
								.addComponent(eskuz))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(txartelezkoOrdainketaLabel)
								.addComponent(txartelez))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(eskuzkoProzesamenduaButton)
							.addGap(5, 5, 5)
							.addComponent(txartelBidezkoProzesamenduaButton)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}
	
	private void zerrendaKargatu() {
		listModel.removeAllElements();
		Vector<ProzesatzekoEskaera> eZerrenda = ProzesatzekoEskaeraLista.getInstance().getProzesatzekoEskaeraLista();
			
		for (ProzesatzekoEskaera e : eZerrenda)
			listModel.addElement(e);
		if (list_1.getModel().getSize() > 0) {
			list_1.setSelectedIndex(0);
		}
	}	

}
