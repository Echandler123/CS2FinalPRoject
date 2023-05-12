import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
public class Arrow extends JFrame{
    private Image Arrow;
    private int wval;
    private int power;
    private int x2;
    private int[] txpoints;
    private int [] typoints;
    private final int xt = 100;
    private final int yt = 345;
    private int y2;
    private int count;
    private int previous;
    private boolean isreleased;

    public Arrow() {
         this(400,400,0,0,0,0);
         Arrow = new ImageIcon("Resources/Arrow.png").getImage();
         x2 = 0;
         y2 = 388;
         txpoints = new int[280];
         typoints = new int[280];
         for(int i = 0; i < 280; i++) {
             txpoints[i] = 70 + i;
             typoints[i] = 315 + i;
         }
         count = 0;
    }
    public Arrow(int fx, int fy, int bx, int by, int dx, int dy) {
    }
    public void pull(int val, Graphics g,int x) {
            drawpull(g,val,x);
    }
    public void setWidth(int val) {
        wval = val;
    }
   public boolean isHit() {
        for(int i : txpoints) {
            for(int j : typoints){
                if(txpoints[i] == x2 && typoints[j] == y2){
                    return true;
                }
            }
            return false;
        }
        if(count >= 1) {
            return true;
        }
        return false;
  }
  public void setPrevious(int previous) {this.previous = previous;}
  public int getY2() {return y2;}
  public int getX2() {return x2;}
  public void setMouseReleased(boolean released)
  {
      isreleased = released;
  }
  public void drawpull(Graphics g, int x, int xa){
      x2 = (620+x/20);
      if(xa > 0) {
        x2 = xa;
        y2 = wval;
      }
      if(isreleased == true) {
          if (y2 < previous) {
              Arrow = new ImageIcon("Resources/ArrowUp.png").getImage();
          } else if (y2 > previous) {
              Arrow = new ImageIcon("Resources/ArrowDown.png").getImage();
          }
      }
      System.out.println(x2 + " " + y2);
      g.drawImage(Arrow,x2,y2,180,210,this);
  }
}
