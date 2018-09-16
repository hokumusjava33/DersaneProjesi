package dersane.model;

public class Ogretmen {

	private int id;
	private String adi_soyadi;
	private String tel_no;
	private String adres;
	private int brans_id;

	public Ogretmen() {
	}

	public Ogretmen(int id, String adi_soyadi, String tel_no, String adres, int brans_id) {
		this.id = id;
		this.adi_soyadi = adi_soyadi;
		this.tel_no = tel_no;
		this.adres = adres;
		this.brans_id = brans_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi_soyadi() {
		return adi_soyadi;
	}

	public void setAdi_soyadi(String adi_soyadi) {
		this.adi_soyadi = adi_soyadi;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getBrans_id() {
		return brans_id;
	}

	public void setBrans_id(int brans_id) {
		this.brans_id = brans_id;
	}

}
