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
         this(400,400,0,0,0,0);
         Arrow = new ImageIcon("Resources/Arrow.png").getImage();
    }

    public Arrow(int fx, int fy, int bx, int by, int dx, int dy)
    {

    }
    public void setDraw(Bow b)
    {
        bx = b.getStringx();
        by = b.getStringy();
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
    public void curve(int value)
    {
        for(int i = value/2; i >= -value/2; i--)
        {
               dx = i;
               dy = parabola(value);
        }

    }
    public int parabola(int val)
    {
        int num = (val/10)^2;
        return num;
    }
    public void pull(int val, Graphics g)
    {

            drawpull(g,val);
    }
    public void drawpull(Graphics g,int x){
        g.drawImage(Arrow,620+x/20,388, 180,210,this);
    }

}
