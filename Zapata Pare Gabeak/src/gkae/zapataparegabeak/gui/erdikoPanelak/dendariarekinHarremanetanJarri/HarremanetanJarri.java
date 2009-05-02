package gkae.zapataparegabeak.gui.erdikoPanelak.dendariarekinHarremanetanJarri;

import gkae.zapataparegabeak.gui.utils.MultiLineLabelUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
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
		harremanetanJarriLabel.setFont(new Font("", Font.PLAIN, 18));
		harremanetanJarriLabel.setText("Harremanetan Jarri");

		JLabel izenaLabel;
		izenaLabel = new JLabel();
		izenaLabel.setText("Izena:");

		JLabel epostaLabel;
		epostaLabel = new JLabel();
		epostaLabel.setToolTipText("Zurekin kontaktuan jartzeko e-posta helbidea");
		epostaLabel.setText("Zure e-posta:");

		JLabel motaLabel;
		motaLabel = new JLabel();
		motaLabel.setText("Mezu mota*:");

		textField = new JTextField();

		textField_1 = new JTextField();

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aukeratu mezu mota bat", "Iradokizuna", "Erreklamazioa", "Zalantza", "Itzulera", "Bestelakoa"}));

		JLabel mezuaLabel;
		mezuaLabel = new JLabel();
		mezuaLabel.setText("Mezua*:");

		JButton bidaliButton;
		bidaliButton = new JButton();
		bidaliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		bidaliButton.setText("Bidali");

		JTextPane textPane;
		textPane = new JTextPane();

		JSeparator separator;
		separator = new JSeparator();

		JLabel oharraBatekinLabel;
		oharraBatekinLabel = new JLabel();
		oharraBatekinLabel.setFont(new Font("Dialog", Font.ITALIC, 12));
		oharraBatekinLabel.setText("Oharra: * batekin markatutako eremuak derrigorrez bete behar dira.\nEz da derrigorrezkoa zure e-posta helbidea ematea,\nbaina kontutan izan eman ezean ezingo duzula zure mezuaren erantzunik jaso.");
		oharraBatekinLabel.setUI(new MultiLineLabelUI());

		JButton garbituButton;
		garbituButton = new JButton();
		garbituButton.setText("Garbitu");

		JLabel oharraBatekinLabel_1_1;
		oharraBatekinLabel_1_1 = new JLabel();
		oharraBatekinLabel_1_1.setFont(new Font("Dialog", Font.ITALIC, 12));
		oharraBatekinLabel_1_1.setText("eman ezean ezingo duzula zure mezuaren erantzunik jaso.");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(mezuaLabel, GroupLayout.Alignment.LEADING)
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(epostaLabel)
										.addComponent(izenaLabel)
										.addComponent(motaLabel))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap(381, Short.MAX_VALUE)
									.addComponent(garbituButton)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(bidaliButton))
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(oharraBatekinLabel))
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGap(10, 10, 10)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(separator, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(harremanetanJarriLabel)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)))))
							.addGap(4, 4, 4)))
					.addComponent(oharraBatekinLabel_1_1, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(harremanetanJarriLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(oharraBatekinLabel)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28, 28, 28)
							.addComponent(oharraBatekinLabel_1_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
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
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(mezuaLabel)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bidaliButton)
						.addComponent(garbituButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
