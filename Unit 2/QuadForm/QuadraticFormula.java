
/**
 * Write a description of class QuadraticFormula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class QuadraticFormula
{
    public static void main(String [] args)
    {
        ConsoleIO in = new ConsoleIO();
        System.out.print("Enter the first coefficient of the quadratic equation:");
        double a = in.readDouble();
        System.out.print("\nEnter the second coefficient of the quadratic equation:");
        double b = in.readDouble();
        System.out.print("\nEnter the last coefficient of the quadratic equation:");
        double c = in.readDouble();
        double ans , ans1;
        ans = (-b + Math.sqrt(Math.pow(a,2) - 4 * a * c)) / (2 * a);
        ans1 = (-b - Math.sqrt(Math.pow(a,2) - 4 * a * c)) / (2 * a);
        System.out.print("The answers of the function are " + Format.left(ans,2,2) 
        + " and " + Format.left(ans1,2,2));
    }
}
