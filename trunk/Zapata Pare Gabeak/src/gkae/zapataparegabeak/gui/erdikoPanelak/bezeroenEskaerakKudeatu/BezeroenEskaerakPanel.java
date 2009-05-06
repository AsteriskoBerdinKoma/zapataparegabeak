package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.CardLayout;
import javax.swing.JPanel;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu.AlbaranenLista;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu.AlbaranDatuak;

public class BezeroenEskaerakPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public BezeroenEskaerakPanel() {
		super();
		setLayout(new CardLayout());

		final AlbaranenLista albaranenLista = new AlbaranenLista(this);
		albaranenLista.setName("albaranenLista");
		add(albaranenLista, albaranenLista.getName());

		final AlbaranDatuak albaranDatuak = new AlbaranDatuak();
		albaranDatuak.setName("albaranDatuak");
		add(albaranDatuak, albaranDatuak.getName());
		//
	}
	
	public void changeCard(String destination){
		CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, destination);
	}

}
