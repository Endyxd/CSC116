import java.util.Scanner;


public class calc{
	//Declaring the variables
	/**int in1;
	int in2;
	int sign;
	**/
	float answer;
	// cut and paste... ignore
	
	//prereq 2 inputs to add
	//output the answer to the equation
	public float addition(int inp1, int inp2){
		this.answer = inp1 + inp2;
		return (this.answer);
	}
	
	//prereq2 inputs to subtract
	//output the answer to the equation
	public float subtraction(int inp1, int inp2){
		this.answer = inp1 - inp2;
		return (this.answer);
	}
	
	public float multiplication(int inp1, int inp2){
		this.answer =  ((float)inp1 * (float)inp2);
		return (this.answer);
	}
	
	public float divide(int inp1, int inp2){
	
		this.answer = ((float)inp1/(float)inp2);
		return (this.answer);
	
		
		
	}
	
	
	
	
	
	
	
	
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int in1;
	int in2;
	int sign;
	
	
	//declaring the new calculator
	calc cal = new calc();
	
	
	System.out.println("Enter in the first number you would like to use on the calc: ");
	System.out.print("Please only use ints: ");
	
	in1 = input.nextInt();
	
	System.out.print("Now enter in the second number you want to use with the calc: ");
	
	in2 = input.nextInt();
	
	System.out.println("Now it is time to chose +, -, *, /");
	System.out.print("To chose enter in the number from 1-4 respectively: ");
	sign = input.nextInt();
	input.close();
	// 
	if(sign == 1){
		System.out.println("The answer gotten was: " + cal.addition(in1, in2));

	}else if(sign == 2){
		System.out.println("The answer gotten was: " + cal.subtraction(in1, in2));

	}else if(sign == 3){
		System.out.println("The answer gotten was: " + cal.multiplication(in1, in2));

	}else if(sign == 4){
		System.out.println("The answer gotten was: " + cal.divide(in1, in2)); 

	}else
		System.out.println("Error, restart program");
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}