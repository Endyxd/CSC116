import java.util.*;
import java.io.*;

public class message {
    public static void main(String[] args) {
        System.out.println("When asked for a filename, for the message, input day15message.txt");
        Scanner console = new Scanner(System.in);
        Scanner in = getInputm.getInput(console);
        System.out.print("output file name? ");
        String filename = console.next();
        File f = new File(filename);
        PrintStream out = null;
        if (!f.exists()) {
            try {
                out = new PrintStream(f);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
            while ( in .hasNextLine()) {
                String line = in .nextLine();
                //String dashLine = whatIsOnTheLine(line);
                out.println(line);
            } in .close(); // Close the Scanner
            out.close(); // Close the PrintStream
        } else {
            System.out.println("File already exists!");
        }
    }


}