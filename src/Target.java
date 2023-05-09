import javax.swing.*;
import java.awt.*;



public class Target extends JFrame {
    private Image Target;
    public Target() {
        this(400,400,0,0,0,0);
        Target = new ImageIcon("Resources/Target.png").getImage();
    }


    public Target(int i, int i1, int i2, int i3, int i4, int i5) {
    }
    public void Draw(Graphics g){
        g.drawImage(Target,100,400, 180,210,this);
    }
}
