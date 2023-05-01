import javax.swing.*;
import java.awt.*;


public class Bow extends JFrame{
    private int Stringx;
    private int Stringy;
    private Image Bow;

    public Bow()
    {
        this(800,500,0,100,0,0);
        Bow = new ImageIcon("Resources/Bow.png").getImage();
    }

    public Bow(int fx, int fy, int bx, int by, int dx, int dy)
    {

    }
    public int getStringx() {
        return Stringx;
    }

    public int getStringy() {
        return Stringy;
    }
    public void draw(Graphics g){

        g.drawImage(Bow,400,400,200,180,this);
    }
    public void draw(Graphics g,int w,int h){
        g.drawImage(Bow,400 - w,400, 200+w,180,this);
    }

}
