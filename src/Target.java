import javax.swing.*;
import java.awt.*;
public class Target extends JFrame {
    private Image Target;
    public Target() {
        Target = new ImageIcon("Resources/Target.png").getImage();
    }


    public void draw(Graphics g){
        g.drawImage(Target,100,345, 250,250,this);
    }
}
