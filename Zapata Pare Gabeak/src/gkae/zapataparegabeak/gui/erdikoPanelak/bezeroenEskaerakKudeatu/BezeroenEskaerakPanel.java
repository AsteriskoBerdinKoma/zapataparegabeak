package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.CardLayout;

import javax.swing.JPanel;

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

		final BezeroekEgindakoEskaerenLista bezeroekEgindakoEskaerenLista = new BezeroekEgindakoEskaerenLista(this);
		bezeroekEgindakoEskaerenLista.setName("bezeroekEgindakoEskaerenLista");
		add(bezeroekEgindakoEskaerenLista, bezeroekEgindakoEskaerenLista.getName());

		final AlbaranenLista albaranenLista = new AlbaranenLista(this);
		albaranenLista.setName("albaranenLista");
		add(albaranenLista, albaranenLista.getName());

		final DatuKonprobaketa datuKonprobaketa = new DatuKonprobaketa(this);
		datuKonprobaketa.setName("datuKonprobaketa");
		add(datuKonprobaketa, datuKonprobaketa.getName());

		final Emailbidalizaio emailbidalizaio = new Emailbidalizaio(this);
		emailbidalizaio.setName("emailbidalizaio");
		add(emailbidalizaio, emailbidalizaio.getName());

		final EmailbidalizaioKantzelatuta emailbidalizaioKantzelatuta = new EmailbidalizaioKantzelatuta(this);
		emailbidalizaioKantzelatuta.setName("emailbidalizaioKantzelatuta");
		add(emailbidalizaioKantzelatuta, emailbidalizaioKantzelatuta.getName());

		final AlbaranaSortuDa albaranaSortuDa = new AlbaranaSortuDa(this);
		albaranaSortuDa.setName("albaranaSortuDa");
		add(albaranaSortuDa, albaranaSortuDa.getName());
		//
	}
	
	public void changeCard(String destination){
		CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, destination);
	}

}
