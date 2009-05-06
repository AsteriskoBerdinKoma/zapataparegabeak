package gkae.zapataparegabeak.gui;

import gkae.zapataparegabeak.gui.erdikoPanelak.dendariarekinHarremanetanJarri.HarremanetanJarriPanela;
import gkae.zapataparegabeak.gui.erdikoPanelak.erabiltzailearenDatuakAldatu.ErabiltzailearenDatuakAldatuPanela;
import gkae.zapataparegabeak.gui.erdikoPanelak.erosi.ErosiPanel;
import gkae.zapataparegabeak.gui.erdikoPanelak.eskaeraJarraipena.EskaerarenJarraipena;
import gkae.zapataparegabeak.gui.erdikoPanelak.izenaEman.IzenaEmanPanel;
import gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa.BilaketaEmaitzak;
import gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa.KatalogoaPanela;
import gkae.zapataparegabeak.gui.menuPanelak.AbisuakMenuPanela;
import gkae.zapataparegabeak.gui.menuPanelak.BezeroEskuinMenuPanela;
import gkae.zapataparegabeak.gui.menuPanelak.KudeaketaMenuPanela;
import gkae.zapataparegabeak.gui.menuPanelak.LoginPanela;
import gkae.zapataparegabeak.gui.menuPanelak.MenuPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import com.swtdesigner.SwingResourceManager;

public class NagusiaPanel extends JPanel {
	private JTextField bilatuTextField;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel bannerPanel;
	private JPanel southPanel;
	private JPanel leftMenuPanel;
	private JPanel rightMenuPanel;
	private JLabel bannerLabel;
	private final JPanel centralPanel;
	private final BezeroEskuinMenuPanela bezeroEskuinMenuPanela;
	
	/**
	 * Create the panel.
	 * @param frame 
	 */
	public NagusiaPanel() {
		{	
			bannerPanel = new JPanel();
			bannerPanel.setBackground(Color.BLACK);
			bannerPanel.setLayout(new BorderLayout(0, 0));

			{
				final JSeparator separator = new JSeparator();
				bannerPanel.add(separator, BorderLayout.SOUTH);
			}
		}
		{
			southPanel = new JPanel();
			southPanel.setLayout(new BorderLayout(0, 0));
		}
		{
			leftMenuPanel = new JPanel();

			JPanel loginPanelHolder;
			{
				loginPanelHolder = new JPanel();
				loginPanelHolder.setLayout(new CardLayout());

				{
					final LoginPanela loginPanela = new LoginPanela();
					loginPanela.setName("loginPanela");
					loginPanelHolder.add(loginPanela, loginPanela.getName());
				}
			}

			JPanel navigationMenuHolder;
			{
				navigationMenuHolder = new JPanel();
				navigationMenuHolder.setLayout(new CardLayout());

				{
					final MenuPanel menuPanel = new MenuPanel(this);
					menuPanel.setName("menuPanel");
					navigationMenuHolder.add(menuPanel, menuPanel.getName());
				}

				{
					final KudeaketaMenuPanela kudeaketaMenuPanela = new KudeaketaMenuPanela();
					kudeaketaMenuPanela.setName("kudeaketaMenuPanela");
					navigationMenuHolder.add(kudeaketaMenuPanela, kudeaketaMenuPanela.getName());
				}
			}
			final GroupLayout groupLayout = new GroupLayout((JComponent) leftMenuPanel);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(loginPanelHolder, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
					.addComponent(navigationMenuHolder, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addComponent(loginPanelHolder, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGap(5, 5, 5)
						.addComponent(navigationMenuHolder, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
			);
			leftMenuPanel.setLayout(groupLayout);
		}
		{
			rightMenuPanel = new JPanel();
			rightMenuPanel.setLayout(new CardLayout());
			rightMenuPanel.setSize(237, 332);

			{
				bezeroEskuinMenuPanela = new BezeroEskuinMenuPanela(this);
				bezeroEskuinMenuPanela.setName("bezeroEskuinMenuPanela");
				rightMenuPanel.add(bezeroEskuinMenuPanela, bezeroEskuinMenuPanela.getName());
			}

			{
				final AbisuakMenuPanela abisuakMenuPanela = new AbisuakMenuPanela();
				abisuakMenuPanela.setName("abisuakMenuPanela");
				rightMenuPanel.add(abisuakMenuPanela, abisuakMenuPanela.getName());
			}
		}
		JPanel centralPanelHolder;
		{
			centralPanelHolder = new JPanel();
			centralPanelHolder.setLayout(new BorderLayout());
			{
				bannerLabel = new JLabel("");
				bannerLabel.setIcon(new ImageIcon(NagusiaPanel.class.getResource("/gkae/zapataparegabeak/resources/banner.jpg")));
				bannerPanel.add(bannerLabel, BorderLayout.CENTER);
			}
			{
				JSeparator separator = new JSeparator();
				southPanel.add(separator, BorderLayout.NORTH);
			}
			{
				JPanel copyrightPanel = new JPanel();
				copyrightPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				southPanel.add(copyrightPanel, BorderLayout.CENTER);
				{
					JLabel copyrightLabel = new JLabel("\u00A92009 - Zapata Pare Gabeak, S.L.");
					copyrightPanel.add(copyrightLabel);
				}
			}

			{
				final JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				centralPanelHolder.add(separator, BorderLayout.WEST);
			}

			{
				final JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				centralPanelHolder.add(separator, BorderLayout.EAST);
			}

			{
				centralPanel = new JPanel();
				centralPanel.setLayout(new CardLayout());
				centralPanelHolder.add(centralPanel, BorderLayout.CENTER);

				{
					final KatalogoaPanela katalogoaPanela = new KatalogoaPanela(this);
					katalogoaPanela.setName("katalogoaPanela");
					centralPanel.add(katalogoaPanela, katalogoaPanela.getName());
				}

				{
					final ErabiltzailearenDatuakAldatuPanela erabiltzailearenDatuakAldatuPanela = new ErabiltzailearenDatuakAldatuPanela(this);
					erabiltzailearenDatuakAldatuPanela.setName("erabiltzailearenDatuakAldatuPanela");
					centralPanel.add(erabiltzailearenDatuakAldatuPanela, erabiltzailearenDatuakAldatuPanela.getName());
				}

				{
					final HarremanetanJarriPanela harremanetanJarriPanela = new HarremanetanJarriPanela();
					harremanetanJarriPanela.setName("harremanetanJarriPanela");
					centralPanel.add(harremanetanJarriPanela, harremanetanJarriPanela.getName());
				}
				
				{
					final ErosiPanel erosiPanel = new ErosiPanel(this);
					erosiPanel.setName("erosiPanel");
					centralPanel.add(erosiPanel, erosiPanel.getName());
				}
				
				{
					final EskaerarenJarraipena eskaerarenJarraipena = new EskaerarenJarraipena(this);
					eskaerarenJarraipena.setName("eskaerarenJarraipena");
					centralPanel.add(eskaerarenJarraipena, eskaerarenJarraipena.getName());
				}
				
				{
					final IzenaEmanPanel izenaEmanPanel = new IzenaEmanPanel(this);
					izenaEmanPanel.setName("izenaEmanPanel");
					centralPanel.add(izenaEmanPanel, izenaEmanPanel.getName());
				}
				
				{
					final BilaketaEmaitzak bilaketaEmaitzak = new BilaketaEmaitzak(this);
					bilaketaEmaitzak.setName("bilaketaEmaitzak");
					centralPanel.add(bilaketaEmaitzak, bilaketaEmaitzak.getName());
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
				bilatuTextField = new JTextField();
				searchPanel.add(bilatuTextField, BorderLayout.CENTER);
			}

			{
				final JButton bilatuButton = new JButton();
				bilatuButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent e) {
						//bilatuTextField.getText();
						//Dagokion panelera joan
						ikusiBilaketaEmaitzakPanela();
					}
				});
				bilatuButton.setIcon(SwingResourceManager.getIcon(NagusiaPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/search_magnifier24.png"));
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
						.addComponent(southPanel, GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
						.addComponent(bannerPanel, GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(leftMenuPanel, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(searchPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
								.addComponent(centralPanelHolder, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 506, Short.MAX_VALUE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(rightMenuPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10, 10, 10)
					.addComponent(bannerPanel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(rightMenuPanel, GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
						.addComponent(leftMenuPanel, GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
						.addComponent(centralPanelHolder, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(southPanel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(10, 10, 10))
		);
		setLayout(groupLayout);
	}
	
	public void ikusiKatalogoaPanela(){
		CardLayout cl = (CardLayout)(centralPanel.getLayout());
        cl.show(centralPanel, "katalogoaPanela");
	}
	
	public void ikusiErabDatuakAldatuPanela(){
		CardLayout cl = (CardLayout)(centralPanel.getLayout());
        cl.show(centralPanel, "erabiltzailearenDatuakAldatuPanela");
	}
	
	public void ikusiHarremanetanJarriPanela(){
		CardLayout cl = (CardLayout)(centralPanel.getLayout());
        cl.show(centralPanel, "harremanetanJarriPanela");
	}
	
	public void ikusiBilaketaEmaitzakPanela(){
		CardLayout cl = (CardLayout)(centralPanel.getLayout());
        cl.show(centralPanel, "bilaketaEmaitzak");
	}
	
	public void ikusiErosiPanela(){
		CardLayout cl = (CardLayout)(centralPanel.getLayout());
        cl.show(centralPanel, "erosiPanel");
	}
	
	public void ikusiIzenaEmanPanela(){
		CardLayout cl = (CardLayout)(centralPanel.getLayout());
        cl.show(centralPanel, "izenaEmanPanel");
	}
	
	public void ikusiEskaerarenJarraipenaPanela(){
		CardLayout cl = (CardLayout)(centralPanel.getLayout());
        cl.show(centralPanel, "eskaerarenJarraipena");
	}
	
	public void saskiaEguneratu(){
		bezeroEskuinMenuPanela.saskiaEguneratu();
	}
}
