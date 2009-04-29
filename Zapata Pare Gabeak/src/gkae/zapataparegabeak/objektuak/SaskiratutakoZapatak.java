package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class SaskiratutakoZapatak {
	
	//Singleton pattern instance
	private static SaskiratutakoZapatak instance;
	
	private Vector<Zapata> saskikoZapatak;
	

	private SaskiratutakoZapatak(){
		saskikoZapatak = new Vector<Zapata>();
		saskikoZapatak.addElement(new Zapata (1,"Ezker",40f,"Gizonezkoa","Txuri/Beltz/Zilarra","Larrua","Korritzeko zapatak","Brooks",132.0f,true,"Beherapena",28.0f,true,50,true,"1.jpg"));
		saskikoZapatak.addElement(new Zapata (2,"Ezker",42f,"Emakumezkoa","Zilarra/Urdina/Arrosa","Larrua","Korritzeko zapatak","Saucony",98.95f,false,"ez",0.0f,true,60,true,"2.jpg" ));
		
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
