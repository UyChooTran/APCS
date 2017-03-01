
/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class Life
{
    private FileInput places;
    public int[][] board;

    public Life()
    {
        places = new FileInput("life100.txt");
        board = new int [22][22];
        initial();
    }

    public void initial()
    {
        int locr=0;
        int locc=0;
        int amount = places.readInt();
        while (places.hasMoreTokens())
        {
            locr = places.readInt();
            locc = places.readInt();
            board[locr][locc] = 1;
        }
        places.close();
    }

    public void print(int [][] x)
    {
        int col = 1;
        System.out.print("  ");
        while (col != 21)
        {
            System.out.print(" " + col%10);
            col++;
        }
        int line = 1;
        for (int i = 1; i !=21; i++)
        {
            System.out.println(" ");
            if(line < 10)
                System.out.print(" ");
            System.out.print(line + " ");
            for( int j =1; j !=21; j++)
            {
                System.out.print( board[i][j] + " ");
            }
            line++;
        }
        System.out.println("\n");
    }

    public void print(int x, char c)
    {
        int other = 1;
        int life = 0;
        String printed = "";
        if (c == 'c')
        {
            printed = "Life in Column " + x + " ";
            while(other < 21 )
            {
                life += board[x][other];
                other++;
            }
        }
        else
        {
             printed = "Life in Row " + x + " ";
            while(other < 21 )
            {
                life += board[other][x];
                other++;
            }
        }
        System.out.println(printed + life + "\n");
    }

    public void printAll()
    {
        int printed = 0;
        for( int[] i : board)
        {
            for (int j : i)
            {
                printed += j;
            }
        }
        System.out.println("All life = " + printed);
    }

    public void live(int runs)
    {

        for (int j = 0; j < 5; j++)
        {
            int living[][] = new int[22][22];
            int lor = 1;
            int loc = 1;
            int neigh = 0;

            while (loc < 21)
            {
                while(lor < 21)
                {
                    neigh += board[lor+1][loc] + board[lor+1][loc+1] + board[lor][loc+1];
                    neigh += board[lor-1][loc] + board[lor-1][loc-1] + board[lor][loc-1];
                    neigh += board[lor-1][loc+1] + board[lor+1][loc-1];
                    living[lor][loc] = neigh;
                    neigh = 0;
                    lor++;
                }
                neigh = 0;
                lor = 1;
                loc++;
            }
            gen(living);
        }

    }

    public void gen(int x [][])
    {
        int loc = 1;
        int lor = 1;
        while( lor < 21)
        {
            while(loc <21)
            {
                int i = x[lor][loc];
                switch (i)
                {
                    case 3:
                    board[lor][loc] = 1;
                    break;
                    case 2:
                    if(board[lor][loc] == 1)
                        break;
                    default:
                    board[lor][loc] = 0;
                    break;
                }
                loc++;
            }
            loc = 1;
            lor++;
        }
        
    }
}