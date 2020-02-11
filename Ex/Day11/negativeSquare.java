import java.util.Scanner;

public class negativeSquare{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input;
        double output;
        System.out.print("Type a non-negative integer: ");
        input = in.nextInt();
        while(input <= 0){
            System.out.print("Invalid input, please try again: ");
            input=in.nextInt();
        }
        output = Math.pow(input, 2);
        System.out.println(input + " squared is: " + output);
    
    }


}