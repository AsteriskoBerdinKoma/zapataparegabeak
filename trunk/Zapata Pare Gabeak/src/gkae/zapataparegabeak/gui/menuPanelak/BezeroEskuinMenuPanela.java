package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import org.jdesktop.swingx.JXHyperlink;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.gui.menuPanelak.ErosketaSaskiaMenuPanel;

public class BezeroEskuinMenuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JXHyperlink eskaerenHistorikoaHyperlink;
	private ErosketaSaskiaMenuPanel erosketaSaskiaMenuPanel;
	private JXHyperlink eskaerenJarraipenaHyperlink;
	
	private NagusiaPanel jabea;
	
	/**
	 * Create the panel
	 */
	public BezeroEskuinMenuPanela(NagusiaPanel jabea) {
		super();
		
		this.jabea = jabea;

		erosketaSaskiaMenuPanel = new ErosketaSaskiaMenuPanel(this.jabea);

		eskaerenJarraipenaHyperlink = new JXHyperlink();
		eskaerenJarraipenaHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				BezeroEskuinMenuPanela.this.jabea.ikusiEskaerarenJarraipenaPanela();
			}
		});
		eskaerenJarraipenaHyperlink.setFont(new Font("Dialog", Font.BOLD, 14));
		eskaerenJarraipenaHyperlink.setText("• Eskaeren jarraipena");

		eskaerenHistorikoaHyperlink = new JXHyperlink();
		eskaerenHistorikoaHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				BezeroEskuinMenuPanela.this.jabea.ikusiEskaerenHistorikoa();
			}
		});
		eskaerenHistorikoaHyperlink.setFont(new Font("Dialog", Font.BOLD, 14));
		eskaerenHistorikoaHyperlink.setText("• Eskaeren historikoa");
		eskaerenHistorikoaHyperlink.setVisible(false);
		
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(erosketaSaskiaMenuPanel, GroupLayout.PREFERRED_SIZE, 310, Short.MAX_VALUE)
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
					.addComponent(erosketaSaskiaMenuPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
		eskaerenJarraipenaHyperlink.setVisible(!kautotua);
	}

	public void saskiaEguneratu() {
		erosketaSaskiaMenuPanel.saskiaEguneratu();
	}

}
