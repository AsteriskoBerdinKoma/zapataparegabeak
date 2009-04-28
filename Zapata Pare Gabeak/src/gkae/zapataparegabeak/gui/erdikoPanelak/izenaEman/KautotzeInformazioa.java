package gkae.zapataparegabeak.gui.erdikoPanelak.izenaEman;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import com.swtdesigner.SwingResourceManager;

public class KautotzeInformazioa extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_3;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField;
	/**
	 * Create the panel
	 */
	public KautotzeInformazioa() {
		super();

		JLabel izenaEmanKautotzeLabel;
		izenaEmanKautotzeLabel = new JLabel();
		izenaEmanKautotzeLabel.setFont(new Font("Sans", Font.PLAIN, 18));
		izenaEmanKautotzeLabel.setText("Izena Eman: Kautotze Informazioa");

		JSeparator separator;
		separator = new JSeparator();

		JLabel oharraBatekinLabel;
		oharraBatekinLabel = new JLabel();
		oharraBatekinLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		oharraBatekinLabel.setText("Oharra: * batekin markatutako eremuak derrigorrez bete behar dira.");

		JLabel erabiltzaileIzenaLabel;
		erabiltzaileIzenaLabel = new JLabel();
		erabiltzaileIzenaLabel.setText("Erabiltzaile Izena*:");

		textField = new JTextField();

		JLabel epostaHelbideaLabel;
		epostaHelbideaLabel = new JLabel();
		epostaHelbideaLabel.setText("E-Posta helbidea*:");

		textField_1 = new JTextField();

		JLabel pasahitzaLabel;
		pasahitzaLabel = new JLabel();
		pasahitzaLabel.setText("Pasahitza*:");

		passwordField = new JPasswordField();

		JLabel pasahitzaBerretsiLabel;
		pasahitzaBerretsiLabel = new JLabel();
		pasahitzaBerretsiLabel.setText("Pasahitza berretsi*:");

		JLabel epostaBerretsiLabel;
		epostaBerretsiLabel = new JLabel();
		epostaBerretsiLabel.setText("E-Posta berretsi*:");

		textField_2 = new JTextField();

		passwordField_1 = new JPasswordField();

		JLabel mesedezIdatziItzazuLabel;
		mesedezIdatziItzazuLabel = new JLabel();
		mesedezIdatziItzazuLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		mesedezIdatziItzazuLabel.setText("Mesedez idatzi itzazu irudiko hizkiak azpiko kutxan izen emate hau");

		JLabel eraAutomatikoanEginLabel;
		eraAutomatikoanEginLabel = new JLabel();
		eraAutomatikoanEginLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		eraAutomatikoanEginLabel.setText("era automatikoan egin ez dela egiazta dezagun.");

		JLabel label;
		label = new JLabel();
		label.setIconTextGap(0);
		label.setIcon(SwingResourceManager.getIcon(KautotzeInformazioa.class, "/gkae/zapataparegabeak/resources/jcaptcha.jpg"));

		textField_3 = new JTextField();

		JButton bukatuButton;
		bukatuButton = new JButton();
		bukatuButton.setText("Bukatu");

		JButton erosketaHobespenakEmanButton;
		erosketaHobespenakEmanButton = new JButton();
		erosketaHobespenakEmanButton.setText("Bidalketa Hobespenak Eman");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(izenaEmanKautotzeLabel)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
													.addComponent(epostaHelbideaLabel)
													.addComponent(pasahitzaLabel)
													.addComponent(epostaBerretsiLabel)
													.addComponent(pasahitzaBerretsiLabel)
													.addComponent(erabiltzaileIzenaLabel))
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
													.addComponent(textField, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
													.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
													.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
													.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
													.addComponent(passwordField_1, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))
											.addComponent(oharraBatekinLabel))
										.addGap(219, 219, 219))
									.addComponent(mesedezIdatziItzazuLabel)
									.addComponent(eraAutomatikoanEginLabel))
								.addGap(0, 0, 0)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addComponent(textField_3, GroupLayout.Alignment.LEADING)
								.addComponent(label, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 169, Short.MAX_VALUE)
								.addComponent(bukatuButton))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(erosketaHobespenakEmanButton)
							.addGap(233, 233, 233))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(izenaEmanKautotzeLabel)
					.addGap(10, 10, 10)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(16, 16, 16)
					.addComponent(oharraBatekinLabel)
					.addGap(24, 24, 24)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erabiltzaileIzenaLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaHelbideaLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(epostaBerretsiLabel)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pasahitzaLabel)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pasahitzaBerretsiLabel)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19, 19, 19)
					.addComponent(mesedezIdatziItzazuLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eraAutomatikoanEginLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bukatuButton)
						.addComponent(erosketaHobespenakEmanButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
