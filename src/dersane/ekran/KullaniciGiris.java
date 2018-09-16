package dersane.ekran;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dersane.blo.KullaniciBLO;
import dersane.model.Kullanici;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class KullaniciGiris extends JFrame {
	private JTextField txtKulAdi;
	private JTextField txtSifre;

	public KullaniciGiris() {
		setBounds(100, 50, 270, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setTitle("Kullanýcý giriþi");

		JLabel lblNewLabel = new JLabel("Kullanici Adi");
		lblNewLabel.setBounds(21, 48, 68, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u015Eifre");
		lblNewLabel_1.setBounds(21, 84, 68, 14);
		getContentPane().add(lblNewLabel_1);

		txtKulAdi = new JTextField();
		txtKulAdi.setBounds(93, 45, 86, 20);
		getContentPane().add(txtKulAdi);
		txtKulAdi.setColumns(10);

		txtSifre = new JTextField();
		txtSifre.setBounds(93, 81, 86, 20);
		getContentPane().add(txtSifre);
		txtSifre.setColumns(10);

		JButton btnIptal = new JButton("\u0130ptal");
		btnIptal.setBounds(10, 125, 91, 23);
		getContentPane().add(btnIptal);

		JButton btnGiris = new JButton("Giri\u015F");
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtKulAdi.getText().equals("")) {
					JOptionPane.showMessageDialog(KullaniciGiris.this, "Kullanici adi Boþ geçilemez..!");
				} else {

					Kullanici temp = new Kullanici();
					temp.setKullaniciAdi(txtKulAdi.getText());
					KullaniciBLO blo = new KullaniciBLO();
					List<Kullanici> liste = blo.getUsersForUserName(temp);
					if (liste.size() > 0) {
						Kullanici gelen = liste.get(0);
						if (gelen.getSifre().equals(txtSifre.getText())) {
							// burda yeni ekraný açtýrýcam
							if (gelen.getYetkiId() == 1) /// 1 ADMIN
							{
								AnaEkran frame = new AnaEkran();
								frame.setVisible(true);
							} else if (gelen.getYetkiId() == 2) {

							} else if (gelen.getYetkiId() == 3) {

							}else {
								
							}
						} else
							JOptionPane.showMessageDialog(KullaniciGiris.this, "Þifre hatalý..!");
					} else {
						JOptionPane.showMessageDialog(KullaniciGiris.this, "Bu Kullanici adli Kullanici bulunamadý..!");
					}
				}

			}
		});
		btnGiris.setBounds(133, 125, 91, 23);
		getContentPane().add(btnGiris);
	}

}
