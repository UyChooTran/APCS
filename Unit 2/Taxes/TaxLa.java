
/**
 * Write a description of class TaxLa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class TaxLa
{
    public static void main(String[] args)
    {
        ConsoleIO in = new ConsoleIO();
        System.out.print("How many hours did you work?: ");
        double hours = in.readDouble();
        System.out.print("\nHow much do you make per hour?: ");
        double rate = in.readDouble();
        double gross = rate * hours;
        System.out.print("\nHours worked:");
        System.out.println(Format.center(hours,30,2) + "\n");
        System.out.print("Hourly pay:");
        System.out.println(Format.center(rate,30,2) + "\n");
        System.out.print("Gross pay:");
        System.out.println(Format.center(gross,30,2) + "\n");
        
        final double FED = .15;
        final double FICA = .0765;
        final double STATE = .04;
        System.out.println("Federal tax (15%)" + Format.center(FED * gross,30,2));
        System.out.println("FICA (7.65%)" + Format.center(FICA * gross, 30, 2));
        System.out.println("State tax (4%)" + Format.center(STATE * gross, 30 , 2));
        double net = (gross-((FICA + STATE + FED ) * gross));
        System.out.print("Net pay:" +Format.center(net,30,2));
        
    }
}
