package gkae.zapataparegabeak.objektuak;

public class EskaeraElementua {
	
	private Zapata zapata;
	private int kopurua;
	private String egoera;
	private String erosketaData;
	private String bildaketaData;
	private boolean atzerapenaDago;
	
	public EskaeraElementua(Zapata zapata, int kopurua, String egoera,
			String erosketaData, String bildaketaData, boolean atzerapenaDago) {
		super();
		this.zapata = zapata;
		this.kopurua = kopurua;
		this.egoera = egoera;
		this.erosketaData = erosketaData;
		this.bildaketaData = bildaketaData;
		this.atzerapenaDago = atzerapenaDago;
	}

	public Zapata getZapata() {
		return zapata;
	}

	public void setZapata(Zapata zapata) {
		this.zapata = zapata;
	}

	public int getKopurua() {
		return kopurua;
	}

	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
	}

	public String getEgoera() {
		return egoera;
	}

	public void setEgoera(String egoera) {
		this.egoera = egoera;
	}

	public String getErosketaData() {
		return erosketaData;
	}

	public void setErosketaData(String erosketaData) {
		this.erosketaData = erosketaData;
	}

	public String getBildaketaData() {
		return bildaketaData;
	}

	public void setBildaketaData(String bildaketaData) {
		this.bildaketaData = bildaketaData;
	}

	public boolean isAtzerapenaDago() {
		return atzerapenaDago;
	}

	public void setAtzerapenaDago(boolean atzerapenaDago) {
		this.atzerapenaDago = atzerapenaDago;
	}
	
	
	

}
