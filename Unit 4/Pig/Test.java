
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import chn.util.*;
public class Test
{
    public static void main (String [] args)
    {
        ConsoleIO input = new ConsoleIO();
        System.out.println("This translates English into Pig Latin \n Have Fun!");
        System.out.println('\n');
        Scanner in = new Scanner(System.in);
        String again = "";
        do
        {
            System.out.print("\nWhat would you like to translate to Pig Latin? ");
           do
           {
           Translate words = new Translate(in.next());
           System.out.print(words.trans() + " ");
        }while( in.hasNext());
        
        System.out.println("\nWould you like to translate anything else?");
        again = input.readToken();
    }while (again.equals("Yes") || again.equals("yes") || again.equals("YES"));
}
}
