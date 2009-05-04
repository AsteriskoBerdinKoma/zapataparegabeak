package gkae.zapataparegabeak.gui.menuPanelak;

import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Kudeaketa;

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
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.JXHyperlink;

public class LoginPanela extends JPanel {

	private JPasswordField passPassField;
	private JTextField erabTextField;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel
	 */
	public LoginPanela() {
		super();
		setBorder(new TitledBorder(null, "Kautotu", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JPanel panel;
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		final JButton kautotuButton = new JButton();
		kautotuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				for (ErabiltzaileInfo ei: Kudeaketa.getInstance().getErabiltzaileak()){
					if(erabTextField.getText().trim().equals(ei.getErabIzena()) &&
					  passPassField.getPassword().equals(ei.getPasahitza())){
						ei.setKautotutaDago(true);
						break;
					} else {
						JOptionPane jop = new JOptionPane(
		                        "Erabiltzaile edo pasahitz okerra eman duzu.\nSaiatu berriz.",
		                        JOptionPane.ERROR_MESSAGE);
						jop.createDialog("Kautotzean arazoa")
		                        .setVisible(true); 
					}
				}
				erabTextField.getText();
			}
		});
		kautotuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		kautotuButton.setText("Kautotu");
		panel.add(kautotuButton);

		final JXHyperlink izenaEmanHyperlink = new JXHyperlink();
		
		izenaEmanHyperlink.setAlignmentX(Component.CENTER_ALIGNMENT);
		izenaEmanHyperlink.setText("Izena Eman");
		panel.add(izenaEmanHyperlink);

		JLabel erabiltzaileaLabel;
		erabiltzaileaLabel = new JLabel();
		erabiltzaileaLabel.setText("Erabiltzailea:");

		JLabel pasahitzaLabel;
		pasahitzaLabel = new JLabel();
		pasahitzaLabel.setText("Pasahitza:");

		erabTextField = new JTextField();

		passPassField = new JPasswordField();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(panel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
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
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
