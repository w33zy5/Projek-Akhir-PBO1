import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Persegi extends JFrame {
	boolean proses;
	JLabel lblSisi = new JLabel("Sisi Persegi");
	JLabel lblNama = new JLabel("");
	JLabel lblA = new JLabel("Anda sedang menghitung Keliling dan Luas Persegi");
	JLabel lblB = new JLabel("----------------------------------------------------------------------------------------------------------");
	JLabel lblC = new JLabel("Hasil Perhitungan");
	JLabel lblKll = new JLabel("");
	JLabel lblLuas = new JLabel("");
	JLabel lblZZ = new JLabel("");
	JCheckBox checkLuas = new JCheckBox("Hitung Luas Persegi");
	JCheckBox checkKll = new JCheckBox("Hitung Keliling Persegi");
	JTextField txtSisi = new JTextField();
	JButton btnHitPersegi = new JButton("Hitung Persegi");
	public Persegi(String n){
		String nama=n;
		setTitle("Hitung Persegi");
		setSize(400,400); 
		setLayout(null);
		
		PopupMenu popupMenu = new PopupMenu(nama);
		PopupMenuListener LisMouse = new PopupMenuListener(popupMenu);
		addMouseListener(LisMouse);
		
		add(lblSisi);
		lblSisi.setBounds(20, 60, 100, 20);
		add(txtSisi);
		txtSisi.setBounds(150, 60, 100, 20);
		
		add(lblNama);
		lblNama.setText("Selamat Datang "+nama);
		lblNama.setBounds(20, 5, 200, 20);
		add(lblA);
		lblA.setBounds(20, 25, 300, 20);
		add(lblB);
		lblB.setBounds(0, 40, 500, 5);
		
		add(checkLuas);
		checkLuas.setBounds(20, 100, 150, 20);
		add(checkKll);
		checkKll.setBounds(20, 130, 200, 20);
		
		add(btnHitPersegi);
		btnHitPersegi.setBounds(100, 160, 150, 30);
		btnHitPersegi.setActionCommand("btnHitPersegi");
		btnHitPersegi.addActionListener(actHitPersegi);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	ActionListener actHitPersegi = new ActionListener(){
		public void actionPerformed(ActionEvent btnHitung) {
			String btn = btnHitung.getActionCommand();
			
			if(txtSisi.getText().equals("")){
				proses=false;
			}
			else{
				proses=true;
			}
			
			float Sisi = Float.parseFloat(txtSisi.getText());
			float kll=4*Sisi;
			float luas= Sisi*Sisi;
			
			if((btn.equals("btnHitPersegi")) && (proses==true)){
				if((checkLuas.isSelected()) && (checkKll.isSelected())){
					lblKll.setVisible(true);
					lblLuas.setVisible(true);
					lblC.setVisible(true);
					lblZZ.setVisible(false);
					add(lblC);
					lblC.setBounds(20, 120, 100, 200);
					add(lblKll);
					lblKll.setText("Keliling Persegi = "+kll);
					lblKll.setBounds(20, 250, 150, 20);
					add(lblLuas);
					lblLuas.setText("Luas Persegi = "+luas);
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
					lblLuas.setText("Luas Persegi = "+luas);
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
					lblKll.setText("Keliling Persegi = "+kll);
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
