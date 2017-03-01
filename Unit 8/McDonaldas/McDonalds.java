import javax.swing.JFrame;
 import javax.swing.JButton;
 import java.awt.Container;
 import java.awt.GridLayout;
public class McDonalds extends JFrame {
    public McDonalds() 
    {
        super("Hello, Welcome to Obesity");
        setSize(500, 500);
        JButton Ham = new FoodItem("Hamburger" , "1.99"); 
        JButton Frize = new FoodItem("Fries" , ".50");
        JButton Chikz = new FoodItem("McNuggets" , "2.99");
        JButton Coc = new FoodItem("Coke" , ".89");
        JButton tot = new OrderButton("Total", 0.0);
        Container c = getContentPane(); 
        c.setLayout(new GridLayout(5,1)); c.add(Ham); c.add(Frize);c.add(Chikz);c.add(Coc);c.add(tot);
        Ham.addMouseListener(new Mouser());
        Frize.addMouseListener(new Mouser());
        Chikz.addMouseListener(new Mouser());
        Coc.addMouseListener(new Mouser());
        tot.addMouseListener(new Mouser());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}