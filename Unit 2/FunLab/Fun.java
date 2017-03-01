
/**
 * Write a description of class Fun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Fun
{
    public static double  fToC (double far)
    {
        return 5.0/9 * (far - 32);
    }

    public static double cToF (double cel)
    {
        return (9.0/5 * cel) + 32; 
    }
    
    public static double vol (double radius)
    {
        return 4.0/3 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double pythag ( double a, double b)
    {
        return Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));
    }
    
    
}
