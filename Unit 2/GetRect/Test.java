
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main (String [] args)
    {
        Rect a = new Rect(-150,-150,200,300);
        System.out.println("Perimeter of a = " + a.getPerimeter()); 
        System.out.println("Area of a = " + a.getArea());
        a.draw();
        
        Rect b = new Rect(-50, -150 , 200 , 300);
        System.out.println("Perimeter of b = " + b.getPerimeter()); 
        System.out.println("Area of b = " + b.getArea());
        b.draw();
        
        Rect c = new Rect (-150, -50 , 300 , 100);
        System.out.println("Perimeter of c = " + c.getPerimeter()); 
        System.out.println("Area of c = " + c.getArea());
        c.draw();
    }
}
