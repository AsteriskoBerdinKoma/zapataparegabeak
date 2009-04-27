package gkae.zapataparegabeak.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import gkae.zapataparegabeak.gui.menuPanelak.MenuPanela;

public class NagusiaPanel extends JPanel {
	private JTextField textField;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel panel_4;
	private JPanel panel_3;
	private JPanel panel_6;
	private JPanel panel_7;
	private JLabel label_2;
	private SpringLayout springLayout_1;
	
	/**
	 * Create the panel.
	 */
	public NagusiaPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		{
			panel_4 = new JPanel();
			panel_4.setBackground(Color.BLACK);
			panel_4.setLayout(new BorderLayout(0, 0));
			springLayout.putConstraint(SpringLayout.NORTH, panel_4, 10, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.WEST, panel_4, 10, SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_4, 84, SpringLayout.NORTH, this);
			add(panel_4);
		}
		{
			panel_3 = new JPanel();
			springLayout.putConstraint(SpringLayout.EAST, panel_4, 0, SpringLayout.EAST, panel_3);
			springLayout.putConstraint(SpringLayout.WEST, panel_3, 10, SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.EAST, panel_3, -10, SpringLayout.EAST, this);
			panel_3.setLayout(new BorderLayout(0, 0));
			springLayout.putConstraint(SpringLayout.NORTH, panel_3, -37, SpringLayout.SOUTH, this);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -10, SpringLayout.SOUTH, this);
			add(panel_3);
		}
		{
			panel_6 = new JPanel();
			springLayout.putConstraint(SpringLayout.WEST, panel_6, 10, SpringLayout.WEST, this);
			springLayout_1 = new SpringLayout();
			panel_6.setLayout(springLayout_1);
			add(panel_6);

			{
				final MenuPanela menuPanela = new MenuPanela();
				panel_6.add(menuPanela);
				springLayout_1.putConstraint(SpringLayout.EAST, menuPanela, -5, SpringLayout.EAST, panel_6);
				springLayout_1.putConstraint(SpringLayout.WEST, menuPanela, 5, SpringLayout.WEST, panel_6);
				springLayout_1.putConstraint(SpringLayout.SOUTH, menuPanela, -5, SpringLayout.SOUTH, panel_6);
				springLayout_1.putConstraint(SpringLayout.NORTH, menuPanela, 5, SpringLayout.NORTH, panel_6);
			}
		}
		{
			panel_7 = new JPanel();
			springLayout.putConstraint(SpringLayout.WEST, panel_7, -132, SpringLayout.EAST, this);
			springLayout.putConstraint(SpringLayout.EAST, panel_7, -10, SpringLayout.EAST, this);
			add(panel_7);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_7, -6, SpringLayout.NORTH, panel_3);
			springLayout.putConstraint(SpringLayout.NORTH, panel_7, 120, SpringLayout.NORTH, this);
		}
		JPanel panel_5;
		{
			panel_5 = new JPanel();
			springLayout.putConstraint(SpringLayout.EAST, panel_6, -6, SpringLayout.WEST, panel_5);
			springLayout.putConstraint(SpringLayout.WEST, panel_5, 198, SpringLayout.WEST, this);

			panel_5.setLayout(new CardLayout(0, 0));
			{
				label_2 = new JLabel("");
				label_2.setIcon(new ImageIcon(NagusiaPanel.class.getResource("/gkae/zapataparegabeak/resources/banner.jpg")));
				panel_4.add(label_2, BorderLayout.CENTER);
			}
			{
				JSeparator separator = new JSeparator();
				panel_3.add(separator, BorderLayout.NORTH);
			}
			{
				JPanel panel_8 = new JPanel();
				panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				panel_3.add(panel_8, BorderLayout.CENTER);
				{
					JLabel label = new JLabel("\u00A92009 - Zapata Pare Gabeak, S.L.");
					panel_8.add(label);
				}
			}
			springLayout.putConstraint(SpringLayout.EAST, panel_5, -6, SpringLayout.WEST, panel_7);
			add(panel_5);
		}

		{
			final JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			add(panel);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_6, -6, SpringLayout.NORTH, panel_3);
			springLayout.putConstraint(SpringLayout.NORTH, panel_6, 5, SpringLayout.SOUTH, panel);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_5, -6, SpringLayout.NORTH, panel_3);
			springLayout.putConstraint(SpringLayout.NORTH, panel_5, 5, SpringLayout.SOUTH, panel);
			springLayout.putConstraint(SpringLayout.SOUTH, panel, 115, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.NORTH, panel, 89, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, this);
			springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);

			{
				final JLabel bilatuLabel = new JLabel();
				bilatuLabel.setText("Bilaketa:");
				panel.add(bilatuLabel, BorderLayout.WEST);
			}

			{
				textField = new JTextField();
				panel.add(textField, BorderLayout.CENTER);
			}

			{
				final JButton bilatuButton = new JButton();
				bilatuButton.setText("Bilatu");
				panel.add(bilatuButton, BorderLayout.EAST);
			}
		}
	}
}
