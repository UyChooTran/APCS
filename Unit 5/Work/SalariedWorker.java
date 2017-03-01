
/**
 * Write a description of class Salaried here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalariedWorker extends Worker
{
    public SalariedWorker(String str , double sal)
    {
        setName(str);
        setSal(sal);
    }

    public double computePay(double hours)
    {
        return 40*this.getSal();
    }

    public String toString()
    {
        return super.toString();
    }
}
