
/**
 * Write a description of class Translate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Translate
{
    private String input;
    public Translate()
    {
        input = "";
    }

    public Translate(String x)
    {
        input = x.replaceAll("[^A-Za-z0-9 ]", "");
    }

    public String trans()
    {
        String x = first(input);
        if (!input.equals(x))
        {
            return x;
        }
        else
        {
            if (!vCheck(input))
            {
                return x + "ay";
            }
            else
            {
                return vow(input);
            }
        }

    }

    private static String first (String x)
    {
        switch(x.charAt(0))
        {
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
            x = x + "yay";
            break;
            default:
            break;
        }
        return x;
    }

    private static String vow(String x)
    {
        String test = x;
        x = x.toLowerCase();
        int a = 0;
        a = x.indexOf("a");
        if (a > x.indexOf("e"))
        a = x.indexOf("e");
        else if (a > x.indexOf("i"))
        a = x.indexOf("i");
        else if (a > x.indexOf("o"))
        a = x.indexOf("o");
        else if ( a > x.indexOf("u"))
        a =  x.indexOf("u");
        String start = test.substring(0,a);
        String end = test.substring(a);
        x = end + start + "ay";
        return x;
    }



    private static boolean vCheck (String input)
    {
        input = input.toLowerCase();
        boolean vowel = false;
        while (!vowel)
        {
            switch(input.charAt(0))
            {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                vowel = true;
                break;
                default:
                break;
            }
            input = input.substring(1);
        }
        return vowel;
    }
}
