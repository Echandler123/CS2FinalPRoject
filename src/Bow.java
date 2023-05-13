import javax.swing.*;
import java.awt.*;
public class Bow extends JFrame {
    private Image Bow;
    private int x;
    private int width;
    // Creates the bow image and sets the original position and size of the bow
    public Bow() {
        this(400,400,0,0,0,0);
        Bow = new ImageIcon("Resources/Bow.png").getImage();
        x = 400;
        width = 50;
    }
    public Bow(int fx, int fy, int bx, int by, int dx, int dy)
    {
        x = 400;
    }
    @Override
    public int getWidth() {
        return width;
    }
    // Draws the bow
    public void draw(Graphics g){
        g.drawImage(Bow,x,700,50,180,this);
    }
    // Draws the bow with the stretched width
    public void draw(Graphics g,int w,int h) {
        width = 50+w/20;
        System.out.println(width);
        g.drawImage(Bow,700,400, width,180,this);
    }
}
