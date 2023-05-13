import javax.swing.*;
import java.awt.*;
public class Target extends JFrame {
    private Image Target;
    // Creates the target image
    public Target() {
        Target = new ImageIcon("Resources/Target.png").getImage();
    }
    // Draws the target
    public void draw(Graphics g){
        g.drawImage(Target,100,345, 250,250,this);
    }
}
