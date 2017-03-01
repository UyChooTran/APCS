
/**
 * Write a description of class Quest1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import apcslib.*;
public class Quest4
{
    public static void main(String[] args)
    {
        DrawingTool marker;
        SketchPad poster;

        poster = new SketchPad(600,600);
        marker = new DrawingTool(poster);
        marker.up();
        marker.turnRight(90);
        marker.forward(100);
        marker.down();
        marker.drawString("  A");
        marker.move(-100,0);
        marker.up();
        marker.move(-175,100);
        marker.down();
        marker.move(175,100);
        marker.drawString("  B");
        marker.move(100,0);
        marker.move(-100,0);
        marker.move(-175,100);
        


   
    
    }
}
