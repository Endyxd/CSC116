import java.util.Scanner;
public class numberDetector{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to see weather or not it is even or odd: ");
        
        int input;
        input = in.nextInt();
        int check = input%2;
        if(check == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    
    
    
    }


}
