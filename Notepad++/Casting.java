/**
 * CSC116 Example Class to Demonstrate Casting and Rounding
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class Casting {
  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    //Example of casting from int to double
    int firstY=10;
    double firstX=(double)firstY;
    System.out.println("The integer value "+firstY+
      " was cast to the double value "+firstX);

     double secondY=10.2;
     int secondX= (int)secondY;
      System.out.println("The double value "+secondY+
       " was cast to the integer value "+secondX);

    //Example of rounding from double to int
    int thirdX=(int)Math.round(secondY);
    System.out.println("The double value "+secondY+
      " was round to the int value "+thirdX);

  }
}
