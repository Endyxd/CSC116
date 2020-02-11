import java.awt.*;
import java.util.*;


/**
*This program is to create an animation on a mode of transportation
*@author Nicholas Loftin nlloftin@ncsu.edu
* Version 3.1
*/

public class TransportationAnimation {
    /** width of screen*/
    public static final int WIDTH = 500; 
    
    /**height of screen*/
    public static final int HEIGHT = 400; 
    
    /** delay */
    public static final int SLEEP_TIME = 200; 
    
    /**initial position of x */
    public static final int INITIAL_X = 10; 
    
    /** initial position of y*/
    public static final int INITIAL_Y = 200; 
    
    /** number of frames the program completes*/
    public static final int NUMBER_OF_UPDATES = 120; 
    
    /**Distance x travels*/
    public static final int DX = 5; 

    /**
    * Main method for starting the animation and the drawings
    *@param args none
    */
    public static void main(String[] args) {

        DrawingPanel panel = new DrawingPanel(WIDTH, HEIGHT);
        Graphics g = panel.getGraphics();

        int x = INITIAL_X;
        int y = INITIAL_Y;
        for (int i = 0; i < NUMBER_OF_UPDATES; i++) {
            drawBackground(g);
            drawVehicle(g, x + DX * i, y);
            panel.sleep(SLEEP_TIME);
        }

        System.out.println("\n*CLOSE the Drawing Panel to exit the program*");
    }

    /**
    *Draws a black background for the depths of space
    *This method also contains a for loop that draws "stars"-
    *in a somewhat random way, as to not be too symmetrical
    *@param g graphics of the tablet, to draw the background
    */
    public static void drawBackground(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        int x = 0;
        int y = 0;


        g.setColor(Color.WHITE);

        for (int i = 0; i < 30; i++) {
            x = 500 - i * x;
            g.fillOval(x, y, 10, 10);
            for (int n = 0; n < 50; n++) {

                g.fillOval(x + n * 50, y, 10, 10);

                g.fillOval(x + n * 75, y + 60, 10, 10);
                g.fillOval(x + n * 75, y - 60, 10, 10);
                g.fillOval(x + n * 55, y + 10, 10, 10);
                g.fillOval(x + n * 55, y + 100, 10, 10);
            }
            y += 75;
        }
    }

    /**
    * Draws a spaceship, from using a triangle, a rectangle, two circles, a polygon, and two lines
    * @param g graphics of animation
    * @param x position of ship as it moves from left to right
    * @param y position of ship in the vertical orientation
    */ 
    public static void drawVehicle(Graphics g, int x, int y) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, 200, 50);


        Color windowframe = new Color(105, 145, 245);
        //Larger circle on ship
        Color glass = new Color(105, 215, 245);
        //Smaller circle representing glass
        g.setColor(windowframe);
        g.fillOval(x + 150, y + 7, 35, 35);
        g.setColor(glass);
        g.fillOval(x + 155, y + 12, 25, 25);

        Color pane = new Color(240, 248, 255);
        //The lines to add a bit of depth to the ship
        g.setColor(pane);
        g.drawLine(x + 158, y + 20, x + 175, y + 30);
        g.drawLine(x + 155, y + 25, x + 170, y + 35);


        int xpos[] = {
            x + 200,
            x + 300,
            x + 200
        };
        int ypos[] = {
            y + 50,
            y + 25,
            y
        };
        int verticies = 3;

        g.setColor(Color.ORANGE);
        g.fillPolygon(xpos, ypos, verticies);
        Color crimson = new Color(243, 33, 92);
        int firex[] = {
            x,
            x - 50,
            x - 25,
            x - 75,
            x - 50,
            x - 35,
            x - 50,
            x
        };
        int firey[] = {
            y,
            y - 20,
            y + 25,
            y + 28,
            y + 30,
            y + 35,
            y + 70,
            y + 50
        };
        int fireverticies = 8;
        g.setColor(crimson);
        g.fillPolygon(firex, firey, fireverticies);

    }
}