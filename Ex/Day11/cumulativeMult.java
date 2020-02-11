import java.util.Scanner;

public class cumulativeMult {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in 10 numbers to be multiplied together: ");
        double input;
        double total = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter in number " + i + ": ");
            input = in .nextDouble();
            total = total * input;

        }
        System.out.println("The final value was: " + total);


    }





}