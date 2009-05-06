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
import gkae.zapataparegabeak.gui.erdikoPanelak.dendariarekinHarremanetanJarri.HarremanetanJarriPanela;
import gkae.zapataparegabeak.gui.erdikoPanelak.erabiltzailearenDatuakAldatu.ErabiltzailearenDatuakAldatuPanela;
import gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa.KatalogoaPanela;

public class NagusiaPanel extends JPanel {
	private JTextField textField;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel bannerPanel;
	private JPanel copyrightPanel;
	private JPanel leftMenuPanel;
	private JPanel rightMenuPanel;
	private JLabel label_2;
	
	private Frame jabea;
	
	/**
	 * Create the panel.
	 * @param frame 
	 */
	public NagusiaPanel(Frame frame) {
		{
			this.jabea = frame;
			
			bannerPanel = new JPanel();
			bannerPanel.setBackground(Color.BLACK);
			bannerPanel.setLayout(new BorderLayout(0, 0));

			{
				final JSeparator separator = new JSeparator();
				bannerPanel.add(separator, BorderLayout.SOUTH);
			}
		}
		{
			copyrightPanel = new JPanel();
			copyrightPanel.setLayout(new BorderLayout(0, 0));
		}
		{
			leftMenuPanel = new JPanel();

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
			final GroupLayout groupLayout = new GroupLayout((JComponent) leftMenuPanel);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGap(5, 5, 5)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
			);
			leftMenuPanel.setLayout(groupLayout);
		}
		{
			rightMenuPanel = new JPanel();

			ErosketaSaskiaMenuPanel erosketaSaskiaMenuPanel;
			{
				erosketaSaskiaMenuPanel = new ErosketaSaskiaMenuPanel();
			}
			final GroupLayout groupLayout = new GroupLayout((JComponent) rightMenuPanel);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(erosketaSaskiaMenuPanel, GroupLayout.PREFERRED_SIZE, 291, Short.MAX_VALUE)
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addComponent(erosketaSaskiaMenuPanel, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(221, Short.MAX_VALUE))
			);
			rightMenuPanel.setLayout(groupLayout);
		}
		JPanel centralPanel;
		{
			centralPanel = new JPanel();
			centralPanel.setLayout(new BorderLayout());
			{
				label_2 = new JLabel("");
				label_2.setIcon(new ImageIcon(NagusiaPanel.class.getResource("/gkae/zapataparegabeak/resources/banner.jpg")));
				bannerPanel.add(label_2, BorderLayout.CENTER);
			}
			{
				JSeparator separator = new JSeparator();
				copyrightPanel.add(separator, BorderLayout.NORTH);
			}
			{
				JPanel panel_8 = new JPanel();
				panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				copyrightPanel.add(panel_8, BorderLayout.CENTER);
				{
					JLabel label = new JLabel("\u00A92009 - Zapata Pare Gabeak, S.L.");
					panel_8.add(label);
				}
			}

			{
				final JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				centralPanel.add(separator, BorderLayout.WEST);
			}

			{
				final JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				centralPanel.add(separator, BorderLayout.EAST);
			}

			{
				final JPanel panel = new JPanel();
				panel.setLayout(new CardLayout());
				centralPanel.add(panel, BorderLayout.CENTER);

				{
					final KatalogoaPanela katalogoaPanela = new KatalogoaPanela();
					katalogoaPanela.setName("katalogoaPanela");
					panel.add(katalogoaPanela, katalogoaPanela.getName());
				}

				{
					final ErabiltzailearenDatuakAldatuPanela erabiltzailearenDatuakAldatuPanela = new ErabiltzailearenDatuakAldatuPanela();
					erabiltzailearenDatuakAldatuPanela.setName("erabiltzailearenDatuakAldatuPanela");
					panel.add(erabiltzailearenDatuakAldatuPanela, erabiltzailearenDatuakAldatuPanela.getName());
				}

				{
					final HarremanetanJarriPanela harremanetanJarriPanela = new HarremanetanJarriPanela();
					harremanetanJarriPanela.setName("harremanetanJarriPanela");
					panel.add(harremanetanJarriPanela, harremanetanJarriPanela.getName());
				}
			}
		}

		JPanel searchPanel;
		{
			searchPanel = new JPanel();
			searchPanel.setLayout(new BorderLayout());

			{
				final JLabel bilatuLabel = new JLabel();
				bilatuLabel.setText("Bilaketa:");
				searchPanel.add(bilatuLabel, BorderLayout.WEST);
			}

			{
				textField = new JTextField();
				searchPanel.add(textField, BorderLayout.CENTER);
			}

			{
				final JButton bilatuButton = new JButton();
				bilatuButton.setText("Bilatu");
				searchPanel.add(bilatuButton, BorderLayout.EAST);
			}
		}
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10, 10, 10)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(bannerPanel, GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
						.addComponent(copyrightPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(leftMenuPanel, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(searchPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
								.addComponent(centralPanel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(rightMenuPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(10, 10, 10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10, 10, 10)
					.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(5, 5, 5)
					.addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5, 5, 5)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(centralPanel, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
						.addComponent(rightMenuPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
						.addComponent(leftMenuPanel, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(copyrightPanel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(10, 10, 10))
		);
		setLayout(groupLayout);
	}
	
	public Frame getJabea(){
		return jabea;
	}
}
