import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
public class Arrow extends JFrame{
    private int fx;              // front x
    private int fy;              // front y
    private int dx;             // delta x in one time unit
    private int dy;             // delta y in one time unit
    private int bx;              // back x
    private int by;              // back y
    private Image Arrow;
    public Arrow()
    {
         this(800,500,0,100,0,0);
         Arrow = new ImageIcon("Resources/Arrow.png").getImage();
    }

    public Arrow(int fx, int fy, int bx, int by, int dx, int dy)
    {

    }
    public void setCenter(int xIn, int yIn)
    {

    }

    public int getFx() {
        return fx;
    }

    public int getFy() {
        return fy;
    }

    public int getBx() {
        return bx;
    }

    public int getBy() {
        return by;
    }
    public void draw(Graphics g){

        g.drawImage(Arrow,0,400,100,80,this);
    }
}
