
/**
 * Write a description of class Squeeze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import chn.util.*;
public class Squeeze
{
    public static void main (String [] args)
    {
        FileInput fi = new FileInput("test.txt");
        FileOutput fo = new FileOutput("out.py");
        String in = "";
        int pos = 0;
        
        while(fi.hasMoreLines())
        {
           in = fi.readLine();
           while ( !in.equals("") && in.charAt(pos) == ' ')
           {
               pos++;
            }
           fo.println(pos + " " + in.substring(pos,in.length()));
           pos = 0;
    }
    fi.close();
    fo.close();
}
}