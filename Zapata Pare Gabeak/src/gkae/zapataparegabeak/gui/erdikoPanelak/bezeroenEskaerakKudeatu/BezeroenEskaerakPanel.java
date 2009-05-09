package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.CardLayout;
import javax.swing.JPanel;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu.AlbaranenLista;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu.AlbaranDatuak;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu.BezeroekEgindakoEskaerenLista;

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

		final BezeroekEgindakoEskaerenLista bezeroekEgindakoEskaerenLista = new BezeroekEgindakoEskaerenLista();
		bezeroekEgindakoEskaerenLista.setName("bezeroekEgindakoEskaerenLista");
		add(bezeroekEgindakoEskaerenLista, bezeroekEgindakoEskaerenLista.getName());

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
