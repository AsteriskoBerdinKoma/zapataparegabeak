package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.SpringLayout;

public class ErosketaSaskia extends JPanel {

	private SpringLayout springLayout;
	/**
	 * Create the panel
	 */
	public ErosketaSaskia() {
		super();
		setFont(new Font("Sans", Font.PLAIN, 14));
		springLayout = new SpringLayout();
		setLayout(springLayout);
		setSize(577, 422);

		final JLabel erosketaSaskiaLabel = new JLabel();
		erosketaSaskiaLabel.setFont(new Font("Sans", Font.PLAIN, 18));
		erosketaSaskiaLabel.setText("Erosketa Saskia");
		add(erosketaSaskiaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, erosketaSaskiaLabel, 60, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, erosketaSaskiaLabel, 15, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, erosketaSaskiaLabel, 165, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, erosketaSaskiaLabel, 10, SpringLayout.WEST, this);

		final JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 405, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.SOUTH, erosketaSaskiaLabel);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 550, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 5, SpringLayout.WEST, erosketaSaskiaLabel);
		//
	}

}
