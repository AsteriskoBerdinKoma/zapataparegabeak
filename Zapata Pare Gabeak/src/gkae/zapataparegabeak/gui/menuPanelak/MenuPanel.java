package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import org.jdesktop.swingx.JXHyperlink;
import com.swtdesigner.SwingResourceManager;
import gkae.zapataparegabeak.gui.menuPanelak.BezeroMenuPanela;

public class MenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public MenuPanel() {
		super();

		BezeroMenuPanela bezeroMenuPanela;
		bezeroMenuPanela = new BezeroMenuPanela();

		JXHyperlink produktuBerrienakHyperlink;
		produktuBerrienakHyperlink = new JXHyperlink();
		produktuBerrienakHyperlink.setIcon(SwingResourceManager.getIcon(MenuPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/email24.png"));
		produktuBerrienakHyperlink.setFont(new Font("Dialog", Font.BOLD, 14));
		produktuBerrienakHyperlink.setText("Harremanetan jarri");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bezeroMenuPanela, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(produktuBerrienakHyperlink, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(bezeroMenuPanela, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(produktuBerrienakHyperlink, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
