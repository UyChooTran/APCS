
/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Hand
{
    private ArrayList<Lett> hand;
    private ArrayList<String> words;
    private String two[];
    private String three[][];
    private Dictionary dict;
    private char twoVals [];
    public Hand(ArrayList arr)
    {
        hand = arr;
        dict = new Dictionary();
        two = dict.getTwoLetterWords();
        twoVals = new char[two.length];
        for(int i = 0; i < twoVals.length; i++)
        {
            twoVals[i] = two[i].charAt(0);
        }
        three = dict.getThreeLetterWords();
        words = new ArrayList<String>();
        //         this.possiblePlays();
    }

    public void findTwos()
    {
        int counter = 0;
        Lett help;
        for (Lett lol: hand)
        { 
            //             System.out.println("char of hand: " + lol.character()); 
            counter = 0;
            for (char c: twoVals)
            {
                //                 System.out.println("char in dictionary: " + c); 
                if (lol.character() == c && !lol.used())
                {

                    lol.setTrue();
                    //                     System.out.println("two counter second char check: " + two[counter].charAt(1));
                    help = new Lett(two[counter].charAt(1));
                    if (hand.contains(help))
                    {
                        //                         System.out.println("two counter second char check run: " + two[counter].charAt(1));
                        words.add((String)two[counter]);
                    }
                }
                lol.setFalse();
                counter++;
            }
        }
    }

    public void findThrees()
    { 
        String[] threeWrds;
        Lett help;
        Lett help1;
        for(Lett lol: hand)
        {
            threeWrds = three[lol.getVal()];
            lol.setTrue();
            for( String str : threeWrds)
            {

                help = new Lett(str.charAt(1));
                if (hand.contains(help) && !hand.get(hand.indexOf(help)).used())
                {
                    hand.get(hand.indexOf(help)).setTrue();
                    
                    help1 = new Lett(str.charAt(2));
                    
                    if(hand.contains(help1) && !hand.get(hand.indexOf(help1)).used())
                    {
                        words.add((String)str);
                        hand.get(hand.indexOf(help1)).setFalse();
                    }
                    hand.get(hand.indexOf(help)).setFalse();
                }

            }

            lol.setFalse();
        }
    }

    public void possiblePlays()
    {
        findTwos();
        findThrees();
        System.out.println(words);
    }
}
