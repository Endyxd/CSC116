import java.util.Scanner;


public class FirstFiveMult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find the multiple: ");
        int input;
        input = in .nextInt();
        for (int i = 1; i <= 5; i++) {
            System.out.print(input * i);
            if (i != 5)
                System.out.print(", ");
        }

    }
}