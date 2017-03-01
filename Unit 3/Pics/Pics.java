
/**
 * Write a description of class Pics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class Pics
{
    public static void main (String[] args)
    {
        System.out.println("Please give two values from 1-12");
        ConsoleIO in = new ConsoleIO();
        int r = in.readInt();
        int c = in.readInt();
        table(r,c);
        System.out.println("\n\n\nHow many rows of stars would you like?");
        int stars = in.readInt();
        Pyr(stars);
    }

    public static void table (int r , int c)
    {
        int x = 1;
        boolean repeat;
        int array[] = new int[c];
        do
        {if (r > 12 || r < 1 || c >12 || c <1)
            {
                System.out.println("Please give values from 1-12");
                repeat = true;
            }
            else
            {
                while ( x <= c)
                {
                    System.out.print("\t" + x);
                    array[x-1] = x;
                    x++;
                }
                int y = 1;
                System.out.println(" ");
                while (y <= r)
                {
                    x = 1;
                    System.out.println(" ");
                    //System.out.println(array[x]); 
                    System.out.print(y);
                    while (x <= c)
                    {
                        System.out.print("\t" + (y * array[(x-1)]));
                        x++;
                    }
                    y++;
                }
                repeat = false;
            }
        }while(repeat == true);
    }

    public static void Pyr(int rows)
    {
        int space = 0;
        int r = 2*rows;
        int stars = 1;
        String star = "*";
        for (int count=1; count<=rows; count++)
        {
            System.out.println(" ");
            space= 0;
            while(space <= (r/2))
            {
                System.out.print(" ");
                space++;
            }
            r-=2;
            System.out.print(star);
            stars +=2;
            while ( star.length() != stars)
            {
                star = star + "*";
            }
            

        }
    }
}

