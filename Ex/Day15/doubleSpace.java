import java.util.*;
import java.io.*;

public class doubleSpace {
    public static void main(String[] args)
                    throws FileNotFoundException{
        PrintStream output = new PrintStream(new File("spaces.txt"));
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a file to double space: ");
        Scanner input = null;
        while(input == null){
            String inputName = console.nextLine();
            try{
                input = new Scanner(new File(inputName));
            }
            catch (FileNotFoundException e){
                System.out.print("Input a valid file name: ");
            }
        }
        //Scanner input = new Scanner(new File(inputName));
        String line = "";
        while(input.hasNextLine()){
            line = input.nextLine();
            output.println(line);
            output.println("");
        }
        
        




}
}