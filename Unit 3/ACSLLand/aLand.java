
/**
 * Write a description of class aLand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
import java.util.*;
public class aLand
{
    private static int Dice()
    {
        double r = (Math.random() * 8.0 + 1.0);
        int roll = (int)r;
        return roll;
    }

    public static void main (String [] args )
    {
//         Scanner inpt = new Scanner(System.in);
        while (1 + 1 ==2)   
        {
            Player a = new Player();
            Player b = new Player();
            Player c = new Player();
            int input;
            input = 0;
            ConsoleIO in = new ConsoleIO();
            do
            {

                if (a.lose())
                {
                    System.out.println(" ");
                    input = in.readInt();
                    switch (input)
                    {
                        case 4: a.move(-4);
                        break;
                        case 6: a.turn(false);
                        break;
                        default: a.move(input);
                        break;
                    }
                }
                else
                {
                    a.turn(true);
                }

                if (input == 0 || a.pos() == 30)
                    break;

                if (a.pos() == c.pos())
                {
                    c.setLo(0);
                }

                if (a.pos() == b.pos())
                {
                    b.setLo(0);
                }

                if(b.lose())
                {
                    System.out.println(" ");
                    input = in.readInt();
                    switch (input)
                    {
                        case 4: b.move(-4);
                        break;
                        case 6: b.turn(false);
                        break;
                        default: b.move(input);
                        break;
                    }
                }
                else 
                {
                    b.turn(true);
                }

                if (input == 0 || b.pos() == 30)
                    break;

                if (b.pos() == c.pos())
                {
                    c.setLo(0);
                }

                if (b.pos() == a.pos())
                {
                    a.setLo(0);
                }

                //System.out.println(" " + a.pos());

                if(c.lose())
                {
                    System.out.println(" ");
                    input = in.readInt();
                    switch (input)
                    {
                        case 4: c.move(-4);
                        break;
                        case 6: c.turn(false);
                        break;
                        default: c.move(input);
                        break;
                    }
                }
                else
                {
                    c.turn(true);
                }

                if (input == 0 || c.pos() == 30)
                    break;

                if (c.pos() == b.pos())
                {
                    b.setLo(0);
                }

                if (c.pos() == a.pos())
                {
                    a.setLo(0);
                }
            }while(input!=0 && a.pos() != 30 && b.pos() != 30 && c.pos() != 30);

            while (input != 0)
            {
                System.out.println("");
                input = in.readInt();
            }
            
            if (a.pos() == 0)
            {
                System.out.print("A-Start");
            }
            else if ( a.pos() == 30)
            {
                System.out.print("A-End");
            }
            else
            {
                System.out.print("A-"+a.pos());
            }

            if (b.pos() == 0)
            {
                System.out.print(" B-Start");
            }
            else if ( b.pos() == 30)
            {
                System.out.print(" B-End");
            }
            else
            {
                System.out.print(" B-"+b.pos());
            }

            if (c.pos() == 0)
            {
                System.out.print(" C-Start");
            }
            else if ( c.pos() == 30)
            {
                System.out.print(" C-End");
            }
            else
            {
                System.out.print(" C-"+c.pos());
            }
        }
    }
}
