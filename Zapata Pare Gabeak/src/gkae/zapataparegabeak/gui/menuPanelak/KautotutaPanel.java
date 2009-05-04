package gkae.zapataparegabeak.gui.menuPanelak;

import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Kudeaketa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.JXHyperlink;

public class KautotutaPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public KautotutaPanel() {
		super();
		setBorder(new TitledBorder(null, "Erabiltzailearen Aukerak",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));

		JXHyperlink datuakAldatuHyperlink;
		datuakAldatuHyperlink = new JXHyperlink();
		datuakAldatuHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Datuak aldatu panelera joan
			}
		});
		datuakAldatuHyperlink.setText("Datuak Aldatu");

		JXHyperlink saioaAmaituHyperlink;
		saioaAmaituHyperlink = new JXHyperlink();
		saioaAmaituHyperlink.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				for (ErabiltzaileInfo ei : Kudeaketa.getInstance()
						.getErabiltzaileak()) {
					if (ei.isKautotutaDago()) {
						ei.setKautotutaDago(false);
					}
				}
				// Kautotze leihora itzuli

			}
		});
		saioaAmaituHyperlink.setText("Saioa Amaitu");

		JLabel kaixoLabel;
		kaixoLabel = new JLabel();
		kaixoLabel.setText("Kaixo, Ezezagun");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				groupLayout.createSequentialGroup().addContainerGap().addGroup(
						groupLayout.createParallelGroup(
								GroupLayout.Alignment.LEADING).addComponent(
								saioaAmaituHyperlink,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE).addComponent(
								datuakAldatuHyperlink,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE).addComponent(
								kaixoLabel)).addContainerGap(398,
						Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				groupLayout.createSequentialGroup().addComponent(kaixoLabel)
						.addGap(17, 17, 17).addComponent(datuakAldatuHyperlink,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE).addPreferredGap(
								LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(saioaAmaituHyperlink,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE).addContainerGap(
								278, Short.MAX_VALUE)));
		setLayout(groupLayout);
		//
	}

}
