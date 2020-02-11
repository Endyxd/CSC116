/**
* This is a sample class for swapping two integer values.
*	@author Nicholas Loftin (nlloftin@ncsu.edu)
*	Version 1 :)
**/	
public class Swap{

public static void main(String[] args){
    int first;
    int second;
    first = 5;
    second = 6;
	System.out.println("Initial value for first, " + first);
	System.out.println("Initial value for second, " + second);
    
    int swap = first;
    first = second;
    second = swap;
	System.out.println("Now the values are: " + first);
	System.out.println("And the second value is: " + second);
    
}


}

