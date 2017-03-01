
/**
 * Write a description of class Erm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class PermutationGenerator
{
    public ArrayList<Integer> num;
    public Random ran;
    public PermutationGenerator()
    {
        num = new ArrayList<Integer>();
        numChange(10);
        ran = new Random();
    }

    private void numChange(int x)
    {
        for (int i = 1; i !=x+1; i++)
        {
            num.add(i);
        }
    }

    public ArrayList<Integer> nextPermutation()
    {
        ArrayList<Integer> j = new ArrayList<Integer>();
        int x = num.get(ran.nextInt(10));
        while( j.size() != num.size())
        {
            if (j.indexOf(x) == -1)
            j.add(x);
            x = num.get(ran.nextInt(10));
        }
        return j;
    }

    public static void main(String[] args)
    {
        PermutationGenerator li = new PermutationGenerator();
        ArrayList<Integer> l = new ArrayList<Integer>();
        l = li.nextPermutation();
        for( int i = 0; i < 999999999; i++)
        {
            System.out.println(" List " + (i+1) + " " + l);
            //System.out.println(sum(l));
            l = li.nextPermutation();
        }
    }
    
    public static String sum(ArrayList<Integer> t)
    {
        String f = "Sum of first and last: ";
        f += (t.get(0) + t.get(t.size()-1));
        return f;
    }
}