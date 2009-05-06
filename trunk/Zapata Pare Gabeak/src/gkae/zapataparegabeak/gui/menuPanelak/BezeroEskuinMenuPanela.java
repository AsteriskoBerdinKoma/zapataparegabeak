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
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12, 12, 12)
					.addComponent(eskaerenJarraipenaHyperlink, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerenHistorikoaHyperlink, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(erosketaSaskiaMenuPanel, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(erosketaSaskiaMenuPanel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskaerenJarraipenaHyperlink, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskaerenHistorikoaHyperlink, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}
	
	public void bezeroKautotua(boolean kautotua){
		eskaerenHistorikoaHyperlink.setVisible(kautotua);
	}

}
