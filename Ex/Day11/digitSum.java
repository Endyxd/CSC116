import java.util.Scanner;

public class digitSum{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int input;
      int num;
      int sum = 0;
      System.out.print("Enter a number to sum up the digits: ");
      input = in.nextInt();
      
      while(input!= 0){
         num = input%10;
         sum = sum + num;
         input = input/10;        
      }
   
      System.out.println("Your output is: " + sum);
   
   }


}