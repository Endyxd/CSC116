import java.util.*;
import java.io.*;
public class q8 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("readme.txt"));
        int count = 0;
        while (input.hasNextLine()) {
            System.out.println("input: " + input.nextLine());
            count++;
        }
        System.out.println(count + " total");
    }
}