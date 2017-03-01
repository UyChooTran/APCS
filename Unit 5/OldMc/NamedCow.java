
/**
 * Write a description of class NamedCow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NamedCow extends Cow
{
    public String name;
    
    public NamedCow(String type,String x, String sound)
    {
        super(type, sound);
        name = x;
    }
    
    public String getName()
    {
        return name;
    }
}
