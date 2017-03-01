import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements ActionListener

{
    private ImageIcon[] images;
    private Timer timer;
    private JLabel playerFigureLabel;
    private JLabel computerFigureLabel;
    private int computer;
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JPanel bottomRight;
    private JLabel theWinner;
    private JLabel prompt;
    private int win;
    private int lose;
    private int ties;

    /**
     *  Builds the framework to hold all the panels and subpanels
     */
    public GamePanel()
    {
        // Create the images array.  It should have three cells in the array
        // where the first cell holds the string "rock.jpg", the second
        // holds the string "paper.jpg" and the last holds the string
        // "scissors.jpg".
        /**********************************************************************
         *  WRITE YOUR CODE HERE
         *********************************************************************/
        images= new ImageIcon[] {new ImageIcon("rock.jpg") , new ImageIcon("paper.jpg") , new ImageIcon("scissors.jpg")};

        timer = new Timer(1, this);
        timer.start();
        win = 0;
        lose = 0;
        ties = 0;
        computer = -1;

        // Main panel is 2 rows
        setLayout(new GridLayout(2,1));

        // Top panel has 2 columns
        JPanel top= new JPanel();
        top.setLayout(new GridLayout(1,2));
        JPanel toph1 = new JPanel();
        toph1.setBackground(Color.white);
        JPanel toph2 = new JPanel();
        toph2.setBackground(Color.white);
        playerFigureLabel = new JLabel();
        playerFigureLabel.setIcon(randomImage());
        toph1.add(playerFigureLabel);
        top.add(toph1);
        computerFigureLabel = new JLabel();
        computerFigureLabel.setIcon(randomImage());
        toph2.add(computerFigureLabel);
        top.add(toph2);

        add(top);

        // Bottom panel has 2 columns
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,2));

        // Bottom left panel 4 rows and 1 column
        JPanel bottomLeft = new JPanel();
        bottomLeft.setLayout(new GridLayout(4,1));
        JPanel holder1 = new JPanel();
        holder1.setBackground(Color.yellow);
        rockButton = new JButton("Rock");
        rockButton.addActionListener(this);
        holder1.add(rockButton);
        bottomLeft.add(holder1);
        JPanel holder2 = new JPanel();
        holder2.setBackground(Color.yellow);
        paperButton = new JButton("Paper");
        paperButton.addActionListener(this);
        holder2.add(paperButton);
        bottomLeft.add(holder2);
        scissorsButton = new JButton("Scissors");
        scissorsButton.addActionListener(this);
        JPanel holder3 = new JPanel();
        holder3.setBackground(Color.yellow);
        holder3.add(scissorsButton);
        bottomLeft.add(holder3);
        JPanel holder4 = new JPanel();
        holder4.setBackground(Color.yellow);
        prompt = new JLabel("Click on a Button");
        holder4.add(prompt);
        bottomLeft.add(holder4);
        bottom.add(bottomLeft);

        // Bottom right panel - 3 rows - 1 column
        bottomRight = new JPanel();
        bottomRight.setLayout(new GridLayout(3,1));
        bottomRight.setBackground(Color.yellow);

        // Place labels/buttons in bottom right panel
        JPanel dummy1 = new JPanel();
        dummy1.setBackground(Color.yellow);
        theWinner = new JLabel();
        dummy1.add(theWinner);
        bottomRight.add(dummy1);
        JButton playAgain = new JButton("Play again");
        playAgain.addActionListener(this);
        JPanel dummy2 = new JPanel();
        dummy2.setBackground(Color.yellow);
        dummy2.add(playAgain);
        bottomRight.add(dummy2);
        JButton quit = new JButton("Quit");
        quit.addActionListener(this);
        JPanel dummy3 = new JPanel();
        dummy3.setBackground(Color.yellow);
        dummy3.add(quit);
        bottomRight.add(dummy3);        
        bottomRight.setVisible(false);

        bottom.add(bottomRight);

        add(bottom);
    }

    /**
     *  Returns a random image of a hand displaying either a
     *  fist for a rock, open hand for paper, or split fingers
     *  for scissors
     *  @return returns a rock-paper-scissors hand image
     */
    public ImageIcon randomImage()
    {
        // Set the instance variable 'computer' to a random integer
        // value from 0 to 1 less than the length on the array.
        // Return the image found at the random location within the array.
        /**********************************************************************
         *  WRITE YOUR CODE HERE
         *********************************************************************/

        computer = (int)(Math.random()*3);
        return images[computer];
    }

    /**
     *  Determines which action has taken place and performs
     *  the appropriate function.
     *  @param e the action event that has just taken place
     *  @postcondition: If the action is the timer firing then just
     *      display a random image in the computer panel.
     *      If the user selected the Rock-Paper-Scissor button then determine
     *      the winner by calling the showWinner method.
     *      If the user selected the Quit or Play again button then either
     *      quit the game or start it up again.
     */
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();
        if (cmd == null)
        {
            computerFigureLabel.setIcon(randomImage());
            repaint();
        }
        else if (cmd.equals("Rock"))
            showWinner(0);
        else if (cmd.equals("Paper"))
            showWinner(1);
        else if (cmd.equals("Scissors"))
            showWinner(2);
        else if (cmd.equals("Play again"))
            resetGame();
        else if (cmd.equals("Quit"))
            quitGame();
    }

    /**
     *  Displays the winner in the bottom right panel.  Disables the 
     *  Rock-Paper-Scissors buttons,  stops the time,
     *  and displays buttons to either Quit or Play Again.
     *  @param player the player's Rock-Paper-Scissors value
     *          0-Rock, 1-Paper, 2-Scissors
     */
    public void showWinner(int player)
    {
        // Stop the timer and disable the buttons - game is completed
        // Hide the Click here text
        timer.stop();
        playerFigureLabel.setIcon(images[player]);
        rockButton.setEnabled(false);
        paperButton.setEnabled(false);
        scissorsButton.setEnabled(false);
        prompt.setText("");     

        String winner;
        // Set the string variable 'winner' to: Tie, You win!, or You lose...
        /**********************************************************************
         *  WRITE YOUR CODE HERE
         *********************************************************************/

        int y = computer - player;
        switch(y)
        {
            case 0:
            winner = "Tie";
            break;
            case 1: 
            winner = "You lose...";
            lose++;
            break;
            default:
            winner = "You win!";
            win++;
            break;
        }
        theWinner.setText(winner + " Ties/Wins/Losses " +ties + "/" + win + "/" + lose);
        bottomRight.setVisible(true);

        repaint();
    }

    /**
     *  Enables the Rock-Paper-Scissors buttons, displays click on text and hides
     *  the Quit & Play Again buttons from the bottom right panel.
     *  Starts the timer so the random images will be displayed
     *  for the computer.
     */
    public void resetGame()
    {
        rockButton.setEnabled(true);
        paperButton.setEnabled(true);
        scissorsButton.setEnabled(true);
        prompt.setText("Click on a Button");        
        bottomRight.setVisible(false);
        timer.start();

        repaint();
    }

    /**
     *  Properly exits the program
     */
    public void quitGame()
    {
        System.exit(0);
    }

}
