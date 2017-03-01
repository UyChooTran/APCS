import chn.util.*;
public class CaesarEnc
{
    public FileInput in;
    public char[] text;
    public int key;
    private FileOutput out;
    public CaesarEnc(String str , int k)
    {
        in = new FileInput(str);
        out = new FileOutput("CaesarEnc.txt");
        key = k % 26;
        while(in.hasMoreLines())
        {
            text = in.readLine().toCharArray();
            enc();
        }
        System.out.println("Your encoded message is also stored in CaesarEnc.txt");
        in.close();
        out.close();
    }

    public void enc()
    {
        for (int i = 0; i < text.length; i++)
        {
            text[i] = (char)this.values(text[i]);
            out.print(text[i]);
        }
        out.println();
        print();
    }

    public int values(int x)
    {
        if( x<65 || (x>90 && x<97) || x> 122)
        {
            return x;
        }
        else if (x < 92 && x > 64)
        {
            x+=key;
            x = (x - 65)%26 +65;
        }
        else
        {
            x+= key;
            x = (x-97) % 26 + 97;
        }

        return x;
    }

    public void print()
    {
        for(char c: text)
        {
            System.out.print(c);
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        CaesarEnc rah = new CaesarEnc("Mary.txt",3);
    }
}