package gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;

public class KatalogoaPanela extends JPanel {

	/**
	 * Create the panel
	 */
	public KatalogoaPanela() {
		super();

		JSeparator separator;
		separator = new JSeparator();

		JLabel katalogoaLabel;
		katalogoaLabel = new JLabel();
		katalogoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		katalogoaLabel.setText("Katalogoa");

		JPanel panel;
		panel = new JPanel();

		JPanel panel_1;
		panel_1 = new JPanel();

		JPanel panel_2;
		panel_2 = new JPanel();
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) panel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout_1.createSequentialGroup()
					.addGap(24, 24, 24)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(groupLayout_1);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
						.addComponent(katalogoaLabel, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(katalogoaLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
