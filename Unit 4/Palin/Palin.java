
import java.util.*;
import chn.util.*;
public class Palin
{
    public static void main (String[] args)
    {
        String test;
        Scanner in = new Scanner(System.in);
// ConsoleIO in = new ConsoleIO();
        int y;
        int count = 0;
        boolean single = false;
        int why;

        System.out.print("Enter a string: ");
        test = in.nextLine();
// test = in.readLine();
        while (!test.equals("q") && !test.equals("Q"))
        {
            test =  test.replaceAll("[^A-Za-z0-9 ]", "");
            test = test.replace(" " , "");
            test = test.toLowerCase();
            char [] pal = test.toCharArray();
            y = test.length();
            if ( y == 1)
                single = true;
            why = y;
            count = 0;
            char [] rev = new char [y];
            System.out.println("array length: " + rev.length); 
            while (count != y)
            {

                rev [count] = pal [why-1];//need to figure out if this works
                count++;
                why--;
            }
            String back = new String(rev);
            System.out.println(back);
            System.out.println(test);
            if (back.equals(test) && !single)
            {
                System.out.println("\nCongrats, it's a palindrone!");
            }

            else
            {
                System.out.println("\nNot a palindrone");
                single = false;
            }
            System.out.print("Enter another string: ");
            test = in.nextLine();
        }
        System.out.println("\nProgram terminated");
    }
}