import java.awt.*;
public class loopdraw{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel();
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.PINK);
        
        for(int i = 1; i <=10; i++)
            g.fillRect(100+ 20*i, 5+20*i, 50, 50);
    
    
    
    
    }


}
