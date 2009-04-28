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

public class BidalketaHobespenak extends JPanel {

	private ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_4;
	private JComboBox comboBox;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	/**
	 * Create the panel
	 */
	public BidalketaHobespenak() {
		super();

		JLabel izenaEmanBidalketaLabel;
		izenaEmanBidalketaLabel = new JLabel();
		izenaEmanBidalketaLabel.setFont(new Font("Sans", Font.PLAIN, 18));
		izenaEmanBidalketaLabel.setText("Izena Eman: Bidalketa Hobespenak");

		JSeparator separator;
		separator = new JSeparator();

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

		comboBox = new JComboBox();

		JLabel ordainketaMotaLabel;
		ordainketaMotaLabel = new JLabel();
		ordainketaMotaLabel.setText("Ordainketa Mota Lehenetsia:");

		JRadioButton jasotzeanOrdaintzekoMetodoaRadioButton;
		jasotzeanOrdaintzekoMetodoaRadioButton = new JRadioButton();
		buttonGroup.add(jasotzeanOrdaintzekoMetodoaRadioButton);
		jasotzeanOrdaintzekoMetodoaRadioButton.setText("Jasotzean ordaintzea");

		JRadioButton txartelBidezkoOrdainketaRadioButton;
		txartelBidezkoOrdainketaRadioButton = new JRadioButton();
		buttonGroup.add(txartelBidezkoOrdainketaRadioButton);
		txartelBidezkoOrdainketaRadioButton.setText("Txartel bidezko ordainketa");

		JPanel panel;
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

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

		JButton bukatuButton;
		bukatuButton = new JButton();
		bukatuButton.setText("Bukatu");

		JButton artikulueiBuruzkoHobespenakButton;
		artikulueiBuruzkoHobespenakButton = new JButton();
		artikulueiBuruzkoHobespenakButton.setText("Artikuluei Buruzko Hobespenak Eman");
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) panel);
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
		panel.setLayout(groupLayout_1);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(izenaEmanBidalketaLabel)
								.addComponent(helbideaadibSantaLabel)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(hartzailearenAbizenakLabel)
										.addComponent(hartzailearenIzenaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(postakutxatilaLabel)
										.addComponent(probintziaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(textField_3)
										.addComponent(comboBox, 0, 135, Short.MAX_VALUE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE))
								.addComponent(ordainketaMotaLabel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(47, 47, 47)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(txartelBidezkoOrdainketaRadioButton)
								.addComponent(jasotzeanOrdaintzekoMetodoaRadioButton)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(21, 21, 21)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(bukatuButton)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(artikulueiBuruzkoHobespenakButton))
										.addComponent(panel, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(izenaEmanBidalketaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(15, 15, 15)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenIzenaLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(hartzailearenAbizenakLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(helbideaadibSantaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(postakutxatilaLabel)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(probintziaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(25, 25, 25)
					.addComponent(ordainketaMotaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jasotzeanOrdaintzekoMetodoaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(txartelBidezkoOrdainketaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bukatuButton)
						.addComponent(artikulueiBuruzkoHobespenakButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
