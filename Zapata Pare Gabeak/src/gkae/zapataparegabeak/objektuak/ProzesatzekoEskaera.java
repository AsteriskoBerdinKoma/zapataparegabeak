package gkae.zapataparegabeak.objektuak;

public class ProzesatzekoEskaera {

	private String kodea;
	private String erabiltzaile;
	private String deskribapena;		
	private String zenbatekoa;
	private String eskuzordaindu;
	private String txartelbidez;

	
	public ProzesatzekoEskaera(String kodea, String erabiltzaile, String deskribapena, 
			String zenbatekoa, String eskuzordaindu, String txartelbidez) {
		this.kodea = kodea;
		this.erabiltzaile = erabiltzaile;
		this.deskribapena = deskribapena;
		this.zenbatekoa = zenbatekoa;
		this.eskuzordaindu = eskuzordaindu;
		this.txartelbidez = txartelbidez;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getKodea() {
		return kodea;
	}


	public void setKodea(String kodea) {
		this.kodea = kodea;
	}


	public String getErabiltzaile() {
		return erabiltzaile;
	}


	public void setErabiltzaile(String erabiltzaile) {
		this.erabiltzaile = erabiltzaile;
	}


	public String getDeskribapena() {
		return deskribapena;
	}


	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}





	public String getZenbatekoa() {
		return zenbatekoa;
	}


	public void setZenbatekoa(String zenbatekoa) {
		this.zenbatekoa = zenbatekoa;
	}


	public String getEskuzordaindu() {
		return eskuzordaindu;
	}


	public void setEskuzordaindu(String eskuzordaindu) {
		this.eskuzordaindu = eskuzordaindu;
	}


	public String getTxartelbidez() {
		return txartelbidez;
	}


	public void setTxartelbidez(String txartelbidez) {
		this.txartelbidez = txartelbidez;
	}
	
	public String toString(){
		return this.kodea;
	}


}
