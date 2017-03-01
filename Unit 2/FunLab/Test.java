
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import apcslib.*;
import chn.util.*;
public class Test
{
    public static void main(String []args)
    {
        ConsoleIO in = new ConsoleIO();
        
        System.out.print("Give a temperature in Fahrenheit: ");
        double fahr = in.readDouble();
        System.out.println("\n" + fahr + "F in Celsius is " + Format.left(Fun.fToC(fahr), 10 , 2));
        
        System.out.print("Give a temperature in Celsius: ");
        double cel = in.readDouble();
        System.out.println("\n" + cel + "C in Fahrenheit is " + Format.left(Fun.cToF(cel), 10 ,2));
        
        System.out.print("Give a sphere radius: ");
        double rad = in.readDouble();
        System.out.println("\nThe volume of a sphere with a radius of " + rad + " would be " 
            + Format.left(Fun.vol(rad) , 10 ,2 ));
            
        System.out.print("Give one leg length of a right triangle: ");
        double a = in.readDouble();
        System.out.print("\nGive the length of the other leg: ");
        double b = in.readDouble();
        System.out.println("\nThe length of the third side will be " 
        + Format.left(Fun.pythag(a,b),10,2));

    }
}
