
/**
 * Write a description of class Hourly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HourlyWorker extends Worker
{
    public HourlyWorker(String str , double sal)
    {
        setName(str);
        setSal(sal);
    }

    public double computePay(double hours)
    {
        if (hours> 40)
            return ((40 * this.getSal()) + (hours-40) * 1.5 * this.getSal());
        return hours * this.getSal();
    }

    public String toString()
    {
        return super.toString();
    }
}