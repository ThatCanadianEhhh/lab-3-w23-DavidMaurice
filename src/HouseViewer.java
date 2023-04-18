import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import javax.swing.JComponent;


/**
 This component draws  House shape.
 */
class HouseComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        House House1 = new House(0, 0);


        House1.draw(g2);

    }
}
/**
 A House shape that can be positioned anywhere on the screen.
 */

class House {
    private int xLeft;
    private int yTop;

    /**
     Constructs a House with a given top left corner.
     */
    public House(int x, int y) {
        xLeft = x;
        yTop = y;
    }

    /**
     Draws the House.
     */
    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(xLeft, yTop + 100, 300, 100);
        Rectangle door = new Rectangle(xLeft + 20, yTop + 150, 60, 50);
        Rectangle window = new Rectangle(xLeft + 200, yTop + 120, 25, 25);

        Point2D.Double r1 = new Point2D.Double(xLeft, yTop + 100);
        // The front of the roof
        Point2D.Double r2 = new Point2D.Double(xLeft + 150, yTop);
        // The rear of the roof
        Point2D.Double r3 = new Point2D.Double(xLeft + 300, yTop + 100);

        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);

        g2.draw(body);
        g2.draw(door);
        g2.draw(window);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
    }
}

public class HouseViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HouseComponent component = new HouseComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}