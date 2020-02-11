import java.util.*;
import java.io.*;
public class ParseFile{
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner in = new Scanner(new File("numbers2.txt"));
        String wordsInFile = "";
        double sum = 0;
        double fileInput = 0;
        String stringOutput = "";
        while(in.hasNext()){
            if(in.hasNextDouble()){
                fileInput = in.nextDouble();
//              System.out.println("Number = " + fileInput);
                sum += fileInput;
            }else if(in.hasNext()){
                wordsInFile = in.next();
                stringOutput += wordsInFile + " ";
            }
            
        }    
        System.out.println("The total sum was: " + sum);
        System.out.println("The full string was: " + stringOutput);
    }
}
