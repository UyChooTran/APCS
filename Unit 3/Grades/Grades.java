
/**
 * Write a description of class Grades here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class Grades
{
    public static void main (String [] args )
    {
        ConsoleIO in = new ConsoleIO();
        System.out.println("Enter your letter grades, enter a non-A, B, C, D, F letter to terminate");
        int i = 0;
        char grade;
        double gpa = 0;
        boolean breaker = false;
        boolean f = false;
        boolean less = false;
        while (i != 58946)
        {
            grade = in.readToken().charAt(0);
            switch(grade)
            {
                case 'A': case 'a': gpa += 4.0;
                break;
                case 'B': case 'b': gpa += 3.0;
                break;
                case 'C': case 'c': gpa += 2.0;
                break;
                case 'D': case 'd': gpa += 1.0;
                break;
                case 'F': case 'f': f = true;
                break;
                default: breaker = true;
            }
            if ( breaker == true)
                break;
            i++;
        }

        if ( i < 4)
        {
            System.out.println("Inelgible, taking less than 4 classes");
            less = true;
        }
        else
        {
            gpa /= (double)i;
        }

        if (gpa < 2 && f && !less )
        {
            System.out.println("Ineligible, gpa below 2.0 and has F grade");
        }
        else if (gpa < 2 && !f && !less)
        {
            System.out.println("Ineligible, gpa below 2.0");
        }
        else if (gpa >= 2 && f && !less)
        {
            System.out.println("Ineligible, gpa above 2.0 but has F grade");
        }
        else if (gpa >= 2 && !f && !less)
        {
            System.out.println("Eligible");
        }
    }
}
