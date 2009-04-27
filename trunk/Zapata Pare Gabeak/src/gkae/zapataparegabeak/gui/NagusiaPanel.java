package gkae.zapataparegabeak.gui;

import gkae.zapataparegabeak.gui.menuPanelak.LoginPanela;
import gkae.zapataparegabeak.gui.menuPanelak.MenuPanela;

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
import javax.swing.SwingConstants;

public class NagusiaPanel extends JPanel {
	private SpringLayout springLayout_1;
	private SpringLayout springLayout_2;
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

			{
				final JSeparator separator = new JSeparator();
				panel_4.add(separator, BorderLayout.SOUTH);
			}
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
			springLayout_1 = new SpringLayout();
			panel_6.setLayout(springLayout_1);
			add(panel_6);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_6, -43, SpringLayout.SOUTH, this);
			springLayout.putConstraint(SpringLayout.NORTH, panel_6, 120, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.EAST, panel_6, 205, SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.WEST, panel_6, 10, SpringLayout.WEST, this);

			JPanel panel_1;
			{
				panel_1 = new JPanel();
				panel_1.setLayout(new CardLayout());
				panel_6.add(panel_1);
				springLayout_1.putConstraint(SpringLayout.EAST, panel_1, -5, SpringLayout.EAST, panel_6);
				springLayout_1.putConstraint(SpringLayout.WEST, panel_1, 5, SpringLayout.WEST, panel_6);
				springLayout_1.putConstraint(SpringLayout.SOUTH, panel_1, 145, SpringLayout.NORTH, panel_6);
				springLayout_1.putConstraint(SpringLayout.NORTH, panel_1, 5, SpringLayout.NORTH, panel_6);

				{
					final LoginPanela loginPanela = new LoginPanela();
					loginPanela.setName("loginPanela");
					panel_1.add(loginPanela, loginPanela.getName());
				}
			}

			{
				final JPanel panel = new JPanel();
				panel.setLayout(new CardLayout());
				panel_6.add(panel);
				springLayout_1.putConstraint(SpringLayout.SOUTH, panel, -5, SpringLayout.SOUTH, panel_6);
				springLayout_1.putConstraint(SpringLayout.NORTH, panel, 5, SpringLayout.SOUTH, panel_1);
				springLayout_1.putConstraint(SpringLayout.EAST, panel, -5, SpringLayout.EAST, panel_6);
				springLayout_1.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST, panel_6);

				{
					final MenuPanela menuPanela = new MenuPanela();
					menuPanela.setName("menuPanela");
					panel.add(menuPanela, menuPanela.getName());
				}
			}
		}
		{
			panel_7 = new JPanel();
			springLayout_2 = new SpringLayout();
			panel_7.setLayout(springLayout_2);
			add(panel_7);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_7, -43, SpringLayout.SOUTH, this);
			springLayout.putConstraint(SpringLayout.NORTH, panel_7, 120, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.EAST, panel_7, -10, SpringLayout.EAST, this);
			springLayout.putConstraint(SpringLayout.WEST, panel_7, -184, SpringLayout.EAST, this);
		}
		JPanel panel_5;
		{
			panel_5 = new JPanel();
			panel_5.setLayout(new BorderLayout());
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
			add(panel_5);
			springLayout.putConstraint(SpringLayout.EAST, panel_5, -189, SpringLayout.EAST, this);
			springLayout.putConstraint(SpringLayout.WEST, panel_5, 210, SpringLayout.WEST, this);

			{
				final JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				panel_5.add(separator, BorderLayout.WEST);
			}

			{
				final JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				panel_5.add(separator, BorderLayout.EAST);
			}

			{
				final JPanel panel = new JPanel();
				panel.setLayout(new CardLayout());
				panel_5.add(panel, BorderLayout.CENTER);
			}
		}

		{
			final JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			add(panel);
			springLayout.putConstraint(SpringLayout.SOUTH, panel, -5, SpringLayout.NORTH, panel_7);
			springLayout.putConstraint(SpringLayout.NORTH, panel, 89, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_5, -6, SpringLayout.NORTH, panel_3);
			springLayout.putConstraint(SpringLayout.NORTH, panel_5, 5, SpringLayout.SOUTH, panel);
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
