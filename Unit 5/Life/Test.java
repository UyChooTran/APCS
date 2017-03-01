
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
   public static void main (String args[])
   {
       Life l1 =new Life();
       l1.print(l1.board);
       l1.live(5);
       l1.print(l1.board);
       l1.print(10, 'r');
       l1.print(10, 'c');
       l1.printAll();
    }
}
