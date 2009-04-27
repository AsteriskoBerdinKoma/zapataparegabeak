package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class ZapataDatuak {
	
	private Vector<Zapata> z;
	
	//Datuak eta irudiak lortzeko http://www.shoebuy.com
	
	public ZapataDatuak(){
		z.addElement(new Zapata (1,"Ezker",40f,"Gizonezkoa","Txuri/Beltz/Zilarra","Larrua","Korritzeko zapatak","Brooks",132.0f,true,"Beherapena",28.0f,true,50,true,"1.jpg"));
		z.addElement(new Zapata (2,"Ezker",42f,"Emakumezkoa","Zilarra/Urdina/Arrosa","Larrua","Korritzeko zapatak","Saucony",98.95f,false,"ez",0.0f,true,60,true,"2.jpg" ));
		z.addElement(new Zapata (3,"Ezker",38f,"Emakumezkoa","Zilarra","Larrua","Fashion Zapatak","Paris Hilton",63.95f,false,"ez",0.0f,true,20,true,"3.jpg" ));
		
	}

}
