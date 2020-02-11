import java.util.*;
import java.io.*;

public class spacesToDashes{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
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
        
    }
}