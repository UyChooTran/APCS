/**
 * Write a description of class DrawHouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import apcslib.*;
import java.awt.*;
public class DrawHouse
{
public static void main(String[] args)
   {
       DrawingTool pen;
       SketchPad paper;
    
       paper = new SketchPad (500,500);
       pen = new DrawingTool(paper);
       
       pen.up(); //move pen to the lower corner to start
       pen.move(-210,-220);
       pen.setDirection(360);
       //pen adjustments
       
       pen.setWidth(5);
       pen.setColor(Color.red);
       
       //start drawing here
       //around door
       pen.down();
       pen.move(120);
       pen.turnLeft(90);
       pen.move(200);
       pen.turnLeft(90);
       pen.move(120);
       pen.turnLeft(90);
       pen.move(200);
       //door
       pen.turnLeft(90);
       pen.forward(30);
       pen.turnLeft(90);
       pen.forward(120);
       pen.turnRight(90);
       pen.forward(60);
       pen.turnRight(90);
       pen.forward(118);
       pen.turnRight(90);
       pen.forward(60);
       //door knob
       pen.turnRight(90);
       pen.forward(60);
       pen.up();
       pen.turnRight(90);
       pen.forward(10);
       pen.setWidth(2);
       pen.down();
       pen.drawCircle(3);
       //door window
       pen.up();
       pen.move(-180,-80);
       pen.down();
       pen.setDirection(90);
       pen.forward(40);
       pen.turnRight(90);
       pen.forward(60);
       pen.turnRight(90);
       pen.forward(40);
       pen.turnRight(90);
       pen.forward(60);
       pen.backward(30);
       pen.turnRight(90);
       pen.forward(40);
       pen.backward(20);
       pen.turnRight(90);
       pen.forward(30);
       pen.backward(60);
       pen.up();
       //around garage time
       pen.move(-90,-225);
       pen.down();
       pen.setWidth(5);
       pen.setDirection(360);
       pen.forward(300);
       pen.turnLeft(90);
       pen.forward(250);
       pen.turnLeft(90);
       pen.forward(300);
       pen.turnLeft(90);
       pen.forward(250);
       //actual garage door time
       pen.turnLeft(90);
       pen.forward(30);
       pen.turnLeft(90);
       pen.forward(2);
       pen.turnRight(90);
       pen.forward(240);
       pen.turnLeft(90);
       pen.forward(150);
       pen.turnLeft(90);
       pen.forward(240);
       pen.turnLeft(90);
       pen.forward(148);
       pen.up();
       
       //roof
       pen.move(-210,-20);
       pen.down();
       pen.setDirection(35);
       pen.backward(42);
       pen.forward(300);
       pen.move(210,30);
       pen.forward(40);
       //roof window
       pen.home();
       pen.up();
       pen.setDirection(90);
       pen.forward(65);
       pen.down();
       pen.setWidth(2);
       pen.drawCircle(35);
       pen.backward(35);
       pen.forward(70);
       pen.backward(35);
       pen.turnLeft(90);
       pen.forward(35);
       pen.backward(70);
       
       //house finished
       pen.home();
       pen.up();
       pen.move(-50,-20);
       pen.drawString("Uy Tran-Per. 1 AP ComSci 2015-2016");
       pen.up();
       pen.move(-30,-40);
       pen.down();
       pen.setWidth(3);
       pen.drawString("Hello, World!");
       //extra fun
       pen.setWidth(2);
       pen.up();
       pen.move(-30, -100);
       pen.down();
       pen.setColor(Color.yellow);
       pen.setDirection(90);
       pen.backward(100);
       pen.forward(100);
       pen.turnLeft(225);
       pen.forward(50);
       pen.turnLeft(90);
       pen.forward(50);
       pen.setDirection(270);
       pen.forward(100);
       pen.up();
       pen.turnLeft(90);
       pen.forward(30);
       pen.down();
       pen.forward(50);
       pen.backward(50);
       pen.turnLeft(90);
       pen.forward(100);
       pen.turnRight(90);
       pen.forward(50);
       
       pen.up();
       pen.setWidth(1);
       pen.move(-31, -100);
       pen.down();
       pen.setColor(Color.red);
       pen.setDirection(90);
       pen.backward(100);
       pen.forward(100);
       pen.turnLeft(225);
       pen.forward(50);
       pen.turnLeft(90);
       pen.forward(50);
       pen.setDirection(270);
       pen.forward(100);
       pen.up();
       pen.turnLeft(90);
       pen.forward(30);
       pen.down();
       pen.forward(50);
       pen.backward(50);
       pen.turnLeft(90);
       pen.forward(100);
       pen.turnRight(90);
       pen.forward(50);
       
       pen.up();
       pen.move(-29, -100);
       pen.down();
       pen.setColor(Color.red);
       pen.setDirection(90);
       pen.backward(100);
       pen.forward(100);
       pen.turnLeft(225);
       pen.forward(50);
       pen.turnLeft(90);
       pen.forward(50);
       pen.setDirection(270);
       pen.forward(100);
       pen.up();
       pen.turnLeft(90);
       pen.forward(30);
       pen.down();
       pen.forward(50);
       pen.backward(50);
       pen.turnLeft(90);
       pen.forward(100);
       pen.turnRight(90);
       pen.forward(50);
       
    }
}
