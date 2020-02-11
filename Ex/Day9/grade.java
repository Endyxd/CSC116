import java.util.Scanner;
public class grade{
    
    public static void passDetector(double grade){
        if(grade >= 70)
            System.out.println("You have passed!");
        else
            System.out.println("You have failed!");
    
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double input;
        System.out.print("Enter what your grade was (this can be a decimal): ");
        input = in.nextDouble();
        if(input >= 90){
            System.out.println("Your grade was an A");
            passDetector(input);
        }else if(input >= 80 && input<90){
            System.out.println("Your grade was a B");
            passDetector(input);
        }else if(input >= 70 && input<80){
            System.out.println("Your grade was a C");
            passDetector(input);
        }else if(input >= 60 && input<80){
            System.out.println("Your grade was a D");
            passDetector(input);
        }else if(input < 60){
            System.out.println("Your grade was an F");
            passDetector(input);
        }
        
            


}
}