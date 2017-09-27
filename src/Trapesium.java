import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Trapesium extends JFrame{
	JLabel lblTinggi = new JLabel("Tinggi Trapesium");
	JLabel lblSisiAlas = new JLabel("Sisi Alas Trapesium");
	JLabel lblSisiB = new JLabel("Sisi B Trapesium");
	JLabel lblSisiC = new JLabel("Sisi Atas Trapesium");
	JLabel lblSisiD = new JLabel("Sisi D Trapesium");
	JLabel lblNama = new JLabel("");
	JLabel lblA = new JLabel("Anda sedang menghitung Keliling dan Luas Trapesium");
	JLabel lblB = new JLabel("----------------------------------------------------------------------------------------------------------");
	JLabel lblC = new JLabel("Hasil Perhitungan");
	JLabel lblKll = new JLabel("");
	JLabel lblLuas = new JLabel("");
	JLabel lblZZ = new JLabel("");
	JCheckBox checkLuas = new JCheckBox("Hitung Luas Trapesium");
	JCheckBox checkKll = new JCheckBox("Hitung Keliling Trapesium");
	JTextField txtTinggi = new JTextField();
	JTextField txtPanjang= new JTextField();
	JTextField txtSisiAlas = new JTextField();
	JTextField txtSisiB = new JTextField();
	JTextField txtSisiC = new JTextField();
	JTextField txtSisiD = new JTextField();
	JButton btnHitSegitiga = new JButton("Hitung Trapesium");
	public Trapesium(String n){
		String nama=n;
		setTitle("Hitung Trapesium");
		setSize(400,400); 
		setLayout(null);
		
		PopupMenu popupMenu = new PopupMenu(nama);
		PopupMenuListener LisMouse = new PopupMenuListener(popupMenu);
		addMouseListener(LisMouse);
		
		add(lblTinggi);
		lblTinggi.setBounds(20, 50, 120, 20);
		add(txtTinggi);
		txtTinggi.setBounds(150, 50, 100, 20);
		add(lblSisiAlas);
		lblSisiAlas.setBounds(20, 70, 150, 20);
		add(txtSisiAlas);
		txtSisiAlas.setBounds(150, 70, 100, 20);
		add(lblSisiB);
		lblSisiB.setBounds(20, 90, 100, 20);
		add(txtSisiB);
		txtSisiB.setBounds(150,90,100,20);
		add(lblSisiC);
		lblSisiC.setBounds(20, 110, 150, 20);
		add(txtSisiC);
		txtSisiC.setBounds(150,110,100,20);
		add(lblSisiD);
		lblSisiD.setBounds(20,130,100,20);
		add(txtSisiD);
		txtSisiD.setBounds(150,130,100,20);
		
		add(lblNama);
		lblNama.setText("Selamat Datang "+nama);
		lblNama.setBounds(20, 5, 200, 20);
		add(lblA);
		lblA.setBounds(20, 25, 350, 20);
		add(lblB);
		lblB.setBounds(0, 40, 500, 5);
		
		add(checkLuas);
		checkLuas.setBounds(20, 160, 180, 20);
		add(checkKll);
		checkKll.setBounds(20, 180, 200, 20);
		
		add(btnHitSegitiga);
		btnHitSegitiga.setBounds(100, 210, 150, 30);
		btnHitSegitiga.setActionCommand("btnHitSegitiga");
		btnHitSegitiga.addActionListener(actHitSegitiga);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	ActionListener actHitSegitiga = new ActionListener(){
		public void actionPerformed(ActionEvent btnHitung) {
			
			float Tinggi = Float.parseFloat(txtTinggi.getText());
			float SisiAlas = Float.parseFloat(txtSisiAlas.getText());
			float SisiB = Float.parseFloat(txtSisiB.getText());
			float SisiC = Float.parseFloat(txtSisiC.getText());
			float SisiD = Float.parseFloat(txtSisiD.getText());
			float kll=0.5f*(SisiAlas+SisiC)*Tinggi;
			float luas= SisiAlas+SisiB+SisiC+SisiD;
			
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
	};
}
