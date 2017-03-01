
/**
 * Write a description of class Solver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import chn.util.*;
import java.util.ArrayList;
public class Solver
{

    public static void main(String[] args)
    {
        String str= "";
        ConsoleIO in = new ConsoleIO();
        ArrayList<Lett> letters = new ArrayList<Lett>();
        System.out.println("Enter your 7 letter hand as a word or \"q\" to quit:");
        str = in.readLine();
        while( str.length() != 1)
        {

            str = str.toUpperCase();
            for(char c : str.toCharArray())
            {
                Lett le = new Lett(c);
                if(!letters.contains(le))
                    letters.add(le);
                else
                    letters.get(letters.indexOf(le)).repeats();
            }

            //             Dictionary dic = new Dictionary();
            //             for(String staar: dic.getTwoLetterWords())
            //             {
            //                 System.out.println(staar);
            //             }
            //             
            //             for(String[] stra: dic.getThreeLetterWords())
            //             {
            //                 for (String st: stra)
            //                 {
            //                     System.out.println(st);
            //                 }
            //             }
            Hand current = new Hand(letters);
            current.possiblePlays();
            letters.clear();
            System.out.println("Enter your 7 letter hand as a word or \"q\" to quit:");
            str = in.readLine();
        }
    }
}
