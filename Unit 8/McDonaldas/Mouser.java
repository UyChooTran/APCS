import java.awt.event.MouseListener; 
import java.awt.event.MouseEvent; 
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Mouser implements MouseListener {
    public void mouseClicked(MouseEvent e) 
    { Clickable pressed = (Clickable)e.getSource();
        pressed.isClicked();
        
    }

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}

    public void mousePressed(MouseEvent e)
    {}

    public void mouseReleased(MouseEvent e){}
}