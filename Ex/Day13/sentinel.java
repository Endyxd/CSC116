import java.util.Scanner;
public class sentinel{
    public static int sumVal(int input){
        if(input == -1)
            return -1;
        else 
            return input;
        
    }
    
    public static void main(String[] args){
        int input;   
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int output;
        System.out.print("Enter in a num or -1 to quit: ");
        input = in.nextInt();
        if(input != -1)
            sum = input;
        while(input != -1){
            System.out.print("Enter in a num or -1 to quit: ");
            input = in.nextInt();
            output = sumVal(input);
            if(output != -1){
               sum += output;
               //System.out.println(sum);
           }
            else
                input = -1;
        }
        System.out.println("The sum of all numbers are: " + sum);
        
    }

}
