package dersane.dao;

import java.sql.Connection;
import java.sql.Statement;

import dersane.model.Dersane;


public class DersaneDbDAO {
	
	public Integer saveDersane(Dersane temp) {

		
		try {
			Connection conn = DbConnector.getDbConnection();
			Statement stmt = conn.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("insert into dersane(id,adi,adres,tel_no,aciklama) "
					+ "values (nextval('dersane_id_seq'), '" +temp.getAdi() +"','"
					+temp.getAdres()+"','"+temp.getTel_no()+"','"+temp.getAciklama()+"')");
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

}
