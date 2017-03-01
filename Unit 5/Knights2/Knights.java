
/**
 * Write a description of class Kinghts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class Knights
{
    public FileInput in;
    public int[][] access;
    public Knights()
    {
       in = new FileInput("access.txt");
        access = new int[8][8];
        read();
    }

    private void read()
    {
        for(int i = 0;i < 64; i++)
        {
            access[i/8][i%8] = in.readInt();
        }
        for(int[] i : access)
        {
            for (int j : i)
            {
                System.out.println(j);
            }
        }
    }
    
}
