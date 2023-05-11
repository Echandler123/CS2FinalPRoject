import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
public class Arrow extends JFrame{
    private final int x = 520;
    private Image Arrow;
    private int wval;
    private final int widthBinitail = 50;
    private int power;
    private int x2;
    private int[] txpoints;
    private int [] typoints;
    private final int xt = 100;
    private final int yt = 345;
    private int y2;
    private int count;

    public Arrow()
    {
         this(400,400,0,0,0,0);
         Arrow = new ImageIcon("Resources/Arrow.png").getImage();
         x2 = 0;
         y2 = 388;
         txpoints = new int[250];
         typoints = new int[250];
         for(int i = 0; i < 250; i++)
        {
            txpoints[i] = 100 + i;
            typoints[i] = 345 + i;
        }
//        for(int i = 0; i < 250; i++)
//        {
//            System.out.print(txpoints[i] + " ");
//            System.out.println(typoints[i]);
//        }

         count = 0;
    }

    public Arrow(int fx, int fy, int bx, int by, int dx, int dy)
    {

    }
    public void pull(int val, Graphics g,int x)
    {
            drawpull(g,val,x);
    }
    public void setWidth(int val)
    {
        wval = val;
    }
   public boolean isHit() {

        for(int i =0; i < 250; i++){
            if(x2 == txpoints[i]){
                count++;
            }
               if(y2 == typoints[i]) {
                  count++;
              }
        }
        if(count >= 1)
        {
            return true;
        }
        return false;
  }

    public int getY2() {
        return y2;
    }

    public int getX2() {
        return x2;
    }

    public void drawpull(Graphics g, int x, int xa){
        x2 = (620+x/20);
        if(xa > 0) {
            x2 = xa;
            y2 = wval;
        }
        System.out.println(x2 + " " + y2);
        g.drawImage(Arrow,x2,y2,180,210,this);
    }

}
