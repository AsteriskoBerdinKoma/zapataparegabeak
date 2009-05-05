package gkae.zapataparegabeak.objektuak;

import java.util.Vector;

public class SaskiratutakoZapatak {
	
	//Singleton pattern instance
	private static SaskiratutakoZapatak instance;
	
	private Vector<SaskiItem> saskikoZapatak;
	

	private SaskiratutakoZapatak(){
		saskikoZapatak = new Vector<SaskiItem>();
		saskikoZapatak.addElement(new SaskiItem(new Zapata (1,"Ezker",40f,"Gizonezkoa","Txuri/Beltz/Zilarra","Larrua","Korritzeko zapatak","Brooks",132.0f,true,"Beherapena",28.0f,true,50,true,"1.jpg"), 1));
		saskikoZapatak.addElement(new SaskiItem(new Zapata (2,"Ezker",42f,"Emakumezkoa","Zilarra/Urdina/Arrosa","Larrua","Korritzeko zapatak","Saucony",98.95f,false,"ez",0.0f,false,60,true,"2.jpg" ), 3));
		
	}
	
	public static SaskiratutakoZapatak getInstance() {
		if (null == instance)
			instance = new SaskiratutakoZapatak();
		return instance;
	}
	
	public void saskiraGehitu(Zapata z){
		saskikoZapatak.add(new SaskiItem(z, 1));
	}
	
	public void saskiraGehitu(Zapata z, int kopurua){
		saskikoZapatak.add(new SaskiItem(z, kopurua));
	}
	
	private SaskiItem bilatuSaskiItem(Zapata zapata){
		for(SaskiItem si: this.saskikoZapatak)
			if(si.getZapata() == zapata)
				return si;
		return null;
	}
	
	public void saskitikKendu(Zapata z){
		saskikoZapatak.remove(bilatuSaskiItem(z));
	}
	
	public int getSaskiratutakoKopurua(Zapata z){
		return bilatuSaskiItem(z).getKopurua();
	}
	
	public Vector<Zapata> getSaskikoZapatak() {
		Vector<Zapata> vZapatak = new Vector<Zapata>();
		for(SaskiItem z: this.saskikoZapatak)
			vZapatak.add(z.getZapata());
		return vZapatak;
	}
	
	public void setKopurua(Zapata z, int kopurua) {
		bilatuSaskiItem(z).setKopurua(kopurua);
	}
	
	private class SaskiItem{
		
		private int kopurua;
		private Zapata zapata;
		
		public SaskiItem(Zapata z, int kop) {
			this.kopurua = kop;
			this.zapata = z;
		}

		public int getKopurua() {
			return kopurua;
		}

		public void setKopurua(int kopurua) {
			this.kopurua = kopurua;
		}

		public Zapata getZapata() {
			return zapata;
		}
	}
}
