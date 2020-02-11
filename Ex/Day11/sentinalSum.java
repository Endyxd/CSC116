import java.util.Scanner;

public class sentinalSum{
    public static void main(String[] args){
        int sum=0;
        int quitval = -1;
        int input=0;
        Scanner in = new Scanner(System.in);
        
        while(input!=-1){
            System.out.print("Enter a number(-1 to quit): ");
            sum+= input;
            input = in.nextInt();
        }
        System.out.println("The sum is: " + sum);
    
    }





}