
/**
 * Write a description of class Rect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import apcslib.*;
public class Rect
{
    private double x , y, width, height;
    private static DrawingTool pen = new DrawingTool(new SketchPad(500,500));
    public Rect()
    {
        x = 0; 
        y = 0;
        width = 0;
        height = 0;
    }

    public Rect(double x1, double y1, double width1, double height1)
    {
        x = x1;
        y = y1;
        width = width1; 
        height = height1;
    }

    public double getPerimeter()
    {
        return( 2*width + 2*height);
    }

    public double getArea()
    {
        return(width * height);
    }

    public void draw()
    {
        pen.up();
        pen.move(x,y);
        pen.down();
        pen.move(x+width,y);
        pen.move(x+width,y+height);
        pen.move(x,y+height);
        pen.move(x,y);
    }
}
