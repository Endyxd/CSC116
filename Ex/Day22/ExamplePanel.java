import javax.swing.*;
import java.awt.*;

public class ExamplePanel{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 200));
        frame.setLocation(new Point(40, 50));
        frame.setTitle("Buh");
        frame.setLayout(new FlowLayout());
        
        JButton button = new JButton();
        button.setText("a");
        button.setBackground(Color.PINK);
        frame.setVisible(true);
        
        frame.add(button);
        MyActionListener b = new MyActionListener();
        button.addActionListener(b);
    }
}