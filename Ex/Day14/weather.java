/**
 * This program is used to find the highest point of weather in each respected season
 * @author Nicholas Loftin nlloftin@ncsu.edu
 * Version 1.1
 */
import java.util.*;
import java.io.*;
public class weather {
    public static int RAINS_WINTER = 0;
    public static int RAINS_SPRING = 0;
    public static int RAINS_FALL = 0;
    public static int RAINS_SUMMER = 0;
    public static int raintest = 0;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("RaleighWeather2010.txt"));
        double temp = 0;
        int cnt = 0;
        input.nextLine();
        double winterMax = -500;
        double springMax = -500;
        double summerMax = -500;
        double fallMax = -500;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineParser = new Scanner(line);
            String date = lineParser.next();
            String month = date.substring(4, 6);
            lineParser.next();
            Double val = Double.valueOf(lineParser.next());
            if (month.equals("12") || month.equals("01") || month.equals("02")) {
                winterMax = Math.max(winterMax, val);
                rainDays(lineParser, month);
            }
            //System.out.println(winterMax);
            if (month.equals("06") || month.equals("07") || month.equals("08")) {
                summerMax = Math.max(summerMax, val);
                rainDays(lineParser, month);
            }
            if (month.equals("03") || month.equals("04") || month.equals("05")) {
                springMax = Math.max(springMax, val);
                rainDays(lineParser, month);
            }
            if (month.equals("09") || month.equals("10") || month.equals("11")) {
                fallMax = Math.max(fallMax, val);
                rainDays(lineParser, month);
            }
        }
        System.out.println("The max for winter was: " + winterMax);
        System.out.println("The max for spring was: " + springMax);
        System.out.println("The max for summer was: " + summerMax);
        System.out.println("The max for fall was: " + fallMax);
        System.out.println("The ammount of times it rained for winter was " + RAINS_WINTER);
        System.out.println("The ammount of times it rained for spring was: " + RAINS_SPRING);
        System.out.println("The ammount of times it rained for summer was: " + RAINS_SUMMER);
        System.out.println("The ammount of times it rained for fall was: " + RAINS_FALL);
        //System.out.println(raintest);
    }
    
    public static void rainDays(Scanner input, String month) throws FileNotFoundException{
        input.next();
        String rain = input.next();
        rain = rain.substring(1, 2);
        if(rain.equals("1")){
        //raintest++;
        if (month.equals("12") || month.equals("01") || month.equals("02")) {
                RAINS_WINTER++;
            }
            //System.out.println(winterMax);
        if (month.equals("06") || month.equals("07") || month.equals("08")) {
                RAINS_SUMMER++;
            }
        if (month.equals("03") || month.equals("04") || month.equals("05")) {
                RAINS_SPRING++;
            }
        if (month.equals("09") || month.equals("10") || month.equals("11")) {
                RAINS_FALL++;
            }
        }
        
    }
    
    
    
}