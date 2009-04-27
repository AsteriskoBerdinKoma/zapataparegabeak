package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.JXHyperlink;

public class LoginPanela extends JPanel {

	private JPasswordField passwordField;
	private JTextField textField;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SpringLayout springLayout;
	/**
	 * Create the panel
	 */
	public LoginPanela() {
		super();
		springLayout = new SpringLayout();
		setLayout(springLayout);
		setBorder(new TitledBorder(null, "Kautotu", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		final JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		add(panel);
		springLayout.putConstraint(SpringLayout.EAST, panel, -5, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -5, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 55, SpringLayout.NORTH, this);

		final JButton kautotuButton = new JButton();
		kautotuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		kautotuButton.setText("Kautotu");
		panel.add(kautotuButton);

		final JXHyperlink izenaEmanHyperlink = new JXHyperlink();
		izenaEmanHyperlink.setAlignmentX(Component.CENTER_ALIGNMENT);
		izenaEmanHyperlink.setText("Izena eman");
		panel.add(izenaEmanHyperlink);

		final JLabel erabiltzaileIzenaLabel = new JLabel();
		erabiltzaileIzenaLabel.setText("Erabiltzaile izena:");
		add(erabiltzaileIzenaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, erabiltzaileIzenaLabel, 20, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, erabiltzaileIzenaLabel, 4, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, erabiltzaileIzenaLabel, 95, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, erabiltzaileIzenaLabel, 7, SpringLayout.WEST, this);

		final JLabel pasahitzaLabel = new JLabel();
		pasahitzaLabel.setText("Pasahitza:");
		add(pasahitzaLabel);
		springLayout.putConstraint(SpringLayout.EAST, pasahitzaLabel, 94, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, pasahitzaLabel, 40, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, pasahitzaLabel, 45, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, pasahitzaLabel, 29, SpringLayout.NORTH, this);

		textField = new JTextField();
		add(textField);
		springLayout.putConstraint(SpringLayout.EAST, textField, -5, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.EAST, erabiltzaileIzenaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, 24, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 4, SpringLayout.NORTH, this);

		passwordField = new JPasswordField();
		add(passwordField);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -5, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.EAST, erabiltzaileIzenaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, 47, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 27, SpringLayout.NORTH, this);
		//
	}

}
