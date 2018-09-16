package dersane.model;

public class Kullanici {
	
	private int id;
	private String kullaniciAdi;
	private String sifre;
	private int yetkiId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public int getYetkiId() {
		return yetkiId;
	}
	public void setYetkiId(int yetkiId) {
		this.yetkiId = yetkiId;
	}
	

}
