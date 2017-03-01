
/**
 * Write a description of class CollegeStud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollegeStud extends Student
{
    private String major;
    private int year; 
   public CollegeStud()
   {
       super();
       major = "";
       year = 1;
    }
    
    public CollegeStud(String name, int age, String gender, int idNum, double gpa, String maj, int y)
    {
        super (name , age , gender , idNum , gpa);
        major = maj;
        year = y;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setYear(int x)
    {
        year = x;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    public void setMajor(String str)
    {
        major = str;
    }
    
    public String toString()
    {
        String x = super.toString();
        return x + "Major: " + major + "Year: "+ year;
    }
}
