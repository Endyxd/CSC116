import java.util.Scanner;
public class position{
	
	public static int input(){
		System.out.print("Enter in the time from 1-4: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		if (in>4){
			System.out.println("Okay I am just going to assume you meant 4");
			in = 4;
		}
		if (in<1){
			System.out.println("Okay I am going to assume you meant 1");
			in = 1;
		}
		return in;
		
	}
	
	
	
	public static void main(String[] args){
		int a = -32;
		int v = 48;
		int s = 0;
		double fin;
		int t;
		t = input();
		//System.out.println(t);
		fin = (s + (v*t)+(1/2)*(a)*(Math.pow(t,2)));
		System.out.println("The number gotten out of this was: " + fin);
		System.out.println("Restart to try another number :)");
		
		
		
		
		
		
		
		
		
	}






}