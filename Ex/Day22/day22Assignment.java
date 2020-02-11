import javax.swing.*;
import java.awt.*;
public class day22Assignment{
   public static void main(String[] args){
      JFrame frame = new JFrame();
      frame.setLayout(new BorderLayout());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(600, 400));
      frame.setLocation(new Point(40, 50));
      frame.setTitle("please how do I change this");
      frame.add(new JLabel("Hi, wyd, wya"), BorderLayout.NORTH);
      JPanel rightPanel = new JPanel(new GridLayout(3, 3));
      for (int i = 1; i <= 9; i++) {
         rightPanel.add(new JButton("" + i));
      }
      frame.add(rightPanel, BorderLayout.EAST);
      JPanel leftPanel = new JPanel(new GridLayout(4,1));
      for(int i = 1; i <= 4; i++){
        leftPanel.add(new JButton("" + i));
      }
      frame.add(leftPanel, BorderLayout.WEST);
      JButton submit = new JButton();
      submit.setText("Submit");
      frame.add(submit, BorderLayout.SOUTH);
      JPanel center = new JPanel(new FlowLayout());
      center.add(new JLabel("Input: "));
      center.add(new JTextField(15));
      frame.add(center, BorderLayout.CENTER);
      
      frame.setVisible(true);
      
   }
}