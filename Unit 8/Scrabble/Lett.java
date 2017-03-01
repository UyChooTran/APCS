
/**
 * Write a description of class Lett here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lett implements Comparable 
{
    private char let;
    private boolean used;
    private int val;
    private int rep;
    private int ori;
    
    public Lett(char c)
    {
        let = c;
        used = false;
        setVal();
        rep = 0;
        ori = rep;
    }
    
    public void setTrue()
    {
        if(rep==0)
        used = true;
        else
        rep--;
    }
    
    public void setFalse()
    {
        used = false;
        rep = ori;
    }
    public void reset()
    {
        used = false;
       rep = ori -1;
    }
    public void repeats()
    {
        rep++;
        ori = rep;
    }
    
    public boolean used()
    {
        return used;
    }
    
    public char character()
    {
        return let;
    }
    
    public boolean equals(Object obj)
    {
        return let == ((Lett)obj).character() && !used;
    }
    
    public boolean equals(char c)
    {
        return let == c &&!used;
    }
    
    public int compareTo(Object obj)
    {
        return this.compareTo(obj);
    }
    
    public int compareTo(char c)
    {
        return let - c;
    }
    
    public void setVal()
    {
        val = (int)let - (int)'A';
    }
    
    public int getVal()
    {
        return val;
    }
}
