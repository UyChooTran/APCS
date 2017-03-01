public class Frog implements Animal
{
    private String voice;
    private int sound;
    public Frog()
    {
        voice = "";
    }

    public Frog(String str)
    {
        voice = str;
    }

    public void speak()
    {
        System.out.println("" + voice);
    }

    public int loudness()
    {
        int x = 0;
        sound = 0;
        x = voice.indexOf("!");
        while (x != - 1)
        {
            sound++;
            x = voice.indexOf("!", x +1);
        }
        return sound;
    }

    public int compareTo(Object fro)
    {
        if (this.loudness() > ((Animal)fro).loudness())
        return 1;
        if (this.loudness() == ((Animal)fro).loudness())
        return 0;
        return -1;
    }
}