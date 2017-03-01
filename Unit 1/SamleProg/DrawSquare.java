/**
 *  DrawSquare This class will create a piece of paper and a pencil,
 *  place the pencil on the paper and then draw a square 100 units on
 *  each side.
 *
 * @author     G. Peck
 * @created    March 23, 2002
 */
import apcslib.*;
//Let's computer know to look at the apcs file ^^^^
public class DrawSquare
{
  /**
   *  The main program for the DrawSquare class
   *
   * @param  args  The command line arguments (not used)
   */
  public static void main(String[] args)
  {
    DrawingTool pencil; //DrawingTool is a class, because capitalized
    SketchPad paper;	//pencil is an instance of the DrawingTool class, or an object, 
    					//can be namned anything*
    					//SketchPad etc.
    paper = new SketchPad(300, 300);//constructs the Sketchpad object
    //(300, 300 is an arg
    pencil = new DrawingTool(paper); //creates/constructs the drawingtoool object
    //paper is an arg
    // draw the square
    pencil.forward(100);
    //because pencil is an instance, we can dot and use any method from DrawingTool class
    pencil.turnLeft(90);
    pencil.forward(100);
    pencil.turnLeft(90);
    pencil.forward(100);
    pencil.turnLeft(90);
    pencil.forward(100);
	
    pencil.up();
    pencil.turnLeft(180);
    pencil.forward(111);
    pencil.turnLeft(90);
    pencil.forward(15);
    pencil.down();
	pencil.drawString("This is a square, I hope");
  }
}
