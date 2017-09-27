import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Segitiga extends JFrame {
	boolean proses;
	JLabel lblTinggi = new JLabel("Tinggi Segitiga");
	JLabel lblAlas = new JLabel("Panjang Sisi Segitiga");
	JLabel lblNama = new JLabel("");
	JLabel lblA = new JLabel("Anda sedang menghitung Keliling dan Luas Segitiga");
	JLabel lblB = new JLabel("----------------------------------------------------------------------------------------------------------");
	JLabel lblC = new JLabel("Hasil Perhitungan");
	JLabel lblKll = new JLabel("");
	JLabel lblLuas = new JLabel("");
	JLabel lblZZ = new JLabel("");
	JCheckBox checkLuas = new JCheckBox("Hitung Luas Segitiga");
	JCheckBox checkKll = new JCheckBox("Hitung Keliling Segitiga");
	JTextField txtTinggi = new JTextField();
	JTextField txtPanjang= new JTextField();
	JButton btnHitSegitiga = new JButton("Hitung Segitiga");
	
	public Segitiga(String n){
		String nama=n;
		setTitle("Hitung Segitiga");
		setSize(400,400); 
		setLayout(null);
		//POP UP MENU
		
		PopupMenu popupMenu = new PopupMenu(nama);
		PopupMenuListener LisMouse = new PopupMenuListener(popupMenu);
		addMouseListener(LisMouse);
		
		add(lblTinggi);
		lblTinggi.setBounds(20, 50, 100, 20);
		add(txtTinggi);
		txtTinggi.setBounds(150, 50, 100, 20);
		add(lblAlas);
		lblAlas.setBounds(20, 70, 150, 20);
		add(txtPanjang);
		txtPanjang.setBounds(150, 70, 100, 20);
		
		add(lblNama);
		lblNama.setText("Selamat Datang "+nama);
		lblNama.setBounds(20, 5, 200, 20);
		add(lblA);
		lblA.setBounds(20, 25, 300, 20);
		add(lblB);
		lblB.setBounds(0, 40, 500, 5);
		
		add(checkLuas);
		checkLuas.setBounds(20, 100, 150, 20);
		checkLuas.setToolTipText("<html>Luas Segitiga<br>L = (tinggi * alas)/2<html>");
		add(checkKll);
		checkKll.setBounds(20, 130, 200, 20);
		checkKll.setToolTipText("<html>Keliling Segitiga<br>Kll = Sisi * 3</html>");
		
		add(btnHitSegitiga);
		btnHitSegitiga.setBounds(100, 160, 150, 30);
		btnHitSegitiga.setActionCommand("btnHitSegitiga");
		btnHitSegitiga.addActionListener(actHitSegitiga);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	ActionListener actHitSegitiga = new ActionListener(){
		public void actionPerformed(ActionEvent btnHitung) {
			String btn = btnHitung.getActionCommand();
			
			//Check TextField
			if((txtTinggi.getText().equals("")) || (txtPanjang.getText().equals(""))){
				proses=false;
			}
			else{
				proses=true;
			}
			
			//Proses Perhitungan
			if(proses==false){
				add(lblZZ);
				lblZZ.setVisible(true);
				lblZZ.setText("Salah Satu TextField Belum Diisi");
				lblZZ.setBounds(20, 250, 300, 20);
			}
			else if((btn.equals("btnHitSegitiga")) && (proses==true)){
				int Tinggi = Integer.parseInt(txtTinggi.getText());
				int Panjang = Integer.parseInt(txtPanjang.getText());
				int kll=Panjang*3;
				float luas= 0.5f*((float)Panjang * Tinggi);
				
				if((checkLuas.isSelected()) && (checkKll.isSelected())){
					lblKll.setVisible(true);
					lblLuas.setVisible(true);
					lblC.setVisible(true);
					lblZZ.setVisible(false);
					add(lblC);
					lblC.setBounds(20, 120, 100, 200);
					add(lblKll);
					lblKll.setText("Keliling Segitiga = "+kll);
					lblKll.setBounds(20, 250, 150, 20);
					add(lblLuas);
					lblLuas.setText("Luas Segitiga = "+luas);
					lblLuas.setBounds(20, 280, 150, 20);
				}
				else if(checkLuas.isSelected()){
					lblKll.setVisible(false);
					lblLuas.setVisible(true);
					lblC.setVisible(true);
					lblZZ.setVisible(false);
					add(lblC);
					lblC.setBounds(20, 120, 100, 200);
					add(lblLuas);
					lblLuas.setText("Luas Segitiga = "+luas);
					lblLuas.setBounds(20, 250, 150, 20);
				}
				else if(checkKll.isSelected()){
					lblKll.setVisible(true);
					lblLuas.setVisible(false);
					lblC.setVisible(true);
					lblZZ.setVisible(false);
					add(lblC);
					lblC.setBounds(20, 120, 100, 200);
					add(lblKll);
					lblKll.setText("Keliling Segitiga = "+kll);
					lblKll.setBounds(20, 250, 150, 20);
				}
				else{
					lblKll.setVisible(false);
					lblLuas.setVisible(false);
					lblC.setVisible(false);
					lblZZ.setVisible(true);
					add(lblZZ);
					lblZZ.setText("Silahkan Centang Salah Satu CheckBox");
					lblZZ.setBounds(20, 250, 300, 20);
				}
			}

			
		}
		
	};
}
