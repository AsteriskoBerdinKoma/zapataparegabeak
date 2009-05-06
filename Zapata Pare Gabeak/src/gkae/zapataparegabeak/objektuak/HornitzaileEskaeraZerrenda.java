package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class HornitzaileEskaeraZerrenda {
	//Singleton instance holder
	private static HornitzaileEskaeraZerrenda instance;
	
	private Vector<HornitzaileEskaera> HEzerrenda;
	
	private HornitzaileEskaeraZerrenda(){
		HEzerrenda = new Vector<HornitzaileEskaera>();
		HEzerrenda.addElement(new HornitzaileEskaera (111, "Zapatas Patxi", "ZapatasPatxi@hotmail.com", 40 ));
		HEzerrenda.addElement(new HornitzaileEskaera (222, "Jony El Cojo","J.C@hotmail.com", 36 ));
		HEzerrenda.addElement(new HornitzaileEskaera (333, "Paco Herrero","PacoHerrero@hotmail.com", 50 ));
		
	}

	public static HornitzaileEskaeraZerrenda getInstance() {
		if (null == instance)
			instance = new HornitzaileEskaeraZerrenda();
		return instance;
	}
	
	public void eskaeraGehitu(HornitzaileEskaera h){
		this.HEzerrenda.addElement(h);
	}
	
	public void eskaeraEzabatu(HornitzaileEskaera h){
		this.HEzerrenda.remove(h);
	}
	
	public Vector<HornitzaileEskaera> getZerrenda(){
		return HEzerrenda;
	}
}
