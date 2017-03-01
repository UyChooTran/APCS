import java.util.*;

/**
 *  Description of the Class
 *
 * @author     Your Name Here
 * @created    Month Day, Year
 */
public class Sorts
{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    Sorts()
    {
        steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(int[] list)
    {
        // Replace these lines with your code
        steps = 0;
        steps++;
        for (int outer = 0; outer < list.length - 1; outer++)
        {
            steps+=3;
            for (int inner = 0; inner < list.length-outer-1; inner++)
            {
                steps+=3;
                if (list[inner] > list[inner + 1])
                {
                    //swap list[inner] & list[inner+1]
                    int temp = list[inner];
                    list[inner] = list[inner + 1];
                    list[inner + 1] = temp;
                    steps+=3;
                }
            }
        }

    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(int[] list)
    {
        steps = 0;
        int min, temp;
        steps++;
        for (int outer = 0; outer < list.length - 1; outer++)
        {
            min = outer;
            steps++;
            steps+=3;
            for (int inner = outer + 1; inner < list.length; inner++)
            {
                steps+=3;
                if (list[inner] < list[min])
                {
                    min = inner;
                    steps++;
                }
            }
            //swap list[outer] & list[flag]
            temp = list[outer];
            list[outer] = list[min];
            list[min] = temp;
            steps+=3;
        }
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(int[] list)
    {
        steps = 0;
        steps++;
        for (int outer = 1; outer < list.length; outer++)
        {
            int position = outer;
            int key = list[position];
            steps+= 4;
            // Shift larger values to the right
            while (position > 0 && list[position - 1] > key)
            {
                list[position] = list[position - 1];
                steps+=2;
                position--;
            }
            list[position] = key;
            steps++;
        }
    }

    /**
     *  Takes in entire vector, but will merge the following sections
     *  together:  Left sublist from a[first]..a[mid], right sublist from
     *  a[mid+1]..a[last].  Precondition:  each sublist is already in
     *  ascending order
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  mid    midpoint index of range of values to be sorted
     * @param  last   last index of range of values to be sorted
     */
    private void merge(int[] a, int first, int mid, int last)
    {
        mid++;
        int mid2= mid;
        int first2 = first;
        int last2 = last;
        int len = mid - first -1;
        int len2 = last- mid;
        int[] temp = new int[last - first +1];
        steps+=7;
        //mid is start of 2nd array, exclusive first array
        for (int x = 0; x < temp.length; x++)
        {
            steps+=3;
            if(first-first2 >len)
            {
                temp[x] = a[mid];
                mid++;
                steps+=2;
            }
            else if (mid-mid2 > len2)
            {
                temp [x] = a[first];
                first++;
                steps+=2;
            }
            else if(a[first]<= a[mid])
            {
                temp[x] = a[first];
                first++;
                steps+=2;
            }
            else if (a[mid] < a[first])
            {
                temp[x] = a[mid];
                mid++;
                steps+=2;
            }
        }
        steps++;
        for(int z : temp)
        {
            a[first2] = z;
            first2++;
            steps+=4;
        }
    }

    /**
     *  Recursive mergesort of an array of integers
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  last   ending index of range of values to be sorted
     */
    public void mergeSort(int[] a, int first, int last)
    {

        if (first == last)
        {
            ;
        }
        else
        {
            if(last - first == 1)
            {
                if (a[first] > a[last])
                {
                    int ok = a[first];
                    a[first] = a[last];
                    a[last] = ok;
                }
            }
            else
            {
                int mid = (last + first)/2 ;
                mergeSort(a , first , mid);
                mergeSort(a , mid+1 , last);
                merge(a, first,mid,last);
            }
        }
    }

    /**
     *  Recursive quicksort of an array of integers
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  last   ending index of range of values to be sorted
     */
    public void quickSort(int[] a, int first, int last)
    {
        int g = first, h = last;
        int midIndex = (first + last) / 2;
        int dividingValue = a[midIndex];
        steps+=4;
        do
        {
            while (a[g] < dividingValue)
            {
                g++;
                steps+=2;
            }
            while (a[h] > dividingValue)
            {
                steps+=2;
                h--;
            }
            steps++;
            if (g <= h)
            {
                //swap(a[g], a[h]);
                steps+=5;
                int temp = a[g];
                a[g] = a[h];
                a[h] = temp;
                g++;
                h--;
            }
            steps++;
        }
        while (g < h);
        steps+=2;
        if (h > first)
            quickSort (a,first,h);
        if (g < last)
            quickSort (a,g,last);
    }

    /**
     *  Accessor method to return the current value of steps
     *
     */
    public long getStepCount()
    {
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(int stepCount)
    {
        steps = stepCount;
    }
}
