package dersane.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dersane.model.Ogretmen;

public class OgretmenDbDAO {

	public Integer save(Ogretmen temp) {
		try {
			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("insert into ogretmen(id,adi_soyadi,tel_no,adres,brans_id) values(nextval('ogretmen_id_seq'),'"
					+ temp.getAdi_soyadi() + "','" + temp.getTel_no() + "','" + temp.getAdres() + "',"
					+ temp.getBrans_id() + ")");
			int rowCount = stmt.executeUpdate(sb.toString());
			return rowCount;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public Integer update(Ogretmen temp) {

		try {

			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("update ogretmen set adi_soyadi='" + temp.getAdi_soyadi() + "', tel_no='" + temp.getTel_no()
					+ "' ,adres='" + temp.getAdres() + "' , brans_id=" + temp.getBrans_id() + " where id="
					+ temp.getBrans_id());
			int rowCount = stmt.executeUpdate(sb.toString());
			return rowCount;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public Integer delete(Ogretmen temp) {

		try {

			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("delete from ogretmen where id =" + temp.getId());
			int rowCount = stmt.executeUpdate(sb.toString());
			return rowCount;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Ogretmen> getAll() {

		List<Ogretmen> ogretmenler = new ArrayList<Ogretmen>();
		try {
			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("select id,adi_soyadi,tel_no,adres,brans_id from ogretmen");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while (rs.next()) {
				Ogretmen temp = new Ogretmen();
				temp.setId(rs.getInt("id"));
				temp.setAdi_soyadi(rs.getString("adi_soyadi"));
				temp.setTel_no(rs.getString("tel_no"));
				temp.setAdres(rs.getString("adres"));
				temp.setBrans_id(rs.getInt("brans_id"));
				ogretmenler.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ogretmenler;

	}

}
