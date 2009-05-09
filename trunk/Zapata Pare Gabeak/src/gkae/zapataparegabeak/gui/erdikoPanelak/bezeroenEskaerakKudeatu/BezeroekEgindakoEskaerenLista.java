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

		JButton prozesatutakoEskaerenAlbaranakButton;
		prozesatutakoEskaerenAlbaranakButton = new JButton();
		prozesatutakoEskaerenAlbaranakButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		prozesatutakoEskaerenAlbaranakButton.setText("Albaranak ikusi");

		JButton eskuzkoProzesamenduaButton;
		eskuzkoProzesamenduaButton = new JButton();
		eskuzkoProzesamenduaButton.setText("Eskuzko prozesamendua");

		JButton txartelBidezkoProzesamenduaButton;
		txartelBidezkoProzesamenduaButton = new JButton();
		txartelBidezkoProzesamenduaButton.setText("Txartel bidezko prozesamendua");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(45, 45, 45)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(txartelBidezkoProzesamenduaButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(eskuzkoProzesamenduaButton, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bezeroenEskaerenListaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
							.addComponent(prozesatutakoEskaerenAlbaranakButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bezeroenEskaerenListaLabel)
							.addGap(38, 38, 38)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(prozesatutakoEskaerenAlbaranakButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
							.addComponent(eskuzkoProzesamenduaButton)
							.addGap(5, 5, 5)
							.addComponent(txartelBidezkoProzesamenduaButton)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
