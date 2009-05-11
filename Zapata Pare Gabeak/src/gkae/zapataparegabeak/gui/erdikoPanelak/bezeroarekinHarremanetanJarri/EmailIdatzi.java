package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;

import com.swtdesigner.SwingResourceManager;

public class EmailIdatzi extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
		oharraBatekinTextArea.setBackground(UIManager.getColor("Button.background"));

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

		JSeparator separator;
		separator = new JSeparator();

		JLabel bezeroekinHarremanetanJarriLabel;
		bezeroekinHarremanetanJarriLabel = new JLabel();
		bezeroekinHarremanetanJarriLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		bezeroekinHarremanetanJarriLabel.setText("Bezeroarekin Harremanetan Jarri");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(230, Short.MAX_VALUE)
					.addComponent(atzeraButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(garbituButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(bidaliButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(12, 12, 12))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12, 12, 12)
					.addComponent(oharraBatekinTextArea, GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12, 12, 12)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
					.addContainerGap(13, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addComponent(mezuaLabel, GroupLayout.Alignment.LEADING)
						.addComponent(norentzatLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addComponent(gaiaLabel, GroupLayout.Alignment.LEADING))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(testua, GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroekinHarremanetanJarriLabel)
					.addContainerGap(285, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroekinHarremanetanJarriLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(oharraBatekinTextArea, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(norentzatLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(gaiaLabel))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(mezuaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(testua, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(garbituButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(bidaliButton)
						.addComponent(atzeraButton))
					.addContainerGap())
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
