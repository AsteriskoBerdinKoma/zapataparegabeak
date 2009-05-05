package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.swtdesigner.SwingResourceManager;

public class ErosiPanel extends JPanel {

	private JTextField textField_1;
	private JTextField textField;
	private JTable table;
	private JTextField kodePostaBerTextField;
	private JTextField kodePostaTextField;
	private JTextField segKodeTextField;
	private JTextField iraungDataTextField;
	private JTextField txartelZenbTextField;
	private JTextField jabeIzenAbTextField;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBox;
	private JTextField hiriaTextField;
	private JTextField pkTextField;
	private JTextField helbideTextField;
	private JTextField abizenakTextField;
	private JTextField izenaTextField;
	
	private JRadioButton kredituTxartelBidezRadioButton;
	private JRadioButton jasotzeanOrdainduRadioButton;
	private JPanel txartelInfo;
	
	private String stockEpostaEmanda = "";
	
	private final JPanel scrollEdukiPanel;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public ErosiPanel() {
		super();
		setLayout(new CardLayout());

		final JPanel erosketaSaskia = new JPanel();
		erosketaSaskia.setName("erosketaSaskia");
		add(erosketaSaskia, erosketaSaskia.getName());

		JLabel erosiErosketaSaskiaLabel;
		erosiErosketaSaskiaLabel = new JLabel();
		erosiErosketaSaskiaLabel.setFont(new Font("", Font.PLAIN, 18));
		erosiErosketaSaskiaLabel.setText("Erosi: Erosketa Saskia");

		JSeparator separator;
		separator = new JSeparator();

		JLabel erostekoAukeratuDituzunLabel;
		erostekoAukeratuDituzunLabel = new JLabel();
		erostekoAukeratuDituzunLabel.setFont(new Font("", Font.ITALIC, 12));
		erostekoAukeratuDituzunLabel.setText("Erosteko aukeratu dituzun artikuluen zerrenda da hau.");

		JLabel konprobaEzazuAldaketarenLabel;
		konprobaEzazuAldaketarenLabel = new JLabel();
		konprobaEzazuAldaketarenLabel.setFont(new Font("", Font.ITALIC, 12));
		konprobaEzazuAldaketarenLabel.setText("Konproba ezazu aldaketaren bat egin nahi duzun aurrera jarraitu baino lehen.");

		JButton jarraituButton;
		jarraituButton = new JButton();
		jarraituButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				changeCard("bidalketaDatuak");
			}
		});
		jarraituButton.setIcon(SwingResourceManager.getIcon(ErosiPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/right_arrow24.png"));
		jarraituButton.setText("Jarraitu");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		scrollEdukiPanel = new JPanel();
		scrollEdukiPanel.setLayout(new BoxLayout(scrollEdukiPanel, BoxLayout.Y_AXIS));
		scrollPane.setViewportView(scrollEdukiPanel);

		JLabel erosketaSaskiaLabel;
		erosketaSaskiaLabel = new JLabel();
		erosketaSaskiaLabel.setFont(new Font("", Font.BOLD, 12));
		erosketaSaskiaLabel.setText("Erosketa Saskia >");

		JLabel bidalketarenHartzailearenDatuakLabel;
		bidalketarenHartzailearenDatuakLabel = new JLabel();
		bidalketarenHartzailearenDatuakLabel.setFont(new Font("", Font.PLAIN, 12));
		bidalketarenHartzailearenDatuakLabel.setText("Bidalketaren Datuak > Ordainketa Metodoa > Eskaeraren Laburpena");
		final GroupLayout groupLayout = new GroupLayout((JComponent) erosketaSaskia);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(erosketaSaskiaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(bidalketarenHartzailearenDatuakLabel))
						.addComponent(erostekoAukeratuDituzunLabel)
						.addComponent(konprobaEzazuAldaketarenLabel)
						.addComponent(jarraituButton, GroupLayout.Alignment.TRAILING)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(erosiErosketaSaskiaLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(erosiErosketaSaskiaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erosketaSaskiaLabel)
						.addComponent(bidalketarenHartzailearenDatuakLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(erostekoAukeratuDituzunLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(konprobaEzazuAldaketarenLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jarraituButton)
					.addContainerGap())
		);
		erosketaSaskia.setLayout(groupLayout);

		final JPanel bidalketaDatuak = new JPanel();
		bidalketaDatuak.setName("bidalketaDatuak");
		add(bidalketaDatuak, bidalketaDatuak.getName());

		JLabel erosiBidalketaDatuakLabel;
		erosiBidalketaDatuakLabel = new JLabel();
		erosiBidalketaDatuakLabel.setFont(new Font("", Font.PLAIN, 18));
		erosiBidalketaDatuakLabel.setText("Erosi: Bidalketaren Hartzailearen Datuak");

		JSeparator separator_1;
		separator_1 = new JSeparator();

		JLabel mesedezAdierazItzazuLabel;
		mesedezAdierazItzazuLabel = new JLabel();
		mesedezAdierazItzazuLabel.setFont(new Font("", Font.ITALIC, 12));
		mesedezAdierazItzazuLabel.setText("Mesedez, adieraz itzazu erosketa honen hartzailearen datuak.");

		JLabel hartzailearenIzenaLabel;
		hartzailearenIzenaLabel = new JLabel();
		hartzailearenIzenaLabel.setText("Izena:");

		izenaTextField = new JTextField();

		JLabel hartzailearenAbizenakLabel;
		hartzailearenAbizenakLabel = new JLabel();
		hartzailearenAbizenakLabel.setText("Abizenak:");

		abizenakTextField = new JTextField();

		JLabel helbideaLabel;
		helbideaLabel = new JLabel();
		helbideaLabel.setText("Helbidea (Adib. Santa Korda Kalea 67, 2.Ezk):");

		helbideTextField = new JTextField();

		JLabel postakutxatilaLabel;
		postakutxatilaLabel = new JLabel();
		postakutxatilaLabel.setText("Posta-Kutxatila:");

		JLabel hiriaLabel;
		hiriaLabel = new JLabel();
		hiriaLabel.setText("Hiria:");

		JLabel probintziaLabel;
		probintziaLabel = new JLabel();
		probintziaLabel.setText("Probintzia:");

		pkTextField = new JTextField();

		hiriaTextField = new JTextField();

		comboBox = new JComboBox();

		JButton jarraituButton_1;
		jarraituButton_1 = new JButton();
		jarraituButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				changeCard("ordainketaMetodoa");
			}
		});
		jarraituButton_1.setIcon(SwingResourceManager.getIcon(ErosiPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/right_arrow24.png"));
		jarraituButton_1.setText("Jarraitu");

		JLabel erosketaSaskiaLabel_1;
		erosketaSaskiaLabel_1 = new JLabel();
		erosketaSaskiaLabel_1.setFont(new Font("", Font.PLAIN, 12));
		erosketaSaskiaLabel_1.setText("Erosketa Saskia >");

		JLabel bidalketarenDatuakLabel;
		bidalketarenDatuakLabel = new JLabel();
		bidalketarenDatuakLabel.setFont(new Font("", Font.BOLD, 12));
		bidalketarenDatuakLabel.setText("Bidalketaren Datuak >");

		JLabel ordainketaMetodoaLabel;
		ordainketaMetodoaLabel = new JLabel();
		ordainketaMetodoaLabel.setFont(new Font("", Font.PLAIN, 12));
		ordainketaMetodoaLabel.setText("Ordainketa Metodoa > Eskaeraren Laburpena");

		JButton atzeraButton;
		atzeraButton = new JButton();
		atzeraButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				changeCard("erosketaSaskia");
			}
		});
		atzeraButton.setIcon(SwingResourceManager.getIcon(ErosiPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraButton.setText("Atzera");
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) bidalketaDatuak);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(helbideTextField, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(hartzailearenAbizenakLabel)
								.addComponent(hartzailearenIzenaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(izenaTextField, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
								.addComponent(abizenakTextField, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addComponent(postakutxatilaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(pkTextField, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(hiriaLabel)
								.addComponent(probintziaLabel))
							.addGap(42, 42, 42)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout_1.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
								.addComponent(hiriaTextField, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addComponent(atzeraButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jarraituButton_1))
						.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addComponent(erosketaSaskiaLabel_1)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(bidalketarenDatuakLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(ordainketaMetodoaLabel))
						.addComponent(erosiBidalketaDatuakLabel)
						.addComponent(mesedezAdierazItzazuLabel)
						.addComponent(helbideaLabel))
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(erosiBidalketaDatuakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erosketaSaskiaLabel_1)
						.addComponent(bidalketarenDatuakLabel)
						.addComponent(ordainketaMetodoaLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(mesedezAdierazItzazuLabel)
					.addGap(17, 17, 17)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenIzenaLabel)
						.addComponent(izenaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenAbizenakLabel)
						.addComponent(abizenakTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(helbideaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(helbideTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(postakutxatilaLabel)
						.addComponent(pkTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hiriaLabel)
						.addComponent(hiriaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(probintziaLabel)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
							.addComponent(jarraituButton_1))
						.addComponent(atzeraButton))
					.addContainerGap())
		);
		bidalketaDatuak.setLayout(groupLayout_1);

		final JPanel ordainketaMetodoa = new JPanel();
		ordainketaMetodoa.setName("ordainketaMetodoa");
		add(ordainketaMetodoa, ordainketaMetodoa.getName());

		JLabel erosiOrdainketaDatuakLabel;
		erosiOrdainketaDatuakLabel = new JLabel();
		erosiOrdainketaDatuakLabel.setFont(new Font("", Font.PLAIN, 18));
		erosiOrdainketaDatuakLabel.setText("Erosi: Ordainketa Metodoa");

		JSeparator separator_2;
		separator_2 = new JSeparator();

		JLabel ordainketaEgitekoBiLabel;
		ordainketaEgitekoBiLabel = new JLabel();
		ordainketaEgitekoBiLabel.setFont(new Font("", Font.ITALIC, 12));
		ordainketaEgitekoBiLabel.setText("Ordainketa egiteko bi modu daude: kreditu txartel bidez eta jasotzean ordaintzekoa.");

		JLabel jasotzeanOrdaintzekoMetodoakLabel;
		jasotzeanOrdaintzekoMetodoakLabel = new JLabel();
		jasotzeanOrdaintzekoMetodoakLabel.setFont(new Font("", Font.ITALIC, 12));
		jasotzeanOrdaintzekoMetodoakLabel.setText("Jasotzean ordaintzeko metodoak %2ko prezio igoera suposatzen du dauzkan bidalketa");

		JLabel gastuGehigarriakDirelaLabel;
		gastuGehigarriakDirelaLabel = new JLabel();
		gastuGehigarriakDirelaLabel.setFont(new Font("", Font.ITALIC, 12));
		gastuGehigarriakDirelaLabel.setText("gastu gehigarriak direla eta. Hurrengo pantailan eskaeraren faktura ikusi daiteke.");

		JLabel aukeraEzazuOrdainketaLabel;
		aukeraEzazuOrdainketaLabel = new JLabel();
		aukeraEzazuOrdainketaLabel.setText("Aukera ezazu ordainketa metodo bat:");

		
		

		
		txartelInfo = new JPanel();
		txartelInfo.setVisible(false);
		txartelInfo.setBorder(new TitledBorder(null, "Kreditu Txartelaren Informazioa", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JLabel jabearenIzenabizenakLabel;
		jabearenIzenabizenakLabel = new JLabel();
		jabearenIzenabizenakLabel.setText("Jabearen Izen-abizenak:");

		jabeIzenAbTextField = new JTextField();

		JLabel txartelZenbakiaLabel;
		txartelZenbakiaLabel = new JLabel();
		txartelZenbakiaLabel.setText("Txartel zenbakia:");

		txartelZenbTextField = new JTextField();

		JLabel iraungitzedataLabel;
		iraungitzedataLabel = new JLabel();
		iraungitzedataLabel.setText("Iraungitze-data:");

		iraungDataTextField = new JTextField();

		JLabel uuuuhheeLabel;
		uuuuhheeLabel = new JLabel();
		uuuuhheeLabel.setText("(UUUU/hh/ee)");

		JLabel segurtasunkodeaLabel;
		segurtasunkodeaLabel = new JLabel();
		segurtasunkodeaLabel.setText("Segurtasun-kodea:");

		segKodeTextField = new JTextField();

		JLabel txartelarenAtzealdekoLauLabel;
		txartelarenAtzealdekoLauLabel = new JLabel();
		txartelarenAtzealdekoLauLabel.setText("(Txartelaren atzealdeko lau digituak)");
		
		kredituTxartelBidezRadioButton = new JRadioButton();
		kredituTxartelBidezRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent e) {
				if(kredituTxartelBidezRadioButton.isSelected()){
					txartelInfo.setVisible(true);
					panelValidation();
				}
			}
		});
		buttonGroup.add(kredituTxartelBidezRadioButton);
		kredituTxartelBidezRadioButton.setText("Kreditu txartel bidez ordaindu");

		
		jasotzeanOrdainduRadioButton = new JRadioButton();
		jasotzeanOrdainduRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent arg0) {
				if(jasotzeanOrdainduRadioButton.isSelected()){
					txartelInfo.setVisible(false);
					panelValidation();
				}
			}
		});
		jasotzeanOrdainduRadioButton.setSelected(true);
		buttonGroup.add(jasotzeanOrdainduRadioButton);
		jasotzeanOrdainduRadioButton.setText("Jasotzean ordaindu");

		JButton jarraituButton_2;
		jarraituButton_2 = new JButton();
		jarraituButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				changeCard("eskaerarenLaburpena");
			}
		});
		jarraituButton_2.setIcon(SwingResourceManager.getIcon(ErosiPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/right_arrow24.png"));
		jarraituButton_2.setText("Jarraitu");

		JLabel erosketaSaskiaLabel_2;
		erosketaSaskiaLabel_2 = new JLabel();
		erosketaSaskiaLabel_2.setFont(new Font("", Font.PLAIN, 12));
		erosketaSaskiaLabel_2.setText("Erosketa Saskia > Bidalketa Datuak >");

		JLabel ordainketaMetodoaLabel_1;
		ordainketaMetodoaLabel_1 = new JLabel();
		ordainketaMetodoaLabel_1.setFont(new Font("", Font.BOLD, 12));
		ordainketaMetodoaLabel_1.setText("Ordainketa Metodoa >");

		JLabel eskaerarenLaburpenaLabel;
		eskaerarenLaburpenaLabel = new JLabel();
		eskaerarenLaburpenaLabel.setFont(new Font("", Font.PLAIN, 12));
		eskaerarenLaburpenaLabel.setText("Eskaeraren Laburpena");

		JButton atzeraButton_1;
		atzeraButton_1 = new JButton();
		atzeraButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				changeCard("bidalketaDatuak");
			}
		});
		atzeraButton_1.setIcon(SwingResourceManager.getIcon(ErosiPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraButton_1.setText("Atzera");
		final GroupLayout groupLayout_3 = new GroupLayout((JComponent) txartelInfo);
		groupLayout_3.setHorizontalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_3.createSequentialGroup()
							.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jabearenIzenabizenakLabel)
								.addComponent(txartelZenbakiaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(txartelZenbTextField, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
								.addComponent(jabeIzenAbTextField, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
						.addGroup(groupLayout_3.createSequentialGroup()
							.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(segurtasunkodeaLabel)
								.addComponent(iraungitzedataLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(segKodeTextField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(iraungDataTextField, GroupLayout.Alignment.TRAILING))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(txartelarenAtzealdekoLauLabel)
								.addComponent(uuuuhheeLabel))))
					.addContainerGap())
		);
		groupLayout_3.setVerticalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(jabearenIzenabizenakLabel)
						.addComponent(jabeIzenAbTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(txartelZenbakiaLabel)
						.addComponent(txartelZenbTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(iraungitzedataLabel)
						.addComponent(uuuuhheeLabel)
						.addComponent(iraungDataTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(segurtasunkodeaLabel)
						.addComponent(segKodeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txartelarenAtzealdekoLauLabel))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		txartelInfo.setLayout(groupLayout_3);
		final GroupLayout groupLayout_2 = new GroupLayout((JComponent) ordainketaMetodoa);
		groupLayout_2.setHorizontalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(groupLayout_2.createSequentialGroup()
							.addComponent(erosketaSaskiaLabel_2)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(ordainketaMetodoaLabel_1)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(eskaerarenLaburpenaLabel))
						.addComponent(txartelInfo, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addGroup(groupLayout_2.createSequentialGroup()
							.addComponent(atzeraButton_1)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jarraituButton_2))
						.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(erosiOrdainketaDatuakLabel)
						.addComponent(ordainketaEgitekoBiLabel)
						.addComponent(jasotzeanOrdaintzekoMetodoakLabel)
						.addComponent(gastuGehigarriakDirelaLabel)
						.addComponent(aukeraEzazuOrdainketaLabel)
						.addGroup(groupLayout_2.createSequentialGroup()
							.addGap(12, 12, 12)
							.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(kredituTxartelBidezRadioButton)
								.addComponent(jasotzeanOrdainduRadioButton))))
					.addContainerGap())
		);
		groupLayout_2.setVerticalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(erosiOrdainketaDatuakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erosketaSaskiaLabel_2)
						.addComponent(ordainketaMetodoaLabel_1)
						.addComponent(eskaerarenLaburpenaLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ordainketaEgitekoBiLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jasotzeanOrdaintzekoMetodoakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(gastuGehigarriakDirelaLabel)
					.addGap(17, 17, 17)
					.addComponent(aukeraEzazuOrdainketaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jasotzeanOrdainduRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(kredituTxartelBidezRadioButton)
					.addGap(3, 3, 3)
					.addComponent(txartelInfo, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(jarraituButton_2)
						.addComponent(atzeraButton_1))
					.addContainerGap())
		);
		ordainketaMetodoa.setLayout(groupLayout_2);

		final JPanel eskaerarenLaburpena = new JPanel();
		eskaerarenLaburpena.setName("eskaerarenLaburpena");
		add(eskaerarenLaburpena, eskaerarenLaburpena.getName());

		JLabel erosiEskaeraranLaburpenaLabel;
		erosiEskaeraranLaburpenaLabel = new JLabel();
		erosiEskaeraranLaburpenaLabel.setFont(new Font("", Font.PLAIN, 18));
		erosiEskaeraranLaburpenaLabel.setText("Erosi: Eskaeraren Laburpena");

		JSeparator separator_3;
		separator_3 = new JSeparator();

		JButton erosketaBukatuButton;
		erosketaBukatuButton = new JButton();
		erosketaBukatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				changeCard("erosketaKodea");
			}
		});
		erosketaBukatuButton.setIcon(SwingResourceManager.getIcon(ErosiPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		erosketaBukatuButton.setText("Erosketa Bukatu");

		JLabel erosketaSaskiaLabel_3;
		erosketaSaskiaLabel_3 = new JLabel();
		erosketaSaskiaLabel_3.setFont(new Font("", Font.PLAIN, 12));
		erosketaSaskiaLabel_3.setText("Erosketa Saskia > Bidalketa Datuak > Ordainketa Metodoa >");

		JLabel eskaerarenLaburpenaLabel_1;
		eskaerarenLaburpenaLabel_1 = new JLabel();
		eskaerarenLaburpenaLabel_1.setFont(new Font("", Font.BOLD, 12));
		eskaerarenLaburpenaLabel_1.setText("Eskaeraren Laburpena");

		JButton atzeraButton_2;
		atzeraButton_2 = new JButton();
		atzeraButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				changeCard("ordainketaMetodoa");
			}
		});
		atzeraButton_2.setIcon(SwingResourceManager.getIcon(ErosiPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraButton_2.setText("Atzera");

		table = new JTable();
		final GroupLayout groupLayout_4 = new GroupLayout((JComponent) eskaerarenLaburpena);
		groupLayout_4.setHorizontalGroup(
			groupLayout_4.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_4.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(table, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addGroup(groupLayout_4.createSequentialGroup()
							.addComponent(atzeraButton_2)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(erosketaBukatuButton))
						.addGroup(groupLayout_4.createSequentialGroup()
							.addComponent(erosketaSaskiaLabel_3)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(eskaerarenLaburpenaLabel_1))
						.addComponent(erosiEskaeraranLaburpenaLabel))
					.addContainerGap())
		);
		groupLayout_4.setVerticalGroup(
			groupLayout_4.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(erosiEskaeraranLaburpenaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_4.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erosketaSaskiaLabel_3)
						.addComponent(eskaerarenLaburpenaLabel_1))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(19, 19, 19)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
					.addGroup(groupLayout_4.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(erosketaBukatuButton)
						.addComponent(atzeraButton_2))
					.addContainerGap())
		);
		eskaerarenLaburpena.setLayout(groupLayout_4);

		final JPanel erosketaKodea = new JPanel();
		erosketaKodea.setName("erosketaKodea");
		add(erosketaKodea, erosketaKodea.getName());

		JLabel erosiErosketaKodeaLabel;
		erosiErosketaKodeaLabel = new JLabel();
		erosiErosketaKodeaLabel.setFont(new Font("", Font.PLAIN, 18));
		erosiErosketaKodeaLabel.setText("Erosi: Erosketa Kodea");

		JSeparator separator_4;
		separator_4 = new JSeparator();

		JLabel zorionakZureEskaeraLabel;
		zorionakZureEskaeraLabel = new JLabel();
		zorionakZureEskaeraLabel.setText("Zorionak! zure eskaera ondo gorde da.");

		JLabel zureArtikuluakAhalLabel;
		zureArtikuluakAhalLabel = new JLabel();
		zureArtikuluakAhalLabel.setText("Zure artikuluak ahal bezain laster bidaliko dizkizugu.");

		JLabel egindakoEskaeraMomenturenLabel;
		egindakoEskaeraMomenturenLabel = new JLabel();
		egindakoEskaeraMomenturenLabel.setFont(new Font("", Font.ITALIC, 12));
		egindakoEskaeraMomenturenLabel.setText("Egindako eskaera momenturen batean aldatu, ezeztatu edo jarraitu nahi baduzu");

		JLabel erabiliOndoanEmatenLabel;
		erabiliOndoanEmatenLabel = new JLabel();
		erabiliOndoanEmatenLabel.setFont(new Font("", Font.ITALIC, 12));
		erabiliOndoanEmatenLabel.setText("erabili ondoan ematen dizugun erosketa-kodea, edo -erabiltzaile ohia bazara- erabil");

		JLabel ezazuZureErosketaLabel;
		ezazuZureErosketaLabel = new JLabel();
		ezazuZureErosketaLabel.setFont(new Font("", Font.ITALIC, 12));
		ezazuZureErosketaLabel.setText("ezazu zure Erosketa Historikoa aukera.");

		JLabel erosketaKodeaLabel;
		erosketaKodeaLabel = new JLabel();
		erosketaKodeaLabel.setText("Erosketa Kodea:");

		JLabel e012453Label;
		e012453Label = new JLabel();
		e012453Label.setBackground(new Color(255, 255, 255));
		e012453Label.setOpaque(true);
		e012453Label.setFont(new Font("", Font.BOLD, 16));
		e012453Label.setText("E012-453");

		JLabel nahiIzanezGeroLabel;
		nahiIzanezGeroLabel = new JLabel();
		nahiIzanezGeroLabel.setFont(new Font("", Font.ITALIC, 12));
		nahiIzanezGeroLabel.setText("Nahi izanez gero, erosketa kodea zure e-posta helbidera bidali diezazukegu");

		JLabel horrelaNonbaitEskuragarriLabel;
		horrelaNonbaitEskuragarriLabel = new JLabel();
		horrelaNonbaitEskuragarriLabel.setFont(new Font("", Font.ITALIC, 12));
		horrelaNonbaitEskuragarriLabel.setText("horrela nonbait eskuragarri izan dezazun. Horretarako bete ondoko informazioa:");

		JPanel kodeBidalketa;
		kodeBidalketa = new JPanel();
		kodeBidalketa.setBorder(new TitledBorder(null, "Erosketa-Kodea Jasotzeko e-Posta Helbidea", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JLabel epostaHelbideaLabel;
		epostaHelbideaLabel = new JLabel();
		epostaHelbideaLabel.setText("E-posta Helbidea:");

		kodePostaTextField = new JTextField();

		JLabel epostaBerretsiLabel;
		epostaBerretsiLabel = new JLabel();
		epostaBerretsiLabel.setText("E-posta Berretsi:");

		kodePostaBerTextField = new JTextField();
		if(!stockEpostaEmanda.equals("")){
			kodePostaBerTextField.setText(stockEpostaEmanda);
			kodePostaTextField.setText(stockEpostaEmanda);
		}

		JButton bidaliButton;
		bidaliButton = new JButton();
		bidaliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				JOptionPane jop = new JOptionPane(
                        "Zure e-posta ondo jaso da.\nLaister jasoko duzu eskatutako mezua.",
                        JOptionPane.INFORMATION_MESSAGE);
						jop.createDialog("E-posta Gordeta")
                        .setVisible(true);

			}
		});
		bidaliButton.setText("Bidali");
		final GroupLayout groupLayout_6 = new GroupLayout((JComponent) kodeBidalketa);
		groupLayout_6.setHorizontalGroup(
			groupLayout_6.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_6.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_6.createSequentialGroup()
							.addGroup(groupLayout_6.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(epostaHelbideaLabel)
								.addComponent(epostaBerretsiLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_6.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(kodePostaBerTextField, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
								.addComponent(kodePostaTextField, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
						.addComponent(bidaliButton, GroupLayout.Alignment.TRAILING))
					.addContainerGap())
		);
		groupLayout_6.setVerticalGroup(
			groupLayout_6.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_6.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaHelbideaLabel)
						.addComponent(kodePostaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_6.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaBerretsiLabel)
						.addComponent(kodePostaBerTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(bidaliButton))
		);
		kodeBidalketa.setLayout(groupLayout_6);
		final GroupLayout groupLayout_5 = new GroupLayout((JComponent) erosketaKodea);
		groupLayout_5.setHorizontalGroup(
			groupLayout_5.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_5.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(kodeBidalketa, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(separator_4, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(erosiErosketaKodeaLabel)
						.addComponent(zorionakZureEskaeraLabel)
						.addComponent(zureArtikuluakAhalLabel)
						.addComponent(egindakoEskaeraMomenturenLabel)
						.addComponent(erabiliOndoanEmatenLabel)
						.addComponent(ezazuZureErosketaLabel)
						.addGroup(groupLayout_5.createSequentialGroup()
							.addComponent(erosketaKodeaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(e012453Label))
						.addComponent(nahiIzanezGeroLabel)
						.addComponent(horrelaNonbaitEskuragarriLabel))
					.addContainerGap())
		);
		groupLayout_5.setVerticalGroup(
			groupLayout_5.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(erosiErosketaKodeaLabel)
					.addGap(8, 8, 8)
					.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(17, 17, 17)
					.addComponent(zorionakZureEskaeraLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(zureArtikuluakAhalLabel)
					.addGap(20, 20, 20)
					.addComponent(egindakoEskaeraMomenturenLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(erabiliOndoanEmatenLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ezazuZureErosketaLabel)
					.addGap(15, 15, 15)
					.addGroup(groupLayout_5.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erosketaKodeaLabel)
						.addComponent(e012453Label))
					.addGap(21, 21, 21)
					.addComponent(nahiIzanezGeroLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(horrelaNonbaitEskuragarriLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(kodeBidalketa, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		erosketaKodea.setLayout(groupLayout_5);
		//
		
		saskiaEguneratu();

		final JPanel stockAbisua = new JPanel();
		stockAbisua.setName("stockAbisua");
		add(stockAbisua, stockAbisua.getName());

		JLabel stockDagoeneanAbisuaLabel;
		stockDagoeneanAbisuaLabel = new JLabel();
		stockDagoeneanAbisuaLabel.setFont(new Font("", Font.PLAIN, 18));
		stockDagoeneanAbisuaLabel.setText("Stock Dagoenean Abisua Jaso");

		JSeparator separator_5;
		separator_5 = new JSeparator();

		JLabel aukeratuDuzunArtikuluarenLabel;
		aukeratuDuzunArtikuluarenLabel = new JLabel();
		aukeratuDuzunArtikuluarenLabel.setFont(new Font("", Font.ITALIC, 12));
		aukeratuDuzunArtikuluarenLabel.setText("Aukeratu duzun artikuluaren stock-ik ez daukagu une honetan.");

		JLabel stockaIzateanAbisuaLabel;
		stockaIzateanAbisuaLabel = new JLabel();
		stockaIzateanAbisuaLabel.setFont(new Font("", Font.ITALIC, 12));
		stockaIzateanAbisuaLabel.setText("Stock-a izatean abisua jaso nahi baduzu emaiguzu horretarako e-Posta helbide bat.");

		JButton erosketaSaskiraItzuliButton;
		erosketaSaskiraItzuliButton = new JButton();
		erosketaSaskiraItzuliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				changeCard("erosketaSaskia");
			}
		});
		erosketaSaskiraItzuliButton.setIcon(SwingResourceManager.getIcon(ErosiPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		erosketaSaskiraItzuliButton.setText("Erosketa Saskira Itzuli");

		JPanel panel;
		panel = new JPanel();

		JLabel epostaHelbideaLabel_1;
		epostaHelbideaLabel_1 = new JLabel();
		epostaHelbideaLabel_1.setText("e-Posta helbidea:");

		JLabel epostaBerretsiLabel_1;
		epostaBerretsiLabel_1 = new JLabel();
		epostaBerretsiLabel_1.setText("e-Posta Berretsi:");

		textField = new JTextField();

		textField_1 = new JTextField();

		JButton bidaliButton_1;
		bidaliButton_1 = new JButton();
		bidaliButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				stockEpostaEmanda = textField.getText();
				JOptionPane jop = new JOptionPane(
                        "Zure e-posta ondo jaso da.\nLaister jasoko duzu eskatutako mezua.",
                        JOptionPane.INFORMATION_MESSAGE);
						jop.createDialog("E-posta Gordeta").setVisible(true);
				
			}
		});
		bidaliButton_1.setText("Bidali");
		final GroupLayout groupLayout_8 = new GroupLayout((JComponent) panel);
		groupLayout_8.setHorizontalGroup(
			groupLayout_8.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_8.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_8.createSequentialGroup()
							.addGroup(groupLayout_8.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(epostaHelbideaLabel_1)
								.addComponent(epostaBerretsiLabel_1))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_8.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)))
						.addComponent(bidaliButton_1, GroupLayout.Alignment.TRAILING))
					.addContainerGap())
		);
		groupLayout_8.setVerticalGroup(
			groupLayout_8.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_8.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaHelbideaLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_8.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaBerretsiLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(bidaliButton_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(groupLayout_8);
		final GroupLayout groupLayout_7 = new GroupLayout((JComponent) stockAbisua);
		groupLayout_7.setHorizontalGroup(
			groupLayout_7.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_7.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(separator_5, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(stockDagoeneanAbisuaLabel)
						.addComponent(aukeratuDuzunArtikuluarenLabel)
						.addComponent(stockaIzateanAbisuaLabel)
						.addComponent(erosketaSaskiraItzuliButton, GroupLayout.Alignment.TRAILING))
					.addContainerGap())
		);
		groupLayout_7.setVerticalGroup(
			groupLayout_7.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(stockDagoeneanAbisuaLabel)
					.addGap(8, 8, 8)
					.addComponent(separator_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(aukeratuDuzunArtikuluarenLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(stockaIzateanAbisuaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(erosketaSaskiraItzuliButton)
					.addContainerGap())
		);
		stockAbisua.setLayout(groupLayout_7);
	}

	public void panelValidation(){
		this.revalidate();
	}
	
	public void changeCard(String destination){
		CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, destination);
	}
	
	//Erosketa saskiko elementuak eguneratzeko metodoa.
	//SaskiratutakoZapatak bektorean oinarritzen du bere informazioa.
	public void saskiaEguneratu() {
		scrollEdukiPanel.removeAll();
		for(Zapata z: SaskiratutakoZapatak.getInstance().getSaskikoZapatak()){
			scrollEdukiPanel.add(new ErosketaSaskiaItem(this,z));
		}
		
	}
	
	public static void main(String[] args){
		JFrame j = new JFrame("Frogak");
		ErosiPanel o = new ErosiPanel();
		Kudeaketa.getInstance();
		j.add(o);
		j.setSize(o.getSize());
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
