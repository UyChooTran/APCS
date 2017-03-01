
/**
 * Write a description of class FirstQuiz here.
 * 
 * @Uy Tran
 * @version (a version number or a date)
 */

import apcslib.*;
public class FirstQuiz
{
    public static void main(String[] args)
    {
        SketchPad paper = new SketchPad(400,400);
        DrawingTool pen = new DrawingTool(paper);
        // your code
        pen.forward(200);
        pen.move(-200,0);
        pen.move(0,0);
        pen.move(0,200);

    }//end main
}//end of quiz

