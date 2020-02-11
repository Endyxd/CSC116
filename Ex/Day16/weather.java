import java.util.*;

public class weather{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in the number of days you want to have: ");
        int numDays = in.nextInt();
        double average = 0;
        double[] weather = new double[numDays];
        for(int i = 0; i < numDays; i++){
            System.out.print("Enter the temp for day " + (i + 1) + ": ");
            weather[i] = in.nextDouble();
            average += weather[i];

        }
        average = average/numDays;
        int count = 0;
        for(int i = 0; i < numDays; i++){
            double check = weather[i];
            if (check > average)
                count++;
        }
        System.out.println("The average was: " + average);
        System.out.println("The number of days that were above average was: " + count);
    }
}