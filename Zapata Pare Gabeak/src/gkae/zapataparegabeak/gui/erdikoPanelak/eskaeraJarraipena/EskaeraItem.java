package gkae.zapataparegabeak.gui.erdikoPanelak.eskaeraJarraipena;

import gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa.ArtikuluarenXehetasunakDialog;
import gkae.zapataparegabeak.objektuak.EskaeraElementua;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;

import org.jdesktop.swingx.JXHyperlink;

import com.swtdesigner.SwingResourceManager;

public class EskaeraItem extends JPanel {

	private ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private EskaerarenJarraipena owner;
	private EskaeraElementua eskaera;
	
	JXHyperlink datuartikuluaHyperlink;
	JLabel datukopuruaLabel;
	JLabel datuerosketadataLabel;
	JLabel datuegoeraLabel;
	JLabel datubidalketadataLabel;
	JLabel datuatzerapenaLabel;
	JButton atzerapenerakoAukerakButton;
	JButton artikuluHonenErosketaButton;
	JButton erositakoArtikuluaItzuliButton;
	JLabel datuprezioaLabel;
	JLabel irudiaLabel;
	
	//Atzerapenerako aukerak
	JRadioButton eskaeraBerdinMantenduRadioButton;
	JRadioButton artikuluHauBesteRadioButton;
	JRadioButton artikuluHonenEskariaRadioButton;

	/**
	 * Create the panel
	 */
	public EskaeraItem(EskaerarenJarraipena jabea, EskaeraElementua ei) {
		super();
		setLayout(new CardLayout());
		setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		
		this.owner = jabea;
		this.eskaera = ei;

		final JPanel eskaeraItemPanel = new JPanel();
		eskaeraItemPanel.setName("eskaeraItemPanel");
		add(eskaeraItemPanel, eskaeraItemPanel.getName());
		irudiaLabel = new JLabel();
		irudiaLabel.setPreferredSize(new Dimension(120, 120));
		irudiaLabel.setIconTextGap(0);
		irudiaLabel.setBackground(Color.WHITE);
		irudiaLabel.setOpaque(true);
		irudiaLabel.setIcon(SwingResourceManager.getIcon(EskaeraItem.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png"));

		
		datuartikuluaHyperlink = new JXHyperlink();
		datuartikuluaHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				ArtikuluarenXehetasunakDialog ae = new ArtikuluarenXehetasunakDialog(eskaera.getZapata());
				ae.setLocationRelativeTo(null);
				ae.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				ae.setVisible(true);
			}
		});
		datuartikuluaHyperlink.setText("datuArtikulua");

		JLabel artikuluaLabel;
		artikuluaLabel = new JLabel();
		artikuluaLabel.setText("Artikulua:");

		JLabel kopuruaLabel;
		kopuruaLabel = new JLabel();
		kopuruaLabel.setText("Kopurua:");

		JLabel erosketadataLabel;
		erosketadataLabel = new JLabel();
		erosketadataLabel.setText("Erosketa-Data:");

		JLabel egoeraLabel;
		egoeraLabel = new JLabel();
		egoeraLabel.setText("Egoera:");

		JLabel bidalketadataLabel;
		bidalketadataLabel = new JLabel();
		bidalketadataLabel.setText("Bidalketa-Data:");

		JLabel atzerapenaLabel;
		atzerapenaLabel = new JLabel();
		atzerapenaLabel.setText("Atzerapena:");

		
		datukopuruaLabel = new JLabel();
		datukopuruaLabel.setText("datuKopurua");

		
		datuerosketadataLabel = new JLabel();
		datuerosketadataLabel.setText("datuErosketaData");

		
		datuegoeraLabel = new JLabel();
		datuegoeraLabel.setText("datuEgoera");

		
		datubidalketadataLabel = new JLabel();
		datubidalketadataLabel.setText("datuBidalketaData");

		
		datuatzerapenaLabel = new JLabel();
		datuatzerapenaLabel.setText("datuAtzerapena");

		
		atzerapenerakoAukerakButton = new JButton();
		atzerapenerakoAukerakButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				kartaAldatu("atzerapenaPanel");
			}
		});
		atzerapenerakoAukerakButton.setIcon(SwingResourceManager.getIcon(EskaeraItem.class, "/gkae/zapataparegabeak/resources/ikonoak/add_item24.png"));
		atzerapenerakoAukerakButton.setMargin(new Insets(2, 4, 2, 14));
		atzerapenerakoAukerakButton.setText("Atzerapenerako aukerak");

		
		artikuluHonenErosketaButton = new JButton();
		artikuluHonenErosketaButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				//Benetan bertan behera utzi nahi duen galdetu
				JOptionPane jop = new JOptionPane(
                        "Ziur zaude artikulu hau eskaeratik\nEzabatu nahi duzula?.",
                        JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
						jop.createDialog("Artikulu ezabatzearen konfirmazioa")
                        .setVisible(true);		
				//Zerrendatik ezabatu eta zerrenda eguneratu
				if(jop.getValue().equals(JOptionPane.YES_OPTION)){		
					setInvisible();
					owner.kenduEskaeraBat(eskaera);
					owner.zerrendaEguneratu();
				}
			}
		});
		artikuluHonenErosketaButton.setMargin(new Insets(2, 4, 2, 14));
		artikuluHonenErosketaButton.setIcon(SwingResourceManager.getIcon(EskaeraItem.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
		artikuluHonenErosketaButton.setText("Artikulu Honen Erosketa Bertan Behera Utzi");

		
		erositakoArtikuluaItzuliButton = new JButton();
		erositakoArtikuluaItzuliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				//Itzulera aukerak dituen panelera joan
				ItzuleraJarraibideak ij = new ItzuleraJarraibideak();
				ij.setLocationRelativeTo(null);
				ij.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				ij.setVisible(true);
			}
		});
		erositakoArtikuluaItzuliButton.setText("Erositako Artikulua Itzuli");

		JLabel prezioaLabel;
		prezioaLabel = new JLabel();
		prezioaLabel.setText("Prezioa:");

	
		datuprezioaLabel = new JLabel();
		datuprezioaLabel.setText("datuPrezioa");
		final GroupLayout groupLayout = new GroupLayout((JComponent) eskaeraItemPanel);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(20, 20, 20)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(atzerapenaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(datuatzerapenaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(atzerapenerakoAukerakButton))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(erosketadataLabel)
										.addComponent(artikuluaLabel)
										.addComponent(kopuruaLabel)
										.addComponent(egoeraLabel)
										.addComponent(bidalketadataLabel)
										.addComponent(prezioaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(datuprezioaLabel)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
													.addComponent(datuartikuluaHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addComponent(datukopuruaLabel)
												.addComponent(datuerosketadataLabel)))
										.addComponent(datuegoeraLabel)
										.addComponent(datubidalketadataLabel)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(artikuluHonenErosketaButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(erositakoArtikuluaItzuliButton)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(datuartikuluaHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(artikuluaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(kopuruaLabel)
								.addComponent(datukopuruaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(erosketadataLabel)
								.addComponent(datuerosketadataLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(egoeraLabel)
								.addComponent(datuegoeraLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(datubidalketadataLabel)
								.addComponent(bidalketadataLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(prezioaLabel)
								.addComponent(datuprezioaLabel))
							.addGap(4, 4, 4)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(atzerapenaLabel)
								.addComponent(datuatzerapenaLabel)
								.addComponent(atzerapenerakoAukerakButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36, 36, 36)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(artikuluHonenErosketaButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(erositakoArtikuluaItzuliButton))
					.addContainerGap())
		);
		eskaeraItemPanel.setLayout(groupLayout);
		
		setDatuak();

		final JPanel atzerapenaPanel = new JPanel();
		atzerapenaPanel.setName("atzerapenaPanel");
		add(atzerapenaPanel, atzerapenaPanel.getName());

		JLabel artikuluHonenEntregaLabel;
		artikuluHonenEntregaLabel = new JLabel();
		artikuluHonenEntregaLabel.setText("Artikulu honen entrega epea luzatu denez ondoko aukerak eskaintzen dizkizugu:");

		
		artikuluHonenEskariaRadioButton = new JRadioButton();
		buttonGroup.add(artikuluHonenEskariaRadioButton);
		artikuluHonenEskariaRadioButton.setText("Artikulu honen eskaria bertan behera utzi");

		
		artikuluHauBesteRadioButton = new JRadioButton();
		buttonGroup.add(artikuluHauBesteRadioButton);
		artikuluHauBesteRadioButton.setText("Artikulu hau beste batez ordezkatu");

		
		eskaeraBerdinMantenduRadioButton = new JRadioButton();
		eskaeraBerdinMantenduRadioButton.setSelected(true);
		buttonGroup.add(eskaeraBerdinMantenduRadioButton);
		eskaeraBerdinMantenduRadioButton.setText("Eskaera berdin mantendu eta itxaroten jarraitu");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if(eskaeraBerdinMantenduRadioButton.isSelected()){
					kartaAldatu("eskaeraItemPanel");
				} else if(artikuluHonenEskariaRadioButton.isSelected()){
					setInvisible();
					owner.kenduEskaeraBat(eskaera);
					owner.zerrendaEguneratu();
					kartaAldatu("eskaeraItemPanel");
				} else if(artikuluHauBesteRadioButton.isSelected()){
					//Katalogora joan
				}
			}
		});
		onartuButton.setIcon(SwingResourceManager.getIcon(EskaeraItem.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		onartuButton.setText("Onartu");

		JButton atzeraEginButton;
		atzeraEginButton = new JButton();
		atzeraEginButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				kartaAldatu("eskaeraItemPanel");
			}

			
		});
		atzeraEginButton.setIcon(SwingResourceManager.getIcon(EskaeraItem.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraEginButton.setText("Atzera Egin");
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) atzerapenaPanel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(artikuluHonenEntregaLabel))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(54, 54, 54)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(artikuluHauBesteRadioButton)
								.addComponent(artikuluHonenEskariaRadioButton)
								.addComponent(eskaeraBerdinMantenduRadioButton))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap(289, Short.MAX_VALUE)
					.addComponent(atzeraEginButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(onartuButton)
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(artikuluHonenEntregaLabel)
					.addGap(13, 13, 13)
					.addComponent(artikuluHonenEskariaRadioButton)
					.addGap(10, 10, 10)
					.addComponent(artikuluHauBesteRadioButton)
					.addGap(8, 8, 8)
					.addComponent(eskaeraBerdinMantenduRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(onartuButton)
						.addComponent(atzeraEginButton))
					.addContainerGap())
		);
		atzerapenaPanel.setLayout(groupLayout_1);
	}
	
	public void setInvisible(){
		this.setVisible(false);
	}
	
	public void kartaAldatu(String destination) {
		CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, destination);
		
	}
	
	public void setDatuak(){
		Zapata zapataInfo = eskaera.getZapata();
		datuartikuluaHyperlink.setText(zapataInfo.getGeneroa()+" - Modelo Generikoa - "+zapataInfo.getKolorea()+" - "+zapataInfo.getOina());
		datukopuruaLabel.setText(String.valueOf(eskaera.getKopurua()));
		datuerosketadataLabel.setText(eskaera.getErosketaData());
		datubidalketadataLabel.setText(eskaera.getBildaketaData());
		datuegoeraLabel.setText(eskaera.getEgoera());
		datuprezioaLabel.setText(zapataInfo.getPrezioa()+"€");
		
		ImageIcon iconOrig = SwingResourceManager.getIcon(EskaeraItem.class, "/gkae/zapataparegabeak/resources/zapatak/"+zapataInfo.getIrudiPath());
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(120, 60, Image.SCALE_SMOOTH));
		
		irudiaLabel.setIcon(iconResized);
		if(eskaera.isAtzerapenaDago()){
			datuatzerapenaLabel.setText("Bai");
			atzerapenerakoAukerakButton.setVisible(true);
		} else {
			datuatzerapenaLabel.setText("Ez");
			atzerapenerakoAukerakButton.setVisible(false);
		}
		if(eskaera.getEgoera().equals("Bidalita")){
			artikuluHonenErosketaButton.setEnabled(false);
			erositakoArtikuluaItzuliButton.setEnabled(true);
		} else {
			artikuluHonenErosketaButton.setEnabled(true);
			erositakoArtikuluaItzuliButton.setEnabled(false);
		}
	}

}
