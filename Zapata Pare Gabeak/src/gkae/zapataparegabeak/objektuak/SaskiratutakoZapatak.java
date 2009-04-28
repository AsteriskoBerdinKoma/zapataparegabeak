package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class SaskiratutakoZapatak {
	
	//Singleton pattern instance
	private static SaskiratutakoZapatak instance;
	
	private Vector<Zapata> saskikoZapatak;
	

	private SaskiratutakoZapatak(){
		saskikoZapatak = new Vector<Zapata>();
	}
	
	public void saskiraGehitu(Zapata z){
		saskikoZapatak.add(z);
	}
	
	public void saskitikKendu(Zapata z){
		saskikoZapatak.remove(z);
	}

	public static SaskiratutakoZapatak getInstance() {
		if (null == instance)
			instance = new SaskiratutakoZapatak();
		return instance;
	}

	public Vector<Zapata> getSaskikoZapatak() {
		return this.saskikoZapatak;
		
	}
}
