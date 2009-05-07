package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import org.jdesktop.swingx.JXHyperlink;
import com.swtdesigner.SwingResourceManager;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.gui.menuPanelak.BezeroMenuPanela;

public class MenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private NagusiaPanel jabea;
	
	/**
	 * Create the panel
	 */
	public MenuPanel(NagusiaPanel jabea) {
		super();
		
		this.jabea = jabea;

		BezeroMenuPanela bezeroMenuPanela;
		bezeroMenuPanela = new BezeroMenuPanela(this.jabea);

		JXHyperlink produktuBerrienakHyperlink;
		produktuBerrienakHyperlink = new JXHyperlink();
		produktuBerrienakHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				MenuPanel.this.jabea.ikusiHarremanetanJarriPanela();
			}
		});
		produktuBerrienakHyperlink.setIcon(SwingResourceManager.getIcon(MenuPanel.class, "/gkae/zapataparegabeak/resources/ikonoak/email24.png"));
		produktuBerrienakHyperlink.setFont(new Font("Dialog", Font.BOLD, 14));
		produktuBerrienakHyperlink.setText("Harremanetan jarri");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bezeroMenuPanela, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(produktuBerrienakHyperlink, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(299, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(bezeroMenuPanela, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(produktuBerrienakHyperlink, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
