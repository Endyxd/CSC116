import java.util.Scanner;
import java.awt.*;


 /**
 *This program is to print a square pattern from the user input color,
 *and the complementary color of the imput.
 *
 *@author Nicholas Loftin nlloftin@ncsu.edu
 *
 */



public class SquarePattern {
    /**
     *Draws the square with the given color
     *@param g the graphic made in the main method
     *@param color either the user input color, or the complementary color of the input
     *@param x x position of the current square
     *@param y y position of the current square
     *@param width width of the current square determined by the main method
     */
    public static void drawSquare(Graphics g, Color color, int x, int y, int width) {

        g.setColor(color);

        g.fillRect(x, y, width, width);

    }
    /**
     *Draws the square with the given color
     *@param g the graphic made in the main method
     *@param color either the user input color, or the complementary color of the input
     *@param x x position of the current square
     *@param y y position of the current square
     *@param width width of the current square
     */
    public static void drawOutlineSquare(Graphics g, Color color, int x, int y, int width) {
        g.setColor(color);

        g.fillRect(x, y, width, width);

    }
    /**
    *Main method where the color, size, and position are calculated
    *Will send information to teh previous methods
    *Creates 2 colors, a scanner, and a graphics table
    *@param args none
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //new scanner class
        int squares; //Ammount of squares total
        int r; //red val
        int gr; //green val
        int b; //blue val
        int pixelWidth = 50; //set distance for each new square
        int maxColor = 255; // maximum rgb value
        int maxSquares = 12; // maximum ammount of squares
        int center = 325; // center of the drawing tablet
        int change = 25; // how much both x and y will change with each new square
        System.out.println("How many squares do you want(1-12)?");
        squares = in .nextInt();
        if (squares > maxSquares)
            squares = maxSquares;
        if (squares < 1)
            squares = 1;
        int width = squares * pixelWidth;
        System.out.println("Enter the values for each of the rgb values from 0 to 255: ");
        System.out.print("Red: ");
        r = in .nextInt();
        if (r > maxColor)
            r = maxColor;
        if (r < 0)
            r = 0;
        System.out.print("Green: ");
        gr = in .nextInt();
        if (gr > maxColor)
            gr = maxColor;
        if (gr < 0)
            gr = 0;
        System.out.print("Blue: ");
        b = in .nextInt();
        if (b > maxColor)
            b = maxColor;
        if (b < 0)
            b = 0; 
        in .close();
        DrawingPanel panel = new DrawingPanel(650, 650);
        Graphics g = panel.getGraphics();
        int colormax = 255;
        Color color = new Color(r, gr, b);
        Color invert = new Color(colormax - color.getRed(),
            colormax - color.getGreen(),
            colormax - color.getBlue());
        //creates the colors of the complementary color
        //This if statement is to determine what the last color in the bullseye is, 
        //meaning it will change depending on if it is odd, or even
        if (squares % 2 == 0) {
            drawOutlineSquare(g, color, center - (change * squares) - 1,
                center - (change * squares) - 1,
                2 + (pixelWidth * squares));
        } else
            drawOutlineSquare(g,
                invert,
                center - (change * squares) - 1,
                center - (change * squares) - 1,
                2 + (pixelWidth * squares));

        //Main for loop to create the squares, alternating
        for (int i = squares; i > 0; i--) {
            if (i % 2 == 0) {
                drawSquare(g,
                    invert,
                    center - (change * i),
                    center - (change * i),
                    (pixelWidth * i));
            } else
                drawSquare(g,
                    color,
                    center - (change * i),
                    center - (change * i),
                    (pixelWidth * i));



        }



    }
}