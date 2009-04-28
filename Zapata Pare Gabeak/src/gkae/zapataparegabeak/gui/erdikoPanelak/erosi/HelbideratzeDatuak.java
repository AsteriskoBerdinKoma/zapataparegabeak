package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class HelbideratzeDatuak extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox comboBox;
	
	private String[] probintziak = new String[]{"Araba","Albacete","Alacant","Almeria","Asturias","Avila","Badajoz",
												"Bartzelona","Balear irlak","Bizkaia","Burgos","Caceres","Cadiz","Castello",
												"Ciudad Real","Coruña","Cuenca","Errioxa","Gipuzkoa","Girona","Granada",
												"Guadalajara","Huelva","Huesca","Jaen","Kantabria","Kordoba","Leon","Lleida",
												"Lugo","Madrilgo Erkidegoa","Malaga","Murtziako Erkidegoa","Nafarroa",
												"Ourense","Palentzia","Las Palmas","Pontevedra","Salamanca","Segovia",
												"Sevilla","Soria","Tarragona","Tenerife","Teruel","Toledo","Valentzia",
												"Valladolid","Zamora","Zaragoza"};
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	private SpringLayout springLayout;
	/**
	 * Create the panel
	 */
	public HelbideratzeDatuak() {
		super();
		springLayout = new SpringLayout();
		setLayout(springLayout);

		final JLabel helbideratzeDatuakLabel = new JLabel();
		helbideratzeDatuakLabel.setFont(new Font("", Font.PLAIN, 18));
		helbideratzeDatuakLabel.setText("Bidalketaren Hartzailearen Datuak");
		add(helbideratzeDatuakLabel);
		springLayout.putConstraint(SpringLayout.NORTH, helbideratzeDatuakLabel, 20, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, helbideratzeDatuakLabel, 15, SpringLayout.WEST, this);

		final JLabel hartzailearenIzenaLabel = new JLabel();
		hartzailearenIzenaLabel.setText("Izena:");
		add(hartzailearenIzenaLabel);
		springLayout.putConstraint(SpringLayout.EAST, hartzailearenIzenaLabel, 130, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, hartzailearenIzenaLabel, 5, SpringLayout.WEST, helbideratzeDatuakLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, hartzailearenIzenaLabel, 90, SpringLayout.NORTH, this);

		final JLabel hartzailearenAbizenakLabel = new JLabel();
		hartzailearenAbizenakLabel.setText("Abizenak:");
		add(hartzailearenAbizenakLabel);
		springLayout.putConstraint(SpringLayout.EAST, hartzailearenAbizenakLabel, 0, SpringLayout.EAST, helbideratzeDatuakLabel);
		springLayout.putConstraint(SpringLayout.WEST, hartzailearenAbizenakLabel, 0, SpringLayout.WEST, hartzailearenIzenaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, hartzailearenAbizenakLabel, 115, SpringLayout.NORTH, this);

		textField = new JTextField();
		add(textField);
		springLayout.putConstraint(SpringLayout.EAST, textField, 365, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, textField, 75, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, hartzailearenIzenaLabel);

		textField_1 = new JTextField();
		add(textField_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, hartzailearenAbizenakLabel);

		final JLabel helbideaadibSantaLabel = new JLabel();
		helbideaadibSantaLabel.setText("Helbidea (Adib. Santa Korda Kalea 67, 2.Ezk):");
		add(helbideaadibSantaLabel);
		springLayout.putConstraint(SpringLayout.EAST, helbideaadibSantaLabel, 0, SpringLayout.EAST, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, helbideaadibSantaLabel, 0, SpringLayout.WEST, hartzailearenAbizenakLabel);
		springLayout.putConstraint(SpringLayout.NORTH, helbideaadibSantaLabel, 140, SpringLayout.NORTH, this);

		textField_2 = new JTextField();
		add(textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, 175, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 5, SpringLayout.SOUTH, helbideaadibSantaLabel);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, helbideaadibSantaLabel);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, helbideaadibSantaLabel);

		final JLabel postakutxatilaLabel = new JLabel();
		postakutxatilaLabel.setText("Posta-Kutxatila:");
		add(postakutxatilaLabel);
		springLayout.putConstraint(SpringLayout.EAST, postakutxatilaLabel, 105, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, postakutxatilaLabel, 0, SpringLayout.WEST, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, postakutxatilaLabel, 200, SpringLayout.NORTH, this);

		textField_3 = new JTextField();
		add(textField_3);
		springLayout.putConstraint(SpringLayout.EAST, textField_3, 175, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 5, SpringLayout.EAST, postakutxatilaLabel);
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 184, SpringLayout.NORTH, this);

		final JLabel hiriaLabel = new JLabel();
		hiriaLabel.setText("Hiria:");
		add(hiriaLabel);
		springLayout.putConstraint(SpringLayout.NORTH, hiriaLabel, 215, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, hiriaLabel, 0, SpringLayout.WEST, postakutxatilaLabel);

		textField_4 = new JTextField();
		add(textField_4);
		springLayout.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField_2);
		springLayout.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField_3);
		springLayout.putConstraint(SpringLayout.NORTH, textField_4, 213, SpringLayout.NORTH, this);

		final JLabel probintziaLabel = new JLabel();
		probintziaLabel.setText("Probintzia:");
		add(probintziaLabel);
		springLayout.putConstraint(SpringLayout.EAST, probintziaLabel, 85, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, probintziaLabel, 0, SpringLayout.WEST, hiriaLabel);
		springLayout.putConstraint(SpringLayout.NORTH, probintziaLabel, 250, SpringLayout.NORTH, this);

		comboBox = new JComboBox(probintziak);
		add(comboBox);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 265, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, textField_4);
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 246, SpringLayout.NORTH, this);
		//
	}

}
