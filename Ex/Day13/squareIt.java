import java.util.Scanner;
public class squareIt{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = -1;
        System.out.print("Type a non negative number: ");
        input = in.nextInt();
        while(input < 0){
            System.out.print("Invalid number try again: ");
            input = in.nextInt();
        
        
        }
        
        double square = Math.pow(input, 2);
        System.out.println("Your output for the square of your input is " + square);
        
        
        
        
    }


}
