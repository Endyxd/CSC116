/**
 * CSC116 Example Class to Demonstrate Variables
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class Volume {
  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    final double BOTTLE_VOLUME = 2.0;
    final double CAN_VOLUME = 0.355;
    int bottles = 4; // we have four bottles
    int cans = 10; //we have ten cans

    // compute total volume
    double total = bottles * BOTTLE_VOLUME
          + cans * CAN_VOLUME;

    //print result
    System.out.print("The total volume is ");
    System.out.print(total);
    System.out.println(" liters");
  }
}
