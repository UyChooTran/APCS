
/**
 * Write a description of class fsaw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fsaw
{
public static int[] merge(int[] a, int first, int mid, int last)
    {
        int mid2= mid;
        int first2 = first;
        int len = mid - first;
       len--;
        int[] tarr = new int[a.length];
        for (int x = 0; x < a.length; x++)
        {
            if(first > len)
            {
                tarr[x] = a[mid];
                mid++;
            }
            else if (mid-mid2 > len || (mid2 != last-first/2 && mid-mid2 >= len))
            {
                tarr [x] = a[first];
                first++;
            }
            else if(a[first]<= a[mid])
            {
                tarr[x] = a[first];
                first++;
            }
            else if (a[mid] < a[first])
            {
                tarr[x] = a[mid];
                mid++;
            }
        }
        return tarr;
    }
    
    public static void main(String [] args)
    {
        int[] x ={1, 3, 4, 5, 10, 2 , 6 , 7 ,9  };
        int first = 0;
        int last = 8;
        int mid = 5;
        
        for(int y: merge(x,first,mid,last))
        {
            System.out.println(y);
        }
    }
}
