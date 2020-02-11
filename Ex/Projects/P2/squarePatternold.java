import java.util.*;
import java.awt.*;

public class squarePattern{
    
   public static void drawSquare(Graphics g, Color color, int x, int y, int width) {    
   
      Color invert = new Color(255-color.getRed(), 255-color.getGreen(), 255-color.getBlue());   
      g.setColor(color);
            
      g.fillRect(x, y, width+25, width+25);
     
      g.setColor(invert);
      
      g.fillRect(x+25,y+25, width-25, width-25);
      System.out.println("x = " + (x+50) );
      System.out.println("Y = " + (y+50));
      System.out.println("Width = " + (width-100));
      System.out.println("_____________");
   
   
   
   }

 
    
    
    
    
   public static void main(String[] args){
        
      
      Scanner in = new Scanner(System.in);
      int squares = 0;
      int r;
      int gr;
      int b;
      
        
        
      System.out.println("How many squares do you want(1-12)?"); 
      squares = in.nextInt();
   			//All these if statments are just for making sure the user doesn't over or under enters. 
      if(squares > 12)
         squares = 12;
      if(squares < 1)
         squares = 1;
      int winitial = squares*50;
      int width = winitial;
      int x = 325-25*squares;
      int y = 325-25*squares;
      int xinitial = x;
      int yinitial = y;
      System.out.println("Enter the values for each of the rgb values from 0 to 255: ");
      System.out.print("Red: ");
      r = in.nextInt();
      if(r > 255)
         r = 255;
      if(r < 0)
         r = 0;
      System.out.print("Green: ");
      gr = in.nextInt();
      if(gr > 255)
         gr = 255;
      if(gr < 0)
         gr = 0;
      System.out.print("Blue: ");
      b = in.nextInt();
      if(b > 255)
         b = 255;
      if(b < 0)
         b = 0;
      in.close();
      int rinvert = 255-r;
      int ginvert = 255-gr;
      int binvert = 255-b;
      int i = 1;
      DrawingPanel panel = new DrawingPanel(650,650);
      Graphics g = panel.getGraphics();
      Color col = new Color(r, gr, b);
      Color colinvert = new Color(rinvert, ginvert, binvert);
      g.setColor(colinvert);
      g.fillRect(x,y, 50*squares,50*squares);
      g.setColor(col);
      g.fillRect(300,300, 50,50);
        // add a draw outline thing here with the info we got for the total length 
      for(i = 1; i<squares; i++){
        
         drawSquare(g, col, x, y, width);
         width = winitial - (50*i);
         x+=-50*i;
         y+=-50*i;
          
      
      }
        
        
        
   }    
    
}
