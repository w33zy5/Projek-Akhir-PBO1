import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Persegi_Panjang extends JFrame{
	boolean proses;
	JLabel lblLebar = new JLabel("Lebar Persegi Panjang");
	JLabel lblPanjang = new JLabel("Panjang Persegi Panjang");
	JLabel lblNama = new JLabel("");
	JLabel lblA = new JLabel("Anda sedang menghitung Keliling dan Luas Persegi Panjang");
	JLabel lblB = new JLabel("----------------------------------------------------------------------------------------------------------");
	JLabel lblC = new JLabel("Hasil Perhitungan");
	JLabel lblKll = new JLabel("");
	JLabel lblLuas = new JLabel("");
	JLabel lblZZ = new JLabel("");
	JCheckBox checkLuas = new JCheckBox("Hitung Luas Persegi Panjang");
	JCheckBox checkKll = new JCheckBox("Hitung Keliling Persegi Panjang");
	JTextField txtLebar = new JTextField();
	JTextField txtPanjang= new JTextField();
	JButton btnHitPersPanjang = new JButton("Hitung Persegi Panjang");
	public Persegi_Panjang(String n){
		String nama=n;
		setTitle("Hitung Persegi Panjang");
		setSize(400,400); 
		setLayout(null);
		
		PopupMenu popupMenu = new PopupMenu(nama);
		PopupMenuListener LisMouse = new PopupMenuListener(popupMenu);
		addMouseListener(LisMouse);
		
		add(lblLebar);
		lblLebar.setBounds(20, 50, 150, 20);
		add(txtLebar);
		txtLebar.setBounds(200, 50, 100, 20);
		add(lblPanjang);
		lblPanjang.setBounds(20, 70, 150, 20);
		add(txtPanjang);
		txtPanjang.setBounds(200, 70, 100, 20);
		
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
		checkKll.setBounds(20, 130, 250, 20);
		
		add(btnHitPersPanjang);
		btnHitPersPanjang.setBounds(90, 160, 200, 30);
		btnHitPersPanjang.setActionCommand("btnHitPersPanjang");
		btnHitPersPanjang.addActionListener(actHitPersPanjang);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	ActionListener actHitPersPanjang = new ActionListener(){
		public void actionPerformed(ActionEvent btnHitung) {
			String btn = btnHitung.getActionCommand();
			
			if((txtLebar.getText().equals("")) || (txtPanjang.getText().equals(""))){
				proses=false;
			}
			else if((txtLebar.getText().equals("")) && (txtPanjang.getText().equals(""))){
				proses=false;
			}
			else{
				proses=true;
			}
			float Lebar = Float.parseFloat(txtLebar.getText());
			float Panjang = Float.parseFloat(txtPanjang.getText());
			float kll=2*(Lebar*Panjang);
			float luas= Panjang*Lebar;
			
			if((btn.equals("btnHitPersPanjang")) && (proses==true)){
				if((checkLuas.isSelected()) && (checkKll.isSelected())){
					lblKll.setVisible(true);
					lblLuas.setVisible(true);
					lblC.setVisible(true);
					lblZZ.setVisible(false);
					add(lblC);
					lblC.setBounds(20, 120, 100, 200);
					add(lblKll);
					lblKll.setText("Keliling Persegi Panjang = "+kll);
					lblKll.setBounds(20, 250, 150, 20);
					add(lblLuas);
					lblLuas.setText("Luas Persegi Panjang = "+luas);
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
					lblLuas.setText("Luas Persegi Panjang = "+luas);
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
					lblKll.setText("Keliling Persegi Panjang = "+kll);
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
