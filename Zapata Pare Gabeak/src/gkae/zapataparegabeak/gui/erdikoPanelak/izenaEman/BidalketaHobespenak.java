package gkae.zapataparegabeak.gui.erdikoPanelak.izenaEman;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BidalketaHobespenak extends JPanel {

	private ButtonGroup buttonGroupOrdainketa = new ButtonGroup();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_4;
	private JComboBox comboBox;
	
	private String[] probintziak = new String[]{"Araba","Albacete","Alacant","Almeria","Asturias","Avila","Badajoz",
			"Bartzelona","Balear irlak","Bizkaia","Burgos","Caceres","Cadiz","Castello",
			"Ciudad Real","Coru�a","Cuenca","Errioxa","Gipuzkoa","Girona","Granada",
			"Guadalajara","Huelva","Huesca","Jaen","Kantabria","Kordoba","Leon","Lleida",
			"Lugo","Madrilgo Erkidegoa","Malaga","Murtziako Erkidegoa","Nafarroa",
			"Ourense","Palentzia","Las Palmas","Pontevedra","Salamanca","Segovia",
			"Sevilla","Soria","Tarragona","Tenerife","Teruel","Toledo","Valentzia",
			"Valladolid","Zamora","Zaragoza"};
	
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	
	private JRadioButton jasotzeanOrdaintzekoMetodoaRadioButton;
	private JRadioButton txartelBidezkoOrdainketaRadioButton;
	private JPanel txartelInfoPanel;
	
	/**
	 * Create the panel
	 */
	public BidalketaHobespenak() {
		super();

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

		textField = new JTextField();

		textField_1 = new JTextField();

		textField_2 = new JTextField();

		JLabel postakutxatilaLabel;
		postakutxatilaLabel = new JLabel();
		postakutxatilaLabel.setText("Hartzailearen Posta-kutxatila:");

		textField_3 = new JTextField();

		JLabel probintziaLabel;
		probintziaLabel = new JLabel();
		probintziaLabel.setText("Hartzailearen Probintzia:");

		comboBox = new JComboBox(probintziak);

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

		textField_4 = new JTextField();

		textField_5 = new JTextField();

		textField_6 = new JTextField();

		JLabel uuuuhheeLabel;
		uuuuhheeLabel = new JLabel();
		uuuuhheeLabel.setText("(UUUU/hh/ee)");

		JButton bukatuBidalketaButton;
		bukatuBidalketaButton = new JButton();
		bukatuBidalketaButton.setText("Bukatu");

		JButton artikulueiBuruzkoHobespenakButton;
		artikulueiBuruzkoHobespenakButton = new JButton();
		artikulueiBuruzkoHobespenakButton.setText("Artikuluei Buruzko Hobespenak Eman");
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
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(uuuuhheeLabel))
						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(jabearenIzenabizenakLabel)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(txartelZenbakiaLabel)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(iraungitzedataLabel)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(uuuuhheeLabel))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		txartelInfoPanel.setLayout(groupLayout_1);
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
		final GroupLayout groupLayout_2 = new GroupLayout((JComponent) this);
		groupLayout_2.setHorizontalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(izenaEmanBidalketaLabel)
								.addComponent(helbideaadibSantaLabel)
								.addGroup(groupLayout_2.createSequentialGroup()
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(hartzailearenAbizenakLabel)
										.addComponent(hartzailearenIzenaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
								.addGroup(groupLayout_2.createSequentialGroup()
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(postakutxatilaLabel)
										.addComponent(probintziaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(textField_3)
										.addComponent(comboBox, 0, 135, Short.MAX_VALUE))
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
										.addComponent(txartelInfoPanel, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))))))
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
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenAbizenakLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(helbideaadibSantaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(postakutxatilaLabel)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(probintziaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
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
		setLayout(groupLayout_2);
	}

	public void panelValidation(){
		this.revalidate();
	}
	
//	public static void main(String[] args){
//		JFrame j = new JFrame("Frogak");
//		BidalketaHobespenak o = new BidalketaHobespenak();
//		j.add(o);
//		j.setSize(o.getSize());
//		j.setVisible(true);
//		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
}
