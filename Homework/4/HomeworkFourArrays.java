import java.util.*;

/**
 * This program aims to assess your ability to implement Array functionalities,
 * manipulations, techniques without the usage of the Arrays Class for assistance.
 * This section of the Homework is worth 60 points. You do not need to change the 
 * main methods at all. This will help determine whether or not your implementation 
 * passes different test scenarios. You only need to implement the specified 
 * methods below. Once finished with implementation. Compile the program
 * and redirect the console output to a text file and compare using the 'diff' command
 * with the provided expected.txt file. If correctly implemented, there should be no
 * difference between the two files.
 * @author Andrew Shon
 * @author Nicholas Loftin
 */
public class HomeworkFourArrays {
	/** Array One for Testing */
	public static final int[] testOne = {1, 2, 3, 7, 9};
	/** Array Two for Testing */
	public static final int[] testTwo = {3, 4, 5, 10, 23, 44};
	/** Array Three for Testing */
	public static final int[] testThree = {6, 7, 29, 0, 99, 50, 65, 323, 22, 1};
	/** Array Four for Testing */
	public static final int[] testFour = {1, 2, 3, 7, 9, 6, 7, 29, 0, 99, 50, 65, 323, 22, 1};
	/** Array Five for Testing */
	public static final int[][] testFive = {{1, 1, 1, 1, 1}, {2, 2, 4, 2, 2}, {3, 3, 3, 3, 3}};
		
  /**
   * The main method is intended to help test your program and ensure it compiles.
   * You may add/remove tests below for your aid, however, these tests below will
   * be the basis on grading.
   * @param args command line arguments
   */
	public static void main(String[] args) {
		System.out.println("\n-----------------------");	
		System.out.println("Homework Four Arrays Results");
		System.out.println("CSC 116 (007)");
		System.out.println("-----------------------");
		
		System.out.println("Duplicates from 'CSC 116: Intro to Java Programming' are: " 
			+ Arrays.toString(storeDuplicates("CSC 116: Intro to Java Programming")));
		System.out.println("Duplicates from 'HHHHHiiiiiii everyone!!' are: " 
			+ Arrays.toString(storeDuplicates("HHHHHiiiiiii everyone!!")));
		System.out.println("Duplicates from 'AAAAAAABBACCDDEEEEEFFFFGGGHHIIJJJJJJKKKKL" + 
		  "LMMMNNOOOPPPQQRRSSTTUUVVWWXXYYYYZ12345678900': " 
			+ Arrays.toString(storeDuplicates("AAAAAAABBACCDDEEEEEFFFFGGGHHIIJJJJJJKKK" +
			"KLLMMMNNOOOPPPQQRRSSTTUUVVWWXXYYYYZ12345678900")));
		
		System.out.println("\nLength of first test array: " + testOne.length);
		System.out.println(Arrays.toString(testOne));
		int[] resultOne = increaseArray(testOne, 3);
		System.out.println("Length of first test array by factor of 3: " 
			+ resultOne.length);
		System.out.println(Arrays.toString(resultOne));
		
		System.out.println("Length of fourth test array: " + testFour.length);
		System.out.println(Arrays.toString(testFour));
		int[] resultFour = increaseArray(testFour, 4);
		System.out.println("Length of fourth test array by factor of 4: " 
			+ resultFour.length);
		System.out.println(Arrays.toString(resultFour));

		
		try {
			System.out.println("Length of fourth test array by factor of 0: " 
				+ increaseArray(testFour, 0).length);
		} catch (IllegalArgumentException e) {
			 System.out.println("Invalid factor value. Must be 0 or less");
		}
		
		System.out.println("\nShifting testOne array by 1 to the left: " 
			+ Arrays.toString(shift(testOne, true, 1)));
		System.out.println("Shifting testTwo array by 3 to the right: " 
			+ Arrays.toString(shift(testTwo, false, 3)));
		System.out.println("Shifting testFour array by 0 to the left: " 
			+ Arrays.toString(shift(testFour, true, 0)));
		System.out.println("Shifting testFour array by 14 to the left: " 
			+ Arrays.toString(shift(testFour, true, 14)));		
		System.out.println("Shifting testFour array by 15 to the right: " 
			+ Arrays.toString(shift(testFour, false, 15)));	

		try {
			System.out.println("Shifting testFour array by -1 to the left: " 
				+ Arrays.toString(shift(testFour, true, -1)));	
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid factor value. Must be a positive value");
		}
		
		try {
			System.out.println("Shifting testFour array by -15 to the right: " 
				+ Arrays.toString(shift(testFour, false, -15)));	
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid factor value. Must be a positive value");
		}
		
		System.out.println("\nPermeating diagonally and horizontally at position (1, 2): \n");
		System.out.println("Before: ");
		print2DArray(testFive);
		System.out.println("\nAfter: ");
		print2DArray(permeate(testFive, 1, 2));

		System.out.println();
		System.out.println("\nPermeating diagonally and horizontally at position (2, 4): \n");
		System.out.println("Before: ");
		print2DArray(testFive);
		System.out.println("\nAfter: ");
		print2DArray(permeate(testFive, 2, 4));
		
		System.out.println();
		System.out.println("\nPermeating diagonally and horizontally at position (0, 0): \n");
		System.out.println("Before: ");
		print2DArray(testFive);
		System.out.println("\nAfter: ");
		print2DArray(permeate(testFive, 0, 0));
		
		System.out.println();
		System.out.println("\nPermeating diagonally and horizontally at position (0, 4): \n");
		System.out.println("Before: ");
		print2DArray(testFive);
		System.out.println("\nAfter: ");
		print2DArray(permeate(testFive, 0, 4));
	
		System.out.println();
		System.out.println("\nPermeating diagonally and horizontally at position (2, 3): \n");
		System.out.println("Before: ");
		print2DArray(testFive);
		System.out.println("\nAfter: ");
		print2DArray(permeate(testFive, 2, 3));
		
		System.out.println();
		System.out.println("\nPermeating diagonally and horizontally at position (2, 0): \n");
		System.out.println("Before: ");
		print2DArray(testFive);
		System.out.println("\nAfter: ");
		print2DArray(permeate(testFive, 2, 0));
		
	}
	
	/**
	 * This method prints out the 2D array row by row.
	 * Note: the rows printed have spaces at the end
	 * (5 points)
	 * @param matrix the 2D array to print out
	 *
	 */
	public static void print2DArray(int[][] matrix) {
		//Your code goes here
        int rLength = matrix.length;
        int cLength = matrix[0].length;
        int c = 0;
        int r = 0;
        for(c = 0; c < cLength; c++){
            for(r = 0; r < rLength; r++){
                System.out.print(matrix[c][r] + " ");
            }
            System.out.println();
        }
	}
	
	/**
	 * For the input String, store an instance of multiple, consecutive instances into
	 * a character array
	 * Example: storeDuplicates("CSC 116: Intro to Java Programming");
	 * returns ['1', 'm']; 
	 * (15 Points)
	 * @param str String to check for duplicates
	 * @return character array containing duplicates
	 */
	public static char[] storeDuplicates(String str) {
		//Your code goes here
        Scanner in = new Scanner(str);
        int c = 0;
        String strCheck = "";
        for(int i = 0; i < str.length(); i++){
            char chk;
            char prev;
            chk = str.charAt(i);
            prev = str.charAt(i-1);
            if(chk == prev){
                strCheck += chk;
                c++;
            }
        }
        char[] out = new char[c];
        for(int j = 0; j < strCheck.length(); j++){
            out[j] = strCheck.charAt(j);
        }
                
            
        
	    return out;
    
    }
	

	/** 
	 * This method increases the size of the array via multiplication based on the factor
	 * and retains the original contents inside
	 * (10 Points)
	 * @param list the array to increase
	 * @param factor the quantity to multiply the array by
	 * @return the array with increased capacity, containing the original contents
	 * @throws IllegalArgumentException if factor is 0 or a negative number
	 *
	 */
	public static int[] increaseArray(int[] list, int factor) {
		if(factor <= 0)
            throw new IllegalArgumentException();
        int[] bigArray = new int[list.length*2];
        for(int i = 0; i < list.length; i++){
            bigArray[i] = list[i];
        }
        return bigArray;
        
	}
	

	/**
	 * This method shifts the whole input array either left or right by a constant factor,
	 * which are all specified inputs.
	 * Direction = true --> Left
	 * Direction = false --> Right
	 * 
	 * Example: Shift array 2 to the left: shift([1, 2, 3], true, 2) returns [3, 1, 2] 
	 *		    Shift array 2 to the right: shift([1, 2, 3], false, 2) returns [2, 3, 1]
	 *
	 * Helpful Tip 1: One possible idea is that you can index and move elements in a circular 
	 * fashion around in an array using the mod operation. For example, for an array of 
	 * length 5, at index 4 (which is the last index), you perform 4 % 5 and you get 4, 
	 * which is the index at which to operate on. Since 4 is the last index, if we want to 
	 * wrap around back to index 0, we can increment 4 and perform (5 % 5) and retrieve 
	 * index 0, which is back to the beginning of the array.
	 *
	 * Helpful Tip 2: Another possible idea for one use case to utilize is storing the 
	 * first element elsewhere, shift the elements, then store that first element in the 
	 * last index, and repeat this process however many times.  
	 *
	 * (15 Points)
	 * @param list the array to shift
	 * @param direction left if true and right if false
	 * @param factor number of shifts that will occur
	 * @return the array shifted 
	 * @throws IllegalArgumentException if factor is negative
	 *
	 */
	public static int[] shift(int[] list, boolean direction, int factor) {
		if(factor < 0)
            throw new IllegalArgumentException();
        if(direction){
            for(int i = 0; i < factor; i++){
                int firstInt = list[0];
                int j;
                for(j = 0; j < list.length - 1; j++){
                    list[j] = list[j + 1];
                }
                list[j] = firstInt;
            }
        }else{
            for(int i = 0; i < factor; i++){
                int firstInt = list[list.length - 1];
                int j;
                for(j = list.length - 1; j > 0; j--){
                    list[j] = list[j - 1];
                }
                list[j] = firstInt;
            }
        }
        return list;
        
	}
	

	/**
	 * Given a matrix of any length and width and (x, y) pair, which contains 
	 * the number to use for permeation, we want to fill diagonally, vertically,
	 * and horizontally with that number located at (x, y).
	 * Example:   Given matrix below
	 * 			  1  1  1  1  1
	 *            2  2  4  2  2  
	 *  		  3  3  3  3  3
	 * 
	 * 			  where (1, 2) = 4
	 *
	 * Call: 	  permeate(matrix, 1, 2);
	 * Result:	  1  4  4  4  1
	 *  		  4  4  4  4  4
	 * 			  3  4  4  4  3
	 * (20 Points)
	 * 
	 * @param matrix the 2D array to manipulate
	 * @param x the row position of the integer to use for permeation
	 * @param y the column position of the integer to use for permeation
	 * @return 2D array with permeation applied
	 */
	public static int[][] permeate(int[][] matrix, int x, int y) {
		int location = matrix[x][y];
        for(int i = 0; i < matrix[0].length; i++){
            matrix[x][i] = location;
        }
        
        for(int i = 0; i < matrix.length; i++){
            matrix[i][y] = location;
        }
        return matrix;
	    //no idea how to do diagonal
    }
	



}
