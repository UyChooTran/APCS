
/**
 * Write a description of class Register here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Register
{
  public double totalCost;
  
  public Register()
  {
      totalCost= 0.0;
    }
    
    public void add(double x)
    {
        totalCost += x;
    }
    
    public double cost()
    {
        return totalCost;
    }
}
