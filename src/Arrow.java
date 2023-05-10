import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
public class Arrow extends JFrame{
    private final int x = 520;

    private Image Arrow;
    private int rval;
    private final int widthBinitail = 50;
    private int power;
    private int x2;

    public Arrow()
    {
         this(400,400,0,0,0,0);
         Arrow = new ImageIcon("Resources/Arrow.png").getImage();
         x2 = 0;
    }

    public Arrow(int fx, int fy, int bx, int by, int dx, int dy)
    {

    }


    public int parabola(int val)
    {
        int num = -1*(val/20)^2;
        return num;
    }


    public void pull(int val, Graphics g,int x)
    {
            drawpull(g,val,x);
    }
    public void drawpull(Graphics g,int x, int y){
        x2 = (620+x/20);
        if(y > 0) {
            x2 = y;
        }
        g.drawImage(Arrow,x2,388 - y, 180,210,this);
    }

}
