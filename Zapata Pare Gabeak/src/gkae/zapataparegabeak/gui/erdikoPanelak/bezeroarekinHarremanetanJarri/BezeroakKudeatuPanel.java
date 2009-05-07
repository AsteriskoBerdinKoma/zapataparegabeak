package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import java.awt.CardLayout;
import javax.swing.JLabel;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri.BezeroenListaPanela;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri.EmailIdatzi;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri.ItxarotePanela;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri.MezuBidaliaPanel;


import javax.swing.JPanel;

public class BezeroakKudeatuPanel extends JPanel {
	final EmailIdatzi emailIdatzi;
	/**
	 * Create the panel
	 */
	public BezeroakKudeatuPanel() {
		super();
		setLayout(new CardLayout());

		final BezeroenListaPanela bezeroenListaPanela = new BezeroenListaPanela(this);
		bezeroenListaPanela.setName("bezeroenListaPanela");
		add(bezeroenListaPanela, bezeroenListaPanela.getName());

		emailIdatzi = new EmailIdatzi(this);
		emailIdatzi.setName("emailIdatzi");
		add(emailIdatzi, emailIdatzi.getName());

		final ItxarotePanela itxarotePanela = new ItxarotePanela();
		itxarotePanela.setName("itxarotePanela");
		add(itxarotePanela, itxarotePanela.getName());

		final MezuBidaliaPanel mezuBidaliaPanel = new MezuBidaliaPanel();
		mezuBidaliaPanel.setName("mezuBidaliaPanel");
		add(mezuBidaliaPanel, mezuBidaliaPanel.getName());
		//
	}

	public void ikusiEmailIdatzi(String eposta) {
		// TODO Auto-generated method stub
		emailIdatzi.setEposta(eposta);
		CardLayout c = (CardLayout) this.getLayout();
		c.show(this, "emailIdatzi");
	}
	
	public void mezuaBidali() {
		MezuaBidali mb = new MezuaBidali();
		mb.start();
	}
	
	class MezuaBidali extends Thread{
		
		@Override
		public void run() {
			try {
				((CardLayout)BezeroakKudeatuPanel.this.getLayout()).show(BezeroakKudeatuPanel.this, "itxarotePanela");
				sleep(3000);
				((CardLayout)BezeroakKudeatuPanel.this.getLayout()).show(BezeroakKudeatuPanel.this, "mezuBidaliaPanel");
				sleep(8000);
				emailIdatzi.garbitu();
				((CardLayout)BezeroakKudeatuPanel.this.getLayout()).show(BezeroakKudeatuPanel.this, "bezeroenListaPanela");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void atzeraJoan() {
		// TODO Auto-generated method stub
		CardLayout c = (CardLayout) this.getLayout();
		c.show(this, "bezeroenListaPanela");
	}

}
