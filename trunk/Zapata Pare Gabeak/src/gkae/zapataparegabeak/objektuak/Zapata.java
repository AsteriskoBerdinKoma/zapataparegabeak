package gkae.zapataparegabeak.objektuak;

public class Zapata {

	private int id;
	private String oina; // Ezkerra, Eskuina
	private float neurria; // 45.5, 40...
	private String generoa; // Emakumezkoa, Gizonezkoa
	private String kolorea;
	private String estiloa; // Larruzkoa, sintetikoa...
	private String kategoria; // Botak, kirol zapatak, takoizkoak...
	private String marka; // Adidas, Vuitony, Nike...
	private float prezioa;
	private boolean eskaintzanDago;
	private String eskaintzaMota; // Beherapena, BiBiderBat, Outlet
	private float beherapenEhuneko;
	private boolean stockDago;
	private int stocka;

	private boolean iruditxoaDu;
	private String irudiPath;

	public Zapata(int id, String oina, float neurria, String generoa,
			String kolorea, String estiloa, String kategoria, String marka,
			float prezioa, boolean eskaintzanDago, String eskaintzaMota, float beherapenEhuneko,
			boolean stockDago, int stocka, boolean iruditxoaDu, String irudiPath) {
		super();
		this.id = id;
		this.oina = oina;
		this.neurria = neurria;
		this.generoa = generoa;
		this.kolorea = kolorea;
		this.estiloa = estiloa;
		this.kategoria = kategoria;
		this.marka = marka;
		this.prezioa = prezioa;
		this.eskaintzanDago = eskaintzanDago;
		this.eskaintzaMota = eskaintzaMota;
		this.beherapenEhuneko = beherapenEhuneko;
		this.stockDago = stockDago;
		this.stocka = stocka;
		this.iruditxoaDu = iruditxoaDu;
		this.irudiPath = irudiPath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOina() {
		return oina;
	}

	public void setOina(String oina) {
		this.oina = oina;
	}

	public float getNeurria() {
		return neurria;
	}

	public void setNeurria(float neurria) {
		this.neurria = neurria;
	}

	public String getGeneroa() {
		return generoa;
	}

	public void setGeneroa(String generoa) {
		this.generoa = generoa;
	}

	public String getKolorea() {
		return kolorea;
	}

	public void setKolorea(String kolorea) {
		this.kolorea = kolorea;
	}

	public String getEstiloa() {
		return estiloa;
	}

	public void setEstiloa(String estiloa) {
		this.estiloa = estiloa;
	}

	public String getKategoria() {
		return kategoria;
	}

	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public float getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(float prezioa) {
		this.prezioa = prezioa;
	}

	public boolean isEskaintzanDago() {
		return eskaintzanDago;
	}

	public void setEskaintzanDago(boolean eskaintzanDago) {
		this.eskaintzanDago = eskaintzanDago;
	}

	public String getEskaintzaMota() {
		return eskaintzaMota;
	}

	public void setEskaintzaMota(String eskaintzaMota) {
		this.eskaintzaMota = eskaintzaMota;
	}
	
	public void setBeherapenEhuneko(float beherapena){
		this.beherapenEhuneko = beherapena;
	}
	
	public float getBeherapenEhuneko(){
		return this.beherapenEhuneko;
	}

	public boolean isStockDago() {
		return stockDago;
	}

	public void setStockDago(boolean stockDago) {
		this.stockDago = stockDago;
	}

	public int getStocka() {
		return stocka;
	}

	public void setStocka(int stocka) {
		this.stocka = stocka;
	}

	public boolean isIruditxoaDu() {
		return iruditxoaDu;
	}

	public void setIruditxoaDu(boolean iruditxoaDu) {
		this.iruditxoaDu = iruditxoaDu;
	}

	public String getIrudiPath() {
		return irudiPath;
	}

	public void setIrudiPath(String irudiPath) {
		this.irudiPath = irudiPath;
	}

}
