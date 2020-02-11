import java.util.Scanner;
import java.io.*;
public class hourlyWork{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("hours.txt"));
        double hours = 0;
        String names = "";
        int IDNum = 0;
        while(in.hasNextLine()){
            System.out.println(hours);
            System.out.println(names);
            System.out.println(IDNum);
            if(in.hasNext()){
                names = in.next();
                 
            }while (in.hasNextDouble()){
                hours += in.nextDouble();
            }
                    System.out.print(names);
                   System.out.print("(ID#: " + IDNum + ") ");
                   System.out.println("worked for " + hours);
       
        }
    }


}