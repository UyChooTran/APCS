/**
 * Write a description of class MagSqaures here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class MagSqaures
{
    public static void main (String [] args )
    {
        ConsoleIO in = new ConsoleIO();

        System.out.print("How many magic squares would you like to find? ");
        int n = in.readInt();
        magicsquare(n);

        System.out.print("What integer would you like to reverse? ");
        n = in.readInt();
        reverse(n);

        System.out.println("What two numbers would you like to find the LCM of?");
        n = in.readInt();
        int n1 = in.readInt();
        lcm(n , n1);

    }

    public static void magicsquare(int num)
    {
        int magic = 1;
        while (num>0)
        {
            if (Math.sqrt(magic)%1==0 && sumofint(magic)) 
            {System.out.println(magic);num--;}
            magic++;
        }
    }

    private static boolean sumofint(int num)
    {
        int sum=0;
        for (int x=1; x <= num; x++)
        {
            sum+=x; 
            if (num == sum) 
                return true;
        }
        return false;
    }

    public static void reverse (int num)
    {
        int count = 0;
        int loc = length(num) - 1;
        
        while (count < length(num))
        {
            String number = String.valueOf(num);
            System.out.print(number.charAt(loc));
            count++;
            loc--;
        }
        System.out.println("\n");
    }

    private static int length (int num)
    {
        return(String.valueOf(num).length());
    }

    public static void lcm (int x , int y)
    {
        int lcm = calc(x , y);
        System.out.println("\n");
        System.out.println("LCM = " + lcm);
    }

    private static int calc (int x , int y)
    {
        int lcmx = 1;
        int lcmy = 1;
        for (int count=2; count>0; count++)
        {
            lcmx = x * count;
            if (lcmx % y == 0)
                break;
        }
        return lcmx;
    }
}

