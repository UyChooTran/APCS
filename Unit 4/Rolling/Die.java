
/**
 * Write a description of class Roll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Die
{
    int value;
    public Die()
    {
        value = dice();
    }

    private static int dice()
    {
        double r = (Math.random() * 6.0 + 1.0);
        int roll = (int)r;
        return roll;
    }

    public void roll()
    {
        value = dice();
    }

    public String toString()
    {
        return "" + value;
    }
    
    public int test()
    { 
        return value;
    }
}
