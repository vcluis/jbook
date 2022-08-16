import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class Panel extends JPanel{
    private SecureRandom random = new SecureRandom();
    private Line[] lines;

    public Panel(){
        setBackground(Color.WHITE);
        lines = new Line[5 + random.nextInt(5)];
        for(int i = 0; i < lines.length; i++){
            int x1 = random.nextInt(300);
            int y1 = random.nextInt(300);
            int x2 = random.nextInt(300);
            int y2 = random.nextInt(300);

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            lines[i] = new Line(x1, y1, x2, y2, color);
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Line line: lines)
            line.draw(g);
    }
}
