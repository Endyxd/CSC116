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
public class Mathematics {
    /**
     * Starts the program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Volume of the torus with radii 12.5 and 4.6: " + torusV(12.5, 4.6));
        System.out.println("\nArea of the trapezoid with: a=4.5, b=2.1, h=7.9: " + 
                           trapArea(4.5, 2.1, 7.9));
        System.out.println("\nThe number of gallon jugs required to hold 243.283 pints: " + 
                           numGallons(243.283));
        System.out.println("\nThe median of 19, 34, and 25: " + median(19, 34, 25));
        System.out.println("\nWhat is 6 plus 2?");
        System.out.println(add2Report(6));
    }
    
    /**
     * Calculates the volume of a torus with the given major and minor radii
     * @param major the major radius
     * @param minor the minor radius
     * @return the volume of the torus with the given radii
     */
    //The volume of a torus is calculated as follows
    //TODO: write a method called torusV with two double parameters, major and minor.
    //(PI * minor^2)(2PI * major)
    //Be aware that copy/pasting this expression will not work.
    //Your task for this method is to create a constant for PI with the value 3.14
    //Your answers won't be as accurate as a longer value for pi, but that's okay. The point of
    //this is to evaluate your ability to create constants to avoid magic numbers
    //This method must return a double.
    public static double torusV(double major, double minor){
        double pi = 3.14;
        double majorv;
        double minorv;
        double finval;
        majorv = (2*pi*major);
        minorv = (pi* Math.pow(minor,2));
        finval = majorv * minorv;
        return finval;
    
    
    }
    
    /**
     * Calculates the area of the trapezoid with the given dimensions
     * @param a the length of one of the parallel sides
     * @param b the length of the other parallel side
     * @param h the distance between the parallel sides
     */
    //TODO: write a method called trapArea which takes three double parameters: a, b, and h
    //Return the area of the trapezoid with these dimensions
    //This method must return a double.
    
    public static double trapArea(double a, double b, double h){
        double area;
        area = ((a+b)/2)*h;
        return area;
        
    }
    
    
    
    /**
     * Calculates the number of gallon jugs which are required to hold the given number of pints
     * @param pints the number of pints to be divided into gallon jugs
     * @return the number of gallon jugs required to hold the given number of pints
     */
    //TODO: write a method called numGallons which takes one double parameter: pints and returns
    //the number of gallon jugs required to hold this number of pints
    //Hint: Use the method, Math.ceil()
    //This method must return an integer.
    
    public static int numGallons(double pints){
        double gal;
        gal = pints/8;
        gal = Math.ceil(gal);
        return (int)gal;
        
    }
    
    
    
    /**
     * Calculates the median value of the three given integers
     * @param n1 the first integer
     * @param n2 the second integer
     * @param n3 the third integer
     * @return the median (middle) value of the three integers
     */
    //TODO: Write a method called median which takes three integer parameters: n1, n2, and n3
    //and returns the median value
    //Hint: Use the methods, Math.min() and Math.max()
    //This method must return an integer.
    public static int median(int n1, int n2, int n3){
	   int returnval;
	   int sum = n1 + n2 + n3;
	   
	   
	   returnval = sum - Math.max(n1, Math.max(n2, n3)) - Math.min(n1, Math.min(n2, n3));
	   return returnval;
	   
        
    }
    
    
    /**
     * Calculates and reports the value two more than the given integer
     * @param n an integer
     * @return the String: Your value plus two is (n + 2)
     */
    //TODO: Write a method called add2Report wich takes one integer parameter, n and returns
    //"Your value plus two is " concatenated with n + 2
    //Store "Your value plus two is " in a String variable called s
    //Return s concatenated with n + 2
    //For example, if the value -5 was passed in as a parameter, this method would return:
    //"Your value plus two is -3"
    //This method must return a String.
    public static String add2Report(int n){
        int returnval;
        String Str = "Your value plus 2 is: ";
        returnval = n +2;
        return (Str + returnval);
    }
    
    
    
}