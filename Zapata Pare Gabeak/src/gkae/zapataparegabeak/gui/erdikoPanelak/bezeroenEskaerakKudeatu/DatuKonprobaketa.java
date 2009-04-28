package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public class DatuKonprobaketa extends JPanel {

	/**
	 * Create the panel
	 */
	public DatuKonprobaketa() {
		super();

		JLabel datuakLabel;
		datuakLabel = new JLabel();
		datuakLabel.setText("Eskaeran Sartutako Datuak:");

		JLabel onargarriakDiraLabel;
		onargarriakDiraLabel = new JLabel();
		onargarriakDiraLabel.setFont(new Font("", Font.BOLD, 20));
		onargarriakDiraLabel.setText("Onargarriak dira");

		JLabel onargarriakDiraLabel_1;
		onargarriakDiraLabel_1 = new JLabel();
		onargarriakDiraLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		onargarriakDiraLabel_1.setText("Ez dira Onargarriak");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.setText("Onartu");

		JButton kantzelatuButton;
		kantzelatuButton = new JButton();
		kantzelatuButton.setText("Kantzelatu");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.setText("Itzuli");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(63, 63, 63)
							.addComponent(datuakLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(116, 116, 116)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(onargarriakDiraLabel_1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
								.addComponent(onargarriakDiraLabel, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(71, 71, 71)
							.addComponent(onartuButton)
							.addGap(48, 48, 48)
							.addComponent(kantzelatuButton)
							.addGap(47, 47, 47)
							.addComponent(itzuliButton)))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46, 46, 46)
					.addComponent(datuakLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(17, 17, 17)
					.addComponent(onargarriakDiraLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(onargarriakDiraLabel_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(onartuButton)
						.addComponent(kantzelatuButton)
						.addComponent(itzuliButton))
					.addGap(35, 35, 35))
		);
		setLayout(groupLayout);
		//
	}

}
