import javax.swing.*;
import java.awt.*;


public class Bow extends JFrame{
    private int Stringx;
    private int Stringy;
    private Image Bow;
    private int x;
    private int width;

    public Bow()
    {
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

    public void draw(Graphics g){

        g.drawImage(Bow,x,700,50,180,this);
    }
    public void draw(Graphics g,int w,int h){
        width = 50+w/20;
        System.out.println(width);
        g.drawImage(Bow,700,400, width,180,this);
    }

}
