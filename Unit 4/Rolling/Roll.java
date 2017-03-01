
/**
 * Write a description of class Roll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roll
{
    public static void main (String []args)
    {
        Die a = new Die();
        Die b = new Die();
        Die c = new Die();
        int count = 0;
        System.out.println(a + " " + b + " " + c + " ");
        while ((a.test() == c.test()) || (a.test() == b.test()) ||  ( b.test() == c.test()))
        {
            count++;
            a.roll();
            b.roll();
            c.roll();
            System.out.println(a + " " + b + " " + c + " ");
        }
        count++;
        System.out.println("count = " + count);
    }
}
