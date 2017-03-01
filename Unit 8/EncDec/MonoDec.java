
import java.util.*;
import chn.util.*;
public class MonoDec
{
    private ArrayList<String> let;
    private String key;
    private String lowerKey;
    private FileInput in;
    private char[] fil;
    private int len;
    private ArrayList<String> alpha;
    private FileOutput out;
    public MonoDec(String file, String ke)
    {
        let = new ArrayList<String>();
        in = new FileInput(file);
        out = new FileOutput("MonoDec.txt");
        key = ke.toUpperCase();
        lowerKey = key.toLowerCase();
        alpha = new ArrayList<String>();
        setArras(let);
        setArras(alpha, 1);
        setKey();
        while(in.hasMoreLines())
        {
            fil = in.readLine().toCharArray();
            for (char c : fil)
            {
                if(alpha.indexOf(c+"")!= -1)
                {
                    System.out.print(alpha.get(let.indexOf(c+"")));
                    out.print(let.get(alpha.indexOf(c+"")));
                }
                else
                {
                    System.out.print(""+c);
                    out.print(c);
                }
            }
            System.out.println();
            out.println();
        }
        System.out.println("Your decoded message is also stored in MonoDec.txt");
        in.close();
        out.close();
    }

    private void setArras(ArrayList arr)
    {
        for(int i = 90; i >64; i--)
        {
            arr.add(""+(char)i);
        }

        for(int i = 122; i > 96; i--)
        {
            arr.add(""+(char)i);
        }

        //         System.out.println(arr);
    }

    private void setArras(ArrayList arr, int x)
    {
        for(int i = 65; i< 91; i++)
        {
            arr.add(""+(char)i);
        }

        for(int i = 97; i < 123; i++)
        {
            arr.add(""+(char)i);
        }
        //         System.out.println(arr);
    }

    private void setKey()
    {
        int temp = 0;

        for(char c : key.toCharArray())
        {
            let.remove(c+"");
            let.add(temp, c+"");
            temp++;
        }

        temp = 26;

        for(char c : lowerKey.toCharArray())
        {
            let.remove(c+"");
            let.add(temp, c+"");
            temp++;
        }
    }

    public static void main(String[] args)
    {
        MonoDec il = new MonoDec("May.txt","apcs");
    }
}
