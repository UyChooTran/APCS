
/**
 * Write a description of class Fib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fib
{

    public Fib()
    {
    }

    public static int find(int x)
    {
        if(x ==0)
        {
            return 0;
        }
        else if ( x == 1 || x == 1)
        {
            return 1;
        }
        else
        {
            return find(x-1) + find(x-2);
        }
    }

    public static int nonrec(int x)
    {
        int counter = 2;
        int[]  array = new int[x+2];
        array[0] = 0;
        array[1] = 1;
        while ( counter <= x)
        {
         array[counter] = array[counter -1] + array[counter - 2];  
         counter++;
        }
        return array[x];
    }
    
    public static int multi(int x, int y)
    {
        if (y==1)
        return x;
        else if(y ==0)
        return 0;
        else
        {
            return x + multi(x, y-1);
        }
    }
}