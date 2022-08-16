import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        Panel panel = new Panel();
        JFrame aplication = new JFrame();
        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplication.add(panel);
        aplication.setSize(300, 300);
        aplication.setVisible(true);
    }
}
