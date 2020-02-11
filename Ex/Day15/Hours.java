import java.io.*;
import java.util.*;

public class Hours{
     
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        Scanner input = getInput(console);
        while(input.hasNextLine()){
            String line = input.nextLine();
            processLine(line);        
        }
    }

    public static Scanner getInput(Scanner console){
        Scanner input = null;
        System.out.print("Input a valid file name: ");
        while(input == null){
            String fileName = console.next();
            try{
                input = new Scanner(new File(fileName));
            }
            catch (FileNotFoundException e){
                System.out.print("Input a valid file name: ");
            }
        }
        return input;
        /**
        do{
            String fileName = console.nextLine();
            File inputFile = new File(fileName);
            Scanner input = new Scanner(inputFile);
        }while(!inputFile.exists());
        */
    }
    public static void processLine(String line){
        Scanner in = new Scanner(line);
        int idNum = 0;
        double hoursTotal = 0;
        double hoursAverage = 0;
        String name = "";
        idNum = in.nextInt();
        name = in.next();
        int count = 0;
        while(in.hasNext()){
            hoursTotal += in.nextDouble();
            count++;
        }
        hoursAverage = hoursTotal / count;
        //System.out.print(name + " ");
        //System.out.print("ID: " + idNum);
        //System.out.print(" Hours Total: " + hoursTotal);
        //System.out.print(" Hours Average: " + hoursAverage);
        //System.out.println(" ");
        System.out.printf("%s (ID#%d) worked %.2f hours (%.2f hours/day)", name, idNum, hoursTotal, hoursAverage);
        System.out.println("");
    }

}