package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class ProduktuDatuak extends JPanel {

	private JTextField textField_1;
	private JComboBox comboBox_1;
	/**
	 * Create the panel
	 */
	public ProduktuDatuak() {
		super();

		JLabel produktueLabel;
		produktueLabel = new JLabel();
		produktueLabel.setText("Aukeratutako Produktuaren Datuak");

		JLabel motaLabel;
		motaLabel = new JLabel();
		motaLabel.setText("Mota:");

		comboBox_1 = new JComboBox();

		textField_1 = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");

		JButton editatuButton;
		editatuButton = new JButton();
		editatuButton.setText("Editatu");

		JButton ezabatuButton;
		ezabatuButton = new JButton();
		ezabatuButton.setText("Ezabatu");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.setText("Itzuli");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(produktueLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(motaLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(12, 12, 12)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(editatuButton)
									.addGap(66, 66, 66)
									.addComponent(ezabatuButton)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(itzuliButton, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(92, 92, 92)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
									.addGap(6, 6, 6)
									.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(produktueLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(25, 25, 25)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2, 2, 2)
							.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(motaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(editatuButton)
						.addComponent(ezabatuButton)
						.addComponent(itzuliButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
