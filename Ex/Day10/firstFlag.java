/*
* This program is to take 10 inputs from the user, and return true if any of them are divisible by five
* author Nicholas Loftin nlloftin@ncsu.edu
* Version 1
*/
import java.util.Scanner;
public class firstFlag{
    
    public static boolean check;
    public static boolean answer = false;
    public static boolean flagger(int input){
        if(input%5==0)
            return true;
        else
            return false;
    
    }
    
    public static void main(String[] args){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in 10 numbers: ");
        for(int i = 1; i<10; i ++){
            System.out.print(i + ": ");
            input = in.nextInt();
            check = flagger(input);
            if(check == true)
                answer = true;
            
            }
            System.out.println("This is " + answer);
    
    }


}