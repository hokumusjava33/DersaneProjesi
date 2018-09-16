package dersane.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector {

	private static Connection conn = null;

	public static Connection getDbConnection() {
		if (conn == null) {
			try {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dersane", "postgres", "root");
			} catch (Exception e) {

				System.out.println("Database baðlantýsýnda sorun oluþtu");
				e.printStackTrace();
			}

			if (conn != null) {
				System.out.println("Database baðlantýsýsaðlandý");
				return conn;
			} else {
				System.out.println("Database baðlantýsýnda sorun oluþtu");
			}
		}

		return conn;
	}
	
	public static Boolean closeConnection() {
		try {
			if(conn!=null){
				conn.close();
				return true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
	}
	

}
