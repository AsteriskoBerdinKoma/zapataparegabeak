package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class Kudeaketa {
	
	private static Kudeaketa instance;
	
	private final SaskiratutakoZapatak saskiZap;
	private final Katalogoa katalogoa;

	private final Erabiltzaileak erabiltzaileak;
	
	
	private Kudeaketa() {
		this.saskiZap = SaskiratutakoZapatak.getInstance();
		this.katalogoa = Katalogoa.getInstance();
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

	
	public void erabErregistratu(ErabiltzaileInfo erab){
		this.erabiltzaileak.erabGehitu(erab);
	}
	
	public Vector<ErabiltzaileInfo> getErabiltzaileak(){
		return this.erabiltzaileak.getErabZerrenda();
	}

}
