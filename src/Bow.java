import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Bow extends JFrame implements MouseListener, MouseMotionListener {
    private Arrow A;

    @Override
    public void mouseClicked(MouseEvent e) {
        //
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("\t\t\texecuting mouseDragged event handler");

        // Ask the input event the current location (x and y position on the Frame) of the mouse
        int x = e.getX();
        int y = e.getY();

        // Move the ball
        A.setCenter(x, y);

        // Repaint, leads to the system calling MouseDemo.paint()
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
