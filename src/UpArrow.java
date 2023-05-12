import javax.swing.*;
import java.awt.*;

public class UpArrow extends Arrow{
    private Image Arrow;
    private int x2;
    private int y2;
    private int wval;
    public UpArrow(){
        super();
        Arrow = new ImageIcon("Resources/UpArrow.png").getImage();
        x2 = 0;
        y2 = 0;
        wval = 0;
    }
    public void DrawPullUp(Graphics g, int x, int xa)
    {
        x2 = (620+x/20);
        if(xa > 0) {
            x2 = xa;
            y2 = wval;
        }
        System.out.println(x2 + " " + y2);
        g.drawImage(Arrow,x2,y2,180,210,this);
    }
    public int getY2Up(){
        return y2;
    }



}
