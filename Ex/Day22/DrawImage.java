import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawImage extends JPanel {


    @Override
    public void paintComponent(Graphics g){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("MyImage.png");
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(img, 0); // any ID will do
        try {
        mt.waitForAll();
    } catch (InterruptedException ie) {}
    g.drawImage(img,0,0,null);



        
     }

}