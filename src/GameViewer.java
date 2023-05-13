import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.JFrame;
public class GameViewer extends JFrame implements MouseListener, MouseMotionListener, KeyListener,ActionListener   {
    private Bow B;
    private Arrow A;
    private Target T;
    private int x;
    private int y;
    private Timer clock;
    private Image Background;
    private final int fWidth = 1000;
    private final int fHeight = 800;
    private Image Instructions;
    private boolean Start;
    /* Creates the window of the game, creates the timer,, creates the background image and creates the Bow, Arrow, and
    Target objects. */
    public GameViewer() {
        B = new Bow();
        A= new Arrow();
        T = new Target();
        clock = new Timer(100,this);
        Background = new ImageIcon("Resources/Background.png").getImage();
        Instructions = new ImageIcon("Resources/Instructions.png").getImage();
        setSize(fWidth, fHeight);
        setLocationRelativeTo(null);
        setTitle("Bow Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);
        Start = false;
    }
    // Paints the background, target, bow,arrow, and win background depending on if the arrow hit the target
    public void paint(Graphics g) {
        g.drawImage(Instructions, 0, 0, fWidth, fHeight, this);
        if(Start == true){
            if (A.isHit() == true) {
                Background = new ImageIcon("Resources/BackgroundWin.png").getImage();
                g.drawImage(Background, 0, 0, fWidth, fHeight, this);
            } else {
                g.drawImage(Background, 0, 0, fWidth, fHeight, this);
                T.draw(g);
                B.draw(g, x, y);
                A.drawPull(g);
            }
        }
    }
    // Animates the bow image moving in the air
    public void actionPerformed(ActionEvent e) {
        if(A.arc() == 100)
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
    // Starts the animation of the arrow in the air and takes how much the bow was stretched
    @Override
    public void mouseReleased(MouseEvent e) {
        //
        A.setPower(B.getWidth());
        A.setWidthVal(388);
        A.setxa(620);
        clock.start();
        A.setMouseReleased(true);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        //
    }
    @Override
    public void mouseExited(MouseEvent e) {
        //
    }
    // Changes the width of the bow and changes the x of the arrow to move with the stretching bow
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("\t\t\texecuting mouseDragged event handler");
        x = e.getX();
        y = e.getY();
        A.setVal(x);
        repaint();
    }
    @Override
    // Checks if the user has read the instructions by seeing if their mouse moved then draws the game
    public void mouseMoved(MouseEvent e) {
        Start = true;
        repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }
}
