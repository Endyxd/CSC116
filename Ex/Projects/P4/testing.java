import java.util.Scanner;
import java.io.*;
public class testing{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner (System.in);
        String input = in.next();
        Scanner inputScanner = ImageEditor.getInputScanner(input);
        //String ah = inputScanner.next();
        //this will work for the main method
        if(inputScanner == null)
        System.out.println("no");
        PrintStream output = new PrintStream(new File("output.ppm"));
        System.out.print("r: ");
        int redChange = in.nextInt();
        System.out.print("g: " );
        int greenChange = in.nextInt();
        System.out.print("b: " );
        int blueChange = in.nextInt();
        ImageEditor.changeIntensity(inputScanner, output, redChange, greenChange, blueChange);
    }
}