
/**
 * Write a description of class Orderbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OrderButton extends JButton implements Clickable
{
    public double cot;
   public OrderButton(String food, double cost)
   {
       super(food);
       cot =cost;
    }
    
    public void isClicked()
    {
        JOptionPane.showMessageDialog(null,getText() + " $" + reg.cost());
    }
}
