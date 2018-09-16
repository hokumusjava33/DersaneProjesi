package dersane.base;

import java.util.List;

import dersane.blo.DersaneBLO;
import dersane.blo.KullaniciBLO;
import dersane.ekran.KullaniciGiris;
import dersane.model.Kullanici;

public class BaseClass {

	public static void main(String[] args) {
		
//		DersaneBLO blo = new DersaneBLO(); 
//		Boolean sonuc =blo.saveDersane();
//		if( sonuc){
//			System.out.println("��lem Ba�ar�yla ger�ekle�ti ....!");
//		}
//		else 
//			System.out.println("��lem Ba�ar�s�z Oldu ....!");
		
		KullaniciBLO blo = new  KullaniciBLO();
		List<Kullanici> liste = blo.getAllUser();
		if(liste.size()<1){
			Kullanici temp = new Kullanici();
			temp.setKullaniciAdi("hokumus");
			temp.setSifre("1");
			temp.setYetkiId(1);			
			blo.saveUser(temp);
		}
		KullaniciGiris ilk = new  KullaniciGiris();
		ilk.setVisible(true);
		
	}

}
