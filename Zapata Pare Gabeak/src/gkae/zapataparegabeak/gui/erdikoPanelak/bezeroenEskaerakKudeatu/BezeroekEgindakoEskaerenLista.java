package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import gkae.zapataparegabeak.objektuak.ProzesatzekoEskaera;
import gkae.zapataparegabeak.objektuak.ProzesatzekoEskaeraLista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class BezeroekEgindakoEskaerenLista extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
		kodeaLabel.setFont(new Font("", Font.BOLD, 12));
		kodeaLabel.setText("Kodea:");

		JLabel erabiltzaileaLabel;
		erabiltzaileaLabel = new JLabel();
		erabiltzaileaLabel.setFont(new Font("", Font.BOLD, 12));
		erabiltzaileaLabel.setText("Erabiltzailea:");

		JLabel deskribapenaLabel;
		deskribapenaLabel = new JLabel();
		deskribapenaLabel.setFont(new Font("", Font.BOLD, 12));
		deskribapenaLabel.setText("Deskribapena:");

		JLabel zenbatekoaLabel;
		zenbatekoaLabel = new JLabel();
		zenbatekoaLabel.setFont(new Font("", Font.BOLD, 12));
		zenbatekoaLabel.setText("Zenbatekoa:");

		JLabel eskuzkoOrdainketaLabel;
		eskuzkoOrdainketaLabel = new JLabel();
		eskuzkoOrdainketaLabel.setFont(new Font("", Font.BOLD, 12));
		eskuzkoOrdainketaLabel.setText("Eskuzko ordainketa? :");

		JLabel txartelezkoOrdainketaLabel;
		txartelezkoOrdainketaLabel = new JLabel();
		txartelezkoOrdainketaLabel.setFont(new Font("", Font.BOLD, 12));
		txartelezkoOrdainketaLabel.setText("Txartelezko ordainketa?:");

		JLabel hemenBezeroenEskaerakLabel;
		hemenBezeroenEskaerakLabel = new JLabel();
		hemenBezeroenEskaerakLabel.setFont(new Font("", Font.ITALIC, 12));
		hemenBezeroenEskaerakLabel.setText("Bezeroen eskaerak prozesatu edo prozesaturiko eskaeren albaranak ikusi");

		JSeparator separator;
		separator = new JSeparator();

		JPanel panel;
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Eskaeraren informazioa", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) panel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(kodeaLabel)
						.addComponent(erabiltzaileaLabel)
						.addComponent(deskribapenaLabel)
						.addComponent(zenbatekoaLabel)
						.addComponent(eskuzkoOrdainketaLabel)
						.addComponent(txartelezkoOrdainketaLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(kodea)
						.addComponent(erabiltzailea)
						.addComponent(deskribapena)
						.addComponent(zenbatekoa)
						.addComponent(eskuz)
						.addComponent(txartelez))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(5, 5, 5)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(kodeaLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(1, 1, 1)
							.addComponent(kodea)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(erabiltzaileaLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(1, 1, 1)
							.addComponent(erabiltzailea)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(deskribapenaLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(1, 1, 1)
							.addComponent(deskribapena)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(zenbatekoaLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(1, 1, 1)
							.addComponent(zenbatekoa)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(eskuzkoOrdainketaLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(1, 1, 1)
							.addComponent(eskuz)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(txartelezkoOrdainketaLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(1, 1, 1)
							.addComponent(txartelez)))
					.addContainerGap(188, Short.MAX_VALUE))
		);
		panel.setLayout(groupLayout_1);

	
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(prozesatutakoEskaerenAlbaranakButton, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
								.addComponent(txartelBidezkoProzesamenduaButton, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(eskuzkoProzesamenduaButton, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))))
						.addComponent(bezeroenEskaerenListaLabel)
						.addComponent(hemenBezeroenEskaerakLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroenEskaerenListaLabel)
					.addGap(8, 8, 8)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(hemenBezeroenEskaerakLabel)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24, 24, 24)
							.addComponent(prozesatutakoEskaerenAlbaranakButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(eskuzkoProzesamenduaButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(txartelBidezkoProzesamenduaButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))))
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
