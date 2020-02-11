import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.lang.Object;
//import java.awt.Graphics2D;


public class MyPanel extends JPanel {
	public MyPanel() {
		this.setBackground(Color.WHITE);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g.fillOval(10, 10, 20, 50);
	}
}