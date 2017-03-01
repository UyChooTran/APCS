public class Chick implements Animal
{
    private String myType;
    private String mySound;
    private String mySound2;
    Chick(String type, String sound)
    {
        myType = type;
        mySound = sound;
    }


    Chick(String type, String sound , String sound2)
    {
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }

    public String getSound() 
    {        int x = (int)(Math.random() * 2 + 1);
        if(x == 1)
            return mySound; 
        return mySound2;
    }

    public String getType() 
    {
        return myType; 
    }
    }
