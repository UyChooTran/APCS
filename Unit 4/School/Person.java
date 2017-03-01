
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int age;
    private String gen;

    public Person ()
    {
        name = "";
        age = 0;
        gen = "";
    }

    public Person (String x , int y , String z)
    {
        name = x;
        age = y;
        gen = z;
    }

    public String toString()
    {
        return name + ", age: " + age + " , " + gen;
    }

    public String getName()
    {
        return name;
    }

    public void setName (String str)
    {
        name = str;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int a)
    {
        age = a;
    }
    
    public String getGen()
    {
        return gen;
    }
    
    public void setGen(String str)
    {
        gen = str;
    }
    
}
