import java.io.*;

public class messageday15 {
    public static void main(String[] args){
        try{
            PrintStream output = new PrintStream(new File("message.txt"));
            
            output.println("Testing,");
            output.println("1, 2, 3!");
            output.println("");
            output.println("This is my output file");
            
            }catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
    }

}