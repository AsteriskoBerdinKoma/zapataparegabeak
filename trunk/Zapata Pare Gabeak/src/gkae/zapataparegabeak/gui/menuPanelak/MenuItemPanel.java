package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import org.jdesktop.swingx.JXHyperlink;

public class MenuItemPanel extends JPanel {

	private JPanel panel;
	
	/**
	 * Create the panel
	 */
	public MenuItemPanel() {
		super();

		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JXHyperlink hyperlink;
		hyperlink = new JXHyperlink();
		hyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				panel.setVisible(!panel.isVisible());
			}
		});
		hyperlink.setText("New JXHyperlink");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(hyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24, 24, 24)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(hyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
