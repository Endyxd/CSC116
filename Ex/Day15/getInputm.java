import java.io.*;
import java.util.*;

public class getInputm{
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
   }
}