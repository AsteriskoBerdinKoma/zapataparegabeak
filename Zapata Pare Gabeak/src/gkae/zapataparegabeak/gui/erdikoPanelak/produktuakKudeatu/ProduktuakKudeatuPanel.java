package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ProduktuakKudeatuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
