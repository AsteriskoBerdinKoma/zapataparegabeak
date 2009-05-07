package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import com.swtdesigner.SwingResourceManager;

public class EmailIdatzi extends JPanel {

	private JTextArea oharraBatekinTextArea;
	private JComboBox comboBox_1;
	private JTextField textField;
	/**
	 * Create the panel
	 */
	public EmailIdatzi() {
		super();

		JLabel emailLabel;
		emailLabel = new JLabel();
		emailLabel.setText("E-mail");

		JLabel norentzatLabel;
		norentzatLabel = new JLabel();
		norentzatLabel.setText("Norentzat: ");

		textField = new JTextField();

		JLabel gaiaLabel;
		gaiaLabel = new JLabel();
		gaiaLabel.setText("Mota:");

		JLabel mezuaLabel;
		mezuaLabel = new JLabel();
		mezuaLabel.setText("Mezua:");

		JTextPane textPane;
		textPane = new JTextPane();

		JButton bidaliButton;
		bidaliButton = new JButton();
		bidaliButton.setIcon(SwingResourceManager.getIcon(EmailIdatzi.class, "/gkae/zapataparegabeak/resources/ikonoak/email24.png"));
		bidaliButton.setText("Bidali");

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Baja emateko abisua","Bestelakoa"}));

		oharraBatekinTextArea = new JTextArea();
		oharraBatekinTextArea.setWrapStyleWord(true);
		oharraBatekinTextArea.setText("Adi: Baja emateko mezua baldin bada, mezua bidali ondoren operazioa burutuko da. Baja emateko mezua ez bada, mezu mota \"bestelakoa\" aukeratu mesedez.");
		oharraBatekinTextArea.setLineWrap(true);
		oharraBatekinTextArea.setFont(new Font("Dialog", Font.ITALIC, 12));
		oharraBatekinTextArea.setEditable(false);
		oharraBatekinTextArea.setBackground(new Color(238, 238, 238));

		JButton garbituButton;
		garbituButton = new JButton();
		garbituButton.setIcon(SwingResourceManager.getIcon(EmailIdatzi.class, "/gkae/zapataparegabeak/resources/ikonoak/trash.png"));
		garbituButton.setText("Garbitu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(textPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(garbituButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(bidaliButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addComponent(oharraBatekinTextArea, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
						.addComponent(emailLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(norentzatLabel)
								.addComponent(gaiaLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)))
						.addComponent(mezuaLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(emailLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(oharraBatekinTextArea, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(norentzatLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(gaiaLabel)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10, 10, 10)
					.addComponent(mezuaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(garbituButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(bidaliButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
