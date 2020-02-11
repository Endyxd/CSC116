import java.util.*;
/**
 * This is an incomplete program intended to assess your ability to work with booleans as values,
 * apply your knowledge of loops, and work with reading user input. You are asked to complete
 * 5 methods, each of which is worth 10 points for this assignment. The method truthTable is already
 * complete and intended to show output for your boolean methods. See the homework specification
 * for full details.
 * @author Spencer Yoder
 * @author Nicholas Loftin
 */
public class Booleans {
  /** The identification code for the xor method */
  public static final int XOR = 0;
  /** The identification code for the halfAdder method */
  public static final int HALF_ADDER = 1;
  /** The identification code for the halfFullAdder method */
  public static final int FULL_ADDER = 2;
  
  /**
   * This portion of the program is to help you test your code and ensure that it compiles.
   * Feel free to add tests but understand that removing code here may be to your detriment.
   * @param args command-line arguments
   */
  public static void main(String[] args) {
    truthTable(XOR);
    
    truthTable(HALF_ADDER);
    
    truthTable(FULL_ADDER);
    
    forToWhile(1, 10, 1);
    forToWhile(0, -10, -2);
    forToWhile(0, 100, 5);
    
    System.out.println("\nLists from preset scanners:");
    System.out.println("---------------------------------");
    System.out.println("Your list is \"" +integerList(new Scanner("-1\n")) + "\"");
    System.out.println("Your list is \"" +integerList(new Scanner("hello\n-1\n")) + "\"");
    System.out.println("Your list is \"" +integerList(new Scanner("3\n-1\n")) + "\"");
    System.out.println("---------------------------------");
    System.out.println("\nList from user:");
    System.out.println("---------------------------------");
    System.out.println("Your list is \"" +integerList(new Scanner(System.in)) + "\"");
    System.out.println("---------------------------------");
  }
  
  /**
   * THIS METHOD IS COMPLETE. DO NOT MODIFY
   * Prints out a truth table using the given method code.
   * In this table, 1 corresponds to true and 0 corresponds to false
   * @param methodCode an integer corresponding to a method in the program
   */
  public static void truthTable(int methodCode) {
    //When I started this method, I had a bunch of grand ideas in mind for integrating it into
    //the rest of the program. However, I ran into walls rather quickly because I wanted to limit
    //myself to things we had covered in class. Falling prey to the sunk costs fallacy, I decided
    //to push through despite not having access to my usual tricks. I apologize for this messy code.
    int inputs = 2; //Default number of inputs for left side of table.
    String header = "a b|c\n" +
                    "---|-"; //Default header for table
    if(methodCode == XOR) {
      header = "Results of xor method:\n" +
               "a b|a XOR b\n" +
               "---|---------"; //Header for XOR input to table
    } else if(methodCode == HALF_ADDER) {
      header = "Results of half adder method:\n" +
               "a b|h l\n" +
               "---|---"; //Header for HALF_ADDER input to table
    } else if(methodCode == FULL_ADDER) {
      header = "Results of full adder method:\n" +
               "a b c|h l\n" +
               "-----|---"; //Header for HALF_FULL_ADDER input to table
      inputs = 3;
    }
    System.out.println(header);
    //This generates the left side of the table by counting down in binary
    for(int i = 0; i < (int) Math.pow(2, inputs); i++) {
      int input = i;
      //This displays the binary digits of i
      String reverse = "" + input % 2;
      for(int j = 1; j < inputs; j++) {
        input /= 2;
        reverse = input % 2 + " " + reverse;
      }
      System.out.print(reverse + "|");
      //Put the left side of the table into the proper method.
      if(methodCode == XOR) {
        System.out.println(xor(reverse.charAt(0) == '1', reverse.charAt(2) == '1'));
      } else if(methodCode == HALF_ADDER) {
        System.out.println(halfAdder(reverse.charAt(0) == '1', reverse.charAt(2) == '1'));
      } else if(methodCode == FULL_ADDER) {
        System.out.println(fullAdder(reverse.charAt(0) == '1', reverse.charAt(2) == '1', reverse.charAt(4) == '1'));
      }
    }
    System.out.println();
  }
  
  /**
   * Returns the result of using the exclusive or operation on the two given booleans WITHOUT
   * using Java's XOR operation (^)
   * Hint: a XOR b is equivalent to a or b but not both
   * @param a one of the booleans to be XOR'd
   * @param b one of the booleans to be XOR'd
   * @return 1 if a XOR b evaluates to true and 0 otherwise.
   */
  public static int xor(boolean a, boolean b) {
    //Your code here.
    if(a == true && b == true){
        return 0;
    }
    else if(a == true || b == true){
        return 1;
    }
    else
        return 0;
  }
  
  /**
   * Returns the results of running the given booleans through a half adder circuit
   * See https://en.wikipedia.org/wiki/Adder_(electronics)#Half_adder 
   * and the homework specification for full details.
   * @param a a boolean representing a bit to be added
   * @param b a boolean representing a bit to be added
   * @return the results in the form "<high-order bit> <low-order bit>"
   *         e.g. "0 0", "0 1", or "1 0"
   */
  public static String halfAdder(boolean a, boolean b) {
    //Your code here.
    int leftNum;
    boolean checkBoolean = a && b;
    if(checkBoolean == true){
        leftNum = 1;
    } else {
        leftNum = 0;
    }
    int rightNum = xor(a, b);
    return leftNum + " " + rightNum;
  }
  
  /**
   * Returns the results of running the given booleans through a full adder circuit
   * See https://en.wikipedia.org/wiki/Adder_(electronics)#Full_adder
   * and the homework specification for full details
   * @param a a boolean representing a bit to be added
   * @param b a boolean representing a bit to be added
   * @param c a boolean representing a bit to be added
   * @return the results in the form "<high-order bit> <low-order bit>"
   *         e.g. "0 0", "0 1", or "1 0"
   */
  public static String fullAdder(boolean a, boolean b, boolean c) {
    String output1 = halfAdder(a, b);
    boolean high1 = output1.charAt(0) == '1';
    boolean low1 = output1.charAt(2) == '1';
    //Your code here.
    
    String halfAddOut = halfAdder(low1, c);
    boolean high2 = halfAddOut.charAt(0) == '1';
    boolean low2 = halfAddOut.charAt(0) == '1';
    String outputFinal = "";
    
    if(high1 || high2){
        outputFinal += "1 ";
    } else {
        outputFinal += "0 ";
    }
    
    if(low2){
        outputFinal += "1 ";
    } else {
        outputFinal += "0 ";
    }
    return outputFinal;
    
  }
  
  /**
   * Prints the results of iterating from iNaught to iFinal by di twice.
   * Once using a for loop and once using a while loop.
   * Your job is to replicate the results of the code given using while loops instead of for loops.
   * @param iNaught the initial value of the iteration variable (i)
   * @param di the amount by which i changes each iteration of the loop (can be negative or positive)
   * @param iFinal the value at which i stops
   */
  public static void forToWhile(int iNaught, int iFinal, int di) {
    System.out.println("Using for loop:");
    if(di > 0) {
      for(int i = iNaught; i <= iFinal; i += di) {
        System.out.print(i + " ");
      }
    } else {
      for(int i = iNaught; i >= iFinal; i += di) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    
    System.out.println("Using while loop:");
    //Your code here.
    
    int i = iNaught;
    if(di > 0){
        while(i <= iFinal){
            System.out.print(i + " ");
            i += di;
        }
    } else{
        while(i >= iFinal){
            System.out.print(i+ " ");
            i += di;
        }
    }
    System.out.println("");
  }
  
  /**
   * Use the given scanner to take input from the user. Prompt for input until the user enters -1.
   * Ignore every non-integer that the user enters. Combine all integers into a list of the form:
   * "<integer 1>, <iteger 2>, ... <integer n>" e.g. "4, 3, 67, 2"
   * @param scan the Scanner from which to read user input
   * @return the list of all integers (except for -1) that the user entered as a String
   */
  public static String integerList(Scanner scan) {
    //Your code here.
    List <Integer> values = new ArrayList<Integer>();
    int input = 0;
    String outputStr = "";
    do{
        System.out.print("Enter an integer: ");
        if(scan.hasNextInt()){
            input = scan.nextInt();
        } else {
            scan.next();
        }
        if(input != -1){
            values.add(input);
        }
        
    
    }while(input != -1);
    outputStr = values.toString();
    return outputStr;
  }
}
