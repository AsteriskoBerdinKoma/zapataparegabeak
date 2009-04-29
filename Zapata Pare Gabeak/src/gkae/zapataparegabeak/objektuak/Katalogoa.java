package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class Katalogoa {
	
	//Singleton instance holder
	private static Katalogoa instance;
	
	private Vector<Zapata> katalogoa;
	
	//Hasierako katalogoa
	//Datuak eta irudiak lortzeko http://www.shoebuy.com
	private Katalogoa(){
		katalogoa = new Vector<Zapata>();
		katalogoa.addElement(new Zapata (1,"Ezker",40f,"Gizonezkoa","Txuri/Beltz/Zilarra","Larrua","Korritzeko zapatak","Brooks",132.0f,true,"Beherapena",28.0f,true,50,true,"1.jpg"));
		katalogoa.addElement(new Zapata (2,"Ezker",42f,"Emakumezkoa","Zilarra/Urdina/Arrosa","Larrua","Korritzeko zapatak","Saucony",98.95f,false,"ez",0.0f,true,60,true,"2.jpg" ));
		katalogoa.addElement(new Zapata (3,"Ezker",38f,"Emakumezkoa","Zilarra","Larrua","Fashion Zapatak","Paris Hilton",63.95f,false,"ez",0.0f,true,20,true,"3.jpg" ));
		
	}

	public static Katalogoa getInstance() {
		if (null == instance)
			instance = new Katalogoa();
		return instance;
	}
	
	public void zapataGehitu(Zapata z){
		this.katalogoa.addElement(z);
	}
	
	public void zapataEzabatu(Zapata z){
		this.katalogoa.remove(z);
	}
	
	public Vector<Zapata> getKatalagoa(){
		return katalogoa;
	}

}
