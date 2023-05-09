import javax.swing.*;
import java.awt.*;


public class Bow extends JFrame{
    private int Stringx;
    private int Stringy;
    private Image Bow;
    private int x;

    public Bow()
    {
        this(400,400,0,0,0,0);
        Bow = new ImageIcon("Resources/Bow.png").getImage();
        x = 400;
    }

    public Bow(int fx, int fy, int bx, int by, int dx, int dy)
    {
        x = 400;
    }
    public int getStringx() {
        return Stringx;
    }

    public int getStringy() {
        return Stringy;
    }
    public void draw(Graphics g){

        g.drawImage(Bow,x,700,50,180,this);
    }
    public void draw(Graphics g,int w,int h){
        g.drawImage(Bow,700,400, 50+w/20,180,this);
    }

}
