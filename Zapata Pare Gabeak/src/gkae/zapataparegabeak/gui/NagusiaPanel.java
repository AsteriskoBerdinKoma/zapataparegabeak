package gkae.zapataparegabeak.gui;

import gkae.zapataparegabeak.gui.menuPanelak.ErosketaSaskiaMenuPanel;
import gkae.zapataparegabeak.gui.menuPanelak.LoginPanela;
import gkae.zapataparegabeak.gui.menuPanelak.MenuPanela;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

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
	
	private Frame jabea;
	
	/**
	 * Create the panel.
	 * @param frame 
	 */
	public NagusiaPanel(Frame frame) {
		{
			this.jabea = frame;
			
			panel_4 = new JPanel();
			panel_4.setBackground(Color.BLACK);
			panel_4.setLayout(new BorderLayout(0, 0));

			{
				final JSeparator separator = new JSeparator();
				panel_4.add(separator, BorderLayout.SOUTH);
			}
		}
		{
			panel_3 = new JPanel();
			panel_3.setLayout(new BorderLayout(0, 0));
		}
		{
			panel_6 = new JPanel();

			JPanel panel_1;
			{
				panel_1 = new JPanel();
				panel_1.setLayout(new CardLayout());

				{
					final LoginPanela loginPanela = new LoginPanela();
					loginPanela.setName("loginPanela");
					panel_1.add(loginPanela, loginPanela.getName());
				}
			}

			JPanel panel;
			{
				panel = new JPanel();
				panel.setLayout(new CardLayout());

				{
					final MenuPanela menuPanela = new MenuPanela();
					menuPanela.setName("menuPanela");
					panel.add(menuPanela, menuPanela.getName());
				}
			}
			final GroupLayout groupLayout = new GroupLayout((JComponent) panel_6);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGap(5, 5, 5)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
			);
			panel_6.setLayout(groupLayout);
		}
		{
			panel_7 = new JPanel();

			ErosketaSaskiaMenuPanel erosketaSaskiaMenuPanel;
			{
				erosketaSaskiaMenuPanel = new ErosketaSaskiaMenuPanel();
			}
			final GroupLayout groupLayout = new GroupLayout((JComponent) panel_7);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(erosketaSaskiaMenuPanel, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addComponent(erosketaSaskiaMenuPanel, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(77, Short.MAX_VALUE))
			);
			panel_7.setLayout(groupLayout);
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

		JPanel panel_2;
		{
			panel_2 = new JPanel();
			panel_2.setLayout(new BorderLayout());

			{
				final JLabel bilatuLabel = new JLabel();
				bilatuLabel.setText("Bilaketa:");
				panel_2.add(bilatuLabel, BorderLayout.WEST);
			}

			{
				textField = new JTextField();
				panel_2.add(textField, BorderLayout.CENTER);
			}

			{
				final JButton bilatuButton = new JButton();
				bilatuButton.setText("Bilatu");
				panel_2.add(bilatuButton, BorderLayout.EAST);
			}
		}
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10, 10, 10)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(5, 5, 5)
							.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
					.addGap(10, 10, 10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10, 10, 10)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(5, 5, 5)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5, 5, 5)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
						.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(10, 10, 10))
		);
		setLayout(groupLayout);
	}
	
	public Frame getJabea(){
		return jabea;
	}
}
