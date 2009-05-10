package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Erabiltzaileak;
import gkae.zapataparegabeak.objektuak.ProzesatzekoEskaera;
import gkae.zapataparegabeak.objektuak.ProzesatzekoEskaeraLista;

import java.awt.Font;
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
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
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
		bezeroenEskaerenListaLabel.setFont(new Font("", Font.PLAIN, 18));
		bezeroenEskaerenListaLabel.setText("Bezeroen Eskaerak Kudeatu");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Bezeroen Eskaeren Lista", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		
		
		kodea = new JLabel();
		kodea.setText("ko");
		erabiltzailea = new JLabel();
		erabiltzailea.setText("era");
		deskribapena = new JLabel();	
		deskribapena.setText("des");
		zenbatekoa = new JLabel();		
		zenbatekoa.setText("zen");
		eskuz = new JLabel();		
		eskuz.setText("es");
		txartelez = new JLabel();
		txartelez.setText("txar");
	
		
		
		
		
		listModel = new DefaultListModel();
		list_1 = new JList(listModel);
		list_1.setBorder(new TitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
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
		
		zerrendaKargatu();

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

		JLabel hemenBezeroenEskaerakLabel;
		hemenBezeroenEskaerakLabel = new JLabel();
		hemenBezeroenEskaerakLabel.setFont(new Font("", Font.ITALIC, 12));
		hemenBezeroenEskaerakLabel.setText("Bezeroen eskaerak prozesatu edo prozesaturiko eskaeren albaranak ikusi");

	
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(kodeaLabel)
											.addGap(40, 40, 40)
											.addComponent(kodea))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(erabiltzaileaLabel)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(erabiltzailea))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txartelezkoOrdainketaLabel)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(txartelez, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(eskuzkoOrdainketaLabel)
											.addGap(21, 21, 21)
											.addComponent(eskuz, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(deskribapenaLabel)
												.addComponent(zenbatekoaLabel))
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(zenbatekoa)
												.addComponent(deskribapena)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(40, 40, 40)
											.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(txartelBidezkoProzesamenduaButton, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
												.addComponent(eskuzkoProzesamenduaButton, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))))
									.addGap(38, 38, 38))
								.addComponent(bezeroenEskaerenListaLabel))
							.addGap(53, 53, 53))
						.addComponent(hemenBezeroenEskaerakLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(prozesatutakoEskaerenAlbaranakButton)
							.addContainerGap(444, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroenEskaerenListaLabel)
					.addGap(6, 6, 6)
					.addComponent(hemenBezeroenEskaerakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(prozesatutakoEskaerenAlbaranakButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
							.addComponent(kodeaLabel)
							.addComponent(kodea))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53, 53, 53)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(erabiltzaileaLabel)
								.addComponent(erabiltzailea))
							.addGap(16, 16, 16)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(deskribapenaLabel)
								.addComponent(deskribapena))
							.addGap(18, 18, 18)
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
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(eskuzkoProzesamenduaButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(txartelBidezkoProzesamenduaButton)))
					.addContainerGap())
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
