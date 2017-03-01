
/**
 * Write a description of class RectMeth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import apcslib.*;
import java.awt.*;
public class RectMeth
{
    private double x , y, width, height, direction;
    private static DrawingTool pen = new DrawingTool(new SketchPad(500,500));
    public RectMeth()
    {
        x = 0; 
        y = 0;
        width = 0;
        height = 0;
        direction = 90;
    }

    public RectMeth(double x1, double y1, double width1, double height1)
    {
        x = x1;
        y = y1;
        width = width1; 
        height = height1;
        direction = 0;
    }

    public RectMeth(RectMeth rect)//, double x , double y)
    {
     x = rect.x;
     y = rect.y;
     width = rect.width;
     height = rect.height;
    }

    public double getX ()
    {
        return x;
    }

    public double getY ()
    {
        return y;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getDirection()
    {
        direction = pen.getDirection();
        return direction;
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
        pen.setDirection(direction);
        pen.forward(width);
        pen.turnRight(90);
        pen.forward(height);
        pen.turnRight(90);
        pen.forward(width);
        pen.turnRight(90);
        pen.forward(height);
    }

    public void draw (double x, double y)
    {
        pen.up();
        pen.move(x,y);
        pen.down();
        pen.setDirection(90);
        pen.forward(width);
        pen.turnRight(90);
        pen.forward(height);
        pen.turnRight(90);
        pen.forward(width);
        pen.turnRight(90);
        pen.forward(height);
    }

    public void drawString(String x)
    {
        pen.drawString(x);
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public void setHeight(double h)
    {
        height = h ;
    }

    public void setX(double x)
    {
        pen.up();
        pen.move(x,y);
        pen.down();
    }

    public void setY(double y)
    {
        pen.up();
        pen.move(x,y);
        pen.down();
    }

    public void move(double x , double y)
    {
        pen.up();
        pen.move(x,y);
        pen.down();
    }

    public void setDirection(double d)
    {
        pen.setDirection(d);
        direction = d;
    }

    public void desperateMeasures (double d)
    {
        pen.turnRight(d);
    }
    
    public void color(Color c)
    {
        pen.setColor(c);
    }
}
