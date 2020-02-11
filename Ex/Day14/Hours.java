import java.io.*;
import java.util.*;
public class Hours{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("hours.txt"));
        while(input.hasNextLine()){
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);
            int id = lineScan.nextInt();
            String name = lineScan.next();
            double sum = 0.0;
            int count = 0;
            while (lineScan.hasNextDouble()){
                sum = sum + lineScan.nextDouble();
                count++;
            }
            double average = sum/count;
            System.out.println(name + " " + id + " " + sum + " " + average);
        }
    }
}