package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public class EskaeraDatuak extends JPanel {

	/**
	 * Create the panel
	 */
	public EskaeraDatuak() {
		super();

		JLabel eskaeraDatuakLabel;
		eskaeraDatuakLabel = new JLabel();
		eskaeraDatuakLabel.setText("Eskaera Datuak");

		JButton eskuzkoOrdainketaDaButton;
		eskuzkoOrdainketaDaButton = new JButton();
		eskuzkoOrdainketaDaButton.setText("Eskuzko ordainketa da");

		JButton txartelOrdainketaDaButton;
		txartelOrdainketaDaButton = new JButton();
		txartelOrdainketaDaButton.setText("Txartel ordainketa da");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.setText("Itzuli");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(eskaeraDatuakLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(eskuzkoOrdainketaDaButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(txartelOrdainketaDaButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(itzuliButton)))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaeraDatuakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(eskuzkoOrdainketaDaButton)
						.addComponent(txartelOrdainketaDaButton)
						.addComponent(itzuliButton))
					.addGap(47, 47, 47))
		);
		setLayout(groupLayout);
		//
	}

}
