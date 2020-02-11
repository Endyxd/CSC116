import java.util.*;
public class StatisticsCalculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numberOfValues = 0;
        int inputVal = 0;
        int sum = 0;
        double average = 0;
        System.out.print("How many values?: ");
        numberOfValues = in.nextInt();
        int[] arr = new int[numberOfValues];
        for(int i = 0; i < numberOfValues; i++){
            //System.out.println(i);
            System.out.print("Enter Value " + (i+1) + ": ");
            inputVal = in.nextInt();
            arr[i] = inputVal;
        }
        for(int i = 0; i < numberOfValues; i++){
            sum += arr[i];
        }
        
        average = (double)sum/numberOfValues;
        System.out.println("Average: " + average);
        double seriesNum = series(arr, average, numberOfValues);
        //System.out.println(seriesNum);
        double sigma = Math.sqrt(seriesNum/(numberOfValues-1));
        System.out.printf("Standard Deviation: %.2f", sigma);
    
    }
    public static double series(int[] arr, double average, int numberOfValues){
        double seriesNum = 0;
        for(int i = 0; i < numberOfValues; i++){
            seriesNum +=  Math.pow((arr[i] - average), 2);
            //System.out.println(Math.pow((arr[i] - average), 2));
        }
        return seriesNum;
    }
    
}