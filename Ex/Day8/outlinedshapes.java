import java.awt.*;
public class outlinedshapes{


    public static void main(String[] args){
    DrawingPanel panel = new DrawingPanel(150, 70);
    Graphics g = panel.getGraphics();
    g.setColor(Color.RED);
    g.fillRect(20,10,100,50);
    
    g.setColor(Color.BLACK);
    g.drawRect(20,10,100,50);

    }

}
