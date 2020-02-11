import java.awt.*;
public class testing{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(650,650);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(275,275, 100, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(300,300, 50,50);  
    
    }


}
