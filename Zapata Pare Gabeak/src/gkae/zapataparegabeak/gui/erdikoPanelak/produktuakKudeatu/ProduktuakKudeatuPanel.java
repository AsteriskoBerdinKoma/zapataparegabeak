package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import java.awt.CardLayout;
import javax.swing.JPanel;
import gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu.ProduktuakKudeatu;
import gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu.ProduktuDatuak;

public class ProduktuakKudeatuPanel extends JPanel {

	/**
	 * Create the panel
	 */
	public ProduktuakKudeatuPanel() {
		super();
		setLayout(new CardLayout());

		final ProduktuakKudeatu produktuakKudeatu = new ProduktuakKudeatu(this);
		produktuakKudeatu.setName("produktuakKudeatu");
		add(produktuakKudeatu, produktuakKudeatu.getName());
		//
	}

}
