package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class ProduktuEditatu extends JPanel {

	private JTextField textField_1;
	private JComboBox comboBox_1;
	/**
	 * Create the panel
	 */
	public ProduktuEditatu() {
		super();

		JLabel produktueLabel;
		produktueLabel = new JLabel();
		produktueLabel.setText("Aukeratutako Produktuaren Edizioa");

		JLabel motaLabel;
		motaLabel = new JLabel();
		motaLabel.setText("Mota:");

		comboBox_1 = new JComboBox();

		textField_1 = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");

		JButton adosButton;
		adosButton = new JButton();
		adosButton.setText("Ados");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.setText("Itzuli");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(motaLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addComponent(adosButton)
							.addComponent(produktueLabel, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
					.addGap(28, 28, 28)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(6, 6, 6)
							.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addComponent(itzuliButton))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(produktueLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(25, 25, 25)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6, 6, 6)
							.addComponent(motaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2, 2, 2)
							.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(adosButton)
						.addComponent(itzuliButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
