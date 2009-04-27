package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class SaskiratutakoZapatak {
	
	public Vector<Zapata> saskikoZapatak;
	

	public SaskiratutakoZapatak(){}
	
	public void saskiraGehitu(Zapata z){
		saskikoZapatak.add(z);
	}
	
	public void saskitikKendu(Zapata z){
		saskikoZapatak.remove(z);
	}
}
