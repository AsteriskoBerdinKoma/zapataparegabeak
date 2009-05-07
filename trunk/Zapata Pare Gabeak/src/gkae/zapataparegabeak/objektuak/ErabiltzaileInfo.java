package gkae.zapataparegabeak.objektuak;

public class ErabiltzaileInfo {

	private String erabIzena;
	private String ePosta;
	private String pasahitza;

	// Bidalketa hobespenak
	private boolean bidalketaHobEmanda;

	private String harIzena;
	private String harAbizenak;
	private String harHelbidea;
	private String harPk;
	private String harProbintzia;

	private boolean txartelBidezOrdaindu;
	private String txartelJabe;
	private String txartelZenb;
	private String txartelData;

	// Artikulu hobespenak
	private boolean artikuluHobEmanda;

	private String generoLehen;
	private String oinLehen;
	private double neurriLehen;

	// Kudeaketa erabiltzailea ahal da
	private boolean isAdmin;
	
	//Erabiltzailea kautotuta dago
	private boolean kautotutaDago;

	public ErabiltzaileInfo(String erabIzena, String eposta, String pasahitza) {
		super();
		this.erabIzena = erabIzena;
		this.ePosta = eposta;
		this.pasahitza = pasahitza;
		this.txartelJabe = "";
		this.txartelData = "";
		this.txartelZenb = "";
		this.txartelBidezOrdaindu = false;
		this.bidalketaHobEmanda = false;
		this.artikuluHobEmanda = false;
		this.harIzena = "";
		this.harAbizenak = "";
		this.harHelbidea = "";
		this.harPk = "";
		this.harProbintzia = "";
		this.generoLehen = "";
		this.oinLehen = "";
		this.neurriLehen = -1;
		this.isAdmin = false;
		this.kautotutaDago = false;
	}

	public String getErabIzena() {
		return erabIzena;
	}

	public void setErabIzena(String erabIzena) {
		this.erabIzena = erabIzena;
	}

	public String getEPosta() {
		return ePosta;
	}

	public void setEPosta(String posta) {
		ePosta = posta;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public boolean isBidalketaHobEmanda() {
		return bidalketaHobEmanda;
	}

	public void setBidalketaHobEmanda(boolean bidalketaHobEmanda) {
		this.bidalketaHobEmanda = bidalketaHobEmanda;
	}

	public String getHarIzena() {
		return harIzena;
	}

	public void setHarIzena(String harIzena) {
		this.harIzena = harIzena;
	}

	public String getHarAbizenak() {
		return harAbizenak;
	}

	public void setHarAbizenak(String harAbizenak) {
		this.harAbizenak = harAbizenak;
	}

	public String getHarHelbidea() {
		return harHelbidea;
	}

	public void setHarHelbidea(String harHelbidea) {
		this.harHelbidea = harHelbidea;
	}

	public String getHarPk() {
		return harPk;
	}

	public void setHarPk(String harPk) {
		this.harPk = harPk;
	}

	public String getHarProbintzia() {
		return harProbintzia;
	}

	public void setHarProbintzia(String harProbintzia) {
		this.harProbintzia = harProbintzia;
	}

	public boolean isArtikuluHobEmanda() {
		return artikuluHobEmanda;
	}

	public void setArtikuluHobEmanda(boolean artikuluHobEmanda) {
		this.artikuluHobEmanda = artikuluHobEmanda;
	}

	public String getGeneroLehen() {
		return generoLehen;
	}

	public void setGeneroLehen(String generoLehen) {
		this.generoLehen = generoLehen;
	}

	public String getOinLehen() {
		return oinLehen;
	}

	public void setOinLehen(String oinLehen) {
		this.oinLehen = oinLehen;
	}

	public double getNeurriLehen() {
		return neurriLehen;
	}

	public void setNeurriLehen(double neurriLehen) {
		this.neurriLehen = neurriLehen;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isTxartelBidezOrdaindu() {
		return txartelBidezOrdaindu;
	}

	public void setTxartelBidezOrdaindu(boolean txartelBidezOrdaindu) {
		this.txartelBidezOrdaindu = txartelBidezOrdaindu;
	}

	public String getTxartelJabe() {
		return txartelJabe;
	}

	public void setTxartelJabe(String txartelJabe) {
		this.txartelJabe = txartelJabe;
	}

	public String getTxartelZenb() {
		return txartelZenb;
	}

	public void setTxartelZenb(String txartelZenb) {
		this.txartelZenb = txartelZenb;
	}

	public String getTxartelData() {
		return txartelData;
	}

	public void setTxartelData(String txartelData) {
		this.txartelData = txartelData;
	}

	public boolean isKautotutaDago() {
		return kautotutaDago;
	}

	public void setKautotutaDago(boolean kautotutaDago) {
		this.kautotutaDago = kautotutaDago;
	}
	
	public String toString(){
		return this.erabIzena;
	}

}
