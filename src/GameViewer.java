import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class GameViewer extends JFrame implements MouseListener, MouseMotionListener, KeyListener,ActionListener   {
    private Bow B;
    private Arrow A;
    private int clickNum;
    private Target T;
    private int x;
    private int y;
    private int val;
    private int width;
    private int xa;
    private int ya;
    private Timer clock;
    public GameViewer(int fWidth, int fHeight)
    {
        // Create a Ball with the 0 parameter constructor
        // Look at the Ball class to see how this constructor
        // initializes the Ball instance variables
        B = new Bow();
        A= new Arrow();
        T = new Target();
        clickNum = 0;
        x = 0;
        y = 0;
        val = 0;
        width = 0;
        xa = 0;
        ya = 388;
        clock = new Timer(100,this);
        // Initialize the User Interface
        setSize(fWidth, fHeight);
        setLocationRelativeTo(null);
        setTitle("Bow Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // addMouseListener attaches a MouseListener object to MouseDemo
        // addMouseMotionListener attaches a MouseMotionListener object to MouseDemo
        // By passing "this" as the parameter, it makes this specific Instance
        // of MouseDemo its own MouseListener and its own MouseMotionListener
        addMouseListener(this);         // # 5: Required for MouseListeners
        addMouseMotionListener(this);   // # 6: Required for MouseMotionListeners

        setVisible(true);
    }
    public void paint(Graphics g)
    {
        // Configuration constants
        // Used to configure the location of the information box
        // and the Strings inside of it
        // These values can be changed to alter the information box
        // and the Strings inside of it
//        final int INFO_RECT_TOP_LEFT_X = 85;
//        final int INFO_RECT_TOP_LEFT_Y = 85;
//        final int INFO_RECT_WIDTH = 220;
//        final int INFO_RECT_HEIGHT = 60;
//        final int INFO_STR_X = 100;
//        final int INFO_STR_1_Y = 100;
//        final int INFO_STR_2_Y = 120;
//        final int INFO_STR_3_Y = 140;

        // Note: The Graphics object g keeps track of the "state" of several attributes
        // In this case, note that it always has a current value for its Color
        // First, set the Color to LIGHT_GRAY to draw the background
        // Next, set the Color to WHITE to draw the information box
        // Finally, set the Color to BLACK to draw the information strings

        // Set the background of the Frame to LIGHT_GRAY
        g.setColor(Color.WHITE);
        g.fillRect(0, getInsets().top, getWidth(), getHeight());
        // Note: getInsets().top just finds where the Title Bar ends and the usable area starts

//        // Set the Color of the information box to WHITE
//        g.setColor(Color.WHITE);
//        g.fillRect(INFO_RECT_TOP_LEFT_X, INFO_RECT_TOP_LEFT_Y,
//                INFO_RECT_WIDTH, INFO_RECT_HEIGHT);
//
//        // Set the Color of information Strings to Black
//        g.setColor(Color.BLACK);

//        // Draw the Strings onto the Frame (inside of the information box)
//        g.drawString("\tArrow front is at [" + A.getFx() + ", " + A.getFy() + "]",
//                INFO_STR_X, INFO_STR_1_Y);
//        g.drawString("Click and drag to move the arrow.", INFO_STR_X, INFO_STR_3_Y);

        // Have the ball draw itself
        T.draw(g);
        B.draw(g,x,y);
        A.pull(val,g,xa,ya);
        if(A.isHit() == true){
//            g.setColor(Color.GREEN);
//            g.fillRect(0,0,1000,800);
            g.setFont(new Font("SERIF",Font.ITALIC,60));
            g.setColor(Color.black);
            g.drawString("You Win!", 450, 450);
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        xa -= 10;
        if(xa == 100)
        {
            clock.stop();
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //
        xa = 620;
        clock.start();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("\t\t\texecuting mouseDragged event handler");

        // Ask the input event the current location (x and y position on the Frame) of the mouse
        x = e.getX();
        y = e.getY();
        val = x+ -231;
        // Move the ball


        // Repaint, leads to the system calling MouseDemo.paint()
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {

    }
}
