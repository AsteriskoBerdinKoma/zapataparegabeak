package gkae.zapataparegabeak.objektuak;

public class Hornitzailea {

	private int id;
	private String izena;
	private String helbidea;
	private int telefonoa;
	private String ePosta;
	
	
	
	public Hornitzailea(int i) {
		super();
		this.id = i;
	}

	public Hornitzailea(int id, String izena, String helbidea, int telefonoa,
			String posta) {
		super();
		this.id = id;
		this.izena = izena;
		this.helbidea = helbidea;
		this.telefonoa = telefonoa;
		ePosta = posta;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getHelbidea() {
		return helbidea;
	}
	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}
	public int getTelefonoa() {
		return telefonoa;
	}
	public void setTelefonoa(int telefonoa) {
		this.telefonoa = telefonoa;
	}
	public String getEPosta() {
		return ePosta;
	}
	public void setEPosta(String posta) {
		ePosta = posta;
	}
	public String toString(){
		return this.izena;
	}
	
	
}
