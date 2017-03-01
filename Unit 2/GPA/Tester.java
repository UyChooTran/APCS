
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class Tester
{
    public static void main (String [] args)
    {
        ConsoleIO in = new ConsoleIO();
        System.out.print("What is your name?: ");
        String name = in.readLine(); 
        System.out.print("\nWhat is your ID Number?: ");
        String iD = in.readLine();
        GPA stud1 = new GPA (name , iD );
        double gPA = stud1.getGPA();

        System.out.println("\nCurrent GPA: " + gPA);
        System.out.print("Enter a grade: ");
        int g,g1,g2,g3,g4,g5;
        g = in.readInt();
        stud1.addGrade(g);

        gPA = stud1.getGPA();
        System.out.println("\nCurrent GPA: " + gPA);
        System.out.print("Enter a grade: ");
        g1 = in.readInt();
        stud1.addGrade(g1);

        gPA = stud1.getGPA();
        System.out.println("\nCurrent GPA: " + gPA);
        System.out.print("Enter a grade: ");
        g2 = in.readInt();
        stud1.addGrade(g2);

        gPA = stud1.getGPA();
        System.out.println("\nCurrent GPA: " + gPA);
        System.out.print("Enter a grade: ");
        g3 = in.readInt();
        stud1.addGrade(g3);

        gPA = stud1.getGPA();
        System.out.println("\nCurrent GPA: " + gPA);
        System.out.print("Enter a grade: ");
        g4 = in.readInt();
        stud1.addGrade(g4);

        gPA = stud1.getGPA();
        System.out.println("\nCurrent GPA: " + gPA);
        System.out.print("Enter a grade: ");
        g5 = in.readInt();
        stud1.addGrade(g5);

        gPA = stud1.getGPA();
        System.out.println("\nCurrent GPA: " + gPA);

    }
}
