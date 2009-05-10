package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class AlbaranLista {
	
	private static AlbaranLista instance;
	
	private Vector<Albarana> albaranLista;

	private AlbaranLista() {
		albaranLista = new Vector<Albarana>();
		albaranLista.addElement(new Albarana("A1185"));
		albaranLista.addElement(new Albarana("A1386"));
		albaranLista.addElement(new Albarana("A1549"));
		albaranLista.addElement(new Albarana("A1875"));
		
	}



	public static AlbaranLista getInstance() {
		if (instance == null)
			instance = new AlbaranLista();
		return instance;
	}
	
	public void albaranaGehitu(Albarana a){
		this.albaranLista.addElement(a);
	}
	
	public void albaranaEzabatu(Albarana a){
		this.albaranLista.remove(a);
	}


	public Vector<Albarana> getAlbaranLista() {
		return albaranLista;
	}

}
