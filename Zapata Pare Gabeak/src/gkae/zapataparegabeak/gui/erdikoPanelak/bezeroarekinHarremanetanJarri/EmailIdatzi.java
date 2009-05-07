package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import java.awt.CardLayout;
import java.awt.Color;
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
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import com.swtdesigner.SwingResourceManager;

public class EmailIdatzi extends JPanel {

	private JTextArea oharraBatekinTextArea;
	private JComboBox comboBox_1;
	private JTextField textField;
	private BezeroakKudeatuPanel jabea;
	private JTextPane testua;
	
	
	/**
	 * Create the panel
	 */
	public EmailIdatzi(BezeroakKudeatuPanel jabea) {
		super();
		this.jabea = jabea;
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

		//JTextPane testua;
		testua = new JTextPane();

		JButton bidaliButton;
		bidaliButton = new JButton();
		bidaliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				EmailIdatzi.this.jabea.mezuaBidali();
			}
		});
		bidaliButton.setIcon(SwingResourceManager.getIcon(EmailIdatzi.class, "/gkae/zapataparegabeak/resources/ikonoak/email24.png"));
		bidaliButton.setText("Bidali");

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Baja emateko abisua","Bestelakoa"}));

		oharraBatekinTextArea = new JTextArea();
		oharraBatekinTextArea.setWrapStyleWord(true);
		oharraBatekinTextArea.setText("Adi: Erabiltzaile bati baja eman nahi bazaio, operazioa burutu aurretik mezu bat bidali behar zaio. Baja emateko mezua ez bada, mezu mota \"bestelakoa\" aukeratu mesedez.");
		oharraBatekinTextArea.setLineWrap(true);
		oharraBatekinTextArea.setFont(new Font("Dialog", Font.ITALIC, 12));
		oharraBatekinTextArea.setEditable(false);
		oharraBatekinTextArea.setBackground(new Color(238, 238, 238));

		JButton garbituButton;
		garbituButton = new JButton();
		garbituButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				garbitu();
			}
		});
		garbituButton.setIcon(SwingResourceManager.getIcon(EmailIdatzi.class, "/gkae/zapataparegabeak/resources/ikonoak/trash.png"));
		garbituButton.setText("Garbitu");

		JButton atzeraButton;
		atzeraButton = new JButton();
		atzeraButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				EmailIdatzi.this.jabea.atzeraJoan();
				garbitu();
			}
		});
		atzeraButton.setIcon(SwingResourceManager.getIcon(EmailIdatzi.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraButton.setText("Atzera");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(testua, GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(atzeraButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(garbituButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(bidaliButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(38, 38, 38)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(gaiaLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(norentzatLabel))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
							.addGap(87, 87, 87))
						.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(11, 11, 11)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(emailLabel)
								.addComponent(oharraBatekinTextArea, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
								.addComponent(mezuaLabel))))
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
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(gaiaLabel))
					.addGap(10, 10, 10)
					.addComponent(mezuaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(testua, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(garbituButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(bidaliButton)
						.addComponent(atzeraButton))
					.addGap(4, 4, 4))
		);
		setLayout(groupLayout);
		//
	}
	public void setEposta(String eposta) {
		textField.setText(eposta);
	}
	public void garbitu() {
		testua.setText("");
		comboBox_1.setSelectedIndex(0);
		
		
	}

}
