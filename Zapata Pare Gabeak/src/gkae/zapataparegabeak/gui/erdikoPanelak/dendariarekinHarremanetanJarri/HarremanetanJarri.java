package gkae.zapataparegabeak.gui.erdikoPanelak.dendariarekinHarremanetanJarri;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;

public class HarremanetanJarri extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JComboBox comboBox;
	private JTextField textField_1;
	private JTextField textField;
	/**
	 * Create the panel
	 */
	public HarremanetanJarri() {
		super();

		JLabel harremanetanJarriLabel;
		harremanetanJarriLabel = new JLabel();
		harremanetanJarriLabel.setText("Harremanetan Jarri");

		JLabel izenaLabel;
		izenaLabel = new JLabel();
		izenaLabel.setText("Izena:");

		JLabel epostaLabel;
		epostaLabel = new JLabel();
		epostaLabel.setText("E-posta:");

		JLabel motaLabel;
		motaLabel = new JLabel();
		motaLabel.setText("Mota:");

		textField = new JTextField();

		textField_1 = new JTextField();

		comboBox = new JComboBox();

		JLabel mezuaLabel;
		mezuaLabel = new JLabel();
		mezuaLabel.setText("Mezua:");

		JButton bidaliButton;
		bidaliButton = new JButton();
		bidaliButton.setText("Bidali");

		JTextPane textPane;
		textPane = new JTextPane();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(textPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(harremanetanJarriLabel)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(epostaLabel)
										.addComponent(izenaLabel)
										.addComponent(motaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(textField_1)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE))
						.addComponent(bidaliButton, GroupLayout.Alignment.TRAILING)
						.addComponent(mezuaLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(harremanetanJarriLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(izenaLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(motaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17, 17, 17)
					.addComponent(mezuaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(bidaliButton)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
