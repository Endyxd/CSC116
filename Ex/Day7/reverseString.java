/*
* This is a program to reverse any string given by the user
* @ nlloftin@ncsu.edu
* Version 1
*/
import java.util.Scanner;
public class reverseString{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int inputval;
		String inputString = " ";
		System.out.print("Hello, please enter a string to reverse: ");
		inputString = in.nextLine();
		inputval = inputString.length();
		System.out.print("Here is your output: |   ");
			for(int i = inputval-1; i >= 0; i--){
				System.out.print(inputString.charAt(i));
				
			
			}
		System.out.println(" ");
		
		
		
		
	}
	
	
	
}