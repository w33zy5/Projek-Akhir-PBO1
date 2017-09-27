import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupMenu extends JPopupMenu {
	
	String nama;
	JMenu submenu;
	public PopupMenu(String n){
		nama=n;
		JMenuItem menuItemHome= new JMenuItem("Home");
		add(menuItemHome);
		menuItemHome.setActionCommand("Home");
		menuItemHome.addActionListener(PopMenu);
		addSeparator();
		submenu= new JMenu("Pilihan");
		//segitiga
		JMenuItem mnPilSeg=new JMenuItem("Segitiga");
		submenu.add(mnPilSeg);
		mnPilSeg.setActionCommand("Segitiga");
		mnPilSeg.addActionListener(PopMenu);
		//persegi
		JMenuItem mnPilPer=new JMenuItem("Persegi");
		submenu.add(mnPilPer);
		mnPilPer.setActionCommand("Persegi");
		mnPilPer.addActionListener(PopMenu);
		//persegi_panjang
		JMenuItem mnPilPerPan=new JMenuItem("Persegi Panjang");
		submenu.add(mnPilPerPan);
		mnPilPerPan.setActionCommand("Persegi Panjang");
		mnPilPerPan.addActionListener(PopMenu);
		//jajar_genjang
		JMenuItem mnPilJajar=new JMenuItem("Jajar Genjang");
		submenu.add(mnPilJajar);
		mnPilJajar.setActionCommand("Jajar Genjang");
		mnPilJajar.addActionListener(PopMenu);
		//trapesium
		JMenuItem mnPilTrape=new JMenuItem("Trapesium");
		submenu.add(mnPilTrape);
		mnPilTrape.setActionCommand("Trapesium");
		mnPilTrape.addActionListener(PopMenu);
		//lingkaran
		JMenuItem mnPilLing=new JMenuItem("Lingkaran");
		submenu.add(mnPilLing);
		mnPilLing.setActionCommand("Lingkaran");
		mnPilLing.addActionListener(PopMenu);
		add(submenu);
		addSeparator();
		JMenuItem menuItemExit= new JMenuItem("Exit");
		add(menuItemExit);	
		menuItemExit.setActionCommand("Exit");
		menuItemExit.addActionListener(PopMenu);
	}
	
	ActionListener PopMenu = new ActionListener(){
		public void actionPerformed(ActionEvent Pop) {
			String Click = Pop.getActionCommand();
			if(Click.equals("Home")){
				
				Project1 Project1 = new Project1();
			}
			else if(Click.equals("Segitiga")){
				Segitiga Segitiga = new Segitiga(nama);
				
			}
			else if(Click.equals("Persegi")){
				Persegi Persegi = new Persegi(nama);
			}
			else if(Click.equals("Persegi Panjang")){
				Persegi_Panjang Persegi_Panjang = new Persegi_Panjang(nama);
			}
			else if(Click.equals("Jajar Genjang")){
				Jajar_Genjang Jajar_Genjang = new Jajar_Genjang(nama);
			}
			else if(Click.equals("Trapesium")){
				Trapesium Trapesium = new Trapesium(nama);
			}
			else if(Click.equals("Lingkaran")){
				Lingkaran Lingkaran = new Lingkaran(nama);
			}
			else if(Click.equals("Exit")){
				System.exit(1);
			}
		}
	};
}
