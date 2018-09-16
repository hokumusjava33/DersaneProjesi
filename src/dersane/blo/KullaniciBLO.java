package dersane.blo;

import java.util.List;

import dersane.dao.KullaniciDbDAO;
import dersane.model.Kullanici;

public class KullaniciBLO {
	KullaniciDbDAO dao= null;
	public KullaniciBLO() {
		dao = new KullaniciDbDAO();
	}
	
	public List<Kullanici> getAllUser(){
		try {			
			List< Kullanici> liste = dao.getAll();
			return liste;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	public Integer saveUser(Kullanici temp ){
		try {
			Integer rowCount = dao.saveUser(temp);
			return rowCount;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Kullanici> getUsersForUserName(Kullanici temp){
		try {			
			List< Kullanici> liste = dao.getAll(temp);
			return liste;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
