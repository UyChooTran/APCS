
/**
 * Abstract class Workers - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Worker
{
    private String name;
    private  double salary;

    
    
    public abstract double computePay(double hours);
   
    
    public double getSal()
    {
        return salary;
    }
    
    public void setSal(double x)
    {
        salary = x;
    }
    
    public void setName(String str)
    {
        name = str;
    }
    
    public String toString()
    {
        return("Name: " + name + " Salary: " + salary);
    }
}
