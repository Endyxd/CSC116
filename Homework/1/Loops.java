/**
 * Add all the missing methods from this program. Leave the javadoc but feel free to replace the
 * single-line comments. The main method has tests, which if your program is correctly implemented,
 * will match the sample output in the program description. 
 *
 * Note that your methods will be tested for values other than what is present here, so simply 
 * matching the output here is not enough.
 *
 * Since these methods will be tested, they need to exactly match the description included.
 * Specifically, they must:
 * Be public
 * Have the same name as specified in the comments
 * Have the same parameters, with the same types, in the same order as in the comments
 *
 * Feel free to add additional tests to main.
 * @author Spencer Yoder
 * @author Your Name Here
 */
public class Loops {
    /**
     * Starts the program
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("I want to print 'I love dogs' 6 times:");
        repeat("I love dogs", 6);
        System.out.println("\n3 to the 5th power: " + power(3, 5));
        System.out.println("\nNearest power of 2 >= 34: " + nearestPower(34));
        System.out.println("\nMultiplication table up to 10:");
        multTable(10);
        System.out.println("\nSquare of size 1:");
        printSquare(1);
        System.out.println("\nSquare of size 5:");
        printSquare(5);
    }
    
	public static void repeat(String s, int a){
			for(int i = 0; i<a; i++){
					System.out.println(s);
			}
		
		
		
		
	}
    /**
     * Takes a String, s and an integer, num and prints s num times
     * @param s a String to print multiple times
     * @param num the number of times s gets printed
     */
    //TODO: Write a method, called repeat, which takes two parameters, s and num, and prints s
    //num times. Assume positive input for num. s is a String and num is an integer.
    
    /**
     * Takes two integer parameters, x and y, and returns x raised to the power y
     * @param x the base
     * @param y the exponent
     * @return x raised to the power y
     */
    //TODO: Write a method, called power, which takes two parameters, x and y (both integers)
    //and returns x to the yth power. 
    //you CANNOT use the Math class for this problem. (You can't use any class which will alleviate
    //your need to write a for loop either, smartypants)
    //This should be a calculation you make by using loops.
 //   public static 
	public static int power(int x, int y){
			int xorigin = x;
			for(int i = 1; i < y; i++){
				x = x * xorigin;
            }
			return x;
	}
	
	
	
    /**
     * Takes one integer parameter, n, and returns the nearest power of 2 greater than or equal to
     * n (for example, if n is 13, this method returns 16)
     * @param n a positive integer
     * @return the nearest power of 2 greater than or equal to n     
     */
    //TODO: Write a method, called nearestPower, which takes one integer parameter, n, and
    //uses a for loop to calculate the largest power of 2 greater than or equal to n
    //The same rules about the Math class and other external classes applies here
    public static int nearestPower(int n){
		//use this to find a way to make 2 greater than whatever n is.
		int initial = 2;
		//int nval = n;
		int pow = 1;
		int check;
		int fin = 1;
		for(check=initial; check<n; check*=initial){
			
			pow++;
		}

		for(int i = 1; i <= pow; i++){
		    fin = initial * fin;
		}
		return fin;
	}	
	
	
    /**
     * Takes one integer parameter, max and prints out a multiplication table from 1 up to max
     * @param max, the upper bound of the multiplication table
     */
    //TODO: Write a method, called multTable, which uses nested for loops to print a multiplication
    //table for the numbers 1 through max (inclusive)
    //You can assume positive input for max. Look at the homework 1 assignment file for an example
    //multiplication table where max is 10.
    public static void multTable(int max){
		int answ;
		for(int row = 1; row<= max; row++){
			
			for(int column = 1; column <= 10; column++){
				answ = column*row;
				System.out.printf("%3d", answ);
			
			}
	 	System.out.println("");
		}
		
	}
	
	
    /**
     * Takes one integer parameter, size, and prints out a size x size square with a border
     * of hyphens and pipes. The corners will be plus signs. (See sample output).
     * @param size the size of the square inside the border
     */
    //TODO: Write a method, called printSquare, which uses nested for loops to print a square with
    //a border. This takes one integer parameter, size
    //Check the sample output for an example of this.
    //Assume a positive integer will be passed in for size
    //Hints: this will require System.out.print() statements and there will be statements outside of
    //the body of the inner for loop.
	
	public static void printSquare(int size){
		String plus = "+";
		String min = "__";
		String bar = "|";
		int height = 0;
		int length = 0;
		System.out.print(plus);
		
			for(height=height; height < size; height++){
				for(length = length; length < size; length++){
					System.out.print(min);		
				}
				if (length==size){
					System.out.println(plus);
					length=20;
				}
				System.out.print(bar);
				for(int space = 0; space < (size*2); space++)
				System.out.print(" ");
				System.out.println(bar);
				

			}
			System.out.print(plus);
			for(length = 0; length < size; length++){
				System.out.print(min);	

				
			}
			System.out.print(plus);
		
		    System.out.println("");
		
	}
	
	
	
	
}


