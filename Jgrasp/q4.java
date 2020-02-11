import java.util.*;
public class q4{
    public static void main(String[] args){
        String input = "";
        String inputCheck;
        int inputNum = 0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("This is my message hah");
            System.out.print("Do you want to read it again? Type n or N to quit: ");
            input = in.next();
            inputCheck = input.toLowerCase();
            inputNum = inputCheck.charAt(0);
        }while(inputNum != 110);
    }
}