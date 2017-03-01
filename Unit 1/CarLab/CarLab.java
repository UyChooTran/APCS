
/**
 * Write a description of class CarLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class CarLab
{
    public static void main(String[] args)
    {
        System.out.print("What is the make of the car? (What company made it?: ");
        ConsoleIO in = new ConsoleIO();
        String make = in.readToken();
        System.out.print("\nWhat model car is it?: ");
        String model = in.readToken();
        
        System.out.println("\nWhat is license plate number on the car?");
        System.out.print("Please leave a space between the letters and numbers: ");
        String letters = in.readToken();
        int lic = in.readInt();
        char l1 , l2 , l3;
        l1 = letters.charAt(0);
        l2 = letters.charAt(1);
        l3 = letters.charAt(2);
        
        int converted = ((int)(l1)) + ((int)(l2)) + ((int)(l3));
        int code = converted + lic;
        int x = code % 26;
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char random = alpha.charAt(x);
        
        System.out.println("\nMake = " + make);
        System.out.println("Model = " + model);
        System.out.println(letters + lic + " = " + random + code);
    }
}
