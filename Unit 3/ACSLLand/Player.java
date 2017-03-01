
/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private int lo;
    private boolean turn;
    public Player()
    {
        lo = 0;
        turn = true;
    }

    public int pos()
    {
        return lo;
    }

    public  void move(int x)
    {
        lo += x;
        if (lo < 0)
            lo = 0;
        else if( lo > 29)
            lo = 30;
    }

    public  void setLo(int x)
    {
        lo = x;
    }

    public  void turn(boolean x)
    {
        turn = x;
    }

    public  boolean lose()
    {
        return turn;
    }

    
}
