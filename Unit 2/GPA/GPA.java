
/**
 * Write a description of class GPA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GPA
{
    private double gPA;
    private String iD, name = "";
    private int points , grades;

    public GPA()
    {
        name = "John Smith";
        iD = "101010";
        gPA = 0;
    }

    public GPA (String myName , String myID)
    {
        name = myName;
        iD = myID;
    }

    public double getGPA()
    {
        return gPA;
    }
    
    public void addGrade(int grade)
    {
        grades +=1;
        points = points + grade;
        gPA = (double)points / (double)grades;

    }
}
