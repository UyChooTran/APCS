
/**
 * Write a description of class Logic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class Stats1
{
    private int[] x = new int[1000]; 
    private FileInput fi; 
    private int logLen; 
    public static void main (String [] args)
    {
        Stats1 stat = new Stats1("numbers.txt"); 
        stat.readFile(); 
        stat.print(); 

    }

    public Stats1(String fileName)
    {
        fi = new FileInput("numbers.txt");

    }

    public void print()
    {
        for(int i = 0; i < logLen; i++)
        {
            System.out.println(x[i]); 
        }
    }
    public void readFile()
    {
        int line = 0; 
        while (fi.hasMoreTokens())
        {
            x[line] =  fi.readInt();
            line++;
        }
        logLen = line; 

    }

    public static double ave(double x , double y)
    {
        return (x/y);
    }

    public static double SumSquare(int [] x, double average, int len)
    {
        int counter = 0;
        double sum = 0;
        while (counter < len)
        {
            sum += Math.pow(((double)x[counter] - average),2);
            counter++;
        }
        return Math.sqrt(sum/counter);
    }

    public static String mode(int [] x , int l)
    {
        int len = l;
        int [] y = new int[101];
        int counter  = 0;
        int compare = 1;
        while(counter < len)
        {
            while(compare < len)
            {
                if(x[counter] == x[compare])
                {
                    y[counter]++;
                }
                compare++;
            }
            counter++;
            compare = counter + 1;
        }

        for (int j = 0; j < y.length; j++)
        {
            System.out.println("there are " + y[j] + " " + j + "'s");
        }

        //         int max = y[0];
        //         counter = 1;
        //         while (counter < len)
        //         {
        //             if (max < y[counter])
        //             {
        //                 max = y[counter];
        //             }
        //             counter++;
        //         }
        //         counter = 0;
        //         String end = (find(max , x , y , len , counter));
        //         int erase = end.length();
        //         if (find(max , x , y , len , counter).substring(end.length()-1, end.length()).equals("/"))
        //         {
        //             do
        //             {
        //                 end += find(max , x , y , len , counter) + ":";
        //                 counter++;
        //             }while((find(max , x , y , len , counter).charAt(end.length()-2))=='/');
        //         }
        //         end = end.substring(erase);
        //         end = end.replaceAll("/", "");
        //         end = end.replaceAll(":", "\n");
        return "";
    }

    public static String find(int max , int[] x , int[] y , int l , int pos)
    {

        while (pos < l)
        {
            if(max == y[pos])
            {
                if(moreVal(y , pos+1, max))
                {
                    return x[pos] + "/";
                }
                return "" + x[pos];
            }
            pos++;
        }
        return "" + x[pos];
    }

    //do +1 to pos in call
    public static boolean moreVal(int [] maxes , int pos , int max)
    {
        while(pos < maxes.length)
        {
            if (maxes[pos] == max)
            {
                return true;
            }
            pos++;
        }
        return false;
    }
}
