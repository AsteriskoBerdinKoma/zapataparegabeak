package gkae.zapataparegabeak.gui.erdikoPanelak.izenaEman;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.swtdesigner.SwingResourceManager;

public class IzenaEmanPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Kautotze paneleko aldagaiak
	private JTextField chaptchaTextField;
	private JPasswordField pasahitza2PassField;
	private JTextField eposta2TextField;
	private JPasswordField pasahitzaPassField;
	private JTextField epostaTextField;
	private JTextField erabIzenaTextField;
	
	//Bidalketa informazioko aldagaiak
	private ButtonGroup buttonGroupOrdainketa = new ButtonGroup();
	private JTextField iraungDatTextField;
	private JTextField txartelZenbTextField;
	private JTextField jabeIzenAbTextField;
	private JComboBox probintziakComboBox;
	
	private String[] probintziak = new String[]{"Araba","Albacete","Alacant","Almeria","Asturias","Avila","Badajoz",
			"Bartzelona","Balear irlak","Bizkaia","Burgos","Caceres","Cadiz","Castello",
			"Ciudad Real","Coru�a","Cuenca","Errioxa","Gipuzkoa","Girona","Granada",
			"Guadalajara","Huelva","Huesca","Jaen","Kantabria","Kordoba","Leon","Lleida",
			"Lugo","Madrilgo Erkidegoa","Malaga","Murtziako Erkidegoa","Nafarroa",
			"Ourense","Palentzia","Las Palmas","Pontevedra","Salamanca","Segovia",
			"Sevilla","Soria","Tarragona","Tenerife","Teruel","Toledo","Valentzia",
			"Valladolid","Zamora","Zaragoza"};
	
	private JTextField hartzPKTextField;
	private JTextField hartzHelbTextField;
	private JTextField hartzIzenaTextField;
	private JTextField hartzAbizTextField;
	
	private JRadioButton jasotzeanOrdaintzekoMetodoaRadioButton;
	private JRadioButton txartelBidezkoOrdainketaRadioButton;
	private JPanel txartelInfoPanel;
	
	//Artikulu hobespenen aldagaiak
	private JTextField oinNeurriaTextField;
	private ButtonGroup buttonGroupGenero = new ButtonGroup();
	private ButtonGroup buttonGroupOina = new ButtonGroup();
	

	/**
	 * Create the panel
	 */
	public IzenaEmanPanel() {
		super();
		setLayout(new CardLayout());

		
		final JPanel kautotuPanel = new JPanel();
		kautotuPanel.setName("KautotzeDatuak");
		add(kautotuPanel,kautotuPanel.getName());
		
		JLabel izenaEmanKautotzeLabel;
		izenaEmanKautotzeLabel = new JLabel();
		izenaEmanKautotzeLabel.setFont(new Font("Sans", Font.PLAIN, 18));
		izenaEmanKautotzeLabel.setText("Izena Eman: Kautotze Informazioa");

		JSeparator separator;
		separator = new JSeparator();

		JLabel oharraBatekinLabel;
		oharraBatekinLabel = new JLabel();
		oharraBatekinLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		oharraBatekinLabel.setText("Oharra: * batekin markatutako eremuak derrigorrez bete behar dira.");

		JLabel erabiltzaileIzenaLabel;
		erabiltzaileIzenaLabel = new JLabel();
		erabiltzaileIzenaLabel.setText("Erabiltzaile Izena*:");

		erabIzenaTextField = new JTextField();

		JLabel epostaHelbideaLabel;
		epostaHelbideaLabel = new JLabel();
		epostaHelbideaLabel.setText("E-Posta helbidea*:");

		epostaTextField = new JTextField();

		JLabel pasahitzaLabel;
		pasahitzaLabel = new JLabel();
		pasahitzaLabel.setText("Pasahitza*:");

		pasahitzaPassField = new JPasswordField();

		JLabel pasahitzaBerretsiLabel;
		pasahitzaBerretsiLabel = new JLabel();
		pasahitzaBerretsiLabel.setText("Pasahitza berretsi*:");

		JLabel epostaBerretsiLabel;
		epostaBerretsiLabel = new JLabel();
		epostaBerretsiLabel.setText("E-Posta berretsi*:");

		eposta2TextField = new JTextField();

		pasahitza2PassField = new JPasswordField();

		JLabel mesedezIdatziItzazuLabel;
		mesedezIdatziItzazuLabel = new JLabel();
		mesedezIdatziItzazuLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		mesedezIdatziItzazuLabel.setText("Mesedez idatzi itzazu irudiko hizkiak azpiko kutxan izen emate hau");

		JLabel eraAutomatikoanEginLabel;
		eraAutomatikoanEginLabel = new JLabel();
		eraAutomatikoanEginLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		eraAutomatikoanEginLabel.setText("era automatikoan egin ez dela egiazta dezagun.");

		JLabel label;
		label = new JLabel();
		label.setIconTextGap(0);
		label.setIcon(SwingResourceManager.getIcon(KautotzeInformazioa.class, "/gkae/zapataparegabeak/resources/jcaptcha.jpg"));

		chaptchaTextField = new JTextField();

		JButton bukatuButton;
		bukatuButton = new JButton();
		bukatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				//Informazioa gorde
				//Orri nagusira itzuli
			}
		});
		bukatuButton.setText("Bukatu");

		JButton erosketaHobespenakEmanButton;
		erosketaHobespenakEmanButton = new JButton();
		erosketaHobespenakEmanButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				//Informazioa gorde
				changeCard("BidalketaHobespenak");
			}
		});
		erosketaHobespenakEmanButton.setText("Bidalketa Hobespenak Eman");
		final GroupLayout groupLayout = new GroupLayout((JComponent) kautotuPanel);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(bukatuButton)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(erosketaHobespenakEmanButton)
									.addGap(103, 103, 103))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(pasahitzaLabel)
										.addComponent(epostaBerretsiLabel)
										.addComponent(pasahitzaBerretsiLabel)
										.addComponent(epostaHelbideaLabel)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(erabiltzaileIzenaLabel)))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(epostaTextField, 344, 344, Short.MAX_VALUE)
										.addComponent(pasahitzaPassField, 344, 344, Short.MAX_VALUE)
										.addComponent(eposta2TextField, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(pasahitza2PassField, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
										.addComponent(erabIzenaTextField, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(mesedezIdatziItzazuLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(eraAutomatikoanEginLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(143, 143, 143)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addComponent(chaptchaTextField, GroupLayout.Alignment.LEADING)
								.addComponent(label, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(izenaEmanKautotzeLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(oharraBatekinLabel)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(izenaEmanKautotzeLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(16, 16, 16)
					.addComponent(oharraBatekinLabel)
					.addGap(18, 18, 18)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erabiltzaileIzenaLabel)
						.addComponent(erabIzenaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10, 10, 10)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(epostaHelbideaLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaBerretsiLabel)
						.addComponent(eposta2TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pasahitzaLabel)
						.addComponent(pasahitzaPassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pasahitzaBerretsiLabel)
						.addComponent(pasahitza2PassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19, 19, 19)
					.addComponent(mesedezIdatziItzazuLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eraAutomatikoanEginLabel)
					.addGap(26, 26, 26)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(chaptchaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bukatuButton)
						.addComponent(erosketaHobespenakEmanButton))
					.addContainerGap())
		);
		kautotuPanel.setLayout(groupLayout);

		final JPanel bidalketaInfopanel = new JPanel();
		bidalketaInfopanel.setName("BidalketaHobespenak");
		add(bidalketaInfopanel, bidalketaInfopanel.getName());
		
		JLabel izenaEmanBidalketaLabel;
		izenaEmanBidalketaLabel = new JLabel();
		izenaEmanBidalketaLabel.setFont(new Font("Sans", Font.PLAIN, 18));
		izenaEmanBidalketaLabel.setText("Izena Eman: Bidalketa Hobespenak");

		JSeparator separator_2;
		separator_2 = new JSeparator();

		JLabel hartzailearenIzenaLabel;
		hartzailearenIzenaLabel = new JLabel();
		hartzailearenIzenaLabel.setText("Hartzailearen Izena:");

		JLabel hartzailearenAbizenakLabel;
		hartzailearenAbizenakLabel = new JLabel();
		hartzailearenAbizenakLabel.setText("Hartzailearen Abizenak:");

		JLabel helbideaadibSantaLabel;
		helbideaadibSantaLabel = new JLabel();
		helbideaadibSantaLabel.setText("Hartzailearen Helbidea (Adib. Santa Korda Kalea 75, 2.Ezk):");

		hartzAbizTextField = new JTextField();

		hartzIzenaTextField = new JTextField();

		hartzHelbTextField = new JTextField();

		JLabel postakutxatilaLabel;
		postakutxatilaLabel = new JLabel();
		postakutxatilaLabel.setText("Hartzailearen Posta-kutxatila:");

		hartzPKTextField = new JTextField();

		JLabel probintziaLabel;
		probintziaLabel = new JLabel();
		probintziaLabel.setText("Hartzailearen Probintzia:");

		probintziakComboBox = new JComboBox(probintziak);

		JLabel ordainketaMotaLabel;
		ordainketaMotaLabel = new JLabel();
		ordainketaMotaLabel.setText("Ordainketa Mota Lehenetsia:");

		jasotzeanOrdaintzekoMetodoaRadioButton = new JRadioButton();
		
		jasotzeanOrdaintzekoMetodoaRadioButton.setSelected(true);
		buttonGroupOrdainketa.add(jasotzeanOrdaintzekoMetodoaRadioButton);
		jasotzeanOrdaintzekoMetodoaRadioButton.setText("Jasotzean ordaintzea");

		txartelBidezkoOrdainketaRadioButton = new JRadioButton();
		
		buttonGroupOrdainketa.add(txartelBidezkoOrdainketaRadioButton);
		txartelBidezkoOrdainketaRadioButton.setText("Txartel bidezko ordainketa");

		
		txartelInfoPanel = new JPanel();
		txartelInfoPanel.setVisible(false);
		txartelInfoPanel.setBorder(new TitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JLabel jabearenIzenabizenakLabel;
		jabearenIzenabizenakLabel = new JLabel();
		jabearenIzenabizenakLabel.setText("Jabearen Izen-Abizenak:");

		JLabel txartelZenbakiaLabel;
		txartelZenbakiaLabel = new JLabel();
		txartelZenbakiaLabel.setText("Txartel Zenbakia:");

		JLabel iraungitzedataLabel;
		iraungitzedataLabel = new JLabel();
		iraungitzedataLabel.setText("Iraungitze-data:");

		jabeIzenAbTextField = new JTextField();

		txartelZenbTextField = new JTextField();

		iraungDatTextField = new JTextField();

		JLabel uuuuhheeLabel;
		uuuuhheeLabel = new JLabel();
		uuuuhheeLabel.setText("(UUUU/hh/ee)");

		JButton bukatuBidalketaButton;
		bukatuBidalketaButton = new JButton();
		bukatuBidalketaButton.setText("Bukatu");

		JButton artikulueiBuruzkoHobespenakButton;
		artikulueiBuruzkoHobespenakButton = new JButton();
		artikulueiBuruzkoHobespenakButton.setText("Artikuluei Buruzko Hobespenak Eman");
		//
		
		txartelBidezkoOrdainketaRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent e) {
				if (txartelBidezkoOrdainketaRadioButton.isSelected()){
					txartelInfoPanel.setVisible(true);
					panelValidation();
				}
			}
		});
		
		jasotzeanOrdaintzekoMetodoaRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent e) {
				if(jasotzeanOrdaintzekoMetodoaRadioButton.isSelected()){
					txartelInfoPanel.setVisible(false);
					panelValidation();
				}
			}
		});
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) txartelInfoPanel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(jabearenIzenabizenakLabel)
						.addComponent(txartelZenbakiaLabel)
						.addComponent(iraungitzedataLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addComponent(iraungDatTextField, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(uuuuhheeLabel))
						.addComponent(txartelZenbTextField, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
						.addComponent(jabeIzenAbTextField, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(jabearenIzenabizenakLabel)
						.addComponent(jabeIzenAbTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(txartelZenbakiaLabel)
						.addComponent(txartelZenbTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(iraungitzedataLabel)
						.addComponent(iraungDatTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(uuuuhheeLabel))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		txartelInfoPanel.setLayout(groupLayout_1);
		final GroupLayout groupLayout_2 = new GroupLayout((JComponent) bidalketaInfopanel);
		groupLayout_2.setHorizontalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(hartzHelbTextField, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(helbideaadibSantaLabel)
								.addGroup(groupLayout_2.createSequentialGroup()
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(hartzailearenAbizenakLabel)
										.addComponent(hartzailearenIzenaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(hartzIzenaTextField, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
										.addComponent(hartzAbizTextField, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
								.addGroup(groupLayout_2.createSequentialGroup()
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(postakutxatilaLabel)
										.addComponent(probintziaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(hartzPKTextField)
										.addComponent(probintziakComboBox, 0, 135, Short.MAX_VALUE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE))
								.addComponent(ordainketaMotaLabel)))
						.addGroup(groupLayout_2.createSequentialGroup()
							.addGap(47, 47, 47)
							.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(txartelBidezkoOrdainketaRadioButton)
								.addComponent(jasotzeanOrdaintzekoMetodoaRadioButton)
								.addGroup(groupLayout_2.createSequentialGroup()
									.addGap(21, 21, 21)
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(groupLayout_2.createSequentialGroup()
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(bukatuBidalketaButton)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(artikulueiBuruzkoHobespenakButton))
										.addComponent(txartelInfoPanel, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)))))
						.addGroup(groupLayout_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(izenaEmanBidalketaLabel)))
					.addContainerGap())
		);
		groupLayout_2.setVerticalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(izenaEmanBidalketaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(15, 15, 15)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenIzenaLabel)
						.addComponent(hartzIzenaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenAbizenakLabel)
						.addComponent(hartzAbizTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(helbideaadibSantaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(hartzHelbTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(postakutxatilaLabel)
						.addComponent(hartzPKTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(probintziaLabel)
						.addComponent(probintziakComboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(25, 25, 25)
					.addComponent(ordainketaMotaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jasotzeanOrdaintzekoMetodoaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(txartelBidezkoOrdainketaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(txartelInfoPanel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bukatuBidalketaButton)
						.addComponent(artikulueiBuruzkoHobespenakButton))
					.addContainerGap())
		);
		bidalketaInfopanel.setLayout(groupLayout_2);

		final JPanel artikuluHobesPanel = new JPanel();
		artikuluHobesPanel.setName("ArtikuluHobespenak");
		add(artikuluHobesPanel, artikuluHobesPanel.getName());
		
		JLabel izenaEmanArtikulueiLabel;
		izenaEmanArtikulueiLabel = new JLabel();
		izenaEmanArtikulueiLabel.setFont(new Font("Sans", Font.PLAIN, 18));
		izenaEmanArtikulueiLabel.setText("Izena Eman: Artikuluei Buruzko Hobespenak");

		JSeparator separator_3;
		separator_3 = new JSeparator();

		JLabel zureGustuakEzagututaLabel;
		zureGustuakEzagututaLabel = new JLabel();
		zureGustuakEzagututaLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		zureGustuakEzagututaLabel.setText("Zure gustuak ezagututa artikulu berriei buruzko informazio zehatzagoa");

		JLabel bidaliDiezazukeguEtaLabel;
		bidaliDiezazukeguEtaLabel = new JLabel();
		bidaliDiezazukeguEtaLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		bidaliDiezazukeguEtaLabel.setText("bidali diezazukegu, eta katalogoan zure gustuko artikuluak lehenago");

		JLabel agertukoDiraEdonolakoLabel;
		agertukoDiraEdonolakoLabel = new JLabel();
		agertukoDiraEdonolakoLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		agertukoDiraEdonolakoLabel.setText("agertuko dira, edonolako eskaintzarik badute.");

		JLabel lehenetsitakoGeneroaLabel;
		lehenetsitakoGeneroaLabel = new JLabel();
		lehenetsitakoGeneroaLabel.setText("Lehenetsitako Generoa:");

		JLabel lehenetsitakoOinaLabel;
		lehenetsitakoOinaLabel = new JLabel();
		lehenetsitakoOinaLabel.setText("Lehenetsitako Oina:");

		JRadioButton emakumeaRadioButton;
		emakumeaRadioButton = new JRadioButton();
		buttonGroupGenero.add(emakumeaRadioButton);
		emakumeaRadioButton.setText("Emakumezkoa");

		JRadioButton gizonezkoaRadioButton;
		gizonezkoaRadioButton = new JRadioButton();
		buttonGroupGenero.add(gizonezkoaRadioButton);
		gizonezkoaRadioButton.setText("Gizonezkoa");

		JRadioButton eskuinOinaRadioButton;
		eskuinOinaRadioButton = new JRadioButton();
		buttonGroupOina.add(eskuinOinaRadioButton);
		eskuinOinaRadioButton.setText("Eskuin Oina");

		JRadioButton ezkerOinaRadioButton;
		ezkerOinaRadioButton = new JRadioButton();
		buttonGroupOina.add(ezkerOinaRadioButton);
		ezkerOinaRadioButton.setText("Ezker Oina");

		JLabel lehenetsitakoNeurriaLabel;
		lehenetsitakoNeurriaLabel = new JLabel();
		lehenetsitakoNeurriaLabel.setText("Lehenetsitako Neurria:");

		oinNeurriaTextField = new JTextField();

		JButton bukatuDenaButton;
		bukatuDenaButton = new JButton();
		bukatuDenaButton.setText("Bukatu");
		final GroupLayout groupLayout_3 = new GroupLayout((JComponent) artikuluHobesPanel);
		groupLayout_3.setHorizontalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_3.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(izenaEmanArtikulueiLabel)
								.addComponent(zureGustuakEzagututaLabel)
								.addComponent(bidaliDiezazukeguEtaLabel)
								.addComponent(agertukoDiraEdonolakoLabel)
								.addComponent(lehenetsitakoGeneroaLabel)
								.addGroup(groupLayout_3.createSequentialGroup()
									.addGap(12, 12, 12)
									.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(gizonezkoaRadioButton)
										.addComponent(emakumeaRadioButton)))
								.addComponent(lehenetsitakoOinaLabel)
								.addGroup(groupLayout_3.createSequentialGroup()
									.addGap(12, 12, 12)
									.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(ezkerOinaRadioButton)
										.addComponent(eskuinOinaRadioButton)))
								.addGroup(groupLayout_3.createSequentialGroup()
									.addComponent(lehenetsitakoNeurriaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(oinNeurriaTextField, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout_3.createSequentialGroup()
							.addGap(192, 192, 192)
							.addComponent(bukatuDenaButton)))
					.addContainerGap())
		);
		groupLayout_3.setVerticalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(izenaEmanArtikulueiLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(20, 20, 20)
					.addComponent(zureGustuakEzagututaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(bidaliDiezazukeguEtaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(agertukoDiraEdonolakoLabel)
					.addGap(15, 15, 15)
					.addComponent(lehenetsitakoGeneroaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(emakumeaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(gizonezkoaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(lehenetsitakoOinaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskuinOinaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ezkerOinaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(lehenetsitakoNeurriaLabel)
						.addComponent(oinNeurriaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
					.addComponent(bukatuDenaButton)
					.addContainerGap())
		);
		artikuluHobesPanel.setLayout(groupLayout_3);
		//
		CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, "KautotzeDatuak");
	}
	
	
	
	
	
	public void panelValidation(){
		this.revalidate();
	}
	
	public void changeCard(String destination){
		CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, destination);
	}
	
	public static void main(String[] args){
		JFrame j = new JFrame("Frogak");
		BidalketaHobespenak o = new BidalketaHobespenak();
		j.add(o);
		j.setSize(o.getSize());
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
