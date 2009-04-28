package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;

public class BezeroekEgindakoEskaerenLista extends JPanel {

	private JList list_1;
	private JList list;
	/**
	 * Create the panel
	 */
	public BezeroekEgindakoEskaerenLista() {
		super();

		JLabel bezeroenEskaerenListaLabel;
		bezeroenEskaerenListaLabel = new JLabel();
		bezeroenEskaerenListaLabel.setText("Bezeroen Eskaerak Kudeatu");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		list = new JList();
		scrollPane.setCorner(JScrollPane.UPPER_LEFT_CORNER, list);

		list_1 = new JList();
		scrollPane.setViewportView(list_1);

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.setText("Itzuli");

		JButton prozesatutakoEskaerenAlbaranakButton;
		prozesatutakoEskaerenAlbaranakButton = new JButton();
		prozesatutakoEskaerenAlbaranakButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		prozesatutakoEskaerenAlbaranakButton.setText("Prozesatutako Eskaeren Albaranak");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(itzuliButton)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
							.addGap(11, 11, 11)
							.addComponent(prozesatutakoEskaerenAlbaranakButton, GroupLayout.PREFERRED_SIZE, 244, Short.MAX_VALUE))
						.addComponent(bezeroenEskaerenListaLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(bezeroenEskaerenListaLabel)
							.addGap(15, 15, 15)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(itzuliButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(142, 142, 142)
							.addComponent(prozesatutakoEskaerenAlbaranakButton, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
