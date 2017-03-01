public class Cat implements Animal
{
    private String voice;
    private int sound;
    public Cat()
    {
        voice = "";
    }
    
    public Cat(String str)
    {
        voice = str;
    }
    
    public void speak()
    {
        System.out.println("" + voice);
    }
    
    public int loudness()
    {
        sound = voice.length();
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