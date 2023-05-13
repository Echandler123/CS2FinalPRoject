import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
public class Arrow extends Bow {
    private Image Arrow;
    private int wval;
    private int x;
    private int[] txpoints;
    private int [] typoints;
    private int y;
    private int previous;
    private boolean isreleased;
    private int power;
    private int xarrow;
    private int val;
    // Creates the Arrow image and creates the arrays of the pixels that the arrow needs to hit to win
    public Arrow() {
        super();
        Arrow = new ImageIcon("Resources/Arrow.png").getImage();
        x = 0;
        y = 0;
        power = 0;
        xarrow = 0;
        val = 0;
        txpoints = new int[280];
        typoints = new int[280];
        for(int i = 0; i < 280; i++) {
            txpoints[i] = -50 + i;
            typoints[i] = 315 + i;
        }
    }
    public Arrow(int fx, int fy, int bx, int by, int dx, int dy) {
    }
    // Sets how high the arrow will go in the air based on how much the bow was stretched
    public void setWidthVal(int widthval) {
        wval = widthval;
    }
    // Checks if the arrow hit the target
    public boolean isHit() {
        for (int i : txpoints) {
            for (int j : typoints) {
                if (i == x && j == y) {
                    return true;
                }
            }
        }
        return false;
    }
    // Sets the previous y coordinate of the arrow
    public void setPrevious(int previous) {this.previous = previous;}
    public void setMouseReleased(boolean released) {
        isreleased = released;
    }
    /* Draws the arrow when it is being pull back and when it is released. Changes the image of the arrow when the arrow
    is moving up or down.*/
    public void drawPull(Graphics g) {
        x = (620+val/20);
        if(xarrow > 0) {
            x = xarrow;
            y = wval;
        }
        if(isreleased == true) {
            if (y < previous) {
                Arrow = new ImageIcon("Resources/ArrowUp.png").getImage();
            } else if (y > previous) {
                Arrow = new ImageIcon("Resources/ArrowDown.png").getImage();
            }
        }
        System.out.println(x + " " + y);
        if(isreleased == false) {
            g.drawImage(Arrow,x,388,180,210,this);
        }
        else {
            g.drawImage(Arrow,x,y,180,210,this);
        }
    }
    // Calculates the arc that the arrow will travel
    public int arc() {
        setPrevious(wval -= power);
        power--;
        setWidthVal(wval-= power);
        xarrow -= 10;
        return xarrow;
    }
    // Calculates high the arrow will go in the air based on how much the bow was stretched
    public void setPower(int width) {
        power = (width - 80)^2;
    }
    public void setxa(int xa) {
        xarrow = xa;
    }
    // Sets the starting amount that the x of the arrow before it is pulled back by the bow
    public void setVal(int x) {
        this.val = x+ -231;;
    }
}
