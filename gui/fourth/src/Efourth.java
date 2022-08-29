import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class PaintPanel extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
    
    public static void main(String[] args){
        PaintPanel panel = new PaintPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}

