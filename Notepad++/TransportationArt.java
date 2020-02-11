import java.util.Scanner;
public class TransportationArt{
	
	
	// prereq input nuber to determine the length of the plane
	//output the body of the plane
	public static void body(int num){
		
		
		for(int i=0; i < num; i++){
			System.out.println("                       | ----- |");
			
			
		}	
	}
	// There is no prereq for this, it is only a simple printing method.
	public static void wings(){
			System.out.println("           ------------         ------------");
			System.out.println("          /                                 \\");
			System.out.println("         /-----------------------------------\\");
			System.out.println("        /                                     \\");
			System.out.println("       /---------------------------------------\\");
			System.out.println("      /-----------------------------------------\\");
			System.out.println("     (-----------------          ----------------)");
			
	}
	
	
	public static void main(String[] args){
		System.out.println("A I R P L A N E");
		
		
		
		
		
		
		
		
		
		 
		TransportationArt TA = new TransportationArt();
		Scanner in = new Scanner(System.in);
			

		int longboye;
		System.out.print("Hey uh.... how long do you want the plane?: ");
		
		longboye = in.nextInt();
		in.close();
			// This is the initial point of the airplane that prints before the rest of the program starts
			System.out.println("                           ^     ");
			System.out.println("                         / U \\   ");
			System.out.println("                        /     \\   ");
		//These methods call upon either the wings or the body
		//Prereq - a user input number to determint how long the plane will be
		TA.body(longboye);
		TA.wings();
		TA.body(longboye);
		 //This is the final part of the plane that prints after all the other methods
			System.out.println("                 ---\\  /--------\\  /---");
			System.out.println("                  ---\\/          \\/---");
	}
	
	
	
	
	
	
}