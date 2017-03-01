
/**
 * Write a description of class CountWords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import chn.util.*;
public class CountWords
{
    public FileInput in;
    public ArrayList<Word> list;
    public String doc;
    public int wordLen;
    public StringTokenizer st;
    public int[] maxes;
    public CountWords(String str)
    {
        in = new FileInput(str);
        doc = "";
        wordLen = 1;
        list = new ArrayList<Word>();
        while(in.hasMoreLines())
        {
            doc +=in.readLine();
        }
        replace();
        count();
        st = new StringTokenizer(doc);
        toAray();
        maxes = new int[30];
        findMax();
        findAllMaxes(0);
        print(1);
    }

    public void replace()
    {
        doc = doc.toLowerCase();
        doc = doc.replaceAll("-","");
        doc = doc.replaceAll("[^A-Za-z0-9 ]", " ");
        doc = doc.replaceAll("\\s+" , " ");
        //         doc = doc.replaceAll("  " , " ");
        //         doc = doc.replaceAll("  " , " ");
    }

    public void count()
    {
        for (char c: doc.toCharArray())
        {
            if (c == ' ')
                wordLen++;
        }
        System.out.println(wordLen);
    }

    public void toAray()
    {
        String temp = "";

        while (!temp.equals(" "))
        {
            temp = toToken();
            Word a = toWord(temp);
            if (!list.contains(a))
            {
                list.add(new Word(temp));
            }
            else
            {
                list.get(list.indexOf(a)).inc();
            }
        }
    }

    public Word toWord(String str)
    {
        Word x = new Word(str);
        return x;
    }

    public String toToken()
    {
        if (st.hasMoreTokens())
        {
            return st.nextToken();
        }
        return " ";
    }

    public void print()
    {
        System.out.println(list);
    }

    public void print(int x)
    {

        for(int y: maxes)
        {
            System.out.println(y);
        }
        
    }

    public void sort()
    {
        int pos = 0;
        int loc = 0;
        int reoccur = maxes[loc];

        while(loc <30)
        {
            reoccur = maxes[loc];
            pos = find(reoccur);
            System.out.println(pos);
            list.add(loc,list.get(pos));
            loc++;
            list.remove(pos+1);
        }
    }

    public int find(int x)
    {
        int y = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getRep() == x)
                return i;
        }
        return -1;
    }

    public void findMax()
    {
        int max = list.get(0).getRep();
        for(Word wrd: list)
        {
            if (wrd.getRep() > max)
                max = wrd.getRep();
        }
        maxes[0] = max;
    }

    public void findAllMaxes(int x)
    {
        if (x >= 28)
            return;
        int max = maxes[x];
        int min = 1;
        for(Word wrd: list)
        {
            if (wrd.getRep() <= max && wrd.getRep() > min && list.indexOf(wrd) > find(max))
                min = wrd.getRep();
        }
        maxes[x+1] = min;
        System.out.println(maxes[x]);
        findAllMaxes(x+1);
    }

    public static void main (String[] args)
    {
        CountWords test= new CountWords("Dream.txt");
        test.print();
        test.sort();
        test.print();
    }
}
