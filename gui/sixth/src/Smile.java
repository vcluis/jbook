import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import javax.swing.JFrame;

public class Smile extends JPanel{
    public void paintComponents(Graphics g){
        super.paintComponents(g);

        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        // mouth
        g.fillOval(50, 110, 120, 60);

        // mouth with smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
    public static void main(String[] args){
        Smile smile = new Smile();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(smile);
        app.setSize(230, 250);
        app.setVisible(true);
    }
}
