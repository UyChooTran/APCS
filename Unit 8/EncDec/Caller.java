
/**
 * Write a description of class Caller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import chn.util.*;

public class Caller
{
    public static void main(String[] args)
    {
        ConsoleIO in = new ConsoleIO();
        int response = 0;
        System.out.println("Which would you like to use?");
        System.out.println("Enter 1 for Caesar Encryption");
        System.out.println("Enter 2 for Caesar Decryption");
        System.out.println("Enter 3 for MonoAlphabetic Cipher Encrypt");
        System.out.println("Enter 4 for MonoAlphabetic Cipher Decrypt");
        response = in.readInt();
        String file = "";
        String key = "";
        int off = 0;
        switch(response)
        {
            case 1:
            System.out.println("You have chosen Caesar Encryption");
            break;
            case 2:
            System.out.println("You have chosen Caesar Decryption");
            break;
            case 3:
            System.out.println("You have chosen MonoAlphabetic Cipher Encryption");
            break;
            case 4:
            System.out.println("You have chosen MonoAlphabetic Cipher Decryption");
            break;
            default:
            System.out.println("You have chosen Caesar Encryption");
            break;
        }
        System.out.println("Enter the name of the file");
        file = in.readLine();
        if (response ==3 || response == 4)
        {
            System.out.println("Enter your key");
            key = in.readLine();
        }
        else
        {
            System.out.println("Enter the offset");
            off = in.readInt();
        }

        switch(response)
        {
            case 1:
            CaesarEnc run = new CaesarEnc(file,off);
            break;
            case 2:
            CaesarDec rn = new CaesarDec(file,off);
            break;
            case 3:
            MonoEnc ru = new MonoEnc(file,key);
            break;
            case 4:
            MonoDec un = new MonoDec(file,key);
            break;
            default:
            CaesarEnc n = new CaesarEnc(file,off);
            break;
        }

    }

}
