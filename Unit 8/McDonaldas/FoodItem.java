
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.text.*;

/**
 * Write a description of class FoodItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FoodItem extends JButton implements Clickable
{
    public double cot;
   public FoodItem(String food, String cost)
   {

       super(food + " $" + cost);
       cot = Double.parseDouble(cost);
       
    }
    
    public void isClicked()
    {
        getText();
        reg.add(cot);
        JOptionPane.showMessageDialog(null,getText());
    }
}
