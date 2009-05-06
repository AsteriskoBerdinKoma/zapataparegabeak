package gkae.zapataparegabeak.gui.menuPanelak;

import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Kudeaketa;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.JXHyperlink;

public class LoginPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPasswordField passPassField;
	private JTextField erabTextField;
	JLabel kaixoLabel;
	JXHyperlink datuakAldatuHyperlink;
	JXHyperlink saioaAmaituHyperlink;

	/**
	 * Create the panel
	 */
	public LoginPanela() {
		super();
		setBorder(new TitledBorder(null, "Kautotze Menua", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
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
				for (ErabiltzaileInfo ei: Kudeaketa.getInstance().getErabiltzaileak()){
					if(erabTextField.getText().trim().equals(ei.getErabIzena()) &&
					  passPassField.getPassword().equals(ei.getPasahitza())){
						ei.setKautotutaDago(true);
						kaixoLabel.setText("Kaixo, "+erabTextField.getText());
						if(ei.isAdmin()){
							datuakAldatuHyperlink.setVisible(false);
							kartaAldatu("kautotutaPanela");
							//MENU NAGUSIA ALDATU ADMINISTRAZIOKO ZATIA IKUSTEKO
							
						}
						break;
					} else {
						JOptionPane jop = new JOptionPane(
		                        "Erabiltzaile edo pasahitz okerra eman duzu.\nSaiatu berriz.",
		                        JOptionPane.ERROR_MESSAGE);
						jop.createDialog("Kautotzean arazoa")
		                        .setVisible(true);
						erabTextField.setText("");
						passPassField.setText("");
					}
				}
			}
		});
		kautotuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		kautotuButton.setText("Kautotu");
		azpiPanela.add(kautotuButton);

		final JXHyperlink izenaEmanHyperlink = new JXHyperlink();
		izenaEmanHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				//Erdiko panelean aldaketa gauzatu
				
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
		final GroupLayout groupLayout = new GroupLayout((JComponent) kautotzePanela);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(azpiPanela, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(pasahitzaLabel, GroupLayout.Alignment.TRAILING)
								.addComponent(erabiltzaileaLabel, GroupLayout.Alignment.TRAILING))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(passPassField, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
								.addComponent(erabTextField, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erabiltzaileaLabel)
						.addComponent(erabTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pasahitzaLabel)
						.addComponent(passPassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(azpiPanela, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
		);
		kautotzePanela.setLayout(groupLayout);

		final JPanel kautotutaPanela = new JPanel();
		kautotutaPanela.setName("kautotutaPanela");
		add(kautotutaPanela, kautotutaPanela.getName());
		
		
		datuakAldatuHyperlink = new JXHyperlink();
		datuakAldatuHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Datuak aldatu panelera joan
			}
		});
		datuakAldatuHyperlink.setText("Datuak Aldatu");

		
		saioaAmaituHyperlink = new JXHyperlink();
		saioaAmaituHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				for (ErabiltzaileInfo ei : Kudeaketa.getInstance()
						.getErabiltzaileak()) {
					if (ei.isKautotutaDago()) {
						ei.setKautotutaDago(false);
					}
				}
				// Kautotze leihora itzuli

			}
		});
		saioaAmaituHyperlink.setText("Saioa Amaitu");

		
		kaixoLabel = new JLabel();
		kaixoLabel.setText("Kaixo, Ezezagun");
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) this);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(kaixoLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(12, 12, 12)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(saioaAmaituHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(datuakAldatuHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(386, Short.MAX_VALUE))
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(11, 11, 11)
					.addComponent(kaixoLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(datuakAldatuHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(saioaAmaituHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(278, Short.MAX_VALUE))
		);
		kautotutaPanela.setLayout(groupLayout_1);
		//
	}
	
	public void kartaAldatu(String destination){
		CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, destination);
	}

}
