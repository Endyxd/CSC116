import java.util.Scanner;
public class garbage{
public static void main(String[] args){
       
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number (or -1 to stop): ");
        int input;
        input = in.nextInt();
        int max = -1;
        int min = -1;
        if(input != -1){
            min = input;
            max = input;
        }
        while(input != -1){
            System.out.print("Type a number (or -1 to stop): ");
            input = in.nextInt();
                if(input != -1){
                max = Math.max(max, input);
                min = Math.min(min, input);
                }
        }
        System.out.println("Your max num was: " + max);
        System.out.println("Your min num was: " + min);
}
}