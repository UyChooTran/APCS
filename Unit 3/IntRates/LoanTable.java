
/**
 * Write a description of class IntRates here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class LoanTable
{
    public static void main (String [] args)
    {
        ConsoleIO in = new ConsoleIO();
        System.out.print("How much is your loan? : ");
        double loan = in.readDouble();
        System.out.print("How long do you have to pay of your loan in years? ");
        double years = in.readDouble();
        System.out.print("How much is the low annual interest rate?: " );
        double lrate = in.readDouble();
        System.out.print("How much is the high annual interest rate?: ");
        double hrate = in.readDouble();
        double months = 12* years;

        System.out.println("\nPrincipal = $" + loan);
        System.out.println("Time = " + years + " years");
        System.out.println("Low rate = " + lrate + "%");
        System.out.println("High rate = " + hrate + "%");
        System.out.println("\nAnnual Interest Rate \t Monthly Payment");
        double c, a , k;
        double p = loan;
        double n = years * 12.0;
        double top , bottom;
        lrate = lrate *.01;
        hrate = hrate * .01;
        while (lrate <= hrate + .001)
        {
            System.out.print(Format.left(lrate * 100,2,2));
            k = (lrate /12.0);
            c = Math.pow((1.0+k),n);
            bottom = (c - 1.0);
            a = (p * k * c )/bottom;
            System.out.println("\t\t\t\t" + Format.left(a,2,2));
            lrate += .0025;
        }

    }
}
