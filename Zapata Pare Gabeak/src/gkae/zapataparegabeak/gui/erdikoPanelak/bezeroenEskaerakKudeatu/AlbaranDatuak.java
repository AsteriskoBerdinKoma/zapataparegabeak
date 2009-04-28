package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class AlbaranDatuak extends JPanel {

	private JTextField textField_1;
	/**
	 * Create the panel
	 */
	public AlbaranDatuak() {
		super();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");

		textField_1 = new JTextField();

		JLabel bezeroenEskaerenListaLabel;
		bezeroenEskaerenListaLabel = new JLabel();
		bezeroenEskaerenListaLabel.setText("Albaranaren Datuak");

		JButton inprimatuButton;
		inprimatuButton = new JButton();
		inprimatuButton.setText("Inprimatu");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.setText("Itzuli");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(bezeroenEskaerenListaLabel, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
							.addGap(6, 6, 6)
							.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(170, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71, 71, 71)
					.addComponent(inprimatuButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
					.addComponent(itzuliButton)
					.addGap(109, 109, 109))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroenEskaerenListaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(13, 13, 13)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1, 1, 1)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(inprimatuButton)
						.addComponent(itzuliButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
