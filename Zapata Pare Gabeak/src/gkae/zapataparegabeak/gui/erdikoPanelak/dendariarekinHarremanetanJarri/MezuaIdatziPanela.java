package gkae.zapataparegabeak.gui.erdikoPanelak.dendariarekinHarremanetanJarri;

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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;

public class MezuaIdatziPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextArea textArea;
	private JTextField textField_1;
	private JTextField textField;
	private JComboBox comboBox;
	private JTextArea oharraBatekinTextArea;
	
	private HarremanetanJarriPanela jabea;
	
	/**
	 * Create the panel
	 */
	public MezuaIdatziPanela(HarremanetanJarriPanela jabea) {
		super();

		this.jabea = jabea;
		
		oharraBatekinTextArea = new JTextArea();
		oharraBatekinTextArea.setEditable(false);
		oharraBatekinTextArea.setFont(new Font("", Font.ITALIC, 12));
		oharraBatekinTextArea.setWrapStyleWord(true);
		oharraBatekinTextArea.setLineWrap(true);
		oharraBatekinTextArea.setBorder(null);
		oharraBatekinTextArea.setBackground(UIManager.getColor("Button.background"));
		oharraBatekinTextArea.setText("Adi: Ez da derrigorrezkoa zure e-posta helbidea ematea, baina kontutan izan eman ezean ezingo duzula zure mezuaren erantzunik jaso.");

		JLabel izenaLabel;
		izenaLabel = new JLabel();
		izenaLabel.setText("Izena:");

		JLabel zureEpostaLabel;
		zureEpostaLabel = new JLabel();
		zureEpostaLabel.setText("Zure e-posta:");

		JLabel mezuMotaLabel;
		mezuMotaLabel = new JLabel();
		mezuMotaLabel.setText("Mezu mota*:");

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aukeratu mezu mota bat", "Iradokizuna", "Erreklamazioa", "Zalantza", "Itzulera", "Bestelakoa"}));

		JLabel mezuaLabel;
		mezuaLabel = new JLabel();
		mezuaLabel.setText("Mezua*:");

		textField = new JTextField();

		textField_1 = new JTextField();

		JButton bidaliButton;
		bidaliButton = new JButton();
		bidaliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				MezuaIdatziPanela.this.jabea.mezuaBidali();
			}
		});
		bidaliButton.setText("Bidali");

		JButton garbituButton;
		garbituButton = new JButton();
		garbituButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				garbitu();
			}
		});
		garbituButton.setText("Garbitu");

		JLabel oharraBatekinLabel;
		oharraBatekinLabel = new JLabel();
		oharraBatekinLabel.setFont(new Font("Dialog", Font.ITALIC, 12));
		oharraBatekinLabel.setText("Oharra: * batekin markatutako eremuak derrigorrez bete behar dira.");

		textArea = new JTextArea();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(oharraBatekinTextArea, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(garbituButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(bidaliButton))
						.addComponent(oharraBatekinLabel, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(izenaLabel)
								.addComponent(mezuMotaLabel)
								.addComponent(zureEpostaLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(mezuaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 460, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(oharraBatekinLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(oharraBatekinTextArea, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(izenaLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(zureEpostaLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(mezuMotaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(mezuaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bidaliButton)
						.addComponent(garbituButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

	public void garbitu() {
		textField.setText("");
		textField_1.setText("");
		comboBox.setSelectedIndex(0);
		textArea.setText("");
	}

}
