import java.util.Scanner;
public class reverseOrder{
    public static void processName(String input){
        int i = 0;
        String firstName;
        String lastName;
        while(input.charAt(i) != ' '){
            i++;
        }
        firstName = input.substring(0,i);
        lastName = input.substring(i, input.length());
        lastName = lastName.trim();
        System.out.println(lastName + " " + firstName);
        
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input;
        System.out.print("Enter your first and last name: ");
        input = in.nextLine();
        processName(input);
    
    }


}