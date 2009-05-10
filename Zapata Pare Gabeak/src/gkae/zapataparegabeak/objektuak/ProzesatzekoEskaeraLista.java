package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class ProzesatzekoEskaeraLista {
	
	private static ProzesatzekoEskaeraLista instance;
	
	private Vector<ProzesatzekoEskaera> eskaeralista;

	private ProzesatzekoEskaeraLista() {
		// TODO Auto-generated constructor stub
		eskaeralista = new Vector<ProzesatzekoEskaera>();
		eskaeralista.addElement(new ProzesatzekoEskaera("E1234", "erab1", "1-Ezker-Brooks-Korritzeko zapatak", "90€", "bai", "ez"));
		eskaeralista.addElement(new ProzesatzekoEskaera("E2585", "erab2", "1-Eskuin-Diadora-Futbol botak", "83€", "ez", "bai"));
		
	} 
	
	public static ProzesatzekoEskaeraLista getInstance() {
		if (instance == null)
			instance = new ProzesatzekoEskaeraLista();
		return instance;
	}
	
	public Vector<ProzesatzekoEskaera> getProzesatzekoEskaeraLista() {
		return eskaeralista;
	}
		
		
	

}
