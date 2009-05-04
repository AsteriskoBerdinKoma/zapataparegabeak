package gkae.zapataparegabeak.gui.erdikoPanelak.erabiltzailearenDatuakAldatu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class DatuakAldatuPanela extends JPanel {

	private JTextField textField_1;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ButtonGroup buttonGroup_2 = new ButtonGroup();
	private ButtonGroup buttonGroup_1 = new ButtonGroup();
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField_1;
	private JPasswordField passwordField;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField;
	private JCheckBox ordaintzekoMetodoaCheckBox;
	private JRadioButton txartelBidezRadioButton;
	private JRadioButton jasotzeanOrdainduRadioButton;
	private JRadioButton emakumezkoaRadioButton;
	private JRadioButton gizonezkoaRadioButton;
	private JCheckBox generoaCheckBox;
	private JRadioButton ezkerraRadioButton;
	private JRadioButton eskuinaRadioButton;
	private JCheckBox oinaCheckBox;
	private JLabel txartelZenbakiaLabel;
	
	private ErabiltzailearenDatuakAldatuPanela jabea;

	/**
	 * Create the panel
	 */
	public DatuakAldatuPanela(ErabiltzailearenDatuakAldatuPanela jabea) {
		super();

		this.jabea = jabea;
		
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
		aldaketakGordeButton.addActionListener(new AldaketakGordeAction());
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
		aldaketakGordeButton_1.addActionListener(new AldaketakGordeAction());
		aldaketakGordeButton_1.setText("Aldaketak gorde");

		txartelBidezRadioButton = new JRadioButton();
		txartelBidezRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				textField_6.setEnabled(ordaintzekoMetodoaCheckBox.isSelected() && txartelBidezRadioButton.isSelected());
				txartelZenbakiaLabel.setEnabled(ordaintzekoMetodoaCheckBox.isSelected() && txartelBidezRadioButton.isSelected());
			}
		});
		buttonGroup.add(txartelBidezRadioButton);
		txartelBidezRadioButton.setEnabled(false);
		txartelBidezRadioButton.setText("Txartel bidez");

		txartelZenbakiaLabel = new JLabel();
		txartelZenbakiaLabel.setEnabled(false);
		txartelZenbakiaLabel.setText("Txartel zenbakia:");

		textField_6 = new JTextField();
		textField_6.setEnabled(false);

		jasotzeanOrdainduRadioButton = new JRadioButton();
		jasotzeanOrdainduRadioButton.setEnabled(false);
		buttonGroup.add(jasotzeanOrdainduRadioButton);
		jasotzeanOrdainduRadioButton.setText("Jasotzean ordaindu");

		ordaintzekoMetodoaCheckBox = new JCheckBox();
		ordaintzekoMetodoaCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				txartelBidezRadioButton.setEnabled(ordaintzekoMetodoaCheckBox
						.isSelected());
				jasotzeanOrdainduRadioButton
						.setEnabled(ordaintzekoMetodoaCheckBox.isSelected());
				textField_6.setEnabled(ordaintzekoMetodoaCheckBox.isSelected() && txartelBidezRadioButton.isSelected());
				txartelZenbakiaLabel.setEnabled(ordaintzekoMetodoaCheckBox.isSelected() && txartelBidezRadioButton.isSelected());
			}
		});
		
		
		ordaintzekoMetodoaCheckBox.setText("Ordaintzeko metodoa:");

		final JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Produktuei Buruzko Hobespenak", null, panel_2, null);

		emakumezkoaRadioButton = new JRadioButton();
		emakumezkoaRadioButton.setEnabled(false);
		buttonGroup_1.add(emakumezkoaRadioButton);
		emakumezkoaRadioButton.setText("Emakumezkoa");

		gizonezkoaRadioButton = new JRadioButton();
		gizonezkoaRadioButton.setEnabled(false);
		buttonGroup_1.add(gizonezkoaRadioButton);
		gizonezkoaRadioButton.setText("Gizonezkoa");
		
		generoaCheckBox = new JCheckBox();
		generoaCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				emakumezkoaRadioButton.setEnabled(generoaCheckBox.isSelected());
				gizonezkoaRadioButton.setEnabled(generoaCheckBox.isSelected());
			}
		});
		generoaCheckBox.setText("Generoa:");

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Oin neurria:");

		ezkerraRadioButton = new JRadioButton();
		ezkerraRadioButton.setEnabled(false);
		buttonGroup_2.add(ezkerraRadioButton);
		ezkerraRadioButton.setText("Ezkerra");

		eskuinaRadioButton = new JRadioButton();
		eskuinaRadioButton.setEnabled(false);
		buttonGroup_2.add(eskuinaRadioButton);
		eskuinaRadioButton.setText("Eskuina");
		
		oinaCheckBox = new JCheckBox();
		oinaCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				ezkerraRadioButton.setEnabled(oinaCheckBox.isSelected());
				eskuinaRadioButton.setEnabled(oinaCheckBox.isSelected());
			}
		});
		oinaCheckBox.setText("Oina:");
		
		JButton aldaketakGordeButton_2;
		aldaketakGordeButton_2 = new JButton();
		aldaketakGordeButton_2.addActionListener(new AldaketakGordeAction());
		aldaketakGordeButton_2.setText("Aldaketak gorde");
		
		ezkerraRadioButton.setSelected(true);
		emakumezkoaRadioButton.setSelected(true);
		txartelBidezRadioButton.setSelected(true);
		
		ordaintzekoMetodoaCheckBox.setSelected(false);
		generoaCheckBox.setSelected(false);
		oinaCheckBox.setSelected(false);

		JLabel oinarenNeurriaGordeLabel;
		oinarenNeurriaGordeLabel = new JLabel();
		oinarenNeurriaGordeLabel.setFont(new Font("", Font.ITALIC, 12));
		oinarenNeurriaGordeLabel.setText("Oinaren neurria gorde nahi ez baduzu jarri 0 balioa");

		textField_1 = new JTextField();
		
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) panel_2);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(oinaCheckBox)
						.addComponent(generoaCheckBox)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGap(21, 21, 21)
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(eskuinaRadioButton)
								.addComponent(ezkerraRadioButton)))
						.addGroup(groupLayout_1.createSequentialGroup()
							.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout_1.createSequentialGroup()
									.addComponent(neurriaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(textField_1))
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout_1.createSequentialGroup()
									.addGap(21, 21, 21)
									.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(gizonezkoaRadioButton)
										.addComponent(emakumezkoaRadioButton))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(oinarenNeurriaGordeLabel)))
					.addContainerGap(35, Short.MAX_VALUE))
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap(345, Short.MAX_VALUE)
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
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(oinarenNeurriaGordeLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(oinaCheckBox)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ezkerraRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskuinaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
					.addComponent(aldaketakGordeButton_2)
					.addContainerGap())
		);
		panel_2.setLayout(groupLayout_1);
		//
		
		final GroupLayout groupLayout_2 = new GroupLayout((JComponent) panel_1);
		groupLayout_2.setHorizontalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap(253, Short.MAX_VALUE)
					.addComponent(aldaketakGordeButton_1)
					.addContainerGap())
				.addGroup(groupLayout_2.createSequentialGroup()
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
	}
	
	private final class AldaketakGordeAction implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			jabea.aldaketakGorde();
		}
	}

}
