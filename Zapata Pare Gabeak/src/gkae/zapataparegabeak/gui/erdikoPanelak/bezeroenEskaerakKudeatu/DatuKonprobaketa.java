package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;



public class DatuKonprobaketa extends JPanel {
	
	private BezeroenEskaerakPanel owner;

	/**
	 * Create the panel
	 */
	public DatuKonprobaketa(BezeroenEskaerakPanel bezeroenEskaerakPanel) {
		super();
		owner = bezeroenEskaerakPanel;
		JLabel datuakLabel;
		datuakLabel = new JLabel();
		datuakLabel.setText("Eskaeran Sartutako Datuak:");

		JLabel onargarriakDiraLabel;
		onargarriakDiraLabel = new JLabel();
		onargarriakDiraLabel.setFont(new Font("", Font.BOLD, 26));
		onargarriakDiraLabel.setText("Onargarriak dira   /    Ez dira Onargarriak");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("emailbidalizaio");
			}
		});
		onartuButton.setText("Onartu");

		JButton kantzelatuButton;
		kantzelatuButton = new JButton();
		kantzelatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("emailbidalizaioKantzelatuta");
			}
		});
		kantzelatuButton.setText("Kantzelatu");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("bezeroekEgindakoEskaerenLista");
			}
		});
		itzuliButton.setText("Itzuli");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(79, 79, 79)
							.addComponent(onartuButton)
							.addGap(57, 57, 57)
							.addComponent(kantzelatuButton)
							.addGap(58, 58, 58)
							.addComponent(itzuliButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(datuakLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(onargarriakDiraLabel, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(262, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(87, 87, 87)
					.addComponent(datuakLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(onargarriakDiraLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(73, 73, 73)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(kantzelatuButton)
						.addComponent(itzuliButton)
						.addComponent(onartuButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
