import java.io.*;
import java.util.*;

public class ioConsole{
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int sum = 0;
        int inp = input.nextInt();
        while(inp != -1){
            sum = sum+inp;
            inp = input.nextInt();
        }
        System.out.print(sum);
    }
}