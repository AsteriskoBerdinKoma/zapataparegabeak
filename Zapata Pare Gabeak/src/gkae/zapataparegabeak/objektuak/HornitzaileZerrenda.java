package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class HornitzaileZerrenda {

	//Singleton instance holder
	private static HornitzaileZerrenda instance;
	
	private Vector<Hornitzailea> Hzerrenda;
	
	private HornitzaileZerrenda(){
		Hzerrenda = new Vector<Hornitzailea>();
		Hzerrenda.addElement(new Hornitzailea (1, "Zapatas Patxi","Poligono Industrial El Cojo Nº1", 943696969, "ZapatasPatxi@hotmail.com" ));
		Hzerrenda.addElement(new Hornitzailea (2, "Jony El Cojo","Poligono Industrial El Cojo Nº2", 943456327, "J.C@hotmail.com" ));
		Hzerrenda.addElement(new Hornitzailea (3, "Paco Herrero"," Avenida del Mediterraneo, 30, Elda-Alicante ", 965381225 , "PacoHerrero@hotmail.com" ));
		
	}
	
	public static HornitzaileZerrenda getInstance() {
		if (null == instance)
			instance = new HornitzaileZerrenda();
		return instance;
	}
	
	public void hornitzaileaGehitu(Hornitzailea h){
		this.Hzerrenda.addElement(h);
	}
	
	public void hornitzaileaEzabatu(Hornitzailea h){
		this.Hzerrenda.remove(h);
	}
	
	public Vector<Hornitzailea> getZerrenda(){
		return Hzerrenda;
	}
	
}
