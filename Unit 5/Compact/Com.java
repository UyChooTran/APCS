
/**
 * Write a description of class Com here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Com
{
   public static void main (String [] args)
   {
       Compact ksal = new Compact("compact.txt");
       System.out.print("Before: ");
       ksal.print();
       ksal.compact(0);
       System.out.print("After: ");
       ksal.print(5);
    }
    
}
