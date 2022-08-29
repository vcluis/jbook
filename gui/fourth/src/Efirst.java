import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Efirst extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int w = width / 2;
        int height = getHeight();
        //int h = height / 2;
        int h = height;
        int lines = 15;
        w = 0;
        for(int i = 0; i <= width; i++){
            g.drawLine(0, 0, w + lines, h - lines);
            w += lines;
            h -= lines;
        }
    }
    
    public static void main(String[] args){
        Efirst panel = new Efirst();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}

