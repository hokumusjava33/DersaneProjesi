package dersane.ekran;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class KullaniciEkleme extends JFrame {
	private JTextField txtKulAdi;
	private JTextField txtSifre;
	
	public KullaniciEkleme() {
		setBounds(100, 50, 270, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblKulAdi = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lblKulAdi.setBounds(21, 55, 86, 14);
		getContentPane().add(lblKulAdi);
		
		JLabel lblSifre = new JLabel("\u015Eifre");
		lblSifre.setBounds(21, 91, 86, 14);
		getContentPane().add(lblSifre);
		
		txtKulAdi = new JTextField();
		txtKulAdi.setBounds(131, 52, 86, 20);
		getContentPane().add(txtKulAdi);
		txtKulAdi.setColumns(10);
		
		txtSifre = new JTextField();
		txtSifre.setBounds(131, 88, 86, 20);
		getContentPane().add(txtSifre);
		txtSifre.setColumns(10);
		
		JComboBox cmbYetki = new JComboBox();
		cmbYetki.setBounds(131, 132, 86, 22);
		getContentPane().add(cmbYetki);
		
		JLabel lblYetki = new JLabel("Yetki T\u00FCr\u00FC");
		lblYetki.setBounds(21, 136, 86, 14);
		getContentPane().add(lblYetki);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(131, 182, 91, 23);
		getContentPane().add(btnKaydet);
		
		JButton btnIptal = new JButton("\u0130ptal");
		btnIptal.setBounds(21, 182, 91, 23);
		getContentPane().add(btnIptal);
		
	}
}
