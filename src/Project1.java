
import java.awt.event.*;
import javax.swing.*;

public class Project1 extends JFrame{
	String[] pilihan={"Segitiga","Persegi","Persegi Panjang","Jajar Genjang","Trapesium","Lingkaran"};
	String[] pilmenu={"Home","Exit"};
	JLabel label1 = new JLabel("Masukkan Nama Anda");
	JLabel label2 = new JLabel("Pilihan : ");
	JTextField txtNama = new JTextField();
	JComboBox cbpil = new JComboBox(pilihan);
	JButton btnSubmit = new JButton("OK");
	JLabel lbl3 = new JLabel("<html>Selamat Datang di Aplikasi Perhitungan Bangun Datar <br> "
			+ "Cara Penggunaan : <br>"
			+ "1. Masukkan Nama Anda pada TextField Diatas<br>"
			+ "2. Pilih Salah Satu Bangun Datar Pada ComboBox<br>"
			+ "3. Klik OK<br><br><br>"
			+ "Project Oleh : <br>"
			+ "1. I Dewa Gede Agung Krisnayana <br>"
			+ "2. Ni Luh Kadek Sarisha Paramitha<br><br>"
			+ "<center>Politeknik Negeri Bali | 2017</center></html>");
	
		public Project1(){
			setTitle("Main Menu | Perhitungan Bangun Datar");
			setSize(400,400); 
			setLayout(null);

			add(label1);
			label1.setBounds(20, 10, 200, 20);
			add(txtNama);
			txtNama.setBounds(20, 30, 170, 20);
			add(label2);
			label2.setBounds(20, 60, 50, 20);
			add(cbpil);
			
			//BUTTON
			cbpil.setBounds(70, 60, 120, 20);
			add(btnSubmit);
			btnSubmit.setBounds(130, 90, 60, 20);
			btnSubmit.setActionCommand("btnSubmit");
			btnSubmit.addActionListener(actSubmit);
			
			add(lbl3);
			lbl3.setBounds(20, 90, 350, 300);
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			setLocationRelativeTo(null);
			}
		
		ActionListener actSubmit = new ActionListener(){
			public void actionPerformed(ActionEvent button) {
				String btn = button.getActionCommand();
				if (btn.equals("btnSubmit")){
					String nama = txtNama.getText();
					String pil1 = (String) cbpil.getSelectedItem();

					switch(pil1){
					case "Segitiga"			: setVisible(false);
											Segitiga Segitiga = new Segitiga(nama);
											break;
					case "Persegi"			: setVisible(false);
											Persegi Persegi = new Persegi(nama);
											break;
					case "Persegi Panjang"	: setVisible(false);
											Persegi_Panjang Persegi_Panjang = new Persegi_Panjang(nama);
											break;
					case "Jajar Genjang"	: setVisible(false);
											Jajar_Genjang Jajar_Genjang = new Jajar_Genjang(nama);
											break;
					case "Trapesium"		: setVisible(false);
											Trapesium Trapesium = new Trapesium(nama);
											break;
					case "Lingkaran"		: setVisible(false);
											Lingkaran Lingkaran = new Lingkaran(nama);
											break;
						}
					}
				}
			};
	
	  public static void main(String[] args){
	    Project1 Project1 = new Project1();
	  }
	  
}
