
/**
 * Write a description of class Teacer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    private String subject;
    private double salary;
    public Teacher()
    {   
        super();
        subject = "";
        salary = 0;
    }

    public Teacher(String name, int age, String gender, String str , double sal)
    {
        super(name, age , gender);
        subject = str;
        salary = sal;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public void setSubject(String s)
    {
        subject = s;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double x)
    {
        salary = x;
    }
    
    public String toString()
    {
        String x = super.toString();
        return x + " Subject is " + subject +" Salary is "+ salary;
    }
}
