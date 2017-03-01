
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private int iD;
    private double gpa;
    public Student()
    {
        super();
        iD = 0;
        gpa = 0;
    }

    public Student (String name, int age, String gender, int idNum, double y)
    {
        super (name , age , gender);
        iD = idNum;
        gpa = y;
    }
    
    public int getID()
    {
        return iD;
    }
    
    public void setID(int x)
    {
        iD = x;
    }
    
    public double getGPA()
    {
        return gpa;
    }
    
    public void setGPA( double y)
    {
        gpa = y;
    }
    
        public String toString()
    {
        String x = super.toString();
        return x + "ID Number: " + iD + " GPA " + gpa;
    }
    }

