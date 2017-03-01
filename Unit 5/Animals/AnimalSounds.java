/*
 *  Ignore all [unchecked] unchecked call to compareTo ... warnings
 */
 

public class AnimalSounds
{
    public static void main(String[] args)
    {
        Frog f1 = new Frog("Riivveett!?!-Winner");
        Frog f2 = new Frog("!Riverrivet-Loser");
        Animal c;
        if (f1.compareTo(f2) > 0)
            c = f1;
        else
            c = f2;
        c.speak();
        
        Cat c1 = new Cat("Morris's meow (Loser)");
        Cat c2 = new Cat("Garfield's meow (Winner)");
        if (c1.compareTo(c2) > 0)
            c = c1;
        else
            c = c2;
        c.speak();
        
        
        
        Cat c3 = new Cat("fdgdf");
        Cat c4 = new Cat("sadsadsadsd");
        Frog c5 = new Frog("!!!!!!!!!!!!!!!!!!!!!!");
        
        findLoudest(c3, c4 , c5).speak();
        
        /*
            1. Create 2 Cat objects.
            2. Create one Frog object
            3. Call the findLoudest method and use the results to
            4. output the sound of the loudest animal of the three above
        */
    }
    
    /**
        This method compares three animals and returns the animal
        that makes the most noise (greatest sound in decibles).
        @param a the first animal to compare.
        @param b the second animal to compare.
        @param c the third animal to compare
        @return returns the loudest animal (the one with the greatest sound).
        @poscondition The loudest animal is found and returned.
    */
    public static Animal findLoudest(Animal a, Animal b, Animal c)
    {
        if (a.loudness() > b.loudness() && a.loudness() > c.loudness())
        {
            return a;
        }
        
        if (b.loudness() > a.loudness() && b.loudness() > c.loudness())
        {
            return b;
        }
        
        if (c.loudness() > b.loudness() && c.loudness() > a.loudness())
        {
            return c;
        }
           return c;
        // Statement here only to stub out method - remove before implementing
    }
}