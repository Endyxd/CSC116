import java.util.Scanner;
public class numberDetector2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to see weather or not it is between 10 and 20: ");
        
        int input;
        input = in.nextInt();
        //int check = input%2;
        if(input > 20 || input <10)
            System.out.println("Not within range");
        else
            System.out.println("Within range");
    
    
    
    }


}
