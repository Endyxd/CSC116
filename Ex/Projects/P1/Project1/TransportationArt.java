/*
* This is a program to draw an ascii plane with the size changing on the user input
* @ nlloftin@ncsu.edu
*Version 1
*/
import java.util.Scanner;
public class TransportationArt{
	
	
	// This method is used to draw the body of the airplane.
	public static void body(int num){
		
		//The for loop will change depending on the size of the integer used in the input
		for(int i=0; i < num; i++){
			System.out.println("                       | ----- |");
			
			
		}	
	}
	
	// This method is only used to clear up the main method a little bit, while printing the wings in a seperate method.
	public static void wings(){
			System.out.println("           ------------         ------------");
			System.out.println("          /                                 \\");
			System.out.println("         /-----------------------------------\\");
			System.out.println("        /                                     \\");
			System.out.println("       /---------------------------------------\\");
			System.out.println("      /-----------------------------------------\\");
			System.out.println("     (-----------------          ----------------)");
			
	}
	
	//Main method
	public static void main(String[] args){
		System.out.println("A I R P L A N E"); //hah
		TransportationArt TA = new TransportationArt();
		Scanner in = new Scanner(System.in); //declaring scanner
			
		// int used for the input
		int longboye;
		System.out.print("Hey uh.... how long do you want the plane?: ");
		
		
		longboye = in.nextInt();
		in.close();
			System.out.println("                           ^     ");
			System.out.println("                         / U \\   ");
			System.out.println("                        /     \\   ");
		TA.body(longboye); // calling body method with the input integer
		TA.wings(); //Calling wing method
		TA.body(longboye); // calling the body method again for the rear of the plane
		//This is the tail end of the plane
		    System.out.println("                 ---\\  /--------\\  /---");
			System.out.println("                  ---\\/          \\/---");
	}
	
	
	
	
	
	
}