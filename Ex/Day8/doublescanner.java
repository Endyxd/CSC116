import java.util.Scanner;
public class doublescanner{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input;
        System.out.print("Enter a number to be doubled: ");
        input = in.nextInt();
        int output;
        
        output = multiplication(input);
        
        System.out.println("Your output is: " + output);
        
    
    
    
    
    }
    
    public static int multiplication(int in){
        return(2*in);
    
    }









}
