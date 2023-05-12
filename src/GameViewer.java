import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.concurrent.TimeUnit;
public class GameViewer extends JFrame implements MouseListener, MouseMotionListener, KeyListener,ActionListener   {
    private Bow B;
    private Arrow A;
    private int clickNum;
    private int power;
    private Target T;
    private int x;
    private int y;
    private int val;
    private int width;
    private int xa;
    private int ya;
    private Timer clock;
    private Image background;
    public GameViewer(int fWidth, int fHeight)
    {
        B = new Bow();
        A= new Arrow();
        T = new Target();
        clickNum = 0;
        x = 0;
        y = 0;
        val = 0;
        width = 0;
        xa = 0;
        ya = 0;
        power = 0;
        clock = new Timer(100,this);
        background = new ImageIcon("Resources/BackGround.png").getImage();
        setSize(fWidth, fHeight);
        setLocationRelativeTo(null);
        setTitle("Bow Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, getInsets().top, getWidth(), getHeight());
        g.drawImage(background,0,0,1000,800,this);
        T.draw(g);
        B.draw(g,x,y);
        A.pull(val,g,xa);
        if(A.isHit() == true){
            try {
                TimeUnit. SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            g.setColor(Color.GREEN);
            g.fillRect(0,0,1000,800);
            g.setFont(new Font("Serif",Font.ITALIC,60));
            g.setColor(Color.black);
            g.drawString("You Win!", 450, 450);
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        A.setPrevious(width -= power);
        power--;
        A.setWidth(width -= power);
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
        power = (B.getWidth() - 80)^2;
        width = 388;
        A.setWidth(width);
        xa = 620;
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

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("\t\t\texecuting mouseDragged event handler");
        x = e.getX();
        y = e.getY();
        val = x+ -231;
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
