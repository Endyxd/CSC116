import java.util.*;
import java.awt.*;

public class squarePattern{
    
   public static void drawSquare(Graphics g, Color color, Color invert, int x, int y, int width, int c) {    
      System.out.println(" X = " + (x-(25*c)));
      System.out.println("Y = " +(y+(50*c)));
      System.out.println("WIDTH + " + width);
      System.out.println("C = " + c);
   /*
      g.setColor(invert);
      g.fillRect(x-(25*c),y-(25*c), width/c, width/c);
      g.setColor(color);
      g.fillRect(x-(50*c),y-(50*c), width/c, width/c);
   
    */
      g.setColor(invert);
      g.fillRect((x-(25*c)),y+(25*c), width/c, width/c);
      g.setColor(color);
      g.fillRect((x-(50*c)),y+(50*c), width/c, width/c);
   
   
   
   }

 
    
    
   /*  //Draws an unfilled Square at (x,y) with the given width and color
    public static void drawOutlineSquare(Graphics g, Color color, int x, int y, int width) {
		g.fillRect(x,y, width, width);


    } */
    
    
   public static void main(String[] args){
        
      DrawingPanel panel = new DrawingPanel(650,650);
      Graphics g = panel.getGraphics();
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
      int width = squares*50;
      int x = 600-25*squares;
      int y = 600-25*squares;
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
   	
      Color col = new Color(r, gr, b);
      Color colinvert = new Color(rinvert, ginvert, binvert);
      g.setColor(col);
      g.fillRect(300,300, 50,50);
      x = 300;
      y= 300;
        
      //drawSquare(g, col, colinvert, x, y, width, i); 
        // add a draw outline thing here with the info we got for the total length 
      for(i = 1; i<squares; i++){
         drawSquare(g, col, colinvert, x, y, width, i);
      
      }
        
        
        
   }    
    
}
