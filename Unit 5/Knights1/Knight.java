
/**
 * Write a description of class KnightsTour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Knight
{
    public int r;
    public int c;
    public int[][] board;
    public boolean[][] moved;
    public int num;
    public Random ok;
    public Knight()
    {
        r = 0;
        c = 0;
        num = 1;
        board = new int[8][8];
        moved = new boolean[8][8];
        ok = new Random();
    }

    public void set()
    {
        board[r][c] = num;
        moved[r][c] = false;
        num++;
    }

    public boolean visited(int j , int k)
    {
        return(moved[j][k]);
    }

    public int random(int x)
    {
        int ran = ok.nextInt(x);
        return ran;
    }

    public void move(int x)
    {
        int j = r;
        int k = c;
        int call = 0;
        int chosen = 0;
        chosen = defaultRan(call)
    }

    public int defaultRan(int x)
    {
        return 8 - x;
    }

    public int which(int chosen , int j , int k)
    {
        switch(chosen)
        {
            case:1
            j+= 1;
            k+= 2;
            break;
            case:2
            j+= 2;
            k+= 1;
            break;
            case:3
            j+= -1;
            k+= 2;
            break;
            case:4
            j+= -1;
            k+= -2;
            break;
            case:5
            j+= 1;
            k+= -2;
            break;
            case:6
            j+= -2;
            k+= 1;
            break;
            case:7
            j+= 2;
            k+= -1;
            break;
            default:
            j+= -2;
            k+= -1;
            break;
        }
    }
}
