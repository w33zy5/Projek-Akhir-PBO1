import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Jajar_Genjang extends JFrame{
	boolean proses;
	JLabel lblTinggi = new JLabel("Tinggi Jajar Genjang");
	JLabel lblAlas = new JLabel("Panjang Jajar Genjang");
	JLabel lblSisiA = new JLabel("Sisi A");
	JLabel lblSisiB = new JLabel("Sisi B");
	JLabel lblNama = new JLabel("");
	JLabel lblA = new JLabel("Anda sedang menghitung Keliling dan Luas Jajar Genjang");
	JLabel lblB = new JLabel("----------------------------------------------------------------------------------------------------------");
	JLabel lblC = new JLabel("Hasil Perhitungan");
	JLabel lblKll = new JLabel("");
	JLabel lblLuas = new JLabel("");
	JLabel lblZZ = new JLabel("");
	JCheckBox checkLuas = new JCheckBox("Hitung Luas Jajar Genjang");
	JCheckBox checkKll = new JCheckBox("Hitung Keliling Jajar Genjang");
	JTextField txtTinggi = new JTextField();
	JTextField txtAlas= new JTextField();
	JTextField txtSisiA = new JTextField();
	JTextField txtSisiB = new JTextField();
	JButton btnHitJjrGenjang = new JButton("Hitung Jajar Genjang");
	public Jajar_Genjang(String n){
		String nama=n;
		setTitle("Hitung Jajar Genjang");
		setSize(400,400); 
		setLayout(null);
		
		PopupMenu popupMenu = new PopupMenu(nama);
		PopupMenuListener LisMouse = new PopupMenuListener(popupMenu);
		addMouseListener(LisMouse);
		
		add(lblTinggi);
		lblTinggi.setBounds(20, 50, 120, 20);
		add(txtTinggi);
		txtTinggi.setBounds(150, 50, 100, 20);
		add(lblAlas);
		lblAlas.setBounds(20, 70, 150, 20);
		add(txtAlas);
		txtAlas.setBounds(150, 70, 100, 20);
		add(lblSisiA);
		lblSisiA.setBounds(20, 90, 100, 20);
		add(txtSisiA);
		txtSisiA.setBounds(150,90,100,20);
		add(lblSisiB);
		lblSisiB.setBounds(20, 110, 100, 20);
		add(txtSisiB);
		txtSisiB.setBounds(150,110,100,20);

		add(lblNama);
		lblNama.setText("Selamat Datang "+nama);
		lblNama.setBounds(20, 5, 200, 20);
		add(lblA);
		lblA.setBounds(20, 25, 350, 20);
		add(lblB);
		lblB.setBounds(0, 40, 500, 5);
		
		add(checkLuas);
		checkLuas.setBounds(20, 140, 200, 20);
		add(checkKll);
		checkKll.setBounds(20, 160, 200, 20);
		
		add(btnHitJjrGenjang);
		btnHitJjrGenjang.setBounds(100, 200, 175, 30);
		btnHitJjrGenjang.setActionCommand("btnHitJjrGenjang");
		btnHitJjrGenjang.addActionListener(actHitJjrGenjang);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	ActionListener actHitJjrGenjang = new ActionListener(){
		public void actionPerformed(ActionEvent btnHitung) {
			String btn = btnHitung.getActionCommand();
			
			if((txtTinggi.getText().equals("")) || (txtAlas.getText().equals(""))){
				proses=false;
			}
			else if((txtTinggi.getText().equals("")) && (txtAlas.getText().equals(""))){
				proses=false;
			}
			else{
				proses=true;
			}
			
			float Tinggi = Float.parseFloat(txtTinggi.getText());
			float Alas = Float.parseFloat(txtAlas.getText());
			float SisiA = Float.parseFloat(txtSisiA.getText());
			float SisiB = Float.parseFloat(txtSisiB.getText());
			float kll=2*(SisiA+SisiB);
			float luas=Alas*Tinggi;
			
			if((btn.equals("btnHitJjrGenjang")) && (proses==true)){
				if((checkLuas.isSelected()) && (checkKll.isSelected())){
					lblKll.setVisible(true);
					lblLuas.setVisible(true);
					lblC.setVisible(true);
					lblZZ.setVisible(false);
					add(lblC);
					lblC.setBounds(20, 160, 100, 200);
					add(lblKll);
					lblKll.setText("Keliling Jajar Genjang = "+kll);
					lblKll.setBounds(20, 280, 180, 20);
					add(lblLuas);
					lblLuas.setText("Luas Jajar Genjang = "+luas);
					lblLuas.setBounds(20, 310, 180, 20);
				}
				else if(checkLuas.isSelected()){
					lblKll.setVisible(false);
					lblLuas.setVisible(true);
					lblC.setVisible(true);
					lblZZ.setVisible(false);
					add(lblC);
					lblC.setBounds(20, 160, 100, 200);
					add(lblLuas);
					lblLuas.setText("Luas Jajar Genjang = "+luas);
					lblLuas.setBounds(20, 280, 180, 20);
				}
				else if(checkKll.isSelected()){
					lblKll.setVisible(true);
					lblLuas.setVisible(false);
					lblC.setVisible(true);
					lblZZ.setVisible(false);
					add(lblC);
					lblC.setBounds(20, 160, 100, 200);
					add(lblKll);
					lblKll.setText("Keliling Jajar Genjang = "+kll);
					lblKll.setBounds(20, 280, 180, 20);
				}
				else{
					lblKll.setVisible(false);
					lblLuas.setVisible(false);
					lblC.setVisible(false);
					lblZZ.setVisible(true);
					add(lblZZ);
					lblZZ.setText("Silahkan Centang Salah Satu CheckBox");
					lblZZ.setBounds(20, 280, 300, 20);
				}
			}
		}
	};
}
