import java.util.*;
import java.io.*;
public class sumDoubles{
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner in = new Scanner(new File("numbers2.txt"));
        double sum = 0;
        while(in.hasNextDouble()){
            double fileInput = in.nextDouble();
            System.out.println("Number = " + fileInput);
            sum += fileInput;
        }    
        System.out.println("The total sum was: " + sum);
    }
}
