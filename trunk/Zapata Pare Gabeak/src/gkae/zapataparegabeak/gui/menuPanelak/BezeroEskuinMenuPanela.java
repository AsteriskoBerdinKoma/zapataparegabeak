package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import org.jdesktop.swingx.JXHyperlink;
import gkae.zapataparegabeak.gui.menuPanelak.ErosketaSaskiaMenuPanel;

public class BezeroEskuinMenuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JXHyperlink eskaerenHistorikoaHyperlink;
	
	/**
	 * Create the panel
	 */
	public BezeroEskuinMenuPanela() {
		super();

		ErosketaSaskiaMenuPanel erosketaSaskiaMenuPanel;
		erosketaSaskiaMenuPanel = new ErosketaSaskiaMenuPanel();

		JXHyperlink eskaerenJarraipenaHyperlink;
		eskaerenJarraipenaHyperlink = new JXHyperlink();
		eskaerenJarraipenaHyperlink.setFont(new Font("Dialog", Font.BOLD, 14));
		eskaerenJarraipenaHyperlink.setText("• Eskaeren jarraipena");

		eskaerenHistorikoaHyperlink = new JXHyperlink();
		eskaerenHistorikoaHyperlink.setFont(new Font("Dialog", Font.BOLD, 14));
		eskaerenHistorikoaHyperlink.setText("• Eskaeren historikoa");
		eskaerenHistorikoaHyperlink.setVisible(false);
		
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(erosketaSaskiaMenuPanel, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(eskaerenJarraipenaHyperlink, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
						.addComponent(eskaerenHistorikoaHyperlink, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(erosketaSaskiaMenuPanel, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskaerenJarraipenaHyperlink, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskaerenHistorikoaHyperlink, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}
	
	public void bezeroKautotua(boolean kautotua){
		eskaerenHistorikoaHyperlink.setVisible(kautotua);
	}

}
