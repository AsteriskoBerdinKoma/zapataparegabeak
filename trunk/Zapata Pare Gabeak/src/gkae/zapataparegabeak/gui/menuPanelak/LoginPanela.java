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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
	private SpringLayout springLayout;
	/**
	 * Create the panel
	 */
	public LoginPanela() {
		super();
		springLayout = new SpringLayout();
		setLayout(springLayout);
		setBorder(new TitledBorder(null, "Kautotu", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		final JLabel pasahitzaLabel = new JLabel();
		pasahitzaLabel.setText("Pasahitza:");
		add(pasahitzaLabel);
		springLayout.putConstraint(SpringLayout.EAST, pasahitzaLabel, 75, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, pasahitzaLabel, 6, SpringLayout.WEST, this);

		textField = new JTextField();
		add(textField);
		springLayout.putConstraint(SpringLayout.SOUTH, pasahitzaLabel, 24, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.NORTH, pasahitzaLabel, 5, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField, -5, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.EAST, pasahitzaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, 31, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 5, SpringLayout.NORTH, this);

		final JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		add(panel);
		springLayout.putConstraint(SpringLayout.EAST, panel, -5, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -5, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 70, SpringLayout.NORTH, this);

		final JButton kautotuButton = new JButton();
		kautotuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		kautotuButton.setText("Kautotu");
		panel.add(kautotuButton);

		final JXHyperlink izenaEmanHyperlink = new JXHyperlink();
		izenaEmanHyperlink.setAlignmentX(Component.CENTER_ALIGNMENT);
		izenaEmanHyperlink.setText("Izena eman");
		panel.add(izenaEmanHyperlink);

		passwordField = new JPasswordField();
		add(passwordField);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.EAST, pasahitzaLabel);
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 0, SpringLayout.NORTH, pasahitzaLabel);

		final JLabel izenaLabel = new JLabel();
		izenaLabel.setText("Izena:");
		add(izenaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, izenaLabel, 25, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, izenaLabel, -5, SpringLayout.WEST, textField);
		//
	}

}
