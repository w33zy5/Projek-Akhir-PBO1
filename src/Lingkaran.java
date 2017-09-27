import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Lingkaran extends JFrame{
	boolean proses;
	JLabel lblRuas = new JLabel("Ruas Lingkaran");
	JLabel lblDiameter = new JLabel("Diameter Lingkaran");
	JLabel lblNama = new JLabel("");
	JLabel lblA = new JLabel("Anda sedang menghitung Keliling dan Luas Lingkaran");
	JLabel lblB = new JLabel("----------------------------------------------------------------------------------------------------------");
	JLabel lblC = new JLabel("Hasil Perhitungan");
	JLabel lblKll = new JLabel("");
	JLabel lblLuas = new JLabel("");
	JLabel lblZZ = new JLabel("");
	JCheckBox checkLuas = new JCheckBox("Hitung Luas Lingkaran");
	JCheckBox checkKll = new JCheckBox("Hitung Keliling Lingkaran");
	JTextField txtRuas = new JTextField();
	JTextField txtDiameter = new JTextField();
	JButton btnHitLingkaran = new JButton("Hitung Lingkaran");
	public Lingkaran(String n){
		String nama=n;
		setTitle("Hitung Lingkaran");
		setSize(400,400); 
		setLayout(null);
		
		PopupMenu popupMenu = new PopupMenu(nama);
		PopupMenuListener LisMouse = new PopupMenuListener(popupMenu);
		addMouseListener(LisMouse);
		
		add(lblRuas);
		lblRuas.setBounds(20, 50, 100, 20);
		add(txtRuas);
		txtRuas.setBounds(150, 50, 100, 20);
		add(lblDiameter);
		lblDiameter.setBounds(20, 70, 150, 20);
		add(txtDiameter);
		txtDiameter.setBounds(150, 70, 100, 20);
		
		add(lblNama);
		lblNama.setText("Selamat Datang "+nama);
		lblNama.setBounds(20, 5, 200, 20);
		add(lblA);
		lblA.setBounds(20, 25, 350, 20);
		add(lblB);
		lblB.setBounds(0, 40, 500, 5);
		
		add(checkLuas);
		checkLuas.setBounds(20, 100, 200, 20);
		add(checkKll);
		checkKll.setBounds(20, 130, 200, 20);
		
		add(btnHitLingkaran);
		btnHitLingkaran.setBounds(100, 160, 150, 30);
		btnHitLingkaran.setActionCommand("btnHitLingkaran");
		btnHitLingkaran.addActionListener(actHitLingkaran);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	ActionListener actHitLingkaran = new ActionListener(){
		public void actionPerformed(ActionEvent btnHitung) {
			String btn = btnHitung.getActionCommand();
			
			if((txtRuas.getText().equals("")) || (txtDiameter.getText().equals(""))){
				proses=false;
			}
			else if((txtRuas.getText().equals("")) && (txtDiameter.getText().equals(""))){
				proses=false;
			}
			else{
				proses=true;
			}
			
			float Ruas = Float.parseFloat(txtRuas.getText());
			float Diameter = Float.parseFloat(txtDiameter.getText());
			float kll = 3.14f*Ruas*Ruas;
			float luas = 3.14f*Diameter;
			
			if((btn.equals("btnHitLingkaran")) && (proses==true)){
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
