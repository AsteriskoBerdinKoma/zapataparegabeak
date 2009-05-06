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
		katalogoa.addElement(new Zapata (1, "Ezker", 40f,"Gizonezkoa", "Txuri/Beltz/Zilarra","Larrua","Korritzeko zapatak","Brooks",132.0f,true,"Beherapena",28.0f,true,50,true,"1.jpg"));
		katalogoa.addElement(new Zapata (2, "Ezker", 42f,"Emakumezkoa","Zilarra/Urdina/Arrosa","Larrua","Korritzeko zapatak","Saucony",98.95f,false,"ez",0.0f,true,60,true,"2.jpg" ));
		katalogoa.addElement(new Zapata (3, "Ezker", 38f,"Emakumezkoa","Zilarra","Larrua","Fashion Zapatak","Paris Hilton",63.95f,false,"ez",0.0f,true,20,true,"3.jpg" ));
		katalogoa.addElement(new Zapata (4, "Eskuin",40f,"Gizonezkoa", "Txuri/Beltz/Zilarra","Larrua","Korritzeko zapatak","Brooks",132.0f,true,"Beherapena",28.0f,true,50,true,"1.jpg"));
		katalogoa.addElement(new Zapata (5, "Ezker", 44f,"Gizonezkoa", "Marroia","Larrua","Mendiko botak","Ecco",214.95f,false,"ez",0.0f,true,32,true,"4.jpg" ));
		katalogoa.addElement(new Zapata (6, "Eskuin",38f,"Emakumezkoa","Zilarra","Larrua","Fashion Zapatak","Paris Hilton",63.95f,false,"ez",0.0f,true,20,true,"3.jpg" ));
		katalogoa.addElement(new Zapata (7, "Eskuin",35f,"Emakumezkoa","Txuria","Oihala","Ballet","Touch ups",30.95f,true,"Beherapena",5.0f,true,50,true,"5.jpg"));
		katalogoa.addElement(new Zapata (8, "Ezker", 45f,"Gizonezkoa", "Txuri-urdina","Larrua","Futbol botak","Diadora",99.95f,false,"ez",0.0f,true,60,true,"6.jpg" ));
		katalogoa.addElement(new Zapata (9, "Eskuin",36f,"Emakumezkoa","Txuria/Beltza/Laranja/Berdea/Urdina/Gorria/Grixa/Arroxa","Plastikoa","Sandaliak","Crocs",29.95f,false,"ez",0.0f,true,20,true,"7.jpg" ));
		katalogoa.addElement(new Zapata (10,"Ezker", 40f,"Emakumezkoa","Txuri/Beltz/Urdina/Gorria","Oihala","Casual","Keds",29.99f,true,"Beherapena",28.0f,true,5,true,"8.jpg"));
		katalogoa.addElement(new Zapata (11,"Ezker", 43f,"Emakumezkoa","Zilarra/Urdina/Arrosa","Larrua","Korritzeko zapatak","Saucony",98.95f,false,"ez",0.0f,true,60,true,"2.jpg" ));
		katalogoa.addElement(new Zapata (12,"Ezker", 34f,"Emakumezkoa","Zilarra","Larrua","Fashion Zapatak","Paris Hilton",63.95f,false,"ez",0.0f,true,20,true,"3.jpg" ));
		katalogoa.addElement(new Zapata (13,"Eskuin",32f,"Gizonezkoa", "Urdin-horia","Neoprenoa","Sandalia","Stride Rite",34.95f,true,"Beherapena",5.0f,true,50,true,"9.jpg"));
		katalogoa.addElement(new Zapata (14,"Ezker", 45f,"Gizonezkoa", "Beltza/Marroia","Larrua","Urban","Skechers",71.95f,false,"ez",0.0f,true,60,true,"10.jpg" ));
		katalogoa.addElement(new Zapata (15,"Eskuin",37f,"Emakumezkoa","Beltza/Marroia/Cognac","Larrua","Sandaliak","Jessica Simpson",89.95f,false,"ez",0.0f,true,20,true,"11.jpg" ));
		katalogoa.addElement(new Zapata (16,"Ezker", 37f,"Emakumezkoa","Txuri/Beltz/Urdina/Gorria","Oihala","Casual","Keds",29.99f,true,"Beherapena",28.0f,true,5,true,"8.jpg"));
		katalogoa.addElement(new Zapata (17,"Ezker", 34f,"Emakumezkoa","Iguana/Urdina","Larrua","Kirol zapatak","Keen",99.95f,false,"ez",0.0f,true,60,true,"12.jpg" ));
		katalogoa.addElement(new Zapata (18,"Eskuin",43f,"Gizonezkoa", "Beltza/Marroia","Larrua","Oxford","Rockport",89.95f,true,"Beherapena",5.0f,true,50,true,"13.jpg"));
		katalogoa.addElement(new Zapata (19,"Ezker", 45f,"Gizonezkoa", "Beltza/Marroia","Larrua","Nautikoak","Diadora",75.00f,false,"ez",0.0f,true,60,true,"14.jpg" ));
		katalogoa.addElement(new Zapata (20,"Eskuin",36f,"Emakumezkoa","Urdina/fuksia","Plastikoa","Takoidunak","Jessica Simpson",78.95f,false,"ez",0.0f,true,20,true,"15.jpg" ));
		katalogoa.addElement(new Zapata (21,"Ezker", 40f,"Emakumezkoa","Zerua/Beltz/Urdina/Urrea/Zucca","Larrua","Sandaliak","Born",89.95f,true,"Beherapena",28.0f,true,5,true,"16.jpg"));
		katalogoa.addElement(new Zapata (22,"Ezker", 43f,"Emakumezkoa","Beltza/Cognac","Larrua","Negozio zapatak","Enzo Angiolini",68.95f,false,"ez",0.0f,true,60,true,"17.jpg" ));
		
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
