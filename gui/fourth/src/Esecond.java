import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Esecond extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int h;
        int w;
        int lines = 15;
        // 0, 0
        w = 0;
        h = height;
        for(int i = 0; i <= width; i++){
            g.drawLine(0, 0, w + lines, h - lines);
            w += lines;
            h -= lines;
        }
        // 0, x
        w = width;
        h = height;
        for(int i = 0; i <= width; i++){
            g.drawLine(width, 0, w - lines, h - lines);
            w -= lines;
            h -= lines;
        }
        // y, x
        w = 0;
        h = height;
        for(int i = 0; i <= width; i++){
            g.drawLine(width, height, w + lines, h - lines);
            w += lines;
            h -= lines;
        }
        // 0, y
        w = width;
        h = height;
        for(int i = 0; i <= width; i++){
            g.drawLine(0, height, w - lines, h - lines);
            w -= lines;
            h -= lines;
        }
    }
    
    public static void main(String[] args){
        Esecond panel = new Esecond();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}

