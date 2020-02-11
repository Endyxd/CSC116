import java.util.*;
import java.io.*;
public class weatherbutOnlyWinter{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("RaleighWeather2010.txt"));
        double temp = 0;
        int cnt = 0;
        input.nextLine();
        while(input.hasNextLine()){
            String line = input.nextLine();
            Scanner lineParser = new Scanner(line);
            String date = lineParser.next();
            String month = date.substring(4, 6);
            if(month.equals("12") || month.equals("01") || month.equals("02")){
                temp = temp+lineParser.nextDouble();
                cnt++;
            }
            
        }
        System.out.println(temp/cnt);
    }
}