package gkae.zapataparegabeak.objektuak;

import gkae.zapataparegabeak.gui.erdikoPanelak.erosi.ErosketaSaskia;
import gkae.zapataparegabeak.gui.erdikoPanelak.erosi.ErosketaSaskiaItem;

import java.util.Vector;

public class Kudeaketa {
	
	private static Kudeaketa instance;
	
	private final SaskiratutakoZapatak saskiZap;
	private final Katalogoa katalogoa;
	private final ErosketaSaskia saskia;
	private final Erabiltzaileak erabiltzaileak;
	
	
	private Kudeaketa() {
		this.saskiZap = SaskiratutakoZapatak.getInstance();
		this.katalogoa = Katalogoa.getInstance();
		this.saskia = ErosketaSaskia.getInstance();
		this.erabiltzaileak = Erabiltzaileak.getInstance();
	}

	public static Kudeaketa getInstance() {
		if (null == instance)
			instance = new Kudeaketa();
		return instance;
	}
	
	public void zapataSaskiratu(Zapata z){
		this.saskiZap.saskiraGehitu(z);
	}
	
	public void zapataSaskitikKendu(Zapata z){
		this.saskiZap.saskitikKendu(z);
	}
	
	public Vector<Zapata> saskikoZapatak(){
		return this.saskiZap.getSaskikoZapatak();
	}

	public void saskiaEguneratu(ErosketaSaskiaItem erosketaSaskiaItem) {
		this.saskia.edukiakEguneratu(erosketaSaskiaItem);
		
	}
	
	public void erabErregistratu(ErabiltzaileInfo erab){
		this.erabiltzaileak.erabGehitu(erab);
	}

}
