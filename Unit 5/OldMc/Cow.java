
/**
 * Write a description of class Cow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cow implements Animal
{
    private String myType;
    private String mySound;

    Cow(String type, String sound)
    {
        myType = type;
        mySound = sound;
    }

    public String getSound() 
    {
        return mySound; 
    }

    public String getType() 
    {
        return myType; 
    }
}