package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class HelbideratzeDatuak extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox comboBox;
	
	private String[] probintziak = new String[]{"Araba","Albacete","Alacant","Almeria","Asturias","Avila","Badajoz",
												"Bartzelona","Balear irlak","Bizkaia","Burgos","Caceres","Cadiz","Castello",
												"Ciudad Real","Coru�a","Cuenca","Errioxa","Gipuzkoa","Girona","Granada",
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
	/**
	 * Create the panel
	 */
	public HelbideratzeDatuak() {
		super();

		JLabel helbideratzeDatuakLabel;
		helbideratzeDatuakLabel = new JLabel();
		helbideratzeDatuakLabel.setFont(new Font("", Font.PLAIN, 18));
		helbideratzeDatuakLabel.setText("Erosi: Bidalketaren Hartzailearen Datuak");

		JLabel hartzailearenIzenaLabel;
		hartzailearenIzenaLabel = new JLabel();
		hartzailearenIzenaLabel.setText("Izena:");

		JLabel hartzailearenAbizenakLabel;
		hartzailearenAbizenakLabel = new JLabel();
		hartzailearenAbizenakLabel.setText("Abizenak:");

		textField = new JTextField();

		textField_1 = new JTextField();

		JLabel helbideaadibSantaLabel;
		helbideaadibSantaLabel = new JLabel();
		helbideaadibSantaLabel.setText("Helbidea (Adib. Santa Korda Kalea 67, 2.Ezk):");

		textField_2 = new JTextField();

		JLabel postakutxatilaLabel;
		postakutxatilaLabel = new JLabel();
		postakutxatilaLabel.setText("Posta-Kutxatila:");

		textField_3 = new JTextField();

		JLabel hiriaLabel;
		hiriaLabel = new JLabel();
		hiriaLabel.setText("Hiria:");

		textField_4 = new JTextField();

		JLabel probintziaLabel;
		probintziaLabel = new JLabel();
		probintziaLabel.setText("Probintzia:");

		comboBox = new JComboBox(probintziak);

		JSeparator separator;
		separator = new JSeparator();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
							.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
								.addGap(20, 20, 20)
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
									.addComponent(helbideaadibSantaLabel)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
											.addComponent(hartzailearenIzenaLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
											.addComponent(hartzailearenAbizenakLabel))
										.addGap(24, 24, 24)
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
											.addComponent(textField, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
											.addComponent(textField_1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
											.addComponent(postakutxatilaLabel)
											.addComponent(hiriaLabel)
											.addComponent(probintziaLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(helbideratzeDatuakLabel)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(helbideratzeDatuakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(19, 19, 19)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenIzenaLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10, 10, 10)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenAbizenakLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19, 19, 19)
					.addComponent(helbideaadibSantaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(postakutxatilaLabel)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hiriaLabel)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(probintziaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(58, 58, 58))
		);
		setLayout(groupLayout);
		//
	}

}
