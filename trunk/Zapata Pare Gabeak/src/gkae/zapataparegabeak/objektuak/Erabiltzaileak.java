package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class Erabiltzaileak {
	
	//Singleton instance holder
	private static Erabiltzaileak instance;
	
	private Vector<ErabiltzaileInfo> users;
	
	private Erabiltzaileak(){
		users = new Vector<ErabiltzaileInfo>();
		ErabiltzaileInfo admin = new ErabiltzaileInfo("peru","admin@zapatapg.net","peru");
		admin.setAdmin(true);
		users.addElement(admin);
		users.addElement(new ErabiltzaileInfo("erosle1","erosle1@mail.com","erosle1"));
	}
	
	public static Erabiltzaileak getInstance() {
		if (null == instance)
			instance = new Erabiltzaileak();
		return instance;
	}
	
	public void erabGehitu(ErabiltzaileInfo erabBerri){
		this.users.add(erabBerri);
	}

	public Vector<ErabiltzaileInfo> getErabZerrenda() {
		return this.users;
		
	}
	

}
