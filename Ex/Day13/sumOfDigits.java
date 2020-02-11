import java.util.Scanner;
public class sumOfDigits{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double digit;
        int num = 0;
        int sum = 0;
        int c = 1;
        System.out.print("Enter the number you want to add the digits of: ");
        num = in.nextInt();
        do{
            sum = sum+num%10;
            num = num/10;
            
        }while (num > 0);
        System.out.println("Your output is: " + sum);
    
    }

}
