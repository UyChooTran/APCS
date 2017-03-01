
/**
 * Write a description of class ChangeLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class ChangeLab
{
    public static void main(String[] args)
    {

        System.out.print("What was the price? : ");
        ConsoleIO price = new ConsoleIO();
        double cost = price.readDouble();
        double paid;
        System.out.print("\nHow much did you pay? : ");
        paid = price.readDouble();
        System.out.println("\n");
        double changedb;
        int change;
        changedb = (100 * (paid - cost)) + 0.00001;
        change = (int)changedb ;
        int cents = (change) % 100;
        System.out.println("You will get " + cents + " cents back");
        
        int quarters , dimes , nickels , pennies;
        quarters = cents/25;
        dimes = (cents % 25)/10;
        nickels = ((cents - (quarters * 25)) - (dimes * 10)) / 5;
        pennies = cents % 5;
        
        System.out.println("You will get back:");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
        
    }
}
