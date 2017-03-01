
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class Tester
{
    public static void main (String[] args)
    {
        ConsoleIO in = new ConsoleIO();
        String again;
        do
        {
            System.out.print("\nHow much is your annual taxable income? ");
            double income = in.readDouble();

            System.out.print("Are you married or single? ");
            String resp = in.readToken();
            boolean marriage;
            boolean sass;

            //do 
            //{
                if (resp.charAt(0) == 'm' || resp.charAt(0) == 'M')
                {
                    marriage = true;
                    sass = false;
                }
                else if (resp.charAt(0) == 's' || resp.charAt(0) == 'S')
                {
                    marriage = false;
                    sass = false;
                }
                else 
                { 
                    sass = true;
                    marriage = true;
                    System.out.println("I don't need your personal problems. Do your own damn taxes then.");
                }
            //}
            //while (sass = true);
            Tax person = new Tax( marriage , income);
            System.out.println(person.calcTax());
            System.out.print("Would you like to file more taxes? Y/N");
            again = in.readToken();
        }while(again.charAt(0) == 'y' || again.charAt(0) == 'Y');
    }
}
