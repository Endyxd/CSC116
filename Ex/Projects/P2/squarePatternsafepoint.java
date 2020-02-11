import java.util.*;
import java.awt.*;

public class squarePatternsafepoint{
    
   public static void drawSquare(Graphics g, Color color, Color invert, int x, int y, int width, int c) {    
      /*
      g.setColor(invert);
      g.fillRect(x-(25*c),y-(25*c), width/c, width/c);
      g.setColor(color);
      g.fillRect(x-(50*c),y-(50*c), width/c, width/c);

    
      g.setColor(invert);
      x = x-25*c;
      y = y-25*c;
      g.fillRect(x,y, width/c, width/c);
      g.setColor(color);
      x = x-25*c;
      y = y-25*c;
      g.fillRect(x,y, width/c, width/c);

   */
   System.out.println("Turn " + c);
   System.out.println("x = " + x );
   System.out.println("Y = " + y);
   System.out.println("Width = " + width);
   System.out.println("_____________");
      g.setColor(color);
      g.fillRect(x,y, width-50*c, width-50*c);
      g.setColor(invert);
     
      g.fillRect(x+25,y+25, width-50*(c+1), width-50*(c+1));
      
   
   
   
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
   	
      Color col = new Color(r, gr, b);
      Color colinvert = new Color(rinvert, ginvert, binvert);
      g.setColor(colinvert);
      g.fillRect(x,y, 50*squares,50*squares);
     // x = 325-12*squares;
     // y= 325-12*squares;
      //g.fillRect(300,300, 50,50);

      //drawSquare(g, col, colinvert, x, y, width, i); 
        // add a draw outline thing here with the info we got for the total length 
      for(i = 1; i<squares; i++){
        x = xinitial+25*i;
        y = y+25*i;
        drawSquare(g, col, colinvert, x, y, width, i);
        width = winitial - (50*i);

      //   x = x+(50*i);
       //  y = y+(50*i);
        
      
      }
        
        
        
   }    
    
}
