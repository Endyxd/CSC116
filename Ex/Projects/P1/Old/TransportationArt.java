import java.util.Scanner;
public class TransportationArt{
	
	
	
	public static void body(int num){
		
		
		for(int i=0; i < num; i++){
			System.out.println("                       | ----- |");
			
			
		}	
	}
	
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
			System.out.println("                           ^     ");
			System.out.println("                         / U \\   ");
			System.out.println("                        /     \\   ");
		TA.body(longboye);
		TA.wings();
		TA.body(longboye);
		    System.out.println("                 ---\\  /--------\\  /---");
			System.out.println("                  ---\\/          \\/---");
	}
	
	
	
	
	
	
}