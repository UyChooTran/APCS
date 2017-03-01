
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main (String [] args)
    {
        double degrees = 0;
        int z = 8;
        RectMeth rectA = new RectMeth(0,0,50,200);
        RectMeth rectB = new RectMeth(rectA);

        rectB.draw(-240 , 190);
        rectB.move(-240, 200);
        rectB.drawString("The perimeter is " + rectB.getPerimeter() + " pixels");
        rectB.move(-240 , 180);
        rectB.drawString("The area is " + rectB.getArea() + " pixels");
        rectB.move(-50, 200);
        rectB.drawString("The width is " + rectB.getWidth() + " pixels");
        rectB.move(-50 , 180);
        rectB.drawString("the length is " + rectB.getHeight()+ " pixels");
        do
        {
            rectA.draw();
            degrees += .1;
            rectA.setWidth(rectA.getWidth() + 1);
            rectA.setHeight(rectA.getHeight() + 5);
            //rectA.desperateMeasures(-20);
            //rectA.setDirection(Math.abs(rectA.getDirection()) );
           rectA.setDirection(degrees);
           
            System.out.println(degrees);
            System.out.println(rectA.getDirection());
            
        }
        while (degrees < 360);
    }
}
