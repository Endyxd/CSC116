import java.awt.*;

public class Drawing{

public static void main(String[] args){
    DrawingPanel panel = new DrawingPanel(300, 200);
    Graphics g = panel.getGraphics();
    
    g.fillRect(10, 30, 60, 35);
    g.fillOval(80, 40, 50, 70);
    g.setColor(Color.BLACK);
    g.fillRect(10,30,100,50);
    g.drawLine(20,0,10,30);
    g.setColor(Color.RED);
    g.fillOval(60, 40, 40, 70);
    Color pink = new Color(255,192,203);
    panel.setBackground(pink);


}

}
