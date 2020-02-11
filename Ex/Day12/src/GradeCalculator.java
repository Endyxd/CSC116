import java.util.*;

/**
 * Calulates letter grade based on average
 * @author Suzanne Balik
 */
public class GradeCalculator {

    /** Minimum average */
    public static final int MIN_AVERAGE = 0;
    
    /** Maximum average */
    public static final int MAX_AVERAGE = 100;
    
    /** Lowest average for A */
    public static final int A_CUTOFF = 90;
    
    /** Lowest average for B */
    public static final int B_CUTOFF = 80;
    
    /** Lowest average for C */
    public static final int C_CUTOFF = 70;
    
    /** Lowest average for C */
    public static final int D_CUTOFF = 60;
   
    /**
     * Prompts user for average and outputs letter grade
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
      
        Scanner console = new Scanner(System.in);
            
        System.out.print("Enter average: ");
        int average = console.nextInt();
            
        if (isValidAverage(average)) { 
            System.out.println("Grade: " + calculateGrade(average));
        }
        else {
            System.out.println("Invalid average");
        }
    }
  
    /**
     * Determine if average is within grade range
     * @param average average
     * @return true if average is within range, false otherwise
    */
    public static boolean isValidAverage(int average) {
        if (MIN_AVERAGE <= average && average <= MAX_AVERAGE){
            return true;
        }
        else {
            return false;
        }
    }
  
    /**
     * Calculates letter grade based on average
     * @param average average
     * @return letter grade corresponding to average
     * @throws IllegalArgumentException if average is invalid
     */
    public static String calculateGrade(int average) {
        if (!isValidAverage(average)) {
            throw new IllegalArgumentException("Invalid average");
        }
        if (average >= A_CUTOFF) {
            return "A";
        }
        else if (average >= B_CUTOFF) {
            return "B";
        }
        else if (average >= C_CUTOFF) {
            return "C";
        }
        else if (average >= D_CUTOFF) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
