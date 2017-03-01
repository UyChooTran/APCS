import chn.util.*;
public class CaesarDec
{
    public FileInput in;
    public char[] text;
    public int key;
    private FileOutput out;
    public CaesarDec(String str , int k)
    {
        in = new FileInput(str);
        out = new FileOutput("CaesarDec.txt");
        key = k % 26;
        while(in.hasMoreLines())
        {
            text = in.readLine().toCharArray();
            dec();
        }

        System.out.println("Your decoded message is also stored in CaesarDec.txt");
        in.close();
        out.close();
    }

    public void dec()
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
            x-=key;
            x = (x - 65)%26 +65;
        }
        else
        {
            x-= key;
            x = (x-97) % 26 + 97;
        }

        if (x<41)
            x+=26;
        if (x>90 && x< 97)
            x+=26;

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
        CaesarDec rah = new CaesarDec("Mry.txt",3);
    }
}