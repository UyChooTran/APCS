
/**
 * Write a description of class Logic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class Stats
{
    
    public static void main (String [] args)
    {
        FileInput fi = new FileInput("numbers.txt");
        FileOutput fo = new FileOutput("out.txt");
        int[] out = new int[1000];
        int line = 0;
        double total = 0;
        String average = "";
        double aver;
        double dev = 0;
        String devi = "";
        while (fi.hasMoreTokens())
        {
            out[line] =  fi.readInt();
            total += out[line];
            line++;
        }
        //line is logical length
        fi.close();
        aver = ave(total , line);
        aver *= 100;
        aver = Math.round(aver);
        aver /= 100;
        average = "" + aver;
        if ( average.indexOf(".") < average.length()-3)//format to two decimal places
            average = average.substring(0,average.indexOf(".")+3);
        fo.println("Average: " + average);
        dev = SumSquare(out , aver, line);
        dev *= 100;
        dev = Math.round(dev);
        dev /= 100;
        devi += dev;
        if ( devi.indexOf(".") < devi.length()-3)//format to two decimal places
            devi = devi.substring(0,devi.indexOf(".")+3);
        fo.println("Standard Deviation: " + devi);
        fo.println("Modes: " + mode(out, line));
        System.out.println("fd");
        fo.close();
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
        int [] y = new int[len];
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

        int max = y[0];
        counter = 1;
        while (counter < len)
        {
            if (max < y[counter])
            {
                max = y[counter];
            }
            counter++;
        }
        counter = 0;
        String end = (find(max , x , y , len , counter));
        int erase = end.length();
        if (find(max , x , y , len , counter).charAt(end.length()-1)=='/')
        {
            do
            {
                end += find(max , x , y , len , counter) + ":";
                counter++;
            }while(end.charAt(end.length()-2)=='/');
        }
        end = end.substring(erase);
        end = end.replaceAll("/", ", ");
       end = end.replaceAll(":", "");
        return end;
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
