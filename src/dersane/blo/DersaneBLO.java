package dersane.blo;

import dersane.dao.DersaneDbDAO;
import dersane.model.Dersane;

public class DersaneBLO {
	
	public Boolean saveDersane(){
		DersaneDbDAO dao = new DersaneDbDAO(); 
		Dersane temp = new  Dersane();
		temp.setAdi("Vektorel Bilişim");
		temp.setAdres("Kızılay ANKARA");
		temp.setTel_no("0312 222 22 22");
		temp.setAciklama("bilişim dersanesi");
		int count = dao.saveDersane(temp);
		if( count >0 ){
			return true;
		}
		else {
			return false;
		}
	}

}
