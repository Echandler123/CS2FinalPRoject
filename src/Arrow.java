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
    public int parabola(int val)
    {
        int num = -1*(val/20)^2;
        return num;
    }
    public void pull(int val, Graphics g,int x,int ya)
    {
            drawpull(g,val,x,ya);
    }
   public boolean isHit() {

        for(int i =0; i < 250; i++){
            if(x2 == txpoints[i]){
                count++;
            }
//            if(y2 == typoints[i]) {
//                count++;
//            }
        }
        if(count >= 1)
        {
            return true;
        }
        return false;
  }
    public void drawpull(Graphics g,int x, int xa,int ya){
        x2 = (620+x/20);
        if(xa > 0) {
            x2 = xa;
        }
        y2 = ya;
        System.out.println(x2 + " " + y2);
        g.drawImage(Arrow,x2,y2,180,210,this);
    }

}
