package dersane.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dersane.model.Kullanici;

public class KullaniciDbDAO {
	
	public List<Kullanici> getAll() {

		List<Kullanici> kullanicilar = new ArrayList<Kullanici>();
		try {
			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("select id,kullanici_adi,sifre,yetki_id from usr");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while (rs.next()) {
				Kullanici temp = new Kullanici();
				temp.setId(rs.getInt("id"));
				temp.setKullaniciAdi(rs.getString("kullanici_adi"));
				temp.setSifre(rs.getString("sifre"));
				temp.setYetkiId(rs.getInt("yetki_id"));
				kullanicilar.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kullanicilar;

	}
	
public Integer saveUser(Kullanici temp) {

		
		try {
			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("insert into usr(id,kullanici_adi,sifre,yetki_id) "
					+ "values (nextval('usr_id_seq'), '" +temp.getKullaniciAdi() +"','"
					+temp.getSifre()+"','"+temp.getYetkiId()+"')");
			int rowCount = stmt.executeUpdate(sb.toString());
			return rowCount;

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DbConnector.closeConnection();
		}

		return null;
	}

public List<Kullanici> getAll(Kullanici veri) {

	List<Kullanici> kullanicilar = new ArrayList<Kullanici>();
	try {
		Connection conn = DbConnector.getDbConnection();
		Statement stmt = conn.createStatement();
		StringBuilder sb = new StringBuilder();
		sb.append("select id,kullanici_adi,sifre,yetki_id from usr where kullanici_adi='"+veri.getKullaniciAdi()+"'");
		ResultSet rs = stmt.executeQuery(sb.toString());
		while (rs.next()) {
			Kullanici temp = new Kullanici();
			temp.setId(rs.getInt("id"));
			temp.setKullaniciAdi(rs.getString("kullanici_adi"));
			temp.setSifre(rs.getString("sifre"));
			temp.setYetkiId(rs.getInt("yetki_id"));
			kullanicilar.add(temp);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return kullanicilar;

}

}
