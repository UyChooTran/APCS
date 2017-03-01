
/**
 * Write a description of class Quest1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import apcslib.*;
public class AshleyWagner
{
    public static void main(String[] args)
    {
            DrawingTool marker;
            SketchPad poster;

            poster = new SketchPad(600,600);
            marker = new DrawingTool(poster);
            
            marker.forward(200);
            marker.turnRight(90);
            marker.forward(200);
            marker.turnRight(90);
            marker.forward(200);
            marker.turnRight(90);
            marker.forward(200);
            marker.up();
            marker.move(60,150);
            marker.down();
            marker.drawCircle(10);
            marker.up();
            marker.move(140,150);
            marker.down();
            marker.drawCircle(10);
            
            marker.up();
            marker.move(40,60);
            marker.down();
            marker.setDirection(270);
            marker.forward(20);
            marker.turnLeft(90);
            marker.forward(70);
            marker.turnLeft(90);
            marker.forward(20);
            //comment lines below for Ashley Wagner
            /*
            marker.up();
            marker.move(100,100);
            marker.setDirection(210);
            marker.down();
            marker.forward(20);
            */
            
   

    

    }
}
