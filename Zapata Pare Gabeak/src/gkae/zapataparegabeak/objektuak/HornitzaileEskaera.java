package gkae.zapataparegabeak.objektuak;

public class HornitzaileEskaera {

	private int kodea;
	private String HornitzaileIzena;
	private String HornitzaileEPosta;
	private int kantitatea;
	public HornitzaileEskaera(int kodea, String hornitzaileIzena,
			String hornitzaileEPosta, int kantitatea) {
		super();
		this.kodea = kodea;
		this.HornitzaileIzena = hornitzaileIzena;
		this.HornitzaileEPosta = hornitzaileEPosta;
		this.kantitatea = kantitatea;
	}
	public int getKodea() {
		return kodea;
	}
	public void setKodea(int kodea) {
		this.kodea = kodea;
	}
	public String getHornitzaileIzena() {
		return HornitzaileIzena;
	}
	public void setHornitzaileIzena(String hornitzaileIzena) {
		HornitzaileIzena = hornitzaileIzena;
	}
	public String getHornitzaileEPosta() {
		return HornitzaileEPosta;
	}
	public void setHornitzaileEPosta(String hornitzaileEPosta) {
		HornitzaileEPosta = hornitzaileEPosta;
	}
	public int getKantitatea() {
		return kantitatea;
	}
	public void setKantitatea(int kantitatea) {
		this.kantitatea = kantitatea;
	}
	public String toString(){
		return new Integer(this.kodea).toString();
	}
}
