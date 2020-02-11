import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in .nextInt();
        int y = in .nextInt();
        System.out.println(mystery(x, y));
    }
    public static int mystery(int x, int y) {
        while (x != 0 && y != 0) {
            if (x < y) {
                y -= x;
            } else {
                x -= y;
            }
        }
        return x + y;
    }
}