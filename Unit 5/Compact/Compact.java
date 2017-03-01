
/**
 * Write a description of class Compact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class Compact
{
    private int[] x;
    private FileInput fi;
    private int log;
    private int num;
    public Compact(String y)
    {
        fi = new FileInput(y);
        num = 0;
        x = array();
        log = x[0];
        remove();
        
    }

    public int[] array()
    {
        int spot = 0;
        int[] x = new int[101];
        while(fi.hasMoreTokens())
        {
            x[spot+1] = Integer.parseInt(fi.readToken());
            if(x[spot+1]!=0)
            num++;
            spot++;
        }
        x[0] = spot;
        return x;
    }

    public void remove()

    {
        int counter = 0;
        while (counter < log)
        {
            x[counter] = x[counter+1];
            counter++;
        }
    }

    public void print()
    {
        for (int i = 0; i<log; i++)
        {
            System.out.print(x[i] + " ");
        }
        System.out.println("\n");
    }
    
     public void print(int j)
    {
        for (int i = 0; i<num; i++)
        {
            System.out.print(x[i] + " ");
        }
        System.out.println("\n");
    }

//     public void compact()
//     {
//         int counter = 0;
//         int pos = 0;
//         
//         while (counter < log && pos < num)
//         {
//             if(x[counter] != 0)
//             {
//                 x[pos] = x[counter];
//                 pos++;
//             }
//             counter++;
//         }
//     }
    public int compact(int u)
    {
        int counter = 0;
        int ano = 0;

            
            counter = 0;
            while(counter < log)
            {
                ano = counter;

                if(x[counter] == 0)
                {
                    while(ano < log )
                    {
                        x[ano] = x[ano+1];
                        ano++;
                    }
                    counter--;
                }
                counter++;
            }
            
            if(u == 0)
            compact(1);

            return -1;
        }

}

