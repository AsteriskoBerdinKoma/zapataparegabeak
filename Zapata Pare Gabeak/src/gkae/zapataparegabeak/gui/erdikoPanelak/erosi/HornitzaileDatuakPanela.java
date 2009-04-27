package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class HornitzaileDatuakPanela extends JPanel {

	private JTextField textField;
	private SpringLayout springLayout;
	/**
	 * Create the panel
	 */
	public HornitzaileDatuakPanela() {
		super();
		springLayout = new SpringLayout();
		setLayout(springLayout);

		final JLabel label = new JLabel();
		label.setText("Izena");
		add(label);
		springLayout.putConstraint(SpringLayout.EAST, label, 35, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, label, 25, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, label, 9, SpringLayout.NORTH, this);

		textField = new JTextField();
		add(textField);
		springLayout.putConstraint(SpringLayout.EAST, textField, -5, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, textField, 40, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, 27, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 7, SpringLayout.NORTH, this);
		//
	}
	void setEditable(boolean editable){
		textField.setEditable(editable);
	}

}
