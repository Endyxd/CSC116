import java.util.*;
public class shit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String string = in.next();
        int letter = string.charAt(0);
        System.out.println(letter);
if(letter >= 65 && letter <= 90)
	System.out.println("This starts with a capital");
else
	System.out.println("This does not start with a capital");

    }
}