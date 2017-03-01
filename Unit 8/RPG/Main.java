import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
	public Main()
	{
		setSize(800, 600);
		setResizable(true);
		setTitle("Rock - Paper - Scissors"); 
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new GamePanel();
		getContentPane().add(panel);
	}

	public static void main(String[] args)
	{
		Main mFrame = new Main();
		mFrame.setVisible(true);
	}
}