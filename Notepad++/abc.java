import java.util.Scanner;
/**
* This is a program to do certain math equations the ammount of times that the user desires
* Nicholas Loftin @ nlloftin@ncsu.edu
*Version 1 
*:3
**/

public class abc{
	public static void main(String[] args){
		int a = 5;
		int b = 10;
		int c = b;
		int input;
		System.out.println("I felt that this is a bit too easy, so I wanted to add some dumb stuff to make it a bit harder since I have nothing else to do");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("The following equations will happen, enter in the ammount of times you wish to run through them: ");
		System.out.println("a = a + 1, b = b -1, c = c + a");
		System.out.println("a = 5, b = 10, c = b");
		System.out.print("Enter in the ammount of times now: ");
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		in.close();
		for(int i = 1; i < input; i++){
			a = a + 1;
			b = b - 1;
			c = c + a;
			System.out.print(" a: " + a + " b: " + b + " c: " + c);					
			
			
		}
		System.out.println(" ");
		System.out.println("The final numbers are: " + " a: " + a + " b: " + b + " c: " + c);
		
		
	}
	
}