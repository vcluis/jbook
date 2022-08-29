import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Figures extends JPanel{
    private int option;
    public Figures(int option){
        this.option = option;
    }

    public void paintComponents(Graphics g){
        super.paintComponents(g);
        for(int i = 0; i < 10; i++){
            switch(option){
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }

    public static void main(String[] args){
        String message = String.format("1. Draw Rectagles%n2. Draw Ovals");
        String userInput = JOptionPane.showInputDialog(message);
        int selectedOption = Integer.parseInt(userInput);
        System.out.println(selectedOption);
        Figures f = new Figures(selectedOption);
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(f);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}

