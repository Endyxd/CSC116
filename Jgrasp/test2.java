import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        System.out.println("Final: " + medianOf3(n1, n2, n3));
    }
    public static int medianOf3(int n1, int n2, int n3) {
        if (n1 < n2) {
            System.out.println("1");
            if (n2 < n3) {
            System.out.println("2");
                return n2;
            } else {
            System.out.println("3");
                return n3;
            }
        } else {
            System.out.println("4");
            if (n1 < n3) {
            System.out.println("5");
                return n1;
            } else {
            System.out.println("6");
                return n3;
            }
        }
    }
}