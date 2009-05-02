package gkae.zapataparegabeak.gui.erdikoPanelak.erabiltzailearenDatuakAldatu;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class DatuakAldatuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ButtonGroup buttonGroup_2 = new ButtonGroup();
	private ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JSpinner spinner;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField_1;
	private JPasswordField passwordField;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField;
	/**
	 * Create the panel
	 */
	public DatuakAldatuPanela() {
		super();

		JTabbedPane tabbedPane;
		tabbedPane = new JTabbedPane();

		final JPanel panel = new JPanel();
		tabbedPane.addTab("Erabiltzaile Datuak", null, panel, null);

		JLabel erabiltzaileDatuakLabel;
		erabiltzaileDatuakLabel = new JLabel();
		erabiltzaileDatuakLabel.setText("E-posta helbidea:");

		JLabel pasahitzBerriaLabel;
		pasahitzBerriaLabel = new JLabel();
		pasahitzBerriaLabel.setText("Pasahitz berria:");

		JLabel pasahitzarenEgiaztapenaLabel;
		pasahitzarenEgiaztapenaLabel = new JLabel();
		pasahitzarenEgiaztapenaLabel.setText("Pasahitza berretsi:");

		textField = new JTextField();

		JButton aldaketakGordeButton;
		aldaketakGordeButton = new JButton();
		aldaketakGordeButton.setText("Aldaketak gorde");

		passwordField = new JPasswordField();

		passwordField_1 = new JPasswordField();
		final GroupLayout groupLayout_3 = new GroupLayout((JComponent) panel);
		groupLayout_3.setHorizontalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(pasahitzarenEgiaztapenaLabel)
						.addComponent(pasahitzBerriaLabel)
						.addComponent(erabiltzaileDatuakLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
							.addComponent(passwordField_1, GroupLayout.Alignment.LEADING)
							.addComponent(passwordField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout_3.createSequentialGroup()
					.addContainerGap(189, Short.MAX_VALUE)
					.addComponent(aldaketakGordeButton)
					.addContainerGap())
		);
		groupLayout_3.setVerticalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erabiltzaileDatuakLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19, 19, 19)
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pasahitzBerriaLabel)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pasahitzarenEgiaztapenaLabel)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(aldaketakGordeButton)
					.addContainerGap())
		);
		panel.setLayout(groupLayout_3);

		final JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Erosketa Datuak", null, panel_1, null);

		JLabel izenaLabel;
		izenaLabel = new JLabel();
		izenaLabel.setText("Izena:");

		JLabel abizenakLabel;
		abizenakLabel = new JLabel();
		abizenakLabel.setText("Abizenak:");

		JLabel helbideaLabel;
		helbideaLabel = new JLabel();
		helbideaLabel.setText("Helbidea:");

		textField_3 = new JTextField();

		textField_4 = new JTextField();

		textField_5 = new JTextField();

		JButton aldaketakGordeButton_1;
		aldaketakGordeButton_1 = new JButton();
		aldaketakGordeButton_1.setText("Aldaketak gorde");

		JRadioButton txartelBidezRadioButton;
		txartelBidezRadioButton = new JRadioButton();
		txartelBidezRadioButton.setSelected(true);
		buttonGroup.add(txartelBidezRadioButton);
		txartelBidezRadioButton.setText("Txartel bidez");

		JLabel txartelZenbakiaLabel;
		txartelZenbakiaLabel = new JLabel();
		txartelZenbakiaLabel.setText("Txartel zenbakia:");

		textField_6 = new JTextField();

		JRadioButton jasotzeanOrdainduRadioButton;
		jasotzeanOrdainduRadioButton = new JRadioButton();
		buttonGroup.add(jasotzeanOrdainduRadioButton);
		jasotzeanOrdainduRadioButton.setText("Jasotzean ordaindu");

		JCheckBox ordaintzekoMetodoaCheckBox;
		ordaintzekoMetodoaCheckBox = new JCheckBox();
		ordaintzekoMetodoaCheckBox.setText("Ordaintzeko metodoa:");
		final GroupLayout groupLayout_2 = new GroupLayout((JComponent) panel_1);
		groupLayout_2.setHorizontalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap(253, Short.MAX_VALUE)
					.addComponent(aldaketakGordeButton_1)
					.addContainerGap())
				.addGroup(GroupLayout.Alignment.LEADING, groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_2.createSequentialGroup()
							.addGap(21, 21, 21)
							.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout_2.createSequentialGroup()
									.addGap(21, 21, 21)
									.addComponent(txartelZenbakiaLabel)
									.addGap(12, 12, 12)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
								.addComponent(txartelBidezRadioButton)
								.addComponent(jasotzeanOrdainduRadioButton)))
						.addComponent(ordaintzekoMetodoaCheckBox)
						.addGroup(groupLayout_2.createSequentialGroup()
							.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(izenaLabel)
								.addComponent(abizenakLabel)
								.addComponent(helbideaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addComponent(textField_3, GroupLayout.Alignment.LEADING)
									.addComponent(textField_4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout_2.setVerticalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(izenaLabel)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(abizenakLabel)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(helbideaLabel)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ordaintzekoMetodoaCheckBox)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(txartelBidezRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(txartelZenbakiaLabel)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jasotzeanOrdainduRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(aldaketakGordeButton_1)
					.addContainerGap())
		);
		panel_1.setLayout(groupLayout_2);

		final JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Produktuei Buruzko Hobespenak", null, panel_2, null);

		JCheckBox generoaCheckBox;
		generoaCheckBox = new JCheckBox();
		generoaCheckBox.setText("Generoa:");

		JRadioButton emakumezkoaRadioButton;
		emakumezkoaRadioButton = new JRadioButton();
		buttonGroup_1.add(emakumezkoaRadioButton);
		emakumezkoaRadioButton.setText("Emakumezkoa");

		JRadioButton gizonezkoaRadioButton;
		gizonezkoaRadioButton = new JRadioButton();
		buttonGroup_1.add(gizonezkoaRadioButton);
		gizonezkoaRadioButton.setText("Gizonezkoa");

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Neurria:");

		spinner = new JSpinner();

		JCheckBox oinaCheckBox;
		oinaCheckBox = new JCheckBox();
		oinaCheckBox.setText("Oina:");

		JRadioButton ezkerraRadioButton;
		ezkerraRadioButton = new JRadioButton();
		buttonGroup_2.add(ezkerraRadioButton);
		ezkerraRadioButton.setText("Ezkerra");

		JRadioButton eskuinaRadioButton;
		eskuinaRadioButton = new JRadioButton();
		buttonGroup_2.add(eskuinaRadioButton);
		eskuinaRadioButton.setText("Eskuina");

		JButton aldaketakGordeButton_2;
		aldaketakGordeButton_2 = new JButton();
		aldaketakGordeButton_2.setText("Aldaketak gorde");
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) panel_2);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(oinaCheckBox)
						.addComponent(generoaCheckBox)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(21, 21, 21)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(gizonezkoaRadioButton)
								.addComponent(emakumezkoaRadioButton)))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addComponent(neurriaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(21, 21, 21)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(eskuinaRadioButton)
								.addComponent(ezkerraRadioButton))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(aldaketakGordeButton_2)
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(generoaCheckBox)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(emakumezkoaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(gizonezkoaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(neurriaLabel)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(oinaCheckBox)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ezkerraRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskuinaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(aldaketakGordeButton_2)
					.addContainerGap())
		);
		panel_2.setLayout(groupLayout_1);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
