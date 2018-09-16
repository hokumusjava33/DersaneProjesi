package dersane.dao;

import java.sql.Connection;
import java.sql.Statement;

import dersane.model.Ogrenci;

public class OgrenciDbDAO {
	
	public int save_Ogrenci(Ogrenci temp) {
		try {
			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("insert into dersane(id,ad_soyad,adres,tel_no,egitim) "
					+ "values (nextval('ogrenci_id_seq'), '" +temp.getAd_soyad() +"','"
					+temp.getAdres()+"','"+temp.getTel_no()+"','"+temp.getEgitim()+"')");
			int rowCount = stmt.executeUpdate(sb.toString());
			return rowCount;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public Integer update_Ogrenci(Ogrenci temp){
		try {
			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("update from dersane set id=values (nextval('ogrenci_id_seq')',' ad_soyad= '"+temp.getAd_soyad()+"' where adres='"+temp.getAdres()+
					"'where tel_no='" +temp.getTel_no()+"'where egitim='"+temp.getEgitim());
			int rowCount = stmt.executeUpdate(sb.toString());
			return rowCount;

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return null;
	}
	
	public Integer delete_Ogrenci(Ogrenci temp){
		try {
			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("delete from dersane set id=values (nextval('ogrenci_id_seq')',' ad_soyad= '"+temp.getAd_soyad()+"' where adres='"+temp.getAdres()+
					"'where tel_no='" +temp.getTel_no()+"'where egitim='"+temp.getEgitim());
			int rowCount = stmt.executeUpdate(sb.toString());
			return rowCount;

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return null;
	}

}
