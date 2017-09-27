import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;

public class PopupMenuListener extends MouseAdapter {
	JPopupMenu popupMenu;
	public PopupMenuListener(JPopupMenu popupMenu){
		this.popupMenu=popupMenu;
	}
	
	public void mouseClicked(MouseEvent e){
		popupMenu.show(e.getComponent(), e.getX(), e.getY());
	}
}
