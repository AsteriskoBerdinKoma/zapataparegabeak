package gkae.zapataparegabeak.gui.menuPanelak;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Erabiltzaileak;
import gkae.zapataparegabeak.objektuak.Kudeaketa;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import org.jdesktop.swingx.JXHyperlink;

public class LoginPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPasswordField passPassField;
	private JTextField erabTextField;

	private JLabel kaixoEzezagunLabel;
	private JXHyperlink zureDatuakAldatuHyperlink;
	private JXHyperlink saioaItxiHyperlink;
	
	private	final JTextPane erabiltzaileIzenaEdoTextPane;

	//Nagusiaren erreferentzia pantailaz aldatzeko
	private NagusiaPanel owner;
	
	/**
	 * Create the panel
	 */
	public LoginPanela(NagusiaPanel nagusiaPanel) {
		super();
		this.owner = nagusiaPanel;
		
		setBorder(new TitledBorder(null, "Kautotze Menua",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		setLayout(new CardLayout());

		final JPanel kautotzePanela = new JPanel();
		kautotzePanela.setName("kautotzePanela");
		add(kautotzePanela, kautotzePanela.getName());

		JPanel azpiPanela;
		azpiPanela = new JPanel();
		azpiPanela.setLayout(new BoxLayout(azpiPanela, BoxLayout.Y_AXIS));

		final JButton kautotuButton = new JButton();
		kautotuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				boolean kautotuta = false;
				Vector<ErabiltzaileInfo> erab = Erabiltzaileak.getInstance()
						.getErabZerrenda();
				for (ErabiltzaileInfo ei : erab) {
					if (erabTextField.getText().equals(ei.getErabIzena()) && 
						new String(passPassField.getPassword()).equals(ei.getPasahitza())) {
						ei.setKautotutaDago(true);
						kautotuta = true;
						kaixoEzezagunLabel.setText("Kaixo, "+ erabTextField.getText());
						if (ei.isAdmin()) {
							zureDatuakAldatuHyperlink.setVisible(false);
							
							// MENU NAGUSIA ALDATU ADMINISTRAZIOKO ZATIA
							// IKUSTEKO
							owner.ikusiAdminMenua();
						} else {
							// MENU NAGUSIA ALDATU ERAB. EZAGUN ZATIA IKUSTEKO
							zureDatuakAldatuHyperlink.setVisible(true);
							owner.ikusiErabiltzaileEzagunMenua();
						}
						kartaAldatu("kautotutaPanela");
						break;
					}
				}
				if (!kautotuta) {
//					JOptionPane jop = new JOptionPane(
//							"Erabiltzaile edo pasahitz okerra eman duzu.\nSaiatu berriz.",
//							JOptionPane.ERROR_MESSAGE);
//					jop.createDialog("Kautotzean arazoa").setVisible(true);
					erabiltzaileIzenaEdoTextPane.setVisible(true);
					erabTextField.setText("");
					passPassField.setText("");
				} else
					erabiltzaileIzenaEdoTextPane.setVisible(false);

			}
		});
		kautotuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		kautotuButton.setText("Kautotu");
		azpiPanela.add(kautotuButton);

		final JXHyperlink izenaEmanHyperlink = new JXHyperlink();
		izenaEmanHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				owner.ikusiIzenaEmanPanela();
			}
		});

		izenaEmanHyperlink.setAlignmentX(Component.CENTER_ALIGNMENT);
		izenaEmanHyperlink.setText("Izena Eman");
		azpiPanela.add(izenaEmanHyperlink);

		JLabel erabiltzaileaLabel;
		erabiltzaileaLabel = new JLabel();
		erabiltzaileaLabel.setText("Erabiltzailea:");

		JLabel pasahitzaLabel;
		pasahitzaLabel = new JLabel();
		pasahitzaLabel.setText("Pasahitza:");

		erabTextField = new JTextField();

		passPassField = new JPasswordField();

		JPanel panel;
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		erabiltzaileIzenaEdoTextPane = new JTextPane();
		erabiltzaileIzenaEdoTextPane.setEditable(false);
		erabiltzaileIzenaEdoTextPane.setOpaque(false);
		erabiltzaileIzenaEdoTextPane.setText("Erabiltzaile izena edo pasahitza ez da zuzena");
		erabiltzaileIzenaEdoTextPane.setForeground(new Color(255, 0, 0));
		erabiltzaileIzenaEdoTextPane.setFont(new Font("", Font.BOLD, 12));
		erabiltzaileIzenaEdoTextPane.setVisible(false);
		panel.add(erabiltzaileIzenaEdoTextPane);
		
		StyledDocument doc = erabiltzaileIzenaEdoTextPane.getStyledDocument();
		MutableAttributeSet standard = new SimpleAttributeSet();
		StyleConstants.setAlignment(standard, StyleConstants.ALIGN_CENTER);
		StyleConstants.setForeground(standard, new Color(255, 0, 0));
		StyleConstants.setFontSize(standard, 12);
		StyleConstants.setBold(standard, true);
		StyleConstants.setFontFamily(standard, "");
		doc.setParagraphAttributes(0, 0, standard, true);

		
		final GroupLayout groupLayout = new GroupLayout(
				(JComponent) kautotzePanela);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(panel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(azpiPanela, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(pasahitzaLabel, GroupLayout.Alignment.TRAILING)
								.addComponent(erabiltzaileaLabel, GroupLayout.Alignment.TRAILING))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(passPassField, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
								.addComponent(erabTextField, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erabiltzaileaLabel)
						.addComponent(erabTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pasahitzaLabel)
						.addComponent(passPassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(azpiPanela, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		kautotzePanela.setLayout(groupLayout);

		final JPanel kautotutaPanel = new JPanel();
		kautotutaPanel.setName("kautotutaPanela");
		add(kautotutaPanel, kautotutaPanel.getName());

		kaixoEzezagunLabel = new JLabel();
		kaixoEzezagunLabel.setText("Kaixo, Ezezagun");

		zureDatuakAldatuHyperlink = new JXHyperlink();
		zureDatuakAldatuHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.ikusiErabDatuakAldatuPanela();
			}
		});
		zureDatuakAldatuHyperlink.setText("� Zure Datuak Aldatu");

		saioaItxiHyperlink = new JXHyperlink();
		saioaItxiHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				kartaAldatu("kautotzePanela");
				for (ErabiltzaileInfo ei : Kudeaketa.getInstance()
						.getErabiltzaileak()) {
					if (ei.isKautotutaDago())
						ei.setKautotutaDago(false);
				}
				erabTextField.setText("");
				passPassField.setText("");
				//Menu nagusia aldatu
				owner.ikusiKatalogoaPanela();
				owner.ikusiErabiltzaileEzezagunMenua();
			}
		});
		saioaItxiHyperlink.setText("� Saioa Itxi");
		final GroupLayout groupLayout_1 = new GroupLayout(
				(JComponent) kautotutaPanel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(kaixoEzezagunLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(12, 12, 12)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(saioaItxiHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(zureDatuakAldatuHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(kaixoEzezagunLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(zureDatuakAldatuHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(saioaItxiHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		kautotutaPanel.setLayout(groupLayout_1);
		//
	}

	public void kartaAldatu(String destination) {
		CardLayout cl = (CardLayout) (this.getLayout());
		cl.show(this, destination);
	}

}
