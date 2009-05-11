package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileakKudeatu;

import gkae.zapataparegabeak.objektuak.Hornitzailea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import com.swtdesigner.SwingResourceManager;

public class DatuakEditatu extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HornitzaileDatuakPanela hornitzaileDatuakPanela;
	private Hornitzailea h;

	/**
	 * Create the dialog
	 */
	public DatuakEditatu() {
		super();
		setTitle("Hornitzailearen datuak editatu");

		hornitzaileDatuakPanela = new HornitzaileDatuakPanela();

		JButton aldaketakOnartuButton;
		aldaketakOnartuButton = new JButton();
		aldaketakOnartuButton.setHorizontalAlignment(SwingConstants.LEFT);
		aldaketakOnartuButton.setIcon(SwingResourceManager.getIcon(DatuakEditatu.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		aldaketakOnartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
//				if (h == null) {
//					h = new Hornitzailea(HornitzaileZerrenda.getInstance()
//							.getZerrenda().lastElement().getId() + 1,
//							hornitzaileDatuakPanela.getIzena(),
//							hornitzaileDatuakPanela.getHelbidea(), Integer
//									.parseInt(hornitzaileDatuakPanela
//											.getTelefonoa()),
//							hornitzaileDatuakPanela.getePosta());
//					HornitzaileZerrenda.getInstance().hornitzaileaGehitu(h);
//				} else {
					h.setIzena(hornitzaileDatuakPanela.getIzena());
					h.setHelbidea(hornitzaileDatuakPanela.getHelbidea());
					h.setTelefonoa(Integer.parseInt(hornitzaileDatuakPanela
							.getTelefonoa()));
					h.setEPosta(hornitzaileDatuakPanela.getePosta());
				//}
				dispose();
			}
		});
		aldaketakOnartuButton.setText("Aldaketak onartu");

		JButton utziButton;
		utziButton = new JButton();
		utziButton.setHorizontalAlignment(SwingConstants.LEFT);
		utziButton.setIcon(SwingResourceManager.getIcon(DatuakEditatu.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
		utziButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		utziButton.setText("Utzi");
		final GroupLayout groupLayout = new GroupLayout(
				(JComponent) getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				GroupLayout.Alignment.TRAILING)
				.addGroup(
						groupLayout.createSequentialGroup().addContainerGap(
								302, Short.MAX_VALUE).addComponent(utziButton)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(aldaketakOnartuButton)
								.addContainerGap()).addComponent(
						hornitzaileDatuakPanela, GroupLayout.DEFAULT_SIZE, 484,
						Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				groupLayout.createSequentialGroup().addComponent(
						hornitzaileDatuakPanela, GroupLayout.PREFERRED_SIZE,
						208, GroupLayout.PREFERRED_SIZE).addPreferredGap(
						LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								groupLayout.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
										.addComponent(aldaketakOnartuButton)
										.addComponent(utziButton))
						.addContainerGap()));
		getContentPane().setLayout(groupLayout);
		pack();
		//
	}

	public void setDatuak(Hornitzailea h) {

		this.h = h;
		hornitzaileDatuakPanela.setDatuak(h);
	}

}
